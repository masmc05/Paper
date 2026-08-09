package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Waterlogged;
import org.jspecify.annotations.NullMarked;

/**
 * 'copper_golem_pose' indicates the pose the statue stands.
 *
 * @since 1.21.10
 */
@NullMarked
public interface CopperGolemStatue extends BlockData, Directional, Waterlogged {

    /**
     * Gets the value of the 'copper_golem_pose' property.
     *
     * @return the 'copper_golem_pose' value
     * @since 1.21.10
     */
    Pose getCopperGolemPose();

    /**
     * Sets the value of the 'copper_golem_pose' property.
     *
     * @param pose the new 'copper_golem_pose' value
     * @since 1.21.10
     */
    void setCopperGolemPose(Pose pose);

    /**
     * @since 1.21.10
     */
    enum Pose {
        /**
         * @since 1.21.10
         */
        STANDING,
        /**
         * @since 1.21.10
         */
        SITTING,
        /**
         * @since 1.21.10
         */
        RUNNING,
        /**
         * @since 1.21.10
         */
        STAR
    }
}
