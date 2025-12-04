package org.randomcat.proposal_parser.distributions

import kotlinx.collections.immutable.persistentListOf
import org.apache.james.mime4j.dom.Message
import org.randomcat.proposal_parser.*
import java.math.BigDecimal
import java.math.BigInteger
import java.time.LocalDate

private val SUBJECT_OVERRIDE_DATA_MAP = mapOf<String, List<ProposalData>>(
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
    "OFF: [Briefly Promotor] Distribution of Proposal 6943" to listOf(
        ProposalData(
            number = ProposalNumber(6943.toBigInteger()),
            title = "My Rights",
            ai = ProposalAI(BigDecimal("3.0")),
            author = PlayerName("scschunt"),
            coauthors = emptyList(),
            text = """
Enact a new Power-3 Rule:
       scshunt CAN perform by announcement any action that no rule says
       e CANNOT or SHALL NOT perform, provided that action does not
       change the rules.
"""
        )
    ),
    "OFF: [Briefly Promotor] I needed this one to be in a separate distribution, you'll see why later" to listOf(
        ProposalData(
            number = ProposalNumber(6941.toBigInteger()),
            title = "Junta end 1",
            ai = ProposalAI(BigDecimal("1")),
            author = PlayerName("ais523"),
            coauthors = emptyList(),
            text = "Repeal rule 2324.",
        ),
        ProposalData(
            number = ProposalNumber(6942.toBigInteger()),
            title = "Junta end 3",
            ai = ProposalAI(BigDecimal("3")),
            author = PlayerName("ais523"),
            coauthors = emptyList(),
            text = "Repeal rule 2324.",
        ),
    ),
    "OFF: Oops, a bit more [Promotor] Distribution of Proposal 7314" to listOf(
        ProposalData(
            number = ProposalNumber(7314.toBigInteger()),
            title = "Top Floor, please",
            ai = ProposalAI(BigDecimal("3")),
            author = PlayerName("scshunt"),
            coauthors = emptyList(),
            text = """
Enact a new rule entitled "King of the Hill" with Power 3, reading:
      scshunt CAN cause this Rule to make arbitrary changes to the
gamestate by announcement.
""",
        ),
    ),
    // https://mailman.agoranomic.org/cgi-bin/mailman/private/agora-business/2011-January/027786.html
    "BUS: scorched earth escalation" to listOf(
        ProposalData(
            number = ProposalNumber.from(6958),
            title = "Tocatta in G.",
            ai = ProposalAI(BigDecimal("3.1")),
            author = PlayerName("G."),
            coauthors = emptyList(),
            text = """
[Elevate Dictatorship to power-3, fix it all so it didn't happen except 
for a few patent titles; end the Dictatorship]

Change the power of Rule 2324 (Dictatorship) to 3.0.

Enact a Rule, "Fourth Movement" with a power of 3.1 and the following
text:

      When this Rule comes to have this text, the gamestate is set to be
      what it would have been if no players were made inactive or made into
      officeholders due to the operation of Rule 2324 in the same message
      in which the proposal that enacted this rule was submitted, with the
      following exceptions:  (a) the proposal that amended this rule to have
      this text was adopted when its adoption was announced by G., its
      power was set to 3.1, its provisions took effect, and (b) any wins
      achieved by Murphy and G. are considered to have been achieved.

[This should allow all gameplay to continue as if this scam didn't
exist while this proposal's voting period goes through].

Amend 2130 (Activity) by appending the following to the first 
paragraph:  "Changes to Activity are Secured."

Amend Rule 1006 (Offices) by appending the following to the second
paragraph:  "A person CANNOT be made the holder of an elected office 
without eir explicit or reasonably implied consent."

Amend Rule 2312 (The Pariah) by replacing the first paragraph with
this text:
       The Pariah is an elected office with no duties. Whenever a
       player becomes the Pariah, that player is awarded a sufficient
       number of Rests in order to bring eir total Rests up to 23.

Award G. the Patent Title First Violin.
Award omd the Patent Title Second Fiddle.
Award Murphy the Patent Title 273rd Prepared Piano.

Repeal Rule 2324 (Dictatorship).
Repeal the Rule entitled "Fourth Movement".

Set G.'s Power to 0.
"""
        )
    ),
    // https://mailman.agoranomic.org/cgi-bin/mailman/private/agora-business/2011-January/027792.html
    "BUS: re-scam fix" to listOf(
        ProposalData(
            number = ProposalNumber.from(6959),
            title = "Fugue in G.",
            ai = ProposalAI(BigDecimal("3.2")),
            author = PlayerName("G."),
            coauthors = emptyList(),
            text = """
Change the power of Rule 2324 (Dictatorship) to 3.0.


Enact a Rule, "Coda" with a power of 3.2 and the following
text:

     The gamestate is hereby set to what it would have been if the
     message sent by G. to the public forum on or about Sun, 23 Jan
     2011 10:56:46 -0800 (PST) with the subject line 'scorched earth escalation'
     (Message-ID: <alpine.LRH.2.01.1101231056460.23416 at hymn11.u.washington.edu>)
     was sent to a discussion forum and not any public forum.


Amend 2130 (Activity) by appending the following to the first
paragraph:  "Changes to Activity are Secured."


Amend Rule 1006 (Offices) by appending the following to the second
paragraph:  "A person CANNOT be made the holder of an elected office
without eir explicit or reasonably implied consent."


Amend Rule 2312 (The Pariah) by replacing the first paragraph with
this text:
        The Pariah is an elected office with no duties. Whenever a
        player becomes the Pariah, that player is awarded a sufficient
        number of Rests in order to bring eir total Rests up to 23.


Award G. the Patent Title First Violin.
Award omd the Patent Title Second Fiddle.
Award Murphy the Patent Title 273rd Prepared Piano.


Repeal Rule 2324 (Dictatorship).
Repeal the Rule entitled "Coda".

Set G.'s Power to 0.
"""
        )
    ),
)

fun Message.overridenDistribution(): List<ProposalData>? {
    return SUBJECT_OVERRIDE_DATA_MAP[this.subject]
}

private val IGNORED_SUBJECTS = setOf(
    LocalDate.of(2004, 9, 23) to "OFF:[Promotor] Distribution of Proposal 4616",
    LocalDate.of(2007, 11, 25) to "BUS: Distribution of Proposal",
    // Has incorrect number in body (6403), later redistributed
    LocalDate.of(2009, 7, 17) to "OFF: [Deputy Promotor] Distribution of Proposal 6406",
    LocalDate.of(2010, 9, 7) to "OFF: [Promotor] Distribution of Proposals 6834-6841",
    // Redistributed later
    LocalDate.of(2012, 5, 5) to "OFF: Distribution of Proposals 7218-7226 (+ ratification)",
    // Actually votes, but poorly marked.
    LocalDate.of(2014, 5, 5) to "BUS: [Promotor] Distribution of Proposals 7641-7642"
)

private val FORCED_SUBJECTS = setOf(
    LocalDate.of(2009, 7, 23) to "OFF: Distribution of Proposals 6410-6413",
    LocalDate.of(2010, 12, 15) to
            "OFF: [Briefly Promotor] I needed this one to be in a separate distribution, you'll see why later",
    LocalDate.of(2011, 1, 23) to "BUS: scorched earth escalation",
    LocalDate.of(2011, 1, 26) to "BUS: re-scam fix",
    LocalDate.of(2012, 2, 16) to "BUS: Here goes nothing",
    LocalDate.of(2012, 9, 26) to "OFF: Oops, a bit more [Promotor] Distribution of Proposal 7314",
)

fun Message.isIgnoredDistribution(): Boolean {
    return IGNORED_SUBJECTS.contains((this.date ?: return false).toUtcLocalDate() to this.subject)
}

fun Message.isForcedDistribution(): Boolean {
    return FORCED_SUBJECTS.contains((this.date ?: return false).toUtcLocalDate() to this.subject)
}

