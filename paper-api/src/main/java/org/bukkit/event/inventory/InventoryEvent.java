
package org.bukkit.event.inventory;

import java.util.List;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a player related inventory event
 *
 * @since 1.1.0
 */
public class InventoryEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    protected InventoryView transaction;

    @ApiStatus.Internal
    public InventoryEvent(@NotNull InventoryView transaction) {
        this.transaction = transaction;
    }

    /**
     * Gets the primary Inventory involved in this transaction
     *
     * @return The upper inventory.
     * @since 1.1.0
     */
    @NotNull
    public Inventory getInventory() {
        return this.transaction.getTopInventory();
    }

    /**
     * Gets the list of players viewing the primary (upper) inventory involved
     * in this event
     *
     * @return A list of people viewing.
     * @since 1.1.0
     */
    @NotNull
    public List<HumanEntity> getViewers() {
        return this.transaction.getTopInventory().getViewers();
    }

    /**
     * Gets the view object itself
     *
     * @return InventoryView
     * @since 1.1.0
     */
    @NotNull
    public InventoryView getView() {
        return this.transaction;
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
