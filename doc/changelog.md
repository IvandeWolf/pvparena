- v1.3.2.64 - fix issue #143 - thanks to Oruss7!
- v1.3.2.63 - add some message output when class changing fails
- v1.3.2.62 - prepare module class change hooking
- v1.3.2.61 - address github issue #114 - add LibsDisguises support
- v1.3.2.60 - fix CTF being messed up by people continuing to play
- v1.3.2.59 - fix update check
- v1.3.2.58 - /pa help - it still shows the colored standard reply even with sub-arguments
- v1.3.2.57 - address github issue #135 - language addition
- v1.3.2.56 - address github issue #141 - add config calcoffset to tweak block dissolve greediness
- v1.3.2.55 - fix Spectate Spectators being told they cannot teleport when switching view
- v1.3.2.54 - new Module: Spectate - uses the 1.8 SPECTATOR GameMode
- v1.3.2.51 - update to Java 7
- v1.3.1.49 - fix an NPE on server shutdown
- v1.3.1.48 - update all the things in the doc
- v1.3.1.46 - pull #106 - thanks a TON to @Oruss7 for putting together this load of information!
- v1.3.1.45 - the final update for 1.7.9 - unless critical errors arrive. I need to get ready for 1.9
- v1.3.1.44 - prevent an NPE in the WarmupJoin module
- v1.3.1.43 - revert the last commit and furthermore clarify and verify correctly. Modules build incoming
- v1.3.1.42 - fix a logic messups in an internal join check
- v1.3.1.41 - duel module finished
- v1.3.1.40 - allow to disable the Duel force ready & start
- v1.3.1.39 - duel module language finish
- v1.3.1.38 - finish off github issue #118
- v1.3.1.37 - more shurtcut arena list fixes
- v1.3.1.36 - try to fix the round arena status check
- v1.3.1.35 - apply former fix for arena listing
- v1.3.1.34 - override only_shortcuts with allow_ungrouped to allow joining arenas not grouped under shortcuts
- v1.3.1.33 - properly format and save spawn offsets
- v1.3.1.32 - properly format and save spawn offsets
- v1.3.1.31 - properly allow for 5 arguments of /pa spawn
- v1.3.1.30 - fix github issues #115, #118
- v1.3.1.29 - address github issue #112
- v1.3.1.28 - how about we don't delete the spawn after offsetting it? -.-
- v1.3.1.26 - github issue #104 - EXPERIMENTAL!
- v1.3.1.25 - this time for real - we need to tell people they CAN decline :)
- v1.3.1.24 - add final language for github issue #97
- v1.3.1.23 - add config for github issue #86
- v1.3.1.22 - release build
- v1.3.1.21 - and more language nodes
- v1.3.1.20 - prepare Dual fixes and commit some language/message fixes
- v1.3.1.19 - fix another Exception in the time goal
- v1.3.1.18 - properly output unclaiming vs contesting flags in domination goal - language file consistency fixed
- v1.3.1.17 - fix some language derps and move the delayed class change to where it makes more sense
- v1.3.1.16 - fix github issue #108 - contesting (unclaiming) too late
- v1.3.1.15 - add github issue #100 - player.healforkill - true/false :)
- v1.3.1.14 - use the SNAPSHOT distinction and address github issue #85
- v1.3.1.13 - hide the not-really stat type NULL (player name)
- v1.3.1.12 - fix github issue #95 by adding a null check
- v1.3.1.11 - clarify language for RespawnRelay and fix a little Exception in the Time goal
- v1.3.1.10 - address github issue #88 - properly keep players as DEAD when being relayed
- v1.3.1.9 - address github issue #87 - add THORNS damage handling
- v1.3.1.8 - properly deal with inventory protection
- v1.3.1.7 - how about we don't spam EVERYthing but spam after collecting everything, and inform people that we have prevented something?
- v1.3.1.6 - fix some mathematical and logical derps
- v1.3.1.5 - really add INVENTORY check - properly define new Infect commands [setprotect|getprotect]
- v1.3.1.4 - allow goals to deny BREAK, PLACE, TNT, TNTBREAK, DROP, INVENTORY, PICKUP, CRAFT - proof of concept!
- v1.3.1.1 - link to new jenkins. Thanks to @graywolf336
- v1.3.0.558 - fix github issue #83
- v1.3.0.557 - fix github issue #61
- v1.3.0.556 - fix github issue #64
- v1.3.0.555 - add x-offset and z-offset, so one can change the default behaviour of putting ppl on the middle of a block
- v1.3.0.554 - fix an NPE in some places due to a return value of null should be expected!
- v1.3.0.553 - add chat.toGlobal to allow private talking players to talk to the public with a prefix
- v1.3.0.552 - add CRAFT RegionProtection to prevent item crafting
- v1.3.0.551 - add damage.fromOutsiders (false) to allow players (and other entities) to hurt fighters
- v1.3.0.550 - properly check for some things before adding players to a class via command
- v1.3.0.549 - try to fix long usernames staying on signs
- v1.3.0.548 - prevent a NPE
- v1.3.0.547 - call the leave event - I am shocked noone noticed that until yesterday
- v1.3.0.546 - reverse all the things and do what I promised the last 2 commits
- v1.3.0.545 - fix books! (for real)
- v1.3.0.544 - fix books!
- v1.3.0.543 - trying again
- v1.3.0.542 - attempt to fix some data reading issues (for ink sacks and wool blocks)
- v1.3.0.541 - fix some display issues about max team players
- v1.3.0.540 - attempt to fix special character issues
- v1.3.0.539 - allow to take suicides into account for TDM
- v1.3.0.538 - still on github issue #78 - never remove perms!
- v1.3.0.537 - fix missing perms message, addressing github issue #78
- v1.3.0.536 - finish github issue #78 - typo messup
- v1.3.0.535 - address github issue #78 - add language nodes for missing perms
- v1.3.0.534 - prevent tamed animals belonging to an arena player from teleporting
- v1.3.0.533 - finally fix github issue #76 - inventory reset messup
- v1.3.0.532 - address github issue #76
- v1.3.0.531 - address github issue #64
- v1.3.0.530 - add "classSwitchAfterRespawn", defaulting to false
- v1.3.0.529 - revert #523 - I don't care anymore - this HAS to fix it, otherwise I give up on development :P
- v1.3.0.528 - revert #519 - second attempt at fixing an issue on several implementations
- v1.3.0.527 - revert #518 - this fixed dbo issue #912 (duplications on Cauldron) but caused items disappearing on other implementations
- v1.3.0.526 - add more config settings for PlayerKillReward
- v1.3.0.525 - address DBO issue #923
- v1.3.0.524 - address DBO issue #921
- v1.3.0.522 - fix integer/integer divisions -.-
- v1.3.0.521 - clarify custom class determination debug
- v1.3.0.520 - clarify damage debug values
- v1.3.0.519 - forcefully place players where they joined if the player is disconnecting
- v1.3.0.518 - forcefully remove items when a player leaves the arena
- v1.3.0.517 - address DBO issue #907 - don't try to teleport null/dead players
- v1.3.0.516 - try fixing NOCAMP damage
- v1.3.0.515 - [IDEA] various fixes
- v1.3.0.511 - address DBO issue #888 - reset chat color if desired
- v1.3.0.510 - add mobs fighting by your side. Give classes a spawn egg with displayname "SPAWN"
- v1.3.0.509 - properly build #507 prefix
- v1.3.0.507 - add materialprefixes to the global config, for special Material names (bukkit:SAND)
- v1.3.0.506 - add '*' command for the whitelist to allow all commands
- v1.3.0.505 - add per command permissions - defaulting to old behaviour
- v1.3.0.504 - don't drop inventory if not desired
- v1.3.0.503 - fix the UUID interpretation; use player names for creation, not the UUID -.-
- v1.3.0.502 - how about we actually RUN the runnable?
- v1.3.0.501 - force /pa leave on final player death if no specate module present
- v1.3.0.500 - address ticket #869, #884, #792
  - add time.resetDelay (default: -1 --> off) - delay for resetting players (TP & inventory)
  - support single SPAWN regions for team matches
  - support lore and displayname for keepItems
- v1.3.0.499 - address ticket 792, 879, 881
  - attempt to fix the Food Goal to properly handle player deaths
  - require explicit perms for /pa arenaclass (if desired)
- v1.3.0.498 - properly initiate late joining PlayerDeathMatch players
- v1.3.0.497 - check for explicit class perms, even though we have no Sign!
- v1.3.0.496 - minor fixes
- v1.3.0.495 - add Command Tab support; Big Command rewrite!!