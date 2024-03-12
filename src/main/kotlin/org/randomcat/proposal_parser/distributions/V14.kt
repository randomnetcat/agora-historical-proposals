package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("NUM\\s+AI\\s+AUTHOR\\s+TITLE")
private val SEPARATOR_REGEX = Regex("(?<=\\n)(#+(Start|End)#Of#Distributed#Proposals#+|#{10,})\\n")
private val FOOTER_REGEX = Regex("Proposal Pool:", RegexOption.LITERAL)

fun parseDistributionV14(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = SEPARATOR_REGEX,
        footerRegex = FOOTER_REGEX,
    )

    return proposalParts.map {
        parseBorderLineProposal(
            proposalDistribution = it,
            borderLine = "Text:",
            metadataParser = MetadataParsing::numberThenKeyValueHeaders,
        )
    }
}
