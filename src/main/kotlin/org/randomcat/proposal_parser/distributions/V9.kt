package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex(
    "(NUM\\s+C\\s+I\\s+AI\\s+SUBMITTER\\s+TITLE)|(NUM\\s+AI\\s+SUBMITTER\\s+TITLE)"
)

private val FINAL_SECTION_CHECK_REGEX = Regex("-- \\n-Tiger|-coppro|Promotor's note: |Promotor Tanner L\\. Swett")

fun parseDistributionV9(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        separatorRegex = Separators.ALTERNATING_BRACES,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.map { distributionText ->
        parseCommonProposal(
            proposalDistribution = distributionText,
            metadataParser = { metadataLines ->
                MetadataParsing.headerOptCoauthorsBlankTitleLines(metadataLines = metadataLines)
            },
            metadataBeforeBlankNumber = 2,
        )
    }
}
