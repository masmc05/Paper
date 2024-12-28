package org.bukkit.block.data.type;

import org.bukkit.block.data.Hatchable;

/**
 * 'eggs' is the number of eggs which appear in this block.
 *
 * @since 1.13
 */
public interface TurtleEgg extends Hatchable {

    /**
     * Gets the value of the 'eggs' property.
     *
     * @return the 'eggs' value
     * @since 1.13
     */
    int getEggs();

    /**
     * Sets the value of the 'eggs' property.
     *
     * @param eggs the new 'eggs' value
     * @since 1.13
     */
    void setEggs(int eggs);

    /**
     * Gets the minimum allowed value of the 'eggs' property.
     *
     * @return the minimum 'eggs' value
     * @since 1.13
     */
    int getMinimumEggs();

    /**
     * Gets the maximum allowed value of the 'eggs' property.
     *
     * @return the maximum 'eggs' value
     * @since 1.13
     */
    int getMaximumEggs();
}
