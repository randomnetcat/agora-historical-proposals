package org.randomcat.proposal_parser

import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.stream.MimeConfig
import org.randomcat.mime4j_backfill.MboxIteratorBackfill
import org.randomcat.proposal_parser.distributions.*
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.time.LocalDate
import java.time.ZoneOffset
import java.util.*

private fun Message.isDistributionMessage(): Boolean {
    val adjustedSubject = subject.removePrefix("OFF:").trim()
    return adjustedSubject.startsWith("[Promotor] Distribution") ||
            adjustedSubject.startsWith("[Deputy Promotor] Distribution") ||
            adjustedSubject.startsWith("Distribution of", ignoreCase = true)
}

private val DISTRIBUTION_V0_END_DATE = LocalDate.of(2007, 5, 15)
private val DISTRIBUTION_V1_END_DATE = LocalDate.of(2009, 4, 13)
private val DISTRIBUTION_V2_END_DATE = LocalDate.of(2009, 5, 16)
private val DISTRIBUTION_V3_END_DATE = LocalDate.of(2009, 10, 21)
private val DISTRIBUTION_V4_END_DATE = LocalDate.of(2009, 10, 26)
private val DISTRIBUTION_V5_END_DATE = LocalDate.of(2010, 6, 21)

private fun Date.toUtcLocalDate() = LocalDate.ofInstant(this.toInstant(), ZoneOffset.UTC)

private fun Message.parseDistribution(): List<ProposalData> {
    val override = this.overridenDistribution()
    if (override != null) return override

    if (this.isIgnoredDistribution()) return emptyList()

    val date = this.date.toUtcLocalDate()
    val text = this.extractPlainTextBody().normalizeLineEndings().repairBrokenSpaces()

    if (contentLooksLikeReply(text)) return emptyList()

    return when {
        date < DISTRIBUTION_V0_END_DATE -> parseDistributionV0(text)
        date < DISTRIBUTION_V1_END_DATE -> parseDistributionV1(text)
        date < DISTRIBUTION_V2_END_DATE -> parseDistributionV2(text)
        date < DISTRIBUTION_V3_END_DATE -> parseDistributionV1(text) // V3 == V1
        date < DISTRIBUTION_V4_END_DATE -> parseDistributionV4(text)
        date < DISTRIBUTION_V5_END_DATE -> parseDistributionV5(text, this.backupFirstProposalNumber())
        else -> error("Don't know how to parse")
    }
}

fun main(args: Array<String>) {
    val inFilePath = args[0]
    val inFile = File(inFilePath)

    val outPath = Path.of(args[1])
    Files.createDirectories(outPath)

    MboxIteratorBackfill
        .fromFile(inFile)
        .charset(Charsets.UTF_8)
        .maxMessageSize(50 * 1000 * 1000) // 50 MB
        .build()
        .asSequence()
        .map {
            Message.Builder.of().use(MimeConfig.PERMISSIVE).parse(it.asInputStream(Charsets.UTF_8)).build()
        }
        .take(8000)
        .filter {
            it.isDistributionMessage() && it.date.toUtcLocalDate() < DISTRIBUTION_V5_END_DATE
        }
        .flatMap { it.parseDistribution() }
        .forEach { proposal ->
            val proposalText =
                """
ID: ${proposal.number}
Title: ${proposal.title}
Author: ${proposal.author?.toString() ?: "<Unknown>"}
Co-authors: ${proposal.coauthors.joinToString(", ")}
Adoption index: ${proposal.ai}

${proposal.text}
""".trim()

            Files.writeString(
                outPath.resolve(proposal.number.toString() + ".txt"),
                proposalText,
                Charsets.UTF_8,
                StandardOpenOption.CREATE,
            )
        }
}
