package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("\\n(?:NUM|Num)(?:\\s+C\\s+I\\s+AI\\s+SUBMITTER)?\\s+(?:TITLE|Title)")
private val FINAL_SECTION_CHECK_REGEX = Regex("The highest orderly ID for distributed proposal", RegexOption.LITERAL)

fun parseDistributionV2(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        separatorRegex = Separators.ALTERNATING_BRACES,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = MetadataParsing::keyValueHeaders)
    }
}
