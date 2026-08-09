package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;

/**
 * 'drag' indicates whether a force will be applied on entities moving through
 * this block.
 *
 * @since 1.13
 */
public interface BubbleColumn extends BlockData {

    /**
     * Gets the value of the 'drag' property.
     *
     * @return the 'drag' value
     * @since 1.13
     */
    boolean isDrag();

    /**
     * Sets the value of the 'drag' property.
     *
     * @param drag the new 'drag' value
     * @since 1.13
     */
    void setDrag(boolean drag);

}
