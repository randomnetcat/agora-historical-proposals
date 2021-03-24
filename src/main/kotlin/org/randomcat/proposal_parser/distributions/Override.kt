package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.persistentListOf
import org.apache.james.mime4j.dom.Message
import org.randomcat.proposal_parser.PlayerName
import org.randomcat.proposal_parser.ProposalAI
import org.randomcat.proposal_parser.ProposalData
import org.randomcat.proposal_parser.ProposalNumber
import java.math.BigDecimal

private val SUBJECT_MAP = mapOf<String, List<ProposalData>>(
    "OFF: [Promotor] Distribution of Proposal 4864" to listOf(
        ProposalData(
            number = ProposalNumber(4864.toBigInteger()),
            title = "The Argent Tincture Repeals",
            ai = ProposalAI(BigDecimal("1.0")),
            author = PlayerName("Goethe"),
            coauthors = persistentListOf(),
            text = """
                Proposal:  The Argent Tincture Repeals

                [Greatly simplifies patent titles and especially degrees, no more
                university]

                The Rule Category 'Patent Titles and Degrees' is hereby created.  All
                Rules amended by this Proposal are placed in this new category.

                ----------------------------------------------------------------------

                Amend Rule 649 (Patent Titles) to read:

                      A Patent Title is a legal item of recognition of a person's
                      distinction.

                      When a Patent Title is awarded to a person, that person is said
                      to Bear that Patent Title.  When a Patent Title is revoked from
                      a person, that person ceases to Bear that Patent Title.  The
                      status of Bearing a Patent Title can only be changed as
                      explicitly set out in the Rules.

                      As soon as possible after the Rules state that a Patent title
                      shall be awarded or revoked, the Herald shall publicly award or
                      revoke that Patent Title.

                ----------------------------------------------------------------------

                Amend Rule 1922 (Defined Regular Patent Titles) to read:

                      The following are Patent Titles:

                      (a)  Scamster, which may be awarded to any Player who has shown
                           great enthusiasm, persistence, or skill in the perpetrating
                           of scams.  This title may not be declined, retracted, or
                           revoked.

                      (b)  A Patent Title (non-unique) now will
                           Be known as "Bard", and granted those with wit.
                           In order for one Title to be filled,
                           A level of Support must call for it.

                           Three players to a fourth may grant this name
                           If these three write as 1, with 2 Support.
                           A current Bard may also grant the same,
                           Provided that a second Bard's a sport.

                           And so we don't the name of Bard debase,
                           A Player with 3 Supporters can conspire
                           To (from a Bard), this Title to erase:
                           Or Bard (plus 2 Bards) make a Bard retire.

                           But lest we ruin some poor minstrel's fun
                           No bard will be dis-bard for eir bad pun.

                      (c)  Three Months Long Service, Six Months Long Service, Nine
                           Months Long Service, Twelve Months Long Service, to be
                           awarded to any player who has held a particular Office
                           continuously for the specified duration.  Each of these
                           titles shall be awarded only once per player.

                ----------------------------------------------------------------------

                Amend Rule 1367 (Degrees) to read:

                      A Patent Title is only a Degree if it is specifically made such
                      by a Rule.  Persons may come to Bear Degrees only as specified
                      in the Rules. Once a person Bears a Degree, e shall keep that
                      Degree forever.

                      This Rule takes precedence over any Rule specifying default
                      properties of Patent Titles.

                      The following Degrees are hereby made legal:

                         - Associate of Nomic                 (A.N.)
                         - Bachelor of Nomic                  (B.N.)
                         - Master of Nomic                    (M.N.)
                         - Doctor of Nomic History            (D.N. Hist)
                         - Doctor of Nomic Science            (D.N. Sci)
                         - Doctor of Nomic Philosophy         (D.N.Phil)

                      Degrees shall be ranked in the order they appear in this Rule,
                      with Degrees listed latest in the Rule being ranked higher.

                ----------------------------------------------------------------------

                Amend Rule 1370 (How to Get a Degree) to read:

                     A person becomes a Candidate for a Degree when e publishes a
                     Thesis along with a statement explicitly indicating that the
                     Thesis is being submitted with the intent to qualify for a
                     particular degree.  A Thesis (plural: Theses) is an essay
                     whose topic is any facet of Agora Nomic, or Nomic in general.

                     The Candidate shall choose a Player other tham emself to be
                     the first member of eir Thesis Committee, called eir Chair,
                     with the Chair's consent.

                     If the Speaker is neither the Chair nor the Candidate, the
                     Speaker shall appoint a Player who is neither the Chair nor the
                     Candidate to be the second Committee member.  Otherwise, the
                     the Clerk of the Courts shall so appoint.  The two Committee
                     members shall then select, by mutual consent, a third person
                     who is not the Candidate to be the third Committee member.

                     The Committee shall examine the Candidate and eir Thesis to
                     determine eir qualifications for the Degree.  The Chair of the
                     Thesis Committee may award that Degree to the Candidate if and
                     only if:

                      * the Candidate has satisfied all prerequisites in the Rules for
                        the award of that Degree;

                      * a majority of members of the Thesis Committee agree that the
                        Thesis is worthy of the Degree to be granted.  Attention
                        should be paid to the originality and strength of the work, as
                        well as the extent of the work with regard to the expectations
                        of the particular degree.  The committee may award a lesser
                        degree if appropriate; and

                      * fewer than seven years have passed since that Committee was
                        formed.

                      Each Committee Member may publish a Commentary for the Thesis.
                      The Rulekeepor shall retain a copy of each Thesis that has
                      resulted in a degree, along with all such Commentaries.

                ----------------------------------------------------------------------

                Repeal Rule 1044 (Unique Patent Titles)
                Repeal Rule 2049 (Ephemera)
                Repeal Rule 2086 (Education)
                Repeal Rule 2089 (Gardner Library)
                Repeal Rule 1368 (The Legal Degrees)
                Repeal Rule 2092 (Honorary Degrees)
                Repeal Rule 1369 (Theses)
                Repeal Rule 2044 (Awardable Degrees)

                Any and all empty Rule Categories are hereby deleted.


                ----------------------------------------------------------------------
            """.trimIndent()
        ),
    ),
    "OFF: [Promotor] Distribution of Proposals 4865-4868" to listOf(
        ProposalData(
            number = ProposalNumber(4865.toBigInteger()),
            title = "The Lion Rampant Repeals",
            ai = ProposalAI(BigDecimal("1.0")),
            author = PlayerName("Goethe"),
            coauthors = persistentListOf(),
            text = """
                Proposal:  The Lion Rampant Repeals

                [Same as previous proposal, with numbers in poem spelled out]
                [Greatly simplifies patent titles and especially degrees, no more
                university]

                The Rule Category 'Patent Titles and Degrees' is hereby created.  All
                Rules amended by this Proposal are placed or moved into this new
                category.

                ----------------------------------------------------------------------

                Amend Rule 649 (Patent Titles) to read:

                      A Patent Title is a legal item of recognition of a person's
                      distinction.

                      When a Patent Title is awarded to a person, that person is said
                      to Bear that Patent Title.  When a Patent Title is revoked from
                      a person, that person ceases to Bear that Patent Title.  The
                      status of Bearing a Patent Title can only be changed as
                      explicitly set out in the Rules.

                      As soon as possible after the Rules state that a Patent title
                      shall be awarded or revoked, the Herald shall publicly award or
                      revoke that Patent Title.

                ----------------------------------------------------------------------

                Amend Rule 1922 (Defined Regular Patent Titles) to read:

                      The following are Patent Titles:

                      (a)  Scamster, which may be awarded to any Player who has shown
                           great enthusiasm, persistence, or skill in the perpetrating
                           of scams.  This title may not be declined, retracted, or
                           revoked.

                      (b)  A Patent Title (non-unique) now will
                           Be known as "Bard", and granted those with wit.
                           In order for the Title to be filled,
                           A level of Support must call for it.

                           Three players to a fourth may grant this name
                           If these three write as one, with two Support.
                           A current Bard may also grant the same,
                           Provided that a second Bard's a sport.

                           And so we don't the name of Bard debase,
                           A Player with three Supporters can conspire
                           To (from a Bard), this Title to erase:
                           Or Bard (plus two Bards) make a Bard retire.

                           But lest we ruin some poor minstrel's fun
                           No bard will be dis-bard for eir bad pun.

                      (c)  Three Months Long Service, Six Months Long Service, Nine
                           Months Long Service, Twelve Months Long Service, to be
                           awarded to any player who has held a particular Office
                           continuously for the specified duration.  Each of these
                           titles shall be awarded only once per player.

                ----------------------------------------------------------------------

                Amend Rule 1367 (Degrees) to read:

                      A Patent Title is only a Degree if it is specifically made
                      such by a Rule.  Persons may come to Bear Degrees only as
                      specified in the Rules. Once a person Bears a Degree, e shall
                      keep that Degree forever.

                      This Rule takes precedence over any Rule specifying default
                      properties of Patent Titles.

                      The following Degrees are hereby made legal:

                         - Associate of Nomic                 (A.N.)
                         - Bachelor of Nomic                  (B.N.)
                         - Master of Nomic                    (M.N.)
                         - Doctor of Nomic History            (D.N. Hist)
                         - Doctor of Nomic Science            (D.N. Sci)
                         - Doctor of Nomic Philosophy         (D.N.Phil)

                      Degrees shall be ranked in the order they appear in this Rule,
                      with Degrees listed latest in the Rule being ranked higher.

                ----------------------------------------------------------------------

                Amend Rule 1370 (How to Get a Degree) to read:

                     A person becomes a Candidate for a Degree when e publishes a
                     Thesis along with a statement explicitly indicating that the
                     Thesis is being submitted with the intent to qualify for a
                     particular degree.  A Thesis (plural: Theses) is an essay
                     whose topic is any facet of Agora Nomic, or Nomic in general.

                     The Candidate shall choose a Player other tham emself to be
                     the first member of eir Thesis Committee, called eir Chair,
                     with the Chair's consent.

                     If the Speaker is neither the Chair nor the Candidate, the
                     Speaker shall appoint a Player who is neither the Chair nor the
                     Candidate to be the second Committee member.  Otherwise, the
                     the Clerk of the Courts shall so appoint.  The two Committee
                     members shall then select, by mutual consent, a third person
                     who is not the Candidate to be the third Committee member.

                     The Committee shall examine the Candidate and eir Thesis to
                     determine eir qualifications for the Degree.  The Chair of the
                     Thesis Committee may award that Degree to the Candidate if and
                     only if:

                      * the Candidate has satisfied all prerequisites in the Rules for
                        the award of that Degree;
                      * a majority of members of the Thesis Committee agree that the
                        Thesis is worthy of the Degree to be granted.  Attention
                        should be paid to the originality and strength of the work, as
                        well as the extent of the work with regard to the expectations
                        of the particular degree.  The committee may award a lesser
                        degree if appropriate; and
                      * fewer than seven years have passed since that Committee was
                        formed.

                      Each Committee Member may publish a Commentary for the Thesis.
                      The Rulekeepor shall retain a copy of each Thesis that has
                      resulted in a degree, along with all such Commentaries.

                ----------------------------------------------------------------------

                Repeal Rule 1044 (Unique Patent Titles)
                Repeal Rule 2049 (Ephemera)
                Repeal Rule 2086 (Education)
                Repeal Rule 2089 (Gardner Library)
                Repeal Rule 1368 (The Legal Degrees)
                Repeal Rule 2092 (Honorary Degrees)
                Repeal Rule 1369 (Theses)
                Repeal Rule 2044 (Awardable Degrees)


                ----------------------------------------------------------------------
            """.trimIndent(),
        ),
        ProposalData(
            number = ProposalNumber(4866.toBigInteger()),
            title = "Constitutional Repeals 2.0",
            ai = ProposalAI(BigDecimal("3")),
            author = PlayerName("Goethe"),
            coauthors = persistentListOf(),
            text = """
                Proposal:  Constitutional Repeals 2.0

                [2.0 Kept First Speaker.  Edited R101 rights to keep out spammers.
                Added Oscar's Mire.  Added Card Repeal in case Murphy's gets stuck]

                [Changes some basic definitions of Who We Are and How Things Work.
                Some shortening, more reorganizing, not a huge amount].

                The Rulekeepor is hereby requested to place Rules in categories as
                indicated by this Proposal, in the order indicated in this Proposal,
                which may involve the creation of new categories, moving of rules, or
                the deletion of categories.  Some rules are included for reference and
                indication of new placement without being actually amended.

                ======================================================================
                The Game of Agora
                ----------------------------------------------------------------------

                Amend Rule 2105 (The Map of Agora) to read:

                                               ____  _        /|
                                    DARWIN ->  \_  |/ |      / \
                                              __/    /      |  |
                            <- DSV          /      /        |  \
                                        _   \      \_       |   \
                                  MORNINGTON CRESCENT ->    /    |  <- GOETHE BARRIER REEF
                                 _ _/       |         \_/\_/     \
                                / \\ <- SHARK BAY      |         |
                               /            |          |          \ <- TOWNSVILLE
                            ___/            |          |           \_
                         __/                |          |  .___o  )   |
                        /                   |          | ~~vv ===~~~ <-OSCAR'S MIRE
                       /           O <- SHERLOCK NESS  |             |/\
                      |                     |          |               |_
                      |                     |          |  EMERALD ->     \
                      \                     |__________=_____,             \
                       /                    |                |             | <- BRISBANE
                       \      O <- LT. ANNE MOORE            |        __  _\
                        \                   |                |_______/  \/ |
                         |                __/\      <- TARCOOLA           /   LORD HOWE ->
                         \             __/    \_             /           /
                 PERTH -> |      _  __/         |   /| IVANHOE ->       | <- WOLLONGONG
                          /    _/ \/             \ / /       |         /
                         |_   /     <- ESPERANTO  v /__     |_        / <- CANBERRA
                           \_/                         \    | \_    _|
                               __   __                 |    |   \__/
                              __ \ / __                 \___=_  ___|
                             /  \ | /  \        MANUBOURNE -> \/
                                 \|/
                            _,.---v---._                    /\__
                   /\__/\  /            \                   |   |
                   \_  _/ /              \                   |  /
                     \ \_|           @ __|                   \_/ <- HOBART
                      \                \_
                       \     ,__/       /
                     ~~~`~~~~~~~~~~~~~~/~~~~

                ----------------------------------------------------------------------

                Rename Rule 101 to "Agoran Rights and Privileges" and amend it to
                read:

                      The rules may define persons as possessing specific rights or
                      privileges.  Be it hereby proclaimed that no binding agreement
                      or interpretation of Agoran law may abridge, reduce, limit, or
                      remove a person's defined rights.  A person's defined privileges
                      are assumed to exist in the absense of an explicit, binding
                      agreement to the contrary.  This rule takes precedence over any
                      rule which would allow restrictions of a person's rights or
                      privileges.

                       i. Every person has the privilege of doing what e wilt.

                      ii. Every player has the right to perform an action which is not
                          regulated.

                     iii. Every person has the right to invoke judgement, appeal a
                          judgement, and to initiate an appeal on a sentencing or
                          judicial order binding em.

                      iv. Every person has the right to refuse to become party to
                          a binding agreement.  The absense of a person's explicit,
                          willful consent shall be considered a refusal.

                       v. Every person has the right to not be considered bound by
                          an agreement, or an amendment to an agreement, which e has
                          not had the reasonable opportunity to view.

                      vi. Every player has the right of participation in the fora.

                     vii. Every person has the right to not be penalized more than
                          once for any single action or inaction.

                    viii. Every player besides the Speaker has the right to deregister
                          rather than continue to play.

                    Please treat Agora right good forever.

                ----------------------------------------------------------------------

                Enact a rule entitled 'Regulation Regulations', with a power of 3 and
                the following text:

                      An action is regulated if:

                      (a) the action is prohibited;

                      (b) the rules indicate that if certain conditions are satisfied,
                          then some player is permitted to perform the action;

                      (c) the action would, as part of its effect, modify information
                          for which some player is required to be a recordkeepor;

                      (d) the action would, as part of its effect, make it impossible
                          to make arbitrary modifications to the rules by any
                          combinations of actions by players; or

                      (e) the courts have held that the action is regulated, and this
                          finding has not been overturned.

                ----------------------------------------------------------------------

                Rule 1688/2 (Power=3)
                Power

                      The power of an entity is a natural number, which is zero unless
                      otherwise defined or modified according to procedures defined by
                      the rules.  An instrument is an entity with positive power.

                ----------------------------------------------------------------------

                Rule 1482/1 (Power=3)
                Precedence between Rules with Unequal Power

                      In a conflict between Rules with different Power, the Rule with
                      the higher Power takes precedence over the Rule with the lower
                      Power.

                ----------------------------------------------------------------------

                Rule 1030/4 (Power=3)
                Precedence between Rules with Equal Power

                      If two or more Rules with the same Power conflict with one
                      another, then the Rule with the lower Number takes precedence.

                      If at least one of the Rules in conflict explicitly says of
                      itself that it defers to another Rule (or type of Rule) or
                      takes precedence over another Rule (or type of Rule), then such
                      provisions shall supercede the numerical method for determining
                      precedence.

                      If all of the Rules in conflict explicitly say that their
                      precedence relations are determined by some other Rule for
                      determining precedence relations, then the determinations of
                      the precedence determining Rule shall supercede the numerical
                      method for determining precedence.

                      If two or more Rules claim to take precedence over one another
                      or defer to one another, then the numerical method again
                      governs.

                ----------------------------------------------------------------------

                Rule 2110/0 (Power=3)
                Win by Paradox

                      If the legality of an action cannot be determined with finality,
                      or if by a Judge's best reasoning, not appealed within a week of
                      eir Judgement, an action appears equally legal and illegal, then
                      the Speaker shall award the Patent Title of Champion to the
                      first Player to publicly note that condition.  The Herald shall
                      record that this Title was achieved "by paradox" in eir report.

                ----------------------------------------------------------------------

                Amend Rule 1727 (Happy Birthday) to read:

                      WHEREAS, in June 1993, the world's only MUD-based nomic, Nomic
                      World, had recently collapsed; yet, many of its players enjoyed
                      nomic and did not wish to forego such a noble pursuit;

                      And WHEREAS, Originator Chuck Carroll therefore composed an
                      Initial Ruleset for an email nomic, based on the Initial
                      Rulesets of Peter Suber, inventor of Nomic, and on the Rulesets
                      of Nomic World and other nomics,

                      And WHEREAS, a nomic thus rose like a phoenix from the ashes of
                      Nomic World, played on the mailing list originally set up for
                      discussion of Nomic World, and coming into existence at June 30,
                      1993, 00:04:30 GMT +1200, with a message sent by FIRST SPEAKER
                      Michael Norrish, which read, in part,

                          "I see no reason to let this get bogged down; there are no
                          precedents or rules that cover this situation, so I think
                          we may as well begin directly.... Proposals for new rules
                          are invited. In accordance with the rules, these will be
                          published, numbered and distributed by me at my earliest
                          convenience."

                      And WHEREAS, this nomic began as a humble and nameless nomic,
                      known unofficially as yoyo, after the mailing list it was played
                      on, until its Players, much later, gave it its OFFICAL NAME of
                      Agora,

                      And WHEREAS, Agora has now become the wisest, noblest, eldest,
                      and most interesting of all active email nomics, due to the hard
                      work and diligence of Agorans as well as the frequent advice of
                      Agoraphobes,

                      And WHEREAS, Agorans desire to joyously commemorate Agora's
                      founding,

                      BE IT THEREFORE RESOLVED that Agora's Birthday is defined to be
                      the entire day of June 30, GMT +1200, of each year, and as soon
                      as possible after the end of Agora's Birthday, the Herald shall
                      award the boon of celebration to each Player who, during Agora's
                      Birthday, publicly recognizes this Grand Event.

                ----------------------------------------------------------------------

                Rule 104/0 (Power=3)
                First Speaker

                      The Speaker for the first game shall be Michael Norrish.

                ----------------------------------------------------------------------

                Repeal Rule 1020 (Name Is Agora)
                Repeal Rule 2039 (Ought implies can)
                Repeal Rule 1513 (Authority of Non-Rule Entities)

                ----------------------------------------------------------------------

                ======================================================================
                Players and Entities
                ----------------------------------------------------------------------

                Rule 1586/2 (Power=2)
                Definition and Continuity of Entities

                      No two Rule-defined entities shall have the same name or
                      nickname.

                      If the Rules defining some entity are repealed or amended
                      such that they no longer define that entity, then that
                      entity along with all its properties shall cease to exist.

                      If the Rules defining an entity are amended such that they
                      still define that entity but with different properties,
                      that entity and its properties shall continue to exist to
                      whatever extent is possible under the new definitions.

                ----------------------------------------------------------------------

                Rule 869/17 (Power=1)
                How to Join and Leave Agora

                      A person who is not currently registered as a player and is not
                      prohibited from registering is permitted to register.

                      A person registers or deregisters by announcement.

                      Whenever a person registers, e becomes a player.

                      Whenever a player deregisters or is deregistered, e ceases to be
                      a player and is prohibited from registering for the next thirty
                      days.


                ----------------------------------------------------------------------

                Rule 1789/3 (Power=1)
                Cantus Cygneus

                      Whenever a Player feels that e has been treated so egregiously
                      by the Agoran community that e can no longer abide to be a part
                      of it, e may submit a document to the Clerk of the Courts,
                      clearly labeled a Cantus Cygneus, detailing eir grievances and
                      expressing eir reproach for those who e feels have treated em so
                      badly.

                      As soon as possible after receiving a Cantus Cygneus, the Clerk
                      of the Courts shall publish this document along with a Writ of
                      Fugere Agorae Grandissima Exprobratione, commanding the Player
                      to be deregistered and instructing the Herald to note the
                      method of deregistration for that Player in subsequent Herald
                      Reports, as long as the Player remains deregistered.

                      The Player is deregistered as of the posting of the Writ, and
                      the notation in the Herald's Report will ensure that,
                      henceforth, all may know said Player deregistered in a Writ of
                      FAGE.

                ----------------------------------------------------------------------

                Repeal Rule 1677 (Honoring the New)
                Repeal Rule 1976 (Honoring the Old)
                Repeal Rule 1016 (Activity Levels)
                Repeal Rule 2036 (The Silent Treatment)

                ======================================================================
                Definitions
                ----------------------------------------------------------------------

                Amend Rule 478 (Fora) by setting its power to 3, and amending it to
                read:

                      Freedom of speech being essential for the healthy functioning of
                      any non-Imperial nomic, it is hereby resolved that No Player
                      shall be prohibited from participating in the Fora.

                      A Forum's Publicity may be either null, Discussion, or Public
                      (default null).  A forum's publicity may not be changed except
                      as described in this rule.

                      The Herald may change the publicity of a forum without objection
                      as long as:

                      (a) e sends eir announcement of intent to that forum; and

                      (b) if the forum is to be made public, the announcement by which
                          the Herald makes that forum public is sent to all existing
                          public fora.

                      Each active player should ensure e can receive messages via each
                      public forum.

                      The Herald's report shall include a list of all public or
                      discussion fora and sufficient data regarding each to allow
                      players to receive messages via that medium.  The Herald need
                      not keep track of null fora.

                      A message is public if and only if it is sent via a public forum
                      or is sent to all players and contains a clear designation of
                      intent to be public.  A player "publishes" or "announces"
                      something by sending a public message.

                      A player performs an action "by announcement" by announcing that
                      e performs it.  A player performs an action "by private message"
                      to some player by sending an appropriate private message to the
                      specified player.  Any action performed by sending a message is
                      performed at the time date-stamped on that message.


                -------------------------------------------------------------------------

                AMEND Rule 754 (Freedom of Communication) by renaming it "Definition
                Definitions", setting its power to 3, and amending it to read:

                      Regularity of communication being essential for the healthy
                      function of any nomic, it is hereby resolved:

                      (1) A difference in spelling, grammar, or dialect, or the use of
                          a synonym or abbreviation in place of a word or phrase, is
                          inconsequential in all forms of communication, as long as
                          the difference does not create an ambiguity in meaning.

                      (2) A term explicitly defined by the Rules shall be interpreted
                          as having that meaning, as shall its ordinary-language
                          synonyms not explicitly defined by the rules.

                      (3) Any term primarily used in mathematical or legal contexts,
                          and not addressed by previous provisions of this Rule, shall
                          be interpreted as having the meaning it has in those
                          contexts.

                      (4) Any term not addressed by previous provisions of this Rule
                          shall be interpreted as having its ordinary-language
                          meaning.

                      This rule takes precedence over any other rules which dictate
                      terminology or grammar.

                ----------------------------------------------------------------------

                Amend Rule 1023 (Definition of "As Soon As Possible") by renaming it
                "Common Definitions" and amending it to read:

                      The following terms are defined:

                      - Agoran days begin at midnight GMT.  Agoran weeks begin at
                        midnight GMT on Monday.  Agoran months begin at midnight GMT
                        on the first day of each Gregorian month.  Agoran quarters
                        begin when the Agoran months of January, April, July, and
                        October begin.  Agoran years begin when the Agoran month of
                        January begins.

                      - A requirement to perform an action "as soon as possible" is a
                        requirement to perform the action within seven days.

                      - The term "number" shall be interpreted as "real number".

                      - The term "random" shall mean a choice drawn with a process
                        whose probability distribution among the possible outcomes is
                        reasonably close to that required by the Rules, using a
                        uniform distribution if not otherwise specified.

                ----------------------------------------------------------------------

                Rule 1728/11 (Power=2)
                Dependent Actions

                      An action is dependent, or may be performed dependently, if and
                      only if it is an Action Without N Objections or an Action With N
                      Supporters, where N is a nonnegative integer.  The phrase
                      "Without Objection" is synonymous with "Without 1 Objection",
                      and the phrase "With Support" is synonymous with "With 1
                      Supporter".

                      A player may publicly announce eir intent to perform an
                      unambiguously described dependent action.  A player may perform
                      a previously unambiguously described dependent action if and
                      only if:

                      (a)  no more than fourteen days have passed since the
                           announcement of intent to perform the action;

                      (b)  if the action to be performed is an Action Without N
                           Objections, at least four days have passed since the
                           announcement made under (a) of this rule;

                      (c)  either the player who attempts to perform the action is the
                           player who made the announcement under (a) of this rule, or

                           (1)  the player who made the announcement under (a) of this
                                rule did so by a privilege or duty granted em by
                                virtue of holding a rules-defined position; and

                           (2)  the player who attempts to perform the action is the
                                holder of that position when e attempts to perform the
                                action;

                      (d)  the rules explicitly authorise the player to perform the
                           action dependently;

                      (e)  during the time between the announcement made under (a) of
                           this rule and the attempt to perform the action,

                           (1)  if the action is to be performed Without N Objections,
                                fewer than N players have publicly posted objections
                                to the performance of the action; or

                           (2)  if the action is to be performed With N Supporters, at
                                least N players other than the player who made the
                                announcement under (a) of this rule have publicly
                                posted support for the performance of the action;

                      (f)  the announcement made under (a) of this rule specifies
                           whether the action is to be performed Without N Objections
                           or With N Supporters, unless the rules either do not permit
                           the action to be performed Without N Objections or do not
                           permit the action to be performed With N Supporters; and

                      (g)  e announces that e performs the described action.

                      A dependent action is not performed until announced as in (g).

                      A player who posts an objection to the performance of an action
                      may publicly retract eir objection.  If e does so, e shall be
                      deemed not have posted an objection to the performance of that
                      action for the purposes of (e)(1) of this rule.

                      The specification in the rules that an action may be performed
                      dependently does not prohibit performing that action
                      independently if doing so would otherwise be permissible.

                      A rule authorising the performance of a dependent action may
                      restrict the eligibility of players to support or object to that
                      specific action.

                ----------------------------------------------------------------------

                Amend Rule 2124 (Agoran Consent) to read:

                      If the Rules specify that an entity may perform an action with
                      Agoran Consent, then the entity may perform the action by
                      announcement if all of the following are true:

                      (a) e has published eir intent to perform the action,
                          unambiguously describing the action to be performed, at
                          least four days and no more than fourteen days before
                          attempting to perform the action;

                      (b) at least one other player has announced (and not withdrawn)
                          support for the intended action since intent was published;
                          and

                      (c) more players have announced (and not withdrawn) support than
                          have announced (and not withdrawn) objections to the action
                          since the intent was published.

                ----------------------------------------------------------------------

                Amend Rule 1769 (Holidays) to read:

                      A Holiday is a period of time designated as such by the Rules.

                      During a Holiday, no Proposal may be distributed by the
                      Promotor, nor may any Call for Judgement, Judgement, notice of
                      Appeal, Decision of Appeals Boards, or Opinion be published by
                      the Clerk of the Courts; however, if any of the above do take
                      place during the Holiday in violation of this Rule, this Rule
                      does not deprive them of their usual effects.

                      If some Rule requires that an action be done prior to a given
                      time, and that given time falls during a Holiday, or within the
                      72-hour period immediately following that Holiday, then that
                      action need not be done until 72 hours after that Holiday ends.

                      If some Rule bases the time of a future event upon the time of
                      another event, or requires that a Player perform some action
                      within some time of another event, and that other event occurs
                      during a Holiday, the time at which the Holiday ends shall be
                      used instead for the purpose of determining the time of the
                      future event or of the time by which the Player must perform the
                      specified action.

                      This Rule takes precedence over all Rules pertaining to the
                      timing of events, and over all Rules which require Players to
                      perform events before a specified time.

                      The period each year from midnight GMT on the morning of 24
                      December to the beginning of the first Agoran week to begin
                      after 2 January is a Holiday.

                ----------------------------------------------------------------------

                Rule 1750/1 (Power=1)
                Read the Ruleset Week

                      The first Agoran week each year which falls entirely in February
                      is Read the Ruleset Week.  Agorans are encouraged to read the
                      ruleset during Read the Ruleset Week.

                ----------------------------------------------------------------------

                Repeal Rule 459  (Agoran Epochs)
                Repeal Rule 2040 (Switches)
                Repeal Rule 1527 (Unsnarling Tangles)
                Repeal Rule 1478 (Executors and Limited Executors)
                Repeal Rule 1079 (Definition of "Random")
                Repeal Rule 1787 (April Fool's Day)
                Repeal Rule 1870 (Merry Christmas, Agora, And A Happy New Year!)

                Repeal Rule 1661 (The Right of Patronage)
                Repeal Rule 2068 (The Deckmastor)
                Repeal Rule 2112 (Deckmastor's Budget)
                Repeal Rule 2113 (Card Constraints)
                Repeal Rule 2114 (Card Definitions)
                Repeal Rule 2115 (Cards of Power)
                Repeal Rule 2116 (Onepower Cardbook)
                Repeal Rule 2069 (Card Actions)
                Repeal Rule 2106 (Playing Cards)
                Repeal Rule 2074 (Hand Flux)
                Repeal Rule 2075 (Winning Hands)
                Repeal Rule 2083 (Hand Reductions)
                Repeal Rule 2080 (Chip Sources)
                Repeal Rule 2120 (Cashing in One's Chips)
                Repeal Rule 2121 (Cards for Ex-Cards)
                Repeal Rule 2122 (Gaining and Losing Chips)
                Repeal Rule 2123 (Fees)
                Repeal Rule 2104 (Contreras Card Labs)


                ----------------------------------------------------------------------
            """.trimIndent()
        ),
        ProposalData(
            number = ProposalNumber(4867.toBigInteger()),
            title = "Judicial Reform 2.0",
            ai = ProposalAI(BigDecimal("3")),
            author = PlayerName("Goethe"),
            coauthors = persistentListOf(),
            text = """
                Proposal:  Judicial Reform 2.0

                [Only changed rights (R101).]
                [Major philosophical change: Crimes and Infractions become a matter of
                Contract Law.  Not much shorter (a little)].

                The Rulekeepor is hereby requested to place Rules in categories as
                indicated by this Proposal, in the order indicated in this Proposal,
                which may involve the creation of new categories, moving of rules, or
                the deletion of categories.  Some rules are included for reference and
                indication of new placement without being actually amended.


                ======================================================================


                Rename Rule 101 to "Agoran Rights and Privileges" and amend it to
                read:

                      The rules may define persons as possessing specific rights or
                      privileges.  Be it hereby proclaimed that no binding agreement
                      or interpretation of Agoran law may abridge, reduce, limit, or
                      remove a person's defined rights.  A person's defined privileges
                      are assumed to exist in the absense of an explicit, binding
                      agreement to the contrary.  This rule takes precedence over any
                      rule which would allow restrictions of a person's rights or
                      privileges.

                       i. Every person has the privilege of doing what e wilt.

                      ii. Every player has the right to perform an action which is not
                          regulated.

                     iii. Every person has the right to invoke judgement, appeal a
                          judgement, and to initiate an appeal on a sentencing or
                          judicial order binding em.

                      iv. Every person has the right to refuse to become party to
                          a binding agreement.  The absense of a person's explicit,
                          willful consent shall be considered a refusal.

                       v. Every person has the right to not be considered bound by
                          an agreement, or an amendment to an agreement, which e has
                          not had the reasonable opportunity to review.

                      vi. Every player has the right of participation in the fora.

                     vii. Every person has the right to not be penalized more than
                          once for any single action or inaction.

                    viii. Every player besides the Speaker has the right to deregister
                          rather than continue to play.

                    Please treat Agora right good forever.

                ======================================================================
                Contract Law
                ----------------------------------------------------------------------

                Amend Rule 1742 (Agreements between Players) to read:

                      Players may make agreements among themselves with the intention
                      that such agreements will be binding; i.e. that they become
                      parties to the agreement and agree to be bound by the agreement.

                      A CFJ that alleges that a specific person (the Defendant) has
                      broken an agreement is a Civil CFJ, for which the Caller is the
                      Plaintiff.  A CFJ that is not a Civil CFJ is a General CFJ.

                      If the judge of a Civil CFJ finds that the agreement was entered
                      into with the intention that the agreement be binding, and that
                      the agreement has in fact been broken, then e may do any or all
                      of the following:

                         (i) order the defendant to perform according to the agreement
                             or perform substitute acts that would fairly serve the
                             interests of the agreement;
                        (ii) order the other parties of the agreement to perform such
                             acts as may be necessary to preserve fairness and
                             justice;
                       (iii) order that additional ("punitive") penalties or actions
                             be applied to the defendant, if and only if the agreement
                             in question explicitly specifies punitive penalties for
                             the type of breach.

                      If a Civil CFJ is called by anyone who is not party to that
                      agreement, then it lacks standing and shall be dismissed.  A
                      Civil CFJ that specifies multiple defendants, or multiple
                      independent breaches of contract, is improperly made and shall
                      be dismissed.

                      Nothing in this rule shall be construed so as to impair the
                      enforcement of an agreement which requires a Player to violate
                      another agreement.

                ----------------------------------------------------------------------

                Amend Rule 1503 (Crimes and Infractions) by naming it "Rules
                Violations", setting its Power to 3, and amending it to read:

                      In general, the Rules shall be adjudicated as if the Rules were
                      a binding agreement between all Players, entered into by every
                      player as a part of becoming a Player.  An actual or alleged
                      Rule violation shall be treated as the violation of a binding
                      agreement to be bound by the Rule or Rules in question.

                      The proposal, fora, and registration processes shall, prima
                      facie, be considered to be protective of a Player's rights and
                      privileges with respect to making and changing the agreement to
                      be bound by the rules.

                      Other rules may further differentiate the treatment of rules
                      violations from the treatment of violations of other types of
                      agreements.

                ----------------------------------------------------------------------

                Increase the power of Rule 2109 (Agoran Contracts) to 2 and amend it
                to read:

                      There exists a type of binding agreement known as Agoran
                      Contract.  An Agoran Contract may only be created or amended by
                      a Proposal and becomes effective when the Proposal takes effect.

                      Unless otherwise specified in the Rules, all Players are bound
                      by Agoran Contracts and no Player may leave an Agoran Contract
                      while remaining a Player.  The Proposal process shall, prima
                      facie, be considered to be protective of a Player's rights and
                      privileges with respect to agreements.

                      All Rules regulating Contracts that are inconsistent with this
                      Rule are superseded to the extent of such inconsistency.

                      The CotC is required to keep track of all Agoran Contracts.

                ----------------------------------------------------------------------

                Amend Rule 1626 (Applications) to read:

                      An Application is any document, which has been submitted as an
                      Application by some person, to a Player designed by the Rules to
                      receive Applications of that particular type.  The submittor is
                      known as the Application's Sponsor.

                      The Sponsor of an Application may attach the signatures of other
                      persons, or signatories, to the Application at the time e
                      submits it.  The Sponsor may not attach any signature to an
                      Application without first having obtained the explicit consent
                      of the signatory.  A signatory may revoke eir consent, once
                      granted, by informing the Sponsor before submission.

                      Signatures are presumed to have been attached with the consent
                      of the signatory.  This presumption shall be rebutted only by a
                      declaration from the alleged signatory, made within 60 days of
                      the submission of the Application, stating that the signatory
                      did not consent or that e consented and then subsequently
                      revoked eir consent.  The Sponsor bears the burden of proof to
                      show that such a declaration, once made, is false.

                ----------------------------------------------------------------------

                Repeal Rule 2107 (Contracts)
                Repeal Rule 2108 (Contract Maintenance)

                ======================================================================
                Rule Violations
                ----------------------------------------------------------------------

                Amend Rule 1504 (Sentencing Orders) to read:

                      Upon a finding in a Civil CFJ that the defendant has broken one
                      or more Rules, the Trial Judge must execute exactly one of the
                      following types of sentencing orders as punitive damages:

                      (1) Without Objection and with 1 Support, an order the defendant
                          to make a formal apology;
                      (2) Without 2 Objections and with 2 Supporters, an order for the
                          defendant to perform a specified service for the benefit of
                          the Agoran community proportinate to the seriousness of the
                          breach;
                      (3) An order for the Herald to place the defendant in the Chokey
                          for a number of months equal to the power of the highest
                          powered Rule that was broken;
                      (4) If and only if the trial judge finds the defendant to to
                          have acted willfully in breaking the rules, an order for the
                          Herald to place the defendant in the Chokey for twice number
                          of months equal to the power of the highest-powered Rule
                          that was broken;
                      (5) If and only if the judge finds the defendant to have acted
                          egregiously, maliciously, or with a consistent pattern of
                          abuse, with Agoran Consent, an order for the Registrar to
                          deregister the defendant in disgrace (make em lawless).  An
                          order to be made lawless is automatically appealed upon its
                          initial execution.

                      These punishments are considered ranked with "worse" punishments
                      being later in the list.

                      If an attempted sentencing order does not receive the proper
                      support or receives too many objections, the trial judge must
                      execute another type of sentencing order.

                      No other punitive damages may be assessed for Rules violations.

                ----------------------------------------------------------------------

                Amend Rule 908 (Formal Apologies) to read:

                      A sentencing order may require a defendant (hereafter the Ninny)
                      to publish a Formal Apology.

                      A Formal Apology must be at least 200 words, and must explain
                      the Ninny's error, shame, remorse, and ardent desire for
                      self-improvement.  Furthermore, the Order to Apologize may
                      include up to ten Prescribed Words of the Judge's choice, all of
                      which must appear in the Formal Apology.

                      A defendant must obey an Order to Apologize within 72 hours of
                      its execution.

                ----------------------------------------------------------------------

                Amend Rule 1505 (Standard Classes of Crimes and Infractions) to be
                called "Dishonor Rolls" and amend it to read:

                      When the Herald is ordered to place someone in the Chokey, e
                      shall publically award em the patent title "In the Chokey".

                      This title shall be automatically revoked after a length of time
                      indicated by the sentencing order, and the Herald shall announce
                      the revokation.  If a sentencing order is executed against a
                      defendant who already holds this title, the length of time of
                      the new sentencing order shall be added to the time left on any
                      previous ones.

                      A person is considered to be In Disgrace while in the Chokey,
                      between the execution and satisfaction of any sentencing orders
                      binding em, or if deregistered for lawlessness.  A person who
                      leaves the game in disgrace shall be awarded the Patent Title
                      Fugitive by the Herald.  A Player may revoke the title Fugitive
                      from emself as long as e is no longer in Disgrace.  A non-player
                      may have this title revoked by Agoran Consent.

                      The rules may further specify actions prohibited to persons in
                      particular types of disgrace.

                      The Herald is encouraged to publish lists of those in disgrace
                      separate from patent titles of honor, to indicate the disgrace.

                When this Proposal takes effect, all persons who were fugitives when
                this proposal was adopted are hereby awarded the patent title
                Fugitive.

                ----------------------------------------------------------------------

                Repeal Rule 1816 (No Double Jeopardy for Crimes)
                Repeal Rule 1812 (Notices of Infraction)
                Repeal Rule 1814 (Timing of Penalties for Crimes and Infractions)
                Repeal Rule 1505 (Standard Classes of Crimes and Infractions)
                Repeal Rule 2017 (Blots)
                Repeal Rule 1714 (Lawlessness)

                ======================================================================
                Calling for Judgement
                ----------------------------------------------------------------------

                Amend Rule 991 (Invoking Judgement) to read:

                      Any person may request formal resolution of a dispute pertaining
                      to this Nomic by submitting a Call for Judgement (CFJ) to the
                      Clerk of the Courts.  The submission of a CFJ constitutes proof
                      of the existence of such a dispute.

                      A CFJ should be a single clearly-labeled Statement whose truth
                      or falsity can be determined using logical reasoning, assuming
                      perfect knowledge.  A CFJ may be accompanied by Arguments,
                      Evidence, or other related material; the Judge is encouraged,
                      but not required, to take notice of these things.

                ----------------------------------------------------------------------

                Amend Rule 897 (Barring Players from Judgement) to be called "Court
                Procedure" and amend it to read:

                      The Clerk of the Courts shall publish the text of a CFJ, along
                      with any additional material submitted by the Caller and the
                      Defendant if any (including but not limited to Arguments and
                      Evidence), no later than the time e announces the identity of
                      the first Judge assigned to that CFJ.

                      When a Civil CFJ is submitted, the Clerk of the Courts shall
                      publish the text of the CFJ and send a copy of the CFJ to the
                      Defendant's registered e-mail address, if any, and inform the
                      Defendant that e has one week to publish a defense and/or bar a
                      Player from judging as described below.

                      The CotC will not assign a Civil CFJ to a judge until one week
                      has passed since after a publication.  During this time, any
                      evidence or arguments, published or submitted to the CotC by the
                      Defendant with the clear intent of being part of a defense, will
                      become part of the material of that CFJ.

                      A Player Barred from Judging a CFJ is ineligible to Judge that
                      CFJ.

                      When submitting a general CFJ, the Caller may Bar up to three
                      Players from Judging that CFJ.

                      The defendant of a Civil CFJ is automatically barred from
                      judging it. The Plantiff may bar one other Player when e submits
                      the CFJ.  The Defendant may bar one other Player from judging
                      any time before the CFJ is assigned to a judge.

                ----------------------------------------------------------------------

                Amend Rule 2024 (Linked Statements) to read as follows:

                      Linked CFJs are multiple Calls for Judgement that are submitted
                      in a single message and clearly labelled as Linked CFJs.

                      The Clerk of the Courts shall assign a Judge to a set of Linked
                      CFJs, as if they were a single CFJ.  The Judge must be eligible
                      to Judge each of the Linked CFJs, and is simultaneously assigned
                      as Judge of each of the Linked CFJs.

                      A Judge (the first judge) may transfer a CFJ to a second judge
                      by announcement, thus linking the first and second CFJs and
                      unlinking the first CFJ with any it was previously linked to,
                      with the second judge's consent and provided the second judge
                      has not been barred or recused from the first CFJ.

                      The Judge of a set of Linked CFJs shall submit eir Judgement of
                      each of those CFJs in a single message.

                      If one or more Linked CFJs beyond the first are unrelated in
                      subject matter to the first, then a Trial Judge may remand those
                      CFJs to the Clerk of the Courts; e ceases to be Judge of those
                      CFJs.

                      If a Trial Judge is recused from a Linked CFJ, then it ceases to
                      be Linked to any other CFJ.  If a Trial Judge is recused from
                      two or more Linked CFJs in a single message, or if a Trial Judge
                      is simultaneously and automatically recused from two or more
                      Linked CFJs, then those CFJs continue to be Linked to each
                      other, but not to any other CFJs to which the Judge is still
                      assigned.

                      A CFJ made by a person who has previously made five or more CFJs
                      during the same Agoran Week is an Excess CFJ.  The Clerk of the
                      Courts may dismiss any Excess CFJ.

                ----------------------------------------------------------------------

                Repeal Rule 1562 (Excess CFJs).
                Repeal Rule 2025 (Transfer of Jurisdiction).

                ======================================================================
                Selecting a Judge
                ----------------------------------------------------------------------

                Amend Rule 1868 (Selecting a Judge) to read:

                      A CFJ is open if it has not been Judged, or if an outstanding
                      judicial motion pertaining to it has been neither granted nor
                      denied.  A CFJ is closed if it is not open.

                      As soon as possible after becoming aware that an open CFJ has no
                      Judge assigned to it, the Clerk of the Courts shall choose a
                      Player eligible to Judge it, and announce them as its Trial
                      Judge.  That Player remains the Trial Judge of that CFJ until e
                      is recused from it or becomes ineligible to Judge it.

                      Other rules may explicitly delay the timing requirement of
                      making assignments, for example with respect to providing the
                      Defendant with response time in a Civil CFJ.

                ----------------------------------------------------------------------

                Amend Rule 698 (Always an Eligible Judge) to read:

                      (a) Each active player is eligible to judge a given Call for
                          Judgement (CFJ), unless a rule specifically makes em
                          ineligible.

                      (b) If the Clerk of the Courts is required to select a Judge,
                          but after taking all other rules affecting eligibility into
                          account, no player is eligible to judge that CFJ, then:

                          (1) all non-barred players become eligible to judge that
                              CFJ; then

                          (2) if there is still no player eligible to judge, then all
                              barred players, other than the caller emself, become
                              eligible to judge that increasingly annoying CFJ; then

                          (3) if there is still no player eligible to judge, then
                              don't panic.  Somebody's bound to register someday; let
                              em deal with it.

                      (c) This rule takes precedence over other rules concerning who
                          is and is not eligible to judge CFJs.

                ----------------------------------------------------------------------

                Amend Rule 1871 (Turns for All) to read:

                      Whenever a player is selected as Trial Judge of a CFJ, e becomes
                      turned.  Turned players are ineligible to be Trial Judge of any
                      future CFJs.  When a player registers, e is considered turned.

                      Whenever an open CFJ has no Trial Judge assigned to it, and
                      there are no players eligible to be assigned, the Clerk of the
                      Courts shall publish a Notice of Rotation, specifying at least
                      one such CFJ.  Upon such an announcement, all turned players
                      become unturned.

                      The CotC may turn a player e expects to judge CFJs slowly or not
                      at all, without 2 objections.

                      If the Clerk of the Courts errs in good faith by selecting a
                      Player to Judge a CFJ or Appeal who is not eligible to judge
                      that CFJ or Appeal solely because e is turned, then that
                      selection shall stand, unless the Clerk of the Courts points out
                      eir error and makes a new selection before the selected Player
                      returns Judgement.

                ----------------------------------------------------------------------

                Repeal Rule 2032 (Errors in Judge Selection)
                Repeal Rule 1567 (Making Oneself Ineligible to Judge a CFJ)
                Repeal Rule 1568 (Non-active Judges)

                ======================================================================
                Delivering Judgement
                ----------------------------------------------------------------------

                Rule 591/18 (Power=1)
                Legal Judgements

                      The Judge of a CFJ Judges it by submitting eir Judgement to the
                      Clerk of the Courts.  "Decision", "Finding", and "Response" are
                      unambiguous synonyms for "Judgement".

                      For a Trial Judge, a Judgement is exactly one of the following:
                      TRUE, FALSE, or DISMISSED.

                      As soon as possible after receiving a Judgement, the Clerk of
                      the Courts shall publish it, along with any arguments, evidence,
                      or other material included with the Judgement.

                ----------------------------------------------------------------------

                Amend Rule 408 (Late Judgement) to read:

                      For each Judge assigned to a CFJ, eir Deliberation Period begins
                      when the Clerk of the Courts announces eir assignment, and lasts
                      seven days; eir Overtime Period begins when eir Deliberation
                      Period ends, and lasts seven days.

                      During a Judge's Overtime Period, if e has not yet Judged the
                      CFJ, then the Clerk of the Courts may recuse em by announcement.

                      Upon the end of a Judge's Overtime Period, if e has not yet
                      Judged the CFJ, then the Clerk of the Courts shall recuse em by
                      announcement as soon as possible.

                ----------------------------------------------------------------------

                Increase the power of Rule 217 (Judgements Must Accord with the Rules)
                to 3 and amend it to read:

                      All Judgements must be in accordance with the Rules; however, if
                      the Rules are silent, inconsistent, or unclear on the Statement
                      to be Judged, then the Judge shall consider game custom, common
                      sense, past Judgements, and the best interests of the game
                      before applying other standards.

                      When a Judge is considering eir Judgement of a Statement
                      contained in a CFJ, e shall make eir evaluation based on the
                      truth or falsity of the Statement at the time the CFJ was
                      issued.

                ----------------------------------------------------------------------

                Amend Rule 1575 (Standards of Proof) to read:

                      Unless otherwise specified, all Judgements shall be consistent
                      with the preponderance of the evidence.

                      A defendant may not be assessed punitive damages for Rules
                      Violations any worse than a formal apology, unless a Judge finds
                      that evidence for the violation is beyond a reasonable doubt.

                      The published Report of an Officer constitutes prima facie
                      evidence of the truth of those matters reported therein which
                      that Officer is required by law to report.  This presumption may
                      be set aside only by clear and convincing evidence to the
                      contrary.

                ----------------------------------------------------------------------

                Rule 1565/10 (Power=1)
                Dismissal of a CFJ

                      A Judgement of DISMISSED should be delivered if and only if one
                      or more of the following is true:

                        i) The CFJ does not contain a single clearly-identified
                           Statement.

                       ii) After a reasonable effort to obtain all relevant
                           information, the Judge can neither determine the Statement
                           to be true nor determine it to be false.

                      iii) The Statement does not relate to a matter relevant to the
                           Rules.

                       iv) The CFJ lacks standing, as defined elsewhere.

                ----------------------------------------------------------------------

                Rule 1803/2 (Power=1)
                Judicial and Sentencing Orders

                      Judicial Orders and Sentencing Orders are executed by being sent
                      to the Clerk of the Courts, but do not take effect until their
                      publication by the Clerk of the Courts.  The Clerk of the Courts
                      shall publish each Judicial Order and Sentencing Order as soon
                      as possible after receiving it from the Judge who executed it.

                      Any Player may formally request a Judge issue any Judicial Order
                      by filing a motion requesting that Order.  If granted, the Judge
                      shall issue the Order requested.


                ----------------------------------------------------------------------

                Amend Rule 1826 (Motions) to read:

                      A Motion is a formal request made by a Player to the Judge of a
                      CFJ.  A Motion is made by submitting it to the Clerk of the
                      Courts, clearly identifying the CFJ to which the Motion applies.

                      The Clerk of the Courts shall forward each properly-filed Motion
                      to the Judge of the CFJ to which the Motion applies as soon as
                      possible after receiving it.  A Judge must either grant or deny
                      each Motion so forwarded within five days of receiving it.  A
                      Judge grants or denies a Motion by sending eir determination on
                      that Motion to the Clerk of the Courts, along with any reasons e
                      chooses to provide.

                      The effect of granting a Motion depends on its nature, but
                      generally amounts to requiring the Judge to perform as requested
                      by the Motion.

                      Upon receipt of a Judge's determination on a Motion, the Clerk
                      shall note the determination made and the reasons, if any, on
                      the record of the CFJ, and shall notify the Player who made the
                      Motion of that determination.

                      If a Judge fails to Grant or Deny a Motion within five days of
                      when it was forwarded to em by the Clerk of the Courts, the
                      Clerk of the Courts shall Recuse the Judge and assign a new one
                      as usual.

                      If a Motion is made after a case is closed, and the original
                      Judge of that case is not active or is not a player, then a new
                      Judge shall be assigned to the case as usual.

                ----------------------------------------------------------------------

                Rule 1509/4 (Power=1)
                Orders to Compel

                      Upon a judicial finding that a Player has failed to perform a
                      duty required of em by the Rules, the Judge so finding shall
                      execute an Order, requiring that Player to perform that duty as
                      soon as possible.  Such an Order is known as an Order to Compel.

                      If the duty in question arises because the Player in question
                      holds a specific Office or other position of official
                      responsibility, the Order shall be directed to that Office or
                      position.  If the Player holding that Office fails to perform
                      the duty in question as ordered, the Judge shall Order that that
                      Player be removed from Office or position.

                ----------------------------------------------------------------------

                Rule 1830/2 (Power=1)
                No Compulsion of Judges

                      Any Order to Compel directed to a Judge, or requiring the
                      performance of a duty required of a Player because that Player
                      is a Judge, is invalid, unless that Order is a valid Appellate
                      Order.

                      Any CFJ alleging that a Judgement is incorrect, or that a Judge
                      has failed to perform a judicial duty, lacks standing.  Such a
                      claim should instead be pursued via Appeal.

                ----------------------------------------------------------------------

                Amend Rule 789 (Orders to Annotate Rules) to read:

                      The Judge of any CFJ, the Statement of which alleges that a Rule
                      should be interpreted in a certain way, which is judged TRUE,
                      may, at eir discretion, issue an Order requiring the Rulekeepor
                      to annotate the Rule in question with the Statement of that CFJ.
                      Such an annotation, while it exists, shall guide application of
                      that Rule.

                      The Rulekeepor may remove such an annotation only if that Rule
                      is repealed; if required to do so by a valid Order; or if the
                      original Order to annotate is amended, stayed, or vacated.  The
                      Rulekeepor may vacate an Order to annotate a Rule Without
                      Objection.  Annotations to a Rule may not be modified in any way
                      except as specified in this Rule.

                      If a Player believes that an annotation is no longer pertinent,
                      e may file, in the original CFJ from which the Order of
                      Annotation arises, a Motion to Vacate the Order of Annotation.
                      If such a Motion is granted, the Judge granting it shall Order
                      the original Order Vacated and shall Order the Rulekeepor to
                      remove the annotation in question.

                ----------------------------------------------------------------------

                Amend Rule 1365 (Concurring and Dissenting Opinions) to read:

                      Two or more players may submit a Concurring or Dissenting
                      Opinion for a given CFJ trial or appeals decision, via a single
                      application to the Clerk of the Courts signed by all submittors.

                      The opinion must include reference to the CFJ and the particular
                      judgement or appeals decision to which it applies and be
                      accompanied by reasons or arugments for the opinion.

                      The Clerk of the Courts shall publish any properly submitted
                      Opinion and append it to the text of the legal judgement.

                ----------------------------------------------------------------------

                Repeal Rule 1768 (Evidentiary Status of Officer Reports)
                Repeal Rule 451  (Determination of Judgement--Timing)
                Repeal Rule 502 (Salary for Judges)
                Repeal Rule 1827 (Granting or Denying Motions)

                ======================================================================
                Overturning Judgement
                ----------------------------------------------------------------------

                Amend Rule 1564 (Initiating Appeals) to read:

                      The following are subject to Appeal:

                        a) The Judgement of a Trial Judge.
                        b) The grant or denial of a Motion.
                        c) The execution of a Judicial or Sentencing Order.
                        d) A claim that a Trial Judge has failed to perform a required
                           judicial duty.

                      A subject is Appealed when any of the following occurs:

                        i) Three Players Appeal it.
                       ii) A Player Appeals a Judicial or Sentencing Order binding em.
                      iii) A Player Appeals a Trial Judgement convicting em of a
                           Crime.

                      A single subject (e.g. a specific judgement, motion, or order)
                      may only be appealed once.

                      As soon as possible after an Appeal is initiated, or a Player
                      becomes or ceases to be an Appellate judge, the Clerk of the
                      Courts shall announce the event.

                ----------------------------------------------------------------------

                Amend Rule 911 (The Board of Appeals) to read:

                      When an Appeal is initiated, a Board of Appeals shall be
                      selected to reach a decision about the subject of the Appeal.  A
                      Board of Appeals consists of three Appellate Judges.  Any Judge
                      assigned according to this Rule is an Appellate Judge.

                      A Board of Appeals is selected when the Clerk of the Courts
                      correctly announces the identity of all Appellate Judges,
                      determined as follows:

                        a) The Speaker is selected, if eligible.
                        b) The Clerk of the Courts is selected, if eligible.
                        c) Any remaining positions are filled by selection by the
                           Clerk of the Courts from all remaining eligible Players.

                      A Player is ineligible for selection if any of the following is
                      true:

                        i) E has already been selected for that Board.
                       ii) E has been dismissed from that Board.
                      iii) E has been Trial Judge of the subject of the Appeal.
                       iv) E is ineligible to Judge the CFJ at the time of selection.

                      An Appellate Judge may appoint another eligible Player as eir
                      replacement by informing the Clerk of the Courts, provided the
                      Player consents.

                      As soon as possible after an Appellate Judge is recused, the
                      Clerk of the Courts shall randomly select an eligible Player to
                      replace em.

                      The last Appellate Judge selected is the Lead Judge for that
                      Board.  If the Lead Judge is replaced, then the replacement
                      becomes Lead Judge.

                ----------------------------------------------------------------------

                Amend Rule 1447 (Final Judgement upon Appeal) to read:

                      For an Appelate Judge assigned to the Appeal of a Judgement, a
                      Judgement is exactly one of the following: SUSTAIN, REVERSE,
                      REASSIGN, or REMAND.  For the appeal of other matters, a
                      Judgement is exactly one of the following: SUSTAIN or OVERTURN.
                      Other Rules may modify this based on the subject of the Appeal.

                      If a Judgement of TRUE or FALSE is Appealed, the Board of
                      Appeals shall consider the correctness of that Judgement.  If a
                      Judgement of DISMISSED is Appealed, the Board shall not consider
                      the truth or falsity of the original CFJ; they shall only
                      consider whether a Judgement of DISMISSED should have been
                      delivered.

                      If a majority of the Appellate Judges Judge SUSTAIN, then the
                      subject of the Appeal is sustained.  Otherwise, it is
                      overturned.  The Board of Appeals shall execute whatever
                      Appelate Orders are necessary to enforce its determination.

                      When a Judgement is overturned:

                        a) If a majority of the Appelate Judges Judge REVERSE, then
                           the CFJ shall be treated as if it were Judged normally,
                           with the Judgement being that which a majority of the
                           Appelate Judges agree on.

                        b) If a majority of the Appelate Judges Judge REASSIGN, then
                           the original Judgement is ignored, the original Judge is
                           recused, and the Clerk of the Courts shall reassign the CFJ
                           to a new Judge in the same fashion as it was originally
                           assigned.  The new Judge cannot make the same Judgement as
                           the original Judge for the same reason.

                        c) If a majority of the Appelate Judges Judge REMAND, then the
                           original Judgement shall be ignored, and the Clerk of the
                           Courts shall reassign the CFJ to the original Judge as if
                           it were being originally assigned. The Judge may not make
                           the same Judgement for the same reason.

                        d) If none of the above is true, then the CFJ shall be
                           reassigned as described above.

                      As soon as possible after all members of a Board of Appeals have
                      submitted eir Judgement, the Clerk of the Courts shall announce
                      that this has happened.

                ----------------------------------------------------------------------

                Amend Rule 1804 (Appeal of Judicial and Sentencing Orders) to read:

                      As soon as possible after a Judicial Order or Sentencing Order
                      is Appealed, the Clerk of the Courts shall stay it.  If the
                      Appeal is sustained, then the Board of Appeals shall vacate this
                      stay as soon as possible.  If the Appeal is overturned, then the
                      Board of Appeals shall vacate the stayed Order as soon as
                      possible.

                      In the Appeal of a Judicial Order or Sentencing Order, the Board
                      of Appeals shall consider whether the Order was properly and
                      validly executed.

                ----------------------------------------------------------------------

                Amend Rule (Appellate Orders) to read:

                      Appellate Orders are executed by being sent to the Clerk of the
                      Courts by the Lead Judge of a Board of Appeals, but do not take
                      effect until their publication by the Clerk of the Courts.  The
                      Lead Judge must certify in the execution that the order is
                      executed by the concurrence of the majority of the Justices
                      comprising that Board of Appeals; failure to do so deprives the
                      Order of effect.

                      Appellate Orders are not subject to appeal.  However, upon a
                      judicial finding that the required certification was falsely
                      provided, the Clerk of the Courts shall vacate the Order which
                      was accompanied by that false certification.

                      Appellate Orders are valid only if addressed to:
                        a) The Clerk of the Courts in eir Official capacity;
                        b) an Order issued by the Clerk of the Courts in eir Official
                           Capacity;
                        c) The Judge of the CFJ which that Board of Appeals was
                           convened to consider, or any Order issued by that Judge in
                           that particular CFJ; or
                        d) any combination of the above.
                      All other Appellate Orders are presumptively invalid.

                      The Clerk of the Courts shall publish each Appellate Order as
                      soon as possible after receiving it from the Board of Appeal
                      which executed it.

                      This Rule takes precedence over all Rules pertaining to the
                      validity of Appellate Orders.

                ----------------------------------------------------------------------

                Repeal Rule 1570 (Announcement of Appeal)
                Repeal Rule 2026 (Appellate Determinations).
                Repeal Rule 1693 (Appeal of a Judgement).
                Repeal Rule 1806 (No Appeal of Appellate Orders)
                Repeal Rule 1807 (Validity of Appellate Orders)

                ----------------------------------------------------------------------

                ======================================================================
                Orders
                ----------------------------------------------------------------------

                Amend Rule 1793 (Orders) to read:

                      An Order is a command, executed by a player and directed to some
                      entity requiring that entity to perform exactly one action, or
                      to refrain from performing one or more actions.

                      An Order may be directed to the holder of an official position
                      in eir capacity in that official position, and if the position
                      changes hands before the Order is satisfied, the duty to abide
                      by the Order automatically attaches to the new holder of that
                      position.

                      An Order may also be directed at a prior order so as to affect
                      the prior order's operation, as the Rules permit.

                      All Orders executed in the manner prescribed by the Rules for
                      their class are presumed valid and enforceable until proven
                      otherwise by CFJ.


                ----------------------------------------------------------------------

                Amend Rule 1794 (Classes of Orders) to read:

                      Each Order is of exactly one of the following classes.  If an
                      Order could be of more than one of these classes, then it is of
                      the first class that matches.

                        (a) A Legislative Order is an Order executed as part of the
                            effect of the adoption of a Proposal.

                        (b) An Appellate Order is an Order executed by a Board of
                            Appeals.

                        (c) A Judicial Order is an Order executed by a Judge in the
                            course of performing eir duties or privileges as Judge.

                        (d) A Timing Order is an Order which may be executed by any
                            person and directed at any entity.  A timing order is
                            valid if and only if it orders the entity to perform, as
                            soon as possible, a duty specifically required of em by
                            the Rules that does not otherwise have a specified timing
                            requirement, or for which the otherwise specified timing
                            requirement will have been exceeded as soon as possible
                            after the Order is executed.

                      No other types of Orders are valid.

                ----------------------------------------------------------------------

                Amend Rule 1795 (Order Timing) to read:

                      An Order may specify the time limit for the performance of an
                      ordered action.  If a time limit is less than 72 hours after the
                      Order takes effect, the time limit shall be 72 hours.  If no
                      time limit is specified, time limit shall be as soon as possible
                      after the Order takes effect.

                      If an Order which commands the performance of an action is
                      directed to an Office or other position of authority, and the
                      holder of that position of authority changes after the Order
                      takes effect, but before the Order is satisfied, then the
                      current holder shall have as soon as possible to satisfy that
                      order.

                      The noncompliance of an order with this Rule does not deprive
                      that order of all effect, but instead modifies the timing
                      requirements of the order.

                ----------------------------------------------------------------------

                Amend Rule 1799 (Stay and Vacation of Orders) to read:

                      The effect of staying an Order is to temporarily prevent the
                      stayed Order from having any effect.

                      A stay may be specified to expire after a fixed time.  If no
                      specification is made in the Order to Stay, the stay shall not
                      expire.

                      When the stay expires or is vacated, the previously stayed order
                      again has effect as if it had been originally executed at the
                      moment the stay ceases to be effective.  However, if at the time
                      the staying Order expires or otherwise ceases to have effect,
                      the stayed Order has been vacated or is subject to another
                      staying Order, it does not regain effect.

                      The effect of vacating an Order is to permanently deny the
                      vacated Order from having any effect.  Vacating an Order to
                      Vacate reinstates the ability of the vacated Order to have
                      effect, as of the moment the Order to Vacate is itself vacated.

                      Any Order may always be stayed or vacated by the Player (or, in
                      the case of Appellate Orders, Board of Appeal) who executed it.
                      Certain classes of Orders may be stayed or vacated in other
                      circumstances as well, but only as the Rules allow.

                ----------------------------------------------------------------------

                Amend Rule 1810 (Satisfying Orders) to read:

                      An Order requiring an entity to perform an action is satisfied
                      when that entity performs that action.  Other Rules may define
                      other ways for Orders to be satisfied.  Except when otherwise
                      specified, a single action can result in the satisfaction of at
                      most one Order.  If an action would satisfy more than one Order,
                      and no other specification is made, the Action satisfies the
                      oldest Order which it would satisfy.

                      Willfully performing contrary to valid orders, either through
                      action or inaction, is a violation of this Rule.

                ----------------------------------------------------------------------
            """.trimIndent(),
        ),
        ProposalData(
            number = ProposalNumber(4868.toBigInteger()),
            title = "Red Tape Repeals 2.0",
            ai = ProposalAI(BigDecimal("3")),
            author = PlayerName("Goethe"),
            coauthors = persistentListOf(),
            text = """
                Proposal:  Red Tape Repeals 2.0

                [Minor Wording changes from Maud from v1.0 to 2.0]
                [Cut bureaucracy to 5: Speaker, Herald, Promotor, Rulekeepor, CotC.
                (assumes cards are killed elsewhere).  Turns elections into actions of
                Agoran Consent.  Simplifies some wording in Proposals section,
                eliminates chambers, makes Speaker the vote collector in place of the
                Assessor]

                The Rulekeepor is hereby requested to place Rules in categories as
                indicated by this Proposal, in the order indicated in this Proposal,
                which may involve the creation of new categories, moving of rules, or
                the deletion of categories.  Some rules are included for reference and
                indication of new placement without being actually amended.

                --------------------------------------------------------------------

                Amend Rule 2124 (Agoran Consent) to read:

                      An entity that may perform an action with Agoran Consent can do
                      so by announcement if all of the following are true:

                      (a) e has published eir intent to perform the action,
                          unambiguously describing the action to be performed, at
                          least four days and no more than fourteen days before
                          attempting to perform the action;

                      (b) at least one other player has announced (and not withdrawn)
                          support for the intended action since intent was published;
                          and

                      (c) more players have announced (and not withdrawn) support than
                          have announced (and not withdrawn) objections to the action
                          since the intent was published.

                ======================================================================
                Offices
                ----------------------------------------------------------------------

                Rule 103/1 (Power=3)
                The Speaker May Not Deregister

                      At any time, there is exactly one Player who is the Speaker. The
                      Speaker may not deregister or be deregistered for any reason,
                      any other Rule to the contrary notwithstanding.

                ----------------------------------------------------------------------

                Amend Rule 402 (Church and State) to read:

                      A cardinal is an active, ready player who is not the current
                      Speaker.

                      For seven days after a cardinal wins the game with no other
                      players simultaneously winning, then any player may announce
                      that the winning cardinal becomes a pope.  Upon this
                      announcement, that player becomes a pope, so please treat em
                      right good forever.  Also upon this announcement, the current
                      Speaker ceases to be Speaker, and the new pope is installed as
                      the new Speaker.

                      If the legality of an installation is not challenged within
                      seven days of it being attempted, then it shall be allowed to
                      stand, even if is subsequently found to be illegal.

                      Rules to the contrary nonwithstanding, if a Player becomes
                      Speaker via this method, e may not be removed from the
                      Speakership for 90 days without eir own consent.

                ----------------------------------------------------------------------

                Amend Rule 1006 (Offices) to read:

                      The Rules may designate positions to be offices.  No office may
                      be held by more than one player.  Each office that would
                      otherwise not be held by any player shall be held by the
                      Speaker, unless it is not possible for the Speaker to hold that
                      office.

                      The holder of an office may be referred to by the name of the
                      office.  The Herald shall list the holder of each office, and
                      the date upon which each holder last came to hold that office.

                      Any Player may make an active Player the holder of an office,
                      thus removing any previous holder from the office, with Agoran
                      Consent, provided:
                      (a) that office has not changed hands with this method in the
                          previous 30 days, and
                      (b) the potential officer consents to hold the office after the
                          announcement of intent is made.

                      If no attempt to acheive Agoran Consent for changing the holder
                      of particular office is announced in a given quarter, then the
                      Speaker shall make at least one such attempt to change the
                      officeholder in the following quarter, and make the change if
                      consent is acheived.

                      If the duty of an office is to maintain certain information,
                      than the officer shall publish that information once a month, or
                      as soon as possible after a substantial change occurs in the
                      information or the officer receives a request for the
                      information.  A weekly report shall be sufficient to satisfy
                      these last two requirements.

                      If an Officer or the Speaker fails to satisfy a Timing Order to
                      perform a certain offical duty, than the player who executed the
                      order may perform the duty as if e were the officer.

                ----------------------------------------------------------------------

                AMEND Rule 1551 (Ratification) to read:

                      An officer is permitted to ratify, without objection, an
                      official report e produced and was required to maintain by
                      virtue of holding that office.  The Speaker is permitted to
                      ratify, without objection, any official report.

                      When a document is ratified, the gamestate is modified so that
                      the ratified document was completely true and accurate at the
                      time it was published.  Nevertheless, the ratification of a
                      document does not invalidate, reverse, alter, or cancel any
                      messages or actions, even if they were unrecorded or overlooked,
                      or change the legality of any attempted action.

                      A document's maintainer shall annotate all publications of that
                      document with the date of its most recent ratification.

                ----------------------------------------------------------------------

                Amend Rule 1377 (The Herald) to read:

                      The Herald is an office; its holder is responsible for keeping
                      track of the History of Agora and its players.

                      The Herald's Weekly Report shall include the following:

                         (i) A list of each Patent Title and Degree that at least one
                             person Bears, with a list of which persons Bear it.

                        (ii) a list of all registered players, with their nicknames,
                             if any, and listed email addresses;

                       (iii) the most recent date on which each registered player
                             registered;

                        (iv) the current Officers and their dates of service.

                ----------------------------------------------------------------------

                Rule 1051/17 (Power=1)
                The Rulekeepor

                      The Rulekeepor is an office; its holder is responsible for
                      maintaining the text of the rules of Agora.

                      The Rulekeepor's Weekly Report shall include the Short Logical
                      Ruleset.  The Rulekeepor's Monthly Report shall include the Full
                      Logical Ruleset.

                ----------------------------------------------------------------------

                Amend Rule 1681 (The Logical Rulesets) to read:

                      There is a format of the ruleset known as the Short Logical
                      Ruleset (SLR).  In this format, each rule is assigned to a
                      category, and the rules are grouped according to their category.

                      Rules are assigned to, ordered within, or moved between
                      categories, and categories are added, changed, or empty
                      categories removed, as the Rulekeepor sees fit.

                      The listing of each rule in the SLR must include the rule's
                      number, revision number, power, title, and text, and must also
                      include any annotations to the rule required by order.

                      The Rulekeepor is strongly encouraged not to include any
                      additional information in the SLR, except that which increases
                      the readability of the SLR.

                      There is a format of the ruleset known as the Full Logical
                      Ruleset (FLR).  In this format, rules are assigned to the same
                      category and presented in the same order as in the SLR.  The FLR
                      must contain all the information required to be in the SLR, and
                      any historical annotations which the Rulekeepor is required to
                      record.

                      The Rulekeepor is also free to include any other information
                      which e feels may be helpful in the use of the ruleset in the
                      FLR.

                      Whenever a rule is changed in any way, the Rulekeeper shall
                      record a historical annotation to the rule indicating the type
                      of change, the date on which the change took effect, the
                      mechanism which specified the change, and if the rule was
                      changed due to a proposal, a reference to that proposal, its
                      proposer, and any coauthors explicitly named in that proposal.


                ----------------------------------------------------------------------

                Rule 889/13 (Power=1)
                The Clerk of the Courts

                      The Clerk of the Courts (CotC) is an office; its holder is
                      responsible for receiving and distributing Calls for Judgement
                      (CFJs) and Appeals.

                      The CotC's Bi-Weekly Report shall include the following:
                         (i) Each Player's Orientation.

                      The CotC's Monthly Report shall include the Stare Decisis, which
                      is a list of past CFJs.  The following information shall be
                      included for each CFJ:

                        (i) its statement;
                       (ii) the date on which it was called;
                      (iii) its outcome (if any) on Judgement; and
                       (iv) its outcome (if any) on Appeal.

                      Whenever a CFJ is made, the CotC shall add it to the list.  E
                      may, at eir discretion, add earlier CFJs.  E may Without
                      Objection remove any CFJ e deems no longer relevant from the
                      list.

                ----------------------------------------------------------------------

                Amend Rule 1607 (The Promotor) to read:

                      The Promotor is an office; its holder is responsible for
                      receiving and distributing proposals.

                      The Promotor is permitted to distribute a proposal in the
                      Proposal Pool at any time.  During each week, the Promotor must
                      distribute each proposal in the proposal pool which was in the
                      Proposal Pool at the beginning of the week.

                      The Promotor legally distributes a proposal by publishing it
                      accompanied by an explicit indication that it is being
                      distributed.  When a proposal is distributed, it is removed from
                      the Proposal Pool.  The distribution of a proposal initiates the
                      Agoran decision of whether to adopt the proposal, as described
                      elsewhere.

                      The Promotor shall include with the distribution of each
                      proposal the identity of its proposer, the proposal's coauthors,
                      if any, its chamber, and its adoption index.  However, the
                      failure of the Promotor to include any of these with a proposal
                      does not deprive the distribution of the proposal of any legal
                      effect.

                --------------------------------------------------------------------

                Amend Rule 1450 (Judicial Separation) by renaming it 'Separation of
                Powers', increasing its power to 2, and amending it to read:

                      The Speaker, Clerk of the Courts, and Promotor are mutually
                      exclusive offices.  A Player holding one of these offices may
                      not come to simultaneously hold another of them, unless there
                      are no other Players in the game eligible.  This Rule takes
                      precedence over any other Rule that governs offices.

                ----------------------------------------------------------------------

                Repeal Rule 910 (The Justiciar)
                Repeal Rule 2023 (Submitting a CFJ to the Justiciar)
                Repeal Rule 2098 (Power=1)  May Day
                Repeal Rule 1686 (Power=1) Official Reports
                Repeal Rule 1431 (Power=1) Claims of Error
                Repeal Rule 559 (The Registrar).
                Repeal Rule 1919 (Power=2) Installing Officers through Proposal
                Repeal Rule 1555 (Power=1) Electees and Removal from Office
                Repeal Rule 1556 (Power=1) Terms of Service for Offices
                Repeal Rule 1758 (Power=1) Holding an Office in Perpetuity
                Repeal Rule 880  (Power=1) Resignation
                Repeal Rule 1764 (Modes of Nomination)
                Repeal Rule 1645 (Power=1) Temporary Delegation of Office
                Repeal Rule 790  (Power=1) Filling Vacant Offices
                Repeal Rule 1486 (Power=1) Procedure for an Orderly Witch Hunt
                Repeal Rule 1665 (Power=1) Abuse of Responsibility
                Repeal Rule 1585 (Power=2) Official Duties upon Officer Change
                Repeal Rule 1553 (Power=1) Officer Transition
                Repeal Rule 1664 (Power=2) Rebellion
                Repeal Rule 1988 (Power=2) Bastille Day
                Repeal Rule 1840 (Power=2) Political Status
                Repeal Rule 1975 (Power=1) The Associate Director of Personnel
                Repeal Rule 1940 (Power=1) Periodic Compensations
                Repeal Rule 1932 (Power=2) Shareholders and the Corporation
                Repeal Rule 947  (Power=1) Bonus for Repeal
                Repeal Rule 2095 (Power=1) The Assessor's Boon Duties
                Repeal Rule 2111 (Power=1) Hard Ruleset Limits
                Repeal Rule 2118 (Power=1) Nominations for Election
                Repeal Rule 1445 (Power=1) Defaults for Elections
                Repeal Rule 1558 (Power=1) Defaults for Elections for Offices
                Repeal Rule 1957 (Power=1) Budgets
                Repeal Rule 1958 (Power=1) Nominating with Budgets
                Repeal Rule 1659 (Power=1) The Right to Call Elections
                Repeal Rule 1485 (Titles for Rules)
                Repeal Rule 1430 (Mandatory Rule Annotations)
                Repeal Rule 514  (Keep the Registrar Informed of Your Address)
                Repeal Rule 1670 (The Distributor)
                Repeal Rule 2073 (Quis Custodiet Ipsos Custodes?)
                Repeal Rule 2097 (Card-Carrying Contracts)
                Repeal Rule 681  (Conclaves)

                ======================================================================
                Agoran Decisions
                ----------------------------------------------------------------------

                Amend Rule 693 (Power=3) Agoran Decisions to read:

                      When the rules calls for an Agoran decision to be made, the
                      decisionmaking process takes place in the following three
                      stages, each described elsewhere:

                          (a) Initiation of the decision.
                          (b) Voting of the people.
                          (c) Resolution of the decision.

                ----------------------------------------------------------------------

                Amend Rule 107 (Initiating Agoran Decisions) to read:

                      An Agoran decision is initiated when a person authorized to
                      initiate it publishes a valid notice which sets forth the intent
                      to initiate the decision.  To be valid, this notice must contain
                      the following information:

                      (a) The matter to be decided (for example, "the adoption of
                          proposal 4781").

                      (b) A description of the class of eligible voters sufficient to
                          enable public agreement on which persons are eligible.  In
                          particular, an explicit list of the eligible voters is
                          always sufficient for this purpose.

                      (c) The identity of the vote collector.

                      (d) Any additional information required by the rules for this
                          announcement.

                      The publication of such a valid notice initiates the voting
                      period for the decision.  By default, the voting period lasts
                      for seven days.  This rule takes precedence over any rule which
                      would require a voting period for some decision to be shorter
                      than seven days.

                ----------------------------------------------------------------------

                Rule 683/12 (Power=3)
                Voting on Agoran Decisions

                      An eligible voter on a particular Agoran decision submits a
                      ballot to the vote collector by publishing a valid notice
                      indicating which one of the available options e selects.  To be
                      valid, the ballot must satisfy the following conditions:

                      (a) The ballot is submitted by an eligible voter during the
                          voting period for the decision.

                      (b) The ballot clearly identifies the matter to be decided.

                      (c) The ballot clearly identifies the option selected by the
                          voter.

                      (d) The voter has not publicly retracted the ballot during the
                          voting period.

                      The strength of an option is the number of valid ballots
                      selecting that option.

                      Other rules may place further constraints on the validity of
                      ballots.  This rule takes precedence over any rule that would
                      loosen the constraints specified by this rule.

                ----------------------------------------------------------------------

                Rule 2117/0 (Power=3)
                Replacing the Vote Collector

                      If the rules indicate that an office is to be responsible for
                      collecting votes on a particular Agoran decision, then the
                      holder of that office is the default vote collector for that
                      decision.

                      The vote collector for a particular Agoran decision is tardy if
                      and only if the voting collector has continuously held that role
                      for at least seven days following the end of the voting period
                      and the decision has not yet been resolved.  If a vote collector
                      is tardy, then the first player to announce that e takes up the
                      role of vote collector becomes the vote collector for that
                      decision.

                      This rule takes precedence over any rule that would allow the
                      vote collector for an Agoran decision to be changed.

                ----------------------------------------------------------------------

                Amend Rule 1950 (Voting Limits) to read:

                      The voting limit of an eligible voter on a democratic proposal
                      is always one and cannot be changed.

                      The voting limit of an eligible voter on an ordinary proposal is
                      one, if not explicitly modified by other rules.

                      After the voting period for an Agoran decision has ended, the
                      vote collector shall permit the first valid ballots submitted by
                      an eligible voter to remain valid, up to a number equal to that
                      person's voting limit on that decision as determined when the
                      voting period for that decision began, and shall invalidate all
                      subsequent ballots submitted by that voter on that decision.

                ---------------------------------------------------------------------

                Rule 208/3 (Power=3)
                Resolving Agoran decisions

                      The vote collector for a particular Agoran decision is
                      authorized to resolve that decision, and does so by publishing a
                      valid notice which states that the matter has been resolved,
                      indicating the option selected by Agora.  To be valid, this
                      notice must satisfy the following conditions:

                      (a) It is published after the voting period has ended.

                      (b) It clearly identifies the matter to be resolved.

                      (c) It clearly identifies the options available.

                      (d) It specifies which option was selected by Agora, as
                          described elsewhere, and provides a tally of the voters'
                          valid ballots on the various options.

                      Each Agoran decision shall have at most one vote collector at a
                      time.  The identity of the vote collector is set by the message
                      initiating the decision, and can only be changed as specified by
                      other rules with power at least as great as that of this rule.

                      This rule takes precedence over any rule that would provide
                      another mechanism by which an Agoran decision may be resolved.

                ----------------------------------------------------------------------

                Amend Rule 955 (Determining the Will of Agora) to read:

                      To determine which option on a particular Agoran decision was
                      selected by Agora, the vote collector shall perform the
                      following steps in order after the voting period has ended.

                      (a) E shall invalidate any ballots which the rules require em to
                          invalidate, and no others.

                      (b) E shall count the number of distinct voters who submitted
                          ballots which remain valid.  If this number is less than the
                          quorum and there is more than one available option, then the
                          option selected by Agora is FAILED QUORUM.  Otherwise, the
                          decision achieved quorum.

                      (c) If the decision is whether to adopt a proposal, e shall
                          determine the voting index as follows:

                          (1) if the strength of FOR is positive and the strength of
                              AGAINST is zero, then the voting index is Unanimity; but

                          (2) if the strength of FOR is zero, then the voting index is
                              zero; otherwise,

                          (3) the voting index is the ratio of the strength of FOR to
                              the strength of AGAINST.

                          If the voting index exceeds one and meets or exceeds the
                          adoption index of the decision, and if further quorum was
                          achieved, then the option selected by Agora is ADOPTED.
                          Otherwise, the option selected by Agora is REJECTED.

                ----------------------------------------------------------------------

                Rule 879/22 (Power=2)
                Quorum

                      The quorum for an Agoran decision is one third the number of
                      eligible voters, rounded up, with a minimum of five (unless
                      there are fewer than five eligible voters, in which case the
                      quorum level is the number of eligible voters).

                -----------------------------------------------------------------------

                Rule 2034/2 (Power=3)
                Vote Protection and Cutoff for Challenges

                      Any proposal that, as all or part of its effect, would change
                      the validity of one or more of a voter's ballots on an Agoran
                      decision whose voting period has begun but which has not yet
                      been resolved shall be wholly without effect, any rule to the
                      contrary notwithstanding.

                      Once an Agoran decision has been resolved, no ballots on that
                      decision may be validly submitted or retracted, and the outcome
                      of the decision may not be changed in any way, any rule to the
                      contrary notwithstanding.  Nothing in this rule shall be
                      construed as preventing the correction of errors in reporting
                      the resolution of an Agoran decision.

                      If the success of the resolution of an Agoran decision is not
                      challenged within one week from the time the vote collector
                      announces it, then the announced result is the true result of
                      that decision, even if it would otherwise be in error.

                ----------------------------------------------------------------------

                Repeal Rule 1434 (Default Procedure for Referendum Voting)

                ======================================================================
                Proposals
                ----------------------------------------------------------------------

                Amend Rule 106 (Adopting Proposals) to read:

                      A proposal is a document outlining changes to be made to Agora,
                      including enacting, repealing, or amending rules, or making
                      other explicit changes to the gamestate.

                      A player submits a proposal by publishing it with a clear
                      indication that it is intended to become a proposal, which
                      places the proposal in the Proposal Pool.  The proposer of a
                      proposal may remove it from the Pool by announcement.

                      Determining whether to adopt a proposal is an Agoran decision.
                      For this decision, the available options are FOR, AGAINST, and
                      PRESENT, and by default, the eligible voters are the active
                      players, the adoption index is the adoption index of the
                      proposal, and the vote collector is the Speaker.

                      The default adoption index of a proposal is one.  Before the
                      Promotor distributes a proposal, its proposer may modify its
                      adoption index by announcement.  A Proposal with an Adoption
                      Index of 1 is Ordinary.  All other Proposals are Democratic.

                      If the option selected by Agora on this decision is ADOPTED,
                      then the proposal is adopted, and unless other rules prevent it
                      from taking effect, its power is set to the minimum of four and
                      its adoption index, and then it takes effect.  It does not
                      otherwise take effect.  This rule takes precedence over any rule
                      which would permit a proposal to take effect.

                ----------------------------------------------------------------------

                Rule 1698/0 (Power=3)
                The Proposal System Is Protected

                      It must always be possible to adopt Proposals within a 4 week
                      period. Any change to the game state which would result in
                      this condition becoming false is cancelled and does not take
                      place, any Rule to the contrary notwithstanding.

                      No enactment, repeal, or amendment of the text or substantive
                      properties of a Rule may have retroactive application.

                ----------------------------------------------------------------------

                Amend Rule 105 (What Is a Rule Change?) to be called "Rule Changes"
                and amend it to read as follows:

                      A proposal generally can, as part of its effect:

                      (a) Enact a rule.  When a rule is enacted, the Rulekeepor shall
                      assign it a number, which must be greater than any number
                      previously assigned.  If the enacting proposal does not specify
                      the power, the rule shall have power equal to one.  If the
                      proposal specifies the power, then the rule shall have power
                      equal to the minimum of four, the power of the proposal, and the
                      power specified by the proposal.  If the title is not specified,
                      the Rulekeepor may select any title e sees fit.

                      (b) Modify the power, title, or text of a rule.  A Proposal can
                      modify the power, title, or text of a rule with power no greater
                      than its own.  However, a proposal cannot cause a rule to have
                      power greater than its own.  Any ambiguity in a modification
                      specified by a proposal causes that modification to be void and
                      without effect.  A variation in whitespace or capitalization in
                      the quotation of an existing rule does not constitute ambiguity
                      for the purposes of this rule, but any other variation does.

                      (c) Repeal a rule.  When a proposal repeals a rule, it ceases to
                      be a rule, and the Rulekeepor need no longer maintain a record
                      of it.

                      This rule provides the only mechanism by which rules can be
                      enacted, modified, or repealed.

                ----------------------------------------------------------------------

                Rule 1891/0 (Power=1)
                Legislative Orders

                      (a) A Proposal may contain one or more Orders.

                      (b) The effect of adopting a Proposal which contains Orders is
                          to execute those Orders.  Such Orders are known as
                          Legislative Orders, are deemed to have been executed by that
                          Proposal, and are deemed to have been executed as of the
                          date of the proclamation of the Proposal's adoption.

                      (c) Legislative Orders may not be stayed, vacated, or amended
                          except:
                        (1) by a subsequent Legislative Order;
                        (2) by a Judicial Order issued only after a judicial finding
                            that the Proposal containing the Legislative Order was not
                            adopted, was barred from taking effect, or was invalid; or
                        (3) by the Clerk of the Courts, but only for the purpose of
                            staying such an Order during the pendency of a dispute
                            which might reasonably lead to a judicial finding of the
                            sort mentioned in subdivision (c)(2) of this Rule.

                ----------------------------------------------------------------------

                Rule 2019/5 (Power=2)
                The Speaker's Veto

                      The Speaker may veto an Ordinary Proposal in its voting period
                      by announcement.  Whenever a proposal is vetoed, its quorum is
                      set to the current number of eligible voters on that proposal
                      plus one, other rules governing quorum notwithstanding.

                      As soon as possible after a vetoed proposal fails quorum, the
                      Assessor shall place a copy of that proposal to the Proposal
                      Pool.  When e does so, that copy shall become distributable and
                      democratic, and its adoption index shall be increased by one.

                      The Speaker may Rubberstamp an Ordinary Proposal in its voting
                      period by announcement.  Quorum for a rubberstamped ordinary
                      proposal is three, other rules governing quorum nonwithstanding.

                ----------------------------------------------------------------------

                Repeal Rule 594  (Enactment of Rules)
                Repeal Rule 1322 (Modification of Rules)
                Repeal Rule 2119 (Repeal of Rules)
                Repeal Rule 1483 (Definition of Proposals)
                Repeal Rule 1003 (No Coercive Proposals)
                Repeal Rule 108  (When May Rule Changes Take Effect?)
                Repeal Rule 1770 (Distributing Proposals)
                Repeal Rule 1774 (Discarding Proposals from the Pool)
                Repeal Rule 1449 (The Assessor)
                Repeal Rule 1933 (A Proposal's Chamber)
                Repeal Rule 2045 (Adoption Indices)
                Repeal Rule 1952 (Making Proposals Distributable)
                Repeal Rule 1690 (Power of New Rules)
            """.trimIndent(),
        ),
    ),
    "OFF:[Promotor] Distribution of Proposal 4846" to listOf(
        ProposalData(
            number = ProposalNumber(4846.toBigInteger()),
            title = "Pragmatize hand limits",
            ai = ProposalAI(BigDecimal("1")),
            author = PlayerName("Goethe"),
            coauthors = persistentListOf(),
            text = """
                Proposal:  Pragmatize hand limits

                [Turns hand limits into a play-and-discard model.  You can draw 3
                cards/month+bonuses regardless of handsize, but every month your
                handsize is reduced to max.  You can do it yourself or if you don't,
                the deckmastor will do it for you at random.]

                Repeal Rule 2074 (Hand Flux)

                Amend Rule 2069 (Card Actions) by removing the following text:

                              , plus one for each free pending draw for that
                          gambler


                Amend Rule 2080 (Basic Draws) to read:

                      Any Player may draw up to three cards in a single month by
                      announcement.

                      Any Player may draw one card for each Proposal e proposes that
                      is adopted, by noting the Proposal's number.


                Amend Rule 2120 (Satisfying Draws) to read:

                      When a gambler draws a card as specified by the Rules, e gains a
                      Pending Draw.

                      As soon as possible after a gambler draws a card, the Deckmastor
                      shall satisfy the draw by dealing a card to the gambler with the
                      pending draw, but only if the draw is Satisfiable.  A draw is
                      satisfiable unless defined otherwise.

                      If the Rules state that a gambler loses a pending draw, than
                      that draw is considered satisfied without the dealing of a card,
                      whether or not it is satisfiable.  If e has no draws, the
                      Deckmastor shall discard a random card from that gambler's hand.
                      If e has no cards, then the deckmastor shall satisfy the next
                      pending draw e gains without dealing a card.

                      A satisfied draw is no longer pending.


                Amend Rule 2075 (Winning Hands) to read:

                      The Scoring Instructions contained in cardbooks, interpreted
                      collectively, may define a nonsite gambler as holding a winning
                      hand at a particular moment.  If so, any Gambler has 72 hours
                      from that moment to announce that a Gambler holds or has held a
                      winning hand.

                      If the announcement is false, the Deckmastor shall, as soon as
                      possible, transfer 1 card at random from the announcing
                      Gambler's Hand to the Deck.

                      If the announcement is true, the holding Gambler Wins the Game,
                      and is awarded the boon of Pokerface and the defined regular
                      Patent Title Champion.  All Players' hands become subject to a
                      Hand Reduction to the Minimum Hand Size.  After the winner's
                      hand is so reduced, e gains a number of pending draws equal to
                      the Maximum Hand Size.

                      If no true announcement of a winning hand or a Skunk has been
                      made in the last six months, then any Gambler may announce a
                      Skunk, which shall trigger the effects of a true announcement of
                      a win above, except that no boon shall be awarded nor extra
                      winner's cards dealt.

                ----------------------------------------------------------------------

                Amend Rule 2083 (Win Resolution) by changing its title to
                "Hand Reductions" and amending to read:

                      The Rules may declare that a nonsite Gambler's hand is subject
                      to a Hand Reduction.  A particular hand reduction must have a
                      maximum hand size associated with it; if none is defined, the
                      Maximum Hand Size in the Deckmastor's budget is used.

                      As soon as possible after a requirement for a reduction arises,
                      the Deckmastor shall:

                        (i) Satisfy all satisfiable pending draws for that gambler and
                            announce a pending hand reduction;

                       (ii) Wait at least four days, during which e may not satisfy
                            pending draws for that gambler;

                      (iii) Discard cards at random from that Gambler's hand until eir
                            hand size is equal to or less than maximum associated with
                            the reduction.

                       (iv) If a gambler loses no cards during a reduction, and has
                            not played, transferred or discarded a card since the last
                            reduction, the Deckmastor shall discard one card at random
                            from the gambler's hand (if it has any cards).

                      If a dispute on the gambler's hand size or pending draws is
                      raised and not resolved prior to (iii), above, the Deckmastor
                      shall not perform (iii) for that hand until the dispute is
                      resolved.  If no dispute is raised prior to (iii) being
                      performed, then the reduction shall stand regardless of
                      subsequent disputes.  However, a Judge in such a dispute may
                      Order the Deckmastor to perform further card transfers to
                      resolve such disputes.

                      If the Deckmastor knowingly reduces a hand incorrectly, e
                      commits the Class 4 Crime of Card Thievery.

                      If more than one hand reduction is pending for the same hand,
                      then the Deckmastor need only perform the reduction for the
                      reduction with the lowest associated maximum; this shall satisfy
                      all pending reductions.

                      At the beginning of each month, each Player's hand becomes
                      subject to a Hand Reduction to the maximum hand size in the
                      Deckmastor's Budget plus the number of Offices (including the
                      Speakership) that e holds.



                The Maximum Hand Size is hereby set to 5.  (Since it only limits
                things once a month, it should be lower to encourage card turnover).
            """.trimIndent()
        ),
    ),
    "OFF: [Deputy Promotor] Distribution of proposal 5707" to listOf(
        ProposalData(
            number = ProposalNumber(5707.toBigInteger()),
            title = "I want a win in September!",
            ai = ProposalAI(BigDecimal("1.0")),
            author = PlayerName("ais523"),
            coauthors = emptyList(),
            text = "Award a win to ais523.",
        ),
    ),
)

fun Message.overridenDistribution(): List<ProposalData>? {
    return SUBJECT_MAP[this.subject]
}

private val IGNORED_SUBJECTS = listOf<String>()

fun Message.isIgnoredDistribution(): Boolean {
    return IGNORED_SUBJECTS.contains(this.subject)
}

@OptIn(ExperimentalStdlibApi::class)
fun Message.backupFirstProposalNumber(): ProposalNumber {
    return subject
        .lowercase()
        .substringAfter("of proposal")
        .removePrefix("s")
        .trim()
        .substringBefore(" ")
        .substringBefore("-")
        .toBigInteger()
        .let { ProposalNumber(it) }
}
