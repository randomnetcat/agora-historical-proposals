package org.randomcat.proposal_parser.distributions

import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber

private val SUMMARY_SECTION_CHECK_REGEX = Regex("ID\\s+Author(\\(s\\))?\\s+AI\\s+Title")
private val FINAL_SECTION_CHECK_REGEX = Regex("--\\s*\n(aranea|Luis Ressel <aranea@aixah.de>)", RegexOption.MULTILINE)
private val EXCLUDE_REGEX = Regex("^ID: (pp|cp)\\d+$", RegexOption.MULTILINE)

private val IGNORED_TAGS = listOf(
    "PENDING",
    "Official Proposal",
    "OFFICIAL PROPOSAL",
    "OFFICIAL PROPOSAL; OFFICIAL PROPOSAL",
    "SILY PROPOSAL; OFFICIAL PROPOSAL",
)

// Handle coauthor list for P7824, "Contracts v8"
private fun cleanUnmarkedOverlongCoauthors(text: String): String {
    return text.replace(Regex("(?<=\\n)Co-author\\(s\\): (.*),\\s*\\n(Alexis, .*)")) { matchResult ->
        "Co-author(s): ${matchResult.groupValues[1]}, ${matchResult.groupValues[2]}"
    }
}

private fun replaceProposalPoolIDs(text: String): String {
    return text.replace(Regex("^ID: (\\d+)/pp\\d+$", RegexOption.MULTILINE)) { result ->
        "ID: ${result.groupValues[1]}"
    }
}

fun parseDistributionV24(
    rawDistributionText: String,
    backupProposalNumber: (index: Int) -> ProposalNumber,
): List<ProposalData> {
    val cleanedText = rawDistributionText.let(::cleanUnmarkedOverlongCoauthors).let(::replaceProposalPoolIDs)

    val proposalParts = SplitDistribution.withSummaryAndOptFooter(
        fullDistributionText = cleanedText,
        separatorRegex = Separators.SLASHES,
        summarySectionRegex = SUMMARY_SECTION_CHECK_REGEX,
        footerRegex = FINAL_SECTION_CHECK_REGEX,
    )

    return proposalParts.filter { !it.contains(EXCLUDE_REGEX) }.mapIndexed { index, distributionText ->
        parseCommonProposal(proposalDistribution = distributionText, metadataParser = { metadataLines ->
            MetadataParsing.keyValueHeaders(
                metadataLines = metadataLines,
                ignoredTags = IGNORED_TAGS,
                backupNumber = backupProposalNumber(index),
                extraOverlongHeaders = listOf("Co-author(s)", "Co-authors")
            )
        })
    }
}
