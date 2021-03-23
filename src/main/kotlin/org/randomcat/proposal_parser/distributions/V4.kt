package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SEPARATOR_REGEX = Regex("(?<=\\n)\\}(?:\\{\\}){4,}\\{\\n")

private val SUMMARY_SECTION_CHECK_REGEX = Regex("AI\\s+SUBMITTER\\s+TITLE\\n")
private val FINAL_SECTION_CHECK_REGEX = Regex("-coppro", RegexOption.LITERAL)

private data class ProposalV4TitleLineResult(
    val title: String,
    val ai: ProposalAI,
    val coauthors: ImmutableList<PlayerName>,
)

private fun parseTitleLine(titleLine: String): ProposalV4TitleLineResult {
    val title = titleLine.substringBefore('(')

    val parenthetical = titleLine.substringAfterLast('(').also { require(it.endsWith(')')) }.removeSuffix(")")
    val fields = parenthetical.replace(" = ", "=").split(", ")

    val ai = fields.single { it.startsWith("AI=") }.removePrefix("AI=").toBigDecimal().let { ProposalAI(it) }
    val coauthor = fields.singleOrNull { it.startsWith("Coauthor=") }?.removePrefix("Coauthor=")?.let { PlayerName(it) }

    return ProposalV4TitleLineResult(
        title = title,
        ai = ai,
        coauthors = listOfNotNull(coauthor).toImmutableList(),
    )
}

// Format:
// Number
// Author
// Title (AI=1.0, Some, Other, Fields, Coauthor = Someone)
//
// Text
// ...
private fun parseProposalMetadataV4(metadataLines: List<String>): ProposalCommonMetadataResult {
    require(metadataLines.size == 3)

    val number = ProposalNumber(metadataLines[0].toBigInteger())
    val author = PlayerName(metadataLines[1])

    val titleLineResult = parseTitleLine(titleLine = metadataLines[2])

    return ProposalCommonMetadataResult(
        number = number,
        title = titleLineResult.title,
        ai = titleLineResult.ai,
        author = author,
        coauthors = titleLineResult.coauthors,
    )
}

fun parseDistributionV4(fullDistributionText: String): List<ProposalData> {
    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = fullDistributionText,
        separatorRegex = SEPARATOR_REGEX,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.map {
        parseCommonProposal(proposalDistribution = it, metadataParser = ::parseProposalMetadataV4)
    }
}
