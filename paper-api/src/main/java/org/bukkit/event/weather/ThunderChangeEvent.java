package org.bukkit.event.weather;

import org.bukkit.World;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Stores data for thunder state changing in a world
 *
 * @since 1.0.0
 */
public class ThunderChangeEvent extends WeatherEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final boolean newThunderState;
    private final Cause cause;

    private boolean cancelled;

    @ApiStatus.Internal
    public ThunderChangeEvent(@NotNull final World world, final boolean newThunderState, @NotNull final Cause cause) {
        super(world);
        this.newThunderState = newThunderState;
        this.cause = cause;
    }

    @ApiStatus.Internal
    @Deprecated(forRemoval = true)
    public ThunderChangeEvent(@NotNull final World world, final boolean newThunderState) {
        this(world, newThunderState, Cause.UNKNOWN);
    }

    /**
     * Gets the state of thunder that the world is being set to
     *
     * @return {@code true} if the weather is being set to thundering, {@code false} otherwise
     * @since 1.0.0
     */
    public boolean toThunderState() {
        return this.newThunderState;
    }

    /**
     * Gets the cause of the weather change.
     *
     * @return the weather change cause
     * @since 1.16.5
     */
    @NotNull
    public Cause getCause() {
        return this.cause;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.5
     */
    public enum Cause {
        /**
         * @since 1.16.5
         */
        COMMAND,
        /**
         * @since 1.16.5
         */
        NATURAL,
        /**
         * @since 1.16.5
         */
        SLEEP,
        /**
         * @since 1.16.5
         */
        PLUGIN,
        /**
         * @since 1.16.5
         */
        UNKNOWN
    }
}
