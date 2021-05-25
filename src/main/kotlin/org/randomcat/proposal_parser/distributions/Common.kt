package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.mutate
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toPersistentList
import org.randomcat.proposal_parser.*
import org.randomcat.proposal_parser.distributions.metadata.doParseHeaderTitleLinesMetadata

data class ProposalCommonMetadataResult(
    val number: ProposalNumber,
    val title: String,
    val ai: ProposalAI,
    val author: PlayerName?,
    val coauthors: ImmutableList<PlayerName>,
) {
    constructor(
        number: ProposalNumber,
        title: String,
        ai: ProposalAI,
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
    number = metadata.number,
    title = metadata.title,
    ai = metadata.ai,
    author = metadata.author,
    coauthors = metadata.coauthors,
    text = text,
)

fun tryParseCommonProposal(
    proposalDistribution: String,
    metadataParser: (List<String>) -> ProposalCommonMetadataResult?,
): ProposalData? {
    val lines = proposalDistribution.lines().dropWhile { it.isBlank() }.dropLastWhile { it.isBlank() }

    val metadataLines = lines.takeWhile { it.isNotBlank() }
    val metadata = metadataParser(metadataLines) ?: return null

    val textLines = lines.dropWhile { it.isNotBlank() }.drop(1)
    val text = textLines.joinToString("\n")

    return ProposalData(metadata, text)
}

fun parseCommonProposal(
    proposalDistribution: String,
    metadataParser: (List<String>) -> ProposalCommonMetadataResult,
): ProposalData {
    return tryParseCommonProposal(proposalDistribution, metadataParser)
        ?: error("metadataParser returned null but shouldn't have")
}

object Separators {
    val ALTERNATING_BRACES = Regex("(?<=\\n)\\}(?:\\{\\}){4,}\\{\\n")
    val HYPHENS = Regex("(?<=\\n)-{10,}\\n")
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
    @OptIn(ExperimentalStdlibApi::class)
    fun keyValueHeaders(
        metadataLines: List<String>,
        backupNumber: ProposalNumber? = null,
        ignoredTags: List<String> = emptyList(),
    ): ProposalCommonMetadataResult {
        val metadataMap = metadataLines.filter { !ignoredTags.contains(it) }.associate {
            require(it.contains(":"))
            it.substringBefore(":").lowercase() to it.substringAfter(": ")
        }

        // Sometimes AI has (Class) appended to it, so only take the number before that
        val ai =
            metadataMap
                .getFirstValue("adoption index", "ai")
                .substringBefore(" (")
                .toBigDecimal()
                .let { ProposalAI(it) }

        return ProposalCommonMetadataResult(
            number = metadataMap
                .getFirstValueOrNull("number", "id", "id number")
                ?.toBigInteger()
                ?.let { ProposalNumber(it) }
                ?: requireNotNull(backupNumber),
            title = metadataMap.getFirstValue("title", "tite", "proposal"),
            ai = ai,
            author = metadataMap.getFirstValueOrNull("author", "proposer")?.let { PlayerName(it) },
            coauthors = metadataMap.getFirstValueOrNull("coauthors", "coauthor")
                ?.takeIf { it.isNotBlank() }
                ?.split(", ")
                ?.map { PlayerName(it) }
                ?: emptyList(),
        )
    }

    // Format:
    // Proposal NNNN (Some, Fields, AI=1) by Author
    // Title
    //
    // Text
    // ...
    fun headerTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        return doParseHeaderTitleLinesMetadata(metadataLines)
    }

    // Format:
    // Proposal NNNN (Some, Fields, AI=1) by Author
    //
    // Title
    //
    // Text
    // ...
    private fun headerBlankTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.size == 3)

        require(metadataLines[0].isNotBlank())
        require(metadataLines[1].isBlank())
        require(metadataLines[2].isNotBlank())

        return MetadataParsing.headerTitleLines(listOf(metadataLines[0], metadataLines[2]))
    }

    // Format:
    // Proposal NNNN (Some, Fields, AI=1) by Author
    // (coauth: some, coauthors)
    //
    // Title
    //
    // Text
    // ...
    private fun headerCoauthorsTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.size == 4)

        require(metadataLines[0].isNotBlank())
        require(metadataLines[1].isNotBlank())
        require(metadataLines[2].isBlank())
        require(metadataLines[3].isNotBlank())

        require(metadataLines[1].startsWith("(coauth: "))
        require(metadataLines[1].endsWith(")"))

        val baseParse = MetadataParsing.headerTitleLines(listOf(metadataLines[0], metadataLines[3]))
        check(baseParse.coauthors.isEmpty())

        val coauthors =
            metadataLines[1]
                .removePrefix("(coauth: ")
                .removeSuffix(")")
                .split(",")
                .map { it.trim() }
                .map { PlayerName(it) }

        return baseParse.copy(coauthors = coauthors.toImmutableList())
    }

    fun headerOptCoauthorsBlankTitleLines(metadataLines: List<String>): ProposalCommonMetadataResult {
        require(metadataLines.size == 3 || metadataLines.size == 4)

        return when (metadataLines.size) {
            3 -> headerBlankTitleLines(metadataLines)
            4 -> headerCoauthorsTitleLines(metadataLines)
            else -> error("unreachable")
        }
    }
}
