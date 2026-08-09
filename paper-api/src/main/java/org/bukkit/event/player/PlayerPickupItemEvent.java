package org.bukkit.event.player;

import org.bukkit.Warning;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Thrown when a player picks an item up from the ground
 * @deprecated {@link EntityPickupItemEvent}
 * @since 1.0.0
 */
@Deprecated(since = "1.12")
@Warning
public class PlayerPickupItemEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Item item;
    private final int remaining;
    private boolean flyAtPlayer = true;

    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerPickupItemEvent(@NotNull final Player player, @NotNull final Item item, final int remaining) {
        super(player);
        this.item = item;
        this.remaining = remaining;
    }

    /**
     * Gets the Item picked up by the player.
     *
     * @return Item
     * @since 1.0.0
     */
    @NotNull
    public Item getItem() {
        return this.item;
    }

    /**
     * Gets the amount remaining on the ground, if any
     *
     * @return amount remaining on the ground
     * @since 1.0.0
     */
    public int getRemaining() {
        return this.remaining;
    }

    /**
     * Set if the item will fly at the player
     * <p>
     * Cancelling the event will set this value to {@code false}.
     *
     * @param flyAtPlayer {@code true} for item to fly at player
     * @since 1.12
     */
    public void setFlyAtPlayer(boolean flyAtPlayer) {
        this.flyAtPlayer = flyAtPlayer;
    }

    /**
     * Gets if the item will fly at the player
     *
     * @return {@code true} if the item will fly at the player
     * @since 1.12
     */
    public boolean getFlyAtPlayer() {
        return this.flyAtPlayer;
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
        this.flyAtPlayer = !cancel;
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
