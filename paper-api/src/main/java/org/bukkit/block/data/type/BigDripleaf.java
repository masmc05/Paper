package org.bukkit.block.data.type;

import org.jetbrains.annotations.NotNull;

/**
 * 'tilt' indicates how far the leaf is tilted.
 *
 * @since 1.17
 */
public interface BigDripleaf extends Dripleaf {

    /**
     * Gets the value of the 'tilt' property.
     *
     * @return the 'tilt' value
     * @since 1.17
     */
    @NotNull
    Tilt getTilt();

    /**
     * Sets the value of the 'tilt' property.
     *
     * @param tilt the new 'tilt' value
     * @since 1.17
     */
    void setTilt(@NotNull Tilt tilt);

    /**
     * The tilt of a leaf.
     *
     * @since 1.17
     */
    public enum Tilt {
        /**
         * No tilt.
         *
         * @since 1.17
         */
        NONE,
        /**
         * Unstable tilt.
         *
         * @since 1.17
         */
        UNSTABLE,
        /**
         * Partial tilt.
         *
         * @since 1.17
         */
        PARTIAL,
        /**
         * Pinball.
         *
         * @since 1.17
         */
        FULL;
    }
}
