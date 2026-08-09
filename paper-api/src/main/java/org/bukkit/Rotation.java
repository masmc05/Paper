package org.bukkit;

import org.jetbrains.annotations.NotNull;

/**
 * An enum to specify a rotation based orientation, like that on a clock.
 * <p>
 * It represents how something is viewed, as opposed to cardinal directions.
 *
 * @since 1.4.5
 */
public enum Rotation {

    /**
     * No rotation
     *
     * @since 1.4.5
     */
    NONE,
    /**
     * Rotated clockwise by 45 degrees
     *
     * @since 1.8
     */
    CLOCKWISE_45,
    /**
     * Rotated clockwise by 90 degrees
     *
     * @since 1.4.5
     */
    CLOCKWISE,
    /**
     * Rotated clockwise by 135 degrees
     *
     * @since 1.8
     */
    CLOCKWISE_135,
    /**
     * Flipped upside-down, a 180 degree rotation
     *
     * @since 1.4.5
     */
    FLIPPED,
    /**
     * Flipped upside-down + 45 degree rotation
     *
     * @since 1.8
     */
    FLIPPED_45,
    /**
     * Rotated counter-clockwise by 90 degrees
     *
     * @since 1.4.5
     */
    COUNTER_CLOCKWISE,
    /**
     * Rotated counter-clockwise by 45 degrees
     *
     * @since 1.8
     */
    COUNTER_CLOCKWISE_45
    ;

    private static final Rotation[] rotations = values();

    /**
     * Rotate clockwise by 90 degrees.
     *
     * @return the relative rotation
     * @since 1.4.5
     */
    @NotNull
    public Rotation rotateClockwise() {
        return rotations[(this.ordinal() + 1) & 0x7];
    }

    /**
     * Rotate counter-clockwise by 90 degrees.
     *
     * @return the relative rotation
     * @since 1.4.5
     */
    @NotNull
    public Rotation rotateCounterClockwise() {
        return rotations[(this.ordinal() - 1) & 0x7];
    }
}
