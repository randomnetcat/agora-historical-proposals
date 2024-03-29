package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("(NUM|ID)\\s+AI\\s+(CHAMBER\\s+)?AUTHOR\\s+TITLE")
private val FOOTER_REGEX = Regex("-scshunt|—(Promotor )?Machiavelli")

private val IGNORED_TAGS = listOf("Text")
private val EXCLUDE_REGEX = Regex("^\\s*ID: \\(not distributed\\)")

fun parseDistributionV12(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        separatorRegex = Separators.CLOSED_ALTERNATING_BRACES,
        footerRegex = FOOTER_REGEX,
    )

    return proposalParts.filter { !it.contains(EXCLUDE_REGEX) }.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = { metadataLines ->
            MetadataParsing.keyValueHeaders(
                metadataLines = metadataLines,
                ignoredTags = IGNORED_TAGS,
            )
        })
    }
}
