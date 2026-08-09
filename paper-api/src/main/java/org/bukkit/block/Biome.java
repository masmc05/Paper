package org.bukkit.block;

import com.google.common.base.Preconditions;
import io.papermc.paper.InternalAPIBridge;
import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import java.util.Locale;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Bukkit;
import org.bukkit.FeatureFlag;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Holds all accepted Biomes in the server.
 * <p>
 * The Biomes listed in this interface are present in the default server
 * or can be enabled via a {@link FeatureFlag}.
 * There may be additional biomes present in the server, for example from a {@link io.papermc.paper.datapack.Datapack}
 * which can be accessed via {@link io.papermc.paper.registry.RegistryAccess#getRegistry(RegistryKey)} and {@link RegistryKey#BIOME}.
 *
 * @since 1.0.0
 */
public interface Biome extends OldEnum<Biome>, Keyed, net.kyori.adventure.translation.Translatable { // Paper - Adventure translations

    /**
     * @since 1.13
     */
    // Start generate - Biome
    Biome BADLANDS = getBiome("badlands");

    /**
     * @since 1.14
     */
    Biome BAMBOO_JUNGLE = getBiome("bamboo_jungle");

    /**
     * @since 1.16.1
     */
    Biome BASALT_DELTAS = getBiome("basalt_deltas");

    /**
     * @since 1.1.0
     */
    Biome BEACH = getBiome("beach");

    /**
     * @since 1.7.2
     */
    Biome BIRCH_FOREST = getBiome("birch_forest");

    /**
     * @since 1.19.4
     */
    Biome CHERRY_GROVE = getBiome("cherry_grove");

    /**
     * @since 1.13
     */
    Biome COLD_OCEAN = getBiome("cold_ocean");

    /**
     * @since 1.16.1
     */
    Biome CRIMSON_FOREST = getBiome("crimson_forest");

    /**
     * @since 1.13
     */
    Biome DARK_FOREST = getBiome("dark_forest");

    /**
     * @since 1.13
     */
    Biome DEEP_COLD_OCEAN = getBiome("deep_cold_ocean");

    /**
     * @since 1.19
     */
    Biome DEEP_DARK = getBiome("deep_dark");

    /**
     * @since 1.13
     */
    Biome DEEP_FROZEN_OCEAN = getBiome("deep_frozen_ocean");

    /**
     * @since 1.13
     */
    Biome DEEP_LUKEWARM_OCEAN = getBiome("deep_lukewarm_ocean");

    /**
     * @since 1.7.2
     */
    Biome DEEP_OCEAN = getBiome("deep_ocean");

    /**
     * @since 1.0.0
     */
    Biome DESERT = getBiome("desert");

    /**
     * @since 1.17
     */
    Biome DRIPSTONE_CAVES = getBiome("dripstone_caves");

    /**
     * @since 1.13
     */
    Biome END_BARRENS = getBiome("end_barrens");

    /**
     * @since 1.13
     */
    Biome END_HIGHLANDS = getBiome("end_highlands");

    /**
     * @since 1.13
     */
    Biome END_MIDLANDS = getBiome("end_midlands");

    /**
     * @since 1.13
     */
    Biome ERODED_BADLANDS = getBiome("eroded_badlands");

    /**
     * @since 1.7.2
     */
    Biome FLOWER_FOREST = getBiome("flower_forest");

    /**
     * @since 1.0.0
     */
    Biome FOREST = getBiome("forest");

    /**
     * @since 1.0.0
     */
    Biome FROZEN_OCEAN = getBiome("frozen_ocean");

    /**
     * @since 1.18.1
     */
    Biome FROZEN_PEAKS = getBiome("frozen_peaks");

    /**
     * @since 1.0.0
     */
    Biome FROZEN_RIVER = getBiome("frozen_river");

    /**
     * @since 1.18.1
     */
    Biome GROVE = getBiome("grove");

    /**
     * @since 1.13
     */
    Biome ICE_SPIKES = getBiome("ice_spikes");

    /**
     * @since 1.18.1
     */
    Biome JAGGED_PEAKS = getBiome("jagged_peaks");

    /**
     * @since 1.2.2
     */
    Biome JUNGLE = getBiome("jungle");

    /**
     * @since 1.13
     */
    Biome LUKEWARM_OCEAN = getBiome("lukewarm_ocean");

    /**
     * @since 1.17
     */
    Biome LUSH_CAVES = getBiome("lush_caves");

    /**
     * @since 1.19
     */
    Biome MANGROVE_SWAMP = getBiome("mangrove_swamp");

    /**
     * @since 1.18.1
     */
    Biome MEADOW = getBiome("meadow");

    /**
     * @since 1.13
     */
    Biome MUSHROOM_FIELDS = getBiome("mushroom_fields");

    /**
     * @since 1.16.1
     */
    Biome NETHER_WASTES = getBiome("nether_wastes");

    /**
     * @since 1.0.0
     */
    Biome OCEAN = getBiome("ocean");

    /**
     * @since 1.18.1
     */
    Biome OLD_GROWTH_BIRCH_FOREST = getBiome("old_growth_birch_forest");

    /**
     * @since 1.18.1
     */
    Biome OLD_GROWTH_PINE_TAIGA = getBiome("old_growth_pine_taiga");

    /**
     * @since 1.18.1
     */
    Biome OLD_GROWTH_SPRUCE_TAIGA = getBiome("old_growth_spruce_taiga");

    /**
     * @since 1.21.3
     */
    Biome PALE_GARDEN = getBiome("pale_garden");

    /**
     * @since 1.0.0
     */
    Biome PLAINS = getBiome("plains");

    /**
     * @since 1.0.0
     */
    Biome RIVER = getBiome("river");

    /**
     * @since 1.0.0
     */
    Biome SAVANNA = getBiome("savanna");

    /**
     * @since 1.7.2
     */
    Biome SAVANNA_PLATEAU = getBiome("savanna_plateau");

    /**
     * @since 1.13
     */
    Biome SMALL_END_ISLANDS = getBiome("small_end_islands");

    /**
     * @since 1.13
     */
    Biome SNOWY_BEACH = getBiome("snowy_beach");

    /**
     * @since 1.18.1
     */
    Biome SNOWY_PLAINS = getBiome("snowy_plains");

    /**
     * @since 1.18.1
     */
    Biome SNOWY_SLOPES = getBiome("snowy_slopes");

    /**
     * @since 1.13
     */
    Biome SNOWY_TAIGA = getBiome("snowy_taiga");

    /**
     * @since 1.16.1
     */
    Biome SOUL_SAND_VALLEY = getBiome("soul_sand_valley");

    /**
     * @since 1.18.1
     */
    Biome SPARSE_JUNGLE = getBiome("sparse_jungle");

    /**
     * @since 1.18.1
     */
    Biome STONY_PEAKS = getBiome("stony_peaks");

    /**
     * @since 1.18.1
     */
    Biome STONY_SHORE = getBiome("stony_shore");

    /**
     * @since 26.2
     */
    Biome SULFUR_CAVES = getBiome("sulfur_caves");

    /**
     * @since 1.7.2
     */
    Biome SUNFLOWER_PLAINS = getBiome("sunflower_plains");

    /**
     * @since 1.13
     */
    Biome SWAMP = getBiome("swamp");

    /**
     * @since 1.0.0
     */
    Biome TAIGA = getBiome("taiga");

    /**
     * @since 1.13
     */
    Biome THE_END = getBiome("the_end");

    /**
     * @since 1.13
     */
    Biome THE_VOID = getBiome("the_void");

    /**
     * @since 1.13
     */
    Biome WARM_OCEAN = getBiome("warm_ocean");

    /**
     * @since 1.16.1
     */
    Biome WARPED_FOREST = getBiome("warped_forest");

    /**
     * @since 1.18.1
     */
    Biome WINDSWEPT_FOREST = getBiome("windswept_forest");

    /**
     * @since 1.18.1
     */
    Biome WINDSWEPT_GRAVELLY_HILLS = getBiome("windswept_gravelly_hills");

    /**
     * @since 1.18.1
     */
    Biome WINDSWEPT_HILLS = getBiome("windswept_hills");

    /**
     * @since 1.18.1
     */
    Biome WINDSWEPT_SAVANNA = getBiome("windswept_savanna");

    /**
     * @since 1.18.1
     */
    Biome WOODED_BADLANDS = getBiome("wooded_badlands");
    // End generate - Biome

    /**
     * Represents a custom Biome
     *
     * @deprecated Biome is no longer an enum, custom biomes will have their own biome instance.
     */
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    Biome CUSTOM = InternalAPIBridge.get().constructLegacyCustomBiome();

    @NotNull
    private static Biome getBiome(@NotNull @KeyPattern.Value String key) {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.BIOME).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * @param name of the biome.
     * @return the biome with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static Biome valueOf(@NotNull String name) {
        if ("CUSTOM".equals(name)) {
            return Biome.CUSTOM;
        }

        final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
        Biome biome = key == null ? null : Bukkit.getUnsafe().get(RegistryKey.BIOME, key);
        Preconditions.checkArgument(biome != null, "No biome found with the name %s", name);
        return biome;
    }

    /**
     * @return an array of all known biomes.
     * @deprecated use {@link Registry#stream()}.
     */
    @NotNull
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static Biome[] values() {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.BIOME).stream().toArray(Biome[]::new);
    }

    /**
     * {@inheritDoc}
     * @since 1.19
     */
    // Paper start
    @Override
    default @NotNull String translationKey() {
        return "biome.minecraft." + this.getKey().getKey();
    }
    // Paper end
}
