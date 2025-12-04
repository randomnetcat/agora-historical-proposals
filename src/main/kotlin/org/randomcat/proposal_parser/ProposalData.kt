package org.randomcat.proposal_parser

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import java.math.BigDecimal
import java.math.BigInteger

@JvmInline
value class PlayerName(val raw: String) {
    init {
        require(raw.isNotBlank())
    }

    override fun toString(): String {
        return raw
    }
}

/**
 * A proposal number that hasn't yet been parsed to an integer (and might be replaced with something else before an
 * actual proposal
 */
@JvmInline
value class RawProposalNumber(val value: String)

@JvmInline
value class ProposalNumber(val value: BigInteger) {
    companion object {
        fun from(raw: RawProposalNumber): ProposalNumber {
            require(raw.value.all { it in '0'..'9' }) {
                "Invalid proposal number: $raw"
            }

            return ProposalNumber(BigInteger(raw.value))
        }
    }

    override fun toString(): String {
        return value.toString()
    }

    fun toRaw(): RawProposalNumber {
        return RawProposalNumber(value.toString())
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
    val ai: ProposalAI?,
    val author: PlayerName?,
    val coauthors: ImmutableList<PlayerName>,
    val text: String,
) {
    constructor(
        number: ProposalNumber,
        title: String?,
        ai: ProposalAI?,
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
