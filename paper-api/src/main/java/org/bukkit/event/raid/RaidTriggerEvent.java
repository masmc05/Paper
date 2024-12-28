package org.bukkit.event.raid;

import org.bukkit.Raid;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a {@link Raid} is triggered (e.g: a player with Bad Omen effect
 * enters a village).
 *
 * @since 1.14.4
 */
public class RaidTriggerEvent extends RaidEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    //
    private final Player player;
    private boolean cancel;

    public RaidTriggerEvent(@NotNull Raid raid, @NotNull World world, @NotNull Player player) {
        super(raid, world);
        this.player = player;
    }

    /**
     * Returns the player who triggered the raid.
     *
     * @return triggering player
     * @since 1.14.4
     */
    @NotNull
    public Player getPlayer() {
        return player;
    }

    /**
     * @since 1.14.4
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * @since 1.14.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * @since 1.14.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.14.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
