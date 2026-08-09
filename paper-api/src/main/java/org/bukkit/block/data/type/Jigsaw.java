package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.NotNull;

/**
 * 'orientation' is the direction the block is facing.
 *
 * @since 1.16.1
 */
public interface Jigsaw extends BlockData {

    /**
     * Gets the value of the 'orientation' property.
     *
     * @return the 'orientation' value
     * @since 1.16.1
     */
    @NotNull
    org.bukkit.block.Orientation getOrientation();

    /**
     * Sets the value of the 'orientation' property.
     *
     * @param orientation the new 'orientation' value
     * @since 1.16.1
     */
    void setOrientation(@NotNull org.bukkit.block.Orientation orientation);

    /**
     * The directions the Jigsaw can be oriented.
     *
     * @deprecated this property is not specific to the Jigsaw, use
     * {@link org.bukkit.block.Orientation} instead. All references
     * to this enum will be redirected to that enum at runtime.
     * @since 1.16.1
     */
    @Deprecated
    public enum Orientation {

        /**
         * @since 1.16.1
         */
        DOWN_EAST,
        /**
         * @since 1.16.1
         */
        DOWN_NORTH,
        /**
         * @since 1.16.1
         */
        DOWN_SOUTH,
        /**
         * @since 1.16.1
         */
        DOWN_WEST,
        /**
         * @since 1.16.1
         */
        UP_EAST,
        /**
         * @since 1.16.1
         */
        UP_NORTH,
        /**
         * @since 1.16.1
         */
        UP_SOUTH,
        /**
         * @since 1.16.1
         */
        UP_WEST,
        /**
         * @since 1.16.1
         */
        WEST_UP,
        /**
         * @since 1.16.1
         */
        EAST_UP,
        /**
         * @since 1.16.1
         */
        NORTH_UP,
        /**
         * @since 1.16.1
         */
        SOUTH_UP;
    }
}
