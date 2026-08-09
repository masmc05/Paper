package io.papermc.paper.raytracing;

/**
 * Determines the collision behavior when blocks get hit during ray tracing.
 *
 * @since 1.21.11
 */
public enum BlockCollisionMode {

    /**
     * Use the collision shape.
     *
     * @since 1.21.11
     */
    COLLIDER,
    /**
     * Use the outline shape.
     *
     * @since 1.21.11
     */
    OUTLINE,
    /**
     * Use the visual shape.
     *
     * @since 1.21.11
     */
    VISUAL
}