private val SUBJECT_OVERRIDE_TEXT_MAP = mapOf(
    // Replace numbers in detail and fix second 4417 -> 4418 (confirmed by "OFF: [Assessor] Results of Proposals 4417-4418")
    "OFF: Distribution of Proposals 4417-4418" to """

Agora Nomic
Distribution of Proposals 4417-4418

No.  | Title                          | By       | AI | Date    | Flag
     |                                |          |    |         |
4417 | Sensible Timing for Auctions   | Murphy   |  1 | 09Nov02 | O
4418 | Protect the inactive           | Steve    |  1 | 11Nov02 | O

O: Ordinary D: Democratic P: Parliamentary
d: disinterested  u: urgent  s: sane  c: contested
---------------------------------------------------------------------

Text of Proposals being distributed is below.

----------------------------------------------------------------------

Proposal 4417 by Murphy, AI=1, Ordinary
Sensible Timing for Auctions

Proposal: Sensible Timing for Indulgence Auctions

Amend Rule 1712 (Distribution of Indulgences) to read:

    (a) The Ideal Indulgence Circulation Level (IICL) is equal to the 
	number of Players plus the total Stain of all Players.

    (b) The Actual Indulgence Circulation Level (AICL) is the total number 
of Indulgences owned by entities other than the Bank, augmented by the total 
number of Indulgences owned by the Bank which either:
	(1) are already being Auctioned by the Bank in prior Indulgence 	    
Auctions that have not yet concluded; or
	(2) have been auctioned in prior Indulgence Auctions that have 		    
concluded, but where the debts arising from Winning Bids have neither been 
paid nor defaulted upon; or
	(3) have been Auctioned in prior Indulgence Auctions that have 		    
concluded, and the debts arising from the Winning Bids have 	    been paid, 
but the Indulgences have not been transferred to 	    the Winning Bidders.

	(c) The Indulgence Surplus is the difference between the IICL and the AICL; 
if the AICL is greater than the IICL, the Indulgence Surplus is zero.

	(d) If the Indulgence Surplus is positive at the beginning of the month, 
the Herald shall as soon as possible auction off the surplus Indulgences. 
The items to be auctioned are individual Indulgences;     the number of 
items is equal to the Indulgence Surplus, rounded     down to the nearest 
integer. The Auctioneer shall be the Herald,     and the Auction shall be 
conducted in Stems.

	(e) The Monthly Bank Indulgence Gain (MBIG) is the number of    Indulgences 
transferred from other entities to the Bank during a     given Nomic Month, 
less the number of Indulgences transferred from     the Bank to other 
entities during that same Nomic Month.

	(f) If the Indulgence Surplus is zero or negative at the beginning of the 
month, the Herald may still conduct an Indulgence auction, but only if e 
initiates it within one week after the beginning of the month. The items to 
be auctioned are individual Indulgences; the number of items is chosen by 
the Herald, with a minimum of 1 and a     maximum of half the MBIG, rounded 
down to the nearest integer. The     Auctioneer shall be the Herald, and the 
Auction shall be conducted     in Stems.

----------------------------------------------------------------------

Proposal 4418 by Steve, AI=1, Ordinary
Protect the inactive

Proposal
Protect the inactive

When this Proposal takes effect, any inactive players who became quiet 
within the previous month become noisy.

Amend Rule 1042 (Deregistration Due to Silence) by replacing the text in it 
which currently reads:

	(b) A player who has not quietened another player in the past 24 hours may 
do so by publically identifying the player and stating that e causes that 
player to become quiet.

with text which reads:

	(b) A player who has not quietened another active, noisy player in the 
	past 24 hours may cause another active, noisy player to become quiet by 
publically identifying the player and stating that e causes that player to 
become quiet.

[Comment: it strikes me as odd that we have these very strong protections 
against requiring inactive players to do anything, and then we make a 
solitary exception in the case of selecting Judges, which exception we never 
invoke anyway. I think it would be more consistent and elegant simply not to 
require inactive players to be judges, and this is what I propose here.]

Amend Rule 698 (Always an Eligible Judge) to read:

	(a) Each active player is eligible to judge a given CFJ, unless a rule 
specifically makes em ineligible. Inactive players are ineligible to judge 
CFJs.

	(b) If the Clerk of the Courts is required to select a Judge, but after 
taking all other rules affecting eligibility into account, no player is 
eligible to judge that CFJ, then:

	(1) All active non-barred players become eligible to judge that 	    CFJ.

	(2) If there is still no player eligible to judge, then all 		    active 
barred players, other than the caller emself, become 	    eligible to judge 
that CFJ.

	(3) If there is still no eligible Judge, then the game is in 		    serious 
trouble. My usual advice in such situations is to 		    panic, and run 
screaming for the hills.

	(c) This Rule takes precedence over other Rules concerning who is and is 
not eligible to judge CFJs.

-----------------------------------------------------------------------

RedKnight

------------------------------------------------
If you had made the acquiring of ignorance the study of your life, you could 
not have graduated with higher honor than you could today.
-- Mark Twain (from "How I Edited an Agricultural Paper")

_________________________________________________________________
Add photos to your e-mail with MSN 8. Get 2 months FREE*. 
http://join.msn.com/?page=features/featuredemail

""",
    // Fill in numbers from "Re: OFF: Distribution of Proposals (not enough time to figure out numbers)"
    "OFF: Distribution of Proposals (not enough time to figure out numbers)" to """
 No.    | Title                         | By       | AI | Date    | Flag
        |                               |          |    |         |
4461    | Fix Dependent Actions         | Maud     |  2 | 13Feb03 | D
4462    | Saner Thesis Committees       | Goethe   |  1 | 18Feb03 | o
4463    | Full Discretion Fix           | Cecilius |  1 | 01Mar03 | o
4464    | Clarify AI, Take 2            | root     |  3 | 02Mar03 | D
4465    | Fnord                         | Maud     |  1 | 02Mar03 | Dc
4466    | Try Again, Part 2             | Murphy   |  4 | 26Feb03 | D
4467    | Quick Fix in R1929            | OscarMyer|  1 | 04Mar03 | D
4468    | Clarify R1976                 | Cecilius |  1 | 04Mar03 | D
4469    | Heavy Weather                 | Sherlock |  1 | 08Mar03 | o

o: Ordinary D: Democratic P: Parliamentary
d: disinterested  u: urgent  s: sane  c: contested
-----------------------------------------------------------------------

Text of proposals are below:

-----------------------------------------------------------------------

Proposal 4461 by Maud, AI=2, Democratic
Fix Dependent Actions

Amend rule 1728 (Dependent Actions) by replacing the text "positive integer"
with the text "nonnegative integer".

-----------------------------------------------------------------------

Proposal 4462 by Goethe, AI=1, ordinary
Saner Thesis Committees

Saner Thesis Committees

[ V 1.0
- Brings sanity to committee selection by making non-Chair choices
    the responsibility of a "neutral" officer rather than by Opposites.
    Hopefully the neutral Officer will balance the process without
    requiring complicated algorithms.
  - Like current system, first two committee members are players, third
    may be any person.
  - Allows some measure of academic feedback/exchange between candidate
    and committee (drafts, commentary).  Under the current system a typo
    would become part of a thesis forever unless a new committee were
    formed.  More importantly the Committee can now request revisions
    rather than accept or reject (and still reject if the work is below
    standards).
  - Allows termination of the process and thus would not choke an
    arbitrary Turing Thesis Committee (currently, all past committee
    members are still committee members).
]

Amend 1370 to read:

     A person becomes a Candidate for a Degree when e publishes a
     Thesis Draft, authored by emself, along with a statement explicitly
     indicating that the Thesis Draft is being submitted with the intent
     to qualify for a particular degree.

     If the Candidate is a Player, e may choose another Player to be the
     first member of eir Thesis Committee, called eir Chair, with the
     Chair's consent.  For non-players, or if no other Player consents to
     be the Chair within one month of draft submission, the Speaker will
     serve as Chair.

     If the Speaker is neither the Chair nor the Candidate, the Speaker
     shall appoint a Player who is neither the Chair nor the Candidate to
     be the second Committee member.  Otherwise, the Justiciar shall so
     appoint, unless the Chair or the Candidate is the Justiciar, in which
     case the Clerk of the Courts shall so appoint.  The two Committee
     members shall then select, by mutual consent, a third person who is
     not the Candidate to be the third Committee member.

     The Committee shall examine the Candidate and eir Thesis to determine
     eir qualifications for the Degree.  The Candidate may publish a new
     Thesis Draft at any time, in response to Committee requests or of eir
     own choosing, by indicating it is a new Thesis Draft for the same
     Degree.

     If the Committee is dissolved without granting a degree, the Committee
     ceases to be a Committee, and the Candidate ceases to be a Candidate,
     and any existant Thesis Draft must be republished and subject to a
     new Committee selection to be eligible for a Degree.

     The Chair of a Thesis Committee may dissolve the Committee without
     granting a degree, with the consent of at least one other Committee
     member.  To so dissolve, the Chair must publish a notice of intent to
     dissolve at least 14 days before dissolving.  The Candidate may so
     dissolve the Committee at any time by public announcement.

     The Chair of the Thesis Committee for a particular Candidate may
     award that Degree to the Candidate if and only if:

      * the Candidate has satisfied all prerequisites in the rules for
        the award of that Degree;
      * a majority of members of the Thesis Committee agree that the
        most recent Thesis draft produced by the Candidate is worthy
        of the Degree to be granted; and
      * fewer than seven years have passed since that Committee was
        formed.

      Each Committee Member may have up to 14 days after a Degree is awarded
      to publish a Commentary for the Thesis.  After that time, the Chair
      shall publish the most recent Thesis Draft along with all Commentary
      so published.  This combined publication shall become the Final 
Thesis.
      Upon publication of this Final Thesis the Committee members cease to
      be Committee members for that Thesis.

      The Rulekeepor shall retain a copy of each Final Thesis.


Upon the adoption of this Proposal, all Theses that have resulted in
the past awarding of Degrees shall be considered Final Theses.

If any Theses have been published in the last 6 months but degrees
not yet been awarded nor explicitly been turned down for awarding,
then those Theses become Thesis drafts, and any
appointed chairs or committee members remain chairs or committee
members.  All other chairs and committee members cease to be chairs
or committee members.

Enact the following Rule entitled "Awardable Degrees":

      The Degree of Associate of Nomic requires a Thesis of at least
      150 words.  A Candidate who already holds an AN Degree receives
      a credit of 100 words towards the Thesis requirement for any
      higher Degree, unless the Candidate also holds a BN Degree.

      The Degree of Bachelor of Nomic requires a Thesis of at least
      500 words.  A Candidate who already holds an BN Degree receives
      a credit of 250 words towards the Thesis requirement for any
      higher Degree.

      The Degree of Doctor of Nomic History requires a Thesis of at
      least 750 words and containing a narrative covering significant
      events which have occurred in Agora within the eight weeks prior
      to the publication of the Thesis.

      The Degree of Master of Nomic requires a Thesis of at least 750
      words.

      The Degree of Doctor of Nomic Philosophy requires a Thesis of at
      least 1000 words, and that the candidate has also published an
      additional creative work authored by emself whose topic or theme
      is related to Agora or Nomic in general.

-----------------------------------------------------------------------

Proposal 4463 by Steve, AI=1, ordinary
Full Discrition Fix

Amend Rule 1712 (Distribution of Indulgences) by replacing the words "zero 
or negative" with the words "less than one".

-----------------------------------------------------------------------

Proposal 4466 by Murphy, AI=4, Democratic
Try Again, Part 2

Proposal:  Try Again, Part 2 of 3
(AI=4, please)

[Put epochs in their place.]

Upon the adoption of this Proposal, the Gamestate becomes what it would be 
if
all relative durations expressed in terms of epochs were interpreted as 
having
their ordinary-language meaning, Rule 459 (Agoran Epochs) notwithstanding.

Amend Rule 459 (Agoran Epochs) to read:

      Days, weeks, months, quarters, and years are epochs.  The
      corresponding Agoran epochs are Agoran days, Agoran weeks,
      Agoran months, Agoran quarters, and Agoran years, respectively.

      Agoran days begin at midnight GMT.  Agoran weeks begin at midnight
      GMT on Monday.  Agoran months begin at midnight GMT on the first
      day of each Gregorian month.  Agoran quarters begin when the Agoran
      months of January, April, July, and October begin.  Agoran years
      begin when the Agoran month of January begins.  An Agoran epoch
      lasts until the next Agoran epoch of the same type begins.

      Except in this Rule, when the Rules refer to an epoch as an
      independent entity (e.g. "each month"), they shall be interpreted
      as referring to the corresponding Agoran epoch.  However, when the
      Rules refer to an epoch as a relative duration (e.g. "one month
      after", "within one month", "for one month"), they shall be
      interpreted as referring to the ordinary-language meaning of that
      duration.

      Automatic events that happen daily, weekly, monthly, quarterly, or
      yearly happen at the beginning of the corresponding Agoran
      epoch.  Any activity that must be performed daily, weekly, monthly,
      quarterly, or yearly must be performed at least once during each
      corresponding Agoran epoch.

      Other Rules may explicitly define alternate schedules for events
      or classes of events.

Create a Power=4 Rule titled "Ghost Rock Cannon, Part 2 of 3" with this 
text:

      SEELED

-----------------------------------------------------------------------

Proposal 4465 by Maud, AI=1, Democratic, contested
Fnord

-----------------------------------------------------------------------

Proposal 4464 by root, AI=3, Democratic
Clarify AI, Take 2

Amend Rule 594 by deleting the text reading:

       The Adoption Index of a Proposal is the maximum of 1, the value
       requested by its Proposer (if any), and the value required for
       that Proposal by the Rules (if any).

Create a Power-3 Rule titled "Adoption Indices", reading:

       1) The Default Adoption Index of a Proposal is the maximum of:

          a) 1; and
          b) any minimum values required for that Proposal by the Rules.


       2) The Proposer of a Proposal may, at the time when e submits the
          Proposal or at any time while it is in the Pool, request an
          Adoption Index for that Proposal by announcement, specifying the
          requested value.


       3) When a Proposal is distributed, its Adoption Index is set to
          the maximum of:

          a) its Default Adoption Index; and
          b) any values requested by its Proposer as permitted in 2).


       4) This is the only mechanism for setting or changing the Adoption
          Index of a Proposal.  This Rule takes precedence over Rules that
          would allow other mechanisms for setting or changing the Adoption
          Index of a Proposal.

-----------------------------------------------------------------------

Proposal 4467 by OscarMyer, AI=1, Democratic
Quick Fix in R1929

Quick Fix in R1929
(AI=1)

Amend Rule 1929 by replacing the text reading:

         -- It must be the first such notification for that specific
            event

with text reading:

         -- It must be the first valid notification for that specific
            event

-----------------------------------------------------------------------

Proposal 4468 by Sherlock, AI=1, Democratic
Clarify R1976

Amend Rule 1976 (Mentors' Bonus) to read:

      In the four weeks immediately after eir Grace Period ends, a
      Player (hereafter, the 'Protege') may award a Mentor's Bonus to
      each Player (hereafter, a 'Mentor') e deems to have been helpful
      to em as a new Player.

      Each award is made by public announcement and must specify the
      Mentor's name and a number of Stems. Upon such an announcement
      the Bank shall incur a debt of that number of Stems to the named
      Mentor.  The number of Stems a Protege may award in all of eir
      Mentor's Bonuses shall not exceed the number of Stems in the New
      Player Award.

-----------------------------------------------------------------------

Proposal 4469 by OscarMyer, AI=1, ordinary
Heavy Weather

Amend Rule 2011 (Stems Weather) by retitling it "Weather" and making it
read:

      Each Bank currency shall have an associated switch named Forecast.
      Forecast may have two states: Clear and Stormy.  The Treasuror
      may flip any such switch.

      As soon as possible after the beginning of each month, the
      Treasuror shall randomly Determine the Weather for each currency
      whose Forecast is Stormy.  The Weather can be one of either Foul,
      Fair, or Plenty, and shall be determined as follows:

        - Let FOUL be the number of that Bank currency owned by the
          Bank, multiplied by the Foul Weather Factor for that
          currency as set in the Treasuror's Budget, and then rounded
          up to the nearest integer.
        - Let PLENTY be the number of that currency owned by all
          Entities, excluding the Bank.
        - Let SAME and FAIR both be the sum of FOUL and PLENTY,
          divided by 4, rounding up to the nearest integer.
        - Let TOTAL by the sum of FOUL, PLENTY, SAME, and FAIR.
        - The weather shall be determined using the following
          probabilities:
                (FOUL   / TOTAL)  Foul.
                (FAIR   / TOTAL)  Fair.
                (PLENTY / TOTAL)  Plenty.
                (SAME   / TOTAL)  Same as the previous month.

      When the Treasuror posts eir Determination of the Weather for a
      month, the following events shall occur in the listed sequence
      immediately after the Weather is Determined:

           (a) A number of that currency in the Bank's possession,
               equal to the number of Players in the game multiplied
               by the Minimum Income, multiplied by the Weather
               Intensity Factor as set in the Treasuror's Budget, and
               then rounded up to the nearest integer, shall be
               Destroyed. If this value is greater than the number of
               that currency in the Possession of the Bank, all of that
               currency in the Possession of the Bank shall be Destroyed
               instead.
           (b) A number of that currency shall be Created in the Bank's
               Possession, equal to the number Destroyed in (a) above
               multiplied by:
                    0.50 if the Weather is Foul;
                    1.00 if the Weather is Fair;
                    1.50 if the Weather is Plenty.

      The Treasuror shall announce the number of currency Created and
      Destroyed by this Rule in the message in which e announces the
      Weather for that currency.

      The Bank may not otherwise Mint new units of a Bank Currency
      except through the mechanism set forth in this Rule.

Repeal Rule 1974 (Restriction on Minting of Bank Currencies by the Bank).

Amend Rule 2022 (Sente and Gote) by replacing the text that reads:

                     * if the Weather is Plenty, 3 Stems for each 5
                       Land Units with Sente that e owns;
                     * if the Weather is Fair, 2 Stems for each 5
                       Land Units with Sente that e owns;
                     * if the Weather is Foul, 1 Stem for each 5
                       Land Units with Sente that e owns;

   with the text:

                     * if the Weather for Stems is Plenty, 3 Stems
                       for each 5 Land Units with Sente that e owns;
                     * if the Weather for Stems is Fair, 2 Stems for
                       each 5 Land Units with Sente that e owns;
                     * if the Weather for Stems is Foul, 1 Stem for
                       each 5 Land Units with Sente that e owns;

Amend Rule 1893 (The Treasuror's Budget) by replacing the text that reads:

      The Treasuror's Budget shall also contain the Foul Weather
      Factor and the Weather Intensity Factor. Both are numbers
      between 0 and 10 inclusive that are evenly divisible by 0.1.

   with the text:

      The Treasuror's Budget shall also contain the Foul Weather
      Factor and the Weather Intensity Factor for each Bank currency.
      Both are numbers between 0 and 10 inclusive that are evenly
      divisible by 0.1.

------------------------------------------------------------------------

_________________________________________________________________
Tired of spam? Get advanced junk mail protection with MSN 8. 
http://join.msn.com/?page=features/junkmail
""",
    // Use corrected numbers from "BUS: some promotor stuff" (Date: Tue, 9 Nov 2004 15:12:56 -0500 (EST))
    "OFF:[Promotor] Distribution of Proposals 4608-4616" to """
Agora Nomic
Distribution of Proposals 4608-4616
November 06, 2004


-----------------------------------------------------------------------
No.    | Title                        | By        | AI | Date    | Flag
       |                              |           |    |         |
4618   | Battery packs                | Goethe    |  1 | 05Nov04 | Dus
4619   | Buying Seats                 | Goethe    |  1 | 05Nov04 | Dus
4620   | Card Cards                   | Goethe    |  1 | 05Nov04 | Dus
4621   | Potential Decay              | Goethe    |  2 | 05Nov04 | Dus
4622   | Cards for Votes              | Goethe    |  2 | 05Nov04 | Dus
4623   | Vote Cards                   | Goethe    |  1 | 05Nov04 | Dus
4624   | Crimson Go                   | Goethe    |  2 | 05Nov04 | Dus
4625   | Officer card bonus           | Goethe    |  1 | 05Nov04 | Dus
4626   | Some card fixes              | Goethe    |  2 | 05Nov04 | Dus


O: Ordinary D: Democratic P: Parliamentary
d: disinterested  u: urgent  s: sane
+: positive advertising  -: negative advertising
-----------------------------------------------------------------------


Proposal 4618 by Goethe, AI=1, Democratic, Urgent, Sane
Battery packs


    Each Player who votes FOR this Proposal has their Voting
    Potential increased by ten.


-----------------------------------------------------------------------


Proposal 4619 by Goethe, AI=1, Democratic, Urgent, Sane
Buying Seats


    Each Shareholder at the time this Proposal takes effect has their
    Voting Potential increased by twelve.


-----------------------------------------------------------------------


Proposal 4620 by Goethe, AI=1, Democratic, Urgent, Sane
Card Cards


Append the following to Rule 2070 (Card Powerz):

       * Delayed[N]: You may not play this card if you have played a
         copy of this card in the past N times 24 hours.

Create the following Rule, entitled "Card cards":

        Caption:  Your Turn
        Elements: Budgeted
        Exploit:  A Player you name must play or discard a card in the
                  next 72 hours, or commit the Class-1 Infraction of
                  Delay of Game, reportable by you.

        Caption:  Discard Picking
        Elements: Budgeted, Delayed[4]
        Exploit:  If a copy of a card was played or discarded in the
                  past 72 hours, you may name it, and a copy of that
                  card, if one is still in the deck, is automatically
                  transferred from the Deck to your hand.

        Caption:  Enforced Charity
        Elements: Budgeted, Delayed[3]
        Exploit:  A Player you name must transfer a card of eir choice
                  to you in the next 72 hours, or commit the Class-2
                  Infraction of Greed, reportable by you.

        Caption:  Drop your Weapon
        Elements: Budgeted
        Exploit:  A card of your choice, from the Gambler of your choice,
                  is automatically Discarded, provided that Gambler has
                  a copy of that card.

        Caption:  Presto!
        Elements: Budgeted, Delayed[7]
        Exploit:  A card of your choice, from the Gambler of your choice,
                  is automatically transferred to your hand, provided
                  that Gambler has a copy of that card.

Budgets for the following cards are set as follows:
   Your Turn:        5
   Discard Picking:  4
   Enforced Charity: 3
   Drop your Weapon: 2
   Presto!:          1


-----------------------------------------------------------------------


Proposal 4621 by Goethe, AI=2, Democratic, Urgent, Sane
Potential Decay


Amend Rule 2052 by replacing:
       (a) Associated with every Player is a non-negative integral
           number known as that Player's Voting Potential.  At the
           beginning of each new month, every Player's Voting Potential
           is set to zero.

with:
       (a) Associated with every Player is a non-negative integral
           number known as that Player's Voting Potential.  At the
           beginning of each new month, every Player's Voting Potential
           is divided by two and rounded down.


-----------------------------------------------------------------------


Proposal 4622 by Goethe, AI=2, Democratic, Urgent, Sane
Cards for Votes


Amend Rule 2059 (Legality of Bonus Clauses) to read:

   The following Element is defined for cards:

     Grafty:  If a card is Grafty, then it is Budgeted, with its
     initial quota set equal to one plus the number of Players who
     voted FOR the Proposal that first defined that class of card
     as Grafty.  When the Deckmastor initially creates cards to
     fulfil this quota, e shall, Rules to the contrary nonwithstanding,
     first destroy all existing copies of the card, then create one
     copy in the possession of the Deck, and finally create one copy
     in the possession of each Player who voted FOR said proposal.


-----------------------------------------------------------------------


Proposal 4623 by Goethe, AI=1, Democratic, Urgent, Sane
Vote Cards


Create the following Rule, entitled "Democratic cards":

       The following Classes of Cards are defined:

       * Caption:  Coalition
         Elements: Grafty, Budgeted
         Exploit:  You may increase or decrease the Voting Potential of
                   an indicated Player by N by paying a fee of N for
                   yourself, or 2 times N for another Player.

       * Caption:  Patronage
         Elements: Grafty, Budgeted
         Exploit:  You may increase or decrease the Political Charge by N
                   by paying a fee of 4 times N.  If undefined elsewhere,
                   the Political Charge is a positive integer, tracked
                   by the Assessor, which begins at 4.

       * Caption:  Policy
         Elements: Budgeted
         Exploit:  You may sanitize a Proposal, as described elsewhere
                   in the Rules.

       * Caption:  Procedure
         Elements: Budgeted
         Exploit:  You may abort and make undistributable any non-sane
                   Proposal.

The budgeted quota for Procedure cards is hereby set to 8.
The budgeted quota for Policy cards is hereby set to 8.


-----------------------------------------------------------------------


Proposal 4624 by Goethe, AI=2, Democratic, Urgent, Sane
Crimson Go


[Apologies to Murphy for the partial theft]

Create a new rule titled "Takeover Proposals" with Power=2 and
this text:

       Initiative is a stuck player switch, tracked by the Assessor,
       with values Gote and Sente.

       A Takeover Proposal is a proposal meeting these requirements:

         (a) It is labelled as a Takeover Proposal.
         (b) No Takeover Proposal has been submitted earlier in the
             same month.
         (c) It specifies a set of players (hereafter the Corporate
             Raiders) that is no larger than P/2 or smaller than P/3,
             where P is the number of active noisy players at the time
             of submission.

       Rules to the Contrary nonwithstanding, a Takeover Proposal is
       both Democratic and Sane.

       At the beginning of a Takeover Proposal's voting period, all
       players have their initiative flipped to Gote.  At the end of a
       Takeover Proposal's voting period, all players have their
       initiative flipped as follows:
         (a) Adopted:  All Corporate Raiders gain Sente.
         (b) Rejected:  All other players gain Sente.
         (c) Failed quorum:  No one gains Sente.


Amend Rule 1950 (Voting Power) by replacing:
       (b) An entity's Voting Power on a Democratic Proposal is as
           follows:

             * A Player:
                   (a) two plus that Player's Voting Potential if that
                       Player has zero Share Holdings.
                   (b) one plus that Player's Voting Potential
                       otherwise.

             * Any other entity: as defined in the Rules, with a
               default of zero if the Rules don't specify the Voting
               power on a Democratic Proposal for that entity.

with:
       (b) An entity's Voting Power on a Democratic Proposal is as
           follows:
           (1) A Player:
                   (i)  that Player's Voting Potential if that Player
                        has Sente.
                   (ii) one otherwise.
           (2) Any other entity: as defined in the Rules, with a
               default of zero if the Rules don't specify the Voting
               power on a Democratic Proposal for that entity.


Amend Rule 1664 (Rebellion) by replacing:
          - All Stock Cards in the possession of Abiding Players are
            returned to the Deck

with:
          - All Stock Cards in the possession of Abiding Players are
            returned to the Deck, and all Abiding Players have their
            initiative switched to Gote.


-----------------------------------------------------------------------


Proposal 4625 by Goethe, AI=1, Democratic, Urgent, Sane
Officer card bonus


Amend Rule 2069 by replacing:
           A Gambler may Draw from The Deck for a Fee equal to the
           number of times that Gambler has previously Drawn from the
           Deck during the current month so long as the Gambler's Hand
           Size is smaller than the Maximum Hand Size.

with:
           A Gambler may Draw from The Deck for a Fee equal to the
           number of times that Gambler has previously Drawn from the
           Deck during the current month so long as the Gambler's Hand
           Size is smaller than the Maximum Hand Size plus the number
           of Offices e holds.  For the purposes of this Rule, the
           Speakership is considered an office.


-----------------------------------------------------------------------


Proposal 4626 by Goethe, AI=2, Democratic, Urgent, Sane
Some card fixes


[Fix Debate-o-matic]
The Power of Rule 2067 (Cards in Play) is hereby set to 2.

[Fix a typo]
Amend Rule 2075 by replacing:
                                     except that no boon shall be
       awarded nor shall extra winner's be dealt.
with
                                     except that no boon shall be
       awarded nor shall extra winner's cards be dealt.

[Fix Political Charge]
Amend Rule 2052 (Voting Potential) by appending the following text:
        (d) the Political Charge is a positive integer that is initially
        4, and may be changed only as defined by instruments of a power
        of 2 or greater.  Rules to the contrary nonwithstanding, if the
        current value of the Political Charge cannot be determined by
        reasonable effort, it shall be considered to be reset to 4.  The
        Assessor is responsible for tracking the current Political
        Charge.


-----------------------------------------------------------------------
""",
    // Fix numbers 6109 (6209 in summary) -> 6225 and 6110 (6210 in summary) -> 6224 based on
    // "OFF: [Assessor] Voting results for Proposals 6211 - 6222 and 6224 - 6225" and
    // "OFF: [Assessor] Voting Report" (Date: Sun, 26 Apr 2009 16:50:37 -0700)
    "OFF: [Promotor] Distribution 6209 - 6222 & Report" to """
For each of the following proposals, I initiate an Agoran Decision on
whether to adopt the proposal. If any of the listed proposals are not in
the Proposal Pool and are authored by myself, I first submit them.
The valid options for these decisions are FOR, PRESENT, and AGAINST. The
vote collector for each of these proposals is the Assessor. The adoption
index for each proposal is given below as well as whether or not it is a
democratic or ordinary decision. For democratic decisions, the set of
eligible voters is the set of active first-class players as of this
message, their voting limits are each one. For ordinary proposals, the
set of eligible voters is the set of active players as of this message,
their voting limits are as described in rule 2156. Eligibility and
voting limits do not change during the election period. An ordinary
proposal may be made democratic with 2 support; this will change the set
of eligible voters and their voting limits. All other essential
parameters for the decisions are listed in the header; prior to the text
of the proposal.

The following summary is provided for convenience but does not affect
the validity of the Agoran Decisions:

NUM   TITLE                                      T  AI   II  AUTHOR
6209  Extra votes?                               D  2.0  1   comex
6210  wrong paragraph                            D  2.0  1   comex
6211  Refactor appeals opinions                  O  1.7  1   comex
6212  Interpreting the rules                     D  3.0  1   Spitemaster
6213  It's only a game                           D  3.0  1   comex
6214  Okay, you're not playing anymore           D  2.0  1   Yally
6215  Define contestant                          D  3.0  2   coppro
6216  Secret ballots                             D  3.0  1   Murphy
6217  Fix MMI                                    D  3.0  1   Murphy
6218  Deputised duties go away                   D  3.0  1   Murphy
6219  Joining other nomics, take 3               O  1.0  1   Tiger
6220  Rule Change Anarchy                        D  3.0  0   Tiger
6221  Immediate Proposal                         D  3.0  3   coppro
6222  Proposal Withdrawals                       D  3.0  1   coppro

T is the type; O for ordinary or D for democratic.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6225
Title: Extra votes?
Author: comex
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Amend the following paragraph in Rule 2019:

     e) Wielder of Extra Votes.  The Wielder of Extra Votes at the
        start of an ordinary proposal's voting period has a voting
        limit on that proposal of 1.4 times what it would be
        otherwise (rounded to the nearest integer, breaking ties
        toward odd integers), rules to the contrary notwithstanding.

by replacing "1.4" with "1.5" and "odd" with "even".

[Surely I deserve  _one_ extra vote.]
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6224
Title: wrong paragraph
Author: comex
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Remove the second-to-last paragraph of Rule 2143 (Official Reports and
Duties), and add the following paragraph at the end of the rule:

      While performing weekly or monthly duties or publishing weekly
      or monthly reports, officers SHALL NOT publish information that
      is inaccurate or misleading.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6211
Title: Refactor appeals opinions
Author: comex
Adoption Index: 1.7 (Ordinary)
Interest Index: 1

Amend Rule 911 (Appeals Cases) by replacing:

      As soon as possible after a judicial panel is assigned, each
      member of the panel SHALL publish an appeals opinion indicating
      a valid and appropriate judgement to assign to the case -- only
      the first such published opinion for each member is used to
      determine the outcome.  Each member SHOULD include arguments for
      eir choice of judgement.

with:

      As soon as possible after a judicial panel is assigned, each
      member of the panel SHALL publish an appeals opinion indicating
      a valid judgement to assign to the case -- only the last such
      published opinion for each member is used to determine the
      outcome.  Each member SHOULD choose an appropriate judgement,
      and include arguments for eir choice.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6212
Title: Interpreting the rules
Author: Spitemaster
Adoption Index: 3.0 (Democratic)
Interest Index: 1


Amend rule 217 (Interpreting the rules) by replacing:

      it is to be augmented by game custom, common sense, past
      judgements, and consideration of the best interests of the game.

with:

      it is to be augmented by consideration of the best interests of
      the game (so that it does not cause the game to become unplayable,
      but not taking into account any other factors yet), game custom,
      past judgements, and common sense, in that order.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6213
Title: It's only a game
Author: comex
Adoption Index: 3.0 (Democratic)
Interest Index: 1

Amend Rule 101 by replacing "player" with "active player" in item
(iv), and by removing item (vii).

Repeal Rule 869 (How to Join and Leave Agora).

Amend Rule 2130 (Activity) to read:

      Activity is a person switch with values inactive (default) and
      active, tracked by the Registrar.  The Registrar's report
      includes the date on which each non-active person's activity
      last changed.

      A person CAN flip eir activity by announcement.  "To go on hold"
      or to be deactivated is to become inactive; "to come off hold"
      or to be activated is to become active.  A player CAN flip
      another player's activity to inactive without objection.

      A person who has become inactive through a mechanism not defined
      in this rule CANNOT become active for thirty days thereafter,
      rules to the contrary notwithstanding.

Repeal Rule 2145 (Partnerships).

Amend Rule 1742 (Contracts) by removing "that has never been a
partnership".

Amend Rule 2178 (Public Contracts) by removing the paragraph starting
with "A partnership CAN identify its contract as a public contract".

Amend Rule 2200 (Nomic Definitions) by removing the paragraph starting
with "An embassy is a registered partnership".

Amend Rule 2150 (Personhood) by replacing the entire rule with:

      A person is a biological organism that is generally capable of
      communicating by email in English (including via a translation
      service).

Amend Rule 2177 (The Senate) by replacing "first-class player who has
been registered" with "person who has been active" and by replacing
"first-class player who is a member of the roll call" with "person who
is a member of the roll call".

Amend Rule 2228 (Rests) by removing the paragraph starting with
"Ownership of Rests is restricted to first-class persons", and by
replacing "A first-class player CAN" with "A person CAN".

Amend Rule 2124 (Agoran Satisfaction) by replacing "first-class
player" with "person".

Amend Rule 1950 (Voting on Democratic Decisions) by replacing
"first-class players" with "persons".

Amend Rule 2156 (Voting on Ordinary Decisions) by removing "(default
for active first-class players and provinces)" and "(default for all
other players)".

Amend Rule 591 (Inquiry Cases) by removing "first-class".

Amend Rule 1504 (Criminal Cases) by removing "first-class".

Amend Rule 1868 (Judge Assignment Generally) by removing "first-class".

Amend Rule 2136 (Contests) by replacing "first-class players" with
"active persons".

Amend Rule 2233 (Awarding and Revoking Points) by removing
"first-class".

Amend Rule 2233 (Victory) by removing "first-class".

Amend Rule 2199 (Ribbons) by replacing:

      (+W) When a first-class person becomes a player for the first
           time, e gains a White Ribbon.  When a first-class person
           has been a player continuously for at least three months,
           was never a player before that period, and names another
           player as eir mentor (and has not named a mentor in this
           fashion before), that player gains a White Ribbon.

with:

     (+W) When a person becomes active for the first time, e gains a
          White Ribbon.  When a person has been active continuously
          for at least three months, was never active before that
          period, and names another active person as eir mentor (and
          has not named a mentor in this fashion before), that person
          gains a White Ribbon.

Amend Rule 1789 (Cantus Cygneus) by replacing:

      As soon as possible after receiving a Cantus Cygneus, the
      Registrar shall publish this document along with a Writ of
      Fugere Agorae Grandissima Exprobratione, commanding the Player
      to be deregistered. The Registrar shall note the method of
      deregistration for that Player in subsequent Registrar Reports,
      as long as the Player remains deregistered.

      The Player is deregistered as of the posting of the Writ, and
      the notation in the Registrar's Report will ensure that,
      henceforth, all may know said Player deregistered in a Writ of
      FAGE.

with:

      As soon as possible after receiving a Cantus Cygneus, the
      Registrar shall publish this document along with a Writ of
      Fugere Agorae Grandissima Exprobratione, commanding the Player
      to be rendered inactive. The Registrar shall note the method of
      deactivation for that Player in all subsequent Registrar
      Reports.

      The Player becomes inactive as of the posting of the Writ, and
      the notation in the Registrar's Report will ensure that,
      henceforth, all may know said Player deactivated emself in a
      Writ of FAGE.

Amend Rule 2229 (Just Resting) by replacing "deregistered" with "made
inactive", and by replacing "not a player" by "inactive".

Amend Rule 1922 (Defined Regular Patent Titles) by replacing
"deregistered in" with "submitted".

Amend Rule 402 (Identity of the Speaker) by replacing "registered"
with "active".

Amend Rule 2139 by replacing:

      The Registrar's report includes, for each player:

      a) Information sufficient to identify and contact em.
      b) The date on which e most recently became a player.

with:

      The Registrar's report includes, for each active person:

      a) Information sufficient to identify and contact em.
      b) The date on which e most recently became active.


Amend each rule, in order of ID number, by replacing "player" with
"person".

[Repeal partnerships.  Repeal playership and fall back to activity;
everyone is a player.  This allows a more natural entrance to the
game.  It's radical, but nomic is all about challenging the
traditional notion of a game: why can't everyone be a player?]
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6214
Title: Okay, you're not playing anymore
Author: Yally
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Change the text of Rule 2130 (Activity) that reads:

      A player who has been continuously Inactive for at least three
      months CAN be deregistered by any other player without
      objection.  This is a means of honorable deregistration.

to read:

      A player who has been continuously Inactive for at least six
      months CAN be deregistered by any other player by announcement.
      A player who has been continuously Inactive for at least three
      months but no more than six months CAN be deregistered by any
      other player without objection. These are both means of honorable
      deregistration.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6215
Title: Define Contestant
Author: coppro
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Create a new power-2 rule entitled {Contestants} with the following
text:

      In order to be a contestant of a contest, an entity must be an
      active player, a party to that contest, and not its contestmaster.
      An entity that does not meet these requirements CANNOT become a
      contestant of a contest, and if an entity ever fails to meet these
      requirements for a given contest, that entity ceases to be a
      contestant of that contest. Changes to whether or not a player is
      a contestant to a contest are secured.

      In the text of a contest, contestant generally refers to the
      contestants of that contest. The set of contestants of a contract
      are that contract's contestants. Causing a player to become a
      contestant of a contest is also know as entering em to the
      contest; causing em to cease to be a contestent is to cause em to
      quit the contest.

      A player generally CAN enter or quit a contest by announcement,
      subject to the normal requirements. Any player may cause another
      player to quit a contest by announcement if that player has not,
      in the past 90 days, been awarded points by that contest or
      announced eir intent to remain a contestant of that contest.

If Enigma is a Champion's Contest, create a new power-2 rule entitled
{Enigma Contestant Exemption} with the following text:

      For the purposes of the interpretation of the text of Enigma, a
      contestant is a party to Enigma. This supersedes any other rule
      defining the term.

      If Enigma is not a Champion's Contest, any player may cause this
      rule to repeal itself by announcement.

Amend rule 2242 by replacing the paragraph reading:

      A contest's contestmaster CAN transfer ownership of or destroy a
      Medal in that contest's possession, but only as explicitly
      described by the contest's text. A Medal CANNOT be transferred
      from a contest to a player who is not a party to that contest,
      nor to its contestmaster.

with

      A contest's contestmaster CAN transfer ownership of or destroy a
      Medal in that contest's possession to a contestant of that
      contest, but only as explicitly described by the contest's text.

Amend rule 2233 by replacing each occurrence of {its other parties} with
{its contestants}.

For each contest, make each active player who is a party to that
contract and not its contestmaster a contestant of that contest.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6216
Title: Secret ballots
Author: Murphy
Adoption Index: 3.0 (Democratic)
Interest Index: 1

Amend Rule 107 (Initiating Agoran Decisions) by appending this text:

       A decision is secret if and only if defined as such by rules
       with Power at least 2.  Votes on a secret decision are sent
       and retracted by sending a message to its vote collector
       instead of sending a public message, and these actions SHALL
       NOT be disclosed to anyone else during its voting period.

Create a rule titled "Secret Proposals" with Power 2 and this text:

       Once per week, a player CAN make one of eir proposals secret
       by announcement.  The decision on whether to adopt a secret
       proposal is secret.

[Includes generalized framework for secret officer elections as well,
with criteria TBD.]
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6217
Title: Fix MMI
Author: Murphy
Adoption Index: 3.0 (Democratic)
Interest Index: 1

[Currently, the following hypothetical case:

   Rule A: X MAY Y.
   Rule B: X MAY NOT Y.

 expands to

   Rule A: X doing Y does not violate Rule A.
   Rule B: X doing Y violates Rule B.

 which don't conflict with each other, so B effectively wins.  This
 proposal changes the expansions to

   Rule A: X doing Y does not violate the rules.
   Rule B: X doing Y violates Rule B.

 thus forcing a conflict, which is then resolved via precedence
 as usual.]

Amend Rule 2152 (Mother, May I?) by replacing this text:

      5. MAY: Performing the described action does not violate the
         rule in question.

with this text:

      5. MAY: Performing the described action does not violate the
         rules.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6218
Title: Deputised duties go away
Author: Murphy
Adoption Index: 3.0 (Democratic)
Interest Index: 1

[Identical to previous version, which narrowly failed quorum but
was otherwise unanimously supported.]

Amend Rule 2160 (Deputisation) to read:

      Any player (a deputy) CAN perform an action as if e held a
      particular office (deputise for that office) if all of the
      following are true:

        (a) The rules require the holder of that office, by virtue of
            holding that office, to perform the action (or, if the
            office is vacant, would so require if the office were
            filled).  This requirement is fulfilled by the deputy
            performing the action.

        (b) A time limit by which the rules require the action to be
            performed has expired, or the office is vacant.

        (c) If the office is held by an active player, then the deputy
            announced between two and fourteen days earlier that e
            intended to deputise for that office for the purposes of the
            particular action.

        (d) It would be POSSIBLE for the deputy to perform the action,
            other than by deputisation, if e held the office.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6219
Title: Joining other nomics, take 3
Author: Tiger
Adoption Index: 1.0 (Ordinary)
Interest Index: 1

Amend the section in rule 2148 now reading:

      "A foreign nomic may grant certain powers (in the
      ordinary-language sense) and privileges to Agora's ambassador. If
      so, the ambassador shall generally exercise such powers in such
      manner as e sees fit, subject to other rules and orders."

to read:

      "A foreign nomic may grant certain powers (in the
      ordinary-language sense) and privileges to Agora's ambassador. If
      so, the ambassador shall generally exercise such powers in such
      manner as e sees fit, subject to other rules and orders. If a
      foreign nomic allows for Agora to take actions in it, the
      ambassador MAY, with Agoran consent, take any action in it on
      behalf of Agora, provided that the nomic is Protected, Friendly
      or Neutral."

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6220
Title: Rule Change Anarchy
Author: Tiger
Adoption Index: 3.0 (Democratic)
Interest Index: 0

Repeal Rule 105 (Rule Changes).
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6221
Title: Immediate Proposals
Author: coppro
Adoption Index: 3.0 (Democratic)
Interest Index: 3

Create a power-3 rule entitled {Immediate Proposals} with this text:
{{
      If there is an ongoing Agoran Decision on the adoption of a given
      proposal, or a given proposal is in the Proposal Pool, it is
      eligible for Immediate Adoption. An entity can, by announcement,
      pledge or withdraw support for an attempt at Immediate Adoption.

      Every proposal eligible for Immediate Adoption has a Virtual
      Decision associated with it. A Virtual Decision has the same set
      of parameters as an Agoran Decision. The Virtual Decision for an
      attempt at Immediate Adoption of a proposal, unless made
      democratic, has the same parameters as the ongoing Agoran Decision
      as to the adoption of that proposal, or, if no such Decision
      exists, the Agoran Decision as to the adoption of that proposal as
      it would exist if the Promotor were to immediately distribute the
      proposal.

      If there exists a method by which an ongoing ordinary Agoran
      Decision can be made democratic, such a method also applies to a
      Virtual Decision. If a Virtual Decision has been made democratic,
      it has the same parameters as the Agoran Decision mentioned above
      would if it were made democratic.

      When the set of entities who have supported and not subsequently
      withdrew their support for the Immediate Adoption of a proposal is
      sufficient to guarantee adoption of the associated Virtual
      Decision, any player CAN cause it to take effect by announcement.
      A set of entities is sufficient to guarantee adoption of a Virtual
      Decision if, were the Virtual Decision an ongoing Agoran Decision,
      were each of those entities to each cast a number of FOR votes on
      that Decision equal to their voting limits, were each other entity
      to cast a number of AGAINST votes on that Decision equal to their
      voting limits, and were that Decision subsequently resolved, the
      outcome would be ADOPTED.

      When a proposal takes effect due to this Rule, it is removed from
      the Proposal Pool and any Agoran Decisions as to the adoption of
      that proposal cease to exist (they are not resolved).

      When an Agoran Decision as to the adoption of a proposal is
      resolved, when a proposal is removed from the Proposal Pool by a
      means other than distribution, or when a proposal is adopted by
      any means, any attempts to cause Immediate Adoption of that
      proposal end.
}}

Amend rule 106 by replacing {Preventing a proposal from taking effect is
a secured change. This rule takes precedence over any rule which would
permit a proposal to take effect.} with {Causing a proposal to take
effect and preventing a proposal from taking effects are both secured
changes.}
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6222
Title: Proposal Withdrawals
Author: coppro
Adoption Index: 3.0 (Democratic)
Interest Index: 1

[This has been Agoran custom for a long time yet completely illegal. As
Promotor I could be NoVed for this, and really don't want to be.]

Remove all proposals from the Proposal Pool that were in it at the
beginning of the third Agoran week to fall entirely in April of 2009.

Amend rule 106 by adding {A player CAN remove a proposal e authored
from the Proposal Pool by announcement.} at the end of the second
paragraph.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
The highest orderly ID for distributed proposals is 6222; there are no
chaotic ID numbers.

The Proposal Pool is empty.
    """,
    // 6275 -> 6301, per "BUS: Re: DIS: Re: OFF: [Promotor] Distribution 6275-6300 & Report"
    "OFF: [Promotor] Distribution 6275-6300 & Report" to """
For each of the following proposals, I initiate an Agoran Decision on
whether to adopt the proposal. If any of the listed proposals are not in
the Proposal Pool and are authored by myself, I first submit them.
The valid options for these decisions are FOR, PRESENT, and AGAINST. The
vote collector for each of these proposals is the Assessor. The adoption
index for each proposal is given below as well as whether or not it is a
democratic or ordinary decision. For democratic decisions, the set of
eligible voters is the set of active first-class players as of this
message, their voting limits are each one. For ordinary proposals, the
set of eligible voters is the set of active players as of this message,
their voting limits are as described in rule 2156. Eligibility and
voting limits do not change during the election period. An ordinary
proposal may be made democratic with 2 support; this will change the set
of eligible voters and their voting limits. All other essential
parameters for the decisions are listed in the header; prior to the text
of the proposal.

The following summary is provided for convenience but does not affect
the validity of the Agoran Decisions:

NUM   TITLE                                      T  AI   II  AUTHOR
6301  Privelege of the Champion                  D  2.0  2   Pavitra
6276  Privelege of the Minister                  D  2.0  1   Pavitra
6277  Privelege of the Recent Champion           D  2.0  0   Pavitra
6278  You're All Dried Up                        D  2.0  1   coppro
6279  Second-class judges                        D  2.0  1   Murphy
6280  Notes for the actual judge                 D  2.0  1   Tiger
6281  All Together Now, Discordantly             D  2.0  1   Wooble
6282  IADoP Tracks Reports                       O  1.0  1   Yally
6283  No forced championship wins                O  1.0  1   root
6284  Sgeo, full time                            O  1.0  1   ais523
6285  Precedence fix                             D  3.0  1   Goethe
6286  Precedence fixes                           D  3.0  1   comex
6287  Emergency ratification                     D  3.0  1   comex
6288  It Should Be A Real Switch                 D  2.0  1   coppro
6289  I Fone                                     O  1.0  0   coppro
6290  Broom shakalaka                            D  3.0  1   Quazie
6291  Polish                                     D  3.0  1   Murphy
6292  combined precedence                        D  3.2  1   Goethe
6293  Stop IADoP Abuse                           D  2.0  1   Goethe
6294  IADoP Must Announce FAILED QUORUM          O  1.0  1   Yally
6295  Enough already                             D  2.0  1   comex
6296  Presence in elections                      D  2.0  1   Murphy
6297  Quick-and-dirty-fix 2                      O  1.0  1   comex
6298  Ratify Victories                           O  1.0  2   coppro
6299  First-class Only                           D  2.0  1   Yally
6300  Fix contract problems                      D  2.0  1   Murphy

T is the type; O for ordinary or D for democratic.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6301
Title: Privelege of the Champion
Author: Pavitra
Coauthors: ais523, root
Adoption Index: 2.0 (Democratic)
Interest Index: 2

Amend rule 2186 (Victory) to read:
{
      Laurels are a type of asset, tracked by the Herald. Creating,
      destroying, or transferring Laurels is secured. For a person to
      be laureated means for a Laurel to be created in that person's
      possession.

      Winning Conditions and Losing Conditions are conditions defined
      as such by the rules.  When one or more persons satisfy at least
      one Winning Condition and do not satisfy any Losing Conditions,
      all such persons are laureated.  A person CANNOT be laureated in
      any other way, rules to the contrary notwithstanding.

      Each Winning Condition should (if needed) specify a cleanup
      procedure to prevent an arbitrary number of Laurels arising from
      essentially the same conditions.  When one or more persons are
      laureated, for each Winning Condition satisfied by at least one
      of those persons, its cleanup procedure occurs.

      A win announcement is a correct announcement explicitly labeled
      as a win announcement and/or clearly stating that one or more
      persons are laureated.

      A person CAN spend a Laurel to win the game. The game CANNOT be
      won in any other way, rules to the contrary notwithstanding.
}

Amend rule 2110 (Win by Paradox) by replacing "winner" with "laureate".

Amend rule 1922 (Defined Regular Patent Titles) by replacing "The
Herald's monthly report includes how the player won." with "The Herald's
monthly report includes how the player won (or, if the player won by
spending a Laurel, how e was laureated, assuming that Laurels are spent
in the same order in which they were gained).
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6276
Title: Privelege of the Minister
Author: Pavitra
Coauthors: Goethe
Adoption Index: 2.0 (Democratic)
Interest Index: 1

This proposal has no effect unless "Privilege of the Champion" passed.

Goethe is a coauthor of this proposal.

Amend rule 2186 (Victory) by replacing the final paragraph with:
      A person CAN spend a Laurel to win the game.

      A player (the trumpeter) CAN act on behalf of another player (the
      reluctant victor) to cause em to spend a Laurel, provided that all
      of the following conditions are satisfied:

        The reluctant victor is not a Minister without Portfolio.

        The reluctant victor owns a Laurel.

        If the reluctant victor has ever spent or been caused to spend a
        Laurel, then e has borne the Patent Title Minister without
        Portfolio at least once since the most recent time e did so or
        was caused to do so.

      Upon the trumpeter doing so, the reluctant victor wins the game.

      A person CANNOT win the game except as specified in this rule,
      rules to the contrary notwithstanding.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6277
Title: Privelege of the Recent Champion
Author: Pavitra
Adoption Index: 2.0 (Democratic)
Interest Index: 0

This proposal has no effect unless "Privilege of the Champion" passed.

Ratify the document:
{
root did not win the game at any time between 21:05 and 21:20 on the 4th
of May 2009 UTC.
}

If root successfully awarded the Patent Title Champion to emself on or
around 21:54 4th May 2009 UTC, then revoke one instance of Champion from
root.

If root had no Medals at 22:00 4th May 2009 UTC, then create one Laurel
in the possession of root.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6278
Title: You're All Dried Up
Author: coppro
Adoption Index: 2.0 (Democratic)
Interest Index: 1

For each player who did not submit a valid ballot on at least one Agoran
Decision in the month of May 2009, flip that player's activity to
inactive.

[Note: If you are a lurker, you should probably just vote FOR this
proposal as you therefore won't get made inactive by it.]
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6279
Title: Second-class judges
Author: Murphy
Adoption Index: 2.0 (Democratic)
Interest Index: 1

[Now that second-class registration is restricted, other restrictions
can be loosened up.]

Amend Rule 1868 (Judge Assignment Generally) by removing "first-class"
from this text:

      The entities qualified to be assigned as judge of a judicial
      case are the active first-class players,

Create a rule titled "Second-Class Judges" with Power 2 and this text:

      If any first-class member of a second-class person's basis would
      be unqualified to judge a given judicial case, even if e were
      registered, active, standing, hemming-and-hawing, and Supreme,
      then that second-class person is unqualified to judge that case.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6280
Title: Notes for the actual judge
Author: Tiger
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Amend the section in Rule 2126 now reading:
(
      (3) (D)  At the end of each week, each player who published at
               least one on-time judgement during that week gains a
               number of D Notes equal to the highest interest index
               among all such cases.
)
to read:
(
      (3) (D)  At the end of each week, each player who assigned an
               on-time judgement to at least one case during that week
               gains a number of D Notes equal to the highest interest
               index among all such cases.
)
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6281
Title: All Together Now, Discordantly
Author: Wooble
Coauthors: ais523, Quazie
Adoption Index: 2.0 (Democratic)
Interest Index: 1

In Rule 2126, replace #6 under "Notes CAN be spent (destroyed) as
follows:" with:

      (6) During Agora's Birthday, a player CAN spend Notes forming
          the melody "Happy Birthday" (GGAGCB GGAGDC GGGECBA FFECDC or
          a translation thereof) to satisfy the Winning Condition of
          Musicianship, unless another player has already done so
          using the same translation during that Birthday.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6282
Title: IADoP Tracks Reports
Author: Yally
Adoption Index: 1.0 (Ordinary)
Interest Index: 1

Add the following point below point c in Rule 2138:

      d) The date when that office's reports were last published.

Increase the interest index of the IADoP to 2.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6283
Title: No forced championship wins
Author: root
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Amend Rule 2242 by replacing this text:

      Upon a win announcement that a specified non-contest player owns
      a Medal, that player satisfies the Winning Condition of
      Championship.

with this text:

      Upon a win announcement by a non-contest player that e owns a
      Medal, that player satisfies the Winning Condition of
      Championship.

[Win by High Score allows anybody to announce the win because it
causes a score reset, and it's desirable to go ahead and get that over
with as soon as possible.  For win by Championship, there's no reason
to allow others to force the timing of the win.]
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6284
Title: Sgeo, full time
Author: ais523
Adoption Index: 1.0 (Ordinary)
Interest Index: 1

Create a power-1 rule with the following text:
{{{
      The Officer for Homeland Security is an office.

      The Officer for Homeland Security SHOULD regularly attempt to
      comment on, or propose proposals to strengthen, Agora's mechanisms
      for resisting invasions by large numbers of nonplayers.
}}}
Unless e objected between the time this proposal was proposed and the
time it was adopted, install Sgeo as Officer for Homeland Security.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6285
Title: Precedence fix
Author: Goethe
Adoption Index: 3.0 (Democratic)
Interest Index: 1

Amend Rule 1030 (Precedence between Rules with Equal Power) by
appending the following paragraph:

      Any claim of precedence in a rule, including a claim of
      precedence over "all" or similarly broad classes of rules,
      is considered to be a claim of precedence over rules with
      equal power only, unless it explicitly, clearly, and
      directly claims to stipulate a means of determining
      precedence between rules of different (i.e. higher, lower,
      or otherwise unequal) power.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6286
Title: Precedence fixes
Author: comex
Adoption Index: 3.0 (Democratic)
Interest Index: 1

Amend Rule 1551 (Ratification) to read: [added "rules to the contrary
notwithstanding"]
      A public document is part (possibly all) of a public message.

      When a public document is ratified, rules to the contrary
      notwithstanding, the gamestate is modified so that the ratified
      document was completely true and accurate at the time it was
      published.  Nevertheless, the ratification of a public document
      does not invalidate, reverse, alter, or cancel any messages or
      actions, even if they were unrecorded or overlooked, or change
      the legality of any attempted action.

      Ratifying a public document is secured.

Change the power of Rule 1698 (Agora Is a Nomic) to 4.

[Currently the order of precedence is R101 > AIaN > everything else,
with Ratification a few rules down.  This proposal changes it to AiaN >
R101 > Ratification > everything else.  Yes, I believe keeping the game
alive is more important than our rights.]
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6287
Title: Emergency ratification
Author: comex
Adoption Index: 3.0 (Democratic)
Interest Index: 1

Ratify the document purporting to be the SLR published most recently
before this proposal was submitted.

[It's possible that many rule changes failed, unknown to us, due to
the last paragraph of R1482, and ratifying them in the past failed due
to precedence.  This should be adopted after 'Precedence fixes'.]
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6288
Title: It Should Be A Real Switch
Author: coppro
Adoption Index: 2.0 (Democratic)
Interest Index: 3

In rule 2178 (Contract Switches), replace:

      Disclosure is a contract switch with values Private (default) and
      Public.  Rules to the contrary notwithstanding:

with:

      Disclosure is a contract switch, tracked by the Notary, with
      values Private (default) and Public.  Rules to the contrary
      notwithstanding:

and replace:

      Sentiment is a contract switch with values Equitable (default) and
      Legalistic.  Rules to the contrary notwithstanding, a contract's
      Sentiment CANNOT be flipped away from Legalistic.

with:

      Sentiment is a contract switch, tracked by the Notary, with values
      Equitable (default) and Legalistic.  Rules to the contrary
      notwithstanding, a contract's Sentiment CANNOT be flipped away
      from Legalistic.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6289
Title: I Fone
Author: coppro
Adoption Index: 1.0 (Ordinary)
Interest Index: 1

Create a new power-1 rule with the following text:

      If a public message claims to have been sent from a particular
      device or class of device, that claim is self-ratifying.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6290
Title: Broom shakalaka
Author: Quazie
Coauthors: Goethe
Adoption Index: 3.0 (Democratic)
Interest Index: 1

Replace the text of R2221 with the following:

      A Broom is a power 3 entity that can only be created as specified
      by this rule.  A Broom consists of both a rule and a non-empty set
      of spelling and/or grammar corrections to be made to that rule.

Any player CAN create a Broom without objection.  The Broom may then
amend the rule as specified.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6291
Title: Polish
Author: Murphy
Adoption Index: 3.0 (Democratic)
Interest Index: 1

Amend Rule 2221 (Cleanliness) by replacing "amended as specified" with
"amended by this rule as specified by that person".
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6292
Title: combined precedence
Author: Goethe
Coauthors: comex
Adoption Index: 3.2 (Democratic)
Interest Index: 1

Amend Rule 1482(Precedence between Rules with Unequal Power)
by removing:
      No change to the Ruleset can occur that would cause a Rule
      to stipulate any other means of determining precedence
      between Rules of unequal Power.  This applies to changes by
      the enactment or amendment of a Rule, or of any other form.
      This Rule takes precedence over any Rule that would permit
      such a change to the Ruleset.


Amend Rule 1030 (Precedence between Rules with Equal Power) to read:

      In a conflict between Rules, the conflict shall be resolved
      by performing the following comparisons in the squence written
      in this rule, until the conflict is resolved.

      -In a conflict between Rules with different Power, the Rule
       with the higher Power takes precedence over the Rule with
       the lower Power ; otherwise,

      -If all of the Rules in conflict explicitly say that their
       precedence relations are determined by some other Rule for
       determining precedence relations, then the determinations of
       the precedence-determining Rule shall be used to resolve the
       conflicts; otherwise,

      -If at least one of the Rules in conflict explicitly says of
       itself that it defers to another Rule (or type of Rule) or
       takes precedence over another Rule (or type of Rule), then
       such provisions shall be used to resolve the conflict,
       unless they lead to contradictions between each other;
       otherwise,

      -The Rule with the lower ID number takes precedence.

      Clauses in any other rule that broadly claim precedence
      (e.g. over "all rules" of a certain class) shall be, prima
      facie, considered to be limited claims of precedence or
      deference that are applicable only when such claims are
      evaluated as described within the above sequence.

      No change to the Ruleset can occur that would cause a Rule
      to directly claim precedence over this Rule as a means of
      determining precedence.  This applies to changes by
      the enactment or amendment of a Rule, or of any other form.
      This Rule takes precedence over any Rule that would permit
      such a change to the Ruleset.

Change the title of Rule 1030 to "Precedence between Rules"

Increase the power of Rule 1030 to 3.2

Repeal Rule 1482
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6293
Title: Stop IADoP Abuse
Author: Goethe
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Amend R2154 (Election procedure) by replacing:
      Any player CAN by announcement initiate an election for an
      elected office for which no election is already in progress,
      nominating at least one active player.
with:
      Any player CAN, with Support, initiate an election for a
      specified elected office for which no election is already in
      progress.  When an election is initiated, the current holder
      of the office (if any) is initially considered to have been
      nominated and have accepted.

[Puts in a minimal with support level of control up against the
trend of beginning trivial elections.  Once started, nomination
remains by announcement; the current holder is automatically a
nominee but may decline at any time].
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6294
Title: IADoP Must Announce FAILED QUORUM
Author: Yally
Adoption Index: 1.0 (Ordinary)
Interest Index: 1

Amend the word SHOULD in Rule 2168 (Extending the Voting Period) to read
SHALL.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6295
Title: Enough already
Author: comex
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Amend Rule 2154 (Election Procedure) by replacing 4) with 5), and by
adding the following item between 3) and 5):

       4) Quorum is the lesser of three and the number of active
          players (other rules on quorum notwithstanding).
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6296
Title: Presence in elections
Author: Murphy
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Amend Rule 2154 (Election Procedure) by replacing this text:

       1) The valid options (hereafter the candidates) are the active
          players who, during the election,

with this text:

       1) The valid options are PRESENT and the active players
          (hereafter the candidates) who, during the election,
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6297
Title: Quick-and-dirty-fix 2
Author: comex
Coauthors: Goethe, comex
Adoption Index: 1.0 (Ordinary)
Interest Index: 1

Amend Rule 1551 (Ratification) to read: [added "rules to the contrary
notwithstanding"]
      A public document is part (possibly all) of a public message.

      When a public document is ratified, rules to the contrary
      notwithstanding, the gamestate is modified so that the ratified
      document was completely true and accurate at the time it was
      published.  Nevertheless, the ratification of a public document
      does not invalidate, reverse, alter, or cancel any messages or
      actions, even if they were unrecorded or overlooked, or change
      the legality of any attempted action.

      Ratifying a public document is secured.

Change the power of Rule 1698 (Agora Is a Nomic) to 3.1.

Ratify the following document: { Proposal 4942 did not take effect. }

Amend Rule 1030 (Precedence between Rules with Equal Power) by
appending the following paragraph:

      Any claim of precedence in a rule, including a claim of
      precedence over "all" or similarly broad classes of rules,
      is considered to be a claim of precedence over rules with
      equal power only, unless it explicitly, clearly, and
      directly claims to stipulate a means of determining
      precedence between rules of different (i.e. higher, lower,
      or otherwise unequal) power.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6298
Title: Ratify Victories
Author: coppro
Adoption Index: 1.0 (Ordinary)
Interest Index: 1

Amend bullet (d) of Rule 1922 to read as follows:

      (d)  Champion, to be awarded by the Herald to any person who
           wins the game, along with a specification (possibly
           implicit) of the method of victory.  The Herald's monthly
           report includes how the player won. A message awarding
           Champion to a player constitutes a self-ratifying claim that
           the player in question won the game through that method.
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6299
Title: First-class Only
Author: Yally
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Amend Rule 2154 (Election Procedure) by changing "active players" in
bullet point 2 to "active first-class players."
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
Number: 6300
Title: Fix contract problems
Author: Murphy
Adoption Index: 2.0 (Democratic)
Interest Index: 1

Change the power of Rule 2136 (Contests) to 2.

[This fixes two bugs:  R2198 allows contestmaster to be flipped, and
secures the flipping of contract switches so that R2136 cannot allow
contestmaster to be flipped.]

Ratify the following document:  {

  The following contracts have the following contestmasters.  No other
  contracts are contests.

  Enigma                 ais523
  Fantasy Rules Contest  Murphy
  Nomic Wars III         BobTHJ
  AAA                    Wooble
  Cookie Jar             Murphy
  Three-Scroll Rodney    coppro

}

Amend Rule 2173 (The Notary) by appending this text:

      The Notary tracks all contract switches not assigned to
      another officer.

For each contract and each contract switch that previously failed to
be a switch because no officer was assigned to track it, flip it to the
value it would have had if the Notary had been assigned to track it.

[The C# scam is not fixed here, because it's not obvious how it
should be fixed.]
}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{
""",
    // Replace 6645 with 6647 per "Re: BUS: Re: OFF: [Promotor] Distribution of Proposals 6645-6646" (Date: Mon, 22 Feb 2010 21:37:28 -0600)
    "OFF: [Promotor] Distribution of Proposals 6645-6646" to """
This distribution of proposals and the subsequent assigning of ID
numbers initiates the Agoran Decisions on whether to adopt proposals
6635-6644. The eligible voters for these proposals are the active
players as of this message, and the vote collector is the Assessor.
The valid options on each decision are FOR, AGAINST and PRESENT.
These decisions are all ordinary to begin.

NUM   II  AI   SUBMITTER         CHAMBER  TITLE
6647  1   2.0  Murphy            Green    Flight Clearance
6646  1   2.0  c.                Green    I don't want to keep track of old NoVs

Proposals:

-----------------------------------------
ID: 6647
Title: Flight Clearance
Author: Murphy
AI: 1.0
II: 1
Chamber: Green

Create a rule titled "Props" with this text:

    Props are a currency.

    The Air Traffic Controller is an office and the recordkeepor
    of props.

    Ownership of props is limited to first-class players.  Props
    CANNOT be created, transferred, or destroyed except as allowed
    by this rule or required by the rules in general.

    When a first-class player registers, 14 props are created in
    eir possession.  When a first-class player deregisters, eir
    props are destroyed.

    Once per week, each player CAN transfer a prop from one player
    to another, provided that e explains why e chose each player,
    and does not transfer it to emself.

    Players with at least 23 props are Pilots; the Pilot with the
    most props (if any) is the Captain. Players with less than
    5 props are Marines.

Upon the adoption of this proposal, install Murphy as Air Traffic
Controller.

Upon the adoption of this proposal, create props as follows:

 23  ais523
 13  BobTHJ
 4  c.
 13  coppro
 15  G.
 18  Murphy
 11  Pavitra
 13  Sgeo
 15  Taral
 18  Tiger
 20  Yally

 14  each first-class player not listed above


-----------------------------------------

ID: 6646
Title: I don't want to keep track of old NoVs
Author: c.
AI: 2.0
II: 1
Chamber: Green

Amend Rule 2230 by removing:

    Valid NOVs have ID numbers, to be assigned by the Herald.
""",
    // Removed weird "Fragments in Inode" field
    "OFF: [Promotor] Distribution of Proposals 6740-6747" to """
This distribution of proposals 6740-6747
initiates the Agoran Decisions on whether to adopt them.  The eligible
voters are the active players at the time of this distribution, and
the vote collector is the Assessor. The valid options on each decision
are FOR and AGAINST (PRESENT is also a valid vote). Each proposal is
hereby assigned the corresponding ID number listed with it.

NUM  C I AI  SUBMITTER           TITLE
6740 P 1 1.0 ais523              The first rule of this proposal is...
6741 P 0 3.0 comex               Clarify inconsequentiality mk. 2
6742 P 1 3.0 comex               Proposal Amendment
6743 P 1 3.0 comex               Some repeals
6744 G 1 3.0 Murphy              No duty means no duty
6745 P 0 1.0 coppro              Huh?
6746 P 0 2.0 coppro              Decision Fixes
6747 P 3 1.0 Tiger               Space Alert


chamber: P = Purple; R = Red; G = Green
interest: 0-3 = interest index

Proposal ID numbers:
     highest orderly: 6747
     disorderly: none


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6740 (Purple, AI=1.0, Interest=1) by ais523
The first rule of this proposal is...

Award a win to player who did not acknowledge the existence of this
proposal in a public or discussion forum after the time it was submitted
and before the time it was adopted.


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6741 (Purple, AI=3.0, Interest=0) by comex
Clarify inconsequentiality mk. 2

[Oops, the original passed.]

Amend Rule 754 by replacing:

      (1) A difference in spelling, grammar, whitespace,
          capitalization, or dialect, or the use of a synonym or
          abbreviation in place of a word or phrase, is
          inconsequential in all forms of communication, as long as
          the difference does not create an ambiguity in meaning.

with:

      (1) A difference in spelling, grammar, capitalization, or
          dialect, or the use of a synonym or abbreviation in place of
          a word or phrase is inconsequential in all forms of
          communication, as long as the difference does not create an
          ambiguity in meaning, except for the purpose of reporting on
          or quoting the text of a legal document.  A difference
          between two nonempty spans of whitespace is inconsequential
          in all forms of communication for all purposes.

Amend Rule 2221 to read:

      Any player CAN clean a rule without objection by specifying one
      or more corrections to spelling, grammar, capitalization, and/or
      dialect, or to whether a synonym or abbreviation is used in
      place of a word or phrase, in the rule's text and/or title; the
      rule is amended by this rule as specified by that person.

Amend Rule 105 by replacing:
                                             An inconsequential
      variation in the quotation of an existing rule does not
      constitute ambiguity for the purposes of this rule.

with:
                                                  An inconsequential
      variation in the quotation of an existing rule does not
      constitute ambiguity for the purposes of this rule, but any
      other variation does.



}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6742 (Purple, AI=3.0, Interest=1) by comex
Proposal Amendment

Comment: This is identical to a previous proposal that was 9-0 but
failed quorum, plus my later fix.

Amend Rule 106 by replacing:

     A player CAN remove (syn. retract, withdraw) a proposal e
     authored from the Proposal Pool by announcement.

with:

     A player CAN remove (syn. retract, withdraw) a proposal e
     authored from the Proposal Pool, or amend a proposal e authored
     in the Proposal Pool, by announcement.

and by replacing:

     A proposal is a fixed body of text which has been made into a
     proposal using a process specifically described in the Rules.
     When creating proposals, the person who creates them SHOULD

with:

     A proposal is a body of text which has been made into a proposal
     using a process specifically described in the Rules.  Proposals
     CANNOT be modified except as allowed by this rule.

     When creating proposals, the person who creates them SHOULD

[Right now, I think there is a tendency to avoid modifying proposals,
even when, say, a simple change would improve clarity or avoid a
trivial error, because doing so requires re-paying the
Distributability fee.]


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6743 (Purple, AI=3.0, Interest=1) by comex
Some repeals

Repeal the rules with the following titles:
- Officer's Proposals
- Judge's Proposals
- Induction

[Nobody uses them.]


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6744 (Green, AI=3.0, Interest=1) by Murphy
No duty means no duty

Amend Rule 2201 (Self-Ratification) by replacing this text:

       b) A claim of error, appropriate for matters of fact.  The
          publisher of the original document SHALL as soon as possible
          either deny the claim (causing it to cease to be a doubt),
          publish a revision, or (if the subject is actually a matter
          of law) initiate an inquiry case regarding the truth of the
          claim.

with this text:

       b) A claim of error, appropriate for matters of fact.  The
          publisher of the original document SHALL (if e was required
          to publish that document) or SHOULD (otherwise) do one of
          the following as soon as possible:

              i) Deny the claim (causing it to cease to be a doubt).
             ii) Publish a revision.
            iii) Initiate an inquiry case regarding the truth of the
                   claim (if the subject is actually a matter of law).



}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6745 (Purple, AI=1.0, Interest=0) by coppro
Huh?

[coppro wins.]


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6746 (Purple, AI=2.0, Interest=0) by coppro
Decision Fixes

Amend Rule 208 (Resolving Agoran decisions) by replacing
       (c) It specifies which option was selected by Agora, as
           described elsewhere, and provides a tally of the voters'
           valid ballots on the various options.
with
       (c) It specifies the outcome, as described elsewhere, and, if
           there was more than one valid option, provides a tally of
           the voters' valid ballots on the various options.


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6747 (Purple, AI=1.0, Interest=3) by Tiger
Space Alert

Enact a new rule:

[[[
     Objects In Space

     Some game objects are In Space. Objects In Space are represented
     on the following style of map:

     @->---@

     All such objects are located on a straight line leading from one
     wormhole (@) to another. The line is divided into segments of
     one AU each, with no more than one object in the same segment,
     and dashes representing empty segments. Any definition of a type
     of object In Space must include the symbol to represent it on
     the map.

     Objects In Space have a number of stats. All objects have a
     position value and a delta value. The position is the number of
     the segment it occupies, counting from the left with the first
     wormhole as 0. At the beginning of each week, an object's
     position is increased by its delta. If an object's delta is
     positive or 0 it faces right, if negative it faces left. An
     object's position must be between 0 and the position of the
     second wormhole. Any object that finds itself outside of this
     area or on a wormhole is warped and disappears.

     Other common stats include maximum hit points, current hit
     points, attack value, explosion value and scouting value.
]]]

Enact a new rule:

[[[
     The Shuttle

     The Shuttle is an object In Space that houses the crew
     consisting of almost all active players. It enters play through
     the first wormhole and its objective is to reach the second one.
     When it appears, it has the following stats:
     Symbol: >
     Maximum hit points: 12
     Position: 1
     Delta: 1
     Explosion: 0

     Station is a switch possessed by all active players, with
     possible values Outside (default), Lower Deck, Engine Room and
     Bridge. While the Shuttle is on a journey, a player may flip eir
     Station switch at most once every 12 hours to te value of an
     adjacent room, where Lower Deck is adjacent to Enginge Room
     which is also adjacent to Bridge. This is known as walking to
     the room indicated by the new value. A player whose Station is x
     "is (stationed) in/on the x". The non-Outside values of the
     Station switches are also rooms aboard the Shuttle.
]]]

Enact a new rule:

[[[
     Journeys and the Enemy:

     The Shuttle regularly makes journeys between the wormholes. If a
     journey is not in place, any player can with notice initiate a
     new journey. That player then becomes the Enemy, eir Station
     switch is flipped to Outside, the Station switches of all other
     players are flipped to Bridge and all objects In Space are
     destroyed. The Enemy shall then as soon as possible post the map
     of the new journey, marking out only the two new wormholes and
     the new Shuttle. The position of the second wormhole is
     multiplied by the number of players on the Bridge to get the
     journey's Level, and the Enemy is awarded that many Threat
     Points (a non-tradeable currency).

     The Enemy can use these Threat Points to create Threats by
     defining the new Threat, paying its cost, and deploying it ready
     to attack. The cost of a Threat (minimum 0) is calculated by the
     following formula: H+|d|+e+a+s+10-|S-p| where the symbols denote
     the following values:
     H = its Maximum hit points
     d = its delta
     e = its explosion value
     a = its attack value (maximum 6)
     s = its scouting value
     p = its starting position
     S = the current position of the Shuttle
     The Enemy must also state its name and map symbol. Failure to
     name any of the required information means the Threat is not
     created. The Enemy may not have more than two Threats with the
     exact same stats in play at the same time. The Enemy cannot deploy
     any Threats until at least one day has passed since the start of
the journey.

     If the Shuttle reaches the end of the journey and is warped,
     each player aboard the Shuttle is rewarded a capacitor. If the
     Shuttle is destroyed, the Enemy is rewarded a Leadership Token
     and can only initiate the next journey with three support
     (anyone else still only needs notice).
]]]

Enact a new rule:

[[[
     Buttons:

     The Shuttle holds many buttons that can be pushed, causing the
     Shuttle to take certain actions at the start of he next day.
     Every player can push one button in eir Station once per day,
     and each button can be pushed once per day unless otherwise
     stated.

     Charges, measuring energy, is a currency whose ownership is
     restricted to Stations. When the Shuttle sets out for a new
     journey, all Stations have 2 charges each. Some of the actions
     the Shuttle takes cost energy, denoted by a number of Charges in
     brackets after the name of the associated button. These Charges
     are taken from the Station holding that button if possible;
     otherwise, the action fails.

     The following buttons, with corresponding Charge cost and
     Shuttle action, exist:

     Lower Deck:

        Reload - Charges are transferred from the Engine Room until
        either the ER is empty or the LD has at most 4 Charges.

        Pulse Cannon (1) - Fires the Pulse cannon, causing 3 damage to
        any other object with a position within 2 AUs of the Shuttle's.

        Missile Launch - Dispatches a Missile In Space. Its stats are:
        Maximum hit points: 5
        Position: One less than that of the Shuttle
        Delta: -2
        Explosion value: 2
        If there is a Missile next to the Shuttle, dispatching another
        fails. If a Missile ever passes another object, it counts as
        having collided with that object.

     Engine Room:

        Reactor Recharge - Awards the Engine Room 3 Charges.

        More Speed (1) - Increases the Shuttle's delta by one (maximum
        5)

        Turbo (2) - Increases the Shuttle's position b 2.

        Zero-Point Handbrake (1) - Reduces the Shuttle's delta to 0.

     Bridge:

        Reload - Analogous to the Reload button on Lower Deck.

        Heavy Laser Cannon (1) - Causes 6 damage to the closest object
        with a position between 1 and 9 greater than that of the
        Shuttle. The player pushing this button may choose to push it
        harder, which increses the Charge cost by 1, the damage caused
        by 3, and causes the Shuttle to reduce its position by one.
        Doing this when it causes the ship to collide with anything is
        the class-1 crime of Hoisting One's Own Petard.

        Recording the Captain's Log (1) - Causes the Shuttle to activate
        the very fancy recording device for full hologram recording,
        which causes all other systems to go offline. The Shuttle can
        then not take any other actions until the end of the next day.
        During this time any other player can, with 2 support, initiate
        a mutiny which moves the pusher of the Captain's Log button to
        the Outside. If this does not happen, the player doing the
        recording may save it within one day for a cost of 2 ergs. A
        player who successfully performs this action twice within a
        single month satisfies the winning condition of Continuity.
]]]

Enact a new rule:

[[[
     Space Flight:

     At the start of each day, the following procedure is performed:

     i) The Shuttle performs the action associated with the buttons
        pushed
     during the previous day. These are performed in the order the
     button
     were pushed. Any collisions occur.

     ii) Each threat performs its attack. This does damage equal to
         its attack value to the closest
     object in the direction it faces, maximum range 8 AUs. Each
     threat then generates a
     number of Threat Points equal to its scouting ability value,
     which are
     awarded the Enemy.

     iii) If the day began a new week, each object is moved according
          to its delta. Any collisions occur.

     iv) Any Threats deployed ready for action enter play. If any
         such Threat has the same position as another object the
         Threat is instead placed on the first space farther away
         from the Shuttle that is available. If no such position
         exists, the Threat is destroyed.

     A collision occurs when two objects have the same position. The
     object with the least amount of remaining hit points is
     destroyed, but causes the other object damage equal to its
     explosion value times its remaining hit points prior to the
     collision. If both objects have the same amount of hit points,
     the one with the higher explosion value is destroyed. If they
     have the same explosion value, they cause 2 damage to each other
     and move backwards one AU.
]]]

Enact a new rule:

[[[
     The Ship Computor

     The Ship Computor is an office, and tracks of the following:
     - Station switches
     - The map of all objects In Space
     - Charges
     - Threat Points
     - The Difficulty of the current journey
     - The stats of the Shuttle and all Missiles

     The Enemy is an imposed office, and tracks all Threats and their
     respective stats.
]]]
    """.trim(),

    // Removed "[probably Urgent]"
    "OFF: [Promotor] Distribution of Proposals 6834-6841 (Corrected)" to """
I assume the office of Promotor.


This distribution of proposals 6834-6841
initiates the Agoran Decisions on whether to adopt them.  The eligible
voters are the active players at the time of this distribution, and
the vote collector is the Assessor. The valid options on each decision
are FOR and AGAINST (PRESENT is also a valid vote). Each proposal is
hereby assigned the corresponding ID number listed with it. Each proposal
is Ordinary, the the Chamber of each proposal is the body consisting of
the active players of Agora at the time of this distribution

NUM  I AI  SUBMITTER           TITLE
6834 1 3.0 G.                  voter defaults
6835 1 1.0 Keba                Props should not lead to a win
6836 1 3.0 G.                  Reward Urgency
6837 0 1.0 Keba                Leet fix
6838 1 1.7 Keba                infinitive wins?
6839 1 2.0 G.                  Slow Demarcation
6840 1 2.0 G.                  Coup Bug Fix
6841 1 3.0 Murphy              Clarify voting limits


Proposal ID numbers:
    highest orderly: 6841
    disorderly: none


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6834 (Purple, AI=3.0, Interest=1) by G.

voter defaults

This is an Urgent Proposal

Amend Rule 683(Voting on Agoran Decisions) by replacing:
         The voting limit of an eligible voter on an Agoran
     decision is one, except where rules say otherwise.
with:
         Except where rules say otherwise, the eligible
     voters on an Agoran Decision are the active players at
     the beginning of the voting period, and the voting limit
     of an eligible voter on an Agoran decision is one.


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6835 (Green, AI=1.0, Interest=1) by Keba

Props should not lead to a win

Amend Rule 2287 "Props" by removing:

       Upon a win announcement that one or more players each possess at
       least 30 props, all those players satisfy the Winning Condition
       of Respect.

       Cleanup procedure: For each of those players, all props are
       destroyed and 14 props are created in their possession.


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6836 (Purple, AI=3.0, Interest=1) by G.

Reward Urgency

Amend the Rule entitled "Urgent Proposals" by replacing:

        The Promotor CAN distribute an Urgent Proposal as soon as it
        becomes Distributable, and e SHALL do so within four
        days unless it becomes undistributable in the mean time.
        Failure to do so is the Class 1 Crime of Lack of Urgency.

with:

        The Promotor CAN distribute an Urgent Proposal as soon as it
        becomes Distributable, and e SHALL do so within four
        days unless it becomes undistributable in the mean time.
        The Assessor SHALL make a reasonable attempt to resolve a
        decision to adopt an urgent proposal within 4 days of its
        voting period ending.  Failure to meet these deadlines is
        the Class 1 Crime of Lack of Urgency.

and by appending:

        If the Promotor distributes an Urgent Proposal within 48
        hours of its becoming distributable, e earns a farad.  If
        the Assessor resolves a decision to adopt an urgent
        proposal within 48 hours of its voting period ending, e
        earns a farad.


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6837 (Green, AI=1.0, Interest=0) by Keba

Leet fix

f the Proposal entitled "Leet Leadership" has been enacted and created
a Rule entitled "Leet Leadership" amend this Rule by replacing "exact"
with "exactly" and adding the following paragraph:

       For the purpose of this rule a word is a set of characters
       separated by whitespaces, if this set contains at least one
       letter.


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6838 (Green, AI=1.7, Interest=1) by Keba

infinitive wins?

Amend Rule 2293 "Leadership Tokens" by replacing:

       A player CAN redeem 3 Leadership Tokens in eir possession to
       satisfy the Winning Condition of Leadership.

with:

       If a player possesses at least 3 Leadership Tokens, e CAN redeem
       all Leadership Tokens in eir possession to satisfy the Winning
       Condition of Leadership.

[If a player uses a scam to possess *many* Leadership Tokens, e should
not win 100 times, should e? You think, this will never happen? It could
already have happened, if I had been clever enough.]


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6839 (Purple, AI=2.0, Interest=1) by G.

Slow Demarcation

Amend Rule 402 (Identity of the Speaker) by appending the
following paragraph:

     As soon as possible after the beginning of each month,
     the Herald CAN and SHALL randomly select half of the
     Marked players (rounded down), and Unmark the selected
     players by announcement.


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6840 (Purple, AI=2.0, Interest=1) by G.

Coup Bug Fix

Any coup that has begun since September 1, 2010 while a
previous coup was in progress (i.e. begun and not resolved) is
hereby deemed to have failed to begin (e.g. is treated as if it
were IMPOSSIBLE to so begin a coup at the time) and all game
effects of successfully starting or resolving such a coup are
thus nullified.

If a coup has been resolved since Sept 1, 2010, all Rebels
hereby cease being Rebels.

Amend Rule 2270 (Coups D'etat) by replacing:

       When a player begins a Coup D'etat (a coup) as explicitly
       permitted by the Rules, the following events take place in
       order:
with:
       When a player begins a Coup D'etat (a coup) as explicitly
       permitted by the Rules, the following events take place in
       order.  A coup CANNOT be begun if a previous coup has
       begun and not been resolved.

and by appending the following to the end of the Rule:

       (iii) All Rebels cease being Rebels.


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 6841 (Green, AI=3.0, Interest=1) by Murphy

Clarify voting limits

Amend Rule 683 (Voting on Agoran Decisions) by replacing this text:

     where N is the entity's voting limit on that decision.

with this text:

     where N is the entity's voting limit on that decision as of the
     end of its voting period.

Amend Rule 2156 (Voting on Ordinary Decisions) to read:

     The eligible voters on an ordinary decision are the players who
     were active at the start of its voting period. The voting limit
     of a player on an ordinary decision is defined as follows:

followed by just the numbered items from Rule 2279 (Voting Limits on
Ordinary Decisions).

Repeal Rule 2279.

Amend Rule 2280 (Implicit Votes) to read:

     When an eligible voter on an Agoran decision casts ballots
     without explicitly specifying the number (e.g. "FOR" instead of
     "FOR*1" or "FOR*3"), the number is considered to be equal to eir
     voting limit on that decision.


""",
    // Joined very long title of P7084 onto one line; Removed extraneous blank line between header/title of P7086
    "OFF: Distribution of Proposals 7084-7093" to """
I hereby distribute each listed proposal, initiating the Agoran
Decision of whether to adopt it.  For this decision, the eligible
voters are the active first-class players at the time of this
distribution, the vote collector is the Assessor, and the valid
options are FOR and AGAINST (PRESENT is also a valid vote).  Then,
I assign each listed proposal the ID number specified under "NUM".

Pool report: The Proposal Pool is empty.

NUM  AI  AUTHOR           TITLE

7084 2   omd              I see nothing wrong with letting one
......                    imaginary person act on behalf of another
......                    imaginary person
7085 1   Tanner L. Swett  Horizontal rules
7086 3   G., etc.         Jig-jiggery jig-jiggery
7087 1   omd              CV
7088 3   omd              Refactor 2, 3, 283
7089 2   omd              Waiting a week makes the game too slow
7090 2   omd              General costs
7091 2   omd              Point Vouchers
7092 1.7 Walker           Speed Up Victory
7093 1   Walker           Enforcement Enforcement

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7084 (AI=2) by omd
I see nothing wrong with letting one imaginary person act on behalf of another imaginary person

Amend Rule 103 (The Speaker) by replacing "single first-class player"
with "single player".

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7085 (AI=1) by Tanner L. Swett
Horizontal rules

"A rule is called horizontal if its text consists entirely of
hyphens."

Enact a new rule, titled "Standard Short Horizontal Rule", with the
following text:
"----------------------------------------------------------------"

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7086 (AI=3) by G., omd, please:
Jig-jiggery jig-jiggery

[Puts "Effects are effective" back into "re-jiggery" and unites it
  all together; effects with effects, causes with causes].

If proposal 7083 has not been adopted, the rest of this proposal has
no effect.

Amend R106 to read:
    If the option selected by Agora on a decision about whether to
    adopt a proposal is ADOPTED, then the proposal in question is
    adopted, and unless other rules prevent it from taking effect,
    its power is set to the minimum of four and its adoption index,
    and then it takes effect.  Except as prohibited by other rules,
    a proposal that takes effect CAN and does, as part of its effect,
    apply the changes that it specifies.  If the proposal cannot make
    some such changes, this does not preclude the other changes from
    taking place.

    If there is no Agoran Decision to adopt a particular proposal that
    has an outcome of ADOPTED, that proposal CANNOT take effect, rules
    to the contrary notwithstanding.

    Preventing a proposal from taking effect is a secured change;
    this does not apply to generally preventing changes to specified
    areas of the gamestate, nor to a proposal preventing itself from
    taking effect (its no-effect clause is generally interpreted as
    applying only to the rest of the proposal).


Amend the Rule entitled "Proposals" by amending its first paragraph
to read:

    A proposal is a fixed body of text which has been made into a
    proposal using a process specifically described in the Rules.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7087 (AI=1) by omd
CV

Amend Rule 2333 (Contests) by replacing:

     The contest's instructions should include conditions under which
     one or more persons win the contest. When one or more persons
     win a contest, those persons satisfy the Victory Condition of
     Victory.

with:

     The contest's instructions should include conditions under which
     persons "win the contest".  Upon an announcement by the
     contestmaster that one or more persons satisfy those conditions,
     all those persons satisfy the Victory Condition of Victory.
     Intentionally making a false such announcement is the Class-4
     Crime of Gaming the System.

[This just restores the old language about the contestmaster making an
announcement, which I think fits much better with the spirit of the
rule than scshunt's platonic version.]

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7088 (AI=3) by omd
Refactor 2, 3, 283

Retitle Rule 1698 (Agora Is a Nomic) to "Agora Is A Nomic", and amend
it to read:

     Agora is ossified if it is IMPOSSIBLE for any reasonable
     combination of actions by players to cause arbitrary rule
     changes to be made and/or arbitrary proposals to be adopted
     within a four-week period.

     If, but for this rule, the net effect of a proposal would cause
     Agora to become ossified, it cannot take effect, rules to the
     contrary notwithstanding.  If any other single change to the
     gamestate would cause Agora to become ossified, it is cancelled
     and does not occur, rules to the contrary notwithstanding.

[Substantive changes: clarifies what "something other than a Nomic"
(from the newly added paragraph) is, and adds "reasonable" as an
anti-Vladivostok measure.]

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7089 (AI=2) by omd
Waiting a week makes the game too slow

[Allows me to distribute proposals submitted this week if there is
volume left over.

(Did I somehow already submit this proposal?)]

Amend Rule 1607 (The Promotor) by replacing:

     The Promotor SHALL NOT distribute any other proposals.

with:

     In a given Agoran week, the Promotor SHALL NOT distribute a
     number of proposals greater than the Legislative Volume.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7090 (AI=2) by omd
General costs

[Useful for promises.]

Retitle Rule 2349 (Spending Points) to Costs, and amend it to read:

     The documents defining the conditions for performing an action
     can define a cost in assets, optionally specifying a recipient
     entity; paying the cost becomes such a condition.  A person has
     paid the cost for an attempt to perform the action if e
     transferred those assets to the recipient entity, if one was
     specified, or destroyed them otherwise:

      (1) in the same message as the attempt,
      (2) clearly indicating that the transfer or destruction was a
          payment for that attempt, and
      (3) not indicating that it was a payment for any other attempt.

Amend Rule 1607 (The Promotor) by replacing "as a Spending Action"
with "for a cost of 5 points".

[And a bugfix - I think, if you felt like performing 50 Priority
increases, you could do it and win with the same points.]

Amend Rule 2322 (Winning by Points) by replacing:

     A player CAN destroy 250 points in the possession of any
     indicated player to cause the indicated player to satisfy the
     Victory Condition of Accumulation.

with:

     A player CAN destroy 250 points in the possession of any
     indicated player (without indicating that the destruction is a
     payment) to cause the indicated player to satisfy the Victory
     Condition of Accumulation.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7091 (AI=2) by omd
Point Vouchers

Create a new Power-2 Rule:

     Point Vouchers are a class of assets tracked by the Scorekeepor;
     multiple Point Vouchers with the same creation date are
     fungible.  A player CAN, as a Spending Action with a cost of one
     point, create a Point Voucher in eir possession.  At the start
     of the second Agoran week after a Point Voucher is created, its
     current owner gains one point and the Voucher is destroyed.

If Rule 2349 does not define Spending Actions, amend that rule by
replacing "as a Spending Action with" with "for"

[Suppose I create a lottery where everyone transfers me points, and I
award the lot to a random participant; but in the process I get over
250 points and someone makes me win.  This mechanism works around that
without making it too easy to hoard points.]

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7092 (AI=1.7) by Walker
Speed Up Victory

[ This does not clash with my other victory proposal. ]

Retitle Rule 2343 (Victory Cases) to "Victory".

Replace the first paragraph of Rule 2343 with:

     A person can publish a Declaration of Victory by announcement,
     explaining the Victory Condition they believe they have met and
     how they met it. If a Victory Case is initiated regarding a
     Declaration of Victory, no Declarations of Victory for that win
     can be announced after that point. Otherwise, the person is
     deemed to have won the game of Agora as described in the
     Declaration of Victory one week after eir Declaration of Victory
     is published. The Declaration of Victory's claim that the
     specified player won in the specified way becomes self-ratifying
     at this point. The Herald SHALL award the winner the Patent
     Title Champion as soon as possible afterwards.

     Victory cases are a subclass of judicial cases. For one week
     after the publication of a Declaration of Victory, any player
     CAN initiate a Victory case by announcement, indicating the
     Declaration of Victory e believes to be false and eir arguments
     and evidence supporting this.

and in the same Rule replace "appropriate if the Victory Condition was
satisfied as described" with "appropriate if the Victory Condition was
satisfied as described in the Declaration of Victory" and replace "in
effect for two weeks" with "in effect for one week".

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7093 (AI=1) by Walker
Enforcement Enforcement

Amend Rule 2143 (Official Reports and Duties) by appending:

     If a player violates a Rule by failing to meet the requirements
     of an office, such as performing eir weekly or monthly duties,
     then the IADoP SHALL initiate a valid criminal case on the
     matter as soon as possible afterwards. Cases initiated in this
     manner do not count towards the IADoP's excess case limit, Rules
     to the contrary notwithstanding.
""",
    // Put very long title of 7205 on a single line
    "OFF: Distribution of Proposals 7201-7206" to """
I hereby distribute each listed proposal, initiating the Agoran
Decision of whether to adopt it.  For this decision, the eligible
voters are the active first-class players at the time of this
distribution, the vote collector is the Assessor, and the valid
options are FOR and AGAINST (PRESENT is also a valid vote).  Then, I
assign each listed proposal the ID number specified under "NUM".

Pool report: The Proposal Pool is empty.

NUM  AI  AUTHOR        TITLE

7201 3   G.            Untitled
7202 2   Murphy, etc.  Effective ballot fees
7203 2   Murphy        Vote early and often
7204 1   omd           Golem fix
7205 1   omd           Tapping the brakes is not a good idea [...]
7206 2   BuckyBot      Golem Self Defense

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7201 (AI=3, Ordinary) by G.
Untitled

Amend Rule 2350 (Proposals) by removing 'and an associated title'.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7202 (AI=2, Ordinary) by Murphy, omd

Effective ballot fees

Change the power of Rule 2364 (Ballot Fees) to 2.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7203 (AI=2, Ordinary) by Murphy
Vote early and often

If Rule 683 (Voting on Agoran Decisions) defines the default voting
limit of an eligible voter on an Agoran decision, then amend Rule
2154 (Election Procedure) by removing this text:

      3) Each eligible voter's voting limit is one.

and renumbering 4) to 3).

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7204 (AI=1, Ordinary) by omd
Golem fix

Change the power of Rule 2361 (Slave Golems) to 3, and amend it by
replacing "cause it to take actions that are not otherwise IMPOSSIBLE"
with "send a public message on its behalf".

[The current mechanism has weird interactions with higher-powered
Rules and actions that are performed by sending a message rather than
by announcement, and I am skeptical that my recent scam failed in a
way that is not patchable (unless Golems are generally unable to act).
 In particular, even if the mechanism is part of the specification of
an action, since Golems are *not* sending messages and no rule is
pretending they are, it's equally valid to say "I cause my Golem to do
X without objection" as "I cause my Golem to do X by announcement"
(since "by announcement" is defined with reference to sending
messages) - in both cases the purported mechanism is a lie.  I would
have brought this up in CFJ 3171, but I wasn't thinking straight.
Durr.]

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7205 (AI=1, Ordinary) by omd
Tapping the brakes is not a good idea when I forgot to distribute proposals for a whole month but ended up with only 10 to distribute, and the weekly metric is a bit confusing

Amend Rule 2365 (Pool Fees) by replacing "at least five proposals have
been created earlier in the week" with "at least ten proposals are in
the Proposal Pool".

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7206 (AI=2, Ordinary) by BuckyBot
Golem Self Defense

Wherever Rule 2360 contains the text "The Golemkeepor CAN destroy any
Golem Without Objection.", change that text to "The Golemkeepor CAN
destroy any Golem Without Objection. A Golem is eligible to Object to
any such intent to destroy it."
""",
    // Add blank line between metadata and text
    "OFF: [Promotor] Distribution of Proposals 7284-7297" to """
I hereby distribute each listed proposal, initiating the Agoran
Decision of whether to adopt it.  For this decision, the eligible
voters are the active first-class players at the time of this
distribution, the vote collector is the Assessor, and the valid
options are FOR and AGAINST (PRESENT is also a valid vote).  Then,
I assign each listed proposal the ID number specified under 'NUM'.

NUM  AI  AUTHOR      TITLE
7284 3.0 FKA441344   No Zero Length Reports
7285 2.0 omd.        No News Is No News
7286 1.0 FKA441344   No News Is Some News
7287 2.0 G.          Faucet Fixing
7288 2.0 FKA441344   (none)
7289 3.0 G.          Indeterminism
7290 3.0 G.          Breaking Promise Circles
7291 1.0 FKA441344   (none)
7292 1.0 Machiavelli (none)
7293 1.7 Murphy      Splitting hairs
7294 1.7 Murphy      Splitting hairs the other way
7295 1.0 scshunt     Fuel Up
7296 3.0 scshunt     Power On
7297 3.0 scshunt     Slow Down

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7284
Title: No Zero Length Reports
Author: FKA441344
AI: 3.0
Chamber: Ordinary

 Amend Rule 2162 by replacing the text
 {
         Optionally, exactly one office whose holder tracks instances
         of that switch.  That officer's report includes the value of
         each instance of that switch whose value is not its default
         value.
 }
 with the text
 {
         Optionally, exactly one office whose holder tracks instances
         of that switch.  That officer's report includes the value of
         each instance of that switch whose value is not its default
         value, or, if there are no such instances, the fact that
         there are no such instances.
 }.

Amend Rule 1607 by replacing the text
 {
      The Promotor's report includes a list of all proposals in the
      Proposal Pool.
 }
 with the text
 {
      The Promotor's report includes a list of all proposals in the
      Proposal Pool, or, if there are no such proposals, the fact
      that there are no such proposals.
 }.

Amend Rule 991 by replacing the text
 {
      The CotC's report includes the
      status of all judicial cases without a judgement.
 }
 with the text
 {
      The CotC's report includes the status of all judicial cases
      without a judgement, or, if there are no such cases, the fact
      that there are no such cases.
 }.
 Amend Rule 2166 by replacing the text
 {
      That entity's report includes a list of all instances of that
      class and their owners.
 }
 with the text
 {
      That entity's report includes a list of all instances of that
      class and their owners, or, if there are no such instances, the fact
      that there are no such instances.
 }.
 Amend Rule 2337 by replacing the text
 {
      Horton's weekly report includes the text, author, conditions, and
      owner of all existing promises.
 }
 with the text
 {
      Horton's weekly report includes the text, author, conditions, and
      owner of all existing promises, or, if there are no such promises,
      the fact that there are no such promises.
 }.

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7285
Title: No News Is No News
Author: omd.
AI: 2.0
Chamber: Ordinary

If Rule 2162 (Switches) contains a paragraph reading, in its entirety:

      c) Optionally, exactly one office whose holder tracks instances
         of that switch.  That officer's report includes the value of
         each instance of that switch whose value is not its default
         value.

append to it:

      (If such an office's weekly report is empty, and has not only
      recently become that way, that officer is ENCOURAGED not to send
      public messages merely stating the fact.)

[Grump.]

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7286
Title: No News Is Some News
Author: FKA441344
Coauthors: Murphy
AI: 1.0
Chamber: Ordinary

 Create a new rule with title "No News Is Some News" and this text:
       If the rules define a report as including a list, then while that
       list is empty, that report includes the fact that it is empty.

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7287
Title: Faucet Fixing
Author: G.
AI: 2.0
Chamber: Ordinary

Increase the power of the Rule "The Justiciar" to 2.
[Need to do this to overrule Offices]

Amend the Rule entitled "The Justiciar" to read:

      The Justiciar is an office; its holder is responsible for hot and
      cold running justice.

      Rules to the contrary notwithstanding, the Clerk of the Courts
      CANNOT assume or be nominated for the office of Justiciar, and
      the Justiciar CANNOT assume or be nominated for the office of
      Clerk of the Courts.

      A CFJ may be submitted to the Justiciar.  For such a CFJ, the
      Justiciar shall perform all duties and fulfill all roles that
      would otherwise be assigned to the Clerk of the Courts. This
      takes precedence over Rules that would otherwise assign duties
      and roles regarding a CFJ to the Clerk of the Courts.

      All persons are encouraged to submit a CFJ to the Justiciar only
      when there is a good reason not to submit it to the Clerk of the
      Courts.

      If the Justiciar's Posture is neither Standing nor Sitting, then
      it is flipped to Sitting.


Amend Rule 1871 (The Standing Court) by replacing:
      * Supine (default if the default would otherwise be undefined).
with
      * Supine (default if the current value of Initial Posture is
        undefined; otherwise the current value of Initial Posture is the
        default).

and by appending this paragraph:

       Initial Posture is an Agora Nomic switch, tracked by the Justiciar
       in eir monthly report, with the same values as Posture and a
       default value of Supine.  The Justiciar CAN flip Initial Posture
       with Support.

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7288
Title: (none)
Author: FKA441344
AI: 2.0
Chamber: Ordinary

 Amend Rule 2166 (Assets) by replacing
 {
      any player CAN transfer or destroy it without objection.
 }
 with
 {
      any player CAN transfer or destroy it with 1.5 Agoran consent
      or without 2 objections.
 }.
}.

I create a proposal with adoption index 1.5 and text
{
 Amend the rule titled {The Justiciar}  by replacing
 {
      with the same values and default value as Posture.
 }
 with
 {
      with the same values as Posture, and default value Supine.
 }.

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7289
Title: Indeterminism
Author: G.
AI: 3.0
Chamber: Ordinary

Amend Rule 1023 (Common Definitions) by appending:

       (c) If a regulated value, or the value of a conditional, or
           a value otherwise required to determine the outcome of
           a regulated action, CANNOT be reasonably determined
           (without circularity or paradox) from information
           reasonably available, or if it alternates instantaneously
           and indefinitely between values, then the value is
           considered to be Indeterminate, otherwise it is
           Determinate.

[Note that many things can be naturally indeterminate to start out;
e.g. if a conditional vote depends on events that may happen later
in the voting period.  So the fixes below and future additions need
to specify the time at which the indeterminism is measured for legal
effect; e.g. at the end of the voting period, or when a promise is
cashed)].

Amend Rule 2127 (Conditional Votes) by replacing:
                                     and is clearly specified if and
       only if the value of the condition(s) can be reasonably
       determined (without circularity or paradox) from information
       reasonably available during the voting period.
with:
                                     and is clearly specified if and
       only if the value of the condition(s) is/are determinate at
       the end of the voting period.


Amend Rule 2162 (Switches) by appending:

       If an action or set of actions would cause the value of an
       instance of a switch to become indeterminate, the instance
       instead takes on its last determinate and possible value,
       if any, otherwise it takes on its default value.


Amend Rule 2338 (Cashing Promises) by replacing:
       for the promise to be cashed are true
with:
       for the promise to be cashed are true and determinate

and by replacing:
       and all such conditions are true
with:
       and all such conditions are true and determinate

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7290
Title: Breaking Promise Circles
Author: G.
AI: 3.0
Chamber: Ordinary

If Rule 1023 (Common Definitions) contains the word 'Indeterminate'
then:

  Amend Rule 2338 (Cashing Promises) by inserting the following
  paragraph after the second paragraph:

      If cashing a promise would lead, through its own actions
      or actions directly caused by its cashing, to a value being
      indeterminate an instant after the promise is cashed, then
      (other provisions of this or other rules notwithstanding)
      it CANNOT be cashed.


If Rule 1023 (Common Definitions) does NOT contain the word
'Indeterminate' then:

  Amend Rule 2338 (Cashing Promises) by inserting the following
  paragraph after the second paragraph:

      If cashing a promise would lead, through its own actions
      or actions directly caused by its cashing, to a value being
      undefined or unable to be determined (without circularity
      or paradox) with reasonable effort an instant after the
      promise is cashed, then (other provisions of this or other
      rules notwithstanding) it CANNOT be cashed.

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7291
Title: (none)
Author: FKA441344
AI: 1.0
Chamber: Ordinary

 Create a rule with text
 {
  if any of the players of this game should find themselves in any
other game of Nomic, they must make this motion in that game of Nomic
if it has not been made in that game yet, and if this motion comes up
for voting, they must vote for it. The motion must be modified to fit
the motion protocol of that game, but no more.
 }.

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7292
Title: (none)
Author: Machiavelli
AI: 1.0
Chamber: Ordinary

 Create a rule with text
 {
  if any of the players of this game should find themselves in any
other game of Nomic, they must make this motion in that game of Nomic
if it has not been made in that game yet, and if this motion comes up
for voting, they must vote for it. The motion must be modified to fit
the motion protocol of that game, but no more.
 }.

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7293
Title: Splitting hairs
Author: Murphy
Coauthors: G.
AI: 1.7
Chamber: Ordinary

Amend Rule 591 (Inquiry Cases) by replacing this text:

      The valid judgements for an inquiry case are as follows, based
      on the truth or falsity of the statement at the time the inquiry
      case was initiated:

with this text:

      The valid judgements for an inquiry case are as follows, based
      on the truth or falsity of the statement at the time the inquiry
      case was initiated (if its truth value changed at that time, then
      its initial truth value is used):

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7294
Title: Splitting hairs the other way
Author: Murphy
Coauthors: G.
AI: 1.7
Chamber: Ordinary

Amend Rule 591 (Inquiry Cases) by replacing this text:

      The valid judgements for an inquiry case are as follows, based
      on the truth or falsity of the statement at the time the inquiry
      case was initiated:

or, if it does not contain that text, then this text:

      The valid judgements for an inquiry case are as follows, based
      on the truth or falsity of the statement at the time the inquiry
      case was initiated (if its truth value changed at that time, then
      its initial truth value is used):

with this text:

      The valid judgements for an inquiry case are as follows, based
      on the truth or falsity of the statement at the time the inquiry
      case was initiated (if its truth value changed at that time, then
      its final truth value is used):

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7295
Title: Fuel Up
Author: scshunt
AI: 1.0
Chamber: Ordinary

Simultaneously award N props to each player, where N is, for that
player, max(14 - P, 0), where P is the number of props e owns.

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7296
Title: Power On
Author: scshunt
AI: 3.0
Chamber: Ordinary

Amend the rule Democratization by appending
{{
      Changing the voting limit of an entity on a Democratic decision is
      secured with power threshold 3.
}}

Amend rule 1950 by replacing
{{
      The eligible voters on a decision with an adoption index are
      those entities that were active first-class players at the start
      of its voting period.  Setting or changing an entity's voting
      limit on such a decision is secured with a power threshold of 2
      if the decision is Ordinary, or 3 otherwise.
}}
with
{{
      The eligible voters on a decision with an adoption index are
      those entities that were active first-class players at the start
      of its voting period.  Setting or changing an entity's voting
      limit on such a decision is secured with a power threshold of 2.
}}

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

ID: 7297
Title: Slow Down
Author: scshunt
AI: 3.0
Chamber: Ordinary

Amend the rule 'Props' by replacing
{At the beginning of each week}
with
{At the beginning of each month}
[Resetting every week when a player can make one transfer every week
will leave everyone at 14 props perpetually unless there is a serious
concerted effort]

{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}

-scshunt
""",
    // Remove "[Re-distribution with corrected text.]" line on 7405
    "OFF: Distribution of Proposals 7405, 7414-7415" to """
I hereby distribute each listed proposal, initiating the Agoran
Decision of whether to adopt it.  For this decision, the eligible
voters are the active first-class players at the time of this
distribution, the vote collector is the Assessor, and the valid
options are FOR and AGAINST (PRESENT is also a valid vote).

Pool report: The Proposal Pool is empty.

NUM  AI  AUTHOR      TITLE

7405 2   omd         Nerf VCs
7414 1   Roujo       (untitled)
7415 1   G.          Classic Nomic Ribbon

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7405 (AI=2, Ordinary) by omd
Nerf VCs

Amend Rule 2389 (Ordinary Chamber) by replacing:

      Whenever a proposal is adopted, its author gains a number of
      VCs equal to the integer part of the proposal's adoption index,
      and each of the proposal's co-authors who is a first-class
      player gains one VC.

with:

      Whenever a proposal is adopted, its author gains one VC.

and by replacing "gains two VCs", if present, with "gains one VC".

[Higher-AI proposals aren't necessarily or generally better,
especially not N times as valuable as an AI-1 proposal, and the
current system seems to allow for very fast voting limit increases.
The last bit nerfs my own salary proposal because the original salary
is intended to keep pace with proposal awards.]

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7414 (AI=1, Ordinary) by Roujo
(untitled)

In Rule 2369, "Foreign Relations", add the following paragraph after
the first one:
      {
      Sanity is a foreign nomic switch, tracked by the
Ambassador-At-Large, with values Unknown (default), Sane, Insane and
B-level. Players SHOULD NOT attempt to make sense of what goes on in
Insane or B-level foreign nomics. Attempting to make sense of what
goes on in a B-level foreign nomic is the Class-2 Crime of Suffusion
of Yellow. The Ambassador-at-Large CAN, with Agoran Consent, switch a
foreign nomic's sanity to any value. The Ambassador-at-Large SHOULDN'T
switch a foreign nomic's sanity to Insane. Switching a foreign nomic's
value to B-level is the Class-4 Crime of The King in Yellow.
      }

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7415 (AI=1, Ordinary) by G.
Classic Nomic Ribbon

Amend Rule 2387 (Ribbons) by replacing:

      (+L) A player qualifies for a Lime Ribbon, if e was the
           co-author of at least three Proposals adopted in the
           previous week.
with:
      (+L) If a proposal is adopted, and if only one Player
           other that the proposal's author cast (and did not
           retract) one or more valid votes AGAINST the proposal,
           than both the casting player and the author of the
           proposal earn a Lime Ribbon.

[vc awards now make multiple co-author proposals too worthwhile
and a simple little scam with lots of little proposals.  Therefore
changing the ribbon award to a classic nomic Prisoners' Dilemma].     
""",
    // Put title of 7443 on one line
    "OFF: [Promotor] Distribution of Proposals 7437-7443" to """
I hereby distribute each listed proposal, initiating the Agoran
Decision of whether to adopt it.  For this decision, the eligible
voters are the active first-class players at the time of this
distribution, the vote collector is the Assessor, and the valid
options are FOR and AGAINST (PRESENT is also a valid vote).

Pool report: The Proposal Pool is empty.

NUM  AI  AUTHOR       TITLE

7437 1   Roujo        (untitled)
7438 2   ais523       Fix adoption index tracking
7439 1   woggle       he -> e
7440 1   woggle       When ., -> When ,
7441 1   Walker       (untitled)
7442 1   scshunt      No Recordkeeping Burden
7443 1   Machiavelli  Promises do an acceptable job of handling this,
......                but a specialized mechanism would probably be
......                more convenient and less error-prone

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7437 (AI=1, Ordinary) by Roujo
(untitled)

In rule 2369, "Foreign Relations", replace "Hostile, and Abandoned"
with "Hostile, Abandoned and Over".

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7438 (AI=2, Ordinary) by ais523
Fix adoption index tracking

In rule 1950, after "secured with a power threshold of 2", add ", and
tracked by the Assessor". [This makes more sense than requiring the
Promotor to report it, as they both need the information, and the
Assessor is in charge of deadline extensions. It's close, though.]

At the end of rule 1950, add "24 hours after an Agoran Decision is
resolved, its Adoption Index and Chamber are flipped to their default
values." [Removes the need to track pointless values on old proposals.]

For each resolved Agoran Decision, and each Agoran Decision created more
than 90 days ago, flip its Adoption Index and Chamber to their default
values.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7439 (AI=1, Ordinary) by woggle
he -> e

Amend rule 2370 (The Ambassador-At-Large) by replacing "he becomes" with "e
becomes".

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7440 (AI=1, Ordinary) by woggle
When ., -> When ,

Amend rule 2387 by replacing "question.," with "question,"

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7441 (AI=1, Ordinary) by Walker
(untitled)

Enact a Rule with the following text:

      Agora's Twentieth Birthday shall be known as the Vigintennial.
      The Comptroller of the Lord Chamberlain's Office is an office;
      its holder is responsible for organising the celebration of the
      Vigintennial.

      A player CAN, with two support, make a former player of Agora an
      Ancient; the Comptroller SHALL make a reasonable effort to
      invite each Ancient to contribute to and partake in the
      celebration of the Vigintennial.

      The Comptroller SHALL, as part of eir weekly duties, submit a
      proposal regarding the Vigintennial and make a reasonable effort
      to ensure that it is distributed.

      The Comptroller SHALL be responsible, as part of eir weekly
      duties, for publicising the Vigintennial both to former players
      of Agora and to the general public, and for encouraging em to
      participate in its celebration.

      The Comptroller of the Lord Chamberlain's Office is a patent
      title; in a timely fashion after the Vigintennial, the Herald
      SHALL award it to the holder of the office of the same name.

      When Agora is at least twenty years and one week old, any player
      CAN cause this Rule to repeal itself by announcement.

Enact a Rule with the following text:

      The Comptroller CAN make a non-contest document into a
      Vigintennial contest or amend the text or gamestate of a contest
      without 3 objections; he then becomes that contest's
      contestmaster.

      The Vigintennial contest's instructions should include
      conditions under which persons "win the contest".  Upon a true
      announcement by the Comptroller that one or more persons satisfy
      those conditions, all those persons satisfy the Victory
      Condition of Jubilee.  Intentionally making a false such
      announcement is the Class-4 Crime of Gaming the System.

      The Comptroller SHALL obey the text of a Vigintennial contest.

      The Comptroller is, prima facie, the adjudicator of Vigintennial
      contest instructions and disputes.  Disputes should in general,
      be resolved with the spirit of the instructions in mind.  For
      the purpose of determining the internal gamestate of a
      Vigintennial contest (including whether its Comptroller falsely
      announced that persons won the contest), its instructions are
      generally interpreted in the same manner as a rule, but the
      reasonable opinion of the Comptroller takes precedence.

      If Agora is more than twenty years and one week old, any player
      CAN cause this Rule to repeal itself by announcement.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7442 (AI=1, Ordinary) by scshunt
No Recordkeeping Burden

Submitting a promise with an intent other than that the Promise be
given to another player or to
      the Tree as a form of binding obligation on the submitter is the
Crime of Empty Promise.

      The Crime of Empty Promise is Class 3, except when the promise
in question has empty or
      irrelevant text, or one or more conditions which are known to be
indeterminate and are unrelated
      to the game state or game play, in which case it is Class 5.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7443 (AI=1, Ordinary) by Machiavelli
Promises do an acceptable job of handling this, but a specialized mechanism would probably be more convenient and less error-prone

Create a rule, titled "Trade Offers":

      A person (the Seller) CAN create a Trade Offer by announcement,
      specifying a set of assets e offers to trade (the Wares), and a
      set of assets e wishes to receive in exchange (the Tender).

      Any other person (the Buyer) CAN accept a Trade Offer by
      announcement.  When this happens, if the Seller owns the Wares
      and CAN transfer them to the Buyer, and the Buyer owns the
      Tender and CAN transfer it to the Seller, then the Wares are
      transferred to the Buyer, the Tender is transferred to the
      Seller, and the Trade Offer is destroyed.  If any part of this
      transaction would fail, the entire transaction fails.

      A Seller can destroy (syn. revoke) eir own Trade Offers by
      announcement.  Trade Offers are automatically destroyed 4 days
      after they are created.
""",
    // Remove note in proposal metadata (containing an alternate distribution attempt)
    "OFF: [Promotor] Emergency Distribution of Proposal 7568" to """
I assume Promotor, just in case.

I hereby distribute the following proposal, initiating the Agoran
Decision of whether to adopt it.  For this decision, the eligible
voters are the active first-class players at the time of this
distribution, the vote collector is the Assessor, and the valid
options are FOR and AGAINST (PRESENT is also a valid vote).

(The above should be unambiguous.)

Quorum is unknown, but might be 8, so please vote.

/!\

Please explicitly vote once (FOR*1) on this proposal so that there is
no ambiguity with voting limits.

/!\

NUM  AI  PF C AUTHOR      TITLE

7568 3    0 O omd, etc.   Agora pulls a B + some ratifications

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7568 (AI=3, PF=Y0, interest index=1?, Ordinary) by omd, Fool
Agora pulls a B + some ratifications

In rule 1551 (Ratification, Power=3.1), replace the sentence:

      Ratifying a public document is secured.

with:

      Ratifying a public document is secured with power threshold 3.

Ratify the following public documents:

    - woggle's public message of 27 July 2013 titled "OFF:
      [Rulekeepor] Short Logical Rule]set"
    - omd's public message of 30 July 2013 titled "OFF: [Registrar]
      Census"
    - the portions of Roujo's public message of 29 July 2013 titled
      "OFF: [CotC] Docket" regarding Posture and Initial Posture
    - Walker's public message of 12 July 2013 titled "OFF:
      [Ambassador-at-Large] Foreign Relations"
    - the portions of Walker's public message of 28 July 2013 titled
      "OFF: [Yak Herdor] Himalayan Survey" the Yak Herdor is required
      to report on [omitting the rest on the off-chance it's
      inaccurate]
    - Walker's public message of 28 July 2013 titled "OFF: [IADoP]
      Austere Report"
    - Walker's public message of 28 July 2013 titled "OFF: [Returning
      Officer] Parties"
    - Walker's public message of 12 July 2013 titled "OFF: [Returning
      Officer] Aims and Objects"
    - omd's public message of 30 July 2013 titled "OFF: [Promotor]
      Proposal Pool"

Set the Speed to Normal.
""",
    // Remove note in proposal 7569 metadata (containing an alternate distribution attempt)
    "OFF: [Promotor] Distribution of proposals 7569-7573" to """
I assume Promotor, and Assessor if I haven't already.

I hereby distribute each listed proposal, initiating the Agoran
Decision of whether to adopt it.  For this decision, the eligible
voters are the active first-class players at the time of this
distribution (i.e. just me), the vote collector is the Assessor
(me again) and the valid options are FOR and AGAINST (PRESENT is
also a valid vote).

NUM  AI  PF C AUTHOR       TITLE

7569 3.1  0 O Fool         Ratify the Honourable Officers' reports
7570 3.1  0 O Fool         Agora pulls a B
7571 3    0 O Fool         Player endorsement for self-ratification
7572 3.1  0 O Fool         Ratify the Dishonourable Assessor's report
7573 3.1  0 O Fool         Ratify the Dishonourable Registrar's report

And I vote FOR*1 all of these.

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7569 (AI=3.1, PF=Y0, interest index=1?, Ordinary) by Fool
Ratify the Honourable Officers' reports

Ratify the following public documents:
     - woggle's public message of 27 July 2013 titled "OFF:
       [Rulekeepor] Short Logical Rule]set"
     - Walker's public message of 28 July 2013 titled "OFF: [IADoP]
       Austere Report"
     - Walker's public message of 28 July 2013 titled "OFF: [Returning
       Officer] Parties"
     - Walker's public message of 12 July 2013 titled "OFF: [Returning
       Officer] Aims and Objects"
     - omd's public message of 15 July 2013 titled "OFF: [Assessor]
       Voting Report"

[incomplete, but works for now, should be acceptable to all sides]

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7570 (AI=3.1, PF=Y0, Ordinary) by Fool
Agora pulls a B

In rule 1551 (Ratification, Power=3.1), replace the sentence:

       Ratifying a public document is secured.

with:

       Ratifying a public document is secured with Power threshold 3.

[ Question for Platonists: When was the last time anything actually
ratified? ]

}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7571 (AI=3, PF=Y0, Ordinary) by Fool
Player endorsement for self-ratification

Amend rule 2201 (Self-Ratification) by replacing the paragraph:

       A public document defined by the rules as self-ratifying is
       ratified when it is continuously undoubted for one week.

with:

       A public document defined by the rules as self-ratifying is
       ratified when it is continuously undoubted for one week,
       provided:
         - at the time of publication, its publisher was a player; or
         - within one week of publication, it was endorsed by someone
           who was a player at that time; or
         - at the time of publication, it was defined by the rules as
           self-ratifying without need of player endorsement.

Amend rule 2170 (Who Am I?) by replacing "self-ratifying" with
"self-ratifying without need of player endorsement"

[Saves me from having to tediously CoE your reports.
  And vice-versa, depending on your criminal case against me.
  Hey, anyone need a black cap? You can borrow mine.]


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7572 (AI=3.1, PF=Y0, Ordinary) by Fool
Ratify the Dishonourable Assessor's report

The self-ratifying parts of the resolutions for the Agoran decisions
on proposals 7530-7547, published on July 29th by Fool, are ratified,
to wit:
   - that such decisions existed,
   - that they were resolved as indicated, and
   - where the indicated outcomes were to adopt proposals, that such
     proposals existed, were adopted, and took effect.

[cf. rule 2034. Also, ratification without objection would not work
here.]


}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{

Proposal 7573 (AI=3.1, PF=Y0, Ordinary) by Fool
Ratify the Dishonourable Registrar's report

Ratify Fool's public message of 04 Aug 2013 titled "OFF: [Registrar]
Census"
""",
    // Add author to full-text section
    "OFF: [Promotor] Distribution of Proposal 7631" to """
I hereby distribute each listed proposal, initiating the Agoran
Decision of whether to adopt it.  For this decision, the vote
collector is the Assessor, and the valid options are FOR and
AGAINST (PRESENT is also a valid vote).

Num   Author     AI  Title
7631  scshunt     2  Missing Vote

Proposal: Missing Vote (AI=2, Author=scshunt)
{{{
Append "The holder of the office of Speaker has voting strength one
greater than e would have if e did not hold the office." to Rule 103.
}}}
"""
)

