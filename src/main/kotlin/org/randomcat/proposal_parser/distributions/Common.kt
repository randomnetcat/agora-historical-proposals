package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.mutate
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toPersistentList
import org.randomcat.proposal_parser.*
import org.randomcat.proposal_parser.distributions.metadata.doParseHeaderOptTitleLinesMetadata
import org.randomcat.proposal_parser.distributions.metadata.doParseHeaderTitleLinesMetadata
import org.randomcat.proposal_parser.distributions.metadata.doParseInvertedHeaderTitleLinesMetadata

data class ProposalCommonMetadataResult(
    val number: RawProposalNumber,
    val title: String?,
    val ai: ProposalAI?,
    val author: PlayerName?,
    val coauthors: ImmutableList<PlayerName>,
) {
    constructor(
        number: RawProposalNumber,
        title: String?,
        ai: ProposalAI?,
        author: PlayerName?,
        coauthors: List<PlayerName>,
    ) : this(
        number = number,
        title = title,
        ai = ai,
        author = author,
        coauthors = coauthors.toImmutableList(),
    )
}

fun ProposalData(
    metadata: ProposalCommonMetadataResult,
    text: String
) = ProposalData(
    number = ProposalNumber.from(metadata.number),
    title = metadata.title,
    ai = metadata.ai,
    author = metadata.author,
    coauthors = metadata.coauthors,
    text = text,
)

private fun Iterable<String>.dropBoundingBlanks(): List<String> {
    return dropWhile { it.isBlank() }.dropLastWhile { it.isBlank() }
}

/**
 * @param metadataBeforeBlankNumber The number of blank lines at which the metadata ends. For instance, if this is one,
 * the metadata lines are the lines before the first blank (not including the blank line itself). If this is two,
 * the metadata lines are the lines before the second blank (including the first blank, but not the second blank).
 */
fun tryParseCommonProposal(
    proposalDistribution: String,
    metadataParser: (List<String>) -> ProposalCommonMetadataResult?,
    metadataBeforeBlankNumber: Int = 1,
    overrideProposalNumber: ((raw: RawProposalNumber) -> ProposalNumber)? = null,
): ProposalData? {
    val lines = proposalDistribution.lines().dropBoundingBlanks()

    val splitResult = lines.splitAtNthBlank(metadataBeforeBlankNumber)

    val metadataLines: List<String>
    val textLines: List<String>

    when (splitResult) {
        is BlankLineSplitResult.Split -> {
            metadataLines = splitResult.beforeBlank
            textLines = splitResult.afterBlank
        }

        is BlankLineSplitResult.InsufficientBlanks -> {
            metadataLines = lines
            textLines = emptyList()
        }
    }

    val rawMetadata = metadataParser(metadataLines)
    if (rawMetadata == null) return null

    val updatedMetadata = if (overrideProposalNumber != null) {
        rawMetadata.copy(number = overrideProposalNumber(rawMetadata.number).toRaw())
    } else {
        rawMetadata
    }

    val text = textLines.joinToString("\n")
    return ProposalData(updatedMetadata, text)
}

/**
 * @param metadataBeforeBlankNumber The number of blank lines at which the metadata ends. For instance, if this is one,
 * the metadata lines are the lines before the first blank (not including the blank line itself). If this is two,
 * the metadata lines are the lines before the second blank (including the first blank, but not the second blank).
 */
fun parseCommonProposal(
    proposalDistribution: String,
    metadataParser: (List<String>) -> ProposalCommonMetadataResult,
    metadataBeforeBlankNumber: Int = 1,
    overrideProposalNumber: ((raw: RawProposalNumber) -> ProposalNumber)? = null,
): ProposalData {
    return tryParseCommonProposal(
        proposalDistribution = proposalDistribution,
        metadataParser = metadataParser,
        metadataBeforeBlankNumber = metadataBeforeBlankNumber,
        overrideProposalNumber = overrideProposalNumber,
    ) ?: error("metadataParser returned null but shouldn't have")
}

/**
 * Format:
 *
 * Whatever
 * metadata
 * lines
 * Text:
 * Proposal body
 */
fun parseBorderLineProposal(
    proposalDistribution: String,
    borderLine: String,
    metadataParser: (List<String>) -> ProposalCommonMetadataResult,
): ProposalData {
    val lines = proposalDistribution.lines().dropBoundingBlanks()

    val borderElement = lines.withIndex().find { it.value.trim() == borderLine }

    if (borderElement == null) {
        return ProposalData(metadataParser(lines), "")
    }

    return ProposalData(
        metadata = metadataParser(lines.subList(0, borderElement.index)),
        text = lines.subList(borderElement.index + 1, lines.size).joinToString("\n"),
    )
}

