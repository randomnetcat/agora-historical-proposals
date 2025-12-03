package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("Num\\s+Author\\s+AI\\s+Title")
private val FINAL_SECTION_CHECK_REGEX = Regex("-scshunt")

private val MISSING_COLON_TAGS = listOf("Coauthors")

fun parseDistributionV21(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        separatorRegex = Separators.ALTERNATING_BRACES,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.mapIndexed { index, distributionText ->
        parseCommonProposal(proposalDistribution = distributionText, metadataParser = { metadataLines ->
            MetadataParsing.keyValueHeaders(
                metadataLines = metadataLines,
                allowMissingColonTags = MISSING_COLON_TAGS,
            )
        })
    }
}
