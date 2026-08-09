package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * This event is fired when the player activates the riptide enchantment, using
 * their trident to propel them through the air.
 * <br>
 * N.B. the riptide action is currently performed client side, so manipulating
 * the player in this event may have undesired effects.
 *
 * @since 1.13
 */
public class PlayerRiptideEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ItemStack item;
    private final Vector velocity;

    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerRiptideEvent(@NotNull final Player player, @NotNull final ItemStack item, @NotNull Vector velocity) {
        super(player);
        this.item = item;
        this.velocity = velocity;
    }

    @ApiStatus.Internal
    @Deprecated(since = "1.20.4", forRemoval = true)
    public PlayerRiptideEvent(@NotNull final Player player, @NotNull final ItemStack item) {
        this(player, item, new Vector(0, 0, 0));
    }

    /**
     * Gets the item containing the used enchantment.
     *
     * @return held enchanted item
     * @since 1.13
     */
    @NotNull
    public ItemStack getItem() {
        return this.item;
    }

    /**
     * Get the velocity applied to the player as a result of this riptide.
     *
     * @return the riptide velocity
     * @since 1.20.4
     */
    @NotNull
    public Vector getVelocity() {
        return this.velocity.clone();
    }

    /**
     * @since 1.21.8
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.21.8
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.13
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.13
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
