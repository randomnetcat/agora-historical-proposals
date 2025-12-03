package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.persistentListOf
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SUMMARY_SECTION_CHECK_REGEX = Regex("Num\\s+Author\\s+AI\\s+(Ch\\s+)?Title")

private val PROPOSAL_REGEX = Regex(
    "Proposal: (.+?) \\(AI=(\\d+(?:\\.\\d+)?)(?:,[^,]+)*?, Author=([^)]+?)\\)\n\\{{3}(.+?)\\}{3}",
    RegexOption.DOT_MATCHES_ALL
)

fun parseDistributionV20(
    fullDistributionText: String,
    backupProposalNumber: (index: Int) -> ProposalNumber,
): List<ProposalData> {
    require(fullDistributionText.contains(SUMMARY_SECTION_CHECK_REGEX))

    val proposals = PROPOSAL_REGEX.findAll(fullDistributionText).toList()
    require(proposals.isNotEmpty())

    return proposals.mapIndexed { index, result ->
        require(result.groups.size == 5)

        ProposalData(
            number = backupProposalNumber(index),
            title = result.groups[1]!!.value.trim(),
            ai = ProposalAI(result.groups[2]!!.value.trim().toBigDecimal()),
            author = PlayerName(result.groups[3]!!.value.trim()),
            coauthors = persistentListOf(),
            text = result.groups[4]!!.value.trim(),
        )
    }
}
