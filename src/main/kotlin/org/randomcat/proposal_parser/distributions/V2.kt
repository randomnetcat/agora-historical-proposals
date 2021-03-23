package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.mutate
import kotlinx.collections.immutable.toPersistentList
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SEPARATOR_REGEX = Regex("(?<=\\n)\\}(?:\\{\\}){4,}\\{\\n")

private val SUMMARY_SECTION_CHECK_REGEX = Regex("\\n(?:NUM|Num)(?:\\s+C\\s+I\\s+AI\\s+SUBMITTER)?\\s+(?:TITLE|Title)")
private val FINAL_SECTION_CHECK_REGEX = Regex("The highest orderly ID for distributed proposal", RegexOption.LITERAL)

@OptIn(ExperimentalStdlibApi::class)
private fun parseProposalData(proposalDistributionText: String): ProposalData {
    val lines = proposalDistributionText.lines()

    // Format:
    // Number: NNNN
    // Title: something
    // Some: Value
    // Other: Value
    // Fields: Value
    //
    // Text
    // ...

    val metadataLines = lines.takeWhile { it.isNotBlank() }

    val metadataMap = metadataLines.associate {
        require(it.contains(": "))
        it.substringBefore(": ").lowercase() to it.substringAfter(": ")
    }

    val textLines = lines.dropWhile { it.isNotBlank() }.drop(1)
    val text = textLines.joinToString("\n").trim()

    // Sometimes AI has (Class) appended to it, so only take the number before that
    val ai =
        metadataMap
            .getValue("adoption index")
            .substringBefore(" (")
            .toBigDecimal()
            .let { ProposalAI(it) }

    return ProposalData(
        number = ProposalNumber(metadataMap.getValue("number").toBigInteger()),
        title = metadataMap.getValue("title"),
        ai = ai,
        author = PlayerName(metadataMap.getValue("author")),
        coauthors = metadataMap["coauthors"]
            ?.takeIf { it.isNotBlank() }
            ?.split(", ")
            ?.map { PlayerName(it) }
            ?: emptyList(),
        text = text,
    )
}

fun parseDistributionV2(fullDistributionText: String): List<ProposalData> {
    val allParts = fullDistributionText.split(SEPARATOR_REGEX)

    val proposalParts = allParts.toPersistentList().mutate {
        require(it.size >= 3) // Expect summary, final section, and at least one proposal

        require(it[0].contains(SUMMARY_SECTION_CHECK_REGEX))
        it.removeAt(0)

        if (it[it.size - 1].contains(FINAL_SECTION_CHECK_REGEX)) {
            it.removeAt(it.size - 1)
        }
    }

    return proposalParts.map { parseProposalData(proposalDistributionText = it) }
}
