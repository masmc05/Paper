package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;

/**
 * 'berries' indicates whether the block has berries.
 *
 * @since 1.17
 */
public interface CaveVinesPlant extends BlockData {

    /**
     * Gets the value of the 'berries' property.
     *
     * @return the 'berries' value
     * @since 1.17
     */
    boolean isBerries();

    /**
     * Sets the value of the 'berries' property.
     *
     * @param berries the new 'berries' value
     * @since 1.17
     */
    void setBerries(boolean berries);
}
