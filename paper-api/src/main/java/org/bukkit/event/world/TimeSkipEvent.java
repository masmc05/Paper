package org.bukkit.event.world;

import org.bukkit.World;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when the time skips in a world.
 * <p>
 * If the event is cancelled the time will not change.
 *
 * @since 1.15.1
 */
public class TimeSkipEvent extends WorldEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    //
    private boolean cancelled;
    private final SkipReason skipReason;
    private long skipAmount;

    public TimeSkipEvent(@NotNull World world, @NotNull SkipReason skipReason, long skipAmount) {
        super(world);
        this.skipReason = skipReason;
        this.skipAmount = skipAmount;
    }

    /**
     * Gets the reason why the time has skipped.
     *
     * @return a SkipReason value detailing why the time has skipped
     * @since 1.15.1
     */
    @NotNull
    public SkipReason getSkipReason() {
        return skipReason;
    }

    /**
     * Gets the amount of time that was skipped.
     *
     * @return Amount of time skipped
     * @since 1.15.1
     */
    public long getSkipAmount() {
        return skipAmount;
    }

    /**
     * Sets the amount of time to skip.
     *
     * @param skipAmount Amount of time to skip
     * @since 1.15.1
     */
    public void setSkipAmount(long skipAmount) {
        this.skipAmount = skipAmount;
    }

    /**
     * @since 1.15.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.15.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.15.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.15.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * An enum specifying the reason the time skipped.
     *
     * @since 1.15.1
     */
    public enum SkipReason {

        /**
         * When time is changed using the vanilla /time command.
         */
        COMMAND,
        /**
         * When time is changed by a plugin.
         */
        CUSTOM,
        /**
         * When time is changed by all players sleeping in their beds and the
         * night skips.
         */
        NIGHT_SKIP
    }
}
