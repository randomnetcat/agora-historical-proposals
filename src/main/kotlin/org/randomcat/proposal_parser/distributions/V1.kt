package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX =
    Regex("AI\\s+SUBMITTER\\s+TITLE\\n|All actions are performed in this message by deputizing for Promotor.")

fun parseDistributionV1(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummary(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = Separators.ALTERNATING_BRACES,
    )

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = MetadataParsing::headerTitleLines)
    }
}
