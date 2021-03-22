@file:OptIn(ExperimentalStdlibApi::class)

package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.mutate
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toPersistentList
import org.apache.james.mime4j.dom.Message
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
    val ai = ProposalAI(metadataParts.single { it.startsWith("AI=") }.removePrefix("AI=").toBigDecimal())

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
    val metadata = parseMetadata(metadataLine = lines[0], titleLine = lines[1]) ?: return null
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

private val SEPARATOR_REGEX = Regex("\n(?:-{10,}|\\*{10,})\n")
private val FIRST_SECTION_CHECK_REGEX = Regex("No.\\s+|\\s+Title\\s+|\\s+By\\s+|\\s+AI")
private val LAST_SECTION_CHECK_OPTIONS = listOf("MSN 8", "get McAfee.com")

fun Message.parseDistributionV0(): List<ProposalData> {
    val text = (body as TextBody).reader.readText()

    val allParts = text.split(SEPARATOR_REGEX).map { it.trim() }

    require(allParts.size > 2)
    require(allParts.first().contains(FIRST_SECTION_CHECK_REGEX))
    require(allParts.last().let { part -> LAST_SECTION_CHECK_OPTIONS.any { part.contains(it) } })

    val proposalParts =
        allParts
            .drop(1)
            .dropLast(1)
            .filter { it.lowercase() !in EXCLUDED_SECTIONS }
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
            }

    return proposalParts.mapNotNull {
        parseProposalDistributionV0(it)
    }
}
