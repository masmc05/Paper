package org.bukkit.event.entity;

import org.bukkit.entity.Bat;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a bat attempts to sleep or wake up from its slumber.
 * <p>
 * If this event is cancelled, the Bat will not toggle its sleep
 * state.
 *
 * @since 1.13.1
 */
public class BatToggleSleepEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final boolean awake;

    private boolean cancelled;

    @ApiStatus.Internal
    public BatToggleSleepEvent(@NotNull Bat bat, boolean awake) {
        super(bat);
        this.awake = awake;
    }

    /**
     * Get whether the bat is attempting to awaken.
     *
     * @return {@code true} if trying to awaken, {@code false} otherwise
     * @since 1.13.1
     */
    public boolean isAwake() {
        return this.awake;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.13.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.13.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
