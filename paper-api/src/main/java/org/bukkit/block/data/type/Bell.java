package org.bukkit.block.data.type;

import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Powerable;
import org.jetbrains.annotations.NotNull;

/**
 * 'attachment' denotes how the bell is attached to its block.
 *
 * @since 1.14
 */
public interface Bell extends Directional, Powerable {

    /**
     * Gets the value of the 'attachment' property.
     *
     * @return the 'attachment' value
     * @since 1.14
     */
    @NotNull
    Attachment getAttachment();

    /**
     * Sets the value of the 'attachment' property.
     *
     * @param attachment the new 'attachment' value
     * @since 1.14
     */
    void setAttachment(@NotNull Attachment attachment);

    /**
     * What the bell is attached to.
     *
     * @since 1.14
     */
    public enum Attachment {

        /**
         * Placed on floor.
         *
         * @since 1.14
         */
        FLOOR,
        /**
         * Placed on ceiling.
         *
         * @since 1.14
         */
        CEILING,
        /**
         * Placed on one wall.
         *
         * @since 1.14
         */
        SINGLE_WALL,
        /**
         * Placed between two walls.
         *
         * @since 1.14
         */
        DOUBLE_WALL;
    }
}
