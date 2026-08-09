package org.bukkit.block.data;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

/**
 * 'shape' represents the current layout of a minecart rail.
 * <br>
 * Some types of rail may not be able to be laid out in all shapes, use
 * {@link #getShapes()} to get those applicable to this block.
 *
 * @since 1.13
 */
public interface Rail extends Waterlogged {

    /**
     * Gets the value of the 'shape' property.
     *
     * @return the 'shape' value
     * @since 1.13
     */
    @NotNull
    Shape getShape();

    /**
     * Sets the value of the 'shape' property.
     *
     * @param shape the new 'shape' value
     * @since 1.13
     */
    void setShape(@NotNull Shape shape);

    /**
     * Gets the shapes which are applicable to this block.
     *
     * @return the allowed 'shape' values
     * @since 1.13
     */
    @NotNull
    Set<Shape> getShapes();

    /**
     * The different types of shapes a rail block can occupy.
     *
     * @since 1.13
     */
    public enum Shape {

        /**
         * The rail runs flat along the north/south (Z) axis.
         *
         * @since 1.13
         */
        NORTH_SOUTH,
        /**
         * The rail runs flat along the east/west (X) axis.
         *
         * @since 1.13
         */
        EAST_WEST,
        /**
         * The rail ascends in the east (positive X) direction.
         *
         * @since 1.13
         */
        ASCENDING_EAST,
        /**
         * The rail ascends in the west (negative X) direction.
         *
         * @since 1.13
         */
        ASCENDING_WEST,
        /**
         * The rail ascends in the north (negative Z) direction.
         *
         * @since 1.13
         */
        ASCENDING_NORTH,
        /**
         * The rail ascends in the south (positive Z) direction.
         *
         * @since 1.13
         */
        ASCENDING_SOUTH,
        /**
         * The rail forms a curve connecting the south and east faces of the
         * block.
         *
         * @since 1.13
         */
        SOUTH_EAST,
        /**
         * The rail forms a curve connecting the south and west faces of the
         * block.
         *
         * @since 1.13
         */
        SOUTH_WEST,
        /**
         * The rail forms a curve connecting the north and west faces of the
         * block.
         *
         * @since 1.13
         */
        NORTH_WEST,
        /**
         * The rail forms a curve connecting the north and east faces of the
         * block.
         *
         * @since 1.13
         */
        NORTH_EAST;
    }
}
