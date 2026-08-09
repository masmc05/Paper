package org.bukkit.block;

import java.util.Collection;
import java.util.function.Consumer;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.bukkit.Material;
import org.bukkit.Registry;
import org.bukkit.Translatable;
import org.bukkit.World;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.AnaloguePowerable;
import org.bukkit.block.data.Bisected;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Brushable;
import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Hatchable;
import org.bukkit.block.data.Levelled;
import org.bukkit.block.data.Lightable;
import org.bukkit.block.data.MultipleFacing;
import org.bukkit.block.data.Orientable;
import org.bukkit.block.data.Powerable;
import org.bukkit.block.data.Rail;
import org.bukkit.block.data.Rotatable;
import org.bukkit.block.data.Snowable;
import org.bukkit.block.data.Waterlogged;
import org.bukkit.block.data.type.AmethystCluster;
import org.bukkit.block.data.type.Bamboo;
import org.bukkit.block.data.type.Barrel;
import org.bukkit.block.data.type.Bed;
import org.bukkit.block.data.type.Beehive;
import org.bukkit.block.data.type.Bell;
import org.bukkit.block.data.type.BigDripleaf;
import org.bukkit.block.data.type.BrewingStand;
import org.bukkit.block.data.type.BubbleColumn;
import org.bukkit.block.data.type.Cake;
import org.bukkit.block.data.type.CalibratedSculkSensor;
import org.bukkit.block.data.type.Campfire;
import org.bukkit.block.data.type.Candle;
import org.bukkit.block.data.type.CaveVines;
import org.bukkit.block.data.type.CaveVinesPlant;
import org.bukkit.block.data.type.Chain;
import org.bukkit.block.data.type.Chest;
import org.bukkit.block.data.type.ChiseledBookshelf;
import org.bukkit.block.data.type.Cocoa;
import org.bukkit.block.data.type.CommandBlock;
import org.bukkit.block.data.type.Comparator;
import org.bukkit.block.data.type.CopperBulb;
import org.bukkit.block.data.type.CopperGolemStatue;
import org.bukkit.block.data.type.CoralWallFan;
import org.bukkit.block.data.type.Crafter;
import org.bukkit.block.data.type.CreakingHeart;
import org.bukkit.block.data.type.DaylightDetector;
import org.bukkit.block.data.type.DecoratedPot;
import org.bukkit.block.data.type.Dispenser;
import org.bukkit.block.data.type.Door;
import org.bukkit.block.data.type.DriedGhast;
import org.bukkit.block.data.type.Dripleaf;
import org.bukkit.block.data.type.EndPortalFrame;
import org.bukkit.block.data.type.EnderChest;
import org.bukkit.block.data.type.Farmland;
import org.bukkit.block.data.type.Fence;
import org.bukkit.block.data.type.Fire;
import org.bukkit.block.data.type.FlowerBed;
import org.bukkit.block.data.type.Furnace;
import org.bukkit.block.data.type.Gate;
import org.bukkit.block.data.type.GlassPane;
import org.bukkit.block.data.type.GlowLichen;
import org.bukkit.block.data.type.Grindstone;
import org.bukkit.block.data.type.HangingMoss;
import org.bukkit.block.data.type.HangingSign;
import org.bukkit.block.data.type.Hopper;
import org.bukkit.block.data.type.Jigsaw;
import org.bukkit.block.data.type.Jukebox;
import org.bukkit.block.data.type.Ladder;
import org.bukkit.block.data.type.Lantern;
import org.bukkit.block.data.type.LeafLitter;
import org.bukkit.block.data.type.Leaves;
import org.bukkit.block.data.type.Lectern;
import org.bukkit.block.data.type.Light;
import org.bukkit.block.data.type.LightningRod;
import org.bukkit.block.data.type.MangrovePropagule;
import org.bukkit.block.data.type.MossyCarpet;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.block.data.type.Observer;
import org.bukkit.block.data.type.Piston;
import org.bukkit.block.data.type.PistonHead;
import org.bukkit.block.data.type.PitcherCrop;
import org.bukkit.block.data.type.PotentSulfur;
import org.bukkit.block.data.type.RedstoneRail;
import org.bukkit.block.data.type.RedstoneWallTorch;
import org.bukkit.block.data.type.RedstoneWire;
import org.bukkit.block.data.type.Repeater;
import org.bukkit.block.data.type.ResinClump;
import org.bukkit.block.data.type.RespawnAnchor;
import org.bukkit.block.data.type.Sapling;
import org.bukkit.block.data.type.Scaffolding;
import org.bukkit.block.data.type.SculkCatalyst;
import org.bukkit.block.data.type.SculkSensor;
import org.bukkit.block.data.type.SculkShrieker;
import org.bukkit.block.data.type.SculkVein;
import org.bukkit.block.data.type.SeaPickle;
import org.bukkit.block.data.type.Shelf;
import org.bukkit.block.data.type.Sign;
import org.bukkit.block.data.type.Skull;
import org.bukkit.block.data.type.Slab;
import org.bukkit.block.data.type.SmallDripleaf;
import org.bukkit.block.data.type.Snow;
import org.bukkit.block.data.type.Speleothem;
import org.bukkit.block.data.type.Stairs;
import org.bukkit.block.data.type.StructureBlock;
import org.bukkit.block.data.type.Switch;
import org.bukkit.block.data.type.TNT;
import org.bukkit.block.data.type.TechnicalPiston;
import org.bukkit.block.data.type.TestBlock;
import org.bukkit.block.data.type.TrapDoor;
import org.bukkit.block.data.type.TrialSpawner;
import org.bukkit.block.data.type.Tripwire;
import org.bukkit.block.data.type.TripwireHook;
import org.bukkit.block.data.type.TurtleEgg;
import org.bukkit.block.data.type.Vault;
import org.bukkit.block.data.type.Wall;
import org.bukkit.block.data.type.WallHangingSign;
import org.bukkit.block.data.type.WallSign;
import org.bukkit.block.data.type.WallSkull;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.Unmodifiable;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Represents a block type.
 *
 * @since 1.20.6
 */
@NullMarked
public interface BlockType extends Keyed, Translatable, net.kyori.adventure.translation.Translatable, io.papermc.paper.world.flag.FeatureDependant { // Paper - add translatable & feature flag API

    /**
     * Typed represents a subtype of {@link BlockType}s that have a known block
     * data type at compile time.
     *
     * @param <B> the generic type of the block data that represents the block
     * type.
     * @since 1.20.6
     */
    interface Typed<B extends BlockData> extends BlockType {

        /**
         * Gets the BlockData class of this BlockType
         *
         * @return the BlockData class of this BlockType
         * @since 1.20.6
         */
        @Override
        Class<B> getBlockDataClass();

        /**
         * Creates a new {@link BlockData} instance for this block type, with
         * all properties initialized to unspecified defaults.
         *
         * @param consumer consumer to run on new instance before returning
         * @return new data instance
         * @since 1.20.6
         */
        B createBlockData(@Nullable Consumer<? super B> consumer);

        /**
         * Creates a new {@link BlockData} instance for this block type, with all
         * properties initialized to unspecified defaults.
         *
         * @return new data instance
         * @since 1.20.6
         */
        @Override
        B createBlockData();

        /**
         * Creates a collection of {@link BlockData} instances for this block type, with all
         * possible combinations of properties values.
         *
         * @return new block data collection
         * @since 1.21.4
         */
        @Override
        @Unmodifiable Collection<B> createBlockDataStates();

        /**
         * Creates a new {@link BlockData} instance for this block type, with all
         * properties initialized to unspecified defaults, except for those provided
         * in data.
         *
         * @param data data string
         * @return new data instance
         * @throws IllegalArgumentException if the specified data is not valid
         * @since 1.20.6
         */
        B createBlockData(@Nullable String data);
    }

