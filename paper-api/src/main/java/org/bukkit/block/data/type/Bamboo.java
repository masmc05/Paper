package org.bukkit.block.data.type;

import org.bukkit.block.data.Ageable;
import org.jetbrains.annotations.NotNull;

/**
 * 'leaves' represents the size of the leaves on this bamboo block.
 *
 * @since 1.14
 */
public interface Bamboo extends Ageable, Sapling {

    /**
     * Gets the value of the 'leaves' property.
     *
     * @return the 'leaves' value
     * @since 1.14
     */
    @NotNull
    Leaves getLeaves();

    /**
     * Sets the value of the 'leaves' property.
     *
     * @param leaves the new 'leaves' value
     * @since 1.14
     */
    void setLeaves(@NotNull Leaves leaves);

    /**
     * Bamboo leaf size.
     *
     * @since 1.14
     */
    public enum Leaves {

        /**
         * No leaves.
         *
         * @since 1.14
         */
        NONE,
        /**
         * Small leaves.
         *
         * @since 1.14
         */
        SMALL,
        /**
         * Large leaves.
         *
         * @since 1.14
         */
        LARGE;
    }
}
