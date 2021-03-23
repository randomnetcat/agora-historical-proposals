@file:OptIn(ExperimentalStdlibApi::class)

package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.mutate
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toPersistentList
import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.dom.Multipart
import org.apache.james.mime4j.dom.TextBody
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private data class DistributionV0MetadataResult(
    val number: ProposalNumber,
    val author: PlayerName,
    val ai: ProposalAI,
    val title: String,
)

private fun parseMetadata(
    metadataLine: String,
    titleLine: String
): DistributionV0MetadataResult? {
    val metadataParts = metadataLine.split(", ")

    val (number, author) = parseNumberAndAuthor(numberAuthorSpec = metadataParts.first()) ?: return null
    val ai = ProposalAI(metadataParts.single { it.startsWith("AI=") }.removePrefix("AI=").trim().toBigDecimal())

    return DistributionV0MetadataResult(
        number = number,
        author = author,
        ai = ai,
        title = titleLine,
    )
}

private fun parseNumberAndAuthor(numberAuthorSpec: String): Pair<ProposalNumber, PlayerName>? {
    val parts = numberAuthorSpec.split(" by ")
    require(parts.size == 2)

    val numberPart = parts[0]
    require(numberPart.startsWith("Proposal "))

    // Nope, not dealing with this
    if (numberPart.matches(Regex("Proposal \\d\\d-\\d+"))) return null

    val number = ProposalNumber(numberPart.removePrefix("Proposal ").toBigInteger())
    val author = PlayerName(parts[1])

    return Pair(number, author)
}

private fun parseProposalDistributionV0(proposalDistribution: String): ProposalData? {
    val lines = proposalDistribution.lines()

    // Format:
    // Proposal NNNN by Author, Field, AI=1, Some, Other, Fields
    // Proposal Title
    //
    // Proposal Text
    // ...
    val metadata = parseMetadata(metadataLine = lines[0], titleLine = lines[1]) ?: return null

    // There should be a gap between the metadata and the text, or there should be no text (only the metadata lines,
    // making lines have size 2).
    require(lines.size == 2 || lines[2].isBlank())

    val text = lines.drop(2).dropWhile { it.isBlank() }.dropLastWhile { it.isBlank() }.joinToString("\n").trim()

    return ProposalData(
        number = metadata.number,
        ai = metadata.ai,
        title = metadata.title,
        author = metadata.author,
        coauthors = persistentListOf(),
        text = text,
    )
}

private val EXCLUDED_SECTIONS = listOf(
    "RedKnight",
).map { it.lowercase() }

private val EXCLUDED_FIRST_SECTION_PREFIXES = listOf(
    "Text of Proposals being distributed is below:",
    "Text of Proposals being distributed is below.",
    "Text of proposals being distributed is below.",
    "The text of the proposals being distributed is below.",
    "The text of proposals being distributed is below.",
    "Text of proposals are below:",
)

private val SEPARATOR_REGEX = Regex("(?<!Recent events)\\n(?:-{5,}|\\*{10,})\\n")
private val SUMMARY_SECTION_CHECK_REGEX = Regex("No.\\s+\\|\\s+Title\\s+\\|\\s+By\\s+\\|\\s+AI")

private val LAST_SECTION_CHECK_OPTIONS = listOf(
    "MSN 8",
    "get McAfee.com",
    "gardner@sng.its.monash.edu.au",
    "-Promotor root",
    "Do you Yahoo!?",
    "Do You Yahoo!?",
    "Benjamin Schultz KE3OM",
)

private val PREFIX_INFO_SECTION_OPTIONS = listOf(
    "Distribution of Proposal",
    "Proposal Pool Report",
    "Recent events\n-------",
)

private fun Message.extractPlainTextBody(): String {
    return when (val body = this.body) {
        is TextBody -> body.reader.readText()
        is Multipart -> {
            require(body.subType == "alternative")
            (body.bodyParts.single { it.mimeType == "text/plain" }.body as TextBody).reader.readText()
        }
        else -> error("Unknown body type")
    }
}

private val PROBABLY_REPLY_REGEX = Regex("^.*? [wW]rites:(?:\\n\\s*)+>")

fun Message.parseDistributionV0(): List<ProposalData> {
    val text = extractPlainTextBody()
    if (text.contains(PROBABLY_REPLY_REGEX)) return emptyList()

    val allParts = text.split(SEPARATOR_REGEX).map { it.trim() }

    require(allParts.size > 2)
    require(allParts.any { it.contains(SUMMARY_SECTION_CHECK_REGEX) })

    val proposalParts =
        allParts
            .dropWhile { part ->
                part.contains(SUMMARY_SECTION_CHECK_REGEX) || PREFIX_INFO_SECTION_OPTIONS.any { part.contains(it) }
            }
            .filter { it.lowercase() !in EXCLUDED_SECTIONS }
            .filter { it.isNotBlank() }
            .toPersistentList()
            .mutate {
                var first = it[0]

                for (excludedPrefix in EXCLUDED_FIRST_SECTION_PREFIXES) {
                    first = first.removePrefix(excludedPrefix)
                }

                if (first.isNotEmpty())
                    it[0] = first.trimStart()
                else
                    it.removeAt(0)

                val lastPart = it[it.size - 1]
                if (LAST_SECTION_CHECK_OPTIONS.any { lastPart.contains(it) }) {
                    it.removeAt(it.size - 1)
                }
            }

    return proposalParts.mapNotNull {
        parseProposalDistributionV0(it)
    }
}
