package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("NUM\\s+AI\\s+AUTHOR\\s+TITLE")
private val FOOTER_REGEX = Regex("-scshunt")

private val IGNORED_TAGS = listOf("Text")

fun parseDistributionV12(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = Separators.CLOSED_ALTERNATING_BRACES,
        footerRegex = FOOTER_REGEX,
    )

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = { metadataLines ->
            MetadataParsing.keyValueHeaders(
                metadataLines = metadataLines,
                ignoredTags = IGNORED_TAGS,
            )
        })
    }
}
