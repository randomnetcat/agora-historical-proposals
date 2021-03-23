package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SEPARATOR_REGEX = Regex("(?<=\\n)\\}(?:\\{\\}){4,}\\{\\n")

private val SUMMARY_SECTION_CHECK_REGEX = Regex("\\n(?:NUM|Num)(?:\\s+C\\s+I\\s+AI\\s+SUBMITTER)?\\s+(?:TITLE|Title)")
private val FINAL_SECTION_CHECK_REGEX = Regex("The highest orderly ID for distributed proposal", RegexOption.LITERAL)

// Format:
// Number: NNNN
// Title: something
// Some: Value
// Other: Value
// Fields: Value
//
// Text
// ...
@OptIn(ExperimentalStdlibApi::class)
private fun parseProposalMetadataV2(metadataLines: List<String>): ProposalCommonMetadataResult {
    val metadataMap = metadataLines.associate {
        require(it.contains(": "))
        it.substringBefore(": ").lowercase() to it.substringAfter(": ")
    }

    // Sometimes AI has (Class) appended to it, so only take the number before that
    val ai =
        metadataMap
            .getValue("adoption index")
            .substringBefore(" (")
            .toBigDecimal()
            .let { ProposalAI(it) }

    return ProposalCommonMetadataResult(
        number = ProposalNumber(metadataMap.getValue("number").toBigInteger()),
        title = metadataMap.getValue("title"),
        ai = ai,
        author = PlayerName(metadataMap.getValue("author")),
        coauthors = metadataMap["coauthors"]
            ?.takeIf { it.isNotBlank() }
            ?.split(", ")
            ?.map { PlayerName(it) }
            ?: emptyList(),
    )
}

fun parseDistributionV2(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        separatorRegex = SEPARATOR_REGEX,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = ::parseProposalMetadataV2)
    }
}