    /**
     * @since 1.20.6
     */
    //<editor-fold desc="BlockTypes" defaultstate="collapsed">
    // Start generate - BlockType
    BlockType.Typed<Switch> ACACIA_BUTTON = getBlockType("acacia_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> ACACIA_DOOR = getBlockType("acacia_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> ACACIA_FENCE = getBlockType("acacia_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> ACACIA_FENCE_GATE = getBlockType("acacia_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> ACACIA_HANGING_SIGN = getBlockType("acacia_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> ACACIA_LEAVES = getBlockType("acacia_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> ACACIA_LOG = getBlockType("acacia_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ACACIA_PLANKS = getBlockType("acacia_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> ACACIA_PRESSURE_PLATE = getBlockType("acacia_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sapling> ACACIA_SAPLING = getBlockType("acacia_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> ACACIA_SHELF = getBlockType("acacia_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> ACACIA_SIGN = getBlockType("acacia_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> ACACIA_SLAB = getBlockType("acacia_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> ACACIA_STAIRS = getBlockType("acacia_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> ACACIA_TRAPDOOR = getBlockType("acacia_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> ACACIA_WALL_HANGING_SIGN = getBlockType("acacia_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> ACACIA_WALL_SIGN = getBlockType("acacia_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> ACACIA_WOOD = getBlockType("acacia_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<RedstoneRail> ACTIVATOR_RAIL = getBlockType("activator_rail");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> AIR = getBlockType("air");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ALLIUM = getBlockType("allium");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> AMETHYST_BLOCK = getBlockType("amethyst_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<AmethystCluster> AMETHYST_CLUSTER = getBlockType("amethyst_cluster");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ANCIENT_DEBRIS = getBlockType("ancient_debris");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ANDESITE = getBlockType("andesite");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> ANDESITE_SLAB = getBlockType("andesite_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> ANDESITE_STAIRS = getBlockType("andesite_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> ANDESITE_WALL = getBlockType("andesite_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> ANVIL = getBlockType("anvil");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> ATTACHED_MELON_STEM = getBlockType("attached_melon_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> ATTACHED_PUMPKIN_STEM = getBlockType("attached_pumpkin_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> AZALEA = getBlockType("azalea");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> AZALEA_LEAVES = getBlockType("azalea_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> AZURE_BLUET = getBlockType("azure_bluet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bamboo> BAMBOO = getBlockType("bamboo");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> BAMBOO_BLOCK = getBlockType("bamboo_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> BAMBOO_BUTTON = getBlockType("bamboo_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> BAMBOO_DOOR = getBlockType("bamboo_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> BAMBOO_FENCE = getBlockType("bamboo_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> BAMBOO_FENCE_GATE = getBlockType("bamboo_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> BAMBOO_HANGING_SIGN = getBlockType("bamboo_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BAMBOO_MOSAIC = getBlockType("bamboo_mosaic");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> BAMBOO_MOSAIC_SLAB = getBlockType("bamboo_mosaic_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> BAMBOO_MOSAIC_STAIRS = getBlockType("bamboo_mosaic_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BAMBOO_PLANKS = getBlockType("bamboo_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> BAMBOO_PRESSURE_PLATE = getBlockType("bamboo_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BAMBOO_SAPLING = getBlockType("bamboo_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> BAMBOO_SHELF = getBlockType("bamboo_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> BAMBOO_SIGN = getBlockType("bamboo_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> BAMBOO_SLAB = getBlockType("bamboo_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> BAMBOO_STAIRS = getBlockType("bamboo_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> BAMBOO_TRAPDOOR = getBlockType("bamboo_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> BAMBOO_WALL_HANGING_SIGN = getBlockType("bamboo_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> BAMBOO_WALL_SIGN = getBlockType("bamboo_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Barrel> BARREL = getBlockType("barrel");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> BARRIER = getBlockType("barrier");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> BASALT = getBlockType("basalt");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BEACON = getBlockType("beacon");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BEDROCK = getBlockType("bedrock");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Beehive> BEE_NEST = getBlockType("bee_nest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Beehive> BEEHIVE = getBlockType("beehive");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> BEETROOTS = getBlockType("beetroots");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bell> BELL = getBlockType("bell");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BigDripleaf> BIG_DRIPLEAF = getBlockType("big_dripleaf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Dripleaf> BIG_DRIPLEAF_STEM = getBlockType("big_dripleaf_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> BIRCH_BUTTON = getBlockType("birch_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> BIRCH_DOOR = getBlockType("birch_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> BIRCH_FENCE = getBlockType("birch_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> BIRCH_FENCE_GATE = getBlockType("birch_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> BIRCH_HANGING_SIGN = getBlockType("birch_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> BIRCH_LEAVES = getBlockType("birch_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> BIRCH_LOG = getBlockType("birch_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BIRCH_PLANKS = getBlockType("birch_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> BIRCH_PRESSURE_PLATE = getBlockType("birch_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sapling> BIRCH_SAPLING = getBlockType("birch_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> BIRCH_SHELF = getBlockType("birch_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> BIRCH_SIGN = getBlockType("birch_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> BIRCH_SLAB = getBlockType("birch_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> BIRCH_STAIRS = getBlockType("birch_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> BIRCH_TRAPDOOR = getBlockType("birch_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> BIRCH_WALL_HANGING_SIGN = getBlockType("birch_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> BIRCH_WALL_SIGN = getBlockType("birch_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> BIRCH_WOOD = getBlockType("birch_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> BLACK_BANNER = getBlockType("black_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> BLACK_BED = getBlockType("black_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> BLACK_CANDLE = getBlockType("black_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> BLACK_CANDLE_CAKE = getBlockType("black_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLACK_CARPET = getBlockType("black_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLACK_CONCRETE = getBlockType("black_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLACK_CONCRETE_POWDER = getBlockType("black_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BLACK_GLAZED_TERRACOTTA = getBlockType("black_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BLACK_SHULKER_BOX = getBlockType("black_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLACK_STAINED_GLASS = getBlockType("black_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> BLACK_STAINED_GLASS_PANE = getBlockType("black_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLACK_TERRACOTTA = getBlockType("black_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BLACK_WALL_BANNER = getBlockType("black_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLACK_WOOL = getBlockType("black_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLACKSTONE = getBlockType("blackstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> BLACKSTONE_SLAB = getBlockType("blackstone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> BLACKSTONE_STAIRS = getBlockType("blackstone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> BLACKSTONE_WALL = getBlockType("blackstone_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Furnace> BLAST_FURNACE = getBlockType("blast_furnace");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> BLUE_BANNER = getBlockType("blue_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> BLUE_BED = getBlockType("blue_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> BLUE_CANDLE = getBlockType("blue_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> BLUE_CANDLE_CAKE = getBlockType("blue_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLUE_CARPET = getBlockType("blue_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLUE_CONCRETE = getBlockType("blue_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLUE_CONCRETE_POWDER = getBlockType("blue_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BLUE_GLAZED_TERRACOTTA = getBlockType("blue_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLUE_ICE = getBlockType("blue_ice");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLUE_ORCHID = getBlockType("blue_orchid");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BLUE_SHULKER_BOX = getBlockType("blue_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLUE_STAINED_GLASS = getBlockType("blue_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> BLUE_STAINED_GLASS_PANE = getBlockType("blue_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLUE_TERRACOTTA = getBlockType("blue_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BLUE_WALL_BANNER = getBlockType("blue_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BLUE_WOOL = getBlockType("blue_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> BONE_BLOCK = getBlockType("bone_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BOOKSHELF = getBlockType("bookshelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> BRAIN_CORAL = getBlockType("brain_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BRAIN_CORAL_BLOCK = getBlockType("brain_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> BRAIN_CORAL_FAN = getBlockType("brain_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> BRAIN_CORAL_WALL_FAN = getBlockType("brain_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BrewingStand> BREWING_STAND = getBlockType("brewing_stand");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> BRICK_SLAB = getBlockType("brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> BRICK_STAIRS = getBlockType("brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> BRICK_WALL = getBlockType("brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BRICKS = getBlockType("bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> BROWN_BANNER = getBlockType("brown_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> BROWN_BED = getBlockType("brown_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> BROWN_CANDLE = getBlockType("brown_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> BROWN_CANDLE_CAKE = getBlockType("brown_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BROWN_CARPET = getBlockType("brown_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BROWN_CONCRETE = getBlockType("brown_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BROWN_CONCRETE_POWDER = getBlockType("brown_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BROWN_GLAZED_TERRACOTTA = getBlockType("brown_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BROWN_MUSHROOM = getBlockType("brown_mushroom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<MultipleFacing> BROWN_MUSHROOM_BLOCK = getBlockType("brown_mushroom_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BROWN_SHULKER_BOX = getBlockType("brown_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BROWN_STAINED_GLASS = getBlockType("brown_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> BROWN_STAINED_GLASS_PANE = getBlockType("brown_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BROWN_TERRACOTTA = getBlockType("brown_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> BROWN_WALL_BANNER = getBlockType("brown_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BROWN_WOOL = getBlockType("brown_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BubbleColumn> BUBBLE_COLUMN = getBlockType("bubble_column");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> BUBBLE_CORAL = getBlockType("bubble_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BUBBLE_CORAL_BLOCK = getBlockType("bubble_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> BUBBLE_CORAL_FAN = getBlockType("bubble_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> BUBBLE_CORAL_WALL_FAN = getBlockType("bubble_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> BUDDING_AMETHYST = getBlockType("budding_amethyst");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<BlockData> BUSH = getBlockType("bush");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> CACTUS = getBlockType("cactus");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<BlockData> CACTUS_FLOWER = getBlockType("cactus_flower");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Cake> CAKE = getBlockType("cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CALCITE = getBlockType("calcite");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CalibratedSculkSensor> CALIBRATED_SCULK_SENSOR = getBlockType("calibrated_sculk_sensor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Campfire> CAMPFIRE = getBlockType("campfire");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> CANDLE = getBlockType("candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> CANDLE_CAKE = getBlockType("candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> CARROTS = getBlockType("carrots");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CARTOGRAPHY_TABLE = getBlockType("cartography_table");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> CARVED_PUMPKIN = getBlockType("carved_pumpkin");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CAULDRON = getBlockType("cauldron");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CAVE_AIR = getBlockType("cave_air");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CaveVines> CAVE_VINES = getBlockType("cave_vines");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CaveVinesPlant> CAVE_VINES_PLANT = getBlockType("cave_vines_plant");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CommandBlock> CHAIN_COMMAND_BLOCK = getBlockType("chain_command_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> CHERRY_BUTTON = getBlockType("cherry_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> CHERRY_DOOR = getBlockType("cherry_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> CHERRY_FENCE = getBlockType("cherry_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> CHERRY_FENCE_GATE = getBlockType("cherry_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> CHERRY_HANGING_SIGN = getBlockType("cherry_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> CHERRY_LEAVES = getBlockType("cherry_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> CHERRY_LOG = getBlockType("cherry_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHERRY_PLANKS = getBlockType("cherry_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> CHERRY_PRESSURE_PLATE = getBlockType("cherry_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sapling> CHERRY_SAPLING = getBlockType("cherry_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> CHERRY_SHELF = getBlockType("cherry_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> CHERRY_SIGN = getBlockType("cherry_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> CHERRY_SLAB = getBlockType("cherry_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> CHERRY_STAIRS = getBlockType("cherry_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> CHERRY_TRAPDOOR = getBlockType("cherry_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> CHERRY_WALL_HANGING_SIGN = getBlockType("cherry_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> CHERRY_WALL_SIGN = getBlockType("cherry_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> CHERRY_WOOD = getBlockType("cherry_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Chest> CHEST = getBlockType("chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> CHIPPED_ANVIL = getBlockType("chipped_anvil");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<ChiseledBookshelf> CHISELED_BOOKSHELF = getBlockType("chiseled_bookshelf");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> CHISELED_CINNABAR = getBlockType("chiseled_cinnabar");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_COPPER = getBlockType("chiseled_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_DEEPSLATE = getBlockType("chiseled_deepslate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_NETHER_BRICKS = getBlockType("chiseled_nether_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_POLISHED_BLACKSTONE = getBlockType("chiseled_polished_blackstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_QUARTZ_BLOCK = getBlockType("chiseled_quartz_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_RED_SANDSTONE = getBlockType("chiseled_red_sandstone");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<BlockData> CHISELED_RESIN_BRICKS = getBlockType("chiseled_resin_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_SANDSTONE = getBlockType("chiseled_sandstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_STONE_BRICKS = getBlockType("chiseled_stone_bricks");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> CHISELED_SULFUR = getBlockType("chiseled_sulfur");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_TUFF = getBlockType("chiseled_tuff");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CHISELED_TUFF_BRICKS = getBlockType("chiseled_tuff_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> CHORUS_FLOWER = getBlockType("chorus_flower");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<MultipleFacing> CHORUS_PLANT = getBlockType("chorus_plant");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> CINNABAR = getBlockType("cinnabar");

    /**
     * @since 26.2
     */
    BlockType.Typed<Slab> CINNABAR_BRICK_SLAB = getBlockType("cinnabar_brick_slab");

    /**
     * @since 26.2
     */
    BlockType.Typed<Stairs> CINNABAR_BRICK_STAIRS = getBlockType("cinnabar_brick_stairs");

    /**
     * @since 26.2
     */
    BlockType.Typed<Wall> CINNABAR_BRICK_WALL = getBlockType("cinnabar_brick_wall");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> CINNABAR_BRICKS = getBlockType("cinnabar_bricks");

    /**
     * @since 26.2
     */
    BlockType.Typed<Slab> CINNABAR_SLAB = getBlockType("cinnabar_slab");

    /**
     * @since 26.2
     */
    BlockType.Typed<Stairs> CINNABAR_STAIRS = getBlockType("cinnabar_stairs");

    /**
     * @since 26.2
     */
    BlockType.Typed<Wall> CINNABAR_WALL = getBlockType("cinnabar_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CLAY = getBlockType("clay");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<BlockData> CLOSED_EYEBLOSSOM = getBlockType("closed_eyeblossom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> COAL_BLOCK = getBlockType("coal_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> COAL_ORE = getBlockType("coal_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> COARSE_DIRT = getBlockType("coarse_dirt");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> COBBLED_DEEPSLATE = getBlockType("cobbled_deepslate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> COBBLED_DEEPSLATE_SLAB = getBlockType("cobbled_deepslate_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> COBBLED_DEEPSLATE_STAIRS = getBlockType("cobbled_deepslate_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> COBBLED_DEEPSLATE_WALL = getBlockType("cobbled_deepslate_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> COBBLESTONE = getBlockType("cobblestone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> COBBLESTONE_SLAB = getBlockType("cobblestone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> COBBLESTONE_STAIRS = getBlockType("cobblestone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> COBBLESTONE_WALL = getBlockType("cobblestone_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> COBWEB = getBlockType("cobweb");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Cocoa> COCOA = getBlockType("cocoa");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CommandBlock> COMMAND_BLOCK = getBlockType("command_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Comparator> COMPARATOR = getBlockType("comparator");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Levelled> COMPOSTER = getBlockType("composter");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> CONDUIT = getBlockType("conduit");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Fence> COPPER_BARS = getBlockType("copper_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> COPPER_BLOCK = getBlockType("copper_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CopperBulb> COPPER_BULB = getBlockType("copper_bulb");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> COPPER_CHAIN = getBlockType("copper_chain");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chest> COPPER_CHEST = getBlockType("copper_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> COPPER_DOOR = getBlockType("copper_door");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<CopperGolemStatue> COPPER_GOLEM_STATUE = getBlockType("copper_golem_statue");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> COPPER_GRATE = getBlockType("copper_grate");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Lantern> COPPER_LANTERN = getBlockType("copper_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> COPPER_ORE = getBlockType("copper_ore");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<BlockData> COPPER_TORCH = getBlockType("copper_torch");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> COPPER_TRAPDOOR = getBlockType("copper_trapdoor");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Directional> COPPER_WALL_TORCH = getBlockType("copper_wall_torch");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CORNFLOWER = getBlockType("cornflower");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRACKED_DEEPSLATE_BRICKS = getBlockType("cracked_deepslate_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRACKED_DEEPSLATE_TILES = getBlockType("cracked_deepslate_tiles");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRACKED_NETHER_BRICKS = getBlockType("cracked_nether_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRACKED_POLISHED_BLACKSTONE_BRICKS = getBlockType("cracked_polished_blackstone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRACKED_STONE_BRICKS = getBlockType("cracked_stone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Crafter> CRAFTER = getBlockType("crafter");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRAFTING_TABLE = getBlockType("crafting_table");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<CreakingHeart> CREAKING_HEART = getBlockType("creaking_heart");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Skull> CREEPER_HEAD = getBlockType("creeper_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSkull> CREEPER_WALL_HEAD = getBlockType("creeper_wall_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> CRIMSON_BUTTON = getBlockType("crimson_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> CRIMSON_DOOR = getBlockType("crimson_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> CRIMSON_FENCE = getBlockType("crimson_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> CRIMSON_FENCE_GATE = getBlockType("crimson_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRIMSON_FUNGUS = getBlockType("crimson_fungus");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> CRIMSON_HANGING_SIGN = getBlockType("crimson_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> CRIMSON_HYPHAE = getBlockType("crimson_hyphae");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRIMSON_NYLIUM = getBlockType("crimson_nylium");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRIMSON_PLANKS = getBlockType("crimson_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> CRIMSON_PRESSURE_PLATE = getBlockType("crimson_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRIMSON_ROOTS = getBlockType("crimson_roots");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> CRIMSON_SHELF = getBlockType("crimson_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> CRIMSON_SIGN = getBlockType("crimson_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> CRIMSON_SLAB = getBlockType("crimson_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> CRIMSON_STAIRS = getBlockType("crimson_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> CRIMSON_STEM = getBlockType("crimson_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> CRIMSON_TRAPDOOR = getBlockType("crimson_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> CRIMSON_WALL_HANGING_SIGN = getBlockType("crimson_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> CRIMSON_WALL_SIGN = getBlockType("crimson_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CRYING_OBSIDIAN = getBlockType("crying_obsidian");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CUT_COPPER = getBlockType("cut_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> CUT_COPPER_SLAB = getBlockType("cut_copper_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> CUT_COPPER_STAIRS = getBlockType("cut_copper_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CUT_RED_SANDSTONE = getBlockType("cut_red_sandstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> CUT_RED_SANDSTONE_SLAB = getBlockType("cut_red_sandstone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CUT_SANDSTONE = getBlockType("cut_sandstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> CUT_SANDSTONE_SLAB = getBlockType("cut_sandstone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> CYAN_BANNER = getBlockType("cyan_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> CYAN_BED = getBlockType("cyan_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> CYAN_CANDLE = getBlockType("cyan_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> CYAN_CANDLE_CAKE = getBlockType("cyan_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CYAN_CARPET = getBlockType("cyan_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CYAN_CONCRETE = getBlockType("cyan_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CYAN_CONCRETE_POWDER = getBlockType("cyan_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> CYAN_GLAZED_TERRACOTTA = getBlockType("cyan_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> CYAN_SHULKER_BOX = getBlockType("cyan_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CYAN_STAINED_GLASS = getBlockType("cyan_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> CYAN_STAINED_GLASS_PANE = getBlockType("cyan_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CYAN_TERRACOTTA = getBlockType("cyan_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> CYAN_WALL_BANNER = getBlockType("cyan_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> CYAN_WOOL = getBlockType("cyan_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> DAMAGED_ANVIL = getBlockType("damaged_anvil");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DANDELION = getBlockType("dandelion");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> DARK_OAK_BUTTON = getBlockType("dark_oak_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> DARK_OAK_DOOR = getBlockType("dark_oak_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> DARK_OAK_FENCE = getBlockType("dark_oak_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> DARK_OAK_FENCE_GATE = getBlockType("dark_oak_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> DARK_OAK_HANGING_SIGN = getBlockType("dark_oak_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> DARK_OAK_LEAVES = getBlockType("dark_oak_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> DARK_OAK_LOG = getBlockType("dark_oak_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DARK_OAK_PLANKS = getBlockType("dark_oak_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> DARK_OAK_PRESSURE_PLATE = getBlockType("dark_oak_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sapling> DARK_OAK_SAPLING = getBlockType("dark_oak_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> DARK_OAK_SHELF = getBlockType("dark_oak_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> DARK_OAK_SIGN = getBlockType("dark_oak_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> DARK_OAK_SLAB = getBlockType("dark_oak_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> DARK_OAK_STAIRS = getBlockType("dark_oak_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> DARK_OAK_TRAPDOOR = getBlockType("dark_oak_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> DARK_OAK_WALL_HANGING_SIGN = getBlockType("dark_oak_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> DARK_OAK_WALL_SIGN = getBlockType("dark_oak_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> DARK_OAK_WOOD = getBlockType("dark_oak_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DARK_PRISMARINE = getBlockType("dark_prismarine");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> DARK_PRISMARINE_SLAB = getBlockType("dark_prismarine_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> DARK_PRISMARINE_STAIRS = getBlockType("dark_prismarine_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<DaylightDetector> DAYLIGHT_DETECTOR = getBlockType("daylight_detector");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_BRAIN_CORAL = getBlockType("dead_brain_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEAD_BRAIN_CORAL_BLOCK = getBlockType("dead_brain_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_BRAIN_CORAL_FAN = getBlockType("dead_brain_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> DEAD_BRAIN_CORAL_WALL_FAN = getBlockType("dead_brain_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_BUBBLE_CORAL = getBlockType("dead_bubble_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEAD_BUBBLE_CORAL_BLOCK = getBlockType("dead_bubble_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_BUBBLE_CORAL_FAN = getBlockType("dead_bubble_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> DEAD_BUBBLE_CORAL_WALL_FAN = getBlockType("dead_bubble_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEAD_BUSH = getBlockType("dead_bush");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_FIRE_CORAL = getBlockType("dead_fire_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEAD_FIRE_CORAL_BLOCK = getBlockType("dead_fire_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_FIRE_CORAL_FAN = getBlockType("dead_fire_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> DEAD_FIRE_CORAL_WALL_FAN = getBlockType("dead_fire_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_HORN_CORAL = getBlockType("dead_horn_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEAD_HORN_CORAL_BLOCK = getBlockType("dead_horn_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_HORN_CORAL_FAN = getBlockType("dead_horn_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> DEAD_HORN_CORAL_WALL_FAN = getBlockType("dead_horn_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_TUBE_CORAL = getBlockType("dead_tube_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEAD_TUBE_CORAL_BLOCK = getBlockType("dead_tube_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> DEAD_TUBE_CORAL_FAN = getBlockType("dead_tube_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> DEAD_TUBE_CORAL_WALL_FAN = getBlockType("dead_tube_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<DecoratedPot> DECORATED_POT = getBlockType("decorated_pot");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> DEEPSLATE = getBlockType("deepslate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> DEEPSLATE_BRICK_SLAB = getBlockType("deepslate_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> DEEPSLATE_BRICK_STAIRS = getBlockType("deepslate_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> DEEPSLATE_BRICK_WALL = getBlockType("deepslate_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_BRICKS = getBlockType("deepslate_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_COAL_ORE = getBlockType("deepslate_coal_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_COPPER_ORE = getBlockType("deepslate_copper_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_DIAMOND_ORE = getBlockType("deepslate_diamond_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_EMERALD_ORE = getBlockType("deepslate_emerald_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_GOLD_ORE = getBlockType("deepslate_gold_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_IRON_ORE = getBlockType("deepslate_iron_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_LAPIS_ORE = getBlockType("deepslate_lapis_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> DEEPSLATE_REDSTONE_ORE = getBlockType("deepslate_redstone_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> DEEPSLATE_TILE_SLAB = getBlockType("deepslate_tile_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> DEEPSLATE_TILE_STAIRS = getBlockType("deepslate_tile_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> DEEPSLATE_TILE_WALL = getBlockType("deepslate_tile_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DEEPSLATE_TILES = getBlockType("deepslate_tiles");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<RedstoneRail> DETECTOR_RAIL = getBlockType("detector_rail");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DIAMOND_BLOCK = getBlockType("diamond_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DIAMOND_ORE = getBlockType("diamond_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DIORITE = getBlockType("diorite");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> DIORITE_SLAB = getBlockType("diorite_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> DIORITE_STAIRS = getBlockType("diorite_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> DIORITE_WALL = getBlockType("diorite_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DIRT = getBlockType("dirt");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DIRT_PATH = getBlockType("dirt_path");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Dispenser> DISPENSER = getBlockType("dispenser");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DRAGON_EGG = getBlockType("dragon_egg");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Skull> DRAGON_HEAD = getBlockType("dragon_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSkull> DRAGON_WALL_HEAD = getBlockType("dragon_wall_head");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<DriedGhast> DRIED_GHAST = getBlockType("dried_ghast");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DRIED_KELP_BLOCK = getBlockType("dried_kelp_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> DRIPSTONE_BLOCK = getBlockType("dripstone_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Dispenser> DROPPER = getBlockType("dropper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> EMERALD_BLOCK = getBlockType("emerald_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> EMERALD_ORE = getBlockType("emerald_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ENCHANTING_TABLE = getBlockType("enchanting_table");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> END_GATEWAY = getBlockType("end_gateway");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> END_PORTAL = getBlockType("end_portal");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<EndPortalFrame> END_PORTAL_FRAME = getBlockType("end_portal_frame");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> END_ROD = getBlockType("end_rod");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> END_STONE = getBlockType("end_stone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> END_STONE_BRICK_SLAB = getBlockType("end_stone_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> END_STONE_BRICK_STAIRS = getBlockType("end_stone_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> END_STONE_BRICK_WALL = getBlockType("end_stone_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> END_STONE_BRICKS = getBlockType("end_stone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<EnderChest> ENDER_CHEST = getBlockType("ender_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> EXPOSED_CHISELED_COPPER = getBlockType("exposed_chiseled_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> EXPOSED_COPPER = getBlockType("exposed_copper");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Fence> EXPOSED_COPPER_BARS = getBlockType("exposed_copper_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CopperBulb> EXPOSED_COPPER_BULB = getBlockType("exposed_copper_bulb");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> EXPOSED_COPPER_CHAIN = getBlockType("exposed_copper_chain");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chest> EXPOSED_COPPER_CHEST = getBlockType("exposed_copper_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> EXPOSED_COPPER_DOOR = getBlockType("exposed_copper_door");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<CopperGolemStatue> EXPOSED_COPPER_GOLEM_STATUE = getBlockType("exposed_copper_golem_statue");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> EXPOSED_COPPER_GRATE = getBlockType("exposed_copper_grate");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Lantern> EXPOSED_COPPER_LANTERN = getBlockType("exposed_copper_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> EXPOSED_COPPER_TRAPDOOR = getBlockType("exposed_copper_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> EXPOSED_CUT_COPPER = getBlockType("exposed_cut_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> EXPOSED_CUT_COPPER_SLAB = getBlockType("exposed_cut_copper_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> EXPOSED_CUT_COPPER_STAIRS = getBlockType("exposed_cut_copper_stairs");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<LightningRod> EXPOSED_LIGHTNING_ROD = getBlockType("exposed_lightning_rod");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Farmland> FARMLAND = getBlockType("farmland");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> FERN = getBlockType("fern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fire> FIRE = getBlockType("fire");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> FIRE_CORAL = getBlockType("fire_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> FIRE_CORAL_BLOCK = getBlockType("fire_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> FIRE_CORAL_FAN = getBlockType("fire_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> FIRE_CORAL_WALL_FAN = getBlockType("fire_coral_wall_fan");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<BlockData> FIREFLY_BUSH = getBlockType("firefly_bush");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> FLETCHING_TABLE = getBlockType("fletching_table");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> FLOWER_POT = getBlockType("flower_pot");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> FLOWERING_AZALEA = getBlockType("flowering_azalea");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> FLOWERING_AZALEA_LEAVES = getBlockType("flowering_azalea_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> FROGSPAWN = getBlockType("frogspawn");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> FROSTED_ICE = getBlockType("frosted_ice");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Furnace> FURNACE = getBlockType("furnace");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GILDED_BLACKSTONE = getBlockType("gilded_blackstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GLASS = getBlockType("glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> GLASS_PANE = getBlockType("glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlowLichen> GLOW_LICHEN = getBlockType("glow_lichen");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GLOWSTONE = getBlockType("glowstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GOLD_BLOCK = getBlockType("gold_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GOLD_ORE = getBlockType("gold_ore");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> GOLDEN_DANDELION = getBlockType("golden_dandelion");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GRANITE = getBlockType("granite");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> GRANITE_SLAB = getBlockType("granite_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> GRANITE_STAIRS = getBlockType("granite_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> GRANITE_WALL = getBlockType("granite_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Snowable> GRASS_BLOCK = getBlockType("grass_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GRAVEL = getBlockType("gravel");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> GRAY_BANNER = getBlockType("gray_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> GRAY_BED = getBlockType("gray_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> GRAY_CANDLE = getBlockType("gray_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> GRAY_CANDLE_CAKE = getBlockType("gray_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GRAY_CARPET = getBlockType("gray_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GRAY_CONCRETE = getBlockType("gray_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GRAY_CONCRETE_POWDER = getBlockType("gray_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> GRAY_GLAZED_TERRACOTTA = getBlockType("gray_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> GRAY_SHULKER_BOX = getBlockType("gray_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GRAY_STAINED_GLASS = getBlockType("gray_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> GRAY_STAINED_GLASS_PANE = getBlockType("gray_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GRAY_TERRACOTTA = getBlockType("gray_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> GRAY_WALL_BANNER = getBlockType("gray_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GRAY_WOOL = getBlockType("gray_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> GREEN_BANNER = getBlockType("green_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> GREEN_BED = getBlockType("green_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> GREEN_CANDLE = getBlockType("green_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> GREEN_CANDLE_CAKE = getBlockType("green_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GREEN_CARPET = getBlockType("green_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GREEN_CONCRETE = getBlockType("green_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GREEN_CONCRETE_POWDER = getBlockType("green_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> GREEN_GLAZED_TERRACOTTA = getBlockType("green_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> GREEN_SHULKER_BOX = getBlockType("green_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GREEN_STAINED_GLASS = getBlockType("green_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> GREEN_STAINED_GLASS_PANE = getBlockType("green_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GREEN_TERRACOTTA = getBlockType("green_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> GREEN_WALL_BANNER = getBlockType("green_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> GREEN_WOOL = getBlockType("green_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Grindstone> GRINDSTONE = getBlockType("grindstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> HANGING_ROOTS = getBlockType("hanging_roots");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> HAY_BLOCK = getBlockType("hay_block");

    /**
     * @since 1.21.1
     */
    BlockType.Typed<Waterlogged> HEAVY_CORE = getBlockType("heavy_core");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<AnaloguePowerable> HEAVY_WEIGHTED_PRESSURE_PLATE = getBlockType("heavy_weighted_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> HONEY_BLOCK = getBlockType("honey_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> HONEYCOMB_BLOCK = getBlockType("honeycomb_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Hopper> HOPPER = getBlockType("hopper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> HORN_CORAL = getBlockType("horn_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> HORN_CORAL_BLOCK = getBlockType("horn_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> HORN_CORAL_FAN = getBlockType("horn_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> HORN_CORAL_WALL_FAN = getBlockType("horn_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ICE = getBlockType("ice");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> INFESTED_CHISELED_STONE_BRICKS = getBlockType("infested_chiseled_stone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> INFESTED_COBBLESTONE = getBlockType("infested_cobblestone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> INFESTED_CRACKED_STONE_BRICKS = getBlockType("infested_cracked_stone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> INFESTED_DEEPSLATE = getBlockType("infested_deepslate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> INFESTED_MOSSY_STONE_BRICKS = getBlockType("infested_mossy_stone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> INFESTED_STONE = getBlockType("infested_stone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> INFESTED_STONE_BRICKS = getBlockType("infested_stone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> IRON_BARS = getBlockType("iron_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> IRON_BLOCK = getBlockType("iron_block");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> IRON_CHAIN = getBlockType("iron_chain");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> IRON_DOOR = getBlockType("iron_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> IRON_ORE = getBlockType("iron_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> IRON_TRAPDOOR = getBlockType("iron_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> JACK_O_LANTERN = getBlockType("jack_o_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Jigsaw> JIGSAW = getBlockType("jigsaw");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Jukebox> JUKEBOX = getBlockType("jukebox");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> JUNGLE_BUTTON = getBlockType("jungle_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> JUNGLE_DOOR = getBlockType("jungle_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> JUNGLE_FENCE = getBlockType("jungle_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> JUNGLE_FENCE_GATE = getBlockType("jungle_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> JUNGLE_HANGING_SIGN = getBlockType("jungle_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> JUNGLE_LEAVES = getBlockType("jungle_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> JUNGLE_LOG = getBlockType("jungle_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> JUNGLE_PLANKS = getBlockType("jungle_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> JUNGLE_PRESSURE_PLATE = getBlockType("jungle_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sapling> JUNGLE_SAPLING = getBlockType("jungle_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> JUNGLE_SHELF = getBlockType("jungle_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> JUNGLE_SIGN = getBlockType("jungle_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> JUNGLE_SLAB = getBlockType("jungle_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> JUNGLE_STAIRS = getBlockType("jungle_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> JUNGLE_TRAPDOOR = getBlockType("jungle_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> JUNGLE_WALL_HANGING_SIGN = getBlockType("jungle_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> JUNGLE_WALL_SIGN = getBlockType("jungle_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> JUNGLE_WOOD = getBlockType("jungle_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> KELP = getBlockType("kelp");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> KELP_PLANT = getBlockType("kelp_plant");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ladder> LADDER = getBlockType("ladder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lantern> LANTERN = getBlockType("lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LAPIS_BLOCK = getBlockType("lapis_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LAPIS_ORE = getBlockType("lapis_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<AmethystCluster> LARGE_AMETHYST_BUD = getBlockType("large_amethyst_bud");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bisected> LARGE_FERN = getBlockType("large_fern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Levelled> LAVA = getBlockType("lava");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LAVA_CAULDRON = getBlockType("lava_cauldron");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<LeafLitter> LEAF_LITTER = getBlockType("leaf_litter");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lectern> LECTERN = getBlockType("lectern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> LEVER = getBlockType("lever");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Light> LIGHT = getBlockType("light");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> LIGHT_BLUE_BANNER = getBlockType("light_blue_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> LIGHT_BLUE_BED = getBlockType("light_blue_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> LIGHT_BLUE_CANDLE = getBlockType("light_blue_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> LIGHT_BLUE_CANDLE_CAKE = getBlockType("light_blue_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_BLUE_CARPET = getBlockType("light_blue_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_BLUE_CONCRETE = getBlockType("light_blue_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_BLUE_CONCRETE_POWDER = getBlockType("light_blue_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIGHT_BLUE_GLAZED_TERRACOTTA = getBlockType("light_blue_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIGHT_BLUE_SHULKER_BOX = getBlockType("light_blue_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_BLUE_STAINED_GLASS = getBlockType("light_blue_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> LIGHT_BLUE_STAINED_GLASS_PANE = getBlockType("light_blue_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_BLUE_TERRACOTTA = getBlockType("light_blue_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIGHT_BLUE_WALL_BANNER = getBlockType("light_blue_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_BLUE_WOOL = getBlockType("light_blue_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> LIGHT_GRAY_BANNER = getBlockType("light_gray_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> LIGHT_GRAY_BED = getBlockType("light_gray_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> LIGHT_GRAY_CANDLE = getBlockType("light_gray_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> LIGHT_GRAY_CANDLE_CAKE = getBlockType("light_gray_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_GRAY_CARPET = getBlockType("light_gray_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_GRAY_CONCRETE = getBlockType("light_gray_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_GRAY_CONCRETE_POWDER = getBlockType("light_gray_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIGHT_GRAY_GLAZED_TERRACOTTA = getBlockType("light_gray_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIGHT_GRAY_SHULKER_BOX = getBlockType("light_gray_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_GRAY_STAINED_GLASS = getBlockType("light_gray_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> LIGHT_GRAY_STAINED_GLASS_PANE = getBlockType("light_gray_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_GRAY_TERRACOTTA = getBlockType("light_gray_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIGHT_GRAY_WALL_BANNER = getBlockType("light_gray_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIGHT_GRAY_WOOL = getBlockType("light_gray_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<AnaloguePowerable> LIGHT_WEIGHTED_PRESSURE_PLATE = getBlockType("light_weighted_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<LightningRod> LIGHTNING_ROD = getBlockType("lightning_rod");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bisected> LILAC = getBlockType("lilac");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LILY_OF_THE_VALLEY = getBlockType("lily_of_the_valley");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LILY_PAD = getBlockType("lily_pad");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> LIME_BANNER = getBlockType("lime_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> LIME_BED = getBlockType("lime_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> LIME_CANDLE = getBlockType("lime_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> LIME_CANDLE_CAKE = getBlockType("lime_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIME_CARPET = getBlockType("lime_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIME_CONCRETE = getBlockType("lime_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIME_CONCRETE_POWDER = getBlockType("lime_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIME_GLAZED_TERRACOTTA = getBlockType("lime_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIME_SHULKER_BOX = getBlockType("lime_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIME_STAINED_GLASS = getBlockType("lime_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> LIME_STAINED_GLASS_PANE = getBlockType("lime_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIME_TERRACOTTA = getBlockType("lime_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LIME_WALL_BANNER = getBlockType("lime_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LIME_WOOL = getBlockType("lime_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> LODESTONE = getBlockType("lodestone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> LOOM = getBlockType("loom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> MAGENTA_BANNER = getBlockType("magenta_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> MAGENTA_BED = getBlockType("magenta_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> MAGENTA_CANDLE = getBlockType("magenta_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> MAGENTA_CANDLE_CAKE = getBlockType("magenta_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MAGENTA_CARPET = getBlockType("magenta_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MAGENTA_CONCRETE = getBlockType("magenta_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MAGENTA_CONCRETE_POWDER = getBlockType("magenta_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> MAGENTA_GLAZED_TERRACOTTA = getBlockType("magenta_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> MAGENTA_SHULKER_BOX = getBlockType("magenta_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MAGENTA_STAINED_GLASS = getBlockType("magenta_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> MAGENTA_STAINED_GLASS_PANE = getBlockType("magenta_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MAGENTA_TERRACOTTA = getBlockType("magenta_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> MAGENTA_WALL_BANNER = getBlockType("magenta_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MAGENTA_WOOL = getBlockType("magenta_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MAGMA_BLOCK = getBlockType("magma_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> MANGROVE_BUTTON = getBlockType("mangrove_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> MANGROVE_DOOR = getBlockType("mangrove_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> MANGROVE_FENCE = getBlockType("mangrove_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> MANGROVE_FENCE_GATE = getBlockType("mangrove_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> MANGROVE_HANGING_SIGN = getBlockType("mangrove_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> MANGROVE_LEAVES = getBlockType("mangrove_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> MANGROVE_LOG = getBlockType("mangrove_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MANGROVE_PLANKS = getBlockType("mangrove_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> MANGROVE_PRESSURE_PLATE = getBlockType("mangrove_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<MangrovePropagule> MANGROVE_PROPAGULE = getBlockType("mangrove_propagule");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> MANGROVE_ROOTS = getBlockType("mangrove_roots");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> MANGROVE_SHELF = getBlockType("mangrove_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> MANGROVE_SIGN = getBlockType("mangrove_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> MANGROVE_SLAB = getBlockType("mangrove_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> MANGROVE_STAIRS = getBlockType("mangrove_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> MANGROVE_TRAPDOOR = getBlockType("mangrove_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> MANGROVE_WALL_HANGING_SIGN = getBlockType("mangrove_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> MANGROVE_WALL_SIGN = getBlockType("mangrove_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> MANGROVE_WOOD = getBlockType("mangrove_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<AmethystCluster> MEDIUM_AMETHYST_BUD = getBlockType("medium_amethyst_bud");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MELON = getBlockType("melon");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> MELON_STEM = getBlockType("melon_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MOSS_BLOCK = getBlockType("moss_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MOSS_CARPET = getBlockType("moss_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MOSSY_COBBLESTONE = getBlockType("mossy_cobblestone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> MOSSY_COBBLESTONE_SLAB = getBlockType("mossy_cobblestone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> MOSSY_COBBLESTONE_STAIRS = getBlockType("mossy_cobblestone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> MOSSY_COBBLESTONE_WALL = getBlockType("mossy_cobblestone_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> MOSSY_STONE_BRICK_SLAB = getBlockType("mossy_stone_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> MOSSY_STONE_BRICK_STAIRS = getBlockType("mossy_stone_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> MOSSY_STONE_BRICK_WALL = getBlockType("mossy_stone_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MOSSY_STONE_BRICKS = getBlockType("mossy_stone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TechnicalPiston> MOVING_PISTON = getBlockType("moving_piston");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MUD = getBlockType("mud");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> MUD_BRICK_SLAB = getBlockType("mud_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> MUD_BRICK_STAIRS = getBlockType("mud_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> MUD_BRICK_WALL = getBlockType("mud_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> MUD_BRICKS = getBlockType("mud_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> MUDDY_MANGROVE_ROOTS = getBlockType("muddy_mangrove_roots");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<MultipleFacing> MUSHROOM_STEM = getBlockType("mushroom_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Snowable> MYCELIUM = getBlockType("mycelium");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> NETHER_BRICK_FENCE = getBlockType("nether_brick_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> NETHER_BRICK_SLAB = getBlockType("nether_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> NETHER_BRICK_STAIRS = getBlockType("nether_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> NETHER_BRICK_WALL = getBlockType("nether_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> NETHER_BRICKS = getBlockType("nether_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> NETHER_GOLD_ORE = getBlockType("nether_gold_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> NETHER_PORTAL = getBlockType("nether_portal");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> NETHER_QUARTZ_ORE = getBlockType("nether_quartz_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> NETHER_SPROUTS = getBlockType("nether_sprouts");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> NETHER_WART = getBlockType("nether_wart");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> NETHER_WART_BLOCK = getBlockType("nether_wart_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> NETHERITE_BLOCK = getBlockType("netherite_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> NETHERRACK = getBlockType("netherrack");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<NoteBlock> NOTE_BLOCK = getBlockType("note_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> OAK_BUTTON = getBlockType("oak_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> OAK_DOOR = getBlockType("oak_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> OAK_FENCE = getBlockType("oak_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> OAK_FENCE_GATE = getBlockType("oak_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> OAK_HANGING_SIGN = getBlockType("oak_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> OAK_LEAVES = getBlockType("oak_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> OAK_LOG = getBlockType("oak_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> OAK_PLANKS = getBlockType("oak_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> OAK_PRESSURE_PLATE = getBlockType("oak_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sapling> OAK_SAPLING = getBlockType("oak_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> OAK_SHELF = getBlockType("oak_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> OAK_SIGN = getBlockType("oak_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> OAK_SLAB = getBlockType("oak_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> OAK_STAIRS = getBlockType("oak_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> OAK_TRAPDOOR = getBlockType("oak_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> OAK_WALL_HANGING_SIGN = getBlockType("oak_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> OAK_WALL_SIGN = getBlockType("oak_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> OAK_WOOD = getBlockType("oak_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Observer> OBSERVER = getBlockType("observer");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> OBSIDIAN = getBlockType("obsidian");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> OCHRE_FROGLIGHT = getBlockType("ochre_froglight");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<BlockData> OPEN_EYEBLOSSOM = getBlockType("open_eyeblossom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> ORANGE_BANNER = getBlockType("orange_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> ORANGE_BED = getBlockType("orange_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> ORANGE_CANDLE = getBlockType("orange_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> ORANGE_CANDLE_CAKE = getBlockType("orange_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ORANGE_CARPET = getBlockType("orange_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ORANGE_CONCRETE = getBlockType("orange_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ORANGE_CONCRETE_POWDER = getBlockType("orange_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> ORANGE_GLAZED_TERRACOTTA = getBlockType("orange_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> ORANGE_SHULKER_BOX = getBlockType("orange_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ORANGE_STAINED_GLASS = getBlockType("orange_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> ORANGE_STAINED_GLASS_PANE = getBlockType("orange_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ORANGE_TERRACOTTA = getBlockType("orange_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ORANGE_TULIP = getBlockType("orange_tulip");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> ORANGE_WALL_BANNER = getBlockType("orange_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ORANGE_WOOL = getBlockType("orange_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> OXEYE_DAISY = getBlockType("oxeye_daisy");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> OXIDIZED_CHISELED_COPPER = getBlockType("oxidized_chiseled_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> OXIDIZED_COPPER = getBlockType("oxidized_copper");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Fence> OXIDIZED_COPPER_BARS = getBlockType("oxidized_copper_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CopperBulb> OXIDIZED_COPPER_BULB = getBlockType("oxidized_copper_bulb");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> OXIDIZED_COPPER_CHAIN = getBlockType("oxidized_copper_chain");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chest> OXIDIZED_COPPER_CHEST = getBlockType("oxidized_copper_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> OXIDIZED_COPPER_DOOR = getBlockType("oxidized_copper_door");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<CopperGolemStatue> OXIDIZED_COPPER_GOLEM_STATUE = getBlockType("oxidized_copper_golem_statue");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> OXIDIZED_COPPER_GRATE = getBlockType("oxidized_copper_grate");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Lantern> OXIDIZED_COPPER_LANTERN = getBlockType("oxidized_copper_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> OXIDIZED_COPPER_TRAPDOOR = getBlockType("oxidized_copper_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> OXIDIZED_CUT_COPPER = getBlockType("oxidized_cut_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> OXIDIZED_CUT_COPPER_SLAB = getBlockType("oxidized_cut_copper_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> OXIDIZED_CUT_COPPER_STAIRS = getBlockType("oxidized_cut_copper_stairs");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<LightningRod> OXIDIZED_LIGHTNING_ROD = getBlockType("oxidized_lightning_rod");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PACKED_ICE = getBlockType("packed_ice");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PACKED_MUD = getBlockType("packed_mud");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<HangingMoss> PALE_HANGING_MOSS = getBlockType("pale_hanging_moss");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<BlockData> PALE_MOSS_BLOCK = getBlockType("pale_moss_block");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<MossyCarpet> PALE_MOSS_CARPET = getBlockType("pale_moss_carpet");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Switch> PALE_OAK_BUTTON = getBlockType("pale_oak_button");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Door> PALE_OAK_DOOR = getBlockType("pale_oak_door");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Fence> PALE_OAK_FENCE = getBlockType("pale_oak_fence");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Gate> PALE_OAK_FENCE_GATE = getBlockType("pale_oak_fence_gate");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<HangingSign> PALE_OAK_HANGING_SIGN = getBlockType("pale_oak_hanging_sign");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Leaves> PALE_OAK_LEAVES = getBlockType("pale_oak_leaves");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Orientable> PALE_OAK_LOG = getBlockType("pale_oak_log");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<BlockData> PALE_OAK_PLANKS = getBlockType("pale_oak_planks");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Powerable> PALE_OAK_PRESSURE_PLATE = getBlockType("pale_oak_pressure_plate");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Sapling> PALE_OAK_SAPLING = getBlockType("pale_oak_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> PALE_OAK_SHELF = getBlockType("pale_oak_shelf");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Sign> PALE_OAK_SIGN = getBlockType("pale_oak_sign");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Slab> PALE_OAK_SLAB = getBlockType("pale_oak_slab");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Stairs> PALE_OAK_STAIRS = getBlockType("pale_oak_stairs");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<TrapDoor> PALE_OAK_TRAPDOOR = getBlockType("pale_oak_trapdoor");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<WallHangingSign> PALE_OAK_WALL_HANGING_SIGN = getBlockType("pale_oak_wall_hanging_sign");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<WallSign> PALE_OAK_WALL_SIGN = getBlockType("pale_oak_wall_sign");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Orientable> PALE_OAK_WOOD = getBlockType("pale_oak_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> PEARLESCENT_FROGLIGHT = getBlockType("pearlescent_froglight");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bisected> PEONY = getBlockType("peony");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> PETRIFIED_OAK_SLAB = getBlockType("petrified_oak_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Skull> PIGLIN_HEAD = getBlockType("piglin_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSkull> PIGLIN_WALL_HEAD = getBlockType("piglin_wall_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> PINK_BANNER = getBlockType("pink_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> PINK_BED = getBlockType("pink_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> PINK_CANDLE = getBlockType("pink_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> PINK_CANDLE_CAKE = getBlockType("pink_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PINK_CARPET = getBlockType("pink_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PINK_CONCRETE = getBlockType("pink_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PINK_CONCRETE_POWDER = getBlockType("pink_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> PINK_GLAZED_TERRACOTTA = getBlockType("pink_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<FlowerBed> PINK_PETALS = getBlockType("pink_petals");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> PINK_SHULKER_BOX = getBlockType("pink_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PINK_STAINED_GLASS = getBlockType("pink_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> PINK_STAINED_GLASS_PANE = getBlockType("pink_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PINK_TERRACOTTA = getBlockType("pink_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PINK_TULIP = getBlockType("pink_tulip");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> PINK_WALL_BANNER = getBlockType("pink_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PINK_WOOL = getBlockType("pink_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Piston> PISTON = getBlockType("piston");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<PistonHead> PISTON_HEAD = getBlockType("piston_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<PitcherCrop> PITCHER_CROP = getBlockType("pitcher_crop");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bisected> PITCHER_PLANT = getBlockType("pitcher_plant");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Skull> PLAYER_HEAD = getBlockType("player_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSkull> PLAYER_WALL_HEAD = getBlockType("player_wall_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Snowable> PODZOL = getBlockType("podzol");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Speleothem> POINTED_DRIPSTONE = getBlockType("pointed_dripstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POLISHED_ANDESITE = getBlockType("polished_andesite");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> POLISHED_ANDESITE_SLAB = getBlockType("polished_andesite_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> POLISHED_ANDESITE_STAIRS = getBlockType("polished_andesite_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> POLISHED_BASALT = getBlockType("polished_basalt");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POLISHED_BLACKSTONE = getBlockType("polished_blackstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> POLISHED_BLACKSTONE_BRICK_SLAB = getBlockType("polished_blackstone_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> POLISHED_BLACKSTONE_BRICK_STAIRS = getBlockType("polished_blackstone_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> POLISHED_BLACKSTONE_BRICK_WALL = getBlockType("polished_blackstone_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POLISHED_BLACKSTONE_BRICKS = getBlockType("polished_blackstone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> POLISHED_BLACKSTONE_BUTTON = getBlockType("polished_blackstone_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> POLISHED_BLACKSTONE_PRESSURE_PLATE = getBlockType("polished_blackstone_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> POLISHED_BLACKSTONE_SLAB = getBlockType("polished_blackstone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> POLISHED_BLACKSTONE_STAIRS = getBlockType("polished_blackstone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> POLISHED_BLACKSTONE_WALL = getBlockType("polished_blackstone_wall");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> POLISHED_CINNABAR = getBlockType("polished_cinnabar");

    /**
     * @since 26.2
     */
    BlockType.Typed<Slab> POLISHED_CINNABAR_SLAB = getBlockType("polished_cinnabar_slab");

    /**
     * @since 26.2
     */
    BlockType.Typed<Stairs> POLISHED_CINNABAR_STAIRS = getBlockType("polished_cinnabar_stairs");

    /**
     * @since 26.2
     */
    BlockType.Typed<Wall> POLISHED_CINNABAR_WALL = getBlockType("polished_cinnabar_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POLISHED_DEEPSLATE = getBlockType("polished_deepslate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> POLISHED_DEEPSLATE_SLAB = getBlockType("polished_deepslate_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> POLISHED_DEEPSLATE_STAIRS = getBlockType("polished_deepslate_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> POLISHED_DEEPSLATE_WALL = getBlockType("polished_deepslate_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POLISHED_DIORITE = getBlockType("polished_diorite");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> POLISHED_DIORITE_SLAB = getBlockType("polished_diorite_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> POLISHED_DIORITE_STAIRS = getBlockType("polished_diorite_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POLISHED_GRANITE = getBlockType("polished_granite");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> POLISHED_GRANITE_SLAB = getBlockType("polished_granite_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> POLISHED_GRANITE_STAIRS = getBlockType("polished_granite_stairs");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> POLISHED_SULFUR = getBlockType("polished_sulfur");

    /**
     * @since 26.2
     */
    BlockType.Typed<Slab> POLISHED_SULFUR_SLAB = getBlockType("polished_sulfur_slab");

    /**
     * @since 26.2
     */
    BlockType.Typed<Stairs> POLISHED_SULFUR_STAIRS = getBlockType("polished_sulfur_stairs");

    /**
     * @since 26.2
     */
    BlockType.Typed<Wall> POLISHED_SULFUR_WALL = getBlockType("polished_sulfur_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POLISHED_TUFF = getBlockType("polished_tuff");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> POLISHED_TUFF_SLAB = getBlockType("polished_tuff_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> POLISHED_TUFF_STAIRS = getBlockType("polished_tuff_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> POLISHED_TUFF_WALL = getBlockType("polished_tuff_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POPPY = getBlockType("poppy");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> POTATOES = getBlockType("potatoes");

    /**
     * @since 26.2
     */
    BlockType.Typed<PotentSulfur> POTENT_SULFUR = getBlockType("potent_sulfur");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_ACACIA_SAPLING = getBlockType("potted_acacia_sapling");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_ALLIUM = getBlockType("potted_allium");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_AZALEA_BUSH = getBlockType("potted_azalea_bush");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_AZURE_BLUET = getBlockType("potted_azure_bluet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_BAMBOO = getBlockType("potted_bamboo");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_BIRCH_SAPLING = getBlockType("potted_birch_sapling");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_BLUE_ORCHID = getBlockType("potted_blue_orchid");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_BROWN_MUSHROOM = getBlockType("potted_brown_mushroom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_CACTUS = getBlockType("potted_cactus");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_CHERRY_SAPLING = getBlockType("potted_cherry_sapling");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<BlockData> POTTED_CLOSED_EYEBLOSSOM = getBlockType("potted_closed_eyeblossom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_CORNFLOWER = getBlockType("potted_cornflower");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_CRIMSON_FUNGUS = getBlockType("potted_crimson_fungus");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_CRIMSON_ROOTS = getBlockType("potted_crimson_roots");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_DANDELION = getBlockType("potted_dandelion");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_DARK_OAK_SAPLING = getBlockType("potted_dark_oak_sapling");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_DEAD_BUSH = getBlockType("potted_dead_bush");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_FERN = getBlockType("potted_fern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_FLOWERING_AZALEA_BUSH = getBlockType("potted_flowering_azalea_bush");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> POTTED_GOLDEN_DANDELION = getBlockType("potted_golden_dandelion");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_JUNGLE_SAPLING = getBlockType("potted_jungle_sapling");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_LILY_OF_THE_VALLEY = getBlockType("potted_lily_of_the_valley");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_MANGROVE_PROPAGULE = getBlockType("potted_mangrove_propagule");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_OAK_SAPLING = getBlockType("potted_oak_sapling");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<BlockData> POTTED_OPEN_EYEBLOSSOM = getBlockType("potted_open_eyeblossom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_ORANGE_TULIP = getBlockType("potted_orange_tulip");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_OXEYE_DAISY = getBlockType("potted_oxeye_daisy");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<BlockData> POTTED_PALE_OAK_SAPLING = getBlockType("potted_pale_oak_sapling");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_PINK_TULIP = getBlockType("potted_pink_tulip");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_POPPY = getBlockType("potted_poppy");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_RED_MUSHROOM = getBlockType("potted_red_mushroom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_RED_TULIP = getBlockType("potted_red_tulip");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_SPRUCE_SAPLING = getBlockType("potted_spruce_sapling");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_TORCHFLOWER = getBlockType("potted_torchflower");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_WARPED_FUNGUS = getBlockType("potted_warped_fungus");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_WARPED_ROOTS = getBlockType("potted_warped_roots");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_WHITE_TULIP = getBlockType("potted_white_tulip");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POTTED_WITHER_ROSE = getBlockType("potted_wither_rose");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> POWDER_SNOW = getBlockType("powder_snow");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Levelled> POWDER_SNOW_CAULDRON = getBlockType("powder_snow_cauldron");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<RedstoneRail> POWERED_RAIL = getBlockType("powered_rail");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PRISMARINE = getBlockType("prismarine");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> PRISMARINE_BRICK_SLAB = getBlockType("prismarine_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> PRISMARINE_BRICK_STAIRS = getBlockType("prismarine_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PRISMARINE_BRICKS = getBlockType("prismarine_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> PRISMARINE_SLAB = getBlockType("prismarine_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> PRISMARINE_STAIRS = getBlockType("prismarine_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> PRISMARINE_WALL = getBlockType("prismarine_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PUMPKIN = getBlockType("pumpkin");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> PUMPKIN_STEM = getBlockType("pumpkin_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> PURPLE_BANNER = getBlockType("purple_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> PURPLE_BED = getBlockType("purple_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> PURPLE_CANDLE = getBlockType("purple_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> PURPLE_CANDLE_CAKE = getBlockType("purple_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PURPLE_CARPET = getBlockType("purple_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PURPLE_CONCRETE = getBlockType("purple_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PURPLE_CONCRETE_POWDER = getBlockType("purple_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> PURPLE_GLAZED_TERRACOTTA = getBlockType("purple_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> PURPLE_SHULKER_BOX = getBlockType("purple_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PURPLE_STAINED_GLASS = getBlockType("purple_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> PURPLE_STAINED_GLASS_PANE = getBlockType("purple_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PURPLE_TERRACOTTA = getBlockType("purple_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> PURPLE_WALL_BANNER = getBlockType("purple_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PURPLE_WOOL = getBlockType("purple_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> PURPUR_BLOCK = getBlockType("purpur_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> PURPUR_PILLAR = getBlockType("purpur_pillar");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> PURPUR_SLAB = getBlockType("purpur_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> PURPUR_STAIRS = getBlockType("purpur_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> QUARTZ_BLOCK = getBlockType("quartz_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> QUARTZ_BRICKS = getBlockType("quartz_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> QUARTZ_PILLAR = getBlockType("quartz_pillar");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> QUARTZ_SLAB = getBlockType("quartz_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> QUARTZ_STAIRS = getBlockType("quartz_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rail> RAIL = getBlockType("rail");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RAW_COPPER_BLOCK = getBlockType("raw_copper_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RAW_GOLD_BLOCK = getBlockType("raw_gold_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RAW_IRON_BLOCK = getBlockType("raw_iron_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> RED_BANNER = getBlockType("red_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> RED_BED = getBlockType("red_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> RED_CANDLE = getBlockType("red_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> RED_CANDLE_CAKE = getBlockType("red_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_CARPET = getBlockType("red_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_CONCRETE = getBlockType("red_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_CONCRETE_POWDER = getBlockType("red_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> RED_GLAZED_TERRACOTTA = getBlockType("red_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_MUSHROOM = getBlockType("red_mushroom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<MultipleFacing> RED_MUSHROOM_BLOCK = getBlockType("red_mushroom_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> RED_NETHER_BRICK_SLAB = getBlockType("red_nether_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> RED_NETHER_BRICK_STAIRS = getBlockType("red_nether_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> RED_NETHER_BRICK_WALL = getBlockType("red_nether_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_NETHER_BRICKS = getBlockType("red_nether_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_SAND = getBlockType("red_sand");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_SANDSTONE = getBlockType("red_sandstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> RED_SANDSTONE_SLAB = getBlockType("red_sandstone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> RED_SANDSTONE_STAIRS = getBlockType("red_sandstone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> RED_SANDSTONE_WALL = getBlockType("red_sandstone_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> RED_SHULKER_BOX = getBlockType("red_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_STAINED_GLASS = getBlockType("red_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> RED_STAINED_GLASS_PANE = getBlockType("red_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_TERRACOTTA = getBlockType("red_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_TULIP = getBlockType("red_tulip");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> RED_WALL_BANNER = getBlockType("red_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> RED_WOOL = getBlockType("red_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> REDSTONE_BLOCK = getBlockType("redstone_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> REDSTONE_LAMP = getBlockType("redstone_lamp");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> REDSTONE_ORE = getBlockType("redstone_ore");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> REDSTONE_TORCH = getBlockType("redstone_torch");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<RedstoneWallTorch> REDSTONE_WALL_TORCH = getBlockType("redstone_wall_torch");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<RedstoneWire> REDSTONE_WIRE = getBlockType("redstone_wire");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> REINFORCED_DEEPSLATE = getBlockType("reinforced_deepslate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Repeater> REPEATER = getBlockType("repeater");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CommandBlock> REPEATING_COMMAND_BLOCK = getBlockType("repeating_command_block");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<BlockData> RESIN_BLOCK = getBlockType("resin_block");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<Slab> RESIN_BRICK_SLAB = getBlockType("resin_brick_slab");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<Stairs> RESIN_BRICK_STAIRS = getBlockType("resin_brick_stairs");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<Wall> RESIN_BRICK_WALL = getBlockType("resin_brick_wall");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<BlockData> RESIN_BRICKS = getBlockType("resin_bricks");

    /**
     * @since 1.21.4
     */
    BlockType.Typed<ResinClump> RESIN_CLUMP = getBlockType("resin_clump");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<RespawnAnchor> RESPAWN_ANCHOR = getBlockType("respawn_anchor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> ROOTED_DIRT = getBlockType("rooted_dirt");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bisected> ROSE_BUSH = getBlockType("rose_bush");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SAND = getBlockType("sand");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SANDSTONE = getBlockType("sandstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> SANDSTONE_SLAB = getBlockType("sandstone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> SANDSTONE_STAIRS = getBlockType("sandstone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> SANDSTONE_WALL = getBlockType("sandstone_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Scaffolding> SCAFFOLDING = getBlockType("scaffolding");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SCULK = getBlockType("sculk");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<SculkCatalyst> SCULK_CATALYST = getBlockType("sculk_catalyst");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<SculkSensor> SCULK_SENSOR = getBlockType("sculk_sensor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<SculkShrieker> SCULK_SHRIEKER = getBlockType("sculk_shrieker");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<SculkVein> SCULK_VEIN = getBlockType("sculk_vein");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SEA_LANTERN = getBlockType("sea_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<SeaPickle> SEA_PICKLE = getBlockType("sea_pickle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SEAGRASS = getBlockType("seagrass");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<BlockData> SHORT_DRY_GRASS = getBlockType("short_dry_grass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SHORT_GRASS = getBlockType("short_grass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SHROOMLIGHT = getBlockType("shroomlight");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> SHULKER_BOX = getBlockType("shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Skull> SKELETON_SKULL = getBlockType("skeleton_skull");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSkull> SKELETON_WALL_SKULL = getBlockType("skeleton_wall_skull");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SLIME_BLOCK = getBlockType("slime_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<AmethystCluster> SMALL_AMETHYST_BUD = getBlockType("small_amethyst_bud");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<SmallDripleaf> SMALL_DRIPLEAF = getBlockType("small_dripleaf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SMITHING_TABLE = getBlockType("smithing_table");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Furnace> SMOKER = getBlockType("smoker");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SMOOTH_BASALT = getBlockType("smooth_basalt");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SMOOTH_QUARTZ = getBlockType("smooth_quartz");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> SMOOTH_QUARTZ_SLAB = getBlockType("smooth_quartz_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> SMOOTH_QUARTZ_STAIRS = getBlockType("smooth_quartz_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SMOOTH_RED_SANDSTONE = getBlockType("smooth_red_sandstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> SMOOTH_RED_SANDSTONE_SLAB = getBlockType("smooth_red_sandstone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> SMOOTH_RED_SANDSTONE_STAIRS = getBlockType("smooth_red_sandstone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SMOOTH_SANDSTONE = getBlockType("smooth_sandstone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> SMOOTH_SANDSTONE_SLAB = getBlockType("smooth_sandstone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> SMOOTH_SANDSTONE_STAIRS = getBlockType("smooth_sandstone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SMOOTH_STONE = getBlockType("smooth_stone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> SMOOTH_STONE_SLAB = getBlockType("smooth_stone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Hatchable> SNIFFER_EGG = getBlockType("sniffer_egg");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Snow> SNOW = getBlockType("snow");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SNOW_BLOCK = getBlockType("snow_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Campfire> SOUL_CAMPFIRE = getBlockType("soul_campfire");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SOUL_FIRE = getBlockType("soul_fire");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lantern> SOUL_LANTERN = getBlockType("soul_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SOUL_SAND = getBlockType("soul_sand");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SOUL_SOIL = getBlockType("soul_soil");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SOUL_TORCH = getBlockType("soul_torch");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> SOUL_WALL_TORCH = getBlockType("soul_wall_torch");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SPAWNER = getBlockType("spawner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SPONGE = getBlockType("sponge");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SPORE_BLOSSOM = getBlockType("spore_blossom");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> SPRUCE_BUTTON = getBlockType("spruce_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> SPRUCE_DOOR = getBlockType("spruce_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> SPRUCE_FENCE = getBlockType("spruce_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> SPRUCE_FENCE_GATE = getBlockType("spruce_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> SPRUCE_HANGING_SIGN = getBlockType("spruce_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Leaves> SPRUCE_LEAVES = getBlockType("spruce_leaves");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> SPRUCE_LOG = getBlockType("spruce_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> SPRUCE_PLANKS = getBlockType("spruce_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> SPRUCE_PRESSURE_PLATE = getBlockType("spruce_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sapling> SPRUCE_SAPLING = getBlockType("spruce_sapling");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> SPRUCE_SHELF = getBlockType("spruce_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> SPRUCE_SIGN = getBlockType("spruce_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> SPRUCE_SLAB = getBlockType("spruce_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> SPRUCE_STAIRS = getBlockType("spruce_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> SPRUCE_TRAPDOOR = getBlockType("spruce_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> SPRUCE_WALL_HANGING_SIGN = getBlockType("spruce_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> SPRUCE_WALL_SIGN = getBlockType("spruce_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> SPRUCE_WOOD = getBlockType("spruce_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Piston> STICKY_PISTON = getBlockType("sticky_piston");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> STONE = getBlockType("stone");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> STONE_BRICK_SLAB = getBlockType("stone_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> STONE_BRICK_STAIRS = getBlockType("stone_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> STONE_BRICK_WALL = getBlockType("stone_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> STONE_BRICKS = getBlockType("stone_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> STONE_BUTTON = getBlockType("stone_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> STONE_PRESSURE_PLATE = getBlockType("stone_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> STONE_SLAB = getBlockType("stone_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> STONE_STAIRS = getBlockType("stone_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> STONECUTTER = getBlockType("stonecutter");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_ACACIA_LOG = getBlockType("stripped_acacia_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_ACACIA_WOOD = getBlockType("stripped_acacia_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_BAMBOO_BLOCK = getBlockType("stripped_bamboo_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_BIRCH_LOG = getBlockType("stripped_birch_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_BIRCH_WOOD = getBlockType("stripped_birch_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_CHERRY_LOG = getBlockType("stripped_cherry_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_CHERRY_WOOD = getBlockType("stripped_cherry_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_CRIMSON_HYPHAE = getBlockType("stripped_crimson_hyphae");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_CRIMSON_STEM = getBlockType("stripped_crimson_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_DARK_OAK_LOG = getBlockType("stripped_dark_oak_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_DARK_OAK_WOOD = getBlockType("stripped_dark_oak_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_JUNGLE_LOG = getBlockType("stripped_jungle_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_JUNGLE_WOOD = getBlockType("stripped_jungle_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_MANGROVE_LOG = getBlockType("stripped_mangrove_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_MANGROVE_WOOD = getBlockType("stripped_mangrove_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_OAK_LOG = getBlockType("stripped_oak_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_OAK_WOOD = getBlockType("stripped_oak_wood");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Orientable> STRIPPED_PALE_OAK_LOG = getBlockType("stripped_pale_oak_log");

    /**
     * @since 1.21.3
     */
    BlockType.Typed<Orientable> STRIPPED_PALE_OAK_WOOD = getBlockType("stripped_pale_oak_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_SPRUCE_LOG = getBlockType("stripped_spruce_log");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_SPRUCE_WOOD = getBlockType("stripped_spruce_wood");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_WARPED_HYPHAE = getBlockType("stripped_warped_hyphae");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> STRIPPED_WARPED_STEM = getBlockType("stripped_warped_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<StructureBlock> STRUCTURE_BLOCK = getBlockType("structure_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> STRUCTURE_VOID = getBlockType("structure_void");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> SUGAR_CANE = getBlockType("sugar_cane");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> SULFUR = getBlockType("sulfur");

    /**
     * @since 26.2
     */
    BlockType.Typed<Slab> SULFUR_BRICK_SLAB = getBlockType("sulfur_brick_slab");

    /**
     * @since 26.2
     */
    BlockType.Typed<Stairs> SULFUR_BRICK_STAIRS = getBlockType("sulfur_brick_stairs");

    /**
     * @since 26.2
     */
    BlockType.Typed<Wall> SULFUR_BRICK_WALL = getBlockType("sulfur_brick_wall");

    /**
     * @since 26.2
     */
    BlockType.Typed<BlockData> SULFUR_BRICKS = getBlockType("sulfur_bricks");

    /**
     * @since 26.2
     */
    BlockType.Typed<Slab> SULFUR_SLAB = getBlockType("sulfur_slab");

    /**
     * @since 26.2
     */
    BlockType.Typed<Speleothem> SULFUR_SPIKE = getBlockType("sulfur_spike");

    /**
     * @since 26.2
     */
    BlockType.Typed<Stairs> SULFUR_STAIRS = getBlockType("sulfur_stairs");

    /**
     * @since 26.2
     */
    BlockType.Typed<Wall> SULFUR_WALL = getBlockType("sulfur_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bisected> SUNFLOWER = getBlockType("sunflower");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Brushable> SUSPICIOUS_GRAVEL = getBlockType("suspicious_gravel");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Brushable> SUSPICIOUS_SAND = getBlockType("suspicious_sand");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> SWEET_BERRY_BUSH = getBlockType("sweet_berry_bush");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<BlockData> TALL_DRY_GRASS = getBlockType("tall_dry_grass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bisected> TALL_GRASS = getBlockType("tall_grass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bisected> TALL_SEAGRASS = getBlockType("tall_seagrass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<AnaloguePowerable> TARGET = getBlockType("target");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> TERRACOTTA = getBlockType("terracotta");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<TestBlock> TEST_BLOCK = getBlockType("test_block");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<BlockData> TEST_INSTANCE_BLOCK = getBlockType("test_instance_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> TINTED_GLASS = getBlockType("tinted_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TNT> TNT = getBlockType("tnt");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> TORCH = getBlockType("torch");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> TORCHFLOWER = getBlockType("torchflower");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> TORCHFLOWER_CROP = getBlockType("torchflower_crop");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Chest> TRAPPED_CHEST = getBlockType("trapped_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrialSpawner> TRIAL_SPAWNER = getBlockType("trial_spawner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Tripwire> TRIPWIRE = getBlockType("tripwire");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TripwireHook> TRIPWIRE_HOOK = getBlockType("tripwire_hook");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> TUBE_CORAL = getBlockType("tube_coral");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> TUBE_CORAL_BLOCK = getBlockType("tube_coral_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> TUBE_CORAL_FAN = getBlockType("tube_coral_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CoralWallFan> TUBE_CORAL_WALL_FAN = getBlockType("tube_coral_wall_fan");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> TUFF = getBlockType("tuff");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> TUFF_BRICK_SLAB = getBlockType("tuff_brick_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> TUFF_BRICK_STAIRS = getBlockType("tuff_brick_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> TUFF_BRICK_WALL = getBlockType("tuff_brick_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> TUFF_BRICKS = getBlockType("tuff_bricks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> TUFF_SLAB = getBlockType("tuff_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> TUFF_STAIRS = getBlockType("tuff_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Wall> TUFF_WALL = getBlockType("tuff_wall");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TurtleEgg> TURTLE_EGG = getBlockType("turtle_egg");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> TWISTING_VINES = getBlockType("twisting_vines");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> TWISTING_VINES_PLANT = getBlockType("twisting_vines_plant");

    /**
     * @since 1.21.1
     */
    BlockType.Typed<Vault> VAULT = getBlockType("vault");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> VERDANT_FROGLIGHT = getBlockType("verdant_froglight");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<MultipleFacing> VINE = getBlockType("vine");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> VOID_AIR = getBlockType("void_air");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> WALL_TORCH = getBlockType("wall_torch");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Switch> WARPED_BUTTON = getBlockType("warped_button");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> WARPED_DOOR = getBlockType("warped_door");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Fence> WARPED_FENCE = getBlockType("warped_fence");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Gate> WARPED_FENCE_GATE = getBlockType("warped_fence_gate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WARPED_FUNGUS = getBlockType("warped_fungus");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<HangingSign> WARPED_HANGING_SIGN = getBlockType("warped_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> WARPED_HYPHAE = getBlockType("warped_hyphae");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WARPED_NYLIUM = getBlockType("warped_nylium");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WARPED_PLANKS = getBlockType("warped_planks");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Powerable> WARPED_PRESSURE_PLATE = getBlockType("warped_pressure_plate");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WARPED_ROOTS = getBlockType("warped_roots");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Shelf> WARPED_SHELF = getBlockType("warped_shelf");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Sign> WARPED_SIGN = getBlockType("warped_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> WARPED_SLAB = getBlockType("warped_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> WARPED_STAIRS = getBlockType("warped_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Orientable> WARPED_STEM = getBlockType("warped_stem");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> WARPED_TRAPDOOR = getBlockType("warped_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallHangingSign> WARPED_WALL_HANGING_SIGN = getBlockType("warped_wall_hanging_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSign> WARPED_WALL_SIGN = getBlockType("warped_wall_sign");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WARPED_WART_BLOCK = getBlockType("warped_wart_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Levelled> WATER = getBlockType("water");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Levelled> WATER_CAULDRON = getBlockType("water_cauldron");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_CHISELED_COPPER = getBlockType("waxed_chiseled_copper");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Fence> WAXED_COPPER_BARS = getBlockType("waxed_copper_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_COPPER_BLOCK = getBlockType("waxed_copper_block");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CopperBulb> WAXED_COPPER_BULB = getBlockType("waxed_copper_bulb");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> WAXED_COPPER_CHAIN = getBlockType("waxed_copper_chain");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chest> WAXED_COPPER_CHEST = getBlockType("waxed_copper_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> WAXED_COPPER_DOOR = getBlockType("waxed_copper_door");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<CopperGolemStatue> WAXED_COPPER_GOLEM_STATUE = getBlockType("waxed_copper_golem_statue");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> WAXED_COPPER_GRATE = getBlockType("waxed_copper_grate");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Lantern> WAXED_COPPER_LANTERN = getBlockType("waxed_copper_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> WAXED_COPPER_TRAPDOOR = getBlockType("waxed_copper_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_CUT_COPPER = getBlockType("waxed_cut_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> WAXED_CUT_COPPER_SLAB = getBlockType("waxed_cut_copper_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> WAXED_CUT_COPPER_STAIRS = getBlockType("waxed_cut_copper_stairs");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_EXPOSED_CHISELED_COPPER = getBlockType("waxed_exposed_chiseled_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_EXPOSED_COPPER = getBlockType("waxed_exposed_copper");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Fence> WAXED_EXPOSED_COPPER_BARS = getBlockType("waxed_exposed_copper_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CopperBulb> WAXED_EXPOSED_COPPER_BULB = getBlockType("waxed_exposed_copper_bulb");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> WAXED_EXPOSED_COPPER_CHAIN = getBlockType("waxed_exposed_copper_chain");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chest> WAXED_EXPOSED_COPPER_CHEST = getBlockType("waxed_exposed_copper_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> WAXED_EXPOSED_COPPER_DOOR = getBlockType("waxed_exposed_copper_door");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<CopperGolemStatue> WAXED_EXPOSED_COPPER_GOLEM_STATUE = getBlockType("waxed_exposed_copper_golem_statue");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> WAXED_EXPOSED_COPPER_GRATE = getBlockType("waxed_exposed_copper_grate");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Lantern> WAXED_EXPOSED_COPPER_LANTERN = getBlockType("waxed_exposed_copper_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> WAXED_EXPOSED_COPPER_TRAPDOOR = getBlockType("waxed_exposed_copper_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_EXPOSED_CUT_COPPER = getBlockType("waxed_exposed_cut_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> WAXED_EXPOSED_CUT_COPPER_SLAB = getBlockType("waxed_exposed_cut_copper_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> WAXED_EXPOSED_CUT_COPPER_STAIRS = getBlockType("waxed_exposed_cut_copper_stairs");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<LightningRod> WAXED_EXPOSED_LIGHTNING_ROD = getBlockType("waxed_exposed_lightning_rod");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<LightningRod> WAXED_LIGHTNING_ROD = getBlockType("waxed_lightning_rod");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_OXIDIZED_CHISELED_COPPER = getBlockType("waxed_oxidized_chiseled_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_OXIDIZED_COPPER = getBlockType("waxed_oxidized_copper");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Fence> WAXED_OXIDIZED_COPPER_BARS = getBlockType("waxed_oxidized_copper_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CopperBulb> WAXED_OXIDIZED_COPPER_BULB = getBlockType("waxed_oxidized_copper_bulb");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> WAXED_OXIDIZED_COPPER_CHAIN = getBlockType("waxed_oxidized_copper_chain");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chest> WAXED_OXIDIZED_COPPER_CHEST = getBlockType("waxed_oxidized_copper_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> WAXED_OXIDIZED_COPPER_DOOR = getBlockType("waxed_oxidized_copper_door");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<CopperGolemStatue> WAXED_OXIDIZED_COPPER_GOLEM_STATUE = getBlockType("waxed_oxidized_copper_golem_statue");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> WAXED_OXIDIZED_COPPER_GRATE = getBlockType("waxed_oxidized_copper_grate");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Lantern> WAXED_OXIDIZED_COPPER_LANTERN = getBlockType("waxed_oxidized_copper_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> WAXED_OXIDIZED_COPPER_TRAPDOOR = getBlockType("waxed_oxidized_copper_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_OXIDIZED_CUT_COPPER = getBlockType("waxed_oxidized_cut_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> WAXED_OXIDIZED_CUT_COPPER_SLAB = getBlockType("waxed_oxidized_cut_copper_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> WAXED_OXIDIZED_CUT_COPPER_STAIRS = getBlockType("waxed_oxidized_cut_copper_stairs");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<LightningRod> WAXED_OXIDIZED_LIGHTNING_ROD = getBlockType("waxed_oxidized_lightning_rod");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_WEATHERED_CHISELED_COPPER = getBlockType("waxed_weathered_chiseled_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_WEATHERED_COPPER = getBlockType("waxed_weathered_copper");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Fence> WAXED_WEATHERED_COPPER_BARS = getBlockType("waxed_weathered_copper_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CopperBulb> WAXED_WEATHERED_COPPER_BULB = getBlockType("waxed_weathered_copper_bulb");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> WAXED_WEATHERED_COPPER_CHAIN = getBlockType("waxed_weathered_copper_chain");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chest> WAXED_WEATHERED_COPPER_CHEST = getBlockType("waxed_weathered_copper_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> WAXED_WEATHERED_COPPER_DOOR = getBlockType("waxed_weathered_copper_door");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<CopperGolemStatue> WAXED_WEATHERED_COPPER_GOLEM_STATUE = getBlockType("waxed_weathered_copper_golem_statue");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> WAXED_WEATHERED_COPPER_GRATE = getBlockType("waxed_weathered_copper_grate");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Lantern> WAXED_WEATHERED_COPPER_LANTERN = getBlockType("waxed_weathered_copper_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> WAXED_WEATHERED_COPPER_TRAPDOOR = getBlockType("waxed_weathered_copper_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WAXED_WEATHERED_CUT_COPPER = getBlockType("waxed_weathered_cut_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> WAXED_WEATHERED_CUT_COPPER_SLAB = getBlockType("waxed_weathered_cut_copper_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> WAXED_WEATHERED_CUT_COPPER_STAIRS = getBlockType("waxed_weathered_cut_copper_stairs");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<LightningRod> WAXED_WEATHERED_LIGHTNING_ROD = getBlockType("waxed_weathered_lightning_rod");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WEATHERED_CHISELED_COPPER = getBlockType("weathered_chiseled_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WEATHERED_COPPER = getBlockType("weathered_copper");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Fence> WEATHERED_COPPER_BARS = getBlockType("weathered_copper_bars");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<CopperBulb> WEATHERED_COPPER_BULB = getBlockType("weathered_copper_bulb");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chain> WEATHERED_COPPER_CHAIN = getBlockType("weathered_copper_chain");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Chest> WEATHERED_COPPER_CHEST = getBlockType("weathered_copper_chest");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Door> WEATHERED_COPPER_DOOR = getBlockType("weathered_copper_door");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<CopperGolemStatue> WEATHERED_COPPER_GOLEM_STATUE = getBlockType("weathered_copper_golem_statue");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Waterlogged> WEATHERED_COPPER_GRATE = getBlockType("weathered_copper_grate");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<Lantern> WEATHERED_COPPER_LANTERN = getBlockType("weathered_copper_lantern");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<TrapDoor> WEATHERED_COPPER_TRAPDOOR = getBlockType("weathered_copper_trapdoor");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WEATHERED_CUT_COPPER = getBlockType("weathered_cut_copper");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Slab> WEATHERED_CUT_COPPER_SLAB = getBlockType("weathered_cut_copper_slab");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Stairs> WEATHERED_CUT_COPPER_STAIRS = getBlockType("weathered_cut_copper_stairs");

    /**
     * @since 1.21.10
     */
    BlockType.Typed<LightningRod> WEATHERED_LIGHTNING_ROD = getBlockType("weathered_lightning_rod");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> WEEPING_VINES = getBlockType("weeping_vines");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WEEPING_VINES_PLANT = getBlockType("weeping_vines_plant");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WET_SPONGE = getBlockType("wet_sponge");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Ageable> WHEAT = getBlockType("wheat");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> WHITE_BANNER = getBlockType("white_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> WHITE_BED = getBlockType("white_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> WHITE_CANDLE = getBlockType("white_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> WHITE_CANDLE_CAKE = getBlockType("white_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WHITE_CARPET = getBlockType("white_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WHITE_CONCRETE = getBlockType("white_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WHITE_CONCRETE_POWDER = getBlockType("white_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> WHITE_GLAZED_TERRACOTTA = getBlockType("white_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> WHITE_SHULKER_BOX = getBlockType("white_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WHITE_STAINED_GLASS = getBlockType("white_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> WHITE_STAINED_GLASS_PANE = getBlockType("white_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WHITE_TERRACOTTA = getBlockType("white_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WHITE_TULIP = getBlockType("white_tulip");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> WHITE_WALL_BANNER = getBlockType("white_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WHITE_WOOL = getBlockType("white_wool");

    /**
     * @since 1.21.6
     */
    BlockType.Typed<FlowerBed> WILDFLOWERS = getBlockType("wildflowers");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> WITHER_ROSE = getBlockType("wither_rose");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Skull> WITHER_SKELETON_SKULL = getBlockType("wither_skeleton_skull");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSkull> WITHER_SKELETON_WALL_SKULL = getBlockType("wither_skeleton_wall_skull");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Rotatable> YELLOW_BANNER = getBlockType("yellow_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Bed> YELLOW_BED = getBlockType("yellow_bed");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Candle> YELLOW_CANDLE = getBlockType("yellow_candle");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Lightable> YELLOW_CANDLE_CAKE = getBlockType("yellow_candle_cake");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> YELLOW_CARPET = getBlockType("yellow_carpet");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> YELLOW_CONCRETE = getBlockType("yellow_concrete");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> YELLOW_CONCRETE_POWDER = getBlockType("yellow_concrete_powder");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> YELLOW_GLAZED_TERRACOTTA = getBlockType("yellow_glazed_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> YELLOW_SHULKER_BOX = getBlockType("yellow_shulker_box");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> YELLOW_STAINED_GLASS = getBlockType("yellow_stained_glass");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<GlassPane> YELLOW_STAINED_GLASS_PANE = getBlockType("yellow_stained_glass_pane");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> YELLOW_TERRACOTTA = getBlockType("yellow_terracotta");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Directional> YELLOW_WALL_BANNER = getBlockType("yellow_wall_banner");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> YELLOW_WOOL = getBlockType("yellow_wool");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<Skull> ZOMBIE_HEAD = getBlockType("zombie_head");

    /**
     * @since 1.20.6
     */
    BlockType.Typed<WallSkull> ZOMBIE_WALL_HEAD = getBlockType("zombie_wall_head");
    // End generate - BlockType
    //</editor-fold>

    @SuppressWarnings("unchecked")
    private static <B extends BlockType> B getBlockType(@KeyPattern.Value final String key) {
        // Cast instead of using BlockType#typed, since block type can be a mock during testing and would return null
        return (B) Registry.BLOCK.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * Yields this block type as a typed version of itself with a plain {@link BlockData} representing it.
     *
     * @return the typed block type.
     * @since 1.20.6
     */
    BlockType.Typed<BlockData> typed();

    /**
     * Yields this block type as a typed version of itself with a specific {@link BlockData} representing it.
     *
     * @param blockDataType the class type of the {@link BlockData} to type this {@link BlockType} with.
     * @param <B>          the generic type of the block data to type this block type with.
     * @return the typed block type.
     * @since 1.20.6
     */
    <B extends BlockData> BlockType.Typed<B> typed(Class<B> blockDataType);

    /**
     * Returns true if this BlockType has a corresponding {@link ItemType}.
     *
     * @return true if there is a corresponding ItemType, otherwise false
     * @see #getItemType()
     * @since 1.20.6
     */
    boolean hasItemType();

    /**
     * Returns the corresponding {@link ItemType} for the given BlockType.
     * <p>
     * If there is no corresponding {@link ItemType} an error will be thrown.
     * <p>This is <b>NOT</b> the same as the {@link ItemType} with the same key,
     * but instead is the item associated with this block if this block
     * can be represented with an item.</p>
     *
     * @return the corresponding ItemType
     * @see #hasItemType()
     * @see BlockData#getPlacementMaterial()
     * @since 1.20.6
     */
    ItemType getItemType();

    /**
     * Gets the BlockData class of this BlockType
     *
     * @return the BlockData class of this BlockType
     * @since 1.20.6
     */
    Class<? extends BlockData> getBlockDataClass();

    /**
     * Creates a new {@link BlockData} instance for this block type, with all
     * properties initialized to unspecified defaults.
     *
     * @return new data instance
     * @since 1.20.6
     */
    BlockData createBlockData();

    /**
     * Creates a collection of {@link BlockData} instances for this block type, with all
     * possible combinations of properties values.
     *
     * @return new block data collection
     * @since 1.21.4
     */
    @Unmodifiable Collection<? extends BlockData> createBlockDataStates();

    /**
     * Creates a new {@link BlockData} instance for this block type, with all
     * properties initialized to unspecified defaults, except for those provided
     * in data.
     *
     * @param data data string
     * @return new data instance
     * @throws IllegalArgumentException if the specified data is not valid
     * @since 1.20.6
     */
    BlockData createBlockData(@Nullable String data);

    /**
     * Check if the block type is solid (can be built upon)
     *
     * @return True if this block type is solid
     * @since 1.20.6
     */
    boolean isSolid();

    /**
     * Check if the block type can catch fire
     *
     * @return True if this block type can catch fire
     * @since 1.20.6
     */
    boolean isFlammable();

    /**
     * Check if the block type can burn away
     *
     * @return True if this block type can burn away
     * @since 1.20.6
     */
    boolean isBurnable();

    /**
     * Check if the block type occludes light in the lighting engine.
     * <p>
     * Generally speaking, most full blocks will occlude light. Non-full blocks are
     * not occluding (e.g. anvils, chests, tall grass, stairs, etc.), nor are specific
     * full blocks such as barriers or spawners which block light despite their texture.
     * <p>
     * An occluding block will have the following effects:
     * <ul>
     *   <li>Chests cannot be opened if an occluding block is above it.
     *   <li>Mobs cannot spawn inside of occluding blocks.
     *   <li>Only occluding blocks can be "powered" ({@link Block#isBlockPowered()}).
     * </ul>
     * This list may be inconclusive. For a full list of the side effects of an occluding
     * block, see the <a href="https://minecraft.wiki/w/Opacity">Minecraft Wiki</a>.
     *
     * @return True if this block type occludes light
     * @since 1.20.6
     */
    boolean isOccluding();

    /**
     * @return True if this block type is affected by gravity.
     * @since 1.20.6
     */
    boolean hasGravity();

    /**
     * Checks if this block type can be interacted with.
     * <p>
     * Interactable block types include those with functionality when they are
     * interacted with by a player such as chests, furnaces, etc.
     * <p>
     * Some blocks such as piston heads and stairs are considered interactable
     * though may not perform any additional functionality.
     * <p>
     * Note that the interactability of some block types may be dependant on their
     * state as well. This method will return true if there is at least one
     * state in which additional interact handling is performed for the
     * block type.
     *
     * @deprecated This method is not comprehensive and does not accurately reflect what block types are
     * interactable. Many "interactions" are defined on the item not block, and many are conditional on some other world state
     * checks being true.
     *
     * @return true if this block type can be interacted with.
     * @since 1.20.6
     */
    @Deprecated // Paper
    boolean isInteractable();

    /**
     * Obtains the block's hardness level (also known as "strength").
     * <br>
     * This number is used to calculate the time required to break each block.
     *
     * @return the hardness of that block type.
     * @since 1.20.6
     */
    float getHardness();

    /**
     * Obtains the blast resistance value (also known as block "durability").
     * <br>
     * This value is used in explosions to calculate whether a block should be
     * broken or not.
     *
     * @return the blast resistance of that block type.
     * @since 1.20.6
     */
    float getBlastResistance();

    /**
     * Returns a value that represents how 'slippery' the block is.
     * <p>
     * Blocks with higher slipperiness, like {@link BlockType#ICE} can be slid on
     * further by the player and other entities.
     * <p>
     * Most blocks have a default slipperiness of {@code 0.6f}.
     *
     * @return the slipperiness of this block
     * @since 1.20.6
     */
    float getSlipperiness();

    /**
     * Check if the block type is an air block.
     *
     * @return True if this block type is an air block.
     * @since 1.20.6
     */
    boolean isAir();

    /**
     * Gets if the BlockType is enabled by the features in a world.
     *
     * @param world the world to check
     * @return true if this BlockType can be used in this World.
     * @deprecated use {@link io.papermc.paper.world.flag.FeatureFlagSetHolder#isEnabled(io.papermc.paper.world.flag.FeatureDependant)}
     */
    @Deprecated(forRemoval = true, since = "1.21.1") // Paper
    boolean isEnabledByFeature(World world);

    /**
     * Tries to convert this BlockType into a Material
     *
     * @return the converted Material or null
     * @deprecated only for internal use
     * @since 1.20.6
     */
    @Nullable
    @Deprecated(since = "1.20.6")
    Material asMaterial();

    /**
     * @deprecated use {@link #translationKey()} and {@link net.kyori.adventure.text.Component#translatable(net.kyori.adventure.translation.Translatable)}
     */
    @Deprecated(forRemoval = true)
    @Override
    String getTranslationKey();

    /**
     * Checks if this block type has collision.
     * <p>
     * @return false if this block never has collision, true if it <b>might</b> have collision
     * @since 1.20.6
     */
    boolean hasCollision();
}
