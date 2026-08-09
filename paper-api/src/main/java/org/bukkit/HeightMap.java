package org.bukkit;

/**
 * Further information regarding heightmaps.
 *
 * @see <a href="https://minecraft.wiki/w/Chunk_format">Minecraft Wiki</a>
 * @since 1.15.2
 */
public enum HeightMap {

    /**
     * The highest block that blocks motion or contains a fluid.
     *
     * @since 1.15.2
     */
    MOTION_BLOCKING,
    /**
     * The highest block that blocks motion or contains a fluid, excluding leaves.
     *
     * @since 1.15.2
     */
    MOTION_BLOCKING_NO_LEAVES,
    /**
     * The highest non-air block, solid block.
     *
     * @since 1.15.2
     */
    OCEAN_FLOOR,
    /**
     * The highest block that is neither air nor contains a fluid, for worldgen.
     *
     * @since 1.15.2
     */
    OCEAN_FLOOR_WG,
    /**
     * The highest non-air block.
     *
     * @since 1.15.2
     */
    WORLD_SURFACE,
    /**
     * The highest non-air block, for worldgen.
     *
     * @since 1.15.2
     */
    WORLD_SURFACE_WG,
}
