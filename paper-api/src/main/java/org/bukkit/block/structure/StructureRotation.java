package org.bukkit.block.structure;

/**
 * Represents how a {@link org.bukkit.block.Structure} can be rotated.
 *
 * @since 1.12.2
 */
public enum StructureRotation {

    /**
     * No rotation.
     *
     * @since 1.12.2
     */
    NONE,
    /**
     * Rotated clockwise 90 degrees.
     *
     * @since 1.12.2
     */
    CLOCKWISE_90,
    /**
     * Rotated clockwise 180 degrees.
     *
     * @since 1.12.2
     */
    CLOCKWISE_180,
    /**
     * Rotated counter clockwise 90 degrees.
     * <br>
     * Equivalent to rotating clockwise 270 degrees.
     *
     * @since 1.12.2
     */
    COUNTERCLOCKWISE_90;
}
