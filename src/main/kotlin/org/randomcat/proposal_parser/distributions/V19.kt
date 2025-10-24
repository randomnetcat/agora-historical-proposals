package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX =
    Regex("(Num\\s+Author\\s+AI\\s+Ch\\s+Pf\\s+Int\\s+Dist\\s+Party\\s+Title)|(Num\\s+Author\\s+AI\\s+Ch\\s+Title)")

fun parseDistributionV19(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummary(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = Separators.HYPHENS,
    )

    return proposalParts.map {
        parseCommonProposal(
            proposalDistribution = it,
            metadataParser = MetadataParsing::invertedHeaderTitleLines,
        )
    }
}
