package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SUMMARY_SECTION_CHECK_REGEX = Regex("AI\\s+SUBMITTER\\s+(CHAMBER\\s+)?TITLE\\n")
private val FINAL_SECTION_CHECK_REGEX = Regex("-- \\n-Tiger|-coppro|Promotor's note: ")

fun parseDistributionV5(
    fullDistributionText: String,
    backupProposalNumber: (index: Int) -> ProposalNumber
): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        separatorRegex = Separators.HYPHENS,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.mapIndexed { index, distributionText ->
        parseCommonProposal(proposalDistribution = distributionText, metadataParser = { metadataLines ->
            MetadataParsing.keyValueHeaders(
                metadataLines = metadataLines,
                backupNumber = backupProposalNumber(index),
            )
        })
    }
}
