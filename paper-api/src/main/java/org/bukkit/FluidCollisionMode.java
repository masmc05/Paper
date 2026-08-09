package org.bukkit;

/**
 * Determines the collision behavior when fluids get hit during ray tracing.
 *
 * @since 1.13.2
 */
public enum FluidCollisionMode {

    /**
     * Ignore fluids.
     *
     * @since 1.13.2
     */
    NEVER,
    /**
     * Only collide with source fluid blocks.
     *
     * @since 1.13.2
     */
    SOURCE_ONLY,
    /**
     * Collide with all fluids.
     *
     * @since 1.13.2
     */
    ALWAYS;
}
