package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.persistentListOf
import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.dom.TextBody
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private data class DistributionV0MetadataResult(
    val number: ProposalNumber,
    val author: PlayerName,
    val ai: ProposalAI,
    val title: String,
)

private fun parseMetadata(
    metadataLine: String,
    titleLine: String
): DistributionV0MetadataResult {
    val metadataParts = metadataLine.split(", ")

    val (number, author) = parseNumberAndAuthor(numberAuthorSpec = metadataParts.first())
    val ai = ProposalAI(metadataParts.single { it.startsWith("AI=") }.removePrefix("AI=").toBigDecimal())

    return DistributionV0MetadataResult(
        number = number,
        author = author,
        ai = ai,
        title = titleLine,
    )
}

private fun parseNumberAndAuthor(numberAuthorSpec: String): Pair<ProposalNumber, PlayerName> {
    val parts = numberAuthorSpec.split(" by ")
    require(parts.size == 2)

    val numberPart = parts[0]
    require(numberPart.startsWith("Proposal "))

    val number = ProposalNumber(numberPart.removePrefix("Proposal ").toBigInteger())
    val author = PlayerName(parts[1])

    return Pair(number, author)
}

private fun parseProposalDistributionV0(it: String): ProposalData {
    val lines = it.lines()
    val metadata = parseMetadata(metadataLine = lines[0], titleLine = lines[1])
    val text = lines.drop(2).dropWhile { it.isBlank() }.dropLastWhile { it.isBlank() }.joinToString("\n").trim()

    return ProposalData(
        number = metadata.number,
        ai = metadata.ai,
        title = metadata.title,
        author = metadata.author,
        coauthors = persistentListOf(),
        text = text,
    )
}

fun Message.parseDistributionV0(): List<ProposalData> {
    val text = (body as TextBody).reader.readText()

    val allParts =
        text
            .split("------------------------------------------------------------------------")
            .map { it.trim() }

    require(allParts.size > 2)
    require(allParts.first().startsWith("Distribution"))
    require(allParts.last().contains("Help STOP SPAM"))

    val proposalParts = allParts.drop(1).dropLast(1)

    return proposalParts.map {
        parseProposalDistributionV0(it)
    }
}
