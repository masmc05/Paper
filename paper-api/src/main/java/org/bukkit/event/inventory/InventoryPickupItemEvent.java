package org.bukkit.event.inventory;

import org.bukkit.entity.Item;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a hopper or hopper minecart picks up a dropped item.
 *
 * @since 1.5.1
 */
public class InventoryPickupItemEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Inventory inventory;
    private final Item item;

    public InventoryPickupItemEvent(@NotNull final Inventory inventory, @NotNull final Item item) {
        super();
        this.inventory = inventory;
        this.item = item;
    }

    /**
     * Gets the Inventory that picked up the item
     *
     * @return Inventory
     * @since 1.5.1
     */
    @NotNull
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Gets the Item entity that was picked up
     *
     * @return Item
     * @since 1.5.1
     */
    @NotNull
    public Item getItem() {
        return item;
    }

    /**
     * @since 1.5.1
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.5.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.5.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.5.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
