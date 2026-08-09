package org.bukkit.block.data.type;

import org.bukkit.block.data.Waterlogged;
import org.jetbrains.annotations.NotNull;

/**
 * 'type' represents what state the slab is in - either top, bottom, or a double
 * slab occupying the full block.
 *
 * @since 1.13
 */
public interface Slab extends Waterlogged {

    /**
     * Gets the value of the 'type' property.
     *
     * @return the 'type' value
     * @since 1.13
     */
    @NotNull
    Type getType();

    /**
     * Sets the value of the 'type' property.
     *
     * @param type the new 'type' value
     * @since 1.13
     */
    void setType(@NotNull Type type);

    /**
     * The type of the slab.
     *
     * @since 1.13
     */
    public enum Type {
        /**
         * The slab occupies the upper y half of the block.
         *
         * @since 1.13
         */
        TOP,
        /**
         * The slab occupies the lower y half of the block.
         *
         * @since 1.13
         */
        BOTTOM,
        /**
         * The slab occupies the entire block.
         *
         * @since 1.13
         */
        DOUBLE;
    }
}
