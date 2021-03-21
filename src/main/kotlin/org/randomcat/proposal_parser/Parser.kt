package org.randomcat.proposal_parser

import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.mboxiterator.MboxIterator
import org.apache.james.mime4j.parser.AbstractContentHandler
import org.apache.james.mime4j.parser.MimeStreamParser
import org.apache.james.mime4j.stream.Field
import org.apache.james.mime4j.stream.MimeConfig
import java.io.File
import java.time.OffsetDateTime

private fun Message.isDistributionMessage(): Boolean {
    val adjustedSubject = subject.removePrefix("OFF: ")
    return adjustedSubject.startsWith("[Promotor] Distribution") || adjustedSubject.startsWith("Distribution of")
}

fun main(args: Array<String>) {
    val filePath = args.single()
    val file = File(filePath)

    MboxIterator
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
        .take(10)
        .onEach {
            println("Got subject: ${it.subject}")
        }
        .forEach { _ -> }
}
