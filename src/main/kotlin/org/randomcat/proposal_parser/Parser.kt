package org.randomcat.proposal_parser

import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.stream.MimeConfig
import org.randomcat.mime4j_backfill.MboxIteratorBackfill
import org.randomcat.proposal_parser.distributions.parseDistributionV0
import java.io.File
import java.time.LocalDate
import java.time.ZoneOffset

private fun Message.isDistributionMessage(): Boolean {
    val adjustedSubject = subject.removePrefix("OFF: ")
    return adjustedSubject.startsWith("[Promotor] Distribution") || adjustedSubject.startsWith("Distribution of")
}

private val DISTRIBUTION_V0_END_DATE = LocalDate.of(2020, 1, 1)

private fun Message.parseDistribution(): List<ProposalData> {
    val date = LocalDate.ofInstant(this.date.toInstant(), ZoneOffset.UTC)

    return when {
        date < DISTRIBUTION_V0_END_DATE -> parseDistributionV0()
        else -> error("Don't know how to parse")
    }
}

fun main(args: Array<String>) {
    val filePath = args.single()
    val file = File(filePath)

    MboxIteratorBackfill
        .fromFile(file)
        .charset(Charsets.UTF_8)
        .maxMessageSize(50 * 1000 * 1000) // 50 MB
        .build()
        .asSequence()
        .map {
            Message.Builder.of().use(MimeConfig.PERMISSIVE).parse(it.asInputStream(Charsets.UTF_8)).build()
        }
        .take(1000)
        .filter {
            it.isDistributionMessage()
        }
        .take(1)
        .flatMap { it.parseDistribution() }
        .forEach {
            println(it)
        }
}
