package org.bukkit.block.data;

import org.jspecify.annotations.NullMarked;

/**
 * 'side_chain' represents the current side of this block.
 *
 * @since 1.21.10
 */
@NullMarked
public interface SideChaining extends BlockData {

    /**
     * Gets the value of the 'side_chain' property.
     *
     * @return the 'side_chain' value
     * @since 1.21.10
     */
    ChainPart getSideChain();

    /**
     * Sets the value of the 'side_chain' property.
     *
     * @param part the new 'side_chain' value
     * @since 1.21.10
     */
    void setSideChain(ChainPart part);

    /**
     * @since 1.21.10
     */
    enum ChainPart {
        /**
         * @since 1.21.10
         */
        UNCONNECTED,
        /**
         * @since 1.21.10
         */
        RIGHT,
        /**
         * @since 1.21.10
         */
        CENTER,
        /**
         * @since 1.21.10
         */
        LEFT
    }
}
