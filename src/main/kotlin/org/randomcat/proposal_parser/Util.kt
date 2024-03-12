package org.randomcat.proposal_parser

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import org.apache.james.mime4j.dom.Message
import org.apache.james.mime4j.dom.Multipart
import org.apache.james.mime4j.dom.TextBody
import java.time.LocalDate
import java.time.ZoneOffset
import java.util.*

fun Date.toUtcLocalDate(): LocalDate = LocalDate.ofInstant(this.toInstant(), ZoneOffset.UTC)

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

sealed class BlankLineSplitResult {
    data class Split(
        val beforeBlank: ImmutableList<String>,
        val afterBlank: ImmutableList<String>,
    ) : BlankLineSplitResult() {
        constructor(
            beforeBlank: List<String>,
            afterBlank: List<String>,
        ) : this(
            beforeBlank = beforeBlank.toImmutableList(),
            afterBlank = afterBlank.toImmutableList(),
        )
    }

    object InsufficientBlanks : BlankLineSplitResult()
}

fun List<String>.splitAtNthBlank(n: Int): BlankLineSplitResult {
    var blanksSeen: Int = 0
    val beforeBlankLines = mutableListOf<String>()

    for (line in this) {
        if (line.isBlank()) {
            blanksSeen++
            if (blanksSeen == n) break
        }

        beforeBlankLines += line
    }

    if (blanksSeen != n) return BlankLineSplitResult.InsufficientBlanks

    return BlankLineSplitResult.Split(
        beforeBlank = beforeBlankLines,
        afterBlank = this.drop(beforeBlankLines.size + 1),
    )
}

private val PROBABLY_REPLY_REGEX = Regex("^.*? [wW](?:rites|rote):(?:\\n\\s*)+>")

fun contentLooksLikeReply(emailContent: String): Boolean {
    return emailContent.contains(PROBABLY_REPLY_REGEX) || emailContent.startsWith("> ")
}

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
