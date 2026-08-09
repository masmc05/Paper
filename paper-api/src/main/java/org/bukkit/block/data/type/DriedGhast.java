package org.bukkit.block.data.type;

import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Waterlogged;

/**
 * Represents a dried ghast block data.
 *
 * @since 1.21.6
 */
public interface DriedGhast extends Directional, Waterlogged {

    /**
     * Gets the hydration level of this dried ghast.
     *
     * @return the hydration level, reaching from 0 to {@link #getMaximumHydration()}
     * @since 1.21.6
     */
    int getHydration();

    /**
     * Sets the hydration level of this dried ghast.
     *
     * @param hydration the hydration level, reaching from 0 to {@link #getMaximumHydration()}
     * @since 1.21.6
     */
    void setHydration(final int hydration);

    /**
     * Provides the maximum hydration level this dried ghast can reach.
     *
     * @return the maximum level.
     * @since 1.21.6
     */
    int getMaximumHydration();

}
