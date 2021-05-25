package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("AI\\s+SUBMITTER\\s+TITLE\\n")

private fun List<String>.takeUntilSecondBlankLine(): List<String> {
    var seenBlankLines = 0

    return takeWhile {
        if (it.isBlank()) ++seenBlankLines

        seenBlankLines < 2
    }
}

fun parseDistributionV7(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummary(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = Separators.ALTERNATING_BRACES,
    )

    return proposalParts.map {
        val distributionLines = it.lines()

        val metadataLines = distributionLines.takeUntilSecondBlankLine()
        val text = distributionLines.drop(metadataLines.size + 1).joinToString("\n")

        ProposalData(
            metadata = MetadataParsing.headerOptCoauthorsBlankTitleLines(metadataLines),
            text = text,
        )
    }
}
