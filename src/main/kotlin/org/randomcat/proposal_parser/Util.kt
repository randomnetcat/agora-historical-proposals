package org.randomcat.proposal_parser

import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.dom.Multipart
import org.apache.james.mime4j.dom.TextBody

fun Message.extractPlainTextBody(): String {
    return when (val body = this.body) {
        is TextBody -> body.reader.readText()
        is Multipart -> {
            require(body.subType == "alternative")
            (body.bodyParts.single { it.mimeType == "text/plain" }.body as TextBody).reader.readText()
        }

        else -> error("Unknown body type")
    }
}

fun String.normalizeLineEndings(): String {
    return lines().joinToString("\n")
}

fun String.repairBrokenSpaces(): String {
    return replace(' ', ' ')
}

private val PROBABLY_REPLY_REGEX = Regex("^.*? [wW](?:rites|rote):(?:\\n\\s*)+>")

fun contentLooksLikeReply(emailContent: String) = emailContent.contains(PROBABLY_REPLY_REGEX)

inline fun <K, V : Any> Map<K, V>.getFirstValueOrElse(vararg keys: K, defaultValue: () -> V): V {
    for (key in keys) {
        val value = this[key]
        if (value != null) return value
    }

    return defaultValue()
}

fun <K, V : Any> Map<K, V>.getFirstValue(vararg keys: K): V {
    return getFirstValueOrElse(*keys) {
        throw NoSuchElementException("No values for any of the following keys: ${keys.contentToString()}")
    }
}

fun <K, V : Any> Map<K, V>.getFirstValueOrNull(vararg keys: K): V? {
    return getFirstValueOrElse(*keys) { return null }
}
