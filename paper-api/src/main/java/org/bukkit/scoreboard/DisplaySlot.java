package org.bukkit.scoreboard;

import org.jspecify.annotations.NullMarked;

/**
 * Locations for displaying objectives to the player
 *
 * @since 1.5.1
 */
@NullMarked
public enum DisplaySlot {
    /**
     * @since 1.5.1
     */
    // Start generate - DisplaySlot
    PLAYER_LIST("list"),
    /**
     * @since 1.5.1
     */
    SIDEBAR("sidebar"),
    /**
     * @since 1.5.1
     */
    BELOW_NAME("below_name"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_BLACK("sidebar.team.black"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_DARK_BLUE("sidebar.team.dark_blue"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_DARK_GREEN("sidebar.team.dark_green"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_DARK_AQUA("sidebar.team.dark_aqua"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_DARK_RED("sidebar.team.dark_red"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_DARK_PURPLE("sidebar.team.dark_purple"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_GOLD("sidebar.team.gold"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_GRAY("sidebar.team.gray"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_DARK_GRAY("sidebar.team.dark_gray"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_BLUE("sidebar.team.blue"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_GREEN("sidebar.team.green"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_AQUA("sidebar.team.aqua"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_RED("sidebar.team.red"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_LIGHT_PURPLE("sidebar.team.light_purple"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_YELLOW("sidebar.team.yellow"),
    /**
     * @since 1.17.1
     */
    SIDEBAR_TEAM_WHITE("sidebar.team.white");
    // End generate - DisplaySlot

    /**
     * @since 1.17.1
     */
    public static final net.kyori.adventure.util.Index<String, DisplaySlot> NAMES = net.kyori.adventure.util.Index.create(DisplaySlot.class, DisplaySlot::getId);

    private final String id;

    DisplaySlot(String id) {
        this.id = id;
    }

    /**
     * Get the string id of this display slot.
     *
     * @return the string id
     * @since 1.17.1
     */
    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
