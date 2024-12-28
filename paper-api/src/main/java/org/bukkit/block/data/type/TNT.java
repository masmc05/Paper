package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;

/**
 * 'unstable' indicates whether this TNT will explode on punching.
 *
 * @since 1.13.1
 */
public interface TNT extends BlockData {

    /**
     * Gets the value of the 'unstable' property.
     *
     * @return the 'unstable' value
     * @since 1.13.1
     */
    boolean isUnstable();

    /**
     * Sets the value of the 'unstable' property.
     *
     * @param unstable the new 'unstable' value
     * @since 1.13.1
     */
    void setUnstable(boolean unstable);
}
