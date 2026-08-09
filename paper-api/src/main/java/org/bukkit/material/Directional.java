package org.bukkit.material;

import org.bukkit.block.BlockFace;
import org.jetbrains.annotations.NotNull;

/**
 * @since 1.0.0
 */
public interface Directional {

    /**
     * Sets the direction that this block is facing in
     *
     * @param face The facing direction
     * @since 1.0.0
     */
    public void setFacingDirection(@NotNull BlockFace face);

    /**
     * Gets the direction this block is facing
     *
     * @return the direction this block is facing
     * @since 1.0.0
     */
    @NotNull
    public BlockFace getFacing();
}
