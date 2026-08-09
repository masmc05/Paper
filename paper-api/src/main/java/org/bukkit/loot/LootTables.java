package org.bukkit.loot;

import org.bukkit.Bukkit;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

/**
 * This enum holds a list of all known {@link LootTable}s offered by Mojang.
 * This list is not guaranteed to be accurate in future versions.
 * <br>
 * See the
 * <a href="https://minecraft.wiki/w/Loot_table#List_of_loot_tables">
 * Minecraft Wiki</a> for more information on loot tables.
 *
 * @since 1.13
 */
public enum LootTables implements Keyed {

    /**
     * @since 1.13
     */
    // Chests/Dispensers - treasure chests
    ABANDONED_MINESHAFT("chests/abandoned_mineshaft"),
    /**
     * @since 1.13
     */
    BURIED_TREASURE("chests/buried_treasure"),
    /**
     * @since 1.13
     */
    DESERT_PYRAMID("chests/desert_pyramid"),
    /**
     * @since 1.13
     */
    END_CITY_TREASURE("chests/end_city_treasure"),
    /**
     * @since 1.13
     */
    IGLOO_CHEST("chests/igloo_chest"),
    /**
     * @since 1.13
     */
    JUNGLE_TEMPLE("chests/jungle_temple"),
    /**
     * @since 1.13
     */
    JUNGLE_TEMPLE_DISPENSER("chests/jungle_temple_dispenser"),
    /**
     * @since 1.13
     */
    NETHER_BRIDGE("chests/nether_bridge"),
    /**
     * @since 1.14
     */
    PILLAGER_OUTPOST("chests/pillager_outpost"),
    /**
     * @since 1.16.1
     */
    BASTION_TREASURE("chests/bastion_treasure"),
    /**
     * @since 1.16.1
     */
    BASTION_OTHER("chests/bastion_other"),
    /**
     * @since 1.16.1
     */
    BASTION_BRIDGE("chests/bastion_bridge"),
    /**
     * @since 1.16.1
     */
    BASTION_HOGLIN_STABLE("chests/bastion_hoglin_stable"),
    /**
     * @since 1.19
     */
    ANCIENT_CITY("chests/ancient_city"),
    /**
     * @since 1.19
     */
    ANCIENT_CITY_ICE_BOX("chests/ancient_city_ice_box"),
    /**
     * @since 1.16.1
     */
    RUINED_PORTAL("chests/ruined_portal"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_REWARD("chests/trial_chambers/reward"),
    /**
     * @since 1.20.6
     */
    TRIAL_CHAMBERS_REWARD_COMMON("chests/trial_chambers/reward_common"),
    /**
     * @since 1.20.6
     */
    TRIAL_CHAMBERS_REWARD_RARE("chests/trial_chambers/reward_rare"),
    /**
     * @since 1.20.6
     */
    TRIAL_CHAMBERS_REWARD_UNIQUE("chests/trial_chambers/reward_unique"),
    /**
     * @since 1.20.6
     */
    TRIAL_CHAMBERS_REWARD_OMINOUS("chests/trial_chambers/reward_ominous"),
    /**
     * @since 1.20.6
     */
    TRIAL_CHAMBERS_REWARD_OMINOUS_COMMON("chests/trial_chambers/reward_ominous_common"),
    /**
     * @since 1.20.6
     */
    TRIAL_CHAMBERS_REWARD_OMINOUS_RARE("chests/trial_chambers/reward_ominous_rare"),
    /**
     * @since 1.20.6
     */
    TRIAL_CHAMBERS_REWARD_OMINOUS_UNIQUE("chests/trial_chambers/reward_ominous_unique"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_SUPPLY("chests/trial_chambers/supply"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_CORRIDOR("chests/trial_chambers/corridor"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_INTERSECTION("chests/trial_chambers/intersection"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_INTERSECTION_BARREL("chests/trial_chambers/intersection_barrel"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_ENTRANCE("chests/trial_chambers/entrance"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_CORRIDOR_DISPENSER("dispensers/trial_chambers/corridor"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_CHAMBER_DISPENSER("dispensers/trial_chambers/chamber"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_WATER_DISPENSER("dispensers/trial_chambers/water"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBERS_CORRIDOR_POT("pots/trial_chambers/corridor"),
    /**
     * @since 1.20.6
     */
    EQUIPMENT_TRIAL_CHAMBER("equipment/trial_chamber"),
    /**
     * @since 1.20.6
     */
    EQUIPMENT_TRIAL_CHAMBER_RANGED("equipment/trial_chamber_ranged"),
    /**
     * @since 1.20.6
     */
    EQUIPMENT_TRIAL_CHAMBER_MELEE("equipment/trial_chamber_melee"),
    /**
     * @since 1.13
     */
    SHIPWRECK_MAP("chests/shipwreck_map"),
    /**
     * @since 1.13
     */
    SHIPWRECK_SUPPLY("chests/shipwreck_supply"),
    /**
     * @since 1.13
     */
    SHIPWRECK_TREASURE("chests/shipwreck_treasure"),
    /**
     * @since 1.13
     */
    SIMPLE_DUNGEON("chests/simple_dungeon"),
    /**
     * @since 1.13
     */
    SPAWN_BONUS_CHEST("chests/spawn_bonus_chest"),
    /**
     * @since 1.13
     */
    STRONGHOLD_CORRIDOR("chests/stronghold_corridor"),
    /**
     * @since 1.13
     */
    STRONGHOLD_CROSSING("chests/stronghold_crossing"),
    /**
     * @since 1.13
     */
    STRONGHOLD_LIBRARY("chests/stronghold_library"),
    /**
     * @since 1.13
     */
    UNDERWATER_RUIN_BIG("chests/underwater_ruin_big"),
    /**
     * @since 1.13
     */
    UNDERWATER_RUIN_SMALL("chests/underwater_ruin_small"),
    /**
     * @since 1.14
     */
    VILLAGE_ARMORER("chests/village/village_armorer"),
    /**
     * @since 1.14
     */
    VILLAGE_BUTCHER("chests/village/village_butcher"),
    /**
     * @since 1.14
     */
    VILLAGE_CARTOGRAPHER("chests/village/village_cartographer"),
    /**
     * @since 1.14
     */
    VILLAGE_DESERT_HOUSE("chests/village/village_desert_house"),
    /**
     * @since 1.14
     */
    VILLAGE_FISHER("chests/village/village_fisher"),
    /**
     * @since 1.14
     */
    VILLAGE_FLETCHER("chests/village/village_fletcher"),
    /**
     * @since 1.14
     */
    VILLAGE_MASON("chests/village/village_mason"),
    /**
     * @since 1.14
     */
    VILLAGE_PLAINS_HOUSE("chests/village/village_plains_house"),
    /**
     * @since 1.14
     */
    VILLAGE_SAVANNA_HOUSE("chests/village/village_savanna_house"),
    /**
     * @since 1.14
     */
    VILLAGE_SHEPHERD("chests/village/village_shepherd"),
    /**
     * @since 1.14
     */
    VILLAGE_SNOWY_HOUSE("chests/village/village_snowy_house"),
    /**
     * @since 1.14
     */
    VILLAGE_TAIGA_HOUSE("chests/village/village_taiga_house"),
    /**
     * @since 1.14
     */
    VILLAGE_TANNERY("chests/village/village_tannery"),
    /**
     * @since 1.14
     */
    VILLAGE_TEMPLE("chests/village/village_temple"),
    /**
     * @since 1.14
     */
    VILLAGE_TOOLSMITH("chests/village/village_toolsmith"),
    /**
     * @since 1.14
     */
    VILLAGE_WEAPONSMITH("chests/village/village_weaponsmith"),
    /**
     * @since 1.13
     */
    WOODLAND_MANSION("chests/woodland_mansion"),
    /**
     * @since 1.14
     */
    // Entities
    ARMOR_STAND("entities/armor_stand"),
    /**
     * @since 1.17
     */
    AXOLOTL("entities/axolotl"),
    /**
     * @since 1.13
     */
    BAT("entities/bat"),
    /**
     * @since 1.16.5
     */
    BEE("entities/bee"),
    /**
     * @since 1.13
     */
    BLAZE("entities/blaze"),
    /**
     * @since 1.14
     */
    CAT("entities/cat"),
    /**
     * @since 1.13
     */
    CAVE_SPIDER("entities/cave_spider"),
    /**
     * @since 1.13
     */
    CHICKEN("entities/chicken"),
    /**
     * @since 1.13
     */
    COD("entities/cod"),
    /**
     * @since 1.13
     */
    COW("entities/cow"),
    /**
     * @since 1.13
     */
    CREEPER("entities/creeper"),
    /**
     * @since 1.13
     */
    DOLPHIN("entities/dolphin"),
    /**
     * @since 1.13
     */
    DONKEY("entities/donkey"),
    /**
     * @since 1.13
     */
    DROWNED("entities/drowned"),
    /**
     * @since 1.13
     */
    ELDER_GUARDIAN("entities/elder_guardian"),
    /**
     * @since 1.13
     */
    ENDER_DRAGON("entities/ender_dragon"),
    /**
     * @since 1.13
     */
    ENDERMAN("entities/enderman"),
    /**
     * @since 1.13
     */
    ENDERMITE("entities/endermite"),
    /**
     * @since 1.13
     */
    EVOKER("entities/evoker"),
    /**
     * @since 1.14
     */
    FOX("entities/fox"),
    /**
     * @since 1.13
     */
    GHAST("entities/ghast"),
    /**
     * @since 1.13
     */
    GIANT("entities/giant"),
    /**
     * @since 1.17
     */
    GLOW_SQUID("entities/glow_squid"),
    /**
     * @since 1.17
     */
    GOAT("entities/goat"),
    /**
     * @since 1.13
     */
    GUARDIAN("entities/guardian"),
    /**
     * @since 1.16.5
     */
    HOGLIN("entities/hoglin"),
    /**
     * @since 1.13
     */
    HORSE("entities/horse"),
    /**
     * @since 1.13
     */
    HUSK("entities/husk"),
    /**
     * @since 1.14
     */
    ILLUSIONER("entities/illusioner"),
    /**
     * @since 1.13
     */
    IRON_GOLEM("entities/iron_golem"),
    /**
     * @since 1.13
     */
    LLAMA("entities/llama"),
    /**
     * @since 1.13
     */
    MAGMA_CUBE("entities/magma_cube"),
    /**
     * @since 1.14
     */
    MOOSHROOM("entities/mooshroom"),
    /**
     * @since 1.13
     */
    MULE("entities/mule"),
    /**
     * @since 1.13
     */
    OCELOT("entities/ocelot"),
    /**
     * @since 1.14
     */
    PANDA("entities/panda"),
    /**
     * @since 1.13
     */
    PARROT("entities/parrot"),
    /**
     * @since 1.13
     */
    PHANTOM("entities/phantom"),
    /**
     * @since 1.13
     */
    PIG("entities/pig"),
    /**
     * @since 1.16.5
     */
    PIGLIN("entities/piglin"),
    /**
     * @since 1.16.5
     */
    PIGLIN_BRUTE("entities/piglin_brute"),
    /**
     * @since 1.14
     */
    PILLAGER("entities/pillager"),
    /**
     * @since 1.16.5
     */
    PLAYER("entities/player"),
    /**
     * @since 1.13
     */
    POLAR_BEAR("entities/polar_bear"),
    /**
     * @since 1.13
     */
    PUFFERFISH("entities/pufferfish"),
    /**
     * @since 1.13
     */
    RABBIT("entities/rabbit"),
    /**
     * @since 1.14
     */
    RAVAGER("entities/ravager"),
    /**
     * @since 1.13
     */
    SALMON("entities/salmon"),
    /**
     * @since 1.13
     */
    // Sheep entry here, moved below for organizational purposes
    SHULKER("entities/shulker"),
    /**
     * @since 1.13
     */
    SILVERFISH("entities/silverfish"),
    /**
     * @since 1.13
     */
    SKELETON("entities/skeleton"),
    /**
     * @since 1.13
     */
    SKELETON_HORSE("entities/skeleton_horse"),
    /**
     * @since 1.13
     */
    SLIME("entities/slime"),
    /**
     * @since 1.13
     */
    SNOW_GOLEM("entities/snow_golem"),
    /**
     * @since 1.13
     */
    SPIDER("entities/spider"),
    /**
     * @since 1.13
     */
    SQUID("entities/squid"),
    /**
     * @since 1.13
     */
    STRAY("entities/stray"),
    /**
     * @since 1.16.5
     */
    STRIDER("entities/strider"),
    /**
     * @since 1.14
     */
    TRADER_LLAMA("entities/trader_llama"),
    /**
     * @since 1.13
     */
    TROPICAL_FISH("entities/tropical_fish"),
    /**
     * @since 1.13
     */
    TURTLE("entities/turtle"),
    /**
     * @since 1.13
     */
    VEX("entities/vex"),
    /**
     * @since 1.13
     */
    VILLAGER("entities/villager"),
    /**
     * @since 1.13
     */
    VINDICATOR("entities/vindicator"),
    /**
     * @since 1.14
     */
    WANDERING_TRADER("entities/wandering_trader"),
    /**
     * @since 1.13
     */
    WITCH("entities/witch"),
    /**
     * @since 1.14
     */
    WITHER("entities/wither"),
    /**
     * @since 1.13
     */
    WITHER_SKELETON("entities/wither_skeleton"),
    /**
     * @since 1.13
     */
    WOLF("entities/wolf"),
    /**
     * @since 1.16.5
     */
    ZOGLIN("entities/zoglin"),
    /**
     * @since 1.13
     */
    ZOMBIE("entities/zombie"),
    /**
     * @since 1.13
     */
    ZOMBIE_HORSE("entities/zombie_horse"),
    /**
     * @since 1.13
     */
    ZOMBIE_VILLAGER("entities/zombie_villager"),
    /**
     * @since 1.16.5
     */
    ZOMBIFIED_PIGLIN("entities/zombified_piglin"),
    /**
     * @since 1.21.10
     */
    // Charged creeper
    CHARGED_CREEPER("charged_creeper/root"),
    /**
     * @since 1.21.10
     */
    CHARGED_CREEPER_PIGLIN("charged_creeper/piglin"),
    /**
     * @since 1.21.10
     */
    CHARGED_CREEPER_CREEPER("charged_creeper/creeper"),
    /**
     * @since 1.21.10
     */
    CHARGED_CREEPER_SKELETON("charged_creeper/skeleton"),
    /**
     * @since 1.21.10
     */
    CHARGED_CREEPER_WITHER_SKELETON("charged_creeper/wither_skeleton"),
    /**
     * @since 1.21.10
     */
    CHARGED_CREEPER_ZOMBIE("charged_creeper/zombie"),
    /**
     * @since 1.14
     */
    // Gameplay
    ARMORER_GIFT("gameplay/hero_of_the_village/armorer_gift"),
    /**
     * @since 1.14
     */
    BUTCHER_GIFT("gameplay/hero_of_the_village/butcher_gift"),
    /**
     * @since 1.14
     */
    CARTOGRAPHER_GIFT("gameplay/hero_of_the_village/cartographer_gift"),
    /**
     * @since 1.14
     */
    CAT_MORNING_GIFT("gameplay/cat_morning_gift"),
    /**
     * @since 1.14
     */
    CLERIC_GIFT("gameplay/hero_of_the_village/cleric_gift"),
    /**
     * @since 1.14
     */
    FARMER_GIFT("gameplay/hero_of_the_village/farmer_gift"),
    /**
     * @since 1.14
     */
    FISHERMAN_GIFT("gameplay/hero_of_the_village/fisherman_gift"),
    /**
     * @since 1.13
     */
    FISHING("gameplay/fishing"),
    /**
     * @since 1.13
     */
    FISHING_FISH("gameplay/fishing/fish"),
    /**
     * @since 1.13
     */
    FISHING_JUNK("gameplay/fishing/junk"),
    /**
     * @since 1.13
     */
    FISHING_TREASURE("gameplay/fishing/treasure"),
    /**
     * @since 1.14
     */
    FLETCHER_GIFT("gameplay/hero_of_the_village/fletcher_gift"),
    /**
     * @since 1.14
     */
    LEATHERWORKER_GIFT("gameplay/hero_of_the_village/leatherworker_gift"),
    /**
     * @since 1.14
     */
    LIBRARIAN_GIFT("gameplay/hero_of_the_village/librarian_gift"),
    /**
     * @since 1.14
     */
    MASON_GIFT("gameplay/hero_of_the_village/mason_gift"),
    /**
     * @since 1.14
     */
    SHEPHERD_GIFT("gameplay/hero_of_the_village/shepherd_gift"),
    /**
     * @since 1.14
     */
    TOOLSMITH_GIFT("gameplay/hero_of_the_village/toolsmith_gift"),
    /**
     * @since 1.14
     */
    WEAPONSMITH_GIFT("gameplay/hero_of_the_village/weaponsmith_gift"),
    /**
     * @since 1.21.3
     */
    UNEMPLOYED_GIFT("gameplay/hero_of_the_village/unemployed_gift"),
    /**
     * @since 1.21.3
     */
    BABY_VILLAGER_GIFT("gameplay/hero_of_the_village/baby_gift"),
    /**
     * @since 1.20
     */
    SNIFFER_DIGGING("gameplay/sniffer_digging"),
    /**
     * @since 1.21.10
     */
    TURTLE_GROW("gameplay/turtle_grow"),
    /**
     * @since 1.20.6
     */
    PANDA_SNEEZE("gameplay/panda_sneeze"),
    /**
     * @since 1.21.3
     */
    CHICKEN_LAY("gameplay/chicken_lay"),
    /**
     * @since 1.21.3
     */
    ARMADILLO_SHED("gameplay/armadillo_shed"),
    /**
     * @since 1.16.1
     */
    PIGLIN_BARTERING("gameplay/piglin_bartering"),
    /**
     * @since 1.20.4
     */
    // Spawners
    TRIAL_CHAMBER_KEY("spawners/trial_chamber/key"),
    /**
     * @since 1.20.4
     */
    TRIAL_CHAMBER_CONSUMABLES("spawners/trial_chamber/consumables"),
    /**
     * @since 1.20.6
     */
    OMINOUS_TRIAL_CHAMBER_KEY("spawners/ominous/trial_chamber/key"),
    /**
     * @since 1.20.6
     */
    OMINOUS_TRIAL_CHAMBER_CONSUMABLES("spawners/ominous/trial_chamber/consumables"),
    /**
     * @since 1.20.6
     */
    TRIAL_CHAMBER_ITEMS_TO_DROP_WHEN_OMINOUS("spawners/trial_chamber/items_to_drop_when_ominous"),
    /**
     * @since 1.20.6
     */
    // Shearing
    SHEARING_BOGGED("shearing/bogged"),
    /**
     * @since 1.21.3
     */
    SHEARING_MOOSHROOM("shearing/mooshroom"),
    /**
     * @since 1.21.3
     */
    SHEARING_MOOSHROOM_RED("shearing/mooshroom/red"),
    /**
     * @since 1.21.3
     */
    SHEARING_MOOSHROOM_BROWN("shearing/mooshroom/brown"),
    /**
     * @since 1.21.3
     */
    SHEARING_SNOW_GOLEM("shearing/snow_golem"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP("shearing/sheep"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_BLACK("shearing/sheep/black"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_BLUE("shearing/sheep/blue"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_BROWN("shearing/sheep/brown"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_CYAN("shearing/sheep/cyan"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_GRAY("shearing/sheep/gray"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_GREEN("shearing/sheep/green"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_LIGHT_BLUE("shearing/sheep/light_blue"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_LIGHT_GRAY("shearing/sheep/light_gray"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_LIME("shearing/sheep/lime"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_MAGENTA("shearing/sheep/magenta"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_ORANGE("shearing/sheep/orange"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_PINK("shearing/sheep/pink"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_PURPLE("shearing/sheep/purple"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_RED("shearing/sheep/red"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_WHITE("shearing/sheep/white"),
    /**
     * @since 1.21.3
     */
    SHEARING_SHEEP_YELLOW("shearing/sheep/yellow"),
    /**
     * @since 1.21.10
     */
    // Carving
    CARVE_PUMPKIN("carve/pumpkin"),
    /**
     * @since 1.21.10
     */
    // Harvest
    HARVEST_CAVE_VINE("harvest/cave_vine"),
    /**
     * @since 1.21.10
     */
    HARVEST_SWEET_BERRY_BUSH("harvest/sweet_berry_bush"),
    /**
     * @since 1.21.10
     */
    HARVEST_BEEHIVE("harvest/beehive"),
    /**
     * @since 1.21.10
     */
    // brush
    BRUSH_ARMADILLO("brush/armadillo"),
    /**
     * @since 1.20
     */
    // Archaeology
    DESERT_WELL_ARCHAEOLOGY("archaeology/desert_well"),
    /**
     * @since 1.20
     */
    DESERT_PYRAMID_ARCHAEOLOGY("archaeology/desert_pyramid"),
    /**
     * @since 1.20
     */
    TRAIL_RUINS_ARCHAEOLOGY_COMMON("archaeology/trail_ruins_common"),
    /**
     * @since 1.20
     */
    TRAIL_RUINS_ARCHAEOLOGY_RARE("archaeology/trail_ruins_rare"),
    /**
     * @since 1.20
     */
    OCEAN_RUIN_WARM_ARCHAEOLOGY("archaeology/ocean_ruin_warm"),
    /**
     * @since 1.20
     */
    OCEAN_RUIN_COLD_ARCHAEOLOGY("archaeology/ocean_ruin_cold"),
    /**
     * @since 1.13
     */
    // Sheep
    SHEEP("entities/sheep"),
    /**
     * @since 1.13
     */
    SHEEP_BLACK("entities/sheep/black"),
    /**
     * @since 1.13
     */
    SHEEP_BLUE("entities/sheep/blue"),
    /**
     * @since 1.13
     */
    SHEEP_BROWN("entities/sheep/brown"),
    /**
     * @since 1.13
     */
    SHEEP_CYAN("entities/sheep/cyan"),
    /**
     * @since 1.13
     */
    SHEEP_GRAY("entities/sheep/gray"),
    /**
     * @since 1.13
     */
    SHEEP_GREEN("entities/sheep/green"),
    /**
     * @since 1.13
     */
    SHEEP_LIGHT_BLUE("entities/sheep/light_blue"),
    /**
     * @since 1.14
     */
    SHEEP_LIGHT_GRAY("entities/sheep/light_gray"),
    /**
     * @since 1.13
     */
    SHEEP_LIME("entities/sheep/lime"),
    /**
     * @since 1.13
     */
    SHEEP_MAGENTA("entities/sheep/magenta"),
    /**
     * @since 1.13
     */
    SHEEP_ORANGE("entities/sheep/orange"),
    /**
     * @since 1.13
     */
    SHEEP_PINK("entities/sheep/pink"),
    /**
     * @since 1.13
     */
    SHEEP_PURPLE("entities/sheep/purple"),
    /**
     * @since 1.13
     */
    SHEEP_RED("entities/sheep/red"),
    /**
     * @since 1.13
     */
    SHEEP_WHITE("entities/sheep/white"),
    /**
     * @since 1.13
     */
    SHEEP_YELLOW("entities/sheep/yellow"),
    ;

    private final String location;

    private LootTables(/*@NotNull*/ String location) {
        this.location = location;
    }

    /**
     * @since 1.13
     */
    @NotNull
    @Override
    public NamespacedKey getKey() {
        return NamespacedKey.minecraft(location);
    }

    /**
     * Get the {@link LootTable} corresponding to this constant. This is
     * equivalent to calling {@code Bukkit.getLootTable(this.getKey());}.
     *
     * @return the associated LootTable
     * @since 1.13.1
     */
    @NotNull
    public LootTable getLootTable() {
        return Bukkit.getLootTable(getKey());
    }
}
