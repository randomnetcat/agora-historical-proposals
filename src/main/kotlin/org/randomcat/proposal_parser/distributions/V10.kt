package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX =
    Regex("NUM\\.?\\s+AI\\s+(SUBMITTER|AUTHOR)\\s+TITLE", RegexOption.IGNORE_CASE)

fun parseDistributionV10(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummary(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = Separators.ALTERNATING_BRACES,
    )

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = MetadataParsing::headerOptCoauthorsTitleLines)
    }
}
