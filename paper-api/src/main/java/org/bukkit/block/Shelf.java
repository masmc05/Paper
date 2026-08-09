package org.bukkit.block;

import io.papermc.paper.block.TileStateInventoryHolder;
import org.bukkit.inventory.ShelfInventory;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.10
 */
@NullMarked
public interface Shelf extends TileStateInventoryHolder {

    /**
     * @since 1.21.10
     */
    @Override
    ShelfInventory getInventory();

    /**
     * @since 1.21.10
     */
    @Override
    ShelfInventory getSnapshotInventory();
}
