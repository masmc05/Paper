package org.bukkit.block.data.type;

import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Waterlogged;
import org.jetbrains.annotations.NotNull;

/**
 * This class encompasses the 'north', 'east', 'south', 'west', height flags
 * which are used to set the height of a wall.
 *
 * 'up' denotes whether the well has a center post.
 *
 * @since 1.16.1
 */
public interface Wall extends Waterlogged {

    /**
     * Gets the value of the 'up' property.
     *
     * @return the 'up' value
     * @since 1.16.1
     */
    boolean isUp();

    /**
     * Sets the value of the 'up' property.
     *
     * @param up the new 'up' value
     * @since 1.16.1
     */
    void setUp(boolean up);

    /**
     * Gets the height of the specified face.
     *
     * @param face to check
     * @return if face is enabled
     * @since 1.16.1
     */
    @NotNull
    Height getHeight(@NotNull BlockFace face);

    /**
     * Set the height of the specified face.
     *
     * @param face to set
     * @param height the height
     * @since 1.16.1
     */
    void setHeight(@NotNull BlockFace face, @NotNull Height height);

    /**
     * The different heights a face of a wall may have.
     *
     * @since 1.16.1
     */
    public enum Height {
        /**
         * No wall present.
         *
         * @since 1.16.1
         */
        NONE,
        /**
         * Low wall present.
         *
         * @since 1.16.1
         */
        LOW,
        /**
         * Tall wall present.
         *
         * @since 1.16.1
         */
        TALL;
    }
}
