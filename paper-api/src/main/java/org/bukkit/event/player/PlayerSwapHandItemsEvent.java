package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a player swap items between main hand and off hand using the
 * hotkey.
 *
 * @since 1.9.4
 */
public class PlayerSwapHandItemsEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    //
    private ItemStack mainHandItem;
    private ItemStack offHandItem;
    private boolean cancelled;

    public PlayerSwapHandItemsEvent(@NotNull Player player, @NotNull ItemStack mainHandItem, @NotNull ItemStack offHandItem) {
        super(player);

        this.mainHandItem = mainHandItem;
        this.offHandItem = offHandItem;
    }

    /**
     * Gets the item switched to the main hand.
     *
     * @return item in the main hand
     * @since 1.9.4
     */
    @NotNull // Paper
    public ItemStack getMainHandItem() {
        return mainHandItem;
    }

    /**
     * Sets the item in the main hand.
     *
     * @param mainHandItem new item in the main hand
     * @since 1.9.4
     */
    public void setMainHandItem(@Nullable ItemStack mainHandItem) {
        this.mainHandItem = mainHandItem == null ? ItemStack.empty() : mainHandItem; // Paper
    }

    /**
     * Gets the item switched to the off hand.
     *
     * @return item in the off hand
     * @since 1.9.4
     */
    @NotNull // Paper
    public ItemStack getOffHandItem() {
        return offHandItem;
    }

    /**
     * Sets the item in the off hand.
     *
     * @param offHandItem new item in the off hand
     * @since 1.9.4
     */
    public void setOffHandItem(@Nullable ItemStack offHandItem) {
        this.offHandItem = offHandItem == null ? ItemStack.empty() : offHandItem; // Paper
    }

    /**
     * @since 1.9.4
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.9.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
