package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.*
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SEPARATOR_REGEX = Regex("\\}(?:\\{\\}){4,}\\{")
private val SUMMARY_SECTION_CHECK_REGEX = Regex("AI\\s+SUBMITTER\\s+TITLE\\n")

private data class DistributionV1MetadataResult(
    val number: ProposalNumber,
    val ai: ProposalAI,
    val author: PlayerName,
    val coauthors: ImmutableList<PlayerName>,
)

private fun parseMetadataLine(metadataLine: String): DistributionV1MetadataResult {
    require(metadataLine.startsWith("Proposal "))

    val lineAfterProposal = metadataLine.removePrefix("Proposal ")

    val numberText = lineAfterProposal.takeWhile { it.isDigit() }
    val textAfterNumber = lineAfterProposal.drop(numberText.length)

    val number = ProposalNumber(numberText.toBigInteger())

    val parethetical = textAfterNumber.substringAfter('(').substringBeforeLast(')')

    val ai =
        parethetical
            .split(",")
            .map { it.trim() }
            .single { it.startsWith("AI=") }
            .removePrefix("AI=")
            .toBigDecimal()
            .let { ProposalAI(it) }

    val afterParenthetical = textAfterNumber.substringAfterLast(')')
    require(afterParenthetical.startsWith(" by "))

    val authorsText = afterParenthetical.removePrefix(" by ")
    val authors = authorsText.split(", ").map { PlayerName(it) }

    return DistributionV1MetadataResult(
        number = number,
        ai = ai,
        author = authors.first(),
        coauthors = authors.drop(1).toImmutableList(),
    )
}

private fun parseProposalData(proposalDistributionText: String): ProposalData {
    val lines = proposalDistributionText.lines()
    require(lines.size >= 2)

    // Format:
    // Proposal NNNN (Some, Fields, AI=1) by Author
    // Title
    //
    // Text
    // ...

    val metadataLine = lines[0]
    val titleLine = lines[1]

    require(lines.size == 2 || lines[2].isBlank())

    val metadata = parseMetadataLine(metadataLine = metadataLine)

    return ProposalData(
        number = metadata.number,
        title = titleLine,
        ai = metadata.ai,
        author = metadata.author,
        coauthors = metadata.coauthors,
        text = lines.drop(2).dropWhile { it.isBlank() }.joinToString("\n").trim(),
    )
}

fun parseDistributionV1(fullDistributionText: String): List<ProposalData> {
    val proposalParts =
        fullDistributionText
            .split(SEPARATOR_REGEX)
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

    return proposalParts.map { parseProposalData(proposalDistributionText = it) }
}
