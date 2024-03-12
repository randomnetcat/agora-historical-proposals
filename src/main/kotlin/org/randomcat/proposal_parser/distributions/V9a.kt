package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("AI\\s+SUBMITTER\\s+TITLE\\n")

fun parseDistributionV9a(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummary(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = Separators.HYPHENS,
    )

    return proposalParts.map { distributionText ->
        parseCommonProposal(
            proposalDistribution = distributionText,
            metadataParser = { metadataLines ->
                MetadataParsing.headerOptCoauthorsBlankTitleLines(metadataLines)
            },
            metadataBeforeBlankNumber = 2,
        )
    }
}
