package org.bukkit;

/**
 * Determines the collision behavior when fluids get hit during ray tracing.
 *
 * @since 1.13.2
 */
public enum FluidCollisionMode {

    /**
     * Ignore fluids.
     */
    NEVER,
    /**
     * Only collide with source fluid blocks.
     */
    SOURCE_ONLY,
    /**
     * Collide with all fluids.
     */
    ALWAYS;
}
