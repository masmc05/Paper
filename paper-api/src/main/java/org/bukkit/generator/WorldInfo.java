package org.bukkit.generator;

import java.util.UUID;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

/**
 * Holds various information of a World
 *
 * @since 1.17.1
 */
public interface WorldInfo extends io.papermc.paper.world.flag.FeatureFlagSetHolder { // Paper - feature flag API

    /**
     * Gets the unique name of this world
     *
     * @return Name of this world
     * @since 1.17.1
     */
    @NotNull
    String getName();

    /**
     * Gets the Unique ID of this world
     *
     * @return Unique ID of this world.
     * @since 1.17.1
     */
    @NotNull
    UUID getUID();

    /**
     * Gets the {@link World.Environment} type of this world
     *
     * @return This worlds Environment type
     * @since 1.17.1
     */
    @NotNull
    World.Environment getEnvironment();

    /**
     * Gets the Seed for this world.
     *
     * @return This worlds Seed
     * @since 1.17.1
     */
    long getSeed();

    /**
     * Gets the minimum height of this world.
     * <p>
     * If the min height is 0, there are only blocks from y=0.
     *
     * @return Minimum height of the world
     * @since 1.17.1
     */
    int getMinHeight();

    /**
     * Gets the maximum height of this world.
     * <p>
     * If the max height is 100, there are only blocks from y=0 to y=99.
     *
     * @return Maximum height of the world
     * @since 1.17.1
     */
    int getMaxHeight();

    // Paper start
    /**
     * Get the vanilla {@link BiomeProvider} for this world.
     *
     * @return vanilla biome provider
     * @since 1.18.1
     */
    @NotNull BiomeProvider vanillaBiomeProvider();
    // Paper end
}
