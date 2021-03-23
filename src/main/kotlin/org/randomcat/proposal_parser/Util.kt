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

private val PROBABLY_REPLY_REGEX = Regex("^.*? [wW]rites:(?:\\n\\s*)+>")

fun contentLooksLikeReply(emailContent: String) = emailContent.contains(PROBABLY_REPLY_REGEX)
