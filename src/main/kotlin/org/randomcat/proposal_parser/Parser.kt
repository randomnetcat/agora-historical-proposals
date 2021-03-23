package org.randomcat.proposal_parser

import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.stream.MimeConfig
import org.randomcat.mime4j_backfill.MboxIteratorBackfill
import org.randomcat.proposal_parser.distributions.overridenDistribution
import org.randomcat.proposal_parser.distributions.parseDistributionV0
import org.randomcat.proposal_parser.distributions.parseDistributionV1
import java.io.File
import java.math.BigInteger
import java.time.LocalDate
import java.time.ZoneOffset
import java.util.*

private fun Message.isDistributionMessage(): Boolean {
    val adjustedSubject = subject.removePrefix("OFF:").trim()
    return adjustedSubject.startsWith("[Promotor] Distribution") ||
            adjustedSubject.startsWith("Distribution of", ignoreCase = true)
}

private val DISTRIBUTION_V0_END_DATE = LocalDate.of(2007, 5, 15)
private val DISTRIBUTION_V1_END_DATE = LocalDate.of(2009, 4, 13)

private fun Date.toUtcLocalDate() = LocalDate.ofInstant(this.toInstant(), ZoneOffset.UTC)

private fun Message.parseDistribution(): List<ProposalData> {
    val override = this.overridenDistribution()
    if (override != null) return override

    val date = this.date.toUtcLocalDate()
    val text = this.extractPlainTextBody()

    return when {
        date < DISTRIBUTION_V0_END_DATE -> parseDistributionV0(text)
        date < DISTRIBUTION_V1_END_DATE -> parseDistributionV1(text)
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
        .take(7000)
        .filter {
            it.isDistributionMessage()
        }
        .flatMap { it.parseDistribution() }
        .toList()
        .let { data ->
            val numbers = data.map { it.number }
            println(numbers.joinToString())

            val minNumber = numbers.minOf { it.raw }
            val maxNumber = numbers.maxOf { it.raw }

            val possibleNumbers = sequence {
                var current = minNumber

                while (current <= maxNumber) {
                    yield(current)
                    ++current
                }
            }

            println((possibleNumbers.filter { ProposalNumber(it) !in numbers }).joinToString())
        }
}
