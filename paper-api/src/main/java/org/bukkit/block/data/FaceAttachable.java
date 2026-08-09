package org.bukkit.block.data;

import org.jetbrains.annotations.NotNull;

/**
 * 'face' represents the face to which a lever or button is stuck.
 * <br>
 * This is used in conjunction with {@link Directional} to compute the
 * orientation of these blocks.
 *
 * @since 1.15.2
 */
public interface FaceAttachable extends BlockData {

    /**
     * Gets the value of the 'face' property.
     *
     * @return the 'face' value
     * @since 1.15.2
     */
    @NotNull
    AttachedFace getAttachedFace();

    /**
     * Sets the value of the 'face' property.
     *
     * @param face the new 'face' value
     * @since 1.15.2
     */
    void setAttachedFace(@NotNull AttachedFace face);

    /**
     * The face to which a switch type block is stuck.
     *
     * @since 1.15.2
     */
    public enum AttachedFace {
        /**
         * The switch is mounted to the floor and pointing upwards.
         *
         * @since 1.15.2
         */
        FLOOR,
        /**
         * The switch is mounted to the wall.
         *
         * @since 1.15.2
         */
        WALL,
        /**
         * The switch is mounted to the ceiling and pointing downwards.
         *
         * @since 1.15.2
         */
        CEILING;
    }
}
