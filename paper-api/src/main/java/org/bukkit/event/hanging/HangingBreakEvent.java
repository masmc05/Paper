package org.bukkit.event.hanging;

import org.bukkit.entity.Hanging;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Triggered when a hanging entity is removed
 *
 * @since 1.4.5
 */
public class HangingBreakEvent extends HangingEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final HangingBreakEvent.RemoveCause cause;
    private boolean cancelled;

    @ApiStatus.Internal
    public HangingBreakEvent(@NotNull final Hanging hanging, @NotNull final HangingBreakEvent.RemoveCause cause) {
        super(hanging);
        this.cause = cause;
    }

    /**
     * Gets the cause for the hanging entity's removal
     *
     * @return the RemoveCause for the hanging entity's removal
     * @since 1.4.5
     */
    @NotNull
    public HangingBreakEvent.RemoveCause getCause() {
        return this.cause;
    }

    /**
     * @since 1.4.5
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.4.5
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.4.5
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.4.5
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * An enum to specify the cause of the removal
     *
     * @since 1.4.5
     */
    public enum RemoveCause {
        /**
         * Removed by an entity
         *
         * @since 1.4.5
         */
        ENTITY,
        /**
         * Removed by an explosion
         *
         * @since 1.4.5
         */
        EXPLOSION,
        /**
         * Removed by placing a block on it
         *
         * @since 1.4.5
         */
        OBSTRUCTION,
        /**
         * Removed by destroying the block behind it, etc
         *
         * @since 1.4.5
         */
        PHYSICS,
        /**
         * Removed by an uncategorised cause
         *
         * @since 1.4.5
         */
        DEFAULT,
    }
}
