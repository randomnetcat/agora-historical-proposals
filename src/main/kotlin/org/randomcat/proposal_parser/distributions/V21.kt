package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX = Regex("Num\\.?\\s+(Author(\\(s\\))?\\s+AI|AI\\s+Author)\\s+Title")
private val FINAL_SECTION_CHECK_REGEX =
    Regex("-scshunt|--\\s*\n(aranea|Luis Ressel <aranea@aixah.de>)", RegexOption.MULTILINE)

private val MISSING_COLON_TAGS = listOf("Coauthors")

fun parseDistributionV21(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        separatorRegex = Separators.ALTERNATING_BRACES,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.map { distributionText ->
        parseCommonProposal(proposalDistribution = distributionText, metadataParser = { metadataLines ->
            MetadataParsing.keyValueHeaders(
                metadataLines = metadataLines,
                allowMissingColonTags = MISSING_COLON_TAGS,
            )
        })
    }
}
