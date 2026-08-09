package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called immediately prior to an entity being unleashed.
 * <p>
 * Cancelling this event when either:
 * <ul>
 *     <li>the leashed entity dies,</li>
 *     <li>the entity changes dimension, or</li>
 *     <li>the client has disconnected the leash</li>
 * </ul>
 * will have no effect.
 *
 * @since 1.6.2
 */
public class EntityUnleashEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final UnleashReason reason;
    private boolean dropLeash;

    private boolean cancelled;

    @ApiStatus.Internal
    @Deprecated(forRemoval = true)
    public EntityUnleashEvent(@NotNull Entity entity, @NotNull UnleashReason reason) {
        this(entity, reason, false);
    }

    @ApiStatus.Internal
    public EntityUnleashEvent(@NotNull Entity entity, @NotNull UnleashReason reason, boolean dropLeash) {
        super(entity);
        this.reason = reason;
        this.dropLeash = dropLeash;
    }

    /**
     * Returns the reason for the unleashing.
     *
     * @return The reason
     * @since 1.6.2
     */
    @NotNull
    public UnleashReason getReason() {
        return this.reason;
    }

    /**
     * Returns whether a leash item will be dropped.
     *
     * @return Whether the leash item will be dropped
     * @since 1.16.5
     */
    public boolean isDropLeash() {
        return this.dropLeash;
    }

    /**
     * Sets whether a leash item should be dropped.
     *
     * @param dropLeash Whether the leash item should be dropped
     * @since 1.16.5
     */
    public void setDropLeash(boolean dropLeash) {
        this.dropLeash = dropLeash;
    }

    /**
     * @since 1.17.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.17.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.6.2
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.6.2
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.6.2
     */
    public enum UnleashReason {
        /**
         * When the entity's leashholder has died or logged out, and so is
         * unleashed
         *
         * @since 1.6.2
         */
        HOLDER_GONE,
        /**
         * When the entity's leashholder attempts to unleash it
         *
         * @since 1.6.2
         */
        PLAYER_UNLEASH,
        /**
         * When the entity's leashholder is more than 10 blocks away
         *
         * @since 1.6.2
         */
        DISTANCE,
        /**
         * When the leashed entity is removed from the game
         *
         * @since 26.2
         */
        LEASHED_GONE,
        /**
         * @since 1.6.2
         */
        UNKNOWN;
    }
}
