package org.bukkit.block.structure;

/**
 * Represents how a {@link org.bukkit.block.Structure} can be mirrored upon
 * being loaded.
 *
 * @since 1.12.2
 */
public enum Mirror {

    /**
     * No mirroring.
     * <br>
     * Positive X to Positive Z
     *
     * @since 1.12.2
     */
    NONE,
    /**
     * Structure is mirrored left to right.
     * <br>
     * Similar to looking in a mirror. Positive X to Negative Z
     *
     * @since 1.12.2
     */
    LEFT_RIGHT,
    /**
     * Structure is mirrored front to back.
     * <br>
     * Positive Z to Negative X
     *
     * @since 1.12.2
     */
    FRONT_BACK;
}
