package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player toggles their flying state
 *
 * @since 1.3.1
 */
public class PlayerToggleFlightEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final boolean isFlying;
    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerToggleFlightEvent(@NotNull final Player player, final boolean isFlying) {
        super(player);
        this.isFlying = isFlying;
    }

    /**
     * Returns whether the player is trying to start or stop flying.
     *
     * @return flying state
     * @since 1.3.1
     */
    public boolean isFlying() {
        return this.isFlying;
    }

    /**
     * @since 1.3.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.3.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
