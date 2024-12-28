package org.bukkit.block;

import org.bukkit.inventory.BlockInventoryHolder;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a captured state of a lectern.
 *
 * @since 1.14
 */
public interface Lectern extends io.papermc.paper.block.TileStateInventoryHolder { // Paper - TileStateInventoryHolder

    /**
     * Get the current lectern page.
     *
     * @return current page
     * @since 1.14
     */
    int getPage();

    /**
     * Set the current lectern page.
     *
     * If the page is greater than the number of pages of the book currently in
     * the inventory, then behavior is undefined.
     *
     * @param page new page
     * @since 1.14
     */
    void setPage(int page);

    // Paper - moved to TileStateInventoryHolder
}
