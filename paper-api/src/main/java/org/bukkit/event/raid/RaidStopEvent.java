package org.bukkit.event.raid;

import org.bukkit.Raid;
import org.bukkit.World;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a {@link Raid} is stopped.
 *
 * @since 1.14.4
 */
public class RaidStopEvent extends RaidEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Reason reason;

    @ApiStatus.Internal
    public RaidStopEvent(@NotNull Raid raid, @NotNull World world, @NotNull Reason reason) {
        super(raid, world);
        this.reason = reason;
    }

    /**
     * Returns the stop reason.
     *
     * @return Reason
     * @since 1.14.4
     */
    @NotNull
    public Reason getReason() {
        return this.reason;
    }

    /**
     * @since 1.14.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.14.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.14.4
     */
    public enum Reason {

        /**
         * Because the difficulty has been changed to peaceful.
         *
         * @since 1.14.4
         */
        PEACE,
        /**
         * The raid took a long time without a final result.
         *
         * @since 1.14.4
         */
        TIMEOUT,
        /**
         * Finished the raid.
         *
         * @since 1.14.4
         */
        FINISHED,
        /**
         * Couldn't find a suitable place to spawn raiders.
         *
         * @since 1.14.4
         */
        UNSPAWNABLE,
        /**
         * The place where the raid occurs no longer be a village.
         *
         * @since 1.14.4
         */
        NOT_IN_VILLAGE
    }
}
