package org.randomcat.proposal_parser.distributions.metadata

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalNumber
import org.randomcat.proposal_parser.distributions.ProposalCommonMetadataResult

private data class HeaderLineResult(
    val number: ProposalNumber,
    val ai: ProposalAI,
    val author: PlayerName,
    val coauthors: ImmutableList<PlayerName>,
)

private fun parseHeaderLine(headerLine: String): HeaderLineResult {
    require(headerLine.startsWith("Proposal "))

    val lineAfterProposal = headerLine.removePrefix("Proposal ")

    val numberText = lineAfterProposal.takeWhile { it.isDigit() }
    val textAfterNumber = lineAfterProposal.drop(numberText.length)

    val number = ProposalNumber(numberText.toBigInteger())

    val parenthetical = textAfterNumber.substringAfter('(').substringBefore(')')

    val ai =
        parenthetical
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

    return HeaderLineResult(
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
internal fun doParseHeaderTitleLinesMetadata(metadataLines: List<String>): ProposalCommonMetadataResult {
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

// Format:

// Proposal NNNN (Some, Fields, AI=1) by Author
// Title
//
// -OR-
//
// Proposal NNNN (Some, Fields, AI=1) by Author
// ...
internal fun doParseHeaderOptTitleLinesMetadata(metadataLines: List<String>): ProposalCommonMetadataResult {
    require(metadataLines.size == 1 || metadataLines.size == 2)

    val header = parseHeaderLine(headerLine = metadataLines[0])

    return ProposalCommonMetadataResult(
        number = header.number,
        title = if (metadataLines.size == 2) metadataLines[1] else "",
        ai = header.ai,
        author = header.author,
        coauthors = header.coauthors,
    )
}
