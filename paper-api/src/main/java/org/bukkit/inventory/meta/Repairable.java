package org.bukkit.inventory.meta;

import org.jetbrains.annotations.NotNull;

/**
 * Represents an item that can be repaired at an anvil.
 *
 * @since 1.4.5
 */
public interface Repairable extends ItemMeta {

    /**
     * Checks to see if this has a repair penalty
     *
     * @return true if this has a repair penalty
     * @since 1.4.5
     */
    boolean hasRepairCost();

    /**
     * Gets the repair penalty
     *
     * @return the repair penalty
     * @since 1.4.5
     */
    int getRepairCost();

    /**
     * Sets the repair penalty
     *
     * @param cost repair penalty
     * @since 1.4.5
     */
    void setRepairCost(int cost);

    @SuppressWarnings("javadoc")
    @NotNull
    @Override
    Repairable clone();
}
