package org.bukkit.event.inventory;

import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a player in creative mode puts down or picks up
 * an item in their inventory / hotbar and when they drop items from their
 * Inventory while in creative mode.
 *
 * @since 1.6.1
 */
public class InventoryCreativeEvent extends InventoryClickEvent {

    private ItemStack item;

    @ApiStatus.Internal
    public InventoryCreativeEvent(@NotNull InventoryView view, @NotNull SlotType type, int slot, @NotNull ItemStack newItem) {
        super(view, type, slot, ClickType.CREATIVE, InventoryAction.PLACE_ALL);
        this.item = newItem;
    }

    /**
     * @since 1.6.1
     */
    @Override
    @NotNull
    public ItemStack getCursor() {
        return this.item;
    }

    /**
     * @since 1.6.1
     */
    @Override
    public void setCursor(@NotNull ItemStack item) {
        this.item = item;
    }
}
