package org.randomcat.proposal_parser

import kotlin.jvm.JvmInline
import kotlinx.collections.immutable.ImmutableList
import java.math.BigDecimal
import java.math.BigInteger

@JvmInline
value class PlayerName(val raw: String) {
    override fun toString(): String {
        return raw
    }
}

@JvmInline
value class ProposalNumber(val raw: BigInteger) {
    override fun toString(): String {
        return raw.toString()
    }
}

data class ProposalData(
    val number: ProposalNumber,
    val title: String,
    val author: PlayerName,
    val coauthors: ImmutableList<PlayerName>,
)
