package org.randomcat.proposal_parser

import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.mboxiterator.MboxIterator
import org.apache.james.mime4j.stream.MimeConfig
import org.randomcat.proposal_parser.distributions.*
import java.math.BigInteger
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.time.LocalDate
import java.util.*

private fun Message.isDistributionMessage(): Boolean {
    if (this.isForcedDistribution()) return true
    if (this.isIgnoredDistribution()) return false

    val adjustedSubject = subject.removePrefix("BUS: OFF:").removePrefix("OFF:").removePrefix("BUS:").trim()
    return adjustedSubject.startsWith("[Promotor] Distribution") ||
            adjustedSubject.startsWith("[Promotor] Emergency Distribution") ||
            adjustedSubject.startsWith("[Promotor]Distribution") ||
            adjustedSubject.startsWith("[Deputy Promotor] Distribution") ||
            adjustedSubject.startsWith("[Promotor] Midweek Distribution") ||
            adjustedSubject.startsWith("Distribution of", ignoreCase = true) ||
            adjustedSubject.startsWith("Distrubtion of", ignoreCase = true) ||
            adjustedSubject.startsWith("Emergency Distribution") ||
            adjustedSubject.startsWith("[Promotor] Super-Emergency Distribution") ||
            adjustedSubject.startsWith("Real Fix Distribution") ||
            adjustedSubject.startsWith("[Promotor] (Corrected) Actual Distribution") ||
            adjustedSubject.startsWith("[Briefly Promotor] Distribution") ||
            adjustedSubject.startsWith("[Promotor] Redistribution") ||
            adjustedSubject.startsWith("[Deputy Promotor] Corrected Distribution") ||
            adjustedSubject.startsWith("[assumed promotor] distribution of proposals")
}

private val DISTRIBUTION_V0_END_DATE = LocalDate.of(2007, 5, 15)
private val DISTRIBUTION_V1_END_DATE = LocalDate.of(2009, 4, 2)
private val DISTRIBUTION_V2_END_DATE = LocalDate.of(2009, 5, 16)
private val DISTRIBUTION_V2a_SINGLE_DATE = LocalDate.of(2009, 7, 23)
private val DISTRIBUTION_V3_END_DATE = LocalDate.of(2009, 10, 21)
private val DISTRIBUTION_V4_END_DATE = LocalDate.of(2009, 10, 26)
private val DISTRIBUTION_V5_END_DATE = LocalDate.of(2010, 6, 21)
private val DISTRIBUTION_V6_END_DATE = LocalDate.of(2010, 7, 12)
private val DISTRIBUTION_V7_END_DATE = LocalDate.of(2010, 9, 13)
private val DISTRIBUTION_V8_END_DATE = LocalDate.of(2010, 10, 10)
private val DISTRIBUTION_V9_END_DATE = LocalDate.of(2011, 3, 8)
private val DISTRIBUTION_V9a_SINGLE_DATE = LocalDate.of(2011, 2, 15)
private val DISTRIBUTION_V10_END_DATE = LocalDate.of(2011, 7, 4)
private val DISTRIBUTION_V11_END_DATE = LocalDate.of(2011, 10, 23)
private val DISTRIBUTION_V12_END_DATE = LocalDate.of(2012, 1, 10)
private val DISTRIBUTION_V13_END_DATE = LocalDate.of(2012, 1, 24)
private val DISTRIBUTION_V14_END_DATE = LocalDate.of(2012, 2, 5)

private val NONEXISTENT_NUMBERS =
    setOf(
        // See Override.kt
        6209, 6210,
        // Skipped, according to "BUS: Re: DIS: Re: OFF: [Promotor] Distribution 6275-6300 & Report".
        // A proposal was incorrectly assigned 6275 instead of 6273 in "OFF: [Promotor] Super-Emergency Distribution 6275".
        6273,
        // Skipped: what would have been 6559 in order was assigned 6569, and 6559 was never assigned
        6559,
    ).map { ProposalNumber(BigInteger.valueOf(it.toLong())) }.toSet()

