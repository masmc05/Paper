package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an entity combusts.
 * <p>
 * If this event is cancelled, the entity will not combust.
 *
 * @since 1.0.0
 */
public class EntityCombustEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private float duration;

    private boolean cancelled;

    @ApiStatus.Internal
    @Deprecated(since = "1.21", forRemoval = true)
    public EntityCombustEvent(@NotNull final Entity combustee, final int duration) {
        this(combustee, (float) duration);
    }

    @ApiStatus.Internal
    public EntityCombustEvent(@NotNull final Entity combustee, final float duration) {
        super(combustee);
        this.duration = duration;
    }

    /**
     * @return the amount of time (in seconds) the combustee should be alight
     *     for
     * @since 1.1.0
     */
    public float getDuration() {
        return this.duration;
    }

    /**
     * The number of seconds the combustee should be alight for.
     * <p>
     * This value will only ever increase the combustion time, not decrease
     * existing combustion times.
     *
     * @param duration the time in seconds to be alight for.
     * @since 1.21
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

    /**
     * The number of seconds the combustee should be alight for.
     * <p>
     * This value will only ever increase the combustion time, not decrease
     * existing combustion times.
     *
     * @param duration the time in seconds to be alight for.
     * @see #setDuration(float)
     * @deprecated duration is now a float
     */
    @Deprecated(since = "1.21", forRemoval = true)
    public void setDuration(int duration) {
        this.duration = duration;
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
}
