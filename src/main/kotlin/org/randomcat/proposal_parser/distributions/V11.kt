package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("NUM\\s+AI\\s+AUTHOR\\s+TITLE|CFJ: ais523 is inactive\\.")
private val FOOTER_REGEX =
    Regex("I cause Mr. Incredible to make each of the aforelisted players active.", RegexOption.LITERAL)

fun parseDistributionV11(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = Separators.ALTERNATING_BRACES,
        footerRegex = FOOTER_REGEX,
    )

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = MetadataParsing::headerTitleLines)
    }
}
