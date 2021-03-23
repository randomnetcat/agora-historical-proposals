package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

data class ProposalCommonMetadataResult(
    val number: ProposalNumber,
    val title: String,
    val ai: ProposalAI,
    val author: PlayerName,
    val coauthors: ImmutableList<PlayerName>,
) {
    constructor(
        number: ProposalNumber,
        title: String,
        ai: ProposalAI,
        author: PlayerName,
        coauthors: List<PlayerName>,
    ) : this(
        number = number,
        title = title,
        ai = ai,
        author = author,
        coauthors = coauthors.toImmutableList(),
    )
}

fun tryParseCommonProposal(
    proposalDistribution: String,
    metadataParser: (List<String>) -> ProposalCommonMetadataResult?,
): ProposalData? {
    val lines = proposalDistribution.lines()

    val metadataLines = lines.takeWhile { it.isNotBlank() }
    val metadata = metadataParser(metadataLines) ?: return null

    val textLines = lines.dropWhile { it.isNotBlank() }.drop(1)
    val text = textLines.joinToString("\n")

    return ProposalData(
        number = metadata.number,
        title = metadata.title,
        ai = metadata.ai,
        author = metadata.author,
        coauthors = metadata.coauthors,
        text = text,
    )
}

fun parseCommonProposal(
    proposalDistribution: String,
    metadataParser: (List<String>) -> ProposalCommonMetadataResult,
): ProposalData {
    return tryParseCommonProposal(proposalDistribution, metadataParser)
        ?: error("metadataParser returned null but shouldn't have")
}

object SplitDistribution {
    fun withSummaryAndOptFooter(
        fullDistributionText: String,
        separatorRegex: Regex,
        summarySectionRegex: Regex,
        footerRegex: Regex,
    ): List<String> {
        val allParts = fullDistributionText.split(separatorRegex)

        return allParts.toMutableList().also {
            require(it.size >= 3) // Expect summary, final section, and at least one proposal

            require(it[0].contains(summarySectionRegex))
            it.removeAt(0)

            if (it[it.size - 1].contains(footerRegex)) {
                it.removeAt(it.size - 1)
            }
        }
    }
}
