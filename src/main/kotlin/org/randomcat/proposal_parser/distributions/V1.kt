package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.mutate
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toPersistentList
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SUMMARY_SECTION_CHECK_REGEX =
    Regex("AI\\s+SUBMITTER\\s+TITLE\\n|All actions are performed in this message by deputizing for Promotor.")

private data class DistributionV1HeaderResult(
    val number: ProposalNumber,
    val ai: ProposalAI,
    val author: PlayerName,
    val coauthors: ImmutableList<PlayerName>,
)

private fun parseHeaderLine(headerLine: String): DistributionV1HeaderResult {
    require(headerLine.startsWith("Proposal "))

    val lineAfterProposal = headerLine.removePrefix("Proposal ")

    val numberText = lineAfterProposal.takeWhile { it.isDigit() }
    val textAfterNumber = lineAfterProposal.drop(numberText.length)

    val number = ProposalNumber(numberText.toBigInteger())

    val parethetical = textAfterNumber.substringAfter('(').substringBefore(')')

    val ai =
        parethetical
            .split(",")
            .map { it.trim() }
            .single { it.startsWith("AI=") }
            .removePrefix("AI=")
            .toBigDecimal()
            .let { ProposalAI(it) }

    val afterParenthetical = textAfterNumber.substringAfter(')')
    require(afterParenthetical.startsWith(" by "))

    val authorsText = afterParenthetical.removePrefix(" by ")
    val authors = if (authorsText.contains(" (co-author: ")) {
        val firstAuthor = authorsText.substringBefore(" (co-author: ")
        val coauthor = authorsText.substringAfter(" (co-author: ").removeSuffix(")")

        listOf(PlayerName(firstAuthor), PlayerName(coauthor))
    } else {
        authorsText.split(", ").map { PlayerName(it) }
    }

    return DistributionV1HeaderResult(
        number = number,
        ai = ai,
        author = authors.first(),
        coauthors = authors.drop(1).toImmutableList(),
    )
}

// Format:
// Proposal NNNN (Some, Fields, AI=1) by Author
// Title
//
// Text
// ...
private fun parseProposalMetadataV1(metadataLines: List<String>): ProposalCommonMetadataResult {
    require(metadataLines.size == 2)

    val headerLine = metadataLines[0]
    val titleLine = metadataLines[1]

    val header = parseHeaderLine(headerLine = headerLine)

    return ProposalCommonMetadataResult(
        number = header.number,
        title = titleLine,
        ai = header.ai,
        author = header.author,
        coauthors = header.coauthors,
    )
}

fun parseDistributionV1(fullDistributionText: String): List<ProposalData> {
    val proposalParts =
        fullDistributionText
            .split(Separators.ALTERNATING_BRACES)
            .map { it.trim() }
            .filter { it.isNotBlank() }
            .toPersistentList()
            .mutate {
                // Should have at least summary section + 1 proposal
                require(it.size >= 2)

                // Remove summary section
                require(it[0].contains(SUMMARY_SECTION_CHECK_REGEX))
                it.removeAt(0)
            }

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = ::parseProposalMetadataV1)
    }
}
