package org.bukkit.generator;

/**
 * Represents the biome noise parameters which may be passed to a world
 * generator.
 *
 * @since 1.19.3
 */
public interface BiomeParameterPoint {

    /**
     * Gets the temperature of the biome at this point that is suggested by the
     * NoiseGenerator.
     *
     * @return The temperature of the biome at this point
     * @since 1.19.3
     */
    double getTemperature();

    /**
     * Gets the maximum temperature that is possible.
     *
     * @return The maximum temperature
     * @since 1.19.3
     */
    double getMaxTemperature();

    /**
     * Gets the minimum temperature that is possible.
     *
     * @return The minimum temperature
     * @since 1.19.3
     */
    double getMinTemperature();

    /**
     * Gets the humidity of the biome at this point that is suggested by the
     * NoiseGenerator.
     *
     * @return The humidity of the biome at this point
     * @since 1.19.3
     */
    double getHumidity();

    /**
     * Gets the maximum humidity that is possible.
     *
     * @return The maximum humidity
     * @since 1.19.3
     */
    double getMaxHumidity();

    /**
     * Gets the minimum humidity that is possible.
     *
     * @return The minimum humidity
     * @since 1.19.3
     */
    double getMinHumidity();

    /**
     * Gets the continentalness of the biome at this point that is suggested by
     * the NoiseGenerator.
     *
     * @return The continentalness of the biome at this point
     * @since 1.19.3
     */
    double getContinentalness();

    /**
     * Gets the maximum continentalness that is possible.
     *
     * @return The maximum continentalness
     * @since 1.19.3
     */
    double getMaxContinentalness();

    /**
     * Gets the minimum continentalness that is possible.
     *
     * @return The minimum continentalness
     * @since 1.19.3
     */
    double getMinContinentalness();

    /**
     * Gets the erosion of the biome at this point that is suggested by the
     * NoiseGenerator.
     *
     * @return The erosion of the biome at this point
     * @since 1.19.3
     */
    double getErosion();

    /**
     * Gets the maximum erosion that is possible.
     *
     * @return The maximum erosion
     * @since 1.19.3
     */
    double getMaxErosion();

    /**
     * Gets the minimum erosion that is possible.
     *
     * @return The minimum erosion
     * @since 1.19.3
     */
    double getMinErosion();

    /**
     * Gets the depth of the biome at this point that is suggested by the
     * NoiseGenerator.
     *
     * @return The depth of the biome at this point
     * @since 1.19.3
     */
    double getDepth();

    /**
     * Gets the maximum depth that is possible.
     *
     * @return The maximum depth
     * @since 1.19.3
     */
    double getMaxDepth();

    /**
     * Gets the minimum depth that is possible.
     *
     * @return The minimum depth
     * @since 1.19.3
     */
    double getMinDepth();

    /**
     * Gets the weirdness of the biome at this point that is suggested by the
     * NoiseGenerator.
     *
     * @return The weirdness of the biome at this point
     * @since 1.19.3
     */
    double getWeirdness();

    /**
     * Gets the maximum weirdness that is possible.
     *
     * @return The maximum weirdness
     * @since 1.19.3
     */
    double getMaxWeirdness();

    /**
     * Gets the minimum weirdness that is possible.
     *
     * @return The minimum weirdness
     * @since 1.19.3
     */
    double getMinWeirdness();
}