fun Message.overriddenText(): String? = SUBJECT_OVERRIDE_TEXT_MAP[this.subject]

private val OVERRIDE_BACKUP_NUMBERS: Map<Pair<LocalDate, String>, (Int) -> ProposalNumber> = mapOf(
    (LocalDate.of(2009, 11, 3) to "OFF: [Promotor] Distribution of Proposals 6549-6564") to { index ->
        val raw = 6549 + index
        val adjusted = if (raw == 6559) 6569 else raw

        check(adjusted in 6549..6558 || adjusted == 6569 || adjusted in 6560..6564)

        ProposalNumber(BigInteger.valueOf(adjusted.toLong()))
    },
    (LocalDate.of(2009, 11, 16) to "OFF: [Promotor] Distribution of proposals 6567-6568 and 6570-6580") to { index ->
        val raw = 6567 + index
        val adjusted = if (raw >= 6569) raw + 1 else raw

        check(adjusted in 6567..6568 || adjusted in 6570..6580)

        ProposalNumber(BigInteger.valueOf(adjusted.toLong()))
    },
    (LocalDate.of(2018, 9, 24) to "OFF: [Promotor] Distribution of Proposals 8077B-8085A and 8087A-8089A") to { index ->
        val raw = 8077 + index
        val adjusted = if (raw >= 8086) raw + 1 else raw

        check(adjusted in 8077..8085 || adjusted in 8087..8089)

        ProposalNumber(BigInteger.valueOf(adjusted.toLong()))
    },
    (LocalDate.of(
        2019,
        7,
        16
    ) to "OFF: [Promotor] Distribution of Proposals 8188A-8192A, 8195A, 8202-8214") to { index ->
        val adjusted = when (index) {
            in 0..4 -> 8188 + index
            5 -> 8195
            in 6..18 -> 8202 + (index - 6)
            else -> throw IllegalArgumentException("Invalid index: $index")
        }

        check(adjusted in 8188..8192 || adjusted == 8195 || adjusted in 8202..8214)

        ProposalNumber(BigInteger.valueOf(adjusted.toLong()))
    }
)

