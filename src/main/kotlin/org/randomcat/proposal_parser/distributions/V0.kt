package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.mutate
import kotlinx.collections.immutable.toPersistentList
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private data class DistributionV0MetadataResult(
    val number: ProposalNumber,
    val author: PlayerName,
    val ai: ProposalAI,
)

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

private fun parseHeaderLine(headerLine: String): DistributionV0MetadataResult? {
    val headerParts = headerLine.split(", ")

    val (number, author) = parseNumberAndAuthor(numberAuthorSpec = headerParts.first()) ?: return null
    val ai = ProposalAI(headerParts.single { it.startsWith("AI=") }.removePrefix("AI=").trim().toBigDecimal())

    return DistributionV0MetadataResult(
        number = number,
        author = author,
        ai = ai,
    )
}

// Format:
// Proposal NNNN by Author, Field, AI=1, Some, Other, Fields
// Proposal Title
//
// Text
// ...
private fun parseProposalMetadataV0(metadataLines: List<String>): ProposalCommonMetadataResult? {
    require(metadataLines.size == 2)

    val headerLine = metadataLines[0]
    val titleLine = metadataLines[1]

    val metadata = parseHeaderLine(headerLine = headerLine) ?: return null

    return ProposalCommonMetadataResult(
        number = metadata.number,
        ai = metadata.ai,
        title = titleLine,
        author = metadata.author,
        coauthors = emptyList(),
    )
}

private val EXCLUDED_SECTIONS = listOf(
    "RedKnight",
).map { it.lowercase() }

private val EXCLUDED_FIRST_SECTION_PREFIXES = listOf(
    "Text of Proposals being distributed is below:",
    "Text of Proposals being distributed is below.",
    "Text of proposals being distributed is below.",
    "Text of proposals being distributed is below",
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

fun parseDistributionV0(fullDistributionText: String): List<ProposalData> {
    val allParts = fullDistributionText.split(SEPARATOR_REGEX).map { it.trim() }

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
        tryParseCommonProposal(proposalDistribution = it, metadataParser = ::parseProposalMetadataV0)
    }
}
