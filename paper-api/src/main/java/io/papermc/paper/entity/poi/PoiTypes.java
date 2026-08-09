package io.papermc.paper.entity.poi;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Registry;
import org.jspecify.annotations.NullMarked;

/**
 * All the built-in point of interest types.
 *
 * @since 26.2
 */
@NullMarked
public final class PoiTypes {

    /**
     * @since 26.2
     */
    // Start generate - PoiTypes
    public static final PoiType ARMORER = get("armorer");

    /**
     * @since 26.2
     */
    public static final PoiType BEE_NEST = get("bee_nest");

    /**
     * @since 26.2
     */
    public static final PoiType BEEHIVE = get("beehive");

    /**
     * @since 26.2
     */
    public static final PoiType BUTCHER = get("butcher");

    /**
     * @since 26.2
     */
    public static final PoiType CARTOGRAPHER = get("cartographer");

    /**
     * @since 26.2
     */
    public static final PoiType CLERIC = get("cleric");

    /**
     * @since 26.2
     */
    public static final PoiType FARMER = get("farmer");

    /**
     * @since 26.2
     */
    public static final PoiType FISHERMAN = get("fisherman");

    /**
     * @since 26.2
     */
    public static final PoiType FLETCHER = get("fletcher");

    /**
     * @since 26.2
     */
    public static final PoiType HOME = get("home");

    /**
     * @since 26.2
     */
    public static final PoiType LEATHERWORKER = get("leatherworker");

    /**
     * @since 26.2
     */
    public static final PoiType LIBRARIAN = get("librarian");

    /**
     * @since 26.2
     */
    public static final PoiType LIGHTNING_ROD = get("lightning_rod");

    /**
     * @since 26.2
     */
    public static final PoiType LODESTONE = get("lodestone");

    /**
     * @since 26.2
     */
    public static final PoiType MASON = get("mason");

    /**
     * @since 26.2
     */
    public static final PoiType MEETING = get("meeting");

    /**
     * @since 26.2
     */
    public static final PoiType NETHER_PORTAL = get("nether_portal");

    /**
     * @since 26.2
     */
    public static final PoiType SHEPHERD = get("shepherd");

    /**
     * @since 26.2
     */
    public static final PoiType TEST_INSTANCE = get("test_instance");

    /**
     * @since 26.2
     */
    public static final PoiType TOOLSMITH = get("toolsmith");

    /**
     * @since 26.2
     */
    public static final PoiType WEAPONSMITH = get("weaponsmith");
    // End generate - PoiTypes

    private static PoiType get(@KeyPattern.Value final String key) {
        return Registry.POINT_OF_INTEREST_TYPE.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    private PoiTypes() {
    }
}