object Separators {
    val ALTERNATING_BRACES = Regex("^\\s*}(?:\\{\\}){4,}\\{\\s*$", RegexOption.MULTILINE)
    val CLOSED_ALTERNATING_BRACES = Regex("^\\s*(?:\\{\\}){4,}\\s*$", RegexOption.MULTILINE)
    val HYPHENS = Regex("^\\s*-{10,}\\s*$", RegexOption.MULTILINE)
    val POUNDS = Regex("^\\s*#{10,}\\s*$", RegexOption.MULTILINE)
    val SLASHES = Regex("^\\s*/{10,}\\s*$", RegexOption.MULTILINE)
}

private fun joinOverlongHeader(
    lines: List<String>,
    headerName: String,
): List<String> {
    val out = mutableListOf<String>()

    var workingValue: String? = null
    var valueDone = false

    fun commitValue() {
        check(!valueDone)
        check(workingValue != null)

        out.add("$headerName: $workingValue")
        workingValue = null
        valueDone = true
    }

    for (line in lines) {
        if (workingValue != null) {
            if (line.startsWith(" ")) {
                workingValue = workingValue + " " + line.trim()
                continue
            }

            commitValue()
        }

        if (line.startsWith("$headerName: ")) {
            require(!valueDone) { "Unexpected second header line" }
            workingValue = line.removePrefix("$headerName: ")
            continue
        }

        out.add(line)
    }

    if (workingValue != null) {
        commitValue()
    }

    return out
}

object SplitDistribution {
    fun withSummary(
        fullDistributionText: String,
        separatorRegex: Regex,
        summarySectionRegex: Regex,
    ): List<String> {
        val allParts = fullDistributionText.split(separatorRegex)

        return allParts
            .map { it.trim() }
            .filter { it.isNotBlank() }
            .toPersistentList()
            .mutate {
                // Should have at least summary section + 1 proposal
                require(it.size >= 2)

                // Remove summary section
                require(it[0].contains(summarySectionRegex))
                it.removeAt(0)
            }
    }

    fun withSummaryAndOptFooter(
        fullDistributionText: String,
        separatorRegex: Regex,
        summarySectionRegex: Regex,
        footerRegex: Regex,
    ): List<String> {
        return SplitDistribution
            .withSummary(
                fullDistributionText = fullDistributionText,
                separatorRegex = separatorRegex,
                summarySectionRegex = summarySectionRegex
            )
            .toPersistentList()
            .mutate {
                require(it.isNotEmpty())

                if (it[it.size - 1].contains(footerRegex)) {
                    it.removeAt(it.size - 1)
                }
            }
    }

    fun withSummaryOptEnderOptFooter(
        fullDistributionText: String,
        separatorRegex: Regex,
        summarySectionRegex: Regex,
        enderRegex: Regex,
        footerRegex: Regex,
    ): List<String> {
        return SplitDistribution
            .withSummaryAndOptFooter(
                fullDistributionText = fullDistributionText,
                separatorRegex = separatorRegex,
                summarySectionRegex = summarySectionRegex,
                footerRegex = footerRegex,
            )
            .takeWhile { !it.contains(enderRegex) }
    }
}

private fun addMissingColon(text: String, missingColonTags: List<String>): String {
    for (tag in missingColonTags) {
        if (text.startsWith("$tag ")) {
            return tag + ": " + text.substring(tag.length + 1)
        }
    }

    return text
}

object MetadataParsing {
    // Format:
    // Number: NNNN
    // Title: something
    // Some: Value
    // Other: Value
    // Fields: Value
    //
    // Text
    // ...
    fun keyValueHeaders(
        metadataLines: List<String>,
        backupNumber: ProposalNumber? = null,
        ignoredTags: List<String> = emptyList(),
        allowMissingColonTags: List<String> = emptyList(),
        extraOverlongHeaders: List<String> = emptyList(),
    ): ProposalCommonMetadataResult {
        val cleanedTitleLines = joinOverlongHeader(
            metadataLines,
            headerName = "Title",
        )

        val cleanedCoauthorLines = if (extraOverlongHeaders.isNotEmpty()) {
            var work = cleanedTitleLines

            for (header in extraOverlongHeaders) {
                work = joinOverlongHeader(work, header)
            }

            work
        } else {
            cleanedTitleLines
        }

        val metadataMap = cleanedCoauthorLines.filter { !ignoredTags.contains(it) }.associate { rawText ->
            val effectiveText = addMissingColon(rawText, missingColonTags = allowMissingColonTags)

            require(effectiveText.contains(":"))
            effectiveText.substringBefore(":").lowercase() to effectiveText.substringAfter(": ")
        }

        // Sometimes AI has (Class) appended to it, so only take the number before that
        val ai =
            metadataMap
                .getFirstValue("adoption index", "ai")
                .substringBefore(" (")
                .takeUnless { it == "none" }
                ?.toBigDecimal()
                ?.let { ProposalAI(it) }

        val rawAuthor = metadataMap.getFirstValueOrNull("author", "proposer")

        val (effectiveAuthor, authorLineCoauthors) = if (rawAuthor != null) {
            if (rawAuthor.contains("(co-author")) {
                val coauthorsPart = rawAuthor.substringAfter("(co-author").removePrefix("s").trim().removeSuffix(")")
                val coauthors = coauthorsPart.split(" and ")

                rawAuthor.substringBefore("(co-author") to coauthors.map { PlayerName(it) }
            } else {
                rawAuthor to emptyList()
            }
        } else {
            null to null
        }

        return ProposalCommonMetadataResult(
            number = metadataMap
                .getFirstValueOrNull("number", "id", "id number")
                ?.let { RawProposalNumber(it) }
                ?: requireNotNull(backupNumber).toRaw(),
            title = metadataMap.getFirstValueOrNull("title", "tite", "proposal"),
            ai = ai,
            author = effectiveAuthor?.let { PlayerName(it) },
            coauthors = metadataMap.getFirstValueOrNull(
                "coauthors",
                "coauthor(s)",
                "coauthor",
                "co-authors",
                "co-author(s)",
                "co-author"
            )
                ?.takeIf { it.isNotBlank() }
                ?.split(", ")
                ?.map { PlayerName(it) }
                ?: authorLineCoauthors
                ?: emptyList(),
        )
    }

