package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("ID\\s+Author(\\(s\\))?\\s+AI\\s+Title")

fun parseDistributionV24(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummary(
        fullDistributionText = fullDistributionText,
        separatorRegex = Separators.SLASHES,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
    )

    return proposalParts.map { distributionText ->
        parseCommonProposal(proposalDistribution = distributionText, metadataParser = MetadataParsing::keyValueHeaders)
    }
}
