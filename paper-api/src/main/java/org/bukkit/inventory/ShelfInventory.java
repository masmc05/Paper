package org.bukkit.inventory;

import org.bukkit.block.Shelf;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1.21.10
 */
public interface ShelfInventory extends Inventory {

    /**
     * @since 1.21.10
     */
    @Nullable
    @Override
    public Shelf getHolder();
}
