package org.bukkit.generator.structure;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.jetbrains.annotations.NotNull;

/**
 * Represent a Structure from the world.
 * <p>
 * Listed structures are present in the default server. Depending on the server
 * there might be additional structures present (for example structures added by
 * data packs), which can be received via {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)} and {@link io.papermc.paper.registry.RegistryKey#STRUCTURE}.
 *
 * @since 1.19
 */
public abstract class Structure implements Keyed {

    /**
     * @since 1.19
     */
    // Start generate - Structure
    public static final Structure ANCIENT_CITY = getStructure("ancient_city");

    /**
     * @since 1.19
     */
    public static final Structure BASTION_REMNANT = getStructure("bastion_remnant");

    /**
     * @since 1.19
     */
    public static final Structure BURIED_TREASURE = getStructure("buried_treasure");

    /**
     * @since 1.19
     */
    public static final Structure DESERT_PYRAMID = getStructure("desert_pyramid");

    /**
     * @since 1.19
     */
    public static final Structure END_CITY = getStructure("end_city");

    /**
     * @since 1.19
     */
    public static final Structure FORTRESS = getStructure("fortress");

    /**
     * @since 1.19
     */
    public static final Structure IGLOO = getStructure("igloo");

    /**
     * @since 1.19
     */
    public static final Structure JUNGLE_PYRAMID = getStructure("jungle_pyramid");

    /**
     * @since 1.19
     */
    public static final Structure MANSION = getStructure("mansion");

    /**
     * @since 1.19
     */
    public static final Structure MINESHAFT = getStructure("mineshaft");

    /**
     * @since 1.19
     */
    public static final Structure MINESHAFT_MESA = getStructure("mineshaft_mesa");

    /**
     * @since 1.19
     */
    public static final Structure MONUMENT = getStructure("monument");

    /**
     * @since 1.19
     */
    public static final Structure NETHER_FOSSIL = getStructure("nether_fossil");

    /**
     * @since 1.19
     */
    public static final Structure OCEAN_RUIN_COLD = getStructure("ocean_ruin_cold");

    /**
     * @since 1.19
     */
    public static final Structure OCEAN_RUIN_WARM = getStructure("ocean_ruin_warm");

    /**
     * @since 1.19
     */
    public static final Structure PILLAGER_OUTPOST = getStructure("pillager_outpost");

    /**
     * @since 1.19
     */
    public static final Structure RUINED_PORTAL = getStructure("ruined_portal");

    /**
     * @since 1.19
     */
    public static final Structure RUINED_PORTAL_DESERT = getStructure("ruined_portal_desert");

    /**
     * @since 1.19
     */
    public static final Structure RUINED_PORTAL_JUNGLE = getStructure("ruined_portal_jungle");

    /**
     * @since 1.19
     */
    public static final Structure RUINED_PORTAL_MOUNTAIN = getStructure("ruined_portal_mountain");

    /**
     * @since 1.19
     */
    public static final Structure RUINED_PORTAL_NETHER = getStructure("ruined_portal_nether");

    /**
     * @since 1.19
     */
    public static final Structure RUINED_PORTAL_OCEAN = getStructure("ruined_portal_ocean");

    /**
     * @since 1.19
     */
    public static final Structure RUINED_PORTAL_SWAMP = getStructure("ruined_portal_swamp");

    /**
     * @since 1.19
     */
    public static final Structure SHIPWRECK = getStructure("shipwreck");

    /**
     * @since 1.19
     */
    public static final Structure SHIPWRECK_BEACHED = getStructure("shipwreck_beached");

    /**
     * @since 1.19
     */
    public static final Structure STRONGHOLD = getStructure("stronghold");

    /**
     * @since 1.19
     */
    public static final Structure SWAMP_HUT = getStructure("swamp_hut");

    /**
     * @since 1.20
     */
    public static final Structure TRAIL_RUINS = getStructure("trail_ruins");

    /**
     * @since 1.20.4
     */
    public static final Structure TRIAL_CHAMBERS = getStructure("trial_chambers");

    /**
     * @since 1.19
     */
    public static final Structure VILLAGE_DESERT = getStructure("village_desert");

    /**
     * @since 1.19
     */
    public static final Structure VILLAGE_PLAINS = getStructure("village_plains");

    /**
     * @since 1.19
     */
    public static final Structure VILLAGE_SAVANNA = getStructure("village_savanna");

    /**
     * @since 1.19
     */
    public static final Structure VILLAGE_SNOWY = getStructure("village_snowy");

    /**
     * @since 1.19
     */
    public static final Structure VILLAGE_TAIGA = getStructure("village_taiga");
    // End generate - Structure

    @NotNull
    private static Structure getStructure(@NotNull @KeyPattern.Value String key) {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.STRUCTURE).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * Returns the type of the structure.
     *
     * @return the type of structure
     * @since 1.19
     */
    @NotNull
    public abstract StructureType getStructureType();
    // Paper start - deprecate getKey
    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#STRUCTURE}. Structures can exist without a key.
     */
    @Override
    @Deprecated(since = "1.20.4", forRemoval = true)
    public abstract @NotNull NamespacedKey getKey();

    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#STRUCTURE}. Structures can exist without a key.
     */
    @Override
    @Deprecated(since = "1.20.4", forRemoval = true)
    public net.kyori.adventure.key.@org.jetbrains.annotations.NotNull Key key() {
        return org.bukkit.Keyed.super.key();
    }

    // Paper end - deprecate getKey
}