// 6223 -> no record
// 6532 -> no record
// 6548 -> a mess, originally numbered 6546
// 6682-6685 -> to BAK
// 6748 -> distribution not in BUS or OFF (but resolution is?)

private fun Message.parseDistribution(): List<ProposalData> {
    val override = this.overridenDistribution()
    if (override != null) return override

    val date = this.date.toUtcLocalDate()
    val text = this.overriddenText() ?: this.extractPlainTextBody().normalizeLineEndings().repairBrokenSpaces()

    if (!this.isForcedDistribution() && contentLooksLikeReply(text)) return emptyList()

    return when {
        date < DISTRIBUTION_V0_END_DATE -> parseDistributionV0(text)
        date < DISTRIBUTION_V1_END_DATE -> parseDistributionV1(text)
        date < DISTRIBUTION_V2_END_DATE || date == DISTRIBUTION_V2a_SINGLE_DATE -> parseDistributionV2(text)
        date < DISTRIBUTION_V3_END_DATE -> parseDistributionV1(text) // V3 == V1
        date < DISTRIBUTION_V4_END_DATE -> parseDistributionV4(text)
        date < DISTRIBUTION_V5_END_DATE -> parseDistributionV5(text, this::backupProposalNumber)
        date < DISTRIBUTION_V6_END_DATE -> parseDistributionV1(text) // V6 == V1
        date < DISTRIBUTION_V7_END_DATE -> parseDistributionV7(text)
        date < DISTRIBUTION_V8_END_DATE -> parseDistributionV8(text, this::backupProposalNumber)
        date == DISTRIBUTION_V9a_SINGLE_DATE -> parseDistributionV9a(text)
        date < DISTRIBUTION_V9_END_DATE -> parseDistributionV7(text)
        date < DISTRIBUTION_V10_END_DATE -> parseDistributionV10(text) // V10 == V1
        date < DISTRIBUTION_V11_END_DATE -> parseDistributionV11(text)
        date < DISTRIBUTION_V12_END_DATE -> parseDistributionV12(text)
        date < DISTRIBUTION_V13_END_DATE -> parseDistributionV11(text) // V13 == V11
        date < DISTRIBUTION_V14_END_DATE -> parseDistributionV14(text)
        else -> error("Don't know how to parse")
    }
}

fun main(args: Array<String>) {
    val inFile1 = Path.of(args[0])
    val inFile2 = Path.of(args[1])

    val outPath = Path.of(args[2])
    Files.createDirectories(outPath)

    val numbers = TreeSet<ProposalNumber>(Comparator.comparing { it.raw })
    val duplicates = mutableSetOf<ProposalNumber>()

    listOf(inFile1, inFile2)
        .asSequence()
        .flatMap { file ->
            MboxIterator
                .fromFile(file)
                .charset(Charsets.ISO_8859_1)
                .maxMessageSize(50 * 1000 * 1000) // 50 MB
                .build()
                .asSequence()
                .map {
                    Message.Builder.of().use(MimeConfig.PERMISSIVE).parse(it.asInputStream(Charsets.ISO_8859_1)).build()
                }
                .filter {
                    it.isDistributionMessage()
                }
                .map {
                    try {
                        it.parseDistribution()
                    } catch (e: Exception) {
                        e.printStackTrace()
                        null
                    }
                }
                .takeWhile { it != null }
                .flatMap { it ?: error("Already checked for null") }
        }
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

            println("Got number: ${proposal.number}")

            if (!numbers.add(proposal.number)) {
                duplicates.add(proposal.number)
            }
        }

    val lowest = numbers.iterator().next()
    val highest = numbers.descendingIterator().next()

    val missing =
        generateSequence(lowest) { ProposalNumber(it.raw.plus(BigInteger.ONE)) }
            .takeWhile { it.raw <= highest.raw }
            .filter { it !in numbers }

    println("Bounds: $lowest to $highest")
    println("Duplicates: ${duplicates.joinToString()}")
    println("Missing: ${(missing - NONEXISTENT_NUMBERS).joinToString()}")
}
