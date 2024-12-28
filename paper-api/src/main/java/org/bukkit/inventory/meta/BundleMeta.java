package org.bukkit.inventory.meta;

import java.util.List;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1.17
 */
@ApiStatus.Experimental
public interface BundleMeta extends ItemMeta {

    /**
     * Returns whether the item has any items.
     *
     * @return whether items are present
     * @since 1.17
     */
    boolean hasItems();

    /**
     * Returns an immutable list of the items stored in this item.
     *
     * @return items
     * @since 1.17
     */
    @NotNull
    List<ItemStack> getItems();

    /**
     * Sets the items stored in this item.
     * <br>
     * Removes all items when given null.
     *
     * @param items the items to set
     * @since 1.17
     */
    void setItems(@Nullable List<ItemStack> items);

    /**
     * Adds an item to this item.
     *
     * @param item item to add
     * @since 1.17
     */
    void addItem(@NotNull ItemStack item);
}
