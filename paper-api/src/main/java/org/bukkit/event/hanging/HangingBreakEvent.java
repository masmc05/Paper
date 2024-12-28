package org.bukkit.event.hanging;

import org.bukkit.entity.Hanging;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Triggered when a hanging entity is removed
 *
 * @since 1.4.5
 */
public class HangingBreakEvent extends HangingEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final HangingBreakEvent.RemoveCause cause;

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
        return cause;
    }

    /**
     * @since 1.4.5
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.4.5
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * An enum to specify the cause of the removal
     *
     * @since 1.4.5
     */
    public enum RemoveCause {
        /**
         * Removed by an entity
         */
        ENTITY,
        /**
         * Removed by an explosion
         */
        EXPLOSION,
        /**
         * Removed by placing a block on it
         */
        OBSTRUCTION,
        /**
         * Removed by destroying the block behind it, etc
         */
        PHYSICS,
        /**
         * Removed by an uncategorised cause
         */
        DEFAULT,
    }

    /**
     * @since 1.4.5
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.4.5
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
