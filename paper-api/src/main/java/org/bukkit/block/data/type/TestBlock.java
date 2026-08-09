package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.NotNull;

/**
 * 'mode' is the reaction of the block to a redstone pulse or its supply.
 *
 * @since 1.21.6
 */
public interface TestBlock extends BlockData {

    /**
     * Gets the value of the 'mode' property.
     *
     * @return the 'mode' value
     * @since 1.21.6
     */
    @NotNull
    Mode getMode();

    /**
     * Sets the value of the 'mode' property.
     *
     * @param mode the new 'mode' value
     * @since 1.21.6
     */
    void setMode(@NotNull Mode mode);

    /**
     * @since 1.21.6
     */
    enum Mode {
        /**
         * @since 1.21.6
         */
        START,
        /**
         * @since 1.21.6
         */
        LOG,
        /**
         * @since 1.21.6
         */
        FAIL,
        /**
         * @since 1.21.6
         */
        ACCEPT
    }
}
