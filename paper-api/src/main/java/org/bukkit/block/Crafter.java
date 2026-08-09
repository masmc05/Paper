package org.bukkit.block;

/**
 * Represents a captured state of a crafter.
 *
 * @since 1.20.4
 */
public interface Crafter extends Container, com.destroystokyo.paper.loottable.LootableBlockInventory { // Paper - LootTable API

    /**
     * Gets the number of ticks which this block will remain in the crafting
     * state for.
     *
     * @return number of ticks remaining
     * @see org.bukkit.block.data.type.Crafter#isCrafting()
     * @since 1.20.4
     */
    int getCraftingTicks();

    /**
     * Sets the number of ticks which this block will remain in the crafting
     * state for.
     *
     * @param ticks number of ticks remaining
     * @see org.bukkit.block.data.type.Crafter#isCrafting()
     * @since 1.20.4
     */
    void setCraftingTicks(int ticks);

    /**
     * Gets whether the slot at the specified index is disabled and will not
     * have items placed in it.
     *
     * @param slot slot index
     * @return whether the slot is disabled
     * @since 1.20.4
     */
    boolean isSlotDisabled(int slot);

    /**
     * Sets whether the slot at the specified index is disabled and will not
     * have items placed in it.
     *
     * @param slot slot index
     * @param disabled whether the slot should be disabled
     * @since 1.20.4
     */
    void setSlotDisabled(int slot, boolean disabled);

    /**
     * Gets whether this Crafter is powered.
     *
     * @return powered status
     * @since 1.20.4
     */
    boolean isTriggered();

    /**
     * Sets whether this Crafter is powered.
     *
     * @param triggered powered status
     * @since 1.20.4
     */
    void setTriggered(boolean triggered);
}
