package org.randomcat.proposal_parser

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
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

@JvmInline
value class ProposalAI(val raw: BigDecimal) {
    override fun toString(): String {
        return raw.toString()
    }
}

data class ProposalData(
    val number: ProposalNumber,
    val title: String?,
    val ai: ProposalAI,
    val author: PlayerName?,
    val coauthors: ImmutableList<PlayerName>,
    val text: String,
) {
    constructor(
        number: ProposalNumber,
        title: String?,
        ai: ProposalAI,
        author: PlayerName?,
        coauthors: List<PlayerName>,
        text: String,
    ) : this(
        number,
        title,
        ai,
        author,
        coauthors.toImmutableList(),
        text,
    )
}
