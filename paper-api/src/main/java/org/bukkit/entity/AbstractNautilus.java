package org.bukkit.entity;

import org.bukkit.inventory.ArmoredSaddledMountInventory;
import org.bukkit.inventory.InventoryHolder;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.11
 */
@NullMarked
public interface AbstractNautilus extends Tameable, InventoryHolder, Vehicle {

    /**
     * @since 1.21.11
     */
    @Override
    ArmoredSaddledMountInventory getInventory();
}