    fun numberThenKeyValueHeaders(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.isNotEmpty())

        val numberLine = metadataLines[0]
        require(numberLine.startsWith("Proposal "))

        val number = ProposalNumber(numberLine.substringAfter("Proposal ").toBigInteger())

        return keyValueHeaders(metadataLines.subList(1, metadataLines.size), backupNumber = number)
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
    fun headerTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        return doParseHeaderTitleLinesMetadata(metadataLines)
    }

    // Format:
    //
    // Proposal NNNN (Some, Fields, AI=1) by Author
    // Title
    //
    // Text
    // ...
    //
    // -OR-
    //
    // Proposal NNNN (Some, Fields, AI=1) by Author
    //
    // Text
    // ...
    fun headerOptTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        return doParseHeaderOptTitleLinesMetadata(metadataLines)
    }

    // Format:
    // Proposal NNNN (Some, Fields, AI=1) by Author
    //
    // Title
    //
    // Text
    // ...
    fun headerBlankTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.size == 3)

        require(metadataLines[0].isNotBlank())
        require(metadataLines[1].isBlank())
        require(metadataLines[2].isNotBlank())

        return MetadataParsing.headerTitleLines(listOf(metadataLines[0], metadataLines[2]))
    }

    // Format:
    // Proposal NNNN (Some, Fields, AI=1) by Author
    // (coauth: some, coauthors)
    // Title
    //
    // Text
    // ...
    private fun headerCoauthorsTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.size == 3)
        require(metadataLines.all { it.isNotBlank() })

        val baseParse = MetadataParsing.headerTitleLines(listOf(metadataLines[0], metadataLines[2]))
        check(baseParse.coauthors.isEmpty())

        val coauthorsLine = metadataLines[1]

        require(coauthorsLine.startsWith("(coauth: "))
        require(coauthorsLine.endsWith(")"))

        if (coauthorsLine == "(coauth: )") {
            // There are no coauthors in this case.
            return baseParse
        }

        val coauthors =
            coauthorsLine
                .removePrefix("(coauth: ")
                .removeSuffix(")")
                .split(",")
                .map { it.trim() }
                .map { PlayerName(it) }

        // We should have already excluded the case without coauthors.
        require(coauthors.isNotEmpty())

        return baseParse.copy(coauthors = coauthors.toImmutableList())
    }

    // Format:
    // Proposal NNNN (Some, Fields, AI=1) by Author
    // (coauth: some, coauthors)
    //
    // Title
    //
    // Text
    // ...
    private fun headerCoauthorsBlankTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.size == 4)
        require(metadataLines[2].isBlank())

        return headerCoauthorsTitleLines(listOf(metadataLines[0], metadataLines[1], metadataLines[3]))
    }

    fun headerOptCoauthorsBlankTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.size == 3 || metadataLines.size == 4)

        return when (metadataLines.size) {
            3 -> headerBlankTitleLines(metadataLines)
            4 -> headerCoauthorsBlankTitleLines(metadataLines)
            else -> error("unreachable")
        }
    }

    fun headerOptCoauthorsTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.size == 2 || metadataLines.size == 3)

        return when (metadataLines.size) {
            2 -> headerTitleLines(metadataLines)
            3 -> headerCoauthorsTitleLines(metadataLines)
            else -> error("unreachable")
        }
    }

    // Format:
    // Proposal NNNN by Author (Some, Fields, AI=1)
    // Title
    //
    // Text
    // ...
    fun invertedHeaderTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        return doParseInvertedHeaderTitleLinesMetadata(metadataLines)
    }
}
