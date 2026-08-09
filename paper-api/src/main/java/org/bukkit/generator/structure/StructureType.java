package org.bukkit.generator.structure;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.bukkit.Registry;
import org.jetbrains.annotations.NotNull;

/**
 * Represent a StructureType of a {@link Structure}.
 * <p>
 * Listed structure types are present in the default server. Depending on the
 * server there might be additional structure types present (for example
 * structure types added by data packs), which can be received via
 * {@link Registry#STRUCTURE_TYPE}.
 *
 * @since 1.19
 */
public abstract class StructureType implements Keyed {

    /**
     * @since 1.19
     */
    // Start generate - StructureType
    public static final StructureType BURIED_TREASURE = getStructureType("buried_treasure");

    /**
     * @since 1.19
     */
    public static final StructureType DESERT_PYRAMID = getStructureType("desert_pyramid");

    /**
     * @since 1.19
     */
    public static final StructureType END_CITY = getStructureType("end_city");

    /**
     * @since 1.19
     */
    public static final StructureType FORTRESS = getStructureType("fortress");

    /**
     * @since 1.19
     */
    public static final StructureType IGLOO = getStructureType("igloo");

    /**
     * @since 1.19
     */
    public static final StructureType JIGSAW = getStructureType("jigsaw");

    /**
     * @since 1.19
     */
    public static final StructureType JUNGLE_TEMPLE = getStructureType("jungle_temple");

    /**
     * @since 1.19
     */
    public static final StructureType MINESHAFT = getStructureType("mineshaft");

    /**
     * @since 1.19
     */
    public static final StructureType NETHER_FOSSIL = getStructureType("nether_fossil");

    /**
     * @since 1.19
     */
    public static final StructureType OCEAN_MONUMENT = getStructureType("ocean_monument");

    /**
     * @since 1.19
     */
    public static final StructureType OCEAN_RUIN = getStructureType("ocean_ruin");

    /**
     * @since 1.19
     */
    public static final StructureType RUINED_PORTAL = getStructureType("ruined_portal");

    /**
     * @since 1.19
     */
    public static final StructureType SHIPWRECK = getStructureType("shipwreck");

    /**
     * @since 1.19
     */
    public static final StructureType STRONGHOLD = getStructureType("stronghold");

    /**
     * @since 1.19
     */
    public static final StructureType SWAMP_HUT = getStructureType("swamp_hut");

    /**
     * @since 1.19
     */
    public static final StructureType WOODLAND_MANSION = getStructureType("woodland_mansion");
    // End generate - StructureType

    @NotNull
    private static StructureType getStructureType(@NotNull @KeyPattern.Value String key) {
        return Registry.STRUCTURE_TYPE.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }
}
