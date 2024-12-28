package org.bukkit.entity;

import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a block display entity.
 *
 * @since 1.19.4
 */
public interface BlockDisplay extends Display {

    /**
     * Gets the displayed block.
     *
     * @return the displayed block
     * @since 1.19.4
     */
    @NotNull
    public BlockData getBlock();

    /**
     * Sets the displayed block.
     *
     * @param block the new block
     * @since 1.19.4
     */
    public void setBlock(@NotNull BlockData block);
}
