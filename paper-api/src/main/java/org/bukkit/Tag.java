package org.bukkit;

import java.util.Set;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a tag that may be defined by the server or a resource pack to
 * group like things together.
 *
 * Note that whilst all tags defined within this interface must be present in
 * implementations, their existence is not guaranteed across future versions.
 *
 * <p>Custom tags defined by Paper are not present (as constants) in this class.
 * To access them please refer to {@link com.destroystokyo.paper.MaterialTags}
 * and {@link io.papermc.paper.tag.EntityTags}.</p>
 *
 * @param <T> the type of things grouped by this tag
 * @since 1.13
 */
public interface Tag<T extends Keyed> extends Keyed {

    /**
     * @since 1.13
     */
    // Start generate - Tag
    String REGISTRY_BLOCKS = "blocks";

    /**
     * @since 1.13
     */
    Tag<Material> ACACIA_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("acacia_logs"), Material.class);

    /**
     * @since 1.21
     */
    Tag<Material> AIR = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("air"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> ALL_HANGING_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("all_hanging_signs"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> ALL_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("all_signs"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> ANCIENT_CITY_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("ancient_city_replaceable"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> ANIMALS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("animals_spawnable_on"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> ANVIL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("anvil"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ARMADILLO_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("armadillo_spawnable_on"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> AXOLOTLS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("axolotls_spawnable_on"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> AZALEA_GROWS_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("azalea_grows_on"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> AZALEA_ROOT_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("azalea_root_replaceable"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> BADLANDS_TERRACOTTA = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("badlands_terracotta"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> BAMBOO_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("bamboo_blocks"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> BANNERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("banners"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> BARS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("bars"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> BASE_STONE_NETHER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("base_stone_nether"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> BASE_STONE_OVERWORLD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("base_stone_overworld"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> BATS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("bats_spawnable_on"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> BEACON_BASE_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("beacon_base_blocks"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> BEDS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("beds"), Material.class);

    /**
     * @since 1.21.4
     */
    Tag<Material> BEE_ATTRACTIVE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("bee_attractive"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> BEE_GROWABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("bee_growables"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> BEEHIVES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("beehives"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> BENEATH_BAMBOO_PODZOL_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("beneath_bamboo_podzol_replaceable"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> BENEATH_TREE_PODZOL_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("beneath_tree_podzol_replaceable"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> BIRCH_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("birch_logs"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> BLOCKS_WIND_CHARGE_EXPLOSIONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("blocks_wind_charge_explosions"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> BUTTONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("buttons"), Material.class);

    /**
     * @since 1.20.2
     */
    Tag<Material> CAMEL_SAND_STEP_SOUND_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("camel_sand_step_sound_blocks"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> CAMELS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("camels_spawnable_on"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> CAMPFIRES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("campfires"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> CAN_GLIDE_THROUGH = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("can_glide_through"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> CANDLE_CAKES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("candle_cakes"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> CANDLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("candles"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> CANNOT_REPLACE_BELOW_TREE_TRUNK = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cannot_replace_below_tree_trunk"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> CANNOT_SUPPORT_KELP = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cannot_support_kelp"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> CANNOT_SUPPORT_SEAGRASS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cannot_support_seagrass"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> CANNOT_SUPPORT_SNOW_LAYER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cannot_support_snow_layer"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> CAULDRONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cauldrons"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> CAUSES_CONTINUOUS_GEYSER_ERUPTIONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("causes_continuous_geyser_eruptions"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> CAUSES_PERIODIC_GEYSER_ERUPTIONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("causes_periodic_geyser_eruptions"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> CAVE_VINES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cave_vines"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> CEILING_HANGING_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("ceiling_hanging_signs"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> CHAINS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("chains"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> CHERRY_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cherry_logs"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> CLIMBABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("climbable"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> COAL_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("coal_ores"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> COMBINATION_STEP_SOUND_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("combination_step_sound_blocks"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> COMPLETES_FIND_TREE_TUTORIAL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("completes_find_tree_tutorial"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> CONCRETE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("concrete"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> CONCRETE_POWDERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("concrete_powders"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> CONVERTABLE_TO_MUD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("convertable_to_mud"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> COPPER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("copper"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> COPPER_CHESTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("copper_chests"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> COPPER_GOLEM_STATUES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("copper_golem_statues"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> COPPER_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("copper_ores"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> CORAL_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("coral_blocks"), Material.class);

    /**
     * @since 1.13.2
     */
    Tag<Material> CORAL_PLANTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("coral_plants"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> CORALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("corals"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> CRIMSON_STEMS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("crimson_stems"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> CROPS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("crops"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> CRYSTAL_SOUND_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("crystal_sound_blocks"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> DAMPENS_VIBRATIONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dampens_vibrations"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> DARK_OAK_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dark_oak_logs"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> DEEPSLATE_ORE_REPLACEABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("deepslate_ore_replaceables"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> DEFAULT_IMMUNE_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("default_immune_to"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> DIAMOND_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("diamond_ores"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> DIRT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dirt"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> DOES_NOT_BLOCK_HOPPERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("does_not_block_hoppers"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> DOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("doors"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> DRAGON_IMMUNE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dragon_immune"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> DRAGON_TRANSPARENT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dragon_transparent"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> DRIPSTONE_REPLACEABLE_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dripstone_replaceable_blocks"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> EDIBLE_FOR_SHEEP = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("edible_for_sheep"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> EMERALD_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("emerald_ores"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ENABLES_BUBBLE_COLUMN_DRAG_DOWN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("enables_bubble_column_drag_down"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ENABLES_BUBBLE_COLUMN_PUSH_UP = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("enables_bubble_column_push_up"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> ENCHANTMENT_POWER_PROVIDER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("enchantment_power_provider"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> ENCHANTMENT_POWER_TRANSMITTER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("enchantment_power_transmitter"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> ENDERMAN_HOLDABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("enderman_holdable"), Material.class);

    /**
     * @since 1.18.2
     */
    Tag<Material> FALL_DAMAGE_RESETTING = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fall_damage_resetting"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> FEATURES_CANNOT_REPLACE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("features_cannot_replace"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> FENCE_GATES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fence_gates"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> FENCES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fences"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> FIRE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fire"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> FLOWER_POTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("flower_pots"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> FLOWERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("flowers"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> FOREST_ROCK_CAN_PLACE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("forest_rock_can_place_on"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> FOX_IMMUNE_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fox_immune_to"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> FOXES_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("foxes_spawnable_on"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> FROG_PREFER_JUMP_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("frog_prefer_jump_to"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> FROGS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("frogs_spawnable_on"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> GEODE_INVALID_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("geode_invalid_blocks"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> GLAZED_TERRACOTTA = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("glazed_terracotta"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> GOATS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("goats_spawnable_on"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> GOLD_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("gold_ores"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> GRASS_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("grass_blocks"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> GROWS_CROPS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("grows_crops"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> GUARDED_BY_PIGLINS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("guarded_by_piglins"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> HAPPY_GHAST_AVOIDS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("happy_ghast_avoids"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> HOGLIN_REPELLENTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("hoglin_repellents"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> HUGE_BROWN_MUSHROOM_CAN_PLACE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("huge_brown_mushroom_can_place_on"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> HUGE_RED_MUSHROOM_CAN_PLACE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("huge_red_mushroom_can_place_on"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> ICE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("ice"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ICE_SPIKE_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("ice_spike_replaceable"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> IMPERMEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("impermeable"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> INCORRECT_FOR_COPPER_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("incorrect_for_copper_tool"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> INCORRECT_FOR_DIAMOND_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("incorrect_for_diamond_tool"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> INCORRECT_FOR_GOLD_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("incorrect_for_gold_tool"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> INCORRECT_FOR_IRON_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("incorrect_for_iron_tool"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> INCORRECT_FOR_NETHERITE_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("incorrect_for_netherite_tool"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> INCORRECT_FOR_STONE_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("incorrect_for_stone_tool"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> INCORRECT_FOR_WOODEN_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("incorrect_for_wooden_tool"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> INFINIBURN_END = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("infiniburn_end"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> INFINIBURN_NETHER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("infiniburn_nether"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> INFINIBURN_OVERWORLD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("infiniburn_overworld"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> INSIDE_STEP_SOUND_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("inside_step_sound_blocks"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> INVALID_SPAWN_INSIDE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("invalid_spawn_inside"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> IRON_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("iron_ores"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> JUNGLE_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("jungle_logs"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> LANTERNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("lanterns"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> LAPIS_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("lapis_ores"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> LAVA_POOL_STONE_CANNOT_REPLACE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("lava_pool_stone_cannot_replace"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> LEAVES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("leaves"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> LIGHTNING_RODS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("lightning_rods"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("logs"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> LOGS_THAT_BURN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("logs_that_burn"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> LUSH_GROUND_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("lush_ground_replaceable"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> MAINTAINS_FARMLAND = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("maintains_farmland"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> MANGROVE_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mangrove_logs"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> MANGROVE_LOGS_CAN_GROW_THROUGH = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mangrove_logs_can_grow_through"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> MANGROVE_ROOTS_CAN_GROW_THROUGH = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mangrove_roots_can_grow_through"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> MINEABLE_AXE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mineable/axe"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> MINEABLE_HOE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mineable/hoe"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> MINEABLE_PICKAXE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mineable/pickaxe"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> MINEABLE_SHOVEL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mineable/shovel"), Material.class);

    /**
     * @since 1.21
     */
    Tag<Material> MOB_INTERACTABLE_DOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mob_interactable_doors"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> MOOSHROOMS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mooshrooms_spawnable_on"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> MOSS_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("moss_blocks"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> MOSS_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("moss_replaceable"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> MUD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mud"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> NEEDS_DIAMOND_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("needs_diamond_tool"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> NEEDS_IRON_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("needs_iron_tool"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> NEEDS_STONE_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("needs_stone_tool"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> NETHER_CARVER_REPLACEABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("nether_carver_replaceables"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> NYLIUM = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("nylium"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> OAK_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("oak_logs"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> OCCLUDES_VIBRATION_SIGNALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("occludes_vibration_signals"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> OVERRIDES_MUSHROOM_LIGHT_REQUIREMENT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("overrides_mushroom_light_requirement"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> OVERWORLD_CARVER_REPLACEABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("overworld_carver_replaceables"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> OVERWORLD_NATURAL_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("overworld_natural_logs"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> PALE_OAK_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("pale_oak_logs"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> PARROTS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("parrots_spawnable_on"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> PIGLIN_REPELLENTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("piglin_repellents"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> PLANKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("planks"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> POLAR_BEAR_IMMUNE_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("polar_bear_immune_to"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> POLAR_BEARS_SPAWNABLE_ON_ALTERNATE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("polar_bears_spawnable_on_alternate"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> PORTALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("portals"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> PRESSURE_PLATES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("pressure_plates"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> PREVENT_MOB_SPAWNING_INSIDE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("prevent_mob_spawning_inside"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> PREVENTS_NEARBY_LEAF_DECAY = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("prevents_nearby_leaf_decay"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> RABBITS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("rabbits_spawnable_on"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> RAILS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("rails"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> REDSTONE_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("redstone_ores"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("replaceable"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> REPLACEABLE_BY_MUSHROOMS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("replaceable_by_mushrooms"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> REPLACEABLE_BY_TREES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("replaceable_by_trees"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> SAND = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sand"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> SAPLINGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("saplings"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> SCULK_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sculk_replaceable"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> SCULK_REPLACEABLE_WORLD_GEN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sculk_replaceable_world_gen"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SHEARS_EXTREME_BREAKING_SPEED = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("shears_extreme_breaking_speed"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SHEARS_MAJOR_BREAKING_SPEED = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("shears_major_breaking_speed"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SHEARS_MINOR_BREAKING_SPEED = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("shears_minor_breaking_speed"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> SHULKER_BOXES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("shulker_boxes"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("signs"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> SLABS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("slabs"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> SMALL_FLOWERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("small_flowers"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> SMELTS_TO_GLASS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("smelts_to_glass"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> SNAPS_GOAT_HORN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("snaps_goat_horn"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> SNIFFER_DIGGABLE_BLOCK = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sniffer_diggable_block"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> SNIFFER_EGG_HATCH_BOOST = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sniffer_egg_hatch_boost"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> SNOW = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("snow"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SNOW_GOLEM_IMMUNE_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("snow_golem_immune_to"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> SOUL_FIRE_BASE_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("soul_fire_base_blocks"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> SOUL_SPEED_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("soul_speed_blocks"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SPELEOTHEMS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("speleothems"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> SPRUCE_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("spruce_logs"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> STAIRS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stairs"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> STANDING_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("standing_signs"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> STONE_BRICKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stone_bricks"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> STONE_BUTTONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stone_buttons"), Material.class);

    /**
     * @since 1.17
     */
    Tag<Material> STONE_ORE_REPLACEABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stone_ore_replaceables"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> STONE_PRESSURE_PLATES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stone_pressure_plates"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> STRAY_IMMUNE_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stray_immune_to"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> STRIDER_WARM_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("strider_warm_blocks"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUBSTRATE_OVERWORLD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("substrate_overworld"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SULFUR_SPIKE_REPLACEABLE_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sulfur_spike_replaceable_blocks"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORT_OVERRIDE_CACTUS_FLOWER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("support_override_cactus_flower"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORT_OVERRIDE_SNOW_LAYER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("support_override_snow_layer"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_AZALEA = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_azalea"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_BAMBOO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_bamboo"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_BIG_DRIPLEAF = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_big_dripleaf"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_CACTUS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_cactus"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_CHORUS_FLOWER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_chorus_flower"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_CHORUS_PLANT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_chorus_plant"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_COCOA = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_cocoa"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_CRIMSON_FUNGUS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_crimson_fungus"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_CRIMSON_ROOTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_crimson_roots"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_CROPS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_crops"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_DRY_VEGETATION = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_dry_vegetation"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_FROGSPAWN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_frogspawn"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_HANGING_MANGROVE_PROPAGULE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_hanging_mangrove_propagule"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_LILY_PAD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_lily_pad"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_MANGROVE_PROPAGULE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_mangrove_propagule"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_MELON_STEM = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_melon_stem"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_MELON_STEM_FRUIT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_melon_stem_fruit"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_NETHER_SPROUTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_nether_sprouts"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_NETHER_WART = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_nether_wart"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_PUMPKIN_STEM = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_pumpkin_stem"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_PUMPKIN_STEM_FRUIT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_pumpkin_stem_fruit"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_SMALL_DRIPLEAF = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_small_dripleaf"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_STEM_CROPS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_stem_crops"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_STEM_FRUIT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_stem_fruit"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_SUGAR_CANE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_sugar_cane"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_SUGAR_CANE_ADJACENTLY = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_sugar_cane_adjacently"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_VEGETATION = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_vegetation"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_WARPED_FUNGUS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_warped_fungus"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_WARPED_ROOTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_warped_roots"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPORTS_WITHER_ROSE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("supports_wither_rose"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> SUPPRESSES_BOUNCE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("suppresses_bounce"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> SWORD_EFFICIENT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sword_efficient"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> SWORD_INSTANTLY_MINES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sword_instantly_mines"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> TERRACOTTA = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("terracotta"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> TRAIL_RUINS_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("trail_ruins_replaceable"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> TRAPDOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("trapdoors"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> TRIGGERS_AMBIENT_DESERT_DRY_VEGETATION_BLOCK_SOUNDS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("triggers_ambient_desert_dry_vegetation_block_sounds"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> TRIGGERS_AMBIENT_DESERT_SAND_BLOCK_SOUNDS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("triggers_ambient_desert_sand_block_sounds"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> TRIGGERS_AMBIENT_DRIED_GHAST_BLOCK_SOUNDS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("triggers_ambient_dried_ghast_block_sounds"), Material.class);

    /**
     * @since 1.13.2
     */
    Tag<Material> UNDERWATER_BONEMEALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("underwater_bonemeals"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> UNSTABLE_BOTTOM_CENTER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("unstable_bottom_center"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> VALID_SPAWN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("valid_spawn"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> VIBRATION_RESONATORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("vibration_resonators"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> WALL_CORALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wall_corals"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> WALL_HANGING_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wall_hanging_signs"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> WALL_POST_OVERRIDE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wall_post_override"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> WALL_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wall_signs"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> WALLS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("walls"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> WARPED_STEMS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("warped_stems"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> WART_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wart_blocks"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> WITHER_IMMUNE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wither_immune"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> WITHER_IMMUNE_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wither_immune_to"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> WITHER_SKELETON_IMMUNE_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wither_skeleton_immune_to"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> WITHER_SUMMON_BASE_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wither_summon_base_blocks"), Material.class);

    /**
     * @since 1.18.1
     */
    Tag<Material> WOLVES_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wolves_spawnable_on"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> WOODEN_BUTTONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_buttons"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> WOODEN_DOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_doors"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> WOODEN_FENCES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_fences"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> WOODEN_PRESSURE_PLATES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_pressure_plates"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> WOODEN_SHELVES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_shelves"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> WOODEN_SLABS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_slabs"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> WOODEN_STAIRS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_stairs"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> WOODEN_TRAPDOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_trapdoors"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> WOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wool"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> WOOL_CARPETS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wool_carpets"), Material.class);

    /**
     * @since 1.13
     */
    String REGISTRY_ITEMS = "items";

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_ACACIA_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("acacia_logs"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_ANVIL = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("anvil"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ARMADILLO_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("armadillo_food"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> ITEMS_ARROWS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("arrows"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_AXES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("axes"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_AXOLOTL_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("axolotl_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_BAMBOO_BLOCKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("bamboo_blocks"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> ITEMS_BANNERS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("banners"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_BARS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("bars"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> ITEMS_BEACON_PAYMENT_ITEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("beacon_payment_items"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_BEDS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("beds"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_BEE_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("bee_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_BIRCH_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("birch_logs"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> ITEMS_BOATS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("boats"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_BOOK_CLONING_TARGET = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("book_cloning_target"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> ITEMS_BOOKSHELF_BOOKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("bookshelf_books"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_BREAKS_DECORATED_POTS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("breaks_decorated_pots"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_BREWING_FUEL = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("brewing_fuel"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_BUNDLES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("bundles"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_BUTTONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("buttons"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_CAMEL_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("camel_food"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_CAMEL_HUSK_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("camel_husk_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_CANDLES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("candles"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_CAT_COLLAR_DYES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("cat_collar_dyes"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_CAT_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("cat_food"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_CAULDRON_CAN_REMOVE_DYE = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("cauldron_can_remove_dye"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_CHAINS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("chains"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_CHERRY_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("cherry_logs"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_CHEST_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("chest_armor"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> ITEMS_CHEST_BOATS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("chest_boats"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_CHICKEN_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("chicken_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_CLUSTER_MAX_HARVESTABLES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("cluster_max_harvestables"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_COAL_ORES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("coal_ores"), Material.class);

    /**
     * @since 1.14
     */
    Tag<Material> ITEMS_COALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("coals"), Material.class);

    /**
     * @since 1.19
     */
    Tag<Material> ITEMS_COMPASSES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("compasses"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_COMPLETES_FIND_TREE_TUTORIAL = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("completes_find_tree_tutorial"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_CONCRETE = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("concrete"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_CONCRETE_POWDERS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("concrete_powders"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_COPPER = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("copper"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_COPPER_CHESTS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("copper_chests"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_COPPER_GOLEM_STATUES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("copper_golem_statues"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_COPPER_ORES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("copper_ores"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_COPPER_TOOL_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("copper_tool_materials"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_COW_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("cow_food"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> ITEMS_CREEPER_DROP_MUSIC_DISCS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("creeper_drop_music_discs"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> ITEMS_CREEPER_IGNITERS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("creeper_igniters"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_CRIMSON_STEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("crimson_stems"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_DAMPENS_VIBRATIONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("dampens_vibrations"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_DARK_OAK_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("dark_oak_logs"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> ITEMS_DECORATED_POT_INGREDIENTS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("decorated_pot_ingredients"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> ITEMS_DECORATED_POT_SHERDS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("decorated_pot_sherds"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_DIAMOND_ORES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("diamond_ores"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_DIAMOND_TOOL_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("diamond_tool_materials"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_DIRT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("dirt"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_DOORS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("doors"), Material.class);

    /**
     * @since 1.21.4
     */
    Tag<Material> ITEMS_DROWNED_PREFERRED_WEAPONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("drowned_preferred_weapons"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_DUPLICATES_ALLAYS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("duplicates_allays"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_DYES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("dyes"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_EGGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("eggs"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_EMERALD_ORES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("emerald_ores"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/armor"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_BOW = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/bow"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_CHEST_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/chest_armor"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_CROSSBOW = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/crossbow"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_DURABILITY = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/durability"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_EQUIPPABLE = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/equippable"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_FIRE_ASPECT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/fire_aspect"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_FISHING = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/fishing"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_FOOT_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/foot_armor"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_HEAD_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/head_armor"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_LEG_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/leg_armor"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_ENCHANTABLE_LUNGE = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/lunge"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_MACE = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/mace"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_ENCHANTABLE_MELEE_WEAPON = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/melee_weapon"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_MINING = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/mining"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_MINING_LOOT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/mining_loot"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_SHARP_WEAPON = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/sharp_weapon"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_ENCHANTABLE_SWEEPING = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/sweeping"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_TRIDENT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/trident"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_VANISHING = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/vanishing"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_ENCHANTABLE_WEAPON = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("enchantable/weapon"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_FENCE_GATES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("fence_gates"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_FENCES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("fences"), Material.class);

    /**
     * @since 1.13
     */
    Tag<Material> ITEMS_FISHES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("fishes"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_FLOWERS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("flowers"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_FOOT_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("foot_armor"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_FOX_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("fox_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_FREEZE_IMMUNE_WEARABLES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("freeze_immune_wearables"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_FROG_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("frog_food"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_FURNACE_MINECART_FUEL = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("furnace_minecart_fuel"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_GAZE_DISGUISE_EQUIPMENT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("gaze_disguise_equipment"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_GLAZED_TERRACOTTA = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("glazed_terracotta"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_GOAT_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("goat_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_GOLD_ORES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("gold_ores"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_GOLD_TOOL_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("gold_tool_materials"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_GRASS_BLOCKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("grass_blocks"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> ITEMS_HANGING_SIGNS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("hanging_signs"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_HAPPY_GHAST_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("happy_ghast_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_HAPPY_GHAST_TEMPT_ITEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("happy_ghast_tempt_items"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_HARNESSES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("harnesses"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_HEAD_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("head_armor"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_HOES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("hoes"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_HOGLIN_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("hoglin_food"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_HORSE_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("horse_food"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_HORSE_TEMPT_ITEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("horse_tempt_items"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_IGNORED_BY_PIGLIN_BABIES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("ignored_by_piglin_babies"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_IRON_ORES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("iron_ores"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_IRON_TOOL_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("iron_tool_materials"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_JUNGLE_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("jungle_logs"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_LANTERNS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("lanterns"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_LAPIS_ORES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("lapis_ores"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_LEAVES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("leaves"), Material.class);

    /**
     * @since 1.15
     */
    Tag<Material> ITEMS_LECTERN_BOOKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("lectern_books"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_LEG_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("leg_armor"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_LIGHTNING_RODS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("lightning_rods"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_LLAMA_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("llama_food"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_LLAMA_TEMPT_ITEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("llama_tempt_items"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("logs"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_LOGS_THAT_BURN = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("logs_that_burn"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_LOOM_DYES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("loom_dyes"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_LOOM_PATTERNS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("loom_patterns"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_MANGROVE_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("mangrove_logs"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_MAP_INVISIBILITY_EQUIPMENT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("map_invisibility_equipment"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_MEAT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("meat"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_METAL_NUGGETS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("metal_nuggets"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_MOSS_BLOCKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("moss_blocks"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_MUD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("mud"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_NAUTILUS_BUCKET_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("nautilus_bucket_food"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_NAUTILUS_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("nautilus_food"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_NAUTILUS_TAMING_ITEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("nautilus_taming_items"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_NETHERITE_TOOL_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("netherite_tool_materials"), Material.class);

    /**
     * @since 1.19.3
     */
    Tag<Material> ITEMS_NON_FLAMMABLE_WOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("non_flammable_wood"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_NOTEBLOCK_TOP_INSTRUMENTS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("noteblock_top_instruments"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_OAK_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("oak_logs"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_OCELOT_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("ocelot_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_PALE_OAK_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("pale_oak_logs"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_PANDA_EATS_FROM_GROUND = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("panda_eats_from_ground"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_PANDA_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("panda_food"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_PARROT_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("parrot_food"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_PARROT_POISONOUS_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("parrot_poisonous_food"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_PICKAXES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("pickaxes"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_PIG_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("pig_food"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_PIGLIN_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("piglin_food"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> ITEMS_PIGLIN_LOVED = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("piglin_loved"), Material.class);

    /**
     * @since 1.21.4
     */
    Tag<Material> ITEMS_PIGLIN_PREFERRED_WEAPONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("piglin_preferred_weapons"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_PIGLIN_REPELLENTS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("piglin_repellents"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_PIGLIN_SAFE_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("piglin_safe_armor"), Material.class);

    /**
     * @since 1.21.4
     */
    Tag<Material> ITEMS_PILLAGER_PREFERRED_WEAPONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("pillager_preferred_weapons"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_PLANKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("planks"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_RABBIT_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("rabbit_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_RAILS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("rails"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_REDSTONE_ORES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("redstone_ores"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_REPAIRS_CHAIN_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_chain_armor"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_REPAIRS_COPPER_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_copper_armor"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_REPAIRS_DIAMOND_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_diamond_armor"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_REPAIRS_GOLD_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_gold_armor"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_REPAIRS_IRON_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_iron_armor"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_REPAIRS_LEATHER_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_leather_armor"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_REPAIRS_NETHERITE_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_netherite_armor"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_REPAIRS_TURTLE_HELMET = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_turtle_helmet"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_REPAIRS_WOLF_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("repairs_wolf_armor"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SAND = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sand"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SAPLINGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("saplings"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_SHEARABLE_FROM_COPPER_GOLEM = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("shearable_from_copper_golem"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_SHEEP_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sheep_food"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_SHOVELS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("shovels"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SHULKER_BOXES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("shulker_boxes"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SIGNS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("signs"), Material.class);

    /**
     * @since 1.21.4
     */
    Tag<Material> ITEMS_SKELETON_PREFERRED_WEAPONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("skeleton_preferred_weapons"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_SKULLS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("skulls"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SLABS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("slabs"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SMALL_FLOWERS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("small_flowers"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SMELTS_TO_GLASS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("smelts_to_glass"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_SNIFFER_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sniffer_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SOUL_FIRE_BASE_BLOCKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("soul_fire_base_blocks"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_SPEARS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("spears"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_SPRUCE_LOGS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("spruce_logs"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_STAIRS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("stairs"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_STONE_BRICKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("stone_bricks"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_STONE_BUTTONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("stone_buttons"), Material.class);

    /**
     * @since 1.21.4
     */
    Tag<Material> ITEMS_STONE_CRAFTING_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("stone_crafting_materials"), Material.class);

    /**
     * @since 1.16.1
     */
    Tag<Material> ITEMS_STONE_TOOL_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("stone_tool_materials"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_STRIDER_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("strider_food"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_STRIDER_TEMPT_ITEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("strider_tempt_items"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_BOUNCY = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/bouncy"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_EXPLOSIVE = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/explosive"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_FAST_FLAT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/fast_flat"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_FAST_SLIDING = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/fast_sliding"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_HIGH_RESISTANCE = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/high_resistance"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_HOT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/hot"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_LIGHT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/light"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_REGULAR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/regular"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_SLOW_BOUNCY = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/slow_bouncy"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_SLOW_FLAT = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/slow_flat"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_SLOW_SLIDING = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/slow_sliding"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_ARCHETYPE_STICKY = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_archetype/sticky"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_food"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_SULFUR_CUBE_SWALLOWABLE = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sulfur_cube_swallowable"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_SWORDS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("swords"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_TERRACOTTA = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("terracotta"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_TRAPDOORS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("trapdoors"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_TRIM_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("trim_materials"), Material.class);

    /**
     * @since 1.19.4
     */
    Tag<Material> ITEMS_TRIMMABLE_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("trimmable_armor"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_TURTLE_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("turtle_food"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_VILLAGER_PICKS_UP = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("villager_picks_up"), Material.class);

    /**
     * @since 1.20
     */
    Tag<Material> ITEMS_VILLAGER_PLANTABLE_SEEDS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("villager_plantable_seeds"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WALLS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("walls"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WARPED_STEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("warped_stems"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WART_BLOCKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wart_blocks"), Material.class);

    /**
     * @since 1.21.4
     */
    Tag<Material> ITEMS_WITHER_SKELETON_DISLIKED_WEAPONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wither_skeleton_disliked_weapons"), Material.class);

    /**
     * @since 26.2
     */
    Tag<Material> ITEMS_WOLF_COLLAR_DYES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wolf_collar_dyes"), Material.class);

    /**
     * @since 1.20.6
     */
    Tag<Material> ITEMS_WOLF_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wolf_food"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOODEN_BUTTONS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_buttons"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOODEN_DOORS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_doors"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOODEN_FENCES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_fences"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOODEN_PRESSURE_PLATES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_pressure_plates"), Material.class);

    /**
     * @since 1.21.10
     */
    Tag<Material> ITEMS_WOODEN_SHELVES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_shelves"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOODEN_SLABS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_slabs"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOODEN_STAIRS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_stairs"), Material.class);

    /**
     * @since 1.21.3
     */
    Tag<Material> ITEMS_WOODEN_TOOL_MATERIALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_tool_materials"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOODEN_TRAPDOORS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wooden_trapdoors"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOOL = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wool"), Material.class);

    /**
     * @since 1.21.6
     */
    Tag<Material> ITEMS_WOOL_CARPETS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("wool_carpets"), Material.class);

    /**
     * @since 1.21.11
     */
    Tag<Material> ITEMS_ZOMBIE_HORSE_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("zombie_horse_food"), Material.class);

    /**
     * @since 1.16.3
     */
    String REGISTRY_FLUIDS = "fluids";

    /**
     * @since 26.2
     */
    Tag<Fluid> FLUIDS_BUBBLE_COLUMN_CAN_OCCUPY = Bukkit.getTag(REGISTRY_FLUIDS, NamespacedKey.minecraft("bubble_column_can_occupy"), Fluid.class);

    /**
     * @since 1.16.3
     */
    Tag<Fluid> FLUIDS_LAVA = Bukkit.getTag(REGISTRY_FLUIDS, NamespacedKey.minecraft("lava"), Fluid.class);

    /**
     * @since 26.2
     */
    Tag<Fluid> FLUIDS_SUPPORTS_FROGSPAWN = Bukkit.getTag(REGISTRY_FLUIDS, NamespacedKey.minecraft("supports_frogspawn"), Fluid.class);

    /**
     * @since 26.2
     */
    Tag<Fluid> FLUIDS_SUPPORTS_LILY_PAD = Bukkit.getTag(REGISTRY_FLUIDS, NamespacedKey.minecraft("supports_lily_pad"), Fluid.class);

    /**
     * @since 26.2
     */
    Tag<Fluid> FLUIDS_SUPPORTS_SUGAR_CANE_ADJACENTLY = Bukkit.getTag(REGISTRY_FLUIDS, NamespacedKey.minecraft("supports_sugar_cane_adjacently"), Fluid.class);

    /**
     * @since 1.16.3
     */
    Tag<Fluid> FLUIDS_WATER = Bukkit.getTag(REGISTRY_FLUIDS, NamespacedKey.minecraft("water"), Fluid.class);

    /**
     * @since 1.17.1
     */
    String REGISTRY_ENTITY_TYPES = "entity_types";

    /**
     * @since 1.21.10
     */
    Tag<EntityType> ENTITY_TYPES_ACCEPTS_IRON_GOLEM_GIFT = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("accepts_iron_golem_gift"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_AQUATIC = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("aquatic"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_ARROWS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("arrows"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_ARTHROPOD = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("arthropod"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_AXOLOTL_ALWAYS_HOSTILES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("axolotl_always_hostiles"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_AXOLOTL_HUNT_TARGETS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("axolotl_hunt_targets"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_BEEHIVE_INHABITORS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("beehive_inhabitors"), EntityType.class);

    /**
     * @since 1.21.6
     */
    Tag<EntityType> ENTITY_TYPES_BOAT = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("boat"), EntityType.class);

    /**
     * @since 1.21.11
     */
    Tag<EntityType> ENTITY_TYPES_BURN_IN_DAYLIGHT = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("burn_in_daylight"), EntityType.class);

    /**
     * @since 1.21.6
     */
    Tag<EntityType> ENTITY_TYPES_CAN_BREATHE_UNDER_WATER = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("can_breathe_under_water"), EntityType.class);

    /**
     * @since 1.21.6
     */
    Tag<EntityType> ENTITY_TYPES_CAN_EQUIP_HARNESS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("can_equip_harness"), EntityType.class);

    /**
     * @since 1.21.6
     */
    Tag<EntityType> ENTITY_TYPES_CAN_EQUIP_SADDLE = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("can_equip_saddle"), EntityType.class);

    /**
     * @since 1.21.11
     */
    Tag<EntityType> ENTITY_TYPES_CAN_FLOAT_WHILE_RIDDEN = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("can_float_while_ridden"), EntityType.class);

    /**
     * @since 1.20.4
     */
    Tag<EntityType> ENTITY_TYPES_CAN_TURN_IN_BOATS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("can_turn_in_boats"), EntityType.class);

    /**
     * @since 1.21.6
     */
    Tag<EntityType> ENTITY_TYPES_CAN_WEAR_HORSE_ARMOR = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("can_wear_horse_armor"), EntityType.class);

    /**
     * @since 1.21.11
     */
    Tag<EntityType> ENTITY_TYPES_CAN_WEAR_NAUTILUS_ARMOR = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("can_wear_nautilus_armor"), EntityType.class);

    /**
     * @since 1.21.10
     */
    Tag<EntityType> ENTITY_TYPES_CANDIDATE_FOR_IRON_GOLEM_GIFT = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("candidate_for_iron_golem_gift"), EntityType.class);

    /**
     * @since 26.2
     */
    Tag<EntityType> ENTITY_TYPES_CANNOT_BE_AGE_LOCKED = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("cannot_be_age_locked"), EntityType.class);

    /**
     * @since 1.21.10
     */
    Tag<EntityType> ENTITY_TYPES_CANNOT_BE_PUSHED_ONTO_BOATS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("cannot_be_pushed_onto_boats"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_DEFLECTS_PROJECTILES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("deflects_projectiles"), EntityType.class);

    /**
     * @since 1.19.4
     */
    Tag<EntityType> ENTITY_TYPES_DISMOUNTS_UNDERWATER = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("dismounts_underwater"), EntityType.class);

    /**
     * @since 1.19.4
     */
    Tag<EntityType> ENTITY_TYPES_FALL_DAMAGE_IMMUNE = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("fall_damage_immune"), EntityType.class);

    /**
     * @since 1.21.6
     */
    Tag<EntityType> ENTITY_TYPES_FOLLOWABLE_FRIENDLY_MOBS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("followable_friendly_mobs"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_FREEZE_HURTS_EXTRA_TYPES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("freeze_hurts_extra_types"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_FREEZE_IMMUNE_ENTITY_TYPES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("freeze_immune_entity_types"), EntityType.class);

    /**
     * @since 1.19
     */
    Tag<EntityType> ENTITY_TYPES_FROG_FOOD = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("frog_food"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_IGNORES_POISON_AND_REGEN = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("ignores_poison_and_regen"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_ILLAGER = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("illager"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_ILLAGER_FRIENDS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("illager_friends"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_IMMUNE_TO_INFESTED = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("immune_to_infested"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_IMMUNE_TO_OOZING = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("immune_to_oozing"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_IMPACT_PROJECTILES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("impact_projectiles"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_INVERTED_HEALING_AND_HARM = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("inverted_healing_and_harm"), EntityType.class);

    /**
     * @since 1.21.11
     */
    Tag<EntityType> ENTITY_TYPES_NAUTILUS_HOSTILES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("nautilus_hostiles"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_NO_ANGER_FROM_WIND_CHARGE = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("no_anger_from_wind_charge"), EntityType.class);

    /**
     * @since 1.20.2
     */
    Tag<EntityType> ENTITY_TYPES_NON_CONTROLLING_RIDER = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("non_controlling_rider"), EntityType.class);

    /**
     * @since 26.2
     */
    Tag<EntityType> ENTITY_TYPES_NOT_AFFECTED_BY_GEYSERS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("not_affected_by_geysers"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_NOT_SCARY_FOR_PUFFERFISH = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("not_scary_for_pufferfish"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_POWDER_SNOW_WALKABLE_MOBS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("powder_snow_walkable_mobs"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_RAIDERS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("raiders"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_REDIRECTABLE_PROJECTILE = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("redirectable_projectile"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_SENSITIVE_TO_BANE_OF_ARTHROPODS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("sensitive_to_bane_of_arthropods"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_SENSITIVE_TO_IMPALING = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("sensitive_to_impaling"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_SENSITIVE_TO_SMITE = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("sensitive_to_smite"), EntityType.class);

    /**
     * @since 1.17.1
     */
    Tag<EntityType> ENTITY_TYPES_SKELETONS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("skeletons"), EntityType.class);

    /**
     * @since 1.21.6
     */
    Tag<EntityType> ENTITY_TYPES_UNDEAD = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("undead"), EntityType.class);

    /**
     * @since 1.20.6
     */
    Tag<EntityType> ENTITY_TYPES_WITHER_FRIENDS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("wither_friends"), EntityType.class);

    /**
     * @since 1.21.6
     */
    Tag<EntityType> ENTITY_TYPES_ZOMBIES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("zombies"), EntityType.class);

    /**
     * @since 1.18.1
     */
    String REGISTRY_GAME_EVENTS = "game_events";

    /**
     * @since 1.19.4
     */
    Tag<GameEvent> GAME_EVENT_ALLAY_CAN_LISTEN = Bukkit.getTag(REGISTRY_GAME_EVENTS, NamespacedKey.minecraft("allay_can_listen"), GameEvent.class);

    /**
     * @since 1.18.1
     */
    Tag<GameEvent> GAME_EVENT_IGNORE_VIBRATIONS_SNEAKING = Bukkit.getTag(REGISTRY_GAME_EVENTS, NamespacedKey.minecraft("ignore_vibrations_sneaking"), GameEvent.class);

    /**
     * @since 1.21.6
     */
    Tag<GameEvent> GAME_EVENT_SHRIEKER_CAN_LISTEN = Bukkit.getTag(REGISTRY_GAME_EVENTS, NamespacedKey.minecraft("shrieker_can_listen"), GameEvent.class);

    /**
     * @since 1.18.1
     */
    Tag<GameEvent> GAME_EVENT_VIBRATIONS = Bukkit.getTag(REGISTRY_GAME_EVENTS, NamespacedKey.minecraft("vibrations"), GameEvent.class);

    /**
     * @since 1.21.6
     */
    Tag<GameEvent> GAME_EVENT_WARDEN_CAN_LISTEN = Bukkit.getTag(REGISTRY_GAME_EVENTS, NamespacedKey.minecraft("warden_can_listen"), GameEvent.class);
    // End generate - Tag
    //<editor-fold desc="deprecated tags" defaultstate="collapsed">
    /**
     * @deprecated replaced by {@link #WOOL_CARPETS}.
     */
    @Deprecated(since = "1.19", forRemoval = true)
    Tag<Material> CARPETS = WOOL_CARPETS;
    /**
     * @deprecated replaced by {@link #CANNOT_SUPPORT_SNOW_LAYER}
     */
    @Deprecated(since = "26.1", forRemoval = true)
    Tag<Material> SNOW_LAYER_CANNOT_SURVIVE_ON = CANNOT_SUPPORT_SNOW_LAYER;
    /**
     * @deprecated replaced by {@link #SUPPORT_OVERRIDE_SNOW_LAYER}
     */
    @Deprecated(since = "26.1", forRemoval = true)
    Tag<Material> SNOW_LAYER_CAN_SURVIVE_ON = SUPPORT_OVERRIDE_SNOW_LAYER;
    /**
     * @deprecated partially replaced by {@link #OVERRIDES_MUSHROOM_LIGHT_REQUIREMENT}
     */
    @Deprecated(since = "26.1", forRemoval = true)
    Tag<Material> MUSHROOM_GROW_BLOCK = OVERRIDES_MUSHROOM_LIGHT_REQUIREMENT;
    /**
     * @deprecated replaced by {@link #SUPPORTS_SMALL_DRIPLEAF}
     */
    @Deprecated(since = "26.1", forRemoval = true)
    Tag<Material> SMALL_DRIPLEAF_PLACEABLE = SUPPORTS_SMALL_DRIPLEAF;
    /**
     * @deprecated replaced by {@link #SUPPORTS_BIG_DRIPLEAF}
     */
    @Deprecated(since = "26.1", forRemoval = true)
    Tag<Material> BIG_DRIPLEAF_PLACEABLE = SUPPORTS_BIG_DRIPLEAF;
    /**
     * @deprecated replaced by {@link #SUPPORTS_BAMBOO}
     */
    @Deprecated(since = "26.1", forRemoval = true)
    Tag<Material> BAMBOO_PLANTABLE_ON = SUPPORTS_BAMBOO;
    /**
     * @deprecated replaced by {@link #SUPPORTS_DRY_VEGETATION}
     */
    @Deprecated(since = "26.1", forRemoval = true)
    Tag<Material> DRY_VEGETATION_MAY_PLACE_ON = SUPPORTS_DRY_VEGETATION;
    /**
     * Vanilla block tag representing all blocks which dead bushes may be placed on.
     *
     * @deprecated partially replaced by {@link #SUPPORTS_DRY_VEGETATION}
     */
    @Deprecated(since = "1.21.5", forRemoval = true)
    Tag<Material> DEAD_BUSH_MAY_PLACE_ON = SUPPORTS_DRY_VEGETATION;
    /**
     * @deprecated replaced by {@link #TRIGGERS_AMBIENT_DESERT_DRY_VEGETATION_BLOCK_SOUNDS}
     */
    @Deprecated(since = "1.21.6", forRemoval = true)
    Tag<Material> PLAYS_AMBIENT_DESERT_BLOCK_SOUNDS = TRIGGERS_AMBIENT_DESERT_DRY_VEGETATION_BLOCK_SOUNDS;
    /**
     * Vanilla block tag representing all blocks that are replaceable by
     * dripstone.
     *
     * @deprecated replaced by {@link #DRIPSTONE_REPLACEABLE_BLOCKS}
     */
    @Deprecated(since = "1.21.4", forRemoval = true)
    Tag<Material> DRIPSTONE_REPLACEABLE = DRIPSTONE_REPLACEABLE_BLOCKS;
    /**
     * @deprecated replaced by {@link #CONCRETE_POWDERS}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    Tag<Material> CONCRETE_POWDER = CONCRETE_POWDERS;
    /**
     * Vanilla item tag representing all piglin food.
     *
     * @deprecated replaced by {@link #ITEMS_PIGLIN_FOOD}
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    Tag<Material> PIGLIN_FOOD = ITEMS_PIGLIN_FOOD;
    /**
     * Vanilla item tag representing all fox food.
     *
     * @deprecated replaced by {@link #ITEMS_FOX_FOOD}
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    Tag<Material> FOX_FOOD = ITEMS_FOX_FOOD;
    /**
     * Vanilla item tag representing all furnace materials.
     *
     * @deprecated partially replaced by {@link #ITEMS_STONE_CRAFTING_MATERIALS}
     */
    @Deprecated(since = "1.16.2", forRemoval = true)
    Tag<Material> ITEMS_FURNACE_MATERIALS = ITEMS_STONE_CRAFTING_MATERIALS;
    /**
     * Vanilla item tag representing all items which modify note block sounds when placed on top.
     *
     * @deprecated replaced by {@link #ITEMS_NOTEBLOCK_TOP_INSTRUMENTS}
     */
    @Deprecated(since = "1.21.4", forRemoval = true)
    Tag<Material> ITEMS_NOTE_BLOCK_TOP_INSTRUMENTS = ITEMS_NOTEBLOCK_TOP_INSTRUMENTS;
    /**
     * Vanilla item tag representing all tools.
     *
     * @deprecated removed in Minecraft 1.20.5. Do not use. Will be removed at a later date. Until then,
     * this constant now acts as a reference to {@link #ITEMS_BREAKS_DECORATED_POTS} which largely shares
     * the same contents of the old "minecraft:tools" tag.
     */
    @Deprecated(since = "1.20.6", forRemoval = true)
    Tag<Material> ITEMS_TOOLS = ITEMS_BREAKS_DECORATED_POTS;
    /**
     * Vanilla item tag representing all items which tempt axolotls.
     *
     * @deprecated replaced by {@link #ITEMS_AXOLOTL_FOOD}
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    Tag<Material> AXOLOTL_TEMPT_ITEMS = ITEMS_AXOLOTL_FOOD;
    /**
     * Vanilla tag representing entities which deflect arrows.
     *
     * @deprecated replaced by {@link #ENTITY_TYPES_DEFLECTS_PROJECTILES}
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    Tag<EntityType> ENTITY_TYPES_DEFLECTS_ARROWS = ENTITY_TYPES_DEFLECTS_PROJECTILES;
    //</editor-fold>

    /**
     * Returns whether or not this tag has an entry for the specified item.
     *
     * @param item to check
     * @return if it is tagged
     * @since 1.13
     */
    boolean isTagged(@NotNull T item);

    /**
     * Gets an immutable set of all tagged items.
     *
     * @return set of tagged items
     * @since 1.13
     */
    @NotNull
    Set<T> getValues();

}
