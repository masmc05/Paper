package org.bukkit.scoreboard;

/**
 * @deprecated replaced by {@link Team.OptionStatus}
 * @since 1.8
 */
@Deprecated(since = "1.9")
public enum NameTagVisibility {

    /**
     * Always show the player's nametag.
     *
     * @since 1.8
     */
    ALWAYS,
    /**
     * Never show the player's nametag.
     *
     * @since 1.8
     */
    NEVER,
    /**
     * Show the player's nametag only to his own team members.
     *
     * @since 1.8
     */
    HIDE_FOR_OTHER_TEAMS,
    /**
     * Show the player's nametag only to members of other teams.
     *
     * @since 1.8
     */
    HIDE_FOR_OWN_TEAM;
}
