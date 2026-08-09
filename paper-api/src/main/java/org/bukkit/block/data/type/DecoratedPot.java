package org.bukkit.block.data.type;

import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Waterlogged;

/**
 * @since 1.19.4
 */
public interface DecoratedPot extends Directional, Waterlogged {

    /**
     * Gets the value of the 'cracked' property.
     *
     * @return the 'cracked' value
     * @since 1.21.1
     */
    boolean isCracked();

    /**
     * Sets the value of the 'cracked' property.
     *
     * @param cracked the new 'cracked' value
     * @since 1.21.1
     */
    void setCracked(boolean cracked);
}
