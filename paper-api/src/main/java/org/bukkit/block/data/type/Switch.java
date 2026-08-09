package org.bukkit.block.data.type;

import org.bukkit.block.data.Directional;
import org.bukkit.block.data.FaceAttachable;
import org.bukkit.block.data.Powerable;
import org.jetbrains.annotations.NotNull;

/**
 * @since 1.13
 */
public interface Switch extends Directional, FaceAttachable, Powerable {

    /**
     * @since 1.21.6
     */
    @NotNull
    AttachedFace getAttachedFace();

    /**
     * @since 1.21.6
     */
    void setAttachedFace(@NotNull AttachedFace face);

    /**
     * Gets the value of the 'face' property.
     *
     * @return the 'face' value
     * @deprecated use {@link #getAttachedFace()}
     * @since 1.13
     */
    @NotNull
    @Deprecated(since = "1.15.2")
    default Face getFace() {
        return Face.valueOf(this.getAttachedFace().name());
    }

    /**
     * Sets the value of the 'face' property.
     *
     * @param face the new 'face' value
     * @deprecated use {@link #setAttachedFace(AttachedFace)}
     * @since 1.13
     */
    @Deprecated(since = "1.15.2")
    default void setFace(@NotNull Face face) {
        this.setAttachedFace(AttachedFace.valueOf(face.name()));
    }

    /**
     * The face to which a switch type block is stuck.
     *
     * @deprecated use {@link AttachedFace}
     * @since 1.13
     */
    @Deprecated(since = "1.15.2")
    public enum Face {
        /**
         * The switch is mounted to the floor and pointing upwards.
         *
         * @since 1.13
         */
        FLOOR,
        /**
         * The switch is mounted to the wall.
         *
         * @since 1.13
         */
        WALL,
        /**
         * The switch is mounted to the ceiling and pointing downwards.
         *
         * @since 1.13
         */
        CEILING;
    }
}
