package io.papermc.paper.block.bed;


/**
 * Represents the result of a bed rule during {@link org.bukkit.event.player.PlayerBedEnterEvent}
 * and {@link io.papermc.paper.event.player.PlayerBedFailEnterEvent}. Bed rules are responsible
 * for allowing players to sleep and to set their spawn point
 *
 * @since 1.21.11
 */
public sealed interface BedRuleResult permits BedRuleResultImpl {

    /**
     * Used when the bed rule is allowed
     *
     * @since 1.21.11
     */
    BedRuleResult ALLOWED = new BedRuleResultImpl(true);

    /**
     * Used when the bed rule is denied due to there
     * being too much light. This is the case during
     * daytime without thunderstorms
     *
     * @since 1.21.11
     */
    BedRuleResult TOO_MUCH_LIGHT = new BedRuleResultImpl(false);

    /**
     * Used when the bed rule is set to always be denied
     *
     * @since 1.21.11
     */
    BedRuleResult NEVER = new BedRuleResultImpl(false);

    /**
     * Returns {@code true} if this result is a success
     *
     * @return whether this result is a success
     * @since 1.21.11
     */
    boolean success();

}
