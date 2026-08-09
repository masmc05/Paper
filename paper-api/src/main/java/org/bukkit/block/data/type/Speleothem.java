package org.bukkit.block.data.type;

import java.util.Set;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Waterlogged;
import org.jspecify.annotations.NullMarked;

/**
 * 'thickness' represents the speleothem thickness.
 * <br>
 * 'vertical_direction' represents the speleothem orientation.
 * <br>
 * Some blocks may not be able to face in all directions, use
 * {@link #getVerticalDirections()} to get all possible directions for this
 * block.
 *
 * @since 26.2
 */
@NullMarked
public interface Speleothem extends Waterlogged {

    /**
     * Gets the value of the 'vertical_direction' property.
     *
     * @return the 'vertical_direction' value
     * @since 26.2
     */
    BlockFace getVerticalDirection();

    /**
     * Sets the value of the 'vertical_direction' property.
     *
     * @param direction the new 'vertical_direction' value
     * @since 26.2
     */
    void setVerticalDirection(BlockFace direction);

    /**
     * Gets the faces which are applicable to this block.
     *
     * @return the allowed 'vertical_direction' values
     * @since 26.2
     */
    Set<BlockFace> getVerticalDirections();

    /**
     * Gets the value of the 'thickness' property.
     *
     * @return the 'thickness' value
     * @since 26.2
     */
    Thickness getThickness();

    /**
     * Sets the value of the 'thickness' property.
     *
     * @param thickness the new 'thickness' value
     * @since 26.2
     */
    void setThickness(Thickness thickness);

    /**
     * Represents the thickness of the speleothem, corresponding to its position
     * within a multi-block speleothem formation.
     *
     * @since 26.2
     */
    enum Thickness {
        /**
         * Extended tip.
         *
         * @since 26.2
         */
        TIP_MERGE,
        /**
         * Just the tip.
         *
         * @since 26.2
         */
        TIP,
        /**
         * Top section.
         *
         * @since 26.2
         */
        FRUSTUM,
        /**
         * Middle section.
         *
         * @since 26.2
         */
        MIDDLE,
        /**
         * Base.
         *
         * @since 26.2
         */
        BASE;
    }
}
