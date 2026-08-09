package org.bukkit;

import com.google.common.base.Preconditions;
import io.papermc.paper.registry.RegistryKey;
import java.util.Locale;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * An interface of Sounds the server is able to send to players.
 * <p>
 * The sounds listed in this interface are present in the default server
 * or can be enabled via a {@link FeatureFlag}.
 * There may be additional sounds present in the server, for example from a {@link io.papermc.paper.datapack.Datapack}
 * which can be accessed via {@link Registry#SOUNDS}.
 * <p>
 * <b>WARNING:</b> At any time, sounds may be added/removed from this interface or even
 * Minecraft itself! There is no guarantee the sounds will play. There is no
 * guarantee values will not be removed from this interface. As such, you should not
 * depend on the ordinal values of this class.
 *
 * @since 1.3.2
 */
public interface Sound extends OldEnum<Sound>, Keyed, net.kyori.adventure.sound.Sound.Type { // Paper - implement Sound.Type

    /**
     * @since 1.16.1
     */
    // Start generate - Sound
    Sound AMBIENT_BASALT_DELTAS_ADDITIONS = getSound("ambient.basalt_deltas.additions");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_BASALT_DELTAS_LOOP = getSound("ambient.basalt_deltas.loop");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_BASALT_DELTAS_MOOD = getSound("ambient.basalt_deltas.mood");

    /**
     * @since 1.9.4
     */
    Sound AMBIENT_CAVE = getSound("ambient.cave");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_CRIMSON_FOREST_ADDITIONS = getSound("ambient.crimson_forest.additions");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_CRIMSON_FOREST_LOOP = getSound("ambient.crimson_forest.loop");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_CRIMSON_FOREST_MOOD = getSound("ambient.crimson_forest.mood");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_NETHER_WASTES_ADDITIONS = getSound("ambient.nether_wastes.additions");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_NETHER_WASTES_LOOP = getSound("ambient.nether_wastes.loop");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_NETHER_WASTES_MOOD = getSound("ambient.nether_wastes.mood");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_SOUL_SAND_VALLEY_ADDITIONS = getSound("ambient.soul_sand_valley.additions");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_SOUL_SAND_VALLEY_LOOP = getSound("ambient.soul_sand_valley.loop");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_SOUL_SAND_VALLEY_MOOD = getSound("ambient.soul_sand_valley.mood");

    /**
     * @since 1.13
     */
    Sound AMBIENT_UNDERWATER_ENTER = getSound("ambient.underwater.enter");

    /**
     * @since 1.13
     */
    Sound AMBIENT_UNDERWATER_EXIT = getSound("ambient.underwater.exit");

    /**
     * @since 1.13
     */
    Sound AMBIENT_UNDERWATER_LOOP = getSound("ambient.underwater.loop");

    /**
     * @since 1.13
     */
    Sound AMBIENT_UNDERWATER_LOOP_ADDITIONS = getSound("ambient.underwater.loop.additions");

    /**
     * @since 1.13
     */
    Sound AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE = getSound("ambient.underwater.loop.additions.rare");

    /**
     * @since 1.13
     */
    Sound AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE = getSound("ambient.underwater.loop.additions.ultra_rare");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_WARPED_FOREST_ADDITIONS = getSound("ambient.warped_forest.additions");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_WARPED_FOREST_LOOP = getSound("ambient.warped_forest.loop");

    /**
     * @since 1.16.1
     */
    Sound AMBIENT_WARPED_FOREST_MOOD = getSound("ambient.warped_forest.mood");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_BLOCK_BREAK = getSound("block.amethyst_block.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_BLOCK_CHIME = getSound("block.amethyst_block.chime");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_BLOCK_FALL = getSound("block.amethyst_block.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_BLOCK_HIT = getSound("block.amethyst_block.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_BLOCK_PLACE = getSound("block.amethyst_block.place");

    /**
     * @since 1.20
     */
    Sound BLOCK_AMETHYST_BLOCK_RESONATE = getSound("block.amethyst_block.resonate");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_BLOCK_STEP = getSound("block.amethyst_block.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_CLUSTER_BREAK = getSound("block.amethyst_cluster.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_CLUSTER_FALL = getSound("block.amethyst_cluster.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_CLUSTER_HIT = getSound("block.amethyst_cluster.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_CLUSTER_PLACE = getSound("block.amethyst_cluster.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_AMETHYST_CLUSTER_STEP = getSound("block.amethyst_cluster.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ANCIENT_DEBRIS_BREAK = getSound("block.ancient_debris.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ANCIENT_DEBRIS_FALL = getSound("block.ancient_debris.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ANCIENT_DEBRIS_HIT = getSound("block.ancient_debris.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ANCIENT_DEBRIS_PLACE = getSound("block.ancient_debris.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ANCIENT_DEBRIS_STEP = getSound("block.ancient_debris.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_ANVIL_BREAK = getSound("block.anvil.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_ANVIL_DESTROY = getSound("block.anvil.destroy");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_ANVIL_FALL = getSound("block.anvil.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_ANVIL_HIT = getSound("block.anvil.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_ANVIL_LAND = getSound("block.anvil.land");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_ANVIL_PLACE = getSound("block.anvil.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_ANVIL_STEP = getSound("block.anvil.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_ANVIL_USE = getSound("block.anvil.use");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_BREAK = getSound("block.azalea.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_FALL = getSound("block.azalea.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_HIT = getSound("block.azalea.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_PLACE = getSound("block.azalea.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_STEP = getSound("block.azalea.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_LEAVES_BREAK = getSound("block.azalea_leaves.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_LEAVES_FALL = getSound("block.azalea_leaves.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_LEAVES_HIT = getSound("block.azalea_leaves.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_LEAVES_PLACE = getSound("block.azalea_leaves.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_AZALEA_LEAVES_STEP = getSound("block.azalea_leaves.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_BAMBOO_BREAK = getSound("block.bamboo.break");

    /**
     * @since 1.14
     */
    Sound BLOCK_BAMBOO_FALL = getSound("block.bamboo.fall");

    /**
     * @since 1.14
     */
    Sound BLOCK_BAMBOO_HIT = getSound("block.bamboo.hit");

    /**
     * @since 1.14
     */
    Sound BLOCK_BAMBOO_PLACE = getSound("block.bamboo.place");

    /**
     * @since 1.14
     */
    Sound BLOCK_BAMBOO_STEP = getSound("block.bamboo.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_BAMBOO_SAPLING_BREAK = getSound("block.bamboo_sapling.break");

    /**
     * @since 1.14
     */
    Sound BLOCK_BAMBOO_SAPLING_HIT = getSound("block.bamboo_sapling.hit");

    /**
     * @since 1.14
     */
    Sound BLOCK_BAMBOO_SAPLING_PLACE = getSound("block.bamboo_sapling.place");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_BREAK = getSound("block.bamboo_wood.break");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_FALL = getSound("block.bamboo_wood.fall");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_HIT = getSound("block.bamboo_wood.hit");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_PLACE = getSound("block.bamboo_wood.place");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_STEP = getSound("block.bamboo_wood.step");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_BUTTON_CLICK_OFF = getSound("block.bamboo_wood_button.click_off");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_BUTTON_CLICK_ON = getSound("block.bamboo_wood_button.click_on");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_DOOR_CLOSE = getSound("block.bamboo_wood_door.close");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_DOOR_OPEN = getSound("block.bamboo_wood_door.open");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_FENCE_GATE_CLOSE = getSound("block.bamboo_wood_fence_gate.close");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_FENCE_GATE_OPEN = getSound("block.bamboo_wood_fence_gate.open");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_BREAK = getSound("block.bamboo_wood_hanging_sign.break");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_FALL = getSound("block.bamboo_wood_hanging_sign.fall");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_HIT = getSound("block.bamboo_wood_hanging_sign.hit");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_PLACE = getSound("block.bamboo_wood_hanging_sign.place");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_STEP = getSound("block.bamboo_wood_hanging_sign.step");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_PRESSURE_PLATE_CLICK_OFF = getSound("block.bamboo_wood_pressure_plate.click_off");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_PRESSURE_PLATE_CLICK_ON = getSound("block.bamboo_wood_pressure_plate.click_on");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_TRAPDOOR_CLOSE = getSound("block.bamboo_wood_trapdoor.close");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_BAMBOO_WOOD_TRAPDOOR_OPEN = getSound("block.bamboo_wood_trapdoor.open");

    /**
     * @since 1.14
     */
    Sound BLOCK_BARREL_CLOSE = getSound("block.barrel.close");

    /**
     * @since 1.14
     */
    Sound BLOCK_BARREL_OPEN = getSound("block.barrel.open");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BASALT_BREAK = getSound("block.basalt.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BASALT_FALL = getSound("block.basalt.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BASALT_HIT = getSound("block.basalt.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BASALT_PLACE = getSound("block.basalt.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BASALT_STEP = getSound("block.basalt.step");

    /**
     * @since 1.13
     */
    Sound BLOCK_BEACON_ACTIVATE = getSound("block.beacon.activate");

    /**
     * @since 1.13
     */
    Sound BLOCK_BEACON_AMBIENT = getSound("block.beacon.ambient");

    /**
     * @since 1.13
     */
    Sound BLOCK_BEACON_DEACTIVATE = getSound("block.beacon.deactivate");

    /**
     * @since 1.13
     */
    Sound BLOCK_BEACON_POWER_SELECT = getSound("block.beacon.power_select");

    /**
     * @since 1.15
     */
    Sound BLOCK_BEEHIVE_DRIP = getSound("block.beehive.drip");

    /**
     * @since 1.15
     */
    Sound BLOCK_BEEHIVE_ENTER = getSound("block.beehive.enter");

    /**
     * @since 1.15
     */
    Sound BLOCK_BEEHIVE_EXIT = getSound("block.beehive.exit");

    /**
     * @since 1.15
     */
    Sound BLOCK_BEEHIVE_SHEAR = getSound("block.beehive.shear");

    /**
     * @since 1.15
     */
    Sound BLOCK_BEEHIVE_WORK = getSound("block.beehive.work");

    /**
     * @since 1.14
     */
    Sound BLOCK_BELL_RESONATE = getSound("block.bell.resonate");

    /**
     * @since 1.14
     */
    Sound BLOCK_BELL_USE = getSound("block.bell.use");

    /**
     * @since 1.17
     */
    Sound BLOCK_BIG_DRIPLEAF_BREAK = getSound("block.big_dripleaf.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_BIG_DRIPLEAF_FALL = getSound("block.big_dripleaf.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_BIG_DRIPLEAF_HIT = getSound("block.big_dripleaf.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_BIG_DRIPLEAF_PLACE = getSound("block.big_dripleaf.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_BIG_DRIPLEAF_STEP = getSound("block.big_dripleaf.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_BIG_DRIPLEAF_TILT_DOWN = getSound("block.big_dripleaf.tilt_down");

    /**
     * @since 1.17
     */
    Sound BLOCK_BIG_DRIPLEAF_TILT_UP = getSound("block.big_dripleaf.tilt_up");

    /**
     * @since 1.14
     */
    Sound BLOCK_BLASTFURNACE_FIRE_CRACKLE = getSound("block.blastfurnace.fire_crackle");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BONE_BLOCK_BREAK = getSound("block.bone_block.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BONE_BLOCK_FALL = getSound("block.bone_block.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BONE_BLOCK_HIT = getSound("block.bone_block.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BONE_BLOCK_PLACE = getSound("block.bone_block.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_BONE_BLOCK_STEP = getSound("block.bone_block.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_BREWING_STAND_BREW = getSound("block.brewing_stand.brew");

    /**
     * @since 1.13
     */
    Sound BLOCK_BUBBLE_COLUMN_BUBBLE_POP = getSound("block.bubble_column.bubble_pop");

    /**
     * @since 1.13
     */
    Sound BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT = getSound("block.bubble_column.upwards_ambient");

    /**
     * @since 1.13
     */
    Sound BLOCK_BUBBLE_COLUMN_UPWARDS_INSIDE = getSound("block.bubble_column.upwards_inside");

    /**
     * @since 1.13
     */
    Sound BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT = getSound("block.bubble_column.whirlpool_ambient");

    /**
     * @since 1.13
     */
    Sound BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE = getSound("block.bubble_column.whirlpool_inside");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_CACTUS_FLOWER_BREAK = getSound("block.cactus_flower.break");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_CACTUS_FLOWER_PLACE = getSound("block.cactus_flower.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_CAKE_ADD_CANDLE = getSound("block.cake.add_candle");

    /**
     * @since 1.17
     */
    Sound BLOCK_CALCITE_BREAK = getSound("block.calcite.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_CALCITE_FALL = getSound("block.calcite.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_CALCITE_HIT = getSound("block.calcite.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_CALCITE_PLACE = getSound("block.calcite.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_CALCITE_STEP = getSound("block.calcite.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_CAMPFIRE_CRACKLE = getSound("block.campfire.crackle");

    /**
     * @since 1.17
     */
    Sound BLOCK_CANDLE_AMBIENT = getSound("block.candle.ambient");

    /**
     * @since 1.17
     */
    Sound BLOCK_CANDLE_BREAK = getSound("block.candle.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_CANDLE_EXTINGUISH = getSound("block.candle.extinguish");

    /**
     * @since 1.17
     */
    Sound BLOCK_CANDLE_FALL = getSound("block.candle.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_CANDLE_HIT = getSound("block.candle.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_CANDLE_PLACE = getSound("block.candle.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_CANDLE_STEP = getSound("block.candle.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_CAVE_VINES_BREAK = getSound("block.cave_vines.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_CAVE_VINES_FALL = getSound("block.cave_vines.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_CAVE_VINES_HIT = getSound("block.cave_vines.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_CAVE_VINES_PICK_BERRIES = getSound("block.cave_vines.pick_berries");

    /**
     * @since 1.17
     */
    Sound BLOCK_CAVE_VINES_PLACE = getSound("block.cave_vines.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_CAVE_VINES_STEP = getSound("block.cave_vines.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_CHAIN_BREAK = getSound("block.chain.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_CHAIN_FALL = getSound("block.chain.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_CHAIN_HIT = getSound("block.chain.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_CHAIN_PLACE = getSound("block.chain.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_CHAIN_STEP = getSound("block.chain.step");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_LEAVES_BREAK = getSound("block.cherry_leaves.break");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_LEAVES_FALL = getSound("block.cherry_leaves.fall");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_LEAVES_HIT = getSound("block.cherry_leaves.hit");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_LEAVES_PLACE = getSound("block.cherry_leaves.place");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_LEAVES_STEP = getSound("block.cherry_leaves.step");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_SAPLING_BREAK = getSound("block.cherry_sapling.break");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_SAPLING_FALL = getSound("block.cherry_sapling.fall");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_SAPLING_HIT = getSound("block.cherry_sapling.hit");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_SAPLING_PLACE = getSound("block.cherry_sapling.place");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_SAPLING_STEP = getSound("block.cherry_sapling.step");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_BREAK = getSound("block.cherry_wood.break");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_FALL = getSound("block.cherry_wood.fall");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_HIT = getSound("block.cherry_wood.hit");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_PLACE = getSound("block.cherry_wood.place");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_STEP = getSound("block.cherry_wood.step");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_BUTTON_CLICK_OFF = getSound("block.cherry_wood_button.click_off");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_BUTTON_CLICK_ON = getSound("block.cherry_wood_button.click_on");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_DOOR_CLOSE = getSound("block.cherry_wood_door.close");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_DOOR_OPEN = getSound("block.cherry_wood_door.open");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_FENCE_GATE_CLOSE = getSound("block.cherry_wood_fence_gate.close");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_FENCE_GATE_OPEN = getSound("block.cherry_wood_fence_gate.open");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_BREAK = getSound("block.cherry_wood_hanging_sign.break");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_FALL = getSound("block.cherry_wood_hanging_sign.fall");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_HIT = getSound("block.cherry_wood_hanging_sign.hit");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_PLACE = getSound("block.cherry_wood_hanging_sign.place");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_STEP = getSound("block.cherry_wood_hanging_sign.step");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF = getSound("block.cherry_wood_pressure_plate.click_off");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON = getSound("block.cherry_wood_pressure_plate.click_on");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_TRAPDOOR_CLOSE = getSound("block.cherry_wood_trapdoor.close");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_CHERRY_WOOD_TRAPDOOR_OPEN = getSound("block.cherry_wood_trapdoor.open");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_CHEST_CLOSE = getSound("block.chest.close");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_CHEST_LOCKED = getSound("block.chest.locked");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_CHEST_OPEN = getSound("block.chest.open");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_BREAK = getSound("block.chiseled_bookshelf.break");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_FALL = getSound("block.chiseled_bookshelf.fall");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_HIT = getSound("block.chiseled_bookshelf.hit");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_INSERT = getSound("block.chiseled_bookshelf.insert");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_INSERT_ENCHANTED = getSound("block.chiseled_bookshelf.insert.enchanted");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_PICKUP = getSound("block.chiseled_bookshelf.pickup");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_PICKUP_ENCHANTED = getSound("block.chiseled_bookshelf.pickup.enchanted");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_PLACE = getSound("block.chiseled_bookshelf.place");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_CHISELED_BOOKSHELF_STEP = getSound("block.chiseled_bookshelf.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_CHORUS_FLOWER_DEATH = getSound("block.chorus_flower.death");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_CHORUS_FLOWER_GROW = getSound("block.chorus_flower.grow");

    /**
     * @since 26.2
     */
    Sound BLOCK_CINNABAR_BREAK = getSound("block.cinnabar.break");

    /**
     * @since 26.2
     */
    Sound BLOCK_CINNABAR_FALL = getSound("block.cinnabar.fall");

    /**
     * @since 26.2
     */
    Sound BLOCK_CINNABAR_HIT = getSound("block.cinnabar.hit");

    /**
     * @since 26.2
     */
    Sound BLOCK_CINNABAR_PLACE = getSound("block.cinnabar.place");

    /**
     * @since 26.2
     */
    Sound BLOCK_CINNABAR_STEP = getSound("block.cinnabar.step");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_COBWEB_BREAK = getSound("block.cobweb.break");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_COBWEB_FALL = getSound("block.cobweb.fall");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_COBWEB_HIT = getSound("block.cobweb.hit");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_COBWEB_PLACE = getSound("block.cobweb.place");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_COBWEB_STEP = getSound("block.cobweb.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_COMPARATOR_CLICK = getSound("block.comparator.click");

    /**
     * @since 1.14
     */
    Sound BLOCK_COMPOSTER_EMPTY = getSound("block.composter.empty");

    /**
     * @since 1.14
     */
    Sound BLOCK_COMPOSTER_FILL = getSound("block.composter.fill");

    /**
     * @since 1.14
     */
    Sound BLOCK_COMPOSTER_FILL_SUCCESS = getSound("block.composter.fill_success");

    /**
     * @since 1.14
     */
    Sound BLOCK_COMPOSTER_READY = getSound("block.composter.ready");

    /**
     * @since 1.13
     */
    Sound BLOCK_CONDUIT_ACTIVATE = getSound("block.conduit.activate");

    /**
     * @since 1.13
     */
    Sound BLOCK_CONDUIT_AMBIENT = getSound("block.conduit.ambient");

    /**
     * @since 1.13
     */
    Sound BLOCK_CONDUIT_AMBIENT_SHORT = getSound("block.conduit.ambient.short");

    /**
     * @since 1.13
     */
    Sound BLOCK_CONDUIT_ATTACK_TARGET = getSound("block.conduit.attack.target");

    /**
     * @since 1.13
     */
    Sound BLOCK_CONDUIT_DEACTIVATE = getSound("block.conduit.deactivate");

    /**
     * @since 1.17
     */
    Sound BLOCK_COPPER_BREAK = getSound("block.copper.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_COPPER_FALL = getSound("block.copper.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_COPPER_HIT = getSound("block.copper.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_COPPER_PLACE = getSound("block.copper.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_COPPER_STEP = getSound("block.copper.step");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_BULB_BREAK = getSound("block.copper_bulb.break");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_BULB_FALL = getSound("block.copper_bulb.fall");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_BULB_HIT = getSound("block.copper_bulb.hit");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_BULB_PLACE = getSound("block.copper_bulb.place");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_BULB_STEP = getSound("block.copper_bulb.step");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_BULB_TURN_OFF = getSound("block.copper_bulb.turn_off");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_BULB_TURN_ON = getSound("block.copper_bulb.turn_on");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_CHEST_CLOSE = getSound("block.copper_chest.close");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_CHEST_OPEN = getSound("block.copper_chest.open");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_CHEST_OXIDIZED_CLOSE = getSound("block.copper_chest_oxidized.close");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_CHEST_OXIDIZED_OPEN = getSound("block.copper_chest_oxidized.open");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_CHEST_WEATHERED_CLOSE = getSound("block.copper_chest_weathered.close");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_CHEST_WEATHERED_OPEN = getSound("block.copper_chest_weathered.open");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_DOOR_CLOSE = getSound("block.copper_door.close");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_DOOR_OPEN = getSound("block.copper_door.open");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_GOLEM_STATUE_BREAK = getSound("block.copper_golem_statue.break");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_GOLEM_STATUE_FALL = getSound("block.copper_golem_statue.fall");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_GOLEM_STATUE_HIT = getSound("block.copper_golem_statue.hit");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_GOLEM_STATUE_PLACE = getSound("block.copper_golem_statue.place");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_COPPER_GOLEM_STATUE_STEP = getSound("block.copper_golem_statue.step");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_GRATE_BREAK = getSound("block.copper_grate.break");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_GRATE_FALL = getSound("block.copper_grate.fall");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_GRATE_HIT = getSound("block.copper_grate.hit");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_GRATE_PLACE = getSound("block.copper_grate.place");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_GRATE_STEP = getSound("block.copper_grate.step");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_TRAPDOOR_CLOSE = getSound("block.copper_trapdoor.close");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_COPPER_TRAPDOOR_OPEN = getSound("block.copper_trapdoor.open");

    /**
     * @since 1.13
     */
    Sound BLOCK_CORAL_BLOCK_BREAK = getSound("block.coral_block.break");

    /**
     * @since 1.13
     */
    Sound BLOCK_CORAL_BLOCK_FALL = getSound("block.coral_block.fall");

    /**
     * @since 1.13
     */
    Sound BLOCK_CORAL_BLOCK_HIT = getSound("block.coral_block.hit");

    /**
     * @since 1.13
     */
    Sound BLOCK_CORAL_BLOCK_PLACE = getSound("block.coral_block.place");

    /**
     * @since 1.13
     */
    Sound BLOCK_CORAL_BLOCK_STEP = getSound("block.coral_block.step");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_CRAFTER_CRAFT = getSound("block.crafter.craft");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_CRAFTER_FAIL = getSound("block.crafter.fail");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_CREAKING_HEART_BREAK = getSound("block.creaking_heart.break");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_CREAKING_HEART_FALL = getSound("block.creaking_heart.fall");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_CREAKING_HEART_HIT = getSound("block.creaking_heart.hit");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_CREAKING_HEART_HURT = getSound("block.creaking_heart.hurt");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_CREAKING_HEART_IDLE = getSound("block.creaking_heart.idle");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_CREAKING_HEART_PLACE = getSound("block.creaking_heart.place");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_CREAKING_HEART_SPAWN = getSound("block.creaking_heart.spawn");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_CREAKING_HEART_STEP = getSound("block.creaking_heart.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_CROP_BREAK = getSound("block.crop.break");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DEADBUSH_IDLE = getSound("block.deadbush.idle");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_DECORATED_POT_BREAK = getSound("block.decorated_pot.break");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_DECORATED_POT_FALL = getSound("block.decorated_pot.fall");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_DECORATED_POT_HIT = getSound("block.decorated_pot.hit");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_DECORATED_POT_INSERT = getSound("block.decorated_pot.insert");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_DECORATED_POT_INSERT_FAIL = getSound("block.decorated_pot.insert_fail");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_DECORATED_POT_PLACE = getSound("block.decorated_pot.place");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_DECORATED_POT_SHATTER = getSound("block.decorated_pot.shatter");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_DECORATED_POT_STEP = getSound("block.decorated_pot.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_BREAK = getSound("block.deepslate.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_FALL = getSound("block.deepslate.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_HIT = getSound("block.deepslate.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_PLACE = getSound("block.deepslate.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_STEP = getSound("block.deepslate.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_BRICKS_BREAK = getSound("block.deepslate_bricks.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_BRICKS_FALL = getSound("block.deepslate_bricks.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_BRICKS_HIT = getSound("block.deepslate_bricks.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_BRICKS_PLACE = getSound("block.deepslate_bricks.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_BRICKS_STEP = getSound("block.deepslate_bricks.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_TILES_BREAK = getSound("block.deepslate_tiles.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_TILES_FALL = getSound("block.deepslate_tiles.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_TILES_HIT = getSound("block.deepslate_tiles.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_TILES_PLACE = getSound("block.deepslate_tiles.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_DEEPSLATE_TILES_STEP = getSound("block.deepslate_tiles.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_DISPENSER_DISPENSE = getSound("block.dispenser.dispense");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_DISPENSER_FAIL = getSound("block.dispenser.fail");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_DISPENSER_LAUNCH = getSound("block.dispenser.launch");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRIED_GHAST_AMBIENT = getSound("block.dried_ghast.ambient");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRIED_GHAST_AMBIENT_WATER = getSound("block.dried_ghast.ambient_water");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRIED_GHAST_BREAK = getSound("block.dried_ghast.break");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRIED_GHAST_FALL = getSound("block.dried_ghast.fall");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRIED_GHAST_PLACE = getSound("block.dried_ghast.place");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRIED_GHAST_PLACE_IN_WATER = getSound("block.dried_ghast.place_in_water");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRIED_GHAST_STEP = getSound("block.dried_ghast.step");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRIED_GHAST_TRANSITION = getSound("block.dried_ghast.transition");

    /**
     * @since 1.17
     */
    Sound BLOCK_DRIPSTONE_BLOCK_BREAK = getSound("block.dripstone_block.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_DRIPSTONE_BLOCK_FALL = getSound("block.dripstone_block.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_DRIPSTONE_BLOCK_HIT = getSound("block.dripstone_block.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_DRIPSTONE_BLOCK_PLACE = getSound("block.dripstone_block.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_DRIPSTONE_BLOCK_STEP = getSound("block.dripstone_block.step");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_DRY_GRASS_AMBIENT = getSound("block.dry_grass.ambient");

    /**
     * @since 1.10.2
     */
    Sound BLOCK_ENCHANTMENT_TABLE_USE = getSound("block.enchantment_table.use");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_END_GATEWAY_SPAWN = getSound("block.end_gateway.spawn");

    /**
     * @since 1.12
     */
    Sound BLOCK_END_PORTAL_SPAWN = getSound("block.end_portal.spawn");

    /**
     * @since 1.12
     */
    Sound BLOCK_END_PORTAL_FRAME_FILL = getSound("block.end_portal_frame.fill");

    /**
     * @since 1.13
     */
    Sound BLOCK_ENDER_CHEST_CLOSE = getSound("block.ender_chest.close");

    /**
     * @since 1.13
     */
    Sound BLOCK_ENDER_CHEST_OPEN = getSound("block.ender_chest.open");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_EYEBLOSSOM_CLOSE = getSound("block.eyeblossom.close");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_EYEBLOSSOM_CLOSE_LONG = getSound("block.eyeblossom.close_long");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_EYEBLOSSOM_IDLE = getSound("block.eyeblossom.idle");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_EYEBLOSSOM_OPEN = getSound("block.eyeblossom.open");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_EYEBLOSSOM_OPEN_LONG = getSound("block.eyeblossom.open_long");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_FENCE_GATE_CLOSE = getSound("block.fence_gate.close");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_FENCE_GATE_OPEN = getSound("block.fence_gate.open");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_FIRE_AMBIENT = getSound("block.fire.ambient");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_FIRE_EXTINGUISH = getSound("block.fire.extinguish");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_FIREFLY_BUSH_IDLE = getSound("block.firefly_bush.idle");

    /**
     * @since 1.17
     */
    Sound BLOCK_FLOWERING_AZALEA_BREAK = getSound("block.flowering_azalea.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_FLOWERING_AZALEA_FALL = getSound("block.flowering_azalea.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_FLOWERING_AZALEA_HIT = getSound("block.flowering_azalea.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_FLOWERING_AZALEA_PLACE = getSound("block.flowering_azalea.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_FLOWERING_AZALEA_STEP = getSound("block.flowering_azalea.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGLIGHT_BREAK = getSound("block.froglight.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGLIGHT_FALL = getSound("block.froglight.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGLIGHT_HIT = getSound("block.froglight.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGLIGHT_PLACE = getSound("block.froglight.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGLIGHT_STEP = getSound("block.froglight.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGSPAWN_BREAK = getSound("block.frogspawn.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGSPAWN_FALL = getSound("block.frogspawn.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGSPAWN_HATCH = getSound("block.frogspawn.hatch");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGSPAWN_HIT = getSound("block.frogspawn.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGSPAWN_PLACE = getSound("block.frogspawn.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_FROGSPAWN_STEP = getSound("block.frogspawn.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_FUNGUS_BREAK = getSound("block.fungus.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_FUNGUS_FALL = getSound("block.fungus.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_FUNGUS_HIT = getSound("block.fungus.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_FUNGUS_PLACE = getSound("block.fungus.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_FUNGUS_STEP = getSound("block.fungus.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_FURNACE_FIRE_CRACKLE = getSound("block.furnace.fire_crackle");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_GILDED_BLACKSTONE_BREAK = getSound("block.gilded_blackstone.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_GILDED_BLACKSTONE_FALL = getSound("block.gilded_blackstone.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_GILDED_BLACKSTONE_HIT = getSound("block.gilded_blackstone.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_GILDED_BLACKSTONE_PLACE = getSound("block.gilded_blackstone.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_GILDED_BLACKSTONE_STEP = getSound("block.gilded_blackstone.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GLASS_BREAK = getSound("block.glass.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GLASS_FALL = getSound("block.glass.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GLASS_HIT = getSound("block.glass.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GLASS_PLACE = getSound("block.glass.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GLASS_STEP = getSound("block.glass.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRASS_BREAK = getSound("block.grass.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRASS_FALL = getSound("block.grass.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRASS_HIT = getSound("block.grass.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRASS_PLACE = getSound("block.grass.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRASS_STEP = getSound("block.grass.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRAVEL_BREAK = getSound("block.gravel.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRAVEL_FALL = getSound("block.gravel.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRAVEL_HIT = getSound("block.gravel.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRAVEL_PLACE = getSound("block.gravel.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_GRAVEL_STEP = getSound("block.gravel.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_GRINDSTONE_USE = getSound("block.grindstone.use");

    /**
     * @since 1.18.1
     */
    Sound BLOCK_GROWING_PLANT_CROP = getSound("block.growing_plant.crop");

    /**
     * @since 1.17
     */
    Sound BLOCK_HANGING_ROOTS_BREAK = getSound("block.hanging_roots.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_HANGING_ROOTS_FALL = getSound("block.hanging_roots.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_HANGING_ROOTS_HIT = getSound("block.hanging_roots.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_HANGING_ROOTS_PLACE = getSound("block.hanging_roots.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_HANGING_ROOTS_STEP = getSound("block.hanging_roots.step");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_HANGING_SIGN_BREAK = getSound("block.hanging_sign.break");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_HANGING_SIGN_FALL = getSound("block.hanging_sign.fall");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_HANGING_SIGN_HIT = getSound("block.hanging_sign.hit");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_HANGING_SIGN_PLACE = getSound("block.hanging_sign.place");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_HANGING_SIGN_STEP = getSound("block.hanging_sign.step");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_HANGING_SIGN_WAXED_INTERACT_FAIL = getSound("block.hanging_sign.waxed_interact_fail");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_HEAVY_CORE_BREAK = getSound("block.heavy_core.break");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_HEAVY_CORE_FALL = getSound("block.heavy_core.fall");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_HEAVY_CORE_HIT = getSound("block.heavy_core.hit");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_HEAVY_CORE_PLACE = getSound("block.heavy_core.place");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_HEAVY_CORE_STEP = getSound("block.heavy_core.step");

    /**
     * @since 1.15
     */
    Sound BLOCK_HONEY_BLOCK_BREAK = getSound("block.honey_block.break");

    /**
     * @since 1.15
     */
    Sound BLOCK_HONEY_BLOCK_FALL = getSound("block.honey_block.fall");

    /**
     * @since 1.15
     */
    Sound BLOCK_HONEY_BLOCK_HIT = getSound("block.honey_block.hit");

    /**
     * @since 1.15
     */
    Sound BLOCK_HONEY_BLOCK_PLACE = getSound("block.honey_block.place");

    /**
     * @since 1.15
     */
    Sound BLOCK_HONEY_BLOCK_SLIDE = getSound("block.honey_block.slide");

    /**
     * @since 1.15
     */
    Sound BLOCK_HONEY_BLOCK_STEP = getSound("block.honey_block.step");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_IRON_BREAK = getSound("block.iron.break");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_IRON_FALL = getSound("block.iron.fall");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_IRON_HIT = getSound("block.iron.hit");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_IRON_PLACE = getSound("block.iron.place");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_IRON_STEP = getSound("block.iron.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_IRON_DOOR_CLOSE = getSound("block.iron_door.close");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_IRON_DOOR_OPEN = getSound("block.iron_door.open");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_IRON_TRAPDOOR_CLOSE = getSound("block.iron_trapdoor.close");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_IRON_TRAPDOOR_OPEN = getSound("block.iron_trapdoor.open");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LADDER_BREAK = getSound("block.ladder.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LADDER_FALL = getSound("block.ladder.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LADDER_HIT = getSound("block.ladder.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LADDER_PLACE = getSound("block.ladder.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LADDER_STEP = getSound("block.ladder.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_LANTERN_BREAK = getSound("block.lantern.break");

    /**
     * @since 1.14
     */
    Sound BLOCK_LANTERN_FALL = getSound("block.lantern.fall");

    /**
     * @since 1.14
     */
    Sound BLOCK_LANTERN_HIT = getSound("block.lantern.hit");

    /**
     * @since 1.14
     */
    Sound BLOCK_LANTERN_PLACE = getSound("block.lantern.place");

    /**
     * @since 1.14
     */
    Sound BLOCK_LANTERN_STEP = getSound("block.lantern.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_LARGE_AMETHYST_BUD_BREAK = getSound("block.large_amethyst_bud.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_LARGE_AMETHYST_BUD_PLACE = getSound("block.large_amethyst_bud.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LAVA_AMBIENT = getSound("block.lava.ambient");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LAVA_EXTINGUISH = getSound("block.lava.extinguish");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LAVA_POP = getSound("block.lava.pop");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_LEAF_LITTER_BREAK = getSound("block.leaf_litter.break");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_LEAF_LITTER_FALL = getSound("block.leaf_litter.fall");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_LEAF_LITTER_HIT = getSound("block.leaf_litter.hit");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_LEAF_LITTER_PLACE = getSound("block.leaf_litter.place");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_LEAF_LITTER_STEP = getSound("block.leaf_litter.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_LEVER_CLICK = getSound("block.lever.click");

    /**
     * @since 1.13
     */
    Sound BLOCK_LILY_PAD_PLACE = getSound("block.lily_pad.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_LODESTONE_BREAK = getSound("block.lodestone.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_LODESTONE_FALL = getSound("block.lodestone.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_LODESTONE_HIT = getSound("block.lodestone.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_LODESTONE_PLACE = getSound("block.lodestone.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_LODESTONE_STEP = getSound("block.lodestone.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_MANGROVE_ROOTS_BREAK = getSound("block.mangrove_roots.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_MANGROVE_ROOTS_FALL = getSound("block.mangrove_roots.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_MANGROVE_ROOTS_HIT = getSound("block.mangrove_roots.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_MANGROVE_ROOTS_PLACE = getSound("block.mangrove_roots.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_MANGROVE_ROOTS_STEP = getSound("block.mangrove_roots.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_MEDIUM_AMETHYST_BUD_BREAK = getSound("block.medium_amethyst_bud.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_MEDIUM_AMETHYST_BUD_PLACE = getSound("block.medium_amethyst_bud.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_METAL_BREAK = getSound("block.metal.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_METAL_FALL = getSound("block.metal.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_METAL_HIT = getSound("block.metal.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_METAL_PLACE = getSound("block.metal.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_METAL_STEP = getSound("block.metal.step");

    /**
     * @since 1.13
     */
    Sound BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF = getSound("block.metal_pressure_plate.click_off");

    /**
     * @since 1.13
     */
    Sound BLOCK_METAL_PRESSURE_PLATE_CLICK_ON = getSound("block.metal_pressure_plate.click_on");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_BREAK = getSound("block.moss.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_FALL = getSound("block.moss.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_HIT = getSound("block.moss.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_PLACE = getSound("block.moss.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_STEP = getSound("block.moss.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_CARPET_BREAK = getSound("block.moss_carpet.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_CARPET_FALL = getSound("block.moss_carpet.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_CARPET_HIT = getSound("block.moss_carpet.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_CARPET_PLACE = getSound("block.moss_carpet.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_MOSS_CARPET_STEP = getSound("block.moss_carpet.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_BREAK = getSound("block.mud.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_FALL = getSound("block.mud.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_HIT = getSound("block.mud.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_PLACE = getSound("block.mud.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_STEP = getSound("block.mud.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_BRICKS_BREAK = getSound("block.mud_bricks.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_BRICKS_FALL = getSound("block.mud_bricks.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_BRICKS_HIT = getSound("block.mud_bricks.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_BRICKS_PLACE = getSound("block.mud_bricks.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUD_BRICKS_STEP = getSound("block.mud_bricks.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUDDY_MANGROVE_ROOTS_BREAK = getSound("block.muddy_mangrove_roots.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUDDY_MANGROVE_ROOTS_FALL = getSound("block.muddy_mangrove_roots.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUDDY_MANGROVE_ROOTS_HIT = getSound("block.muddy_mangrove_roots.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUDDY_MANGROVE_ROOTS_PLACE = getSound("block.muddy_mangrove_roots.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_MUDDY_MANGROVE_ROOTS_STEP = getSound("block.muddy_mangrove_roots.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_BRICKS_BREAK = getSound("block.nether_bricks.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_BRICKS_FALL = getSound("block.nether_bricks.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_BRICKS_HIT = getSound("block.nether_bricks.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_BRICKS_PLACE = getSound("block.nether_bricks.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_BRICKS_STEP = getSound("block.nether_bricks.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_GOLD_ORE_BREAK = getSound("block.nether_gold_ore.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_GOLD_ORE_FALL = getSound("block.nether_gold_ore.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_GOLD_ORE_HIT = getSound("block.nether_gold_ore.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_GOLD_ORE_PLACE = getSound("block.nether_gold_ore.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_GOLD_ORE_STEP = getSound("block.nether_gold_ore.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_ORE_BREAK = getSound("block.nether_ore.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_ORE_FALL = getSound("block.nether_ore.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_ORE_HIT = getSound("block.nether_ore.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_ORE_PLACE = getSound("block.nether_ore.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_ORE_STEP = getSound("block.nether_ore.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_SPROUTS_BREAK = getSound("block.nether_sprouts.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_SPROUTS_FALL = getSound("block.nether_sprouts.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_SPROUTS_HIT = getSound("block.nether_sprouts.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_SPROUTS_PLACE = getSound("block.nether_sprouts.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHER_SPROUTS_STEP = getSound("block.nether_sprouts.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_NETHER_WART_BREAK = getSound("block.nether_wart.break");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_BREAK = getSound("block.nether_wood.break");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_FALL = getSound("block.nether_wood.fall");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_HIT = getSound("block.nether_wood.hit");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_PLACE = getSound("block.nether_wood.place");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_STEP = getSound("block.nether_wood.step");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF = getSound("block.nether_wood_button.click_off");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_BUTTON_CLICK_ON = getSound("block.nether_wood_button.click_on");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_DOOR_CLOSE = getSound("block.nether_wood_door.close");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_DOOR_OPEN = getSound("block.nether_wood_door.open");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_FENCE_GATE_CLOSE = getSound("block.nether_wood_fence_gate.close");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_FENCE_GATE_OPEN = getSound("block.nether_wood_fence_gate.open");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_HANGING_SIGN_BREAK = getSound("block.nether_wood_hanging_sign.break");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_HANGING_SIGN_FALL = getSound("block.nether_wood_hanging_sign.fall");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_HANGING_SIGN_HIT = getSound("block.nether_wood_hanging_sign.hit");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_HANGING_SIGN_PLACE = getSound("block.nether_wood_hanging_sign.place");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_HANGING_SIGN_STEP = getSound("block.nether_wood_hanging_sign.step");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF = getSound("block.nether_wood_pressure_plate.click_off");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON = getSound("block.nether_wood_pressure_plate.click_on");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE = getSound("block.nether_wood_trapdoor.close");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NETHER_WOOD_TRAPDOOR_OPEN = getSound("block.nether_wood_trapdoor.open");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERITE_BLOCK_BREAK = getSound("block.netherite_block.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERITE_BLOCK_FALL = getSound("block.netherite_block.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERITE_BLOCK_HIT = getSound("block.netherite_block.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERITE_BLOCK_PLACE = getSound("block.netherite_block.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERITE_BLOCK_STEP = getSound("block.netherite_block.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERRACK_BREAK = getSound("block.netherrack.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERRACK_FALL = getSound("block.netherrack.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERRACK_HIT = getSound("block.netherrack.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERRACK_PLACE = getSound("block.netherrack.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NETHERRACK_STEP = getSound("block.netherrack.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_NOTE_BLOCK_BANJO = getSound("block.note_block.banjo");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_BASEDRUM = getSound("block.note_block.basedrum");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_BASS = getSound("block.note_block.bass");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_BELL = getSound("block.note_block.bell");

    /**
     * @since 1.14
     */
    Sound BLOCK_NOTE_BLOCK_BIT = getSound("block.note_block.bit");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_CHIME = getSound("block.note_block.chime");

    /**
     * @since 1.14
     */
    Sound BLOCK_NOTE_BLOCK_COW_BELL = getSound("block.note_block.cow_bell");

    /**
     * @since 1.14
     */
    Sound BLOCK_NOTE_BLOCK_DIDGERIDOO = getSound("block.note_block.didgeridoo");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_FLUTE = getSound("block.note_block.flute");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_GUITAR = getSound("block.note_block.guitar");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_HARP = getSound("block.note_block.harp");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_HAT = getSound("block.note_block.hat");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NOTE_BLOCK_IMITATE_CREEPER = getSound("block.note_block.imitate.creeper");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NOTE_BLOCK_IMITATE_ENDER_DRAGON = getSound("block.note_block.imitate.ender_dragon");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NOTE_BLOCK_IMITATE_PIGLIN = getSound("block.note_block.imitate.piglin");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NOTE_BLOCK_IMITATE_SKELETON = getSound("block.note_block.imitate.skeleton");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NOTE_BLOCK_IMITATE_WITHER_SKELETON = getSound("block.note_block.imitate.wither_skeleton");

    /**
     * @since 1.19.3
     */
    Sound BLOCK_NOTE_BLOCK_IMITATE_ZOMBIE = getSound("block.note_block.imitate.zombie");

    /**
     * @since 1.14
     */
    Sound BLOCK_NOTE_BLOCK_IRON_XYLOPHONE = getSound("block.note_block.iron_xylophone");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_PLING = getSound("block.note_block.pling");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_SNARE = getSound("block.note_block.snare");

    /**
     * @since 26.2
     */
    Sound BLOCK_NOTE_BLOCK_TRUMPET = getSound("block.note_block.trumpet");

    /**
     * @since 26.2
     */
    Sound BLOCK_NOTE_BLOCK_TRUMPET_EXPOSED = getSound("block.note_block.trumpet_exposed");

    /**
     * @since 26.2
     */
    Sound BLOCK_NOTE_BLOCK_TRUMPET_OXIDIZED = getSound("block.note_block.trumpet_oxidized");

    /**
     * @since 26.2
     */
    Sound BLOCK_NOTE_BLOCK_TRUMPET_WEATHERED = getSound("block.note_block.trumpet_weathered");

    /**
     * @since 1.13
     */
    Sound BLOCK_NOTE_BLOCK_XYLOPHONE = getSound("block.note_block.xylophone");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NYLIUM_BREAK = getSound("block.nylium.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NYLIUM_FALL = getSound("block.nylium.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NYLIUM_HIT = getSound("block.nylium.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NYLIUM_PLACE = getSound("block.nylium.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_NYLIUM_STEP = getSound("block.nylium.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_PACKED_MUD_BREAK = getSound("block.packed_mud.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_PACKED_MUD_FALL = getSound("block.packed_mud.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_PACKED_MUD_HIT = getSound("block.packed_mud.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_PACKED_MUD_PLACE = getSound("block.packed_mud.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_PACKED_MUD_STEP = getSound("block.packed_mud.step");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_PALE_HANGING_MOSS_IDLE = getSound("block.pale_hanging_moss.idle");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_PINK_PETALS_BREAK = getSound("block.pink_petals.break");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_PINK_PETALS_FALL = getSound("block.pink_petals.fall");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_PINK_PETALS_HIT = getSound("block.pink_petals.hit");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_PINK_PETALS_PLACE = getSound("block.pink_petals.place");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_PINK_PETALS_STEP = getSound("block.pink_petals.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_PISTON_CONTRACT = getSound("block.piston.contract");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_PISTON_EXTEND = getSound("block.piston.extend");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_BREAK = getSound("block.pointed_dripstone.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_DRIP_LAVA = getSound("block.pointed_dripstone.drip_lava");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_DRIP_LAVA_INTO_CAULDRON = getSound("block.pointed_dripstone.drip_lava_into_cauldron");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_DRIP_WATER = getSound("block.pointed_dripstone.drip_water");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_DRIP_WATER_INTO_CAULDRON = getSound("block.pointed_dripstone.drip_water_into_cauldron");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_FALL = getSound("block.pointed_dripstone.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_HIT = getSound("block.pointed_dripstone.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_LAND = getSound("block.pointed_dripstone.land");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_PLACE = getSound("block.pointed_dripstone.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_POINTED_DRIPSTONE_STEP = getSound("block.pointed_dripstone.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_POLISHED_DEEPSLATE_BREAK = getSound("block.polished_deepslate.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_POLISHED_DEEPSLATE_FALL = getSound("block.polished_deepslate.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_POLISHED_DEEPSLATE_HIT = getSound("block.polished_deepslate.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_POLISHED_DEEPSLATE_PLACE = getSound("block.polished_deepslate.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_POLISHED_DEEPSLATE_STEP = getSound("block.polished_deepslate.step");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_POLISHED_TUFF_BREAK = getSound("block.polished_tuff.break");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_POLISHED_TUFF_FALL = getSound("block.polished_tuff.fall");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_POLISHED_TUFF_HIT = getSound("block.polished_tuff.hit");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_POLISHED_TUFF_PLACE = getSound("block.polished_tuff.place");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_POLISHED_TUFF_STEP = getSound("block.polished_tuff.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_PORTAL_AMBIENT = getSound("block.portal.ambient");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_PORTAL_TRAVEL = getSound("block.portal.travel");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_PORTAL_TRIGGER = getSound("block.portal.trigger");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_BREAK = getSound("block.potent_sulfur.break");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_FALL = getSound("block.potent_sulfur.fall");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_GEYSER_CONTINUOUS_ERUPTION = getSound("block.potent_sulfur.geyser_continuous_eruption");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_GEYSER_CONTINUOUS_ERUPTION_ACTIVE = getSound("block.potent_sulfur.geyser_continuous_eruption_active");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_GEYSER_ERUPTION = getSound("block.potent_sulfur.geyser_eruption");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_GEYSER_ERUPTION_ACTIVE = getSound("block.potent_sulfur.geyser_eruption_active");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_HIT = getSound("block.potent_sulfur.hit");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_NOXIOUS_GAS = getSound("block.potent_sulfur.noxious_gas");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_PLACE = getSound("block.potent_sulfur.place");

    /**
     * @since 26.2
     */
    Sound BLOCK_POTENT_SULFUR_STEP = getSound("block.potent_sulfur.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_POWDER_SNOW_BREAK = getSound("block.powder_snow.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_POWDER_SNOW_FALL = getSound("block.powder_snow.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_POWDER_SNOW_HIT = getSound("block.powder_snow.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_POWDER_SNOW_PLACE = getSound("block.powder_snow.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_POWDER_SNOW_STEP = getSound("block.powder_snow.step");

    /**
     * @since 1.13
     */
    Sound BLOCK_PUMPKIN_CARVE = getSound("block.pumpkin.carve");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_REDSTONE_TORCH_BURNOUT = getSound("block.redstone_torch.burnout");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_BREAK = getSound("block.resin.break");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_FALL = getSound("block.resin.fall");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_PLACE = getSound("block.resin.place");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_STEP = getSound("block.resin.step");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_BRICKS_BREAK = getSound("block.resin_bricks.break");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_BRICKS_FALL = getSound("block.resin_bricks.fall");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_BRICKS_HIT = getSound("block.resin_bricks.hit");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_BRICKS_PLACE = getSound("block.resin_bricks.place");

    /**
     * @since 1.21.4
     */
    Sound BLOCK_RESIN_BRICKS_STEP = getSound("block.resin_bricks.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_RESPAWN_ANCHOR_AMBIENT = getSound("block.respawn_anchor.ambient");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_RESPAWN_ANCHOR_CHARGE = getSound("block.respawn_anchor.charge");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_RESPAWN_ANCHOR_DEPLETE = getSound("block.respawn_anchor.deplete");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_RESPAWN_ANCHOR_SET_SPAWN = getSound("block.respawn_anchor.set_spawn");

    /**
     * @since 1.17
     */
    Sound BLOCK_ROOTED_DIRT_BREAK = getSound("block.rooted_dirt.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_ROOTED_DIRT_FALL = getSound("block.rooted_dirt.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_ROOTED_DIRT_HIT = getSound("block.rooted_dirt.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_ROOTED_DIRT_PLACE = getSound("block.rooted_dirt.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_ROOTED_DIRT_STEP = getSound("block.rooted_dirt.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ROOTS_BREAK = getSound("block.roots.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ROOTS_FALL = getSound("block.roots.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ROOTS_HIT = getSound("block.roots.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ROOTS_PLACE = getSound("block.roots.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_ROOTS_STEP = getSound("block.roots.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SAND_BREAK = getSound("block.sand.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SAND_FALL = getSound("block.sand.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SAND_HIT = getSound("block.sand.hit");

    /**
     * @since 1.21.6
     */
    Sound BLOCK_SAND_IDLE = getSound("block.sand.idle");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SAND_PLACE = getSound("block.sand.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SAND_STEP = getSound("block.sand.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_SCAFFOLDING_BREAK = getSound("block.scaffolding.break");

    /**
     * @since 1.14
     */
    Sound BLOCK_SCAFFOLDING_FALL = getSound("block.scaffolding.fall");

    /**
     * @since 1.14
     */
    Sound BLOCK_SCAFFOLDING_HIT = getSound("block.scaffolding.hit");

    /**
     * @since 1.14
     */
    Sound BLOCK_SCAFFOLDING_PLACE = getSound("block.scaffolding.place");

    /**
     * @since 1.14
     */
    Sound BLOCK_SCAFFOLDING_STEP = getSound("block.scaffolding.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_BREAK = getSound("block.sculk.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_CHARGE = getSound("block.sculk.charge");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_FALL = getSound("block.sculk.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_HIT = getSound("block.sculk.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_PLACE = getSound("block.sculk.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_SPREAD = getSound("block.sculk.spread");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_STEP = getSound("block.sculk.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_CATALYST_BLOOM = getSound("block.sculk_catalyst.bloom");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_CATALYST_BREAK = getSound("block.sculk_catalyst.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_CATALYST_FALL = getSound("block.sculk_catalyst.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_CATALYST_HIT = getSound("block.sculk_catalyst.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_CATALYST_PLACE = getSound("block.sculk_catalyst.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_CATALYST_STEP = getSound("block.sculk_catalyst.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_SCULK_SENSOR_BREAK = getSound("block.sculk_sensor.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_SCULK_SENSOR_CLICKING = getSound("block.sculk_sensor.clicking");

    /**
     * @since 1.17
     */
    Sound BLOCK_SCULK_SENSOR_CLICKING_STOP = getSound("block.sculk_sensor.clicking_stop");

    /**
     * @since 1.17
     */
    Sound BLOCK_SCULK_SENSOR_FALL = getSound("block.sculk_sensor.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_SCULK_SENSOR_HIT = getSound("block.sculk_sensor.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_SCULK_SENSOR_PLACE = getSound("block.sculk_sensor.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_SCULK_SENSOR_STEP = getSound("block.sculk_sensor.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_SHRIEKER_BREAK = getSound("block.sculk_shrieker.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_SHRIEKER_FALL = getSound("block.sculk_shrieker.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_SHRIEKER_HIT = getSound("block.sculk_shrieker.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_SHRIEKER_PLACE = getSound("block.sculk_shrieker.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_SHRIEKER_SHRIEK = getSound("block.sculk_shrieker.shriek");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_SHRIEKER_STEP = getSound("block.sculk_shrieker.step");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_VEIN_BREAK = getSound("block.sculk_vein.break");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_VEIN_FALL = getSound("block.sculk_vein.fall");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_VEIN_HIT = getSound("block.sculk_vein.hit");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_VEIN_PLACE = getSound("block.sculk_vein.place");

    /**
     * @since 1.19
     */
    Sound BLOCK_SCULK_VEIN_STEP = getSound("block.sculk_vein.step");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_ACTIVATE = getSound("block.shelf.activate");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_BREAK = getSound("block.shelf.break");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_DEACTIVATE = getSound("block.shelf.deactivate");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_FALL = getSound("block.shelf.fall");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_HIT = getSound("block.shelf.hit");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_MULTI_SWAP = getSound("block.shelf.multi_swap");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_PLACE = getSound("block.shelf.place");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_PLACE_ITEM = getSound("block.shelf.place_item");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_SINGLE_SWAP = getSound("block.shelf.single_swap");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_STEP = getSound("block.shelf.step");

    /**
     * @since 1.21.10
     */
    Sound BLOCK_SHELF_TAKE_ITEM = getSound("block.shelf.take_item");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SHROOMLIGHT_BREAK = getSound("block.shroomlight.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SHROOMLIGHT_FALL = getSound("block.shroomlight.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SHROOMLIGHT_HIT = getSound("block.shroomlight.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SHROOMLIGHT_PLACE = getSound("block.shroomlight.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SHROOMLIGHT_STEP = getSound("block.shroomlight.step");

    /**
     * @since 1.11
     */
    Sound BLOCK_SHULKER_BOX_CLOSE = getSound("block.shulker_box.close");

    /**
     * @since 1.11
     */
    Sound BLOCK_SHULKER_BOX_OPEN = getSound("block.shulker_box.open");

    /**
     * @since 1.20
     */
    Sound BLOCK_SIGN_WAXED_INTERACT_FAIL = getSound("block.sign.waxed_interact_fail");

    /**
     * @since 1.13
     */
    Sound BLOCK_SLIME_BLOCK_BREAK = getSound("block.slime_block.break");

    /**
     * @since 1.13
     */
    Sound BLOCK_SLIME_BLOCK_FALL = getSound("block.slime_block.fall");

    /**
     * @since 1.13
     */
    Sound BLOCK_SLIME_BLOCK_HIT = getSound("block.slime_block.hit");

    /**
     * @since 1.13
     */
    Sound BLOCK_SLIME_BLOCK_PLACE = getSound("block.slime_block.place");

    /**
     * @since 1.13
     */
    Sound BLOCK_SLIME_BLOCK_STEP = getSound("block.slime_block.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_SMALL_AMETHYST_BUD_BREAK = getSound("block.small_amethyst_bud.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_SMALL_AMETHYST_BUD_PLACE = getSound("block.small_amethyst_bud.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_SMALL_DRIPLEAF_BREAK = getSound("block.small_dripleaf.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_SMALL_DRIPLEAF_FALL = getSound("block.small_dripleaf.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_SMALL_DRIPLEAF_HIT = getSound("block.small_dripleaf.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_SMALL_DRIPLEAF_PLACE = getSound("block.small_dripleaf.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_SMALL_DRIPLEAF_STEP = getSound("block.small_dripleaf.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SMITHING_TABLE_USE = getSound("block.smithing_table.use");

    /**
     * @since 1.14
     */
    Sound BLOCK_SMOKER_SMOKE = getSound("block.smoker.smoke");

    /**
     * @since 1.20
     */
    Sound BLOCK_SNIFFER_EGG_CRACK = getSound("block.sniffer_egg.crack");

    /**
     * @since 1.20
     */
    Sound BLOCK_SNIFFER_EGG_HATCH = getSound("block.sniffer_egg.hatch");

    /**
     * @since 1.20
     */
    Sound BLOCK_SNIFFER_EGG_PLOP = getSound("block.sniffer_egg.plop");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SNOW_BREAK = getSound("block.snow.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SNOW_FALL = getSound("block.snow.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SNOW_HIT = getSound("block.snow.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SNOW_PLACE = getSound("block.snow.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_SNOW_STEP = getSound("block.snow.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SAND_BREAK = getSound("block.soul_sand.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SAND_FALL = getSound("block.soul_sand.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SAND_HIT = getSound("block.soul_sand.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SAND_PLACE = getSound("block.soul_sand.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SAND_STEP = getSound("block.soul_sand.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SOIL_BREAK = getSound("block.soul_soil.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SOIL_FALL = getSound("block.soul_soil.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SOIL_HIT = getSound("block.soul_soil.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SOIL_PLACE = getSound("block.soul_soil.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_SOUL_SOIL_STEP = getSound("block.soul_soil.step");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_SPAWNER_BREAK = getSound("block.spawner.break");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_SPAWNER_FALL = getSound("block.spawner.fall");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_SPAWNER_HIT = getSound("block.spawner.hit");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_SPAWNER_PLACE = getSound("block.spawner.place");

    /**
     * @since 1.21.3
     */
    Sound BLOCK_SPAWNER_STEP = getSound("block.spawner.step");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_SPONGE_ABSORB = getSound("block.sponge.absorb");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_SPONGE_BREAK = getSound("block.sponge.break");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_SPONGE_FALL = getSound("block.sponge.fall");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_SPONGE_HIT = getSound("block.sponge.hit");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_SPONGE_PLACE = getSound("block.sponge.place");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_SPONGE_STEP = getSound("block.sponge.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_SPORE_BLOSSOM_BREAK = getSound("block.spore_blossom.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_SPORE_BLOSSOM_FALL = getSound("block.spore_blossom.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_SPORE_BLOSSOM_HIT = getSound("block.spore_blossom.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_SPORE_BLOSSOM_PLACE = getSound("block.spore_blossom.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_SPORE_BLOSSOM_STEP = getSound("block.spore_blossom.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_STEM_BREAK = getSound("block.stem.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_STEM_FALL = getSound("block.stem.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_STEM_HIT = getSound("block.stem.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_STEM_PLACE = getSound("block.stem.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_STEM_STEP = getSound("block.stem.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_STONE_BREAK = getSound("block.stone.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_STONE_FALL = getSound("block.stone.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_STONE_HIT = getSound("block.stone.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_STONE_PLACE = getSound("block.stone.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_STONE_STEP = getSound("block.stone.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_STONE_BUTTON_CLICK_OFF = getSound("block.stone_button.click_off");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_STONE_BUTTON_CLICK_ON = getSound("block.stone_button.click_on");

    /**
     * @since 1.13
     */
    Sound BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF = getSound("block.stone_pressure_plate.click_off");

    /**
     * @since 1.13
     */
    Sound BLOCK_STONE_PRESSURE_PLATE_CLICK_ON = getSound("block.stone_pressure_plate.click_on");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_BREAK = getSound("block.sulfur.break");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_FALL = getSound("block.sulfur.fall");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_HIT = getSound("block.sulfur.hit");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_PLACE = getSound("block.sulfur.place");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_STEP = getSound("block.sulfur.step");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_SPIKE_BREAK = getSound("block.sulfur_spike.break");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_SPIKE_FALL = getSound("block.sulfur_spike.fall");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_SPIKE_HIT = getSound("block.sulfur_spike.hit");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_SPIKE_LAND = getSound("block.sulfur_spike.land");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_SPIKE_PLACE = getSound("block.sulfur_spike.place");

    /**
     * @since 26.2
     */
    Sound BLOCK_SULFUR_SPIKE_STEP = getSound("block.sulfur_spike.step");

    /**
     * @since 1.20
     */
    Sound BLOCK_SUSPICIOUS_GRAVEL_BREAK = getSound("block.suspicious_gravel.break");

    /**
     * @since 1.20
     */
    Sound BLOCK_SUSPICIOUS_GRAVEL_FALL = getSound("block.suspicious_gravel.fall");

    /**
     * @since 1.20
     */
    Sound BLOCK_SUSPICIOUS_GRAVEL_HIT = getSound("block.suspicious_gravel.hit");

    /**
     * @since 1.20
     */
    Sound BLOCK_SUSPICIOUS_GRAVEL_PLACE = getSound("block.suspicious_gravel.place");

    /**
     * @since 1.20
     */
    Sound BLOCK_SUSPICIOUS_GRAVEL_STEP = getSound("block.suspicious_gravel.step");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_SUSPICIOUS_SAND_BREAK = getSound("block.suspicious_sand.break");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_SUSPICIOUS_SAND_FALL = getSound("block.suspicious_sand.fall");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_SUSPICIOUS_SAND_HIT = getSound("block.suspicious_sand.hit");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_SUSPICIOUS_SAND_PLACE = getSound("block.suspicious_sand.place");

    /**
     * @since 1.19.4
     */
    Sound BLOCK_SUSPICIOUS_SAND_STEP = getSound("block.suspicious_sand.step");

    /**
     * @since 1.14
     */
    Sound BLOCK_SWEET_BERRY_BUSH_BREAK = getSound("block.sweet_berry_bush.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES = getSound("block.sweet_berry_bush.pick_berries");

    /**
     * @since 1.14
     */
    Sound BLOCK_SWEET_BERRY_BUSH_PLACE = getSound("block.sweet_berry_bush.place");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_TRIAL_SPAWNER_ABOUT_TO_SPAWN_ITEM = getSound("block.trial_spawner.about_to_spawn_item");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_AMBIENT = getSound("block.trial_spawner.ambient");

    /**
     * @since 1.21
     */
    Sound BLOCK_TRIAL_SPAWNER_AMBIENT_OMINOUS = getSound("block.trial_spawner.ambient_ominous");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_BREAK = getSound("block.trial_spawner.break");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_CLOSE_SHUTTER = getSound("block.trial_spawner.close_shutter");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_DETECT_PLAYER = getSound("block.trial_spawner.detect_player");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_EJECT_ITEM = getSound("block.trial_spawner.eject_item");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_FALL = getSound("block.trial_spawner.fall");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_HIT = getSound("block.trial_spawner.hit");

    /**
     * @since 1.21
     */
    Sound BLOCK_TRIAL_SPAWNER_OMINOUS_ACTIVATE = getSound("block.trial_spawner.ominous_activate");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_OPEN_SHUTTER = getSound("block.trial_spawner.open_shutter");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_PLACE = getSound("block.trial_spawner.place");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_TRIAL_SPAWNER_SPAWN_ITEM = getSound("block.trial_spawner.spawn_item");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_TRIAL_SPAWNER_SPAWN_ITEM_BEGIN = getSound("block.trial_spawner.spawn_item_begin");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_SPAWN_MOB = getSound("block.trial_spawner.spawn_mob");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TRIAL_SPAWNER_STEP = getSound("block.trial_spawner.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_TRIPWIRE_ATTACH = getSound("block.tripwire.attach");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_TRIPWIRE_CLICK_OFF = getSound("block.tripwire.click_off");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_TRIPWIRE_CLICK_ON = getSound("block.tripwire.click_on");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_TRIPWIRE_DETACH = getSound("block.tripwire.detach");

    /**
     * @since 1.17
     */
    Sound BLOCK_TUFF_BREAK = getSound("block.tuff.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_TUFF_FALL = getSound("block.tuff.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_TUFF_HIT = getSound("block.tuff.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_TUFF_PLACE = getSound("block.tuff.place");

    /**
     * @since 1.17
     */
    Sound BLOCK_TUFF_STEP = getSound("block.tuff.step");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TUFF_BRICKS_BREAK = getSound("block.tuff_bricks.break");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TUFF_BRICKS_FALL = getSound("block.tuff_bricks.fall");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TUFF_BRICKS_HIT = getSound("block.tuff_bricks.hit");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TUFF_BRICKS_PLACE = getSound("block.tuff_bricks.place");

    /**
     * @since 1.20.4
     */
    Sound BLOCK_TUFF_BRICKS_STEP = getSound("block.tuff_bricks.step");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_ACTIVATE = getSound("block.vault.activate");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_AMBIENT = getSound("block.vault.ambient");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_BREAK = getSound("block.vault.break");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_CLOSE_SHUTTER = getSound("block.vault.close_shutter");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_DEACTIVATE = getSound("block.vault.deactivate");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_EJECT_ITEM = getSound("block.vault.eject_item");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_FALL = getSound("block.vault.fall");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_HIT = getSound("block.vault.hit");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_INSERT_ITEM = getSound("block.vault.insert_item");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_INSERT_ITEM_FAIL = getSound("block.vault.insert_item_fail");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_OPEN_SHUTTER = getSound("block.vault.open_shutter");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_PLACE = getSound("block.vault.place");

    /**
     * @since 1.21
     */
    Sound BLOCK_VAULT_REJECT_REWARDED_PLAYER = getSound("block.vault.reject_rewarded_player");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_VAULT_STEP = getSound("block.vault.step");

    /**
     * @since 1.17
     */
    Sound BLOCK_VINE_BREAK = getSound("block.vine.break");

    /**
     * @since 1.17
     */
    Sound BLOCK_VINE_FALL = getSound("block.vine.fall");

    /**
     * @since 1.17
     */
    Sound BLOCK_VINE_HIT = getSound("block.vine.hit");

    /**
     * @since 1.17
     */
    Sound BLOCK_VINE_PLACE = getSound("block.vine.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_VINE_STEP = getSound("block.vine.step");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WART_BLOCK_BREAK = getSound("block.wart_block.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WART_BLOCK_FALL = getSound("block.wart_block.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WART_BLOCK_HIT = getSound("block.wart_block.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WART_BLOCK_PLACE = getSound("block.wart_block.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WART_BLOCK_STEP = getSound("block.wart_block.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WATER_AMBIENT = getSound("block.water.ambient");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WEEPING_VINES_BREAK = getSound("block.weeping_vines.break");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WEEPING_VINES_FALL = getSound("block.weeping_vines.fall");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WEEPING_VINES_HIT = getSound("block.weeping_vines.hit");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WEEPING_VINES_PLACE = getSound("block.weeping_vines.place");

    /**
     * @since 1.16.1
     */
    Sound BLOCK_WEEPING_VINES_STEP = getSound("block.weeping_vines.step");

    /**
     * @since 1.13
     */
    Sound BLOCK_WET_GRASS_BREAK = getSound("block.wet_grass.break");

    /**
     * @since 1.13
     */
    Sound BLOCK_WET_GRASS_FALL = getSound("block.wet_grass.fall");

    /**
     * @since 1.13
     */
    Sound BLOCK_WET_GRASS_HIT = getSound("block.wet_grass.hit");

    /**
     * @since 1.13
     */
    Sound BLOCK_WET_GRASS_PLACE = getSound("block.wet_grass.place");

    /**
     * @since 1.13
     */
    Sound BLOCK_WET_GRASS_STEP = getSound("block.wet_grass.step");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_WET_SPONGE_BREAK = getSound("block.wet_sponge.break");

    /**
     * @since 1.20.6
     */
    Sound BLOCK_WET_SPONGE_DRIES = getSound("block.wet_sponge.dries");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_WET_SPONGE_FALL = getSound("block.wet_sponge.fall");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_WET_SPONGE_HIT = getSound("block.wet_sponge.hit");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_WET_SPONGE_PLACE = getSound("block.wet_sponge.place");

    /**
     * @since 1.20.2
     */
    Sound BLOCK_WET_SPONGE_STEP = getSound("block.wet_sponge.step");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOOD_BREAK = getSound("block.wood.break");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOOD_FALL = getSound("block.wood.fall");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOOD_HIT = getSound("block.wood.hit");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOOD_PLACE = getSound("block.wood.place");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOOD_STEP = getSound("block.wood.step");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOODEN_BUTTON_CLICK_OFF = getSound("block.wooden_button.click_off");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOODEN_BUTTON_CLICK_ON = getSound("block.wooden_button.click_on");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOODEN_DOOR_CLOSE = getSound("block.wooden_door.close");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOODEN_DOOR_OPEN = getSound("block.wooden_door.open");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF = getSound("block.wooden_pressure_plate.click_off");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON = getSound("block.wooden_pressure_plate.click_on");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOODEN_TRAPDOOR_CLOSE = getSound("block.wooden_trapdoor.close");

    /**
     * @since 1.9.4
     */
    Sound BLOCK_WOODEN_TRAPDOOR_OPEN = getSound("block.wooden_trapdoor.open");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOOL_BREAK = getSound("block.wool.break");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOOL_FALL = getSound("block.wool.fall");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOOL_HIT = getSound("block.wool.hit");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOOL_PLACE = getSound("block.wool.place");

    /**
     * @since 1.13
     */
    Sound BLOCK_WOOL_STEP = getSound("block.wool.step");

    /**
     * @since 1.9.4
     */
    Sound ENCHANT_THORNS_HIT = getSound("enchant.thorns.hit");

    /**
     * @since 1.19
     */
    Sound ENTITY_ALLAY_AMBIENT_WITH_ITEM = getSound("entity.allay.ambient_with_item");

    /**
     * @since 1.19
     */
    Sound ENTITY_ALLAY_AMBIENT_WITHOUT_ITEM = getSound("entity.allay.ambient_without_item");

    /**
     * @since 1.19
     */
    Sound ENTITY_ALLAY_DEATH = getSound("entity.allay.death");

    /**
     * @since 1.19
     */
    Sound ENTITY_ALLAY_HURT = getSound("entity.allay.hurt");

    /**
     * @since 1.19
     */
    Sound ENTITY_ALLAY_ITEM_GIVEN = getSound("entity.allay.item_given");

    /**
     * @since 1.19
     */
    Sound ENTITY_ALLAY_ITEM_TAKEN = getSound("entity.allay.item_taken");

    /**
     * @since 1.19
     */
    Sound ENTITY_ALLAY_ITEM_THROWN = getSound("entity.allay.item_thrown");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_AMBIENT = getSound("entity.armadillo.ambient");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_BRUSH = getSound("entity.armadillo.brush");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_DEATH = getSound("entity.armadillo.death");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_EAT = getSound("entity.armadillo.eat");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_HURT = getSound("entity.armadillo.hurt");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_HURT_REDUCED = getSound("entity.armadillo.hurt_reduced");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_LAND = getSound("entity.armadillo.land");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_PEEK = getSound("entity.armadillo.peek");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_ROLL = getSound("entity.armadillo.roll");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_SCUTE_DROP = getSound("entity.armadillo.scute_drop");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_STEP = getSound("entity.armadillo.step");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_UNROLL_FINISH = getSound("entity.armadillo.unroll_finish");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_ARMADILLO_UNROLL_START = getSound("entity.armadillo.unroll_start");

    /**
     * @since 1.13
     */
    Sound ENTITY_ARMOR_STAND_BREAK = getSound("entity.armor_stand.break");

    /**
     * @since 1.13
     */
    Sound ENTITY_ARMOR_STAND_FALL = getSound("entity.armor_stand.fall");

    /**
     * @since 1.13
     */
    Sound ENTITY_ARMOR_STAND_HIT = getSound("entity.armor_stand.hit");

    /**
     * @since 1.13
     */
    Sound ENTITY_ARMOR_STAND_PLACE = getSound("entity.armor_stand.place");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ARROW_HIT = getSound("entity.arrow.hit");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ARROW_HIT_PLAYER = getSound("entity.arrow.hit_player");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ARROW_SHOOT = getSound("entity.arrow.shoot");

    /**
     * @since 1.17
     */
    Sound ENTITY_AXOLOTL_ATTACK = getSound("entity.axolotl.attack");

    /**
     * @since 1.17
     */
    Sound ENTITY_AXOLOTL_DEATH = getSound("entity.axolotl.death");

    /**
     * @since 1.17
     */
    Sound ENTITY_AXOLOTL_HURT = getSound("entity.axolotl.hurt");

    /**
     * @since 1.17
     */
    Sound ENTITY_AXOLOTL_IDLE_AIR = getSound("entity.axolotl.idle_air");

    /**
     * @since 1.17
     */
    Sound ENTITY_AXOLOTL_IDLE_WATER = getSound("entity.axolotl.idle_water");

    /**
     * @since 1.17
     */
    Sound ENTITY_AXOLOTL_SPLASH = getSound("entity.axolotl.splash");

    /**
     * @since 1.17
     */
    Sound ENTITY_AXOLOTL_SWIM = getSound("entity.axolotl.swim");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_AMBIENT = getSound("entity.baby_cat.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_BEG_FOR_FOOD = getSound("entity.baby_cat.beg_for_food");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_DEATH = getSound("entity.baby_cat.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_EAT = getSound("entity.baby_cat.eat");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_HISS = getSound("entity.baby_cat.hiss");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_HURT = getSound("entity.baby_cat.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_PURR = getSound("entity.baby_cat.purr");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_PURREOW = getSound("entity.baby_cat.purreow");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CAT_STRAY_AMBIENT = getSound("entity.baby_cat.stray_ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CHICKEN_AMBIENT = getSound("entity.baby_chicken.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CHICKEN_DEATH = getSound("entity.baby_chicken.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CHICKEN_HURT = getSound("entity.baby_chicken.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_CHICKEN_STEP = getSound("entity.baby_chicken.step");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_HORSE_AMBIENT = getSound("entity.baby_horse.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_HORSE_ANGRY = getSound("entity.baby_horse.angry");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_HORSE_BREATHE = getSound("entity.baby_horse.breathe");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_HORSE_DEATH = getSound("entity.baby_horse.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_HORSE_EAT = getSound("entity.baby_horse.eat");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_HORSE_HURT = getSound("entity.baby_horse.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_HORSE_LAND = getSound("entity.baby_horse.land");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_HORSE_STEP = getSound("entity.baby_horse.step");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_BABY_NAUTILUS_AMBIENT = getSound("entity.baby_nautilus.ambient");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_BABY_NAUTILUS_AMBIENT_LAND = getSound("entity.baby_nautilus.ambient_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_BABY_NAUTILUS_DEATH = getSound("entity.baby_nautilus.death");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_BABY_NAUTILUS_DEATH_LAND = getSound("entity.baby_nautilus.death_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_BABY_NAUTILUS_EAT = getSound("entity.baby_nautilus.eat");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_BABY_NAUTILUS_HURT = getSound("entity.baby_nautilus.hurt");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_BABY_NAUTILUS_HURT_LAND = getSound("entity.baby_nautilus.hurt_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_BABY_NAUTILUS_SWIM = getSound("entity.baby_nautilus.swim");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_PIG_AMBIENT = getSound("entity.baby_pig.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_PIG_DEATH = getSound("entity.baby_pig.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_PIG_EAT = getSound("entity.baby_pig.eat");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_PIG_HURT = getSound("entity.baby_pig.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_PIG_STEP = getSound("entity.baby_pig.step");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_WOLF_AMBIENT = getSound("entity.baby_wolf.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_WOLF_DEATH = getSound("entity.baby_wolf.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_WOLF_GROWL = getSound("entity.baby_wolf.growl");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_WOLF_HURT = getSound("entity.baby_wolf.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_WOLF_PANT = getSound("entity.baby_wolf.pant");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_WOLF_STEP = getSound("entity.baby_wolf.step");

    /**
     * @since 26.2
     */
    Sound ENTITY_BABY_WOLF_WHINE = getSound("entity.baby_wolf.whine");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BAT_AMBIENT = getSound("entity.bat.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BAT_DEATH = getSound("entity.bat.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BAT_HURT = getSound("entity.bat.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BAT_LOOP = getSound("entity.bat.loop");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BAT_TAKEOFF = getSound("entity.bat.takeoff");

    /**
     * @since 1.15
     */
    Sound ENTITY_BEE_DEATH = getSound("entity.bee.death");

    /**
     * @since 1.15
     */
    Sound ENTITY_BEE_HURT = getSound("entity.bee.hurt");

    /**
     * @since 1.15
     */
    Sound ENTITY_BEE_LOOP = getSound("entity.bee.loop");

    /**
     * @since 1.15
     */
    Sound ENTITY_BEE_LOOP_AGGRESSIVE = getSound("entity.bee.loop_aggressive");

    /**
     * @since 1.15
     */
    Sound ENTITY_BEE_POLLINATE = getSound("entity.bee.pollinate");

    /**
     * @since 1.15
     */
    Sound ENTITY_BEE_STING = getSound("entity.bee.sting");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BLAZE_AMBIENT = getSound("entity.blaze.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BLAZE_BURN = getSound("entity.blaze.burn");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BLAZE_DEATH = getSound("entity.blaze.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BLAZE_HURT = getSound("entity.blaze.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_BLAZE_SHOOT = getSound("entity.blaze.shoot");

    /**
     * @since 1.12
     */
    Sound ENTITY_BOAT_PADDLE_LAND = getSound("entity.boat.paddle_land");

    /**
     * @since 1.12
     */
    Sound ENTITY_BOAT_PADDLE_WATER = getSound("entity.boat.paddle_water");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BOGGED_AMBIENT = getSound("entity.bogged.ambient");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BOGGED_DEATH = getSound("entity.bogged.death");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BOGGED_HURT = getSound("entity.bogged.hurt");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BOGGED_SHEAR = getSound("entity.bogged.shear");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BOGGED_STEP = getSound("entity.bogged.step");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BREEZE_CHARGE = getSound("entity.breeze.charge");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_DEATH = getSound("entity.breeze.death");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BREEZE_DEFLECT = getSound("entity.breeze.deflect");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_HURT = getSound("entity.breeze.hurt");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_IDLE_AIR = getSound("entity.breeze.idle_air");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_IDLE_GROUND = getSound("entity.breeze.idle_ground");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_INHALE = getSound("entity.breeze.inhale");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_JUMP = getSound("entity.breeze.jump");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_LAND = getSound("entity.breeze.land");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_SHOOT = getSound("entity.breeze.shoot");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_BREEZE_SLIDE = getSound("entity.breeze.slide");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BREEZE_WHIRL = getSound("entity.breeze.whirl");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_BREEZE_WIND_BURST = getSound("entity.breeze.wind_burst");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_AMBIENT = getSound("entity.camel.ambient");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_DASH = getSound("entity.camel.dash");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_DASH_READY = getSound("entity.camel.dash_ready");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_DEATH = getSound("entity.camel.death");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_EAT = getSound("entity.camel.eat");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_HURT = getSound("entity.camel.hurt");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_SADDLE = getSound("entity.camel.saddle");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_SIT = getSound("entity.camel.sit");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_STAND = getSound("entity.camel.stand");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_STEP = getSound("entity.camel.step");

    /**
     * @since 1.19.3
     */
    Sound ENTITY_CAMEL_STEP_SAND = getSound("entity.camel.step_sand");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_AMBIENT = getSound("entity.camel_husk.ambient");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_DASH = getSound("entity.camel_husk.dash");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_DASH_READY = getSound("entity.camel_husk.dash_ready");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_DEATH = getSound("entity.camel_husk.death");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_EAT = getSound("entity.camel_husk.eat");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_HURT = getSound("entity.camel_husk.hurt");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_SADDLE = getSound("entity.camel_husk.saddle");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_SIT = getSound("entity.camel_husk.sit");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_STAND = getSound("entity.camel_husk.stand");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_STEP = getSound("entity.camel_husk.step");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_CAMEL_HUSK_STEP_SAND = getSound("entity.camel_husk.step_sand");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CAT_AMBIENT = getSound("entity.cat.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_CAT_BEG_FOR_FOOD = getSound("entity.cat.beg_for_food");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CAT_DEATH = getSound("entity.cat.death");

    /**
     * @since 1.14
     */
    Sound ENTITY_CAT_EAT = getSound("entity.cat.eat");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CAT_HISS = getSound("entity.cat.hiss");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CAT_HURT = getSound("entity.cat.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CAT_PURR = getSound("entity.cat.purr");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CAT_PURREOW = getSound("entity.cat.purreow");

    /**
     * @since 1.14
     */
    Sound ENTITY_CAT_STRAY_AMBIENT = getSound("entity.cat.stray_ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_AMBIENT = getSound("entity.cat_royal.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_BEG_FOR_FOOD = getSound("entity.cat_royal.beg_for_food");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_DEATH = getSound("entity.cat_royal.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_EAT = getSound("entity.cat_royal.eat");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_HISS = getSound("entity.cat_royal.hiss");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_HURT = getSound("entity.cat_royal.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_PURR = getSound("entity.cat_royal.purr");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_PURREOW = getSound("entity.cat_royal.purreow");

    /**
     * @since 26.2
     */
    Sound ENTITY_CAT_ROYAL_STRAY_AMBIENT = getSound("entity.cat_royal.stray_ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CHICKEN_AMBIENT = getSound("entity.chicken.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CHICKEN_DEATH = getSound("entity.chicken.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CHICKEN_EGG = getSound("entity.chicken.egg");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CHICKEN_HURT = getSound("entity.chicken.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CHICKEN_STEP = getSound("entity.chicken.step");

    /**
     * @since 26.2
     */
    Sound ENTITY_CHICKEN_PICKY_AMBIENT = getSound("entity.chicken_picky.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_CHICKEN_PICKY_DEATH = getSound("entity.chicken_picky.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_CHICKEN_PICKY_HURT = getSound("entity.chicken_picky.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_COD_AMBIENT = getSound("entity.cod.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_COD_DEATH = getSound("entity.cod.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_COD_FLOP = getSound("entity.cod.flop");

    /**
     * @since 1.13
     */
    Sound ENTITY_COD_HURT = getSound("entity.cod.hurt");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_DEATH = getSound("entity.copper_golem.death");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_HURT = getSound("entity.copper_golem.hurt");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_ITEM_DROP = getSound("entity.copper_golem.item_drop");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_ITEM_NO_DROP = getSound("entity.copper_golem.item_no_drop");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_NO_ITEM_GET = getSound("entity.copper_golem.no_item_get");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_NO_ITEM_NO_GET = getSound("entity.copper_golem.no_item_no_get");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_SHEAR = getSound("entity.copper_golem.shear");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_SPAWN = getSound("entity.copper_golem.spawn");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_SPIN = getSound("entity.copper_golem.spin");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_STEP = getSound("entity.copper_golem.step");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_BECOME_STATUE = getSound("entity.copper_golem_become_statue");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_OXIDIZED_DEATH = getSound("entity.copper_golem_oxidized.death");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_OXIDIZED_HURT = getSound("entity.copper_golem_oxidized.hurt");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_OXIDIZED_SPIN = getSound("entity.copper_golem_oxidized.spin");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_OXIDIZED_STEP = getSound("entity.copper_golem_oxidized.step");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_WEATHERED_DEATH = getSound("entity.copper_golem_weathered.death");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_WEATHERED_HURT = getSound("entity.copper_golem_weathered.hurt");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_WEATHERED_SPIN = getSound("entity.copper_golem_weathered.spin");

    /**
     * @since 1.21.10
     */
    Sound ENTITY_COPPER_GOLEM_WEATHERED_STEP = getSound("entity.copper_golem_weathered.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_COW_AMBIENT = getSound("entity.cow.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_COW_DEATH = getSound("entity.cow.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_COW_HURT = getSound("entity.cow.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_COW_MILK = getSound("entity.cow.milk");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_COW_STEP = getSound("entity.cow.step");

    /**
     * @since 26.2
     */
    Sound ENTITY_COW_MOODY_AMBIENT = getSound("entity.cow_moody.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_COW_MOODY_DEATH = getSound("entity.cow_moody.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_COW_MOODY_HURT = getSound("entity.cow_moody.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_COW_MOODY_STEP = getSound("entity.cow_moody.step");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_ACTIVATE = getSound("entity.creaking.activate");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_AMBIENT = getSound("entity.creaking.ambient");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_ATTACK = getSound("entity.creaking.attack");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_DEACTIVATE = getSound("entity.creaking.deactivate");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_DEATH = getSound("entity.creaking.death");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_FREEZE = getSound("entity.creaking.freeze");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_SPAWN = getSound("entity.creaking.spawn");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_STEP = getSound("entity.creaking.step");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_SWAY = getSound("entity.creaking.sway");

    /**
     * @since 1.21.4
     */
    Sound ENTITY_CREAKING_TWITCH = getSound("entity.creaking.twitch");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_CREAKING_UNFREEZE = getSound("entity.creaking.unfreeze");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CREEPER_DEATH = getSound("entity.creeper.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CREEPER_HURT = getSound("entity.creeper.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_CREEPER_PRIMED = getSound("entity.creeper.primed");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_AMBIENT = getSound("entity.dolphin.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_AMBIENT_WATER = getSound("entity.dolphin.ambient_water");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_ATTACK = getSound("entity.dolphin.attack");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_DEATH = getSound("entity.dolphin.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_EAT = getSound("entity.dolphin.eat");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_HURT = getSound("entity.dolphin.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_JUMP = getSound("entity.dolphin.jump");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_PLAY = getSound("entity.dolphin.play");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_SPLASH = getSound("entity.dolphin.splash");

    /**
     * @since 1.13
     */
    Sound ENTITY_DOLPHIN_SWIM = getSound("entity.dolphin.swim");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_DONKEY_AMBIENT = getSound("entity.donkey.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_DONKEY_ANGRY = getSound("entity.donkey.angry");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_DONKEY_CHEST = getSound("entity.donkey.chest");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_DONKEY_DEATH = getSound("entity.donkey.death");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_DONKEY_EAT = getSound("entity.donkey.eat");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_DONKEY_HURT = getSound("entity.donkey.hurt");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_DONKEY_JUMP = getSound("entity.donkey.jump");

    /**
     * @since 1.13
     */
    Sound ENTITY_DRAGON_FIREBALL_EXPLODE = getSound("entity.dragon_fireball.explode");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_AMBIENT = getSound("entity.drowned.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_AMBIENT_WATER = getSound("entity.drowned.ambient_water");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_DEATH = getSound("entity.drowned.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_DEATH_WATER = getSound("entity.drowned.death_water");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_HURT = getSound("entity.drowned.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_HURT_WATER = getSound("entity.drowned.hurt_water");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_SHOOT = getSound("entity.drowned.shoot");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_STEP = getSound("entity.drowned.step");

    /**
     * @since 1.13
     */
    Sound ENTITY_DROWNED_SWIM = getSound("entity.drowned.swim");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_EGG_THROW = getSound("entity.egg.throw");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ELDER_GUARDIAN_AMBIENT = getSound("entity.elder_guardian.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ELDER_GUARDIAN_AMBIENT_LAND = getSound("entity.elder_guardian.ambient_land");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ELDER_GUARDIAN_CURSE = getSound("entity.elder_guardian.curse");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ELDER_GUARDIAN_DEATH = getSound("entity.elder_guardian.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ELDER_GUARDIAN_DEATH_LAND = getSound("entity.elder_guardian.death_land");

    /**
     * @since 1.11
     */
    Sound ENTITY_ELDER_GUARDIAN_FLOP = getSound("entity.elder_guardian.flop");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ELDER_GUARDIAN_HURT = getSound("entity.elder_guardian.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ELDER_GUARDIAN_HURT_LAND = getSound("entity.elder_guardian.hurt_land");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_DRAGON_AMBIENT = getSound("entity.ender_dragon.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_DRAGON_DEATH = getSound("entity.ender_dragon.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_DRAGON_FLAP = getSound("entity.ender_dragon.flap");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_DRAGON_GROWL = getSound("entity.ender_dragon.growl");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_DRAGON_HURT = getSound("entity.ender_dragon.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_DRAGON_SHOOT = getSound("entity.ender_dragon.shoot");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_EYE_DEATH = getSound("entity.ender_eye.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_EYE_LAUNCH = getSound("entity.ender_eye.launch");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDER_PEARL_THROW = getSound("entity.ender_pearl.throw");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDERMAN_AMBIENT = getSound("entity.enderman.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDERMAN_DEATH = getSound("entity.enderman.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDERMAN_HURT = getSound("entity.enderman.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDERMAN_SCREAM = getSound("entity.enderman.scream");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDERMAN_STARE = getSound("entity.enderman.stare");

    /**
     * @since 1.13
     */
    Sound ENTITY_ENDERMAN_TELEPORT = getSound("entity.enderman.teleport");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ENDERMITE_AMBIENT = getSound("entity.endermite.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ENDERMITE_DEATH = getSound("entity.endermite.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ENDERMITE_HURT = getSound("entity.endermite.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ENDERMITE_STEP = getSound("entity.endermite.step");

    /**
     * @since 1.13
     */
    Sound ENTITY_EVOKER_AMBIENT = getSound("entity.evoker.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_EVOKER_CAST_SPELL = getSound("entity.evoker.cast_spell");

    /**
     * @since 1.14
     */
    Sound ENTITY_EVOKER_CELEBRATE = getSound("entity.evoker.celebrate");

    /**
     * @since 1.13
     */
    Sound ENTITY_EVOKER_DEATH = getSound("entity.evoker.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_EVOKER_HURT = getSound("entity.evoker.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_EVOKER_PREPARE_ATTACK = getSound("entity.evoker.prepare_attack");

    /**
     * @since 1.13
     */
    Sound ENTITY_EVOKER_PREPARE_SUMMON = getSound("entity.evoker.prepare_summon");

    /**
     * @since 1.13
     */
    Sound ENTITY_EVOKER_PREPARE_WOLOLO = getSound("entity.evoker.prepare_wololo");

    /**
     * @since 1.13
     */
    Sound ENTITY_EVOKER_FANGS_ATTACK = getSound("entity.evoker_fangs.attack");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_EXPERIENCE_BOTTLE_THROW = getSound("entity.experience_bottle.throw");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_EXPERIENCE_ORB_PICKUP = getSound("entity.experience_orb.pickup");

    /**
     * @since 1.13
     */
    Sound ENTITY_FIREWORK_ROCKET_BLAST = getSound("entity.firework_rocket.blast");

    /**
     * @since 1.13
     */
    Sound ENTITY_FIREWORK_ROCKET_BLAST_FAR = getSound("entity.firework_rocket.blast_far");

    /**
     * @since 1.13
     */
    Sound ENTITY_FIREWORK_ROCKET_LARGE_BLAST = getSound("entity.firework_rocket.large_blast");

    /**
     * @since 1.13
     */
    Sound ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR = getSound("entity.firework_rocket.large_blast_far");

    /**
     * @since 1.13
     */
    Sound ENTITY_FIREWORK_ROCKET_LAUNCH = getSound("entity.firework_rocket.launch");

    /**
     * @since 1.13
     */
    Sound ENTITY_FIREWORK_ROCKET_SHOOT = getSound("entity.firework_rocket.shoot");

    /**
     * @since 1.13
     */
    Sound ENTITY_FIREWORK_ROCKET_TWINKLE = getSound("entity.firework_rocket.twinkle");

    /**
     * @since 1.13
     */
    Sound ENTITY_FIREWORK_ROCKET_TWINKLE_FAR = getSound("entity.firework_rocket.twinkle_far");

    /**
     * @since 1.13
     */
    Sound ENTITY_FISH_SWIM = getSound("entity.fish.swim");

    /**
     * @since 1.13
     */
    Sound ENTITY_FISHING_BOBBER_RETRIEVE = getSound("entity.fishing_bobber.retrieve");

    /**
     * @since 1.13
     */
    Sound ENTITY_FISHING_BOBBER_SPLASH = getSound("entity.fishing_bobber.splash");

    /**
     * @since 1.13
     */
    Sound ENTITY_FISHING_BOBBER_THROW = getSound("entity.fishing_bobber.throw");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_AGGRO = getSound("entity.fox.aggro");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_AMBIENT = getSound("entity.fox.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_BITE = getSound("entity.fox.bite");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_DEATH = getSound("entity.fox.death");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_EAT = getSound("entity.fox.eat");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_HURT = getSound("entity.fox.hurt");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_SCREECH = getSound("entity.fox.screech");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_SLEEP = getSound("entity.fox.sleep");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_SNIFF = getSound("entity.fox.sniff");

    /**
     * @since 1.14
     */
    Sound ENTITY_FOX_SPIT = getSound("entity.fox.spit");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_FOX_TELEPORT = getSound("entity.fox.teleport");

    /**
     * @since 1.19
     */
    Sound ENTITY_FROG_AMBIENT = getSound("entity.frog.ambient");

    /**
     * @since 1.19
     */
    Sound ENTITY_FROG_DEATH = getSound("entity.frog.death");

    /**
     * @since 1.19
     */
    Sound ENTITY_FROG_EAT = getSound("entity.frog.eat");

    /**
     * @since 1.19
     */
    Sound ENTITY_FROG_HURT = getSound("entity.frog.hurt");

    /**
     * @since 1.19
     */
    Sound ENTITY_FROG_LAY_SPAWN = getSound("entity.frog.lay_spawn");

    /**
     * @since 1.19
     */
    Sound ENTITY_FROG_LONG_JUMP = getSound("entity.frog.long_jump");

    /**
     * @since 1.19
     */
    Sound ENTITY_FROG_STEP = getSound("entity.frog.step");

    /**
     * @since 1.19
     */
    Sound ENTITY_FROG_TONGUE = getSound("entity.frog.tongue");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_BIG_FALL = getSound("entity.generic.big_fall");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_BURN = getSound("entity.generic.burn");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_DEATH = getSound("entity.generic.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_DRINK = getSound("entity.generic.drink");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_EAT = getSound("entity.generic.eat");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_EXPLODE = getSound("entity.generic.explode");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_EXTINGUISH_FIRE = getSound("entity.generic.extinguish_fire");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_HURT = getSound("entity.generic.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_SMALL_FALL = getSound("entity.generic.small_fall");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_SPLASH = getSound("entity.generic.splash");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GENERIC_SWIM = getSound("entity.generic.swim");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GHAST_AMBIENT = getSound("entity.ghast.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GHAST_DEATH = getSound("entity.ghast.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GHAST_HURT = getSound("entity.ghast.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GHAST_SCREAM = getSound("entity.ghast.scream");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GHAST_SHOOT = getSound("entity.ghast.shoot");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GHAST_WARN = getSound("entity.ghast.warn");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_GHASTLING_AMBIENT = getSound("entity.ghastling.ambient");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_GHASTLING_DEATH = getSound("entity.ghastling.death");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_GHASTLING_HURT = getSound("entity.ghastling.hurt");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_GHASTLING_SPAWN = getSound("entity.ghastling.spawn");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_ITEM_FRAME_ADD_ITEM = getSound("entity.glow_item_frame.add_item");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_ITEM_FRAME_BREAK = getSound("entity.glow_item_frame.break");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_ITEM_FRAME_PLACE = getSound("entity.glow_item_frame.place");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_ITEM_FRAME_REMOVE_ITEM = getSound("entity.glow_item_frame.remove_item");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_ITEM_FRAME_ROTATE_ITEM = getSound("entity.glow_item_frame.rotate_item");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_SQUID_AMBIENT = getSound("entity.glow_squid.ambient");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_SQUID_DEATH = getSound("entity.glow_squid.death");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_SQUID_HURT = getSound("entity.glow_squid.hurt");

    /**
     * @since 1.17
     */
    Sound ENTITY_GLOW_SQUID_SQUIRT = getSound("entity.glow_squid.squirt");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_AMBIENT = getSound("entity.goat.ambient");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_DEATH = getSound("entity.goat.death");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_EAT = getSound("entity.goat.eat");

    /**
     * @since 1.19
     */
    Sound ENTITY_GOAT_HORN_BREAK = getSound("entity.goat.horn_break");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_HURT = getSound("entity.goat.hurt");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_LONG_JUMP = getSound("entity.goat.long_jump");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_MILK = getSound("entity.goat.milk");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_PREPARE_RAM = getSound("entity.goat.prepare_ram");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_RAM_IMPACT = getSound("entity.goat.ram_impact");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_SCREAMING_AMBIENT = getSound("entity.goat.screaming.ambient");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_SCREAMING_DEATH = getSound("entity.goat.screaming.death");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_SCREAMING_EAT = getSound("entity.goat.screaming.eat");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_SCREAMING_HURT = getSound("entity.goat.screaming.hurt");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_SCREAMING_LONG_JUMP = getSound("entity.goat.screaming.long_jump");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_SCREAMING_MILK = getSound("entity.goat.screaming.milk");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_SCREAMING_PREPARE_RAM = getSound("entity.goat.screaming.prepare_ram");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_SCREAMING_RAM_IMPACT = getSound("entity.goat.screaming.ram_impact");

    /**
     * @since 1.17
     */
    Sound ENTITY_GOAT_STEP = getSound("entity.goat.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GUARDIAN_AMBIENT = getSound("entity.guardian.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GUARDIAN_AMBIENT_LAND = getSound("entity.guardian.ambient_land");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GUARDIAN_ATTACK = getSound("entity.guardian.attack");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GUARDIAN_DEATH = getSound("entity.guardian.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GUARDIAN_DEATH_LAND = getSound("entity.guardian.death_land");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GUARDIAN_FLOP = getSound("entity.guardian.flop");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GUARDIAN_HURT = getSound("entity.guardian.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_GUARDIAN_HURT_LAND = getSound("entity.guardian.hurt_land");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_HAPPY_GHAST_AMBIENT = getSound("entity.happy_ghast.ambient");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_HAPPY_GHAST_DEATH = getSound("entity.happy_ghast.death");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_HAPPY_GHAST_EQUIP = getSound("entity.happy_ghast.equip");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_HAPPY_GHAST_HARNESS_GOGGLES_DOWN = getSound("entity.happy_ghast.harness_goggles_down");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_HAPPY_GHAST_HARNESS_GOGGLES_UP = getSound("entity.happy_ghast.harness_goggles_up");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_HAPPY_GHAST_HURT = getSound("entity.happy_ghast.hurt");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_HAPPY_GHAST_RIDING = getSound("entity.happy_ghast.riding");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_HAPPY_GHAST_UNEQUIP = getSound("entity.happy_ghast.unequip");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_HOGLIN_AMBIENT = getSound("entity.hoglin.ambient");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_HOGLIN_ANGRY = getSound("entity.hoglin.angry");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_HOGLIN_ATTACK = getSound("entity.hoglin.attack");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_HOGLIN_CONVERTED_TO_ZOMBIFIED = getSound("entity.hoglin.converted_to_zombified");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_HOGLIN_DEATH = getSound("entity.hoglin.death");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_HOGLIN_HURT = getSound("entity.hoglin.hurt");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_HOGLIN_RETREAT = getSound("entity.hoglin.retreat");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_HOGLIN_STEP = getSound("entity.hoglin.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_AMBIENT = getSound("entity.horse.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_ANGRY = getSound("entity.horse.angry");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_ARMOR = getSound("entity.horse.armor");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_BREATHE = getSound("entity.horse.breathe");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_DEATH = getSound("entity.horse.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_EAT = getSound("entity.horse.eat");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_GALLOP = getSound("entity.horse.gallop");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_HURT = getSound("entity.horse.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_JUMP = getSound("entity.horse.jump");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_LAND = getSound("entity.horse.land");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_SADDLE = getSound("entity.horse.saddle");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_STEP = getSound("entity.horse.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HORSE_STEP_WOOD = getSound("entity.horse.step_wood");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HOSTILE_BIG_FALL = getSound("entity.hostile.big_fall");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HOSTILE_DEATH = getSound("entity.hostile.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HOSTILE_HURT = getSound("entity.hostile.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HOSTILE_SMALL_FALL = getSound("entity.hostile.small_fall");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HOSTILE_SPLASH = getSound("entity.hostile.splash");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_HOSTILE_SWIM = getSound("entity.hostile.swim");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_HUSK_AMBIENT = getSound("entity.husk.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_HUSK_CONVERTED_TO_ZOMBIE = getSound("entity.husk.converted_to_zombie");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_HUSK_DEATH = getSound("entity.husk.death");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_HUSK_HURT = getSound("entity.husk.hurt");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_HUSK_STEP = getSound("entity.husk.step");

    /**
     * @since 1.13
     */
    Sound ENTITY_ILLUSIONER_AMBIENT = getSound("entity.illusioner.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_ILLUSIONER_CAST_SPELL = getSound("entity.illusioner.cast_spell");

    /**
     * @since 1.13
     */
    Sound ENTITY_ILLUSIONER_DEATH = getSound("entity.illusioner.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_ILLUSIONER_HURT = getSound("entity.illusioner.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_ILLUSIONER_MIRROR_MOVE = getSound("entity.illusioner.mirror_move");

    /**
     * @since 1.13
     */
    Sound ENTITY_ILLUSIONER_PREPARE_BLINDNESS = getSound("entity.illusioner.prepare_blindness");

    /**
     * @since 1.13
     */
    Sound ENTITY_ILLUSIONER_PREPARE_MIRROR = getSound("entity.illusioner.prepare_mirror");

    /**
     * @since 1.13
     */
    Sound ENTITY_IRON_GOLEM_ATTACK = getSound("entity.iron_golem.attack");

    /**
     * @since 1.15
     */
    Sound ENTITY_IRON_GOLEM_DAMAGE = getSound("entity.iron_golem.damage");

    /**
     * @since 1.13
     */
    Sound ENTITY_IRON_GOLEM_DEATH = getSound("entity.iron_golem.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_IRON_GOLEM_HURT = getSound("entity.iron_golem.hurt");

    /**
     * @since 1.15
     */
    Sound ENTITY_IRON_GOLEM_REPAIR = getSound("entity.iron_golem.repair");

    /**
     * @since 1.13
     */
    Sound ENTITY_IRON_GOLEM_STEP = getSound("entity.iron_golem.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ITEM_BREAK = getSound("entity.item.break");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ITEM_PICKUP = getSound("entity.item.pickup");

    /**
     * @since 1.13
     */
    Sound ENTITY_ITEM_FRAME_ADD_ITEM = getSound("entity.item_frame.add_item");

    /**
     * @since 1.13
     */
    Sound ENTITY_ITEM_FRAME_BREAK = getSound("entity.item_frame.break");

    /**
     * @since 1.13
     */
    Sound ENTITY_ITEM_FRAME_PLACE = getSound("entity.item_frame.place");

    /**
     * @since 1.13
     */
    Sound ENTITY_ITEM_FRAME_REMOVE_ITEM = getSound("entity.item_frame.remove_item");

    /**
     * @since 1.13
     */
    Sound ENTITY_ITEM_FRAME_ROTATE_ITEM = getSound("entity.item_frame.rotate_item");

    /**
     * @since 1.13
     */
    Sound ENTITY_LIGHTNING_BOLT_IMPACT = getSound("entity.lightning_bolt.impact");

    /**
     * @since 1.13
     */
    Sound ENTITY_LIGHTNING_BOLT_THUNDER = getSound("entity.lightning_bolt.thunder");

    /**
     * @since 1.13
     */
    Sound ENTITY_LINGERING_POTION_THROW = getSound("entity.lingering_potion.throw");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_AMBIENT = getSound("entity.llama.ambient");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_ANGRY = getSound("entity.llama.angry");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_CHEST = getSound("entity.llama.chest");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_DEATH = getSound("entity.llama.death");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_EAT = getSound("entity.llama.eat");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_HURT = getSound("entity.llama.hurt");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_SPIT = getSound("entity.llama.spit");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_STEP = getSound("entity.llama.step");

    /**
     * @since 1.11
     */
    Sound ENTITY_LLAMA_SWAG = getSound("entity.llama.swag");

    /**
     * @since 1.13
     */
    Sound ENTITY_MAGMA_CUBE_DEATH = getSound("entity.magma_cube.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_MAGMA_CUBE_DEATH_SMALL = getSound("entity.magma_cube.death_small");

    /**
     * @since 1.13
     */
    Sound ENTITY_MAGMA_CUBE_HURT = getSound("entity.magma_cube.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_MAGMA_CUBE_HURT_SMALL = getSound("entity.magma_cube.hurt_small");

    /**
     * @since 1.13
     */
    Sound ENTITY_MAGMA_CUBE_JUMP = getSound("entity.magma_cube.jump");

    /**
     * @since 1.13
     */
    Sound ENTITY_MAGMA_CUBE_SQUISH = getSound("entity.magma_cube.squish");

    /**
     * @since 1.13
     */
    Sound ENTITY_MAGMA_CUBE_SQUISH_SMALL = getSound("entity.magma_cube.squish_small");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_MINECART_INSIDE = getSound("entity.minecart.inside");

    /**
     * @since 1.17
     */
    Sound ENTITY_MINECART_INSIDE_UNDERWATER = getSound("entity.minecart.inside.underwater");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_MINECART_RIDING = getSound("entity.minecart.riding");

    /**
     * @since 1.14
     */
    Sound ENTITY_MOOSHROOM_CONVERT = getSound("entity.mooshroom.convert");

    /**
     * @since 1.14
     */
    Sound ENTITY_MOOSHROOM_EAT = getSound("entity.mooshroom.eat");

    /**
     * @since 1.14
     */
    Sound ENTITY_MOOSHROOM_MILK = getSound("entity.mooshroom.milk");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_MOOSHROOM_SHEAR = getSound("entity.mooshroom.shear");

    /**
     * @since 1.14
     */
    Sound ENTITY_MOOSHROOM_SUSPICIOUS_MILK = getSound("entity.mooshroom.suspicious_milk");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_MULE_AMBIENT = getSound("entity.mule.ambient");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_MULE_ANGRY = getSound("entity.mule.angry");

    /**
     * @since 1.11
     */
    Sound ENTITY_MULE_CHEST = getSound("entity.mule.chest");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_MULE_DEATH = getSound("entity.mule.death");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_MULE_EAT = getSound("entity.mule.eat");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_MULE_HURT = getSound("entity.mule.hurt");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_MULE_JUMP = getSound("entity.mule.jump");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_AMBIENT = getSound("entity.nautilus.ambient");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_AMBIENT_LAND = getSound("entity.nautilus.ambient_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_DASH = getSound("entity.nautilus.dash");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_DASH_LAND = getSound("entity.nautilus.dash_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_DASH_READY = getSound("entity.nautilus.dash_ready");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_DASH_READY_LAND = getSound("entity.nautilus.dash_ready_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_DEATH = getSound("entity.nautilus.death");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_DEATH_LAND = getSound("entity.nautilus.death_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_EAT = getSound("entity.nautilus.eat");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_HURT = getSound("entity.nautilus.hurt");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_HURT_LAND = getSound("entity.nautilus.hurt_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_RIDING = getSound("entity.nautilus.riding");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_NAUTILUS_SWIM = getSound("entity.nautilus.swim");

    /**
     * @since 1.14
     */
    Sound ENTITY_OCELOT_AMBIENT = getSound("entity.ocelot.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_OCELOT_DEATH = getSound("entity.ocelot.death");

    /**
     * @since 1.14
     */
    Sound ENTITY_OCELOT_HURT = getSound("entity.ocelot.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PAINTING_BREAK = getSound("entity.painting.break");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PAINTING_PLACE = getSound("entity.painting.place");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_AGGRESSIVE_AMBIENT = getSound("entity.panda.aggressive_ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_AMBIENT = getSound("entity.panda.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_BITE = getSound("entity.panda.bite");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_CANT_BREED = getSound("entity.panda.cant_breed");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_DEATH = getSound("entity.panda.death");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_EAT = getSound("entity.panda.eat");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_HURT = getSound("entity.panda.hurt");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_PRE_SNEEZE = getSound("entity.panda.pre_sneeze");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_SNEEZE = getSound("entity.panda.sneeze");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_STEP = getSound("entity.panda.step");

    /**
     * @since 1.14
     */
    Sound ENTITY_PANDA_WORRIED_AMBIENT = getSound("entity.panda.worried_ambient");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_PARCHED_AMBIENT = getSound("entity.parched.ambient");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_PARCHED_DEATH = getSound("entity.parched.death");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_PARCHED_HURT = getSound("entity.parched.hurt");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_PARCHED_STEP = getSound("entity.parched.step");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_AMBIENT = getSound("entity.parrot.ambient");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_DEATH = getSound("entity.parrot.death");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_EAT = getSound("entity.parrot.eat");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_FLY = getSound("entity.parrot.fly");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_HURT = getSound("entity.parrot.hurt");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_BLAZE = getSound("entity.parrot.imitate.blaze");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_PARROT_IMITATE_BOGGED = getSound("entity.parrot.imitate.bogged");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_PARROT_IMITATE_BREEZE = getSound("entity.parrot.imitate.breeze");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_PARROT_IMITATE_CAMEL_HUSK = getSound("entity.parrot.imitate.camel_husk");

    /**
     * @since 1.21.3
     */
    Sound ENTITY_PARROT_IMITATE_CREAKING = getSound("entity.parrot.imitate.creaking");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_CREEPER = getSound("entity.parrot.imitate.creeper");

    /**
     * @since 1.13
     */
    Sound ENTITY_PARROT_IMITATE_DROWNED = getSound("entity.parrot.imitate.drowned");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_ELDER_GUARDIAN = getSound("entity.parrot.imitate.elder_guardian");

    /**
     * @since 1.13
     */
    Sound ENTITY_PARROT_IMITATE_ENDER_DRAGON = getSound("entity.parrot.imitate.ender_dragon");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_ENDERMITE = getSound("entity.parrot.imitate.endermite");

    /**
     * @since 1.13
     */
    Sound ENTITY_PARROT_IMITATE_EVOKER = getSound("entity.parrot.imitate.evoker");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_GHAST = getSound("entity.parrot.imitate.ghast");

    /**
     * @since 1.14
     */
    Sound ENTITY_PARROT_IMITATE_GUARDIAN = getSound("entity.parrot.imitate.guardian");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PARROT_IMITATE_HOGLIN = getSound("entity.parrot.imitate.hoglin");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_HUSK = getSound("entity.parrot.imitate.husk");

    /**
     * @since 1.13
     */
    Sound ENTITY_PARROT_IMITATE_ILLUSIONER = getSound("entity.parrot.imitate.illusioner");

    /**
     * @since 1.13
     */
    Sound ENTITY_PARROT_IMITATE_MAGMA_CUBE = getSound("entity.parrot.imitate.magma_cube");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_PARROT_IMITATE_PARCHED = getSound("entity.parrot.imitate.parched");

    /**
     * @since 1.13
     */
    Sound ENTITY_PARROT_IMITATE_PHANTOM = getSound("entity.parrot.imitate.phantom");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PARROT_IMITATE_PIGLIN = getSound("entity.parrot.imitate.piglin");

    /**
     * @since 1.16.2
     */
    Sound ENTITY_PARROT_IMITATE_PIGLIN_BRUTE = getSound("entity.parrot.imitate.piglin_brute");

    /**
     * @since 1.14
     */
    Sound ENTITY_PARROT_IMITATE_PILLAGER = getSound("entity.parrot.imitate.pillager");

    /**
     * @since 1.14
     */
    Sound ENTITY_PARROT_IMITATE_RAVAGER = getSound("entity.parrot.imitate.ravager");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_SHULKER = getSound("entity.parrot.imitate.shulker");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_SILVERFISH = getSound("entity.parrot.imitate.silverfish");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_SKELETON = getSound("entity.parrot.imitate.skeleton");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_SLIME = getSound("entity.parrot.imitate.slime");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_SPIDER = getSound("entity.parrot.imitate.spider");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_STRAY = getSound("entity.parrot.imitate.stray");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_VEX = getSound("entity.parrot.imitate.vex");

    /**
     * @since 1.13
     */
    Sound ENTITY_PARROT_IMITATE_VINDICATOR = getSound("entity.parrot.imitate.vindicator");

    /**
     * @since 1.19
     */
    Sound ENTITY_PARROT_IMITATE_WARDEN = getSound("entity.parrot.imitate.warden");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_WITCH = getSound("entity.parrot.imitate.witch");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_WITHER = getSound("entity.parrot.imitate.wither");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_WITHER_SKELETON = getSound("entity.parrot.imitate.wither_skeleton");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PARROT_IMITATE_ZOGLIN = getSound("entity.parrot.imitate.zoglin");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_ZOMBIE = getSound("entity.parrot.imitate.zombie");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_PARROT_IMITATE_ZOMBIE_HORSE = getSound("entity.parrot.imitate.zombie_horse");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_PARROT_IMITATE_ZOMBIE_NAUTILUS = getSound("entity.parrot.imitate.zombie_nautilus");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER = getSound("entity.parrot.imitate.zombie_villager");

    /**
     * @since 1.12
     */
    Sound ENTITY_PARROT_STEP = getSound("entity.parrot.step");

    /**
     * @since 1.13
     */
    Sound ENTITY_PHANTOM_AMBIENT = getSound("entity.phantom.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_PHANTOM_BITE = getSound("entity.phantom.bite");

    /**
     * @since 1.13
     */
    Sound ENTITY_PHANTOM_DEATH = getSound("entity.phantom.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_PHANTOM_FLAP = getSound("entity.phantom.flap");

    /**
     * @since 1.13
     */
    Sound ENTITY_PHANTOM_HURT = getSound("entity.phantom.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_PHANTOM_SWOOP = getSound("entity.phantom.swoop");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PIG_AMBIENT = getSound("entity.pig.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PIG_DEATH = getSound("entity.pig.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_EAT = getSound("entity.pig.eat");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PIG_HURT = getSound("entity.pig.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PIG_SADDLE = getSound("entity.pig.saddle");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PIG_STEP = getSound("entity.pig.step");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_BIG_AMBIENT = getSound("entity.pig_big.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_BIG_DEATH = getSound("entity.pig_big.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_BIG_EAT = getSound("entity.pig_big.eat");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_BIG_HURT = getSound("entity.pig_big.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_MINI_AMBIENT = getSound("entity.pig_mini.ambient");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_MINI_DEATH = getSound("entity.pig_mini.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_MINI_EAT = getSound("entity.pig_mini.eat");

    /**
     * @since 26.2
     */
    Sound ENTITY_PIG_MINI_HURT = getSound("entity.pig_mini.hurt");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_ADMIRING_ITEM = getSound("entity.piglin.admiring_item");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_AMBIENT = getSound("entity.piglin.ambient");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_ANGRY = getSound("entity.piglin.angry");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_CELEBRATE = getSound("entity.piglin.celebrate");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_CONVERTED_TO_ZOMBIFIED = getSound("entity.piglin.converted_to_zombified");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_DEATH = getSound("entity.piglin.death");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_HURT = getSound("entity.piglin.hurt");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_JEALOUS = getSound("entity.piglin.jealous");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_RETREAT = getSound("entity.piglin.retreat");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_PIGLIN_STEP = getSound("entity.piglin.step");

    /**
     * @since 1.16.2
     */
    Sound ENTITY_PIGLIN_BRUTE_AMBIENT = getSound("entity.piglin_brute.ambient");

    /**
     * @since 1.16.2
     */
    Sound ENTITY_PIGLIN_BRUTE_ANGRY = getSound("entity.piglin_brute.angry");

    /**
     * @since 1.16.2
     */
    Sound ENTITY_PIGLIN_BRUTE_CONVERTED_TO_ZOMBIFIED = getSound("entity.piglin_brute.converted_to_zombified");

    /**
     * @since 1.16.2
     */
    Sound ENTITY_PIGLIN_BRUTE_DEATH = getSound("entity.piglin_brute.death");

    /**
     * @since 1.16.2
     */
    Sound ENTITY_PIGLIN_BRUTE_HURT = getSound("entity.piglin_brute.hurt");

    /**
     * @since 1.16.2
     */
    Sound ENTITY_PIGLIN_BRUTE_STEP = getSound("entity.piglin_brute.step");

    /**
     * @since 1.14
     */
    Sound ENTITY_PILLAGER_AMBIENT = getSound("entity.pillager.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_PILLAGER_CELEBRATE = getSound("entity.pillager.celebrate");

    /**
     * @since 1.14
     */
    Sound ENTITY_PILLAGER_DEATH = getSound("entity.pillager.death");

    /**
     * @since 1.14
     */
    Sound ENTITY_PILLAGER_HURT = getSound("entity.pillager.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_ATTACK_CRIT = getSound("entity.player.attack.crit");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_ATTACK_KNOCKBACK = getSound("entity.player.attack.knockback");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_ATTACK_NODAMAGE = getSound("entity.player.attack.nodamage");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_ATTACK_STRONG = getSound("entity.player.attack.strong");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_ATTACK_SWEEP = getSound("entity.player.attack.sweep");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_ATTACK_WEAK = getSound("entity.player.attack.weak");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_BIG_FALL = getSound("entity.player.big_fall");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_BREATH = getSound("entity.player.breath");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_BURP = getSound("entity.player.burp");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_DEATH = getSound("entity.player.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_HURT = getSound("entity.player.hurt");

    /**
     * @since 1.12
     */
    Sound ENTITY_PLAYER_HURT_DROWN = getSound("entity.player.hurt_drown");

    /**
     * @since 1.17
     */
    Sound ENTITY_PLAYER_HURT_FREEZE = getSound("entity.player.hurt_freeze");

    /**
     * @since 1.12
     */
    Sound ENTITY_PLAYER_HURT_ON_FIRE = getSound("entity.player.hurt_on_fire");

    /**
     * @since 1.14
     */
    Sound ENTITY_PLAYER_HURT_SWEET_BERRY_BUSH = getSound("entity.player.hurt_sweet_berry_bush");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_LEVELUP = getSound("entity.player.levelup");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_SMALL_FALL = getSound("entity.player.small_fall");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_SPLASH = getSound("entity.player.splash");

    /**
     * @since 1.13
     */
    Sound ENTITY_PLAYER_SPLASH_HIGH_SPEED = getSound("entity.player.splash.high_speed");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_PLAYER_SWIM = getSound("entity.player.swim");

    /**
     * @since 1.20.4
     */
    Sound ENTITY_PLAYER_TELEPORT = getSound("entity.player.teleport");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_POLAR_BEAR_AMBIENT = getSound("entity.polar_bear.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_POLAR_BEAR_AMBIENT_BABY = getSound("entity.polar_bear.ambient_baby");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_POLAR_BEAR_DEATH = getSound("entity.polar_bear.death");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_POLAR_BEAR_HURT = getSound("entity.polar_bear.hurt");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_POLAR_BEAR_STEP = getSound("entity.polar_bear.step");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_POLAR_BEAR_WARNING = getSound("entity.polar_bear.warning");

    /**
     * @since 1.13
     */
    Sound ENTITY_PUFFER_FISH_BLOW_OUT = getSound("entity.puffer_fish.blow_out");

    /**
     * @since 1.13
     */
    Sound ENTITY_PUFFER_FISH_BLOW_UP = getSound("entity.puffer_fish.blow_up");

    /**
     * @since 1.13
     */
    Sound ENTITY_PUFFER_FISH_DEATH = getSound("entity.puffer_fish.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_PUFFER_FISH_FLOP = getSound("entity.puffer_fish.flop");

    /**
     * @since 1.13
     */
    Sound ENTITY_PUFFER_FISH_HURT = getSound("entity.puffer_fish.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_PUFFER_FISH_STING = getSound("entity.puffer_fish.sting");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_RABBIT_AMBIENT = getSound("entity.rabbit.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_RABBIT_ATTACK = getSound("entity.rabbit.attack");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_RABBIT_DEATH = getSound("entity.rabbit.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_RABBIT_HURT = getSound("entity.rabbit.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_RABBIT_JUMP = getSound("entity.rabbit.jump");

    /**
     * @since 1.14
     */
    Sound ENTITY_RAVAGER_AMBIENT = getSound("entity.ravager.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_RAVAGER_ATTACK = getSound("entity.ravager.attack");

    /**
     * @since 1.14
     */
    Sound ENTITY_RAVAGER_CELEBRATE = getSound("entity.ravager.celebrate");

    /**
     * @since 1.14
     */
    Sound ENTITY_RAVAGER_DEATH = getSound("entity.ravager.death");

    /**
     * @since 1.14
     */
    Sound ENTITY_RAVAGER_HURT = getSound("entity.ravager.hurt");

    /**
     * @since 1.14
     */
    Sound ENTITY_RAVAGER_ROAR = getSound("entity.ravager.roar");

    /**
     * @since 1.14
     */
    Sound ENTITY_RAVAGER_STEP = getSound("entity.ravager.step");

    /**
     * @since 1.14
     */
    Sound ENTITY_RAVAGER_STUNNED = getSound("entity.ravager.stunned");

    /**
     * @since 1.13
     */
    Sound ENTITY_SALMON_AMBIENT = getSound("entity.salmon.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_SALMON_DEATH = getSound("entity.salmon.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_SALMON_FLOP = getSound("entity.salmon.flop");

    /**
     * @since 1.13
     */
    Sound ENTITY_SALMON_HURT = getSound("entity.salmon.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHEEP_AMBIENT = getSound("entity.sheep.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHEEP_DEATH = getSound("entity.sheep.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHEEP_HURT = getSound("entity.sheep.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHEEP_SHEAR = getSound("entity.sheep.shear");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHEEP_STEP = getSound("entity.sheep.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_AMBIENT = getSound("entity.shulker.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_CLOSE = getSound("entity.shulker.close");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_DEATH = getSound("entity.shulker.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_HURT = getSound("entity.shulker.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_HURT_CLOSED = getSound("entity.shulker.hurt_closed");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_OPEN = getSound("entity.shulker.open");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_SHOOT = getSound("entity.shulker.shoot");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_TELEPORT = getSound("entity.shulker.teleport");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_BULLET_HIT = getSound("entity.shulker_bullet.hit");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SHULKER_BULLET_HURT = getSound("entity.shulker_bullet.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SILVERFISH_AMBIENT = getSound("entity.silverfish.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SILVERFISH_DEATH = getSound("entity.silverfish.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SILVERFISH_HURT = getSound("entity.silverfish.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SILVERFISH_STEP = getSound("entity.silverfish.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SKELETON_AMBIENT = getSound("entity.skeleton.ambient");

    /**
     * @since 1.17
     */
    Sound ENTITY_SKELETON_CONVERTED_TO_STRAY = getSound("entity.skeleton.converted_to_stray");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SKELETON_DEATH = getSound("entity.skeleton.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SKELETON_HURT = getSound("entity.skeleton.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SKELETON_SHOOT = getSound("entity.skeleton.shoot");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SKELETON_STEP = getSound("entity.skeleton.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SKELETON_HORSE_AMBIENT = getSound("entity.skeleton_horse.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_SKELETON_HORSE_AMBIENT_WATER = getSound("entity.skeleton_horse.ambient_water");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SKELETON_HORSE_DEATH = getSound("entity.skeleton_horse.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_SKELETON_HORSE_GALLOP_WATER = getSound("entity.skeleton_horse.gallop_water");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SKELETON_HORSE_HURT = getSound("entity.skeleton_horse.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_SKELETON_HORSE_JUMP_WATER = getSound("entity.skeleton_horse.jump_water");

    /**
     * @since 1.13
     */
    Sound ENTITY_SKELETON_HORSE_STEP_WATER = getSound("entity.skeleton_horse.step_water");

    /**
     * @since 1.13
     */
    Sound ENTITY_SKELETON_HORSE_SWIM = getSound("entity.skeleton_horse.swim");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SLIME_ATTACK = getSound("entity.slime.attack");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SLIME_DEATH = getSound("entity.slime.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_SLIME_DEATH_SMALL = getSound("entity.slime.death_small");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SLIME_HURT = getSound("entity.slime.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_SLIME_HURT_SMALL = getSound("entity.slime.hurt_small");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SLIME_JUMP = getSound("entity.slime.jump");

    /**
     * @since 1.13
     */
    Sound ENTITY_SLIME_JUMP_SMALL = getSound("entity.slime.jump_small");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SLIME_SQUISH = getSound("entity.slime.squish");

    /**
     * @since 1.13
     */
    Sound ENTITY_SLIME_SQUISH_SMALL = getSound("entity.slime.squish_small");

    /**
     * @since 26.2
     */
    Sound ENTITY_SMALL_SULFUR_CUBE_DEATH = getSound("entity.small_sulfur_cube.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_SMALL_SULFUR_CUBE_EAT = getSound("entity.small_sulfur_cube.eat");

    /**
     * @since 26.2
     */
    Sound ENTITY_SMALL_SULFUR_CUBE_HURT = getSound("entity.small_sulfur_cube.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_SMALL_SULFUR_CUBE_JUMP = getSound("entity.small_sulfur_cube.jump");

    /**
     * @since 26.2
     */
    Sound ENTITY_SMALL_SULFUR_CUBE_SQUISH = getSound("entity.small_sulfur_cube.squish");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_DEATH = getSound("entity.sniffer.death");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_DIGGING = getSound("entity.sniffer.digging");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_DIGGING_STOP = getSound("entity.sniffer.digging_stop");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_DROP_SEED = getSound("entity.sniffer.drop_seed");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_EAT = getSound("entity.sniffer.eat");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_HAPPY = getSound("entity.sniffer.happy");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_HURT = getSound("entity.sniffer.hurt");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_IDLE = getSound("entity.sniffer.idle");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_SCENTING = getSound("entity.sniffer.scenting");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_SEARCHING = getSound("entity.sniffer.searching");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_SNIFFING = getSound("entity.sniffer.sniffing");

    /**
     * @since 1.19.4
     */
    Sound ENTITY_SNIFFER_STEP = getSound("entity.sniffer.step");

    /**
     * @since 1.13
     */
    Sound ENTITY_SNOW_GOLEM_AMBIENT = getSound("entity.snow_golem.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_SNOW_GOLEM_DEATH = getSound("entity.snow_golem.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_SNOW_GOLEM_HURT = getSound("entity.snow_golem.hurt");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_SNOW_GOLEM_SHEAR = getSound("entity.snow_golem.shear");

    /**
     * @since 1.13
     */
    Sound ENTITY_SNOW_GOLEM_SHOOT = getSound("entity.snow_golem.shoot");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SNOWBALL_THROW = getSound("entity.snowball.throw");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SPIDER_AMBIENT = getSound("entity.spider.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SPIDER_DEATH = getSound("entity.spider.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SPIDER_HURT = getSound("entity.spider.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SPIDER_STEP = getSound("entity.spider.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SPLASH_POTION_BREAK = getSound("entity.splash_potion.break");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SPLASH_POTION_THROW = getSound("entity.splash_potion.throw");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SQUID_AMBIENT = getSound("entity.squid.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SQUID_DEATH = getSound("entity.squid.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_SQUID_HURT = getSound("entity.squid.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_SQUID_SQUIRT = getSound("entity.squid.squirt");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_STRAY_AMBIENT = getSound("entity.stray.ambient");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_STRAY_DEATH = getSound("entity.stray.death");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_STRAY_HURT = getSound("entity.stray.hurt");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_STRAY_STEP = getSound("entity.stray.step");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_AMBIENT = getSound("entity.strider.ambient");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_DEATH = getSound("entity.strider.death");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_EAT = getSound("entity.strider.eat");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_HAPPY = getSound("entity.strider.happy");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_HURT = getSound("entity.strider.hurt");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_RETREAT = getSound("entity.strider.retreat");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_SADDLE = getSound("entity.strider.saddle");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_STEP = getSound("entity.strider.step");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_STRIDER_STEP_LAVA = getSound("entity.strider.step_lava");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_ABSORB = getSound("entity.sulfur_cube.absorb");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_BOUNCE = getSound("entity.sulfur_cube.bounce");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_BOUNCY_HIT = getSound("entity.sulfur_cube.bouncy.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_BOUNCY_PUSH = getSound("entity.sulfur_cube.bouncy.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_DEATH = getSound("entity.sulfur_cube.death");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_EJECT = getSound("entity.sulfur_cube.eject");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_EXPLOSIVE_HIT = getSound("entity.sulfur_cube.explosive.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_EXPLOSIVE_PUSH = getSound("entity.sulfur_cube.explosive.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_FAST_FLAT_HIT = getSound("entity.sulfur_cube.fast_flat.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_FAST_FLAT_PUSH = getSound("entity.sulfur_cube.fast_flat.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_FAST_SLIDING_HIT = getSound("entity.sulfur_cube.fast_sliding.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_FAST_SLIDING_PUSH = getSound("entity.sulfur_cube.fast_sliding.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_HIGH_RESISTANCE_HIT = getSound("entity.sulfur_cube.high_resistance.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_HIGH_RESISTANCE_PUSH = getSound("entity.sulfur_cube.high_resistance.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_HOT_HIT = getSound("entity.sulfur_cube.hot.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_HOT_PUSH = getSound("entity.sulfur_cube.hot.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_HURT = getSound("entity.sulfur_cube.hurt");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_JUMP = getSound("entity.sulfur_cube.jump");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_LIGHT_HIT = getSound("entity.sulfur_cube.light.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_LIGHT_PUSH = getSound("entity.sulfur_cube.light.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_REGULAR_HIT = getSound("entity.sulfur_cube.regular.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_REGULAR_PUSH = getSound("entity.sulfur_cube.regular.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_SLOW_BOUNCY_HIT = getSound("entity.sulfur_cube.slow_bouncy.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_SLOW_BOUNCY_PUSH = getSound("entity.sulfur_cube.slow_bouncy.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_SLOW_FLAT_HIT = getSound("entity.sulfur_cube.slow_flat.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_SLOW_FLAT_PUSH = getSound("entity.sulfur_cube.slow_flat.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_SLOW_SLIDING_HIT = getSound("entity.sulfur_cube.slow_sliding.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_SLOW_SLIDING_PUSH = getSound("entity.sulfur_cube.slow_sliding.push");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_SQUISH = getSound("entity.sulfur_cube.squish");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_STICKY_HIT = getSound("entity.sulfur_cube.sticky.hit");

    /**
     * @since 26.2
     */
    Sound ENTITY_SULFUR_CUBE_STICKY_PUSH = getSound("entity.sulfur_cube.sticky.push");

    /**
     * @since 1.19
     */
    Sound ENTITY_TADPOLE_DEATH = getSound("entity.tadpole.death");

    /**
     * @since 1.19
     */
    Sound ENTITY_TADPOLE_FLOP = getSound("entity.tadpole.flop");

    /**
     * @since 1.19
     */
    Sound ENTITY_TADPOLE_GROW_UP = getSound("entity.tadpole.grow_up");

    /**
     * @since 1.19
     */
    Sound ENTITY_TADPOLE_HURT = getSound("entity.tadpole.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_TNT_PRIMED = getSound("entity.tnt.primed");

    /**
     * @since 1.13
     */
    Sound ENTITY_TROPICAL_FISH_AMBIENT = getSound("entity.tropical_fish.ambient");

    /**
     * @since 1.13
     */
    Sound ENTITY_TROPICAL_FISH_DEATH = getSound("entity.tropical_fish.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_TROPICAL_FISH_FLOP = getSound("entity.tropical_fish.flop");

    /**
     * @since 1.13
     */
    Sound ENTITY_TROPICAL_FISH_HURT = getSound("entity.tropical_fish.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_AMBIENT_LAND = getSound("entity.turtle.ambient_land");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_DEATH = getSound("entity.turtle.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_DEATH_BABY = getSound("entity.turtle.death_baby");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_EGG_BREAK = getSound("entity.turtle.egg_break");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_EGG_CRACK = getSound("entity.turtle.egg_crack");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_EGG_HATCH = getSound("entity.turtle.egg_hatch");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_HURT = getSound("entity.turtle.hurt");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_HURT_BABY = getSound("entity.turtle.hurt_baby");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_LAY_EGG = getSound("entity.turtle.lay_egg");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_SHAMBLE = getSound("entity.turtle.shamble");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_SHAMBLE_BABY = getSound("entity.turtle.shamble_baby");

    /**
     * @since 1.13
     */
    Sound ENTITY_TURTLE_SWIM = getSound("entity.turtle.swim");

    /**
     * @since 1.11
     */
    Sound ENTITY_VEX_AMBIENT = getSound("entity.vex.ambient");

    /**
     * @since 1.11
     */
    Sound ENTITY_VEX_CHARGE = getSound("entity.vex.charge");

    /**
     * @since 1.11
     */
    Sound ENTITY_VEX_DEATH = getSound("entity.vex.death");

    /**
     * @since 1.11
     */
    Sound ENTITY_VEX_HURT = getSound("entity.vex.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_VILLAGER_AMBIENT = getSound("entity.villager.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_CELEBRATE = getSound("entity.villager.celebrate");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_VILLAGER_DEATH = getSound("entity.villager.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_VILLAGER_HURT = getSound("entity.villager.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_VILLAGER_NO = getSound("entity.villager.no");

    /**
     * @since 1.13
     */
    Sound ENTITY_VILLAGER_TRADE = getSound("entity.villager.trade");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_ARMORER = getSound("entity.villager.work_armorer");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_BUTCHER = getSound("entity.villager.work_butcher");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_CARTOGRAPHER = getSound("entity.villager.work_cartographer");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_CLERIC = getSound("entity.villager.work_cleric");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_FARMER = getSound("entity.villager.work_farmer");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_FISHERMAN = getSound("entity.villager.work_fisherman");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_FLETCHER = getSound("entity.villager.work_fletcher");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_LEATHERWORKER = getSound("entity.villager.work_leatherworker");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_LIBRARIAN = getSound("entity.villager.work_librarian");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_MASON = getSound("entity.villager.work_mason");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_SHEPHERD = getSound("entity.villager.work_shepherd");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_TOOLSMITH = getSound("entity.villager.work_toolsmith");

    /**
     * @since 1.14
     */
    Sound ENTITY_VILLAGER_WORK_WEAPONSMITH = getSound("entity.villager.work_weaponsmith");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_VILLAGER_YES = getSound("entity.villager.yes");

    /**
     * @since 1.13
     */
    Sound ENTITY_VINDICATOR_AMBIENT = getSound("entity.vindicator.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_VINDICATOR_CELEBRATE = getSound("entity.vindicator.celebrate");

    /**
     * @since 1.13
     */
    Sound ENTITY_VINDICATOR_DEATH = getSound("entity.vindicator.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_VINDICATOR_HURT = getSound("entity.vindicator.hurt");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_AMBIENT = getSound("entity.wandering_trader.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_DEATH = getSound("entity.wandering_trader.death");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_DISAPPEARED = getSound("entity.wandering_trader.disappeared");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_DRINK_MILK = getSound("entity.wandering_trader.drink_milk");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_DRINK_POTION = getSound("entity.wandering_trader.drink_potion");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_HURT = getSound("entity.wandering_trader.hurt");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_NO = getSound("entity.wandering_trader.no");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_REAPPEARED = getSound("entity.wandering_trader.reappeared");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_TRADE = getSound("entity.wandering_trader.trade");

    /**
     * @since 1.14
     */
    Sound ENTITY_WANDERING_TRADER_YES = getSound("entity.wandering_trader.yes");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_AGITATED = getSound("entity.warden.agitated");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_AMBIENT = getSound("entity.warden.ambient");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_ANGRY = getSound("entity.warden.angry");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_ATTACK_IMPACT = getSound("entity.warden.attack_impact");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_DEATH = getSound("entity.warden.death");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_DIG = getSound("entity.warden.dig");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_EMERGE = getSound("entity.warden.emerge");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_HEARTBEAT = getSound("entity.warden.heartbeat");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_HURT = getSound("entity.warden.hurt");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_LISTENING = getSound("entity.warden.listening");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_LISTENING_ANGRY = getSound("entity.warden.listening_angry");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_NEARBY_CLOSE = getSound("entity.warden.nearby_close");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_NEARBY_CLOSER = getSound("entity.warden.nearby_closer");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_NEARBY_CLOSEST = getSound("entity.warden.nearby_closest");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_ROAR = getSound("entity.warden.roar");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_SNIFF = getSound("entity.warden.sniff");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_SONIC_BOOM = getSound("entity.warden.sonic_boom");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_SONIC_CHARGE = getSound("entity.warden.sonic_charge");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_STEP = getSound("entity.warden.step");

    /**
     * @since 1.19
     */
    Sound ENTITY_WARDEN_TENDRIL_CLICKS = getSound("entity.warden.tendril_clicks");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_WIND_CHARGE_THROW = getSound("entity.wind_charge.throw");

    /**
     * @since 1.20.6
     */
    Sound ENTITY_WIND_CHARGE_WIND_BURST = getSound("entity.wind_charge.wind_burst");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITCH_AMBIENT = getSound("entity.witch.ambient");

    /**
     * @since 1.14
     */
    Sound ENTITY_WITCH_CELEBRATE = getSound("entity.witch.celebrate");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITCH_DEATH = getSound("entity.witch.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITCH_DRINK = getSound("entity.witch.drink");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITCH_HURT = getSound("entity.witch.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITCH_THROW = getSound("entity.witch.throw");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITHER_AMBIENT = getSound("entity.wither.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITHER_BREAK_BLOCK = getSound("entity.wither.break_block");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITHER_DEATH = getSound("entity.wither.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITHER_HURT = getSound("entity.wither.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITHER_SHOOT = getSound("entity.wither.shoot");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WITHER_SPAWN = getSound("entity.wither.spawn");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_WITHER_SKELETON_AMBIENT = getSound("entity.wither_skeleton.ambient");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_WITHER_SKELETON_DEATH = getSound("entity.wither_skeleton.death");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_WITHER_SKELETON_HURT = getSound("entity.wither_skeleton.hurt");

    /**
     * @since 1.10.2
     */
    Sound ENTITY_WITHER_SKELETON_STEP = getSound("entity.wither_skeleton.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WOLF_AMBIENT = getSound("entity.wolf.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WOLF_DEATH = getSound("entity.wolf.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WOLF_GROWL = getSound("entity.wolf.growl");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WOLF_HURT = getSound("entity.wolf.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WOLF_PANT = getSound("entity.wolf.pant");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WOLF_SHAKE = getSound("entity.wolf.shake");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WOLF_STEP = getSound("entity.wolf.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_WOLF_WHINE = getSound("entity.wolf.whine");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_ANGRY_AMBIENT = getSound("entity.wolf_angry.ambient");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_ANGRY_DEATH = getSound("entity.wolf_angry.death");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_ANGRY_GROWL = getSound("entity.wolf_angry.growl");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_ANGRY_HURT = getSound("entity.wolf_angry.hurt");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_ANGRY_PANT = getSound("entity.wolf_angry.pant");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_ANGRY_WHINE = getSound("entity.wolf_angry.whine");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_BIG_AMBIENT = getSound("entity.wolf_big.ambient");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_BIG_DEATH = getSound("entity.wolf_big.death");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_BIG_GROWL = getSound("entity.wolf_big.growl");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_BIG_HURT = getSound("entity.wolf_big.hurt");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_BIG_PANT = getSound("entity.wolf_big.pant");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_BIG_WHINE = getSound("entity.wolf_big.whine");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_CUTE_AMBIENT = getSound("entity.wolf_cute.ambient");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_CUTE_DEATH = getSound("entity.wolf_cute.death");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_CUTE_GROWL = getSound("entity.wolf_cute.growl");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_CUTE_HURT = getSound("entity.wolf_cute.hurt");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_CUTE_PANT = getSound("entity.wolf_cute.pant");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_CUTE_WHINE = getSound("entity.wolf_cute.whine");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_GRUMPY_AMBIENT = getSound("entity.wolf_grumpy.ambient");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_GRUMPY_DEATH = getSound("entity.wolf_grumpy.death");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_GRUMPY_GROWL = getSound("entity.wolf_grumpy.growl");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_GRUMPY_HURT = getSound("entity.wolf_grumpy.hurt");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_GRUMPY_PANT = getSound("entity.wolf_grumpy.pant");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_GRUMPY_WHINE = getSound("entity.wolf_grumpy.whine");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_PUGLIN_AMBIENT = getSound("entity.wolf_puglin.ambient");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_PUGLIN_DEATH = getSound("entity.wolf_puglin.death");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_PUGLIN_GROWL = getSound("entity.wolf_puglin.growl");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_PUGLIN_HURT = getSound("entity.wolf_puglin.hurt");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_PUGLIN_PANT = getSound("entity.wolf_puglin.pant");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_PUGLIN_WHINE = getSound("entity.wolf_puglin.whine");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_SAD_AMBIENT = getSound("entity.wolf_sad.ambient");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_SAD_DEATH = getSound("entity.wolf_sad.death");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_SAD_GROWL = getSound("entity.wolf_sad.growl");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_SAD_HURT = getSound("entity.wolf_sad.hurt");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_SAD_PANT = getSound("entity.wolf_sad.pant");

    /**
     * @since 1.21.6
     */
    Sound ENTITY_WOLF_SAD_WHINE = getSound("entity.wolf_sad.whine");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOGLIN_AMBIENT = getSound("entity.zoglin.ambient");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOGLIN_ANGRY = getSound("entity.zoglin.angry");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOGLIN_ATTACK = getSound("entity.zoglin.attack");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOGLIN_DEATH = getSound("entity.zoglin.death");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOGLIN_HURT = getSound("entity.zoglin.hurt");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOGLIN_STEP = getSound("entity.zoglin.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_AMBIENT = getSound("entity.zombie.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_ATTACK_IRON_DOOR = getSound("entity.zombie.attack_iron_door");

    /**
     * @since 1.13
     */
    Sound ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR = getSound("entity.zombie.attack_wooden_door");

    /**
     * @since 1.13
     */
    Sound ENTITY_ZOMBIE_BREAK_WOODEN_DOOR = getSound("entity.zombie.break_wooden_door");

    /**
     * @since 1.13
     */
    Sound ENTITY_ZOMBIE_CONVERTED_TO_DROWNED = getSound("entity.zombie.converted_to_drowned");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_DEATH = getSound("entity.zombie.death");

    /**
     * @since 1.13
     */
    Sound ENTITY_ZOMBIE_DESTROY_EGG = getSound("entity.zombie.destroy_egg");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_HURT = getSound("entity.zombie.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_INFECT = getSound("entity.zombie.infect");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_STEP = getSound("entity.zombie.step");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_HORSE_AMBIENT = getSound("entity.zombie_horse.ambient");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_HORSE_ANGRY = getSound("entity.zombie_horse.angry");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_HORSE_DEATH = getSound("entity.zombie_horse.death");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_HORSE_EAT = getSound("entity.zombie_horse.eat");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_HORSE_HURT = getSound("entity.zombie_horse.hurt");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_AMBIENT = getSound("entity.zombie_nautilus.ambient");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_AMBIENT_LAND = getSound("entity.zombie_nautilus.ambient_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_DASH = getSound("entity.zombie_nautilus.dash");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_DASH_LAND = getSound("entity.zombie_nautilus.dash_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_DASH_READY = getSound("entity.zombie_nautilus.dash_ready");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_DASH_READY_LAND = getSound("entity.zombie_nautilus.dash_ready_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_DEATH = getSound("entity.zombie_nautilus.death");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_DEATH_LAND = getSound("entity.zombie_nautilus.death_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_EAT = getSound("entity.zombie_nautilus.eat");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_HURT = getSound("entity.zombie_nautilus.hurt");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_HURT_LAND = getSound("entity.zombie_nautilus.hurt_land");

    /**
     * @since 1.21.11
     */
    Sound ENTITY_ZOMBIE_NAUTILUS_SWIM = getSound("entity.zombie_nautilus.swim");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_VILLAGER_AMBIENT = getSound("entity.zombie_villager.ambient");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_VILLAGER_CONVERTED = getSound("entity.zombie_villager.converted");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_VILLAGER_CURE = getSound("entity.zombie_villager.cure");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_VILLAGER_DEATH = getSound("entity.zombie_villager.death");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_VILLAGER_HURT = getSound("entity.zombie_villager.hurt");

    /**
     * @since 1.9.4
     */
    Sound ENTITY_ZOMBIE_VILLAGER_STEP = getSound("entity.zombie_villager.step");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOMBIFIED_PIGLIN_AMBIENT = getSound("entity.zombified_piglin.ambient");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOMBIFIED_PIGLIN_ANGRY = getSound("entity.zombified_piglin.angry");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOMBIFIED_PIGLIN_DEATH = getSound("entity.zombified_piglin.death");

    /**
     * @since 1.16.1
     */
    Sound ENTITY_ZOMBIFIED_PIGLIN_HURT = getSound("entity.zombified_piglin.hurt");

    /**
     * @since 1.20.6
     */
    Sound EVENT_MOB_EFFECT_BAD_OMEN = getSound("event.mob_effect.bad_omen");

    /**
     * @since 1.20.6
     */
    Sound EVENT_MOB_EFFECT_RAID_OMEN = getSound("event.mob_effect.raid_omen");

    /**
     * @since 1.20.6
     */
    Sound EVENT_MOB_EFFECT_TRIAL_OMEN = getSound("event.mob_effect.trial_omen");

    /**
     * @since 1.14
     */
    Sound EVENT_RAID_HORN = getSound("event.raid.horn");

    /**
     * @since 1.19.4
     */
    Sound INTENTIONALLY_EMPTY = getSound("intentionally_empty");

    /**
     * @since 1.9.4
     */
    Sound ITEM_ARMOR_EQUIP_CHAIN = getSound("item.armor.equip_chain");

    /**
     * @since 1.21.10
     */
    Sound ITEM_ARMOR_EQUIP_COPPER = getSound("item.armor.equip_copper");

    /**
     * @since 1.9.4
     */
    Sound ITEM_ARMOR_EQUIP_DIAMOND = getSound("item.armor.equip_diamond");

    /**
     * @since 1.11
     */
    Sound ITEM_ARMOR_EQUIP_ELYTRA = getSound("item.armor.equip_elytra");

    /**
     * @since 1.9.4
     */
    Sound ITEM_ARMOR_EQUIP_GENERIC = getSound("item.armor.equip_generic");

    /**
     * @since 1.9.4
     */
    Sound ITEM_ARMOR_EQUIP_GOLD = getSound("item.armor.equip_gold");

    /**
     * @since 1.9.4
     */
    Sound ITEM_ARMOR_EQUIP_IRON = getSound("item.armor.equip_iron");

    /**
     * @since 1.9.4
     */
    Sound ITEM_ARMOR_EQUIP_LEATHER = getSound("item.armor.equip_leather");

    /**
     * @since 1.21.11
     */
    Sound ITEM_ARMOR_EQUIP_NAUTILUS = getSound("item.armor.equip_nautilus");

    /**
     * @since 1.16.1
     */
    Sound ITEM_ARMOR_EQUIP_NETHERITE = getSound("item.armor.equip_netherite");

    /**
     * @since 1.13
     */
    Sound ITEM_ARMOR_EQUIP_TURTLE = getSound("item.armor.equip_turtle");

    /**
     * @since 1.20.6
     */
    Sound ITEM_ARMOR_EQUIP_WOLF = getSound("item.armor.equip_wolf");

    /**
     * @since 1.21.11
     */
    Sound ITEM_ARMOR_UNEQUIP_NAUTILUS = getSound("item.armor.unequip_nautilus");

    /**
     * @since 1.20.6
     */
    Sound ITEM_ARMOR_UNEQUIP_WOLF = getSound("item.armor.unequip_wolf");

    /**
     * @since 1.17
     */
    Sound ITEM_AXE_SCRAPE = getSound("item.axe.scrape");

    /**
     * @since 1.13
     */
    Sound ITEM_AXE_STRIP = getSound("item.axe.strip");

    /**
     * @since 1.17
     */
    Sound ITEM_AXE_WAX_OFF = getSound("item.axe.wax_off");

    /**
     * @since 1.17
     */
    Sound ITEM_BONE_MEAL_USE = getSound("item.bone_meal.use");

    /**
     * @since 1.14
     */
    Sound ITEM_BOOK_PAGE_TURN = getSound("item.book.page_turn");

    /**
     * @since 1.14
     */
    Sound ITEM_BOOK_PUT = getSound("item.book.put");

    /**
     * @since 1.11
     */
    Sound ITEM_BOTTLE_EMPTY = getSound("item.bottle.empty");

    /**
     * @since 1.9.4
     */
    Sound ITEM_BOTTLE_FILL = getSound("item.bottle.fill");

    /**
     * @since 1.9.4
     */
    Sound ITEM_BOTTLE_FILL_DRAGONBREATH = getSound("item.bottle.fill_dragonbreath");

    /**
     * @since 1.20
     */
    Sound ITEM_BRUSH_BRUSHING_GENERIC = getSound("item.brush.brushing.generic");

    /**
     * @since 1.20
     */
    Sound ITEM_BRUSH_BRUSHING_GRAVEL = getSound("item.brush.brushing.gravel");

    /**
     * @since 1.20
     */
    Sound ITEM_BRUSH_BRUSHING_GRAVEL_COMPLETE = getSound("item.brush.brushing.gravel.complete");

    /**
     * @since 1.20
     */
    Sound ITEM_BRUSH_BRUSHING_SAND = getSound("item.brush.brushing.sand");

    /**
     * @since 1.20
     */
    Sound ITEM_BRUSH_BRUSHING_SAND_COMPLETE = getSound("item.brush.brushing.sand.complete");

    /**
     * @since 1.9.4
     */
    Sound ITEM_BUCKET_EMPTY = getSound("item.bucket.empty");

    /**
     * @since 1.17
     */
    Sound ITEM_BUCKET_EMPTY_AXOLOTL = getSound("item.bucket.empty_axolotl");

    /**
     * @since 1.13
     */
    Sound ITEM_BUCKET_EMPTY_FISH = getSound("item.bucket.empty_fish");

    /**
     * @since 1.9.4
     */
    Sound ITEM_BUCKET_EMPTY_LAVA = getSound("item.bucket.empty_lava");

    /**
     * @since 1.17
     */
    Sound ITEM_BUCKET_EMPTY_POWDER_SNOW = getSound("item.bucket.empty_powder_snow");

    /**
     * @since 26.2
     */
    Sound ITEM_BUCKET_EMPTY_SULFUR_CUBE = getSound("item.bucket.empty_sulfur_cube");

    /**
     * @since 1.19
     */
    Sound ITEM_BUCKET_EMPTY_TADPOLE = getSound("item.bucket.empty_tadpole");

    /**
     * @since 1.9.4
     */
    Sound ITEM_BUCKET_FILL = getSound("item.bucket.fill");

    /**
     * @since 1.17
     */
    Sound ITEM_BUCKET_FILL_AXOLOTL = getSound("item.bucket.fill_axolotl");

    /**
     * @since 1.13
     */
    Sound ITEM_BUCKET_FILL_FISH = getSound("item.bucket.fill_fish");

    /**
     * @since 1.9.4
     */
    Sound ITEM_BUCKET_FILL_LAVA = getSound("item.bucket.fill_lava");

    /**
     * @since 1.17
     */
    Sound ITEM_BUCKET_FILL_POWDER_SNOW = getSound("item.bucket.fill_powder_snow");

    /**
     * @since 26.2
     */
    Sound ITEM_BUCKET_FILL_SULFUR_CUBE = getSound("item.bucket.fill_sulfur_cube");

    /**
     * @since 1.19
     */
    Sound ITEM_BUCKET_FILL_TADPOLE = getSound("item.bucket.fill_tadpole");

    /**
     * @since 1.18.1
     */
    Sound ITEM_BUNDLE_DROP_CONTENTS = getSound("item.bundle.drop_contents");

    /**
     * @since 1.18.1
     */
    Sound ITEM_BUNDLE_INSERT = getSound("item.bundle.insert");

    /**
     * @since 1.21.3
     */
    Sound ITEM_BUNDLE_INSERT_FAIL = getSound("item.bundle.insert_fail");

    /**
     * @since 1.18.1
     */
    Sound ITEM_BUNDLE_REMOVE_ONE = getSound("item.bundle.remove_one");

    /**
     * @since 1.9.4
     */
    Sound ITEM_CHORUS_FRUIT_TELEPORT = getSound("item.chorus_fruit.teleport");

    /**
     * @since 1.14
     */
    Sound ITEM_CROP_PLANT = getSound("item.crop.plant");

    /**
     * @since 1.14
     */
    Sound ITEM_CROSSBOW_HIT = getSound("item.crossbow.hit");

    /**
     * @since 1.14
     */
    Sound ITEM_CROSSBOW_LOADING_END = getSound("item.crossbow.loading_end");

    /**
     * @since 1.14
     */
    Sound ITEM_CROSSBOW_LOADING_MIDDLE = getSound("item.crossbow.loading_middle");

    /**
     * @since 1.14
     */
    Sound ITEM_CROSSBOW_LOADING_START = getSound("item.crossbow.loading_start");

    /**
     * @since 1.14
     */
    Sound ITEM_CROSSBOW_QUICK_CHARGE_1 = getSound("item.crossbow.quick_charge_1");

    /**
     * @since 1.14
     */
    Sound ITEM_CROSSBOW_QUICK_CHARGE_2 = getSound("item.crossbow.quick_charge_2");

    /**
     * @since 1.14
     */
    Sound ITEM_CROSSBOW_QUICK_CHARGE_3 = getSound("item.crossbow.quick_charge_3");

    /**
     * @since 1.14
     */
    Sound ITEM_CROSSBOW_SHOOT = getSound("item.crossbow.shoot");

    /**
     * @since 1.17
     */
    Sound ITEM_DYE_USE = getSound("item.dye.use");

    /**
     * @since 1.9.4
     */
    Sound ITEM_ELYTRA_FLYING = getSound("item.elytra.flying");

    /**
     * @since 1.9.4
     */
    Sound ITEM_FIRECHARGE_USE = getSound("item.firecharge.use");

    /**
     * @since 1.9.4
     */
    Sound ITEM_FLINTANDSTEEL_USE = getSound("item.flintandsteel.use");

    /**
     * @since 1.17
     */
    Sound ITEM_GLOW_INK_SAC_USE = getSound("item.glow_ink_sac.use");

    /**
     * @since 1.19
     */
    Sound ITEM_GOAT_HORN_SOUND_0 = getSound("item.goat_horn.sound.0");

    /**
     * @since 1.19
     */
    Sound ITEM_GOAT_HORN_SOUND_1 = getSound("item.goat_horn.sound.1");

    /**
     * @since 1.19
     */
    Sound ITEM_GOAT_HORN_SOUND_2 = getSound("item.goat_horn.sound.2");

    /**
     * @since 1.19
     */
    Sound ITEM_GOAT_HORN_SOUND_3 = getSound("item.goat_horn.sound.3");

    /**
     * @since 1.19
     */
    Sound ITEM_GOAT_HORN_SOUND_4 = getSound("item.goat_horn.sound.4");

    /**
     * @since 1.19
     */
    Sound ITEM_GOAT_HORN_SOUND_5 = getSound("item.goat_horn.sound.5");

    /**
     * @since 1.19
     */
    Sound ITEM_GOAT_HORN_SOUND_6 = getSound("item.goat_horn.sound.6");

    /**
     * @since 1.19
     */
    Sound ITEM_GOAT_HORN_SOUND_7 = getSound("item.goat_horn.sound.7");

    /**
     * @since 26.2
     */
    Sound ITEM_GOLDEN_DANDELION_UNUSE = getSound("item.golden_dandelion.unuse");

    /**
     * @since 26.2
     */
    Sound ITEM_GOLDEN_DANDELION_USE = getSound("item.golden_dandelion.use");

    /**
     * @since 1.9.4
     */
    Sound ITEM_HOE_TILL = getSound("item.hoe.till");

    /**
     * @since 1.15
     */
    Sound ITEM_HONEY_BOTTLE_DRINK = getSound("item.honey_bottle.drink");

    /**
     * @since 1.17
     */
    Sound ITEM_HONEYCOMB_WAX_ON = getSound("item.honeycomb.wax_on");

    /**
     * @since 1.21.6
     */
    Sound ITEM_HORSE_ARMOR_UNEQUIP = getSound("item.horse_armor.unequip");

    /**
     * @since 1.17
     */
    Sound ITEM_INK_SAC_USE = getSound("item.ink_sac.use");

    /**
     * @since 1.21.6
     */
    Sound ITEM_LEAD_BREAK = getSound("item.lead.break");

    /**
     * @since 1.21.6
     */
    Sound ITEM_LEAD_TIED = getSound("item.lead.tied");

    /**
     * @since 1.21.6
     */
    Sound ITEM_LEAD_UNTIED = getSound("item.lead.untied");

    /**
     * @since 1.21.6
     */
    Sound ITEM_LLAMA_CARPET_UNEQUIP = getSound("item.llama_carpet.unequip");

    /**
     * @since 1.16.1
     */
    Sound ITEM_LODESTONE_COMPASS_LOCK = getSound("item.lodestone_compass.lock");

    /**
     * @since 1.20.6
     */
    Sound ITEM_MACE_SMASH_AIR = getSound("item.mace.smash_air");

    /**
     * @since 1.20.6
     */
    Sound ITEM_MACE_SMASH_GROUND = getSound("item.mace.smash_ground");

    /**
     * @since 1.20.6
     */
    Sound ITEM_MACE_SMASH_GROUND_HEAVY = getSound("item.mace.smash_ground_heavy");

    /**
     * @since 1.21.11
     */
    Sound ITEM_NAUTILUS_SADDLE_EQUIP = getSound("item.nautilus_saddle_equip");

    /**
     * @since 1.21.11
     */
    Sound ITEM_NAUTILUS_SADDLE_UNDERWATER_EQUIP = getSound("item.nautilus_saddle_underwater_equip");

    /**
     * @since 1.14
     */
    Sound ITEM_NETHER_WART_PLANT = getSound("item.nether_wart.plant");

    /**
     * @since 1.20.6
     */
    Sound ITEM_OMINOUS_BOTTLE_DISPOSE = getSound("item.ominous_bottle.dispose");

    /**
     * @since 1.21.6
     */
    Sound ITEM_SADDLE_UNEQUIP = getSound("item.saddle.unequip");

    /**
     * @since 1.21.6
     */
    Sound ITEM_SHEARS_SNIP = getSound("item.shears.snip");

    /**
     * @since 1.9.4
     */
    Sound ITEM_SHIELD_BLOCK = getSound("item.shield.block");

    /**
     * @since 1.9.4
     */
    Sound ITEM_SHIELD_BREAK = getSound("item.shield.break");

    /**
     * @since 1.9.4
     */
    Sound ITEM_SHOVEL_FLATTEN = getSound("item.shovel.flatten");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_ATTACK = getSound("item.spear.attack");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_HIT = getSound("item.spear.hit");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_LUNGE_1 = getSound("item.spear.lunge_1");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_LUNGE_2 = getSound("item.spear.lunge_2");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_LUNGE_3 = getSound("item.spear.lunge_3");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_USE = getSound("item.spear.use");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_WOOD_ATTACK = getSound("item.spear_wood.attack");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_WOOD_HIT = getSound("item.spear_wood.hit");

    /**
     * @since 1.21.11
     */
    Sound ITEM_SPEAR_WOOD_USE = getSound("item.spear_wood.use");

    /**
     * @since 1.17
     */
    Sound ITEM_SPYGLASS_STOP_USING = getSound("item.spyglass.stop_using");

    /**
     * @since 1.17
     */
    Sound ITEM_SPYGLASS_USE = getSound("item.spyglass.use");

    /**
     * @since 1.11
     */
    Sound ITEM_TOTEM_USE = getSound("item.totem.use");

    /**
     * @since 1.13
     */
    Sound ITEM_TRIDENT_HIT = getSound("item.trident.hit");

    /**
     * @since 1.13
     */
    Sound ITEM_TRIDENT_HIT_GROUND = getSound("item.trident.hit_ground");

    /**
     * @since 1.13
     */
    Sound ITEM_TRIDENT_RETURN = getSound("item.trident.return");

    /**
     * @since 1.13
     */
    Sound ITEM_TRIDENT_RIPTIDE_1 = getSound("item.trident.riptide_1");

    /**
     * @since 1.13
     */
    Sound ITEM_TRIDENT_RIPTIDE_2 = getSound("item.trident.riptide_2");

    /**
     * @since 1.13
     */
    Sound ITEM_TRIDENT_RIPTIDE_3 = getSound("item.trident.riptide_3");

    /**
     * @since 1.13
     */
    Sound ITEM_TRIDENT_THROW = getSound("item.trident.throw");

    /**
     * @since 1.13
     */
    Sound ITEM_TRIDENT_THUNDER = getSound("item.trident.thunder");

    /**
     * @since 1.20.6
     */
    Sound ITEM_WOLF_ARMOR_BREAK = getSound("item.wolf_armor.break");

    /**
     * @since 1.20.6
     */
    Sound ITEM_WOLF_ARMOR_CRACK = getSound("item.wolf_armor.crack");

    /**
     * @since 1.20.6
     */
    Sound ITEM_WOLF_ARMOR_DAMAGE = getSound("item.wolf_armor.damage");

    /**
     * @since 1.20.6
     */
    Sound ITEM_WOLF_ARMOR_REPAIR = getSound("item.wolf_armor.repair");

    /**
     * @since 1.9.4
     */
    Sound MUSIC_CREATIVE = getSound("music.creative");

    /**
     * @since 1.9.4
     */
    Sound MUSIC_CREDITS = getSound("music.credits");

    /**
     * @since 1.9.4
     */
    Sound MUSIC_DRAGON = getSound("music.dragon");

    /**
     * @since 1.9.4
     */
    Sound MUSIC_END = getSound("music.end");

    /**
     * @since 1.9.4
     */
    Sound MUSIC_GAME = getSound("music.game");

    /**
     * @since 1.9.4
     */
    Sound MUSIC_MENU = getSound("music.menu");

    /**
     * @since 1.16.1
     */
    Sound MUSIC_NETHER_BASALT_DELTAS = getSound("music.nether.basalt_deltas");

    /**
     * @since 1.16.1
     */
    Sound MUSIC_NETHER_CRIMSON_FOREST = getSound("music.nether.crimson_forest");

    /**
     * @since 1.16.1
     */
    Sound MUSIC_NETHER_NETHER_WASTES = getSound("music.nether.nether_wastes");

    /**
     * @since 1.16.1
     */
    Sound MUSIC_NETHER_SOUL_SAND_VALLEY = getSound("music.nether.soul_sand_valley");

    /**
     * @since 1.16.1
     */
    Sound MUSIC_NETHER_WARPED_FOREST = getSound("music.nether.warped_forest");

    /**
     * @since 1.20
     */
    Sound MUSIC_OVERWORLD_BADLANDS = getSound("music.overworld.badlands");

    /**
     * @since 1.20
     */
    Sound MUSIC_OVERWORLD_BAMBOO_JUNGLE = getSound("music.overworld.bamboo_jungle");

    /**
     * @since 1.19.4
     */
    Sound MUSIC_OVERWORLD_CHERRY_GROVE = getSound("music.overworld.cherry_grove");

    /**
     * @since 1.19
     */
    Sound MUSIC_OVERWORLD_DEEP_DARK = getSound("music.overworld.deep_dark");

    /**
     * @since 1.20
     */
    Sound MUSIC_OVERWORLD_DESERT = getSound("music.overworld.desert");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_OVERWORLD_DRIPSTONE_CAVES = getSound("music.overworld.dripstone_caves");

    /**
     * @since 1.20
     */
    Sound MUSIC_OVERWORLD_FLOWER_FOREST = getSound("music.overworld.flower_forest");

    /**
     * @since 1.20
     */
    Sound MUSIC_OVERWORLD_FOREST = getSound("music.overworld.forest");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_OVERWORLD_FROZEN_PEAKS = getSound("music.overworld.frozen_peaks");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_OVERWORLD_GROVE = getSound("music.overworld.grove");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_OVERWORLD_JAGGED_PEAKS = getSound("music.overworld.jagged_peaks");

    /**
     * @since 1.20
     */
    Sound MUSIC_OVERWORLD_JUNGLE = getSound("music.overworld.jungle");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_OVERWORLD_LUSH_CAVES = getSound("music.overworld.lush_caves");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_OVERWORLD_MEADOW = getSound("music.overworld.meadow");

    /**
     * @since 1.19
     */
    Sound MUSIC_OVERWORLD_OLD_GROWTH_TAIGA = getSound("music.overworld.old_growth_taiga");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_OVERWORLD_SNOWY_SLOPES = getSound("music.overworld.snowy_slopes");

    /**
     * @since 1.20
     */
    Sound MUSIC_OVERWORLD_SPARSE_JUNGLE = getSound("music.overworld.sparse_jungle");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_OVERWORLD_STONY_PEAKS = getSound("music.overworld.stony_peaks");

    /**
     * @since 26.2
     */
    Sound MUSIC_OVERWORLD_SULFUR_CAVES = getSound("music.overworld.sulfur_caves");

    /**
     * @since 1.19
     */
    Sound MUSIC_OVERWORLD_SWAMP = getSound("music.overworld.swamp");

    /**
     * @since 1.13
     */
    Sound MUSIC_UNDER_WATER = getSound("music.under_water");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_11 = getSound("music_disc.11");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_13 = getSound("music_disc.13");

    /**
     * @since 1.19
     */
    Sound MUSIC_DISC_5 = getSound("music_disc.5");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_BLOCKS = getSound("music_disc.blocks");

    /**
     * @since 26.2
     */
    Sound MUSIC_DISC_BOUNCE = getSound("music_disc.bounce");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_CAT = getSound("music_disc.cat");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_CHIRP = getSound("music_disc.chirp");

    /**
     * @since 1.21
     */
    Sound MUSIC_DISC_CREATOR = getSound("music_disc.creator");

    /**
     * @since 1.21
     */
    Sound MUSIC_DISC_CREATOR_MUSIC_BOX = getSound("music_disc.creator_music_box");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_FAR = getSound("music_disc.far");

    /**
     * @since 1.21.7
     */
    Sound MUSIC_DISC_LAVA_CHICKEN = getSound("music_disc.lava_chicken");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_MALL = getSound("music_disc.mall");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_MELLOHI = getSound("music_disc.mellohi");

    /**
     * @since 1.18.1
     */
    Sound MUSIC_DISC_OTHERSIDE = getSound("music_disc.otherside");

    /**
     * @since 1.16.1
     */
    Sound MUSIC_DISC_PIGSTEP = getSound("music_disc.pigstep");

    /**
     * @since 1.21
     */
    Sound MUSIC_DISC_PRECIPICE = getSound("music_disc.precipice");

    /**
     * @since 1.20
     */
    Sound MUSIC_DISC_RELIC = getSound("music_disc.relic");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_STAL = getSound("music_disc.stal");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_STRAD = getSound("music_disc.strad");

    /**
     * @since 1.21.6
     */
    Sound MUSIC_DISC_TEARS = getSound("music_disc.tears");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_WAIT = getSound("music_disc.wait");

    /**
     * @since 1.13
     */
    Sound MUSIC_DISC_WARD = getSound("music_disc.ward");

    /**
     * @since 1.16.1
     */
    Sound PARTICLE_SOUL_ESCAPE = getSound("particle.soul_escape");

    /**
     * @since 1.9.4
     */
    Sound UI_BUTTON_CLICK = getSound("ui.button.click");

    /**
     * @since 1.14
     */
    Sound UI_CARTOGRAPHY_TABLE_TAKE_RESULT = getSound("ui.cartography_table.take_result");

    /**
     * @since 1.21.3
     */
    Sound UI_HUD_BUBBLE_POP = getSound("ui.hud.bubble_pop");

    /**
     * @since 1.14
     */
    Sound UI_LOOM_SELECT_PATTERN = getSound("ui.loom.select_pattern");

    /**
     * @since 1.14
     */
    Sound UI_LOOM_TAKE_RESULT = getSound("ui.loom.take_result");

    /**
     * @since 1.14
     */
    Sound UI_STONECUTTER_SELECT_RECIPE = getSound("ui.stonecutter.select_recipe");

    /**
     * @since 1.14
     */
    Sound UI_STONECUTTER_TAKE_RESULT = getSound("ui.stonecutter.take_result");

    /**
     * @since 1.12
     */
    Sound UI_TOAST_CHALLENGE_COMPLETE = getSound("ui.toast.challenge_complete");

    /**
     * @since 1.12
     */
    Sound UI_TOAST_IN = getSound("ui.toast.in");

    /**
     * @since 1.12
     */
    Sound UI_TOAST_OUT = getSound("ui.toast.out");

    /**
     * @since 1.21.10
     */
    Sound WEATHER_END_FLASH = getSound("weather.end_flash");

    /**
     * @since 1.9.4
     */
    Sound WEATHER_RAIN = getSound("weather.rain");

    /**
     * @since 1.9.4
     */
    Sound WEATHER_RAIN_ABOVE = getSound("weather.rain.above");
    // End generate - Sound

    @NotNull
    private static Sound getSound(@NotNull @KeyPattern.Value String key) {
        return Registry.SOUNDS.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * @param name of the sound.
     * @return the sound with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static Sound valueOf(@NotNull String name) {
        final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
        Sound sound;

        if (key != null) {
            sound = Bukkit.getUnsafe().get(RegistryKey.SOUND_EVENT, key);
            if (sound != null) {
                return sound;
            }
        }

        // Sound keys can have dots in them which where converted to _. Since converting
        // the _ back to a dot would be to complex (since not all _ need to be converted back) we use the field name.
        try {
            sound = (Sound) Sound.class.getField(name).get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            sound = null;
        }

        Preconditions.checkArgument(sound != null, "No sound found with the name %s", name);
        return sound;
    }

    // Paper start - deprecate getKey
    /**
     * @deprecated use {@link Registry#getKey(Keyed)} and {@link Registry#SOUNDS}. Sounds
     * can exist without a key.
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    @Override
    @NotNull NamespacedKey getKey();
    // Paper end - deprecate getKey

    /**
     * @return an array of all known sounds.
     * @deprecated use {@link Registry#stream()}.
     */
    @NotNull
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static Sound[] values() {
        return Registry.SOUNDS.stream().toArray(Sound[]::new);
    }

    // Paper start
    /**
     * @deprecated use {@link Registry#getKey(Keyed)} and {@link Registry#SOUNDS}. Sounds
     * can exist without a key.
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    @Override
    default net.kyori.adventure.key.@NotNull Key key() {
        return this.getKey();
    }
    // Paper end
}