fun Message.backupProposalNumber(index: Int): ProposalNumber {
    val overrideFun = OVERRIDE_BACKUP_NUMBERS[date.toUtcLocalDate() to subject]
    if (overrideFun != null) return overrideFun(index)

    return ProposalNumber(backupFirstProposalNumber().plus(index.toBigInteger()))
}

private fun Message.backupFirstProposalNumber(): BigInteger {
    val subject = this.subject.lowercase()

    val numbersPart = if (subject.contains("distribution of")) {
        subject
            .substringAfter("distribution of")
            .removePrefix(" ")
            .removePrefix("proposal")
            .removePrefix("s")
            .trim()
            .substringBefore(" (") // Remove note at the end
            .substringBefore(" [") // Remove another form of note at the end
            .replaceFirst(" and ", "-")
    } else {
        throw IllegalArgumentException("Unknown subject format: $subject")
    }

    require(numbersPart.matches(Regex("^(\\d+)a?|(\\d+a?-\\d+a?)$")))

    return numbersPart
        .substringBefore(" ")
        .substringBefore("-")
        .removeSuffix("a") // Indicates redistribution
        .toBigInteger()
}

private val OVERRIDE_FORCE_NUMBERS: Map<Pair<LocalDate, String>, (RawProposalNumber) -> ProposalNumber> = mapOf(
    (LocalDate.of(2016, 10, 30) to "OFF: [Promotor] Distribution of Proposals 7821-7830") to { raw ->
        when (raw.value) {
            "2827" -> ProposalNumber.from(7827)
            "2228" -> ProposalNumber.from(7828)
            "2229" -> ProposalNumber.from(7829)
            "2230" -> ProposalNumber.from(7830)
            else -> ProposalNumber.from(raw)
        }
    }
)

fun Message.overrideNumberFun(): ((RawProposalNumber) -> ProposalNumber)? {
    return OVERRIDE_FORCE_NUMBERS[date.toUtcLocalDate() to subject]
}
