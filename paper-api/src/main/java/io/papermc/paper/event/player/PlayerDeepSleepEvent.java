package io.papermc.paper.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a player has slept long enough
 * to count as passing the night/storm.
 * <p>
 * Cancelling this event will prevent the player from being counted as deeply sleeping
 * unless they exit and re-enter the bed.
 *
 * @since 1.16.5
 */
@NullMarked
public class PlayerDeepSleepEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerDeepSleepEvent(final Player player) {
        super(player);
    }

    /**
     * @since 1.16.5
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.5
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
