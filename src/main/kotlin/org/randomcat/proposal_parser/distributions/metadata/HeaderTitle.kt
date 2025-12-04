package org.randomcat.proposal_parser.distributions.metadata

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.RawProposalNumber
import org.randomcat.proposal_parser.distributions.ProposalCommonMetadataResult

private data class HeaderLineResult(
    val number: RawProposalNumber,
    val ai: ProposalAI,
    val author: PlayerName,
    val coauthors: ImmutableList<PlayerName>,
)

private val HEADER_PATTERN = Regex("Proposal \\d+\\s+\\((.*,\\s*)?AI=\\d+(\\.\\d+)?(,.*)?\\) by .*")

private fun parseAiField(field: String): ProposalAI {
    require(field.startsWith("AI"))

    val remainder = field.substringAfter("AI").trim()
    require(remainder.startsWith("=") || remainder.startsWith("-"))

    val number = remainder.substring(1).trim()
    require(number.all { it.isDigit() || it == '.' })

    return ProposalAI(number.toBigDecimal())
}

// Parse a line of the format "Proposal NNNN (Some, Fields, AI=1) by Author"
private fun parseHeaderLine(headerLine: String): HeaderLineResult {
    require(headerLine.matches(HEADER_PATTERN))

    val lineAfterProposal = headerLine.removePrefix("Proposal ")

    val numberText = lineAfterProposal.takeWhile { it.isDigit() }
    val textAfterNumber = lineAfterProposal.drop(numberText.length)

    val number = RawProposalNumber(numberText)

    val parenthetical = textAfterNumber.substringAfter('(').substringBefore(')')

    val ai =
        parenthetical
            .split(",")
            .map { it.trim() }
            .single { it.startsWith("AI") }
            .let { parseAiField(it) }

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

// Parse a line of the format "Proposal NNNN by Author (Some, Fields, AI=1)"
private val INVERTED_HEADER_PATTERN =
    Regex("Proposal \\d+ (by .* )?\\((by .*?, )?AI\\s*[-=]\\s*\\d+(\\.\\d+)?(,.*)?\\)\\s*")

private fun parseInvertedHeaderLine(headerLine: String): HeaderLineResult {
    require(headerLine.matches(INVERTED_HEADER_PATTERN))

    val lineAfterProposal = headerLine.removePrefix("Proposal ")

    val numberText = lineAfterProposal.takeWhile { it.isDigit() }
    val number = RawProposalNumber(numberText)

    val textAfterNumber = lineAfterProposal.drop(numberText.length)

    val authorsText = textAfterNumber.substringBefore('(').trim()
    val parenthetical = textAfterNumber.substringAfter('(').trim().let {
        require(it.endsWith(")"))
        it.dropLast(1)
    }

    require(
        !parenthetical.contains("coauthor", ignoreCase = true)
    )

    val fields = parenthetical.substringBefore("co-author").split(",").map { it.trim() }

    val leadAuthor = if (authorsText.isNotBlank()) {
        PlayerName(authorsText.removePrefix("by ").trim())
    } else {
        PlayerName(fields.single { it.startsWith("by ") }.removePrefix("by ").trim())
    }

    val coauthors = if (parenthetical.contains("co-author")) {
        parenthetical.substringAfter("co-author").removePrefix("s").trim().split(",").map { it.trim() }
            .map { PlayerName(it) }
    } else {
        emptyList()
    }

    val ai = parseAiField(fields.single { it.startsWith("AI") })

    return HeaderLineResult(
        number = number,
        ai = ai,
        author = leadAuthor,
        coauthors = coauthors.toImmutableList(),
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
// Proposal NNNN by Author (Some, Fields, AI=1, co-authors Alex, Bob)
// Title
//
// Text
// ...
//
// -OR-
//
//
// Proposal NNNN (by Author, Some, Fields, AI=1, co-authors Alex, Bob)
// Title
//
// Text
// ...
//
internal fun doParseInvertedHeaderTitleLinesMetadata(metadataLines: List<String>): ProposalCommonMetadataResult {
    require(metadataLines.size == 2)

    val headerLine = metadataLines[0]
    val titleLine = metadataLines[1]

    val header = parseInvertedHeaderLine(headerLine = headerLine)

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
        title = if (metadataLines.size == 2) metadataLines[1] else null,
        ai = header.ai,
        author = header.author,
        coauthors = header.coauthors,
    )
}
