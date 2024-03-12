package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData

private val SUMMARY_SECTION_CHECK_REGEX =
    Regex("\\n(?:NUM|Num)(?:\\s+C\\s+I\\s+AI\\s+SUBMITTER)?\\s+(?:TITLE|Title)|I submit the following proposal, entitled \\{Instant Adoption\\}")
private val FINAL_SECTION_CHECK_REGEX = Regex("The highest orderly ID for distributed proposal", RegexOption.LITERAL)
private val ENDER_REGEX = Regex("The Proposal Pool contains the following proposal:", RegexOption.LITERAL)

fun parseDistributionV2(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryOptEnderOptFooter(
        fullDistributionText = fullDistributionText,
        separatorRegex = Separators.ALTERNATING_BRACES,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        enderRegex = ENDER_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = MetadataParsing::keyValueHeaders)
    }
}
