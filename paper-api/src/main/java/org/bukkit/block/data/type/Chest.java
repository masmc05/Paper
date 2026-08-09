package org.bukkit.block.data.type;

import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Waterlogged;
import org.jetbrains.annotations.NotNull;

/**
 * 'type' represents which part of a double chest this block is, or if it is a
 * single chest.
 *
 * @since 1.13
 */
public interface Chest extends Directional, Waterlogged {

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
     * Type of this chest block.
     * <br>
     * NB: Left and right are relative to the chest itself, i.e opposite to what
     * a player placing the appropriate block would see.
     *
     * @since 1.13
     */
    public enum Type {
        /**
         * The chest is not linked to any others and contains only one 27 slot
         * inventory.
         *
         * @since 1.13
         */
        SINGLE,
        /**
         * The chest is the left hand side of a double chest and shares a 54
         * block inventory with the chest to its right.
         *
         * @since 1.13
         */
        LEFT,
        /**
         * The chest is the right hand side of a double chest and shares a 54
         * block inventory with the chest to its left.
         *
         * @since 1.13
         */
        RIGHT;
    }
}
