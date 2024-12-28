package org.bukkit.inventory;

import org.jetbrains.annotations.NotNull;

/**
 * @since 1.1.0
 */
public interface InventoryHolder {

    /**
     * Get the object's inventory.
     *
     * @return The inventory.
     * @since 1.1.0
     */
    @NotNull
    public Inventory getInventory();
}
