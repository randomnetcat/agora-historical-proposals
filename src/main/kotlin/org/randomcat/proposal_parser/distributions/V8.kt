package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SUMMARY_SECTION_CHECK_REGEX = Regex("AI\\s+II\\s+Proposer\\s+Date\\s+Num\\s+Title")
private val FINAL_SECTION_CHECK_REGEX = Regex("-- \\n-Tiger|-coppro|Promotor's note: |Promotor Tanner L\\. Swett")
private val IGNORED_TAGS = listOf("Distributable")

fun parseDistributionV8(
    fullDistributionText: String,
    backupProposalNumber: (index: Int) -> ProposalNumber
): List<ProposalData> {
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
                backupNumber = backupProposalNumber(index),
                ignoredTags = IGNORED_TAGS,
            )
        })
    }
}
