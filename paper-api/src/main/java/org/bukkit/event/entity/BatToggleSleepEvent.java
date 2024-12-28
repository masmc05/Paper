package org.bukkit.event.entity;

import org.bukkit.entity.Bat;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a bat attempts to sleep or wake up from its slumber.
 * <p>
 * If a Bat Toggle Sleep event is cancelled, the Bat will not toggle its sleep
 * state.
 *
 * @since 1.13.1
 */
public class BatToggleSleepEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancel = false;
    private final boolean awake;

    public BatToggleSleepEvent(@NotNull Bat what, boolean awake) {
        super(what);
        this.awake = awake;
    }

    /**
     * Get whether or not the bat is attempting to awaken.
     *
     * @return true if trying to awaken, false otherwise
     * @since 1.13.1
     */
    public boolean isAwake() {
        return awake;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * @since 1.13.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.13.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
