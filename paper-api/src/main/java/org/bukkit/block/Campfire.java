package org.bukkit.block;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a captured state of a campfire.
 *
 * @since 1.14
 */
public interface Campfire extends TileState {

    /**
     * @return The size of the inventory
     * @see Inventory#getSize()
     * @since 1.14
     */
    int getSize();

    /**
     * @param index The index of the Slot's ItemStack to return
     * @return The ItemStack in the slot
     * @see Inventory#getItem(int)
     * @since 1.14
     */
    @Nullable
    ItemStack getItem(int index);

    /**
     * @param index The index where to put the ItemStack
     * @param item The ItemStack to set
     * @see Inventory#setItem(int, org.bukkit.inventory.ItemStack)
     * @since 1.14
     */
    void setItem(int index, @Nullable ItemStack item);

    /**
     * Get cook time.
     *
     * This is the amount of time the item has been cooking for.
     *
     * @param index item slot index
     * @return Cook time
     * @since 1.14
     */
    int getCookTime(int index);

    /**
     * Set cook time.
     *
     * This is the amount of time the item has been cooking for.
     *
     * @param index item slot index
     * @param cookTime Cook time
     * @since 1.14
     */
    void setCookTime(int index, int cookTime);

    /**
     * Get cook time total.
     *
     * This is the amount of time the item is required to cook for.
     *
     * @param index item slot index
     * @return Cook time total
     * @since 1.14
     */
    int getCookTimeTotal(int index);

    /**
     * Set cook time.
     *
     * This is the amount of time the item is required to cook for.
     *
     * @param index item slot index
     * @param cookTimeTotal Cook time total
     * @since 1.14
     */
    void setCookTimeTotal(int index, int cookTimeTotal);

    // Paper start
    /**
     * Disable cooking in all slots.
     *
     * @since 1.18.1
     */
    void stopCooking();

    /**
     * Re-enable cooking in all slots.
     *
     * @since 1.18.1
     */
    void startCooking();

    /**
     * Disable cooking in the specified slot index.
     *
     * @param index item slot index
     * @return whether the slot had cooking enabled before this call
     * @since 1.18.1
     */
    boolean stopCooking(int index);

    /**
     * Re-enable cooking in the specified slot index.
     *
     * @param index item slot index
     * @return whether the slot couldn't cook before this call
     * @since 1.18.1
     */
    boolean startCooking(int index);

    /**
     * State of slot index.
     *
     * @param index item slot index
     * @return {@code true} if the specified slot index cannot cook
     * @since 1.18.1
     */
    boolean isCookingDisabled(int index);
    // Paper end
}
