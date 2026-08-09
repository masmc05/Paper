package org.bukkit;

import com.google.common.base.Preconditions;
import com.google.common.base.Suppliers;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import io.papermc.paper.datacomponent.DataComponentTypes;
import io.papermc.paper.datacomponent.item.Equippable;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.block.Block;
import org.bukkit.block.BlockType;
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
import org.bukkit.inventory.CreativeCategory;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ItemType;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An enum of all material IDs accepted by the official server and client
 *
 * @since 1.0.0
 */
@SuppressWarnings({"DeprecatedIsStillUsed", "deprecation"}) // Paper
public enum Material implements Keyed, Translatable, net.kyori.adventure.translation.Translatable { // Paper
    /**
     * @since 1.13
     */
    //<editor-fold desc="Materials" defaultstate="collapsed">
    // Start generate - Items
    ACACIA_BOAT(-1),
    /**
     * @since 1.19
     */
    ACACIA_CHEST_BOAT(-1),
    /**
     * @since 1.0.0
     */
    AIR(-1),
    /**
     * @since 1.19
     */
    ALLAY_SPAWN_EGG(-1),
    /**
     * @since 1.17
     */
    AMETHYST_SHARD(-1),
    /**
     * @since 1.20
     */
    ANGLER_POTTERY_SHERD(-1),
    /**
     * @since 1.0.0
     */
    APPLE(-1),
    /**
     * @since 1.20
     */
    ARCHER_POTTERY_SHERD(-1),
    /**
     * @since 1.20.6
     */
    ARMADILLO_SCUTE(-1),
    /**
     * @since 1.20.6
     */
    ARMADILLO_SPAWN_EGG(-1),
    /**
     * @since 1.8
     */
    ARMOR_STAND(-1),
    /**
     * @since 1.20
     */
    ARMS_UP_POTTERY_SHERD(-1),
    /**
     * @since 1.0.0
     */
    ARROW(-1),
    /**
     * @since 1.17
     */
    AXOLOTL_BUCKET(-1),
    /**
     * @since 1.17
     */
    AXOLOTL_SPAWN_EGG(-1),
    /**
     * @since 1.4.5
     */
    BAKED_POTATO(-1),
    /**
     * @since 1.19.3
     */
    BAMBOO_CHEST_RAFT(-1),
    /**
     * @since 1.19.3
     */
    BAMBOO_RAFT(-1),
    /**
     * @since 1.13
     */
    BAT_SPAWN_EGG(-1),
    /**
     * @since 1.15
     */
    BEE_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    BEEF(-1),
    /**
     * @since 1.9.4
     */
    BEETROOT(-1),
    /**
     * @since 1.9.4
     */
    BEETROOT_SEEDS(-1),
    /**
     * @since 1.9.4
     */
    BEETROOT_SOUP(-1),
    /**
     * @since 1.13
     */
    BIRCH_BOAT(-1),
    /**
     * @since 1.19
     */
    BIRCH_CHEST_BOAT(-1),
    /**
     * @since 1.21.3
     */
    BLACK_BUNDLE(-1),
    /**
     * @since 1.14
     */
    BLACK_DYE(-1),
    /**
     * @since 1.21.6
     */
    BLACK_HARNESS(-1),
    /**
     * @since 1.20
     */
    BLADE_POTTERY_SHERD(-1),
    /**
     * @since 1.0.0
     */
    BLAZE_POWDER(-1),
    /**
     * @since 1.0.0
     */
    BLAZE_ROD(-1),
    /**
     * @since 1.13
     */
    BLAZE_SPAWN_EGG(-1),
    /**
     * @since 1.21.3
     */
    BLUE_BUNDLE(-1),
    /**
     * @since 1.14
     */
    BLUE_DYE(-1),
    /**
     * @since 1.21.6
     */
    BLUE_EGG(-1),
    /**
     * @since 1.21.6
     */
    BLUE_HARNESS(-1),
    /**
     * @since 1.20.6
     */
    BOGGED_SPAWN_EGG(-1),
    /**
     * @since 1.20.6
     */
    BOLT_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.0.0
     */
    BONE(-1),
    /**
     * @since 1.13
     */
    BONE_MEAL(-1),
    /**
     * @since 1.0.0
     */
    BOOK(-1),
    /**
     * @since 1.21.3
     */
    BORDURE_INDENTED_BANNER_PATTERN(-1),
    /**
     * @since 1.0.0
     */
    BOW(-1),
    /**
     * @since 1.0.0
     */
    BOWL(-1),
    /**
     * @since 1.0.0
     */
    BREAD(-1),
    /**
     * @since 1.20.6
     */
    BREEZE_ROD(-1),
    /**
     * @since 1.20.4
     */
    BREEZE_SPAWN_EGG(-1),
    /**
     * @since 1.20
     */
    BREWER_POTTERY_SHERD(-1),
    /**
     * @since 1.0.0
     */
    BRICK(-1),
    /**
     * @since 1.21.3
     */
    BROWN_BUNDLE(-1),
    /**
     * @since 1.14
     */
    BROWN_DYE(-1),
    /**
     * @since 1.21.6
     */
    BROWN_EGG(-1),
    /**
     * @since 1.21.6
     */
    BROWN_HARNESS(-1),
    /**
     * @since 1.19.4
     */
    BRUSH(-1),
    /**
     * @since 1.0.0
     */
    BUCKET(-1),
    /**
     * @since 1.17
     */
    BUNDLE(-1),
    /**
     * @since 1.20
     */
    BURN_POTTERY_SHERD(-1),
    /**
     * @since 1.21.11
     */
    CAMEL_HUSK_SPAWN_EGG(-1),
    /**
     * @since 1.19.3
     */
    CAMEL_SPAWN_EGG(-1),
    /**
     * @since 1.4.5
     */
    CARROT(-1),
    /**
     * @since 1.13
     */
    CARROT_ON_A_STICK(-1),
    /**
     * @since 1.14
     */
    CAT_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    CAVE_SPIDER_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    CHAINMAIL_BOOTS(-1),
    /**
     * @since 1.0.0
     */
    CHAINMAIL_CHESTPLATE(-1),
    /**
     * @since 1.0.0
     */
    CHAINMAIL_HELMET(-1),
    /**
     * @since 1.0.0
     */
    CHAINMAIL_LEGGINGS(-1),
    /**
     * @since 1.13
     */
    CHARCOAL(-1),
    /**
     * @since 1.19.4
     */
    CHERRY_BOAT(-1),
    /**
     * @since 1.19.4
     */
    CHERRY_CHEST_BOAT(-1),
    /**
     * @since 1.13
     */
    CHEST_MINECART(-1),
    /**
     * @since 1.13
     */
    CHICKEN(-1),
    /**
     * @since 1.13
     */
    CHICKEN_SPAWN_EGG(-1),
    /**
     * @since 1.9.4
     */
    CHORUS_FRUIT(-1),
    /**
     * @since 1.0.0
     */
    CLAY_BALL(-1),
    /**
     * @since 1.13
     */
    CLOCK(-1),
    /**
     * @since 1.0.0
     */
    COAL(-1),
    /**
     * @since 1.19.4
     */
    COAST_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.13
     */
    COCOA_BEANS(-1),
    /**
     * @since 1.13
     */
    COD(-1),
    /**
     * @since 1.13
     */
    COD_BUCKET(-1),
    /**
     * @since 1.13
     */
    COD_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    COMMAND_BLOCK_MINECART(-1),
    /**
     * @since 1.0.0
     */
    COMPASS(-1),
    /**
     * @since 1.0.0
     */
    COOKED_BEEF(-1),
    /**
     * @since 1.0.0
     */
    COOKED_CHICKEN(-1),
    /**
     * @since 1.13
     */
    COOKED_COD(-1),
    /**
     * @since 1.8
     */
    COOKED_MUTTON(-1),
    /**
     * @since 1.13
     */
    COOKED_PORKCHOP(-1),
    /**
     * @since 1.8
     */
    COOKED_RABBIT(-1),
    /**
     * @since 1.13
     */
    COOKED_SALMON(-1),
    /**
     * @since 1.0.0
     */
    COOKIE(-1),
    /**
     * @since 1.21.10
     */
    COPPER_AXE(-1),
    /**
     * @since 1.21.10
     */
    COPPER_BOOTS(-1),
    /**
     * @since 1.21.10
     */
    COPPER_CHESTPLATE(-1),
    /**
     * @since 1.21.10
     */
    COPPER_GOLEM_SPAWN_EGG(-1),
    /**
     * @since 1.21.10
     */
    COPPER_HELMET(-1),
    /**
     * @since 1.21.10
     */
    COPPER_HOE(-1),
    /**
     * @since 1.21.10
     */
    COPPER_HORSE_ARMOR(-1),
    /**
     * @since 1.17
     */
    COPPER_INGOT(-1),
    /**
     * @since 1.21.10
     */
    COPPER_LEGGINGS(-1),
    /**
     * @since 1.21.11
     */
    COPPER_NAUTILUS_ARMOR(-1),
    /**
     * @since 1.21.10
     */
    COPPER_NUGGET(-1),
    /**
     * @since 1.21.10
     */
    COPPER_PICKAXE(-1),
    /**
     * @since 1.21.10
     */
    COPPER_SHOVEL(-1),
    /**
     * @since 1.21.11
     */
    COPPER_SPEAR(-1),
    /**
     * @since 1.21.10
     */
    COPPER_SWORD(-1),
    /**
     * @since 1.13
     */
    COW_SPAWN_EGG(-1),
    /**
     * @since 1.21.3
     */
    CREAKING_SPAWN_EGG(-1),
    /**
     * @since 1.14
     */
    CREEPER_BANNER_PATTERN(-1),
    /**
     * @since 1.13
     */
    CREEPER_SPAWN_EGG(-1),
    /**
     * @since 1.14
     */
    CROSSBOW(-1),
    /**
     * @since 1.21.3
     */
    CYAN_BUNDLE(-1),
    /**
     * @since 1.13
     */
    CYAN_DYE(-1),
    /**
     * @since 1.21.6
     */
    CYAN_HARNESS(-1),
    /**
     * @since 1.20
     */
    DANGER_POTTERY_SHERD(-1),
    /**
     * @since 1.13
     */
    DARK_OAK_BOAT(-1),
    /**
     * @since 1.19
     */
    DARK_OAK_CHEST_BOAT(-1),
    /**
     * @since 1.13
     */
    DEBUG_STICK(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_AXE(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_BOOTS(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_CHESTPLATE(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_HELMET(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_HOE(-1),
    /**
     * @since 1.13
     */
    DIAMOND_HORSE_ARMOR(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_LEGGINGS(-1),
    /**
     * @since 1.21.11
     */
    DIAMOND_NAUTILUS_ARMOR(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_PICKAXE(-1),
    /**
     * @since 1.13
     */
    DIAMOND_SHOVEL(-1),
    /**
     * @since 1.21.11
     */
    DIAMOND_SPEAR(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_SWORD(-1),
    /**
     * @since 1.19
     */
    DISC_FRAGMENT_5(-1),
    /**
     * @since 1.13
     */
    DOLPHIN_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    DONKEY_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    DRAGON_BREATH(-1),
    /**
     * @since 1.13
     */
    DRIED_KELP(-1),
    /**
     * @since 1.13
     */
    DROWNED_SPAWN_EGG(-1),
    /**
     * @since 1.19.4
     */
    DUNE_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.19
     */
    ECHO_SHARD(-1),
    /**
     * @since 1.0.0
     */
    EGG(-1),
    /**
     * @since 1.13
     */
    ELDER_GUARDIAN_SPAWN_EGG(-1),
    /**
     * @since 1.9.4
     */
    ELYTRA(-1),
    /**
     * @since 1.3.1
     */
    EMERALD(-1),
    /**
     * @since 1.4.6
     */
    ENCHANTED_BOOK(-1),
    /**
     * @since 1.13
     */
    ENCHANTED_GOLDEN_APPLE(-1),
    /**
     * @since 1.9.4
     */
    END_CRYSTAL(-1),
    /**
     * @since 1.19.3
     */
    ENDER_DRAGON_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    ENDER_EYE(-1),
    /**
     * @since 1.0.0
     */
    ENDER_PEARL(-1),
    /**
     * @since 1.13
     */
    ENDERMAN_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    ENDERMITE_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    EVOKER_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    EXPERIENCE_BOTTLE(-1),
    /**
     * @since 1.20
     */
    EXPLORER_POTTERY_SHERD(-1),
    /**
     * @since 1.19.4
     */
    EYE_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.0.0
     */
    FEATHER(-1),
    /**
     * @since 1.0.0
     */
    FERMENTED_SPIDER_EYE(-1),
    /**
     * @since 1.21.3
     */
    FIELD_MASONED_BANNER_PATTERN(-1),
    /**
     * @since 1.13
     */
    FILLED_MAP(-1),
    /**
     * @since 1.13
     */
    FIRE_CHARGE(-1),
    /**
     * @since 1.13
     */
    FIREWORK_ROCKET(-1),
    /**
     * @since 1.13
     */
    FIREWORK_STAR(-1),
    /**
     * @since 1.0.0
     */
    FISHING_ROD(-1),
    /**
     * @since 1.0.0
     */
    FLINT(-1),
    /**
     * @since 1.0.0
     */
    FLINT_AND_STEEL(-1),
    /**
     * @since 1.20.6
     */
    FLOW_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.20.6
     */
    FLOW_BANNER_PATTERN(-1),
    /**
     * @since 1.20.6
     */
    FLOW_POTTERY_SHERD(-1),
    /**
     * @since 1.14
     */
    FLOWER_BANNER_PATTERN(-1),
    /**
     * @since 1.14
     */
    FOX_SPAWN_EGG(-1),
    /**
     * @since 1.20
     */
    FRIEND_POTTERY_SHERD(-1),
    /**
     * @since 1.19
     */
    FROG_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    FURNACE_MINECART(-1),
    /**
     * @since 1.13
     */
    GHAST_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    GHAST_TEAR(-1),
    /**
     * @since 1.0.0
     */
    GLASS_BOTTLE(-1),
    /**
     * @since 1.13
     */
    GLISTERING_MELON_SLICE(-1),
    /**
     * @since 1.14
     */
    GLOBE_BANNER_PATTERN(-1),
    /**
     * @since 1.17
     */
    GLOW_BERRIES(-1),
    /**
     * @since 1.17
     */
    GLOW_INK_SAC(-1),
    /**
     * @since 1.17
     */
    GLOW_ITEM_FRAME(-1),
    /**
     * @since 1.17
     */
    GLOW_SQUID_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    GLOWSTONE_DUST(-1),
    /**
     * @since 1.19
     */
    GOAT_HORN(-1),
    /**
     * @since 1.17
     */
    GOAT_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    GOLD_INGOT(-1),
    /**
     * @since 1.0.0
     */
    GOLD_NUGGET(-1),
    /**
     * @since 1.0.0
     */
    GOLDEN_APPLE(-1),
    /**
     * @since 1.13
     */
    GOLDEN_AXE(-1),
    /**
     * @since 1.13
     */
    GOLDEN_BOOTS(-1),
    /**
     * @since 1.4.5
     */
    GOLDEN_CARROT(-1),
    /**
     * @since 1.13
     */
    GOLDEN_CHESTPLATE(-1),
    /**
     * @since 1.13
     */
    GOLDEN_HELMET(-1),
    /**
     * @since 1.13
     */
    GOLDEN_HOE(-1),
    /**
     * @since 1.13
     */
    GOLDEN_HORSE_ARMOR(-1),
    /**
     * @since 1.13
     */
    GOLDEN_LEGGINGS(-1),
    /**
     * @since 1.21.11
     */
    GOLDEN_NAUTILUS_ARMOR(-1),
    /**
     * @since 1.13
     */
    GOLDEN_PICKAXE(-1),
    /**
     * @since 1.13
     */
    GOLDEN_SHOVEL(-1),
    /**
     * @since 1.21.11
     */
    GOLDEN_SPEAR(-1),
    /**
     * @since 1.13
     */
    GOLDEN_SWORD(-1),
    /**
     * @since 1.21.3
     */
    GRAY_BUNDLE(-1),
    /**
     * @since 1.13
     */
    GRAY_DYE(-1),
    /**
     * @since 1.21.6
     */
    GRAY_HARNESS(-1),
    /**
     * @since 1.21.3
     */
    GREEN_BUNDLE(-1),
    /**
     * @since 1.14
     */
    GREEN_DYE(-1),
    /**
     * @since 1.21.6
     */
    GREEN_HARNESS(-1),
    /**
     * @since 1.13
     */
    GUARDIAN_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    GUNPOWDER(-1),
    /**
     * @since 1.20.6
     */
    GUSTER_BANNER_PATTERN(-1),
    /**
     * @since 1.20.6
     */
    GUSTER_POTTERY_SHERD(-1),
    /**
     * @since 1.21.6
     */
    HAPPY_GHAST_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    HEART_OF_THE_SEA(-1),
    /**
     * @since 1.20
     */
    HEART_POTTERY_SHERD(-1),
    /**
     * @since 1.20
     */
    HEARTBREAK_POTTERY_SHERD(-1),
    /**
     * @since 1.16.1
     */
    HOGLIN_SPAWN_EGG(-1),
    /**
     * @since 1.15
     */
    HONEY_BOTTLE(-1),
    /**
     * @since 1.15
     */
    HONEYCOMB(-1),
    /**
     * @since 1.5.1
     */
    HOPPER_MINECART(-1),
    /**
     * @since 1.13
     */
    HORSE_SPAWN_EGG(-1),
    /**
     * @since 1.20
     */
    HOST_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.20
     */
    HOWL_POTTERY_SHERD(-1),
    /**
     * @since 1.13
     */
    HUSK_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    INK_SAC(-1),
    /**
     * @since 1.0.0
     */
    IRON_AXE(-1),
    /**
     * @since 1.0.0
     */
    IRON_BOOTS(-1),
    /**
     * @since 1.0.0
     */
    IRON_CHESTPLATE(-1),
    /**
     * @since 1.19.3
     */
    IRON_GOLEM_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    IRON_HELMET(-1),
    /**
     * @since 1.0.0
     */
    IRON_HOE(-1),
    /**
     * @since 1.13
     */
    IRON_HORSE_ARMOR(-1),
    /**
     * @since 1.0.0
     */
    IRON_INGOT(-1),
    /**
     * @since 1.0.0
     */
    IRON_LEGGINGS(-1),
    /**
     * @since 1.21.11
     */
    IRON_NAUTILUS_ARMOR(-1),
    /**
     * @since 1.11.1
     */
    IRON_NUGGET(-1),
    /**
     * @since 1.0.0
     */
    IRON_PICKAXE(-1),
    /**
     * @since 1.13
     */
    IRON_SHOVEL(-1),
    /**
     * @since 1.21.11
     */
    IRON_SPEAR(-1),
    /**
     * @since 1.0.0
     */
    IRON_SWORD(-1),
    /**
     * @since 1.4.5
     */
    ITEM_FRAME(-1),
    /**
     * @since 1.13
     */
    JUNGLE_BOAT(-1),
    /**
     * @since 1.19
     */
    JUNGLE_CHEST_BOAT(-1),
    /**
     * @since 1.12
     */
    KNOWLEDGE_BOOK(-1),
    /**
     * @since 1.13
     */
    LAPIS_LAZULI(-1),
    /**
     * @since 1.0.0
     */
    LAVA_BUCKET(-1),
    /**
     * @since 1.13
     */
    LEAD(-1),
    /**
     * @since 1.0.0
     */
    LEATHER(-1),
    /**
     * @since 1.0.0
     */
    LEATHER_BOOTS(-1),
    /**
     * @since 1.0.0
     */
    LEATHER_CHESTPLATE(-1),
    /**
     * @since 1.0.0
     */
    LEATHER_HELMET(-1),
    /**
     * @since 1.14
     */
    LEATHER_HORSE_ARMOR(-1),
    /**
     * @since 1.0.0
     */
    LEATHER_LEGGINGS(-1),
    /**
     * @since 1.21.3
     */
    LIGHT_BLUE_BUNDLE(-1),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_DYE(-1),
    /**
     * @since 1.21.6
     */
    LIGHT_BLUE_HARNESS(-1),
    /**
     * @since 1.21.3
     */
    LIGHT_GRAY_BUNDLE(-1),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_DYE(-1),
    /**
     * @since 1.21.6
     */
    LIGHT_GRAY_HARNESS(-1),
    /**
     * @since 1.21.3
     */
    LIME_BUNDLE(-1),
    /**
     * @since 1.13
     */
    LIME_DYE(-1),
    /**
     * @since 1.21.6
     */
    LIME_HARNESS(-1),
    /**
     * @since 1.9.4
     */
    LINGERING_POTION(-1),
    /**
     * @since 1.13
     */
    LLAMA_SPAWN_EGG(-1),
    /**
     * @since 1.20.6
     */
    MACE(-1),
    /**
     * @since 1.21.3
     */
    MAGENTA_BUNDLE(-1),
    /**
     * @since 1.13
     */
    MAGENTA_DYE(-1),
    /**
     * @since 1.21.6
     */
    MAGENTA_HARNESS(-1),
    /**
     * @since 1.0.0
     */
    MAGMA_CREAM(-1),
    /**
     * @since 1.13
     */
    MAGMA_CUBE_SPAWN_EGG(-1),
    /**
     * @since 1.19
     */
    MANGROVE_BOAT(-1),
    /**
     * @since 1.19
     */
    MANGROVE_CHEST_BOAT(-1),
    /**
     * @since 1.0.0
     */
    MAP(-1),
    /**
     * @since 1.0.0
     */
    MELON_SEEDS(-1),
    /**
     * @since 1.13
     */
    MELON_SLICE(-1),
    /**
     * @since 1.0.0
     */
    MILK_BUCKET(-1),
    /**
     * @since 1.0.0
     */
    MINECART(-1),
    /**
     * @since 1.20
     */
    MINER_POTTERY_SHERD(-1),
    /**
     * @since 1.14
     */
    MOJANG_BANNER_PATTERN(-1),
    /**
     * @since 1.13
     */
    MOOSHROOM_SPAWN_EGG(-1),
    /**
     * @since 1.20
     */
    MOURNER_POTTERY_SHERD(-1),
    /**
     * @since 1.13
     */
    MULE_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    MUSHROOM_STEW(-1),
    /**
     * @since 1.19
     */
    MUSIC_DISC_5(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_11(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_13(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_BLOCKS(-1),
    /**
     * @since 26.2
     */
    MUSIC_DISC_BOUNCE(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_CAT(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_CHIRP(-1),
    /**
     * @since 1.21
     */
    MUSIC_DISC_CREATOR(-1),
    /**
     * @since 1.21
     */
    MUSIC_DISC_CREATOR_MUSIC_BOX(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_FAR(-1),
    /**
     * @since 1.21.7
     */
    MUSIC_DISC_LAVA_CHICKEN(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_MALL(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_MELLOHI(-1),
    /**
     * @since 1.18.1
     */
    MUSIC_DISC_OTHERSIDE(-1),
    /**
     * @since 1.16.1
     */
    MUSIC_DISC_PIGSTEP(-1),
    /**
     * @since 1.21
     */
    MUSIC_DISC_PRECIPICE(-1),
    /**
     * @since 1.20
     */
    MUSIC_DISC_RELIC(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_STAL(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_STRAD(-1),
    /**
     * @since 1.21.6
     */
    MUSIC_DISC_TEARS(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_WAIT(-1),
    /**
     * @since 1.13
     */
    MUSIC_DISC_WARD(-1),
    /**
     * @since 1.8
     */
    MUTTON(-1),
    /**
     * @since 1.6.1
     */
    NAME_TAG(-1),
    /**
     * @since 1.13
     */
    NAUTILUS_SHELL(-1),
    /**
     * @since 1.21.11
     */
    NAUTILUS_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    NETHER_BRICK(-1),
    /**
     * @since 1.4.5
     */
    NETHER_STAR(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_AXE(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_BOOTS(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_CHESTPLATE(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_HELMET(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_HOE(-1),
    /**
     * @since 1.21.11
     */
    NETHERITE_HORSE_ARMOR(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_INGOT(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_LEGGINGS(-1),
    /**
     * @since 1.21.11
     */
    NETHERITE_NAUTILUS_ARMOR(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_PICKAXE(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_SCRAP(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_SHOVEL(-1),
    /**
     * @since 1.21.11
     */
    NETHERITE_SPEAR(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_SWORD(-1),
    /**
     * @since 1.19.4
     */
    NETHERITE_UPGRADE_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.13
     */
    OAK_BOAT(-1),
    /**
     * @since 1.19
     */
    OAK_CHEST_BOAT(-1),
    /**
     * @since 1.13
     */
    OCELOT_SPAWN_EGG(-1),
    /**
     * @since 1.20.6
     */
    OMINOUS_BOTTLE(-1),
    /**
     * @since 1.20.6
     */
    OMINOUS_TRIAL_KEY(-1),
    /**
     * @since 1.21.3
     */
    ORANGE_BUNDLE(-1),
    /**
     * @since 1.13
     */
    ORANGE_DYE(-1),
    /**
     * @since 1.21.6
     */
    ORANGE_HARNESS(-1),
    /**
     * @since 1.0.0
     */
    PAINTING(-1),
    /**
     * @since 1.21.3
     */
    PALE_OAK_BOAT(-1),
    /**
     * @since 1.21.3
     */
    PALE_OAK_CHEST_BOAT(-1),
    /**
     * @since 1.14
     */
    PANDA_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    PAPER(-1),
    /**
     * @since 1.21.11
     */
    PARCHED_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    PARROT_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    PHANTOM_MEMBRANE(-1),
    /**
     * @since 1.13
     */
    PHANTOM_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    PIG_SPAWN_EGG(-1),
    /**
     * @since 1.16.1
     */
    PIGLIN_BANNER_PATTERN(-1),
    /**
     * @since 1.16.2
     */
    PIGLIN_BRUTE_SPAWN_EGG(-1),
    /**
     * @since 1.16.1
     */
    PIGLIN_SPAWN_EGG(-1),
    /**
     * @since 1.14
     */
    PILLAGER_SPAWN_EGG(-1),
    /**
     * @since 1.21.3
     */
    PINK_BUNDLE(-1),
    /**
     * @since 1.13
     */
    PINK_DYE(-1),
    /**
     * @since 1.21.6
     */
    PINK_HARNESS(-1),
    /**
     * @since 1.20
     */
    PITCHER_POD(-1),
    /**
     * @since 1.20
     */
    PLENTY_POTTERY_SHERD(-1),
    /**
     * @since 1.4.5
     */
    POISONOUS_POTATO(-1),
    /**
     * @since 1.13
     */
    POLAR_BEAR_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    POPPED_CHORUS_FRUIT(-1),
    /**
     * @since 1.13
     */
    PORKCHOP(-1),
    /**
     * @since 1.4.5
     */
    POTATO(-1),
    /**
     * @since 1.0.0
     */
    POTION(-1),
    /**
     * @since 1.17
     */
    POWDER_SNOW_BUCKET(-1),
    /**
     * @since 1.8
     */
    PRISMARINE_CRYSTALS(-1),
    /**
     * @since 1.8
     */
    PRISMARINE_SHARD(-1),
    /**
     * @since 1.20
     */
    PRIZE_POTTERY_SHERD(-1),
    /**
     * @since 1.13
     */
    PUFFERFISH(-1),
    /**
     * @since 1.13
     */
    PUFFERFISH_BUCKET(-1),
    /**
     * @since 1.13
     */
    PUFFERFISH_SPAWN_EGG(-1),
    /**
     * @since 1.4.5
     */
    PUMPKIN_PIE(-1),
    /**
     * @since 1.0.0
     */
    PUMPKIN_SEEDS(-1),
    /**
     * @since 1.21.3
     */
    PURPLE_BUNDLE(-1),
    /**
     * @since 1.13
     */
    PURPLE_DYE(-1),
    /**
     * @since 1.21.6
     */
    PURPLE_HARNESS(-1),
    /**
     * @since 1.5.1
     */
    QUARTZ(-1),
    /**
     * @since 1.8
     */
    RABBIT(-1),
    /**
     * @since 1.8
     */
    RABBIT_FOOT(-1),
    /**
     * @since 1.8
     */
    RABBIT_HIDE(-1),
    /**
     * @since 1.13
     */
    RABBIT_SPAWN_EGG(-1),
    /**
     * @since 1.8
     */
    RABBIT_STEW(-1),
    /**
     * @since 1.20
     */
    RAISER_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.14
     */
    RAVAGER_SPAWN_EGG(-1),
    /**
     * @since 1.17
     */
    RAW_COPPER(-1),
    /**
     * @since 1.17
     */
    RAW_GOLD(-1),
    /**
     * @since 1.17
     */
    RAW_IRON(-1),
    /**
     * @since 1.19
     */
    RECOVERY_COMPASS(-1),
    /**
     * @since 1.21.3
     */
    RED_BUNDLE(-1),
    /**
     * @since 1.14
     */
    RED_DYE(-1),
    /**
     * @since 1.21.6
     */
    RED_HARNESS(-1),
    /**
     * @since 1.0.0
     */
    REDSTONE(-1),
    /**
     * @since 1.21.4
     */
    RESIN_BRICK(-1),
    /**
     * @since 1.19.4
     */
    RIB_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.0.0
     */
    ROTTEN_FLESH(-1),
    /**
     * @since 1.0.0
     */
    SADDLE(-1),
    /**
     * @since 1.13
     */
    SALMON(-1),
    /**
     * @since 1.13
     */
    SALMON_BUCKET(-1),
    /**
     * @since 1.13
     */
    SALMON_SPAWN_EGG(-1),
    /**
     * @since 1.20.6
     */
    SCRAPE_POTTERY_SHERD(-1),
    /**
     * @since 1.19.4
     */
    SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.20
     */
    SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.20
     */
    SHEAF_POTTERY_SHERD(-1),
    /**
     * @since 1.0.0
     */
    SHEARS(-1),
    /**
     * @since 1.13
     */
    SHEEP_SPAWN_EGG(-1),
    /**
     * @since 1.20
     */
    SHELTER_POTTERY_SHERD(-1),
    /**
     * @since 1.9.4
     */
    SHIELD(-1),
    /**
     * @since 1.11
     */
    SHULKER_SHELL(-1),
    /**
     * @since 1.13
     */
    SHULKER_SPAWN_EGG(-1),
    /**
     * @since 1.20
     */
    SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.13
     */
    SILVERFISH_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    SKELETON_HORSE_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    SKELETON_SPAWN_EGG(-1),
    /**
     * @since 1.14
     */
    SKULL_BANNER_PATTERN(-1),
    /**
     * @since 1.20
     */
    SKULL_POTTERY_SHERD(-1),
    /**
     * @since 1.0.0
     */
    SLIME_BALL(-1),
    /**
     * @since 1.13
     */
    SLIME_SPAWN_EGG(-1),
    /**
     * @since 1.19.4
     */
    SNIFFER_SPAWN_EGG(-1),
    /**
     * @since 1.20
     */
    SNORT_POTTERY_SHERD(-1),
    /**
     * @since 1.19.4
     */
    SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.19.3
     */
    SNOW_GOLEM_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    SNOWBALL(-1),
    /**
     * @since 1.9.4
     */
    SPECTRAL_ARROW(-1),
    /**
     * @since 1.0.0
     */
    SPIDER_EYE(-1),
    /**
     * @since 1.13
     */
    SPIDER_SPAWN_EGG(-1),
    /**
     * @since 1.19.4
     */
    SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.9.4
     */
    SPLASH_POTION(-1),
    /**
     * @since 1.13
     */
    SPRUCE_BOAT(-1),
    /**
     * @since 1.19
     */
    SPRUCE_CHEST_BOAT(-1),
    /**
     * @since 1.17
     */
    SPYGLASS(-1),
    /**
     * @since 1.13
     */
    SQUID_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    STICK(-1),
    /**
     * @since 1.0.0
     */
    STONE_AXE(-1),
    /**
     * @since 1.0.0
     */
    STONE_HOE(-1),
    /**
     * @since 1.0.0
     */
    STONE_PICKAXE(-1),
    /**
     * @since 1.13
     */
    STONE_SHOVEL(-1),
    /**
     * @since 1.21.11
     */
    STONE_SPEAR(-1),
    /**
     * @since 1.0.0
     */
    STONE_SWORD(-1),
    /**
     * @since 1.13
     */
    STRAY_SPAWN_EGG(-1),
    /**
     * @since 1.16.1
     */
    STRIDER_SPAWN_EGG(-1),
    /**
     * @since 1.0.0
     */
    STRING(-1),
    /**
     * @since 1.0.0
     */
    SUGAR(-1),
    /**
     * @since 26.2
     */
    SULFUR_CUBE_BUCKET(-1),
    /**
     * @since 26.2
     */
    SULFUR_CUBE_SPAWN_EGG(-1),
    /**
     * @since 1.14
     */
    SUSPICIOUS_STEW(-1),
    /**
     * @since 1.14
     */
    SWEET_BERRIES(-1),
    /**
     * @since 1.19
     */
    TADPOLE_BUCKET(-1),
    /**
     * @since 1.19
     */
    TADPOLE_SPAWN_EGG(-1),
    /**
     * @since 1.19.4
     */
    TIDE_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.9.4
     */
    TIPPED_ARROW(-1),
    /**
     * @since 1.13
     */
    TNT_MINECART(-1),
    /**
     * @since 1.19.4
     */
    TORCHFLOWER_SEEDS(-1),
    /**
     * @since 1.13
     */
    TOTEM_OF_UNDYING(-1),
    /**
     * @since 1.14
     */
    TRADER_LLAMA_SPAWN_EGG(-1),
    /**
     * @since 1.20.4
     */
    TRIAL_KEY(-1),
    /**
     * @since 1.13
     */
    TRIDENT(-1),
    /**
     * @since 1.13
     */
    TROPICAL_FISH(-1),
    /**
     * @since 1.13
     */
    TROPICAL_FISH_BUCKET(-1),
    /**
     * @since 1.13
     */
    TROPICAL_FISH_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    TURTLE_HELMET(-1),
    /**
     * @since 1.20.6
     */
    TURTLE_SCUTE(-1),
    /**
     * @since 1.13
     */
    TURTLE_SPAWN_EGG(-1),
    /**
     * @since 1.19.4
     */
    VEX_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.13
     */
    VEX_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    VILLAGER_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    VINDICATOR_SPAWN_EGG(-1),
    /**
     * @since 1.14
     */
    WANDERING_TRADER_SPAWN_EGG(-1),
    /**
     * @since 1.19.4
     */
    WARD_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.19
     */
    WARDEN_SPAWN_EGG(-1),
    /**
     * @since 1.16.1
     */
    WARPED_FUNGUS_ON_A_STICK(-1),
    /**
     * @since 1.0.0
     */
    WATER_BUCKET(-1),
    /**
     * @since 1.20
     */
    WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.13
     */
    WHEAT_SEEDS(-1),
    /**
     * @since 1.21.3
     */
    WHITE_BUNDLE(-1),
    /**
     * @since 1.14
     */
    WHITE_DYE(-1),
    /**
     * @since 1.21.6
     */
    WHITE_HARNESS(-1),
    /**
     * @since 1.19.4
     */
    WILD_ARMOR_TRIM_SMITHING_TEMPLATE(-1),
    /**
     * @since 1.20.6
     */
    WIND_CHARGE(-1),
    /**
     * @since 1.13
     */
    WITCH_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    WITHER_SKELETON_SPAWN_EGG(-1),
    /**
     * @since 1.19.3
     */
    WITHER_SPAWN_EGG(-1),
    /**
     * @since 1.20.6
     */
    WOLF_ARMOR(-1),
    /**
     * @since 1.13
     */
    WOLF_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    WOODEN_AXE(-1),
    /**
     * @since 1.13
     */
    WOODEN_HOE(-1),
    /**
     * @since 1.13
     */
    WOODEN_PICKAXE(-1),
    /**
     * @since 1.13
     */
    WOODEN_SHOVEL(-1),
    /**
     * @since 1.21.11
     */
    WOODEN_SPEAR(-1),
    /**
     * @since 1.13
     */
    WOODEN_SWORD(-1),
    /**
     * @since 1.13
     */
    WRITABLE_BOOK(-1),
    /**
     * @since 1.3.1
     */
    WRITTEN_BOOK(-1),
    /**
     * @since 1.21.3
     */
    YELLOW_BUNDLE(-1),
    /**
     * @since 1.14
     */
    YELLOW_DYE(-1),
    /**
     * @since 1.21.6
     */
    YELLOW_HARNESS(-1),
    /**
     * @since 1.16.1
     */
    ZOGLIN_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    ZOMBIE_HORSE_SPAWN_EGG(-1),
    /**
     * @since 1.21.11
     */
    ZOMBIE_NAUTILUS_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    ZOMBIE_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    ZOMBIE_VILLAGER_SPAWN_EGG(-1),
    /**
     * @since 1.16.1
     */
    ZOMBIFIED_PIGLIN_SPAWN_EGG(-1),
    /**
     * @since 1.13
     */
    // End generate - Items
    // Start generate - Blocks
    ACACIA_BUTTON(-1, Switch.class),
    /**
     * @since 1.8
     */
    ACACIA_DOOR(-1, Door.class),
    /**
     * @since 1.8
     */
    ACACIA_FENCE(-1, Fence.class),
    /**
     * @since 1.8
     */
    ACACIA_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.3
     */
    ACACIA_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.13
     */
    ACACIA_LEAVES(-1, Leaves.class),
    /**
     * @since 1.13
     */
    ACACIA_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    ACACIA_PLANKS(-1),
    /**
     * @since 1.13
     */
    ACACIA_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.13
     */
    ACACIA_SAPLING(-1, Sapling.class),
    /**
     * @since 1.21.10
     */
    ACACIA_SHELF(-1, Shelf.class),
    /**
     * @since 1.14
     */
    ACACIA_SIGN(-1, Sign.class),
    /**
     * @since 1.13
     */
    ACACIA_SLAB(-1, Slab.class),
    /**
     * @since 1.7.2
     */
    ACACIA_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    ACACIA_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    ACACIA_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.14
     */
    ACACIA_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.13
     */
    ACACIA_WOOD(-1, Orientable.class),
    /**
     * @since 1.5.1
     */
    ACTIVATOR_RAIL(-1, RedstoneRail.class),
    /**
     * @since 1.13
     */
    ALLIUM(-1),
    /**
     * @since 1.17
     */
    AMETHYST_BLOCK(-1),
    /**
     * @since 1.17
     */
    AMETHYST_CLUSTER(-1, AmethystCluster.class),
    /**
     * @since 1.16.1
     */
    ANCIENT_DEBRIS(-1),
    /**
     * @since 1.13
     */
    ANDESITE(-1),
    /**
     * @since 1.14
     */
    ANDESITE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    ANDESITE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    ANDESITE_WALL(-1, Wall.class),
    /**
     * @since 1.4.5
     */
    ANVIL(-1, Directional.class),
    /**
     * @since 1.13
     */
    ATTACHED_MELON_STEM(-1, Directional.class),
    /**
     * @since 1.13
     */
    ATTACHED_PUMPKIN_STEM(-1, Directional.class),
    /**
     * @since 1.17
     */
    AZALEA(-1),
    /**
     * @since 1.17
     */
    AZALEA_LEAVES(-1, Leaves.class),
    /**
     * @since 1.13
     */
    AZURE_BLUET(-1),
    /**
     * @since 1.14
     */
    BAMBOO(-1, Bamboo.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_BLOCK(-1, Orientable.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_BUTTON(-1, Switch.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_DOOR(-1, Door.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_FENCE(-1, Fence.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_MOSAIC(-1),
    /**
     * @since 1.19.3
     */
    BAMBOO_MOSAIC_SLAB(-1, Slab.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_MOSAIC_STAIRS(-1, Stairs.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_PLANKS(-1),
    /**
     * @since 1.19.3
     */
    BAMBOO_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.14
     */
    BAMBOO_SAPLING(-1),
    /**
     * @since 1.21.10
     */
    BAMBOO_SHELF(-1, Shelf.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_SIGN(-1, Sign.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_SLAB(-1, Slab.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_STAIRS(-1, Stairs.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.19.3
     */
    BAMBOO_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.14
     */
    BARREL(-1, Barrel.class),
    /**
     * @since 1.8
     */
    BARRIER(-1, Waterlogged.class),
    /**
     * @since 1.16.1
     */
    BASALT(-1, Orientable.class),
    /**
     * @since 1.4.5
     */
    BEACON(-1),
    /**
     * @since 1.0.0
     */
    BEDROCK(-1),
    /**
     * @since 1.15
     */
    BEE_NEST(-1, Beehive.class),
    /**
     * @since 1.15
     */
    BEEHIVE(-1, Beehive.class),
    /**
     * @since 1.13
     */
    BEETROOTS(-1, Ageable.class),
    /**
     * @since 1.14
     */
    BELL(-1, Bell.class),
    /**
     * @since 1.17
     */
    BIG_DRIPLEAF(-1, BigDripleaf.class),
    /**
     * @since 1.17
     */
    BIG_DRIPLEAF_STEM(-1, Dripleaf.class),
    /**
     * @since 1.13
     */
    BIRCH_BUTTON(-1, Switch.class),
    /**
     * @since 1.8
     */
    BIRCH_DOOR(-1, Door.class),
    /**
     * @since 1.8
     */
    BIRCH_FENCE(-1, Fence.class),
    /**
     * @since 1.8
     */
    BIRCH_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.3
     */
    BIRCH_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.13
     */
    BIRCH_LEAVES(-1, Leaves.class),
    /**
     * @since 1.13
     */
    BIRCH_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    BIRCH_PLANKS(-1),
    /**
     * @since 1.13
     */
    BIRCH_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.13
     */
    BIRCH_SAPLING(-1, Sapling.class),
    /**
     * @since 1.21.10
     */
    BIRCH_SHELF(-1, Shelf.class),
    /**
     * @since 1.14
     */
    BIRCH_SIGN(-1, Sign.class),
    /**
     * @since 1.13
     */
    BIRCH_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    BIRCH_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    BIRCH_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    BIRCH_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.14
     */
    BIRCH_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.13
     */
    BIRCH_WOOD(-1, Orientable.class),
    /**
     * @since 1.13
     */
    BLACK_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    BLACK_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    BLACK_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    BLACK_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    BLACK_CARPET(-1),
    /**
     * @since 1.13
     */
    BLACK_CONCRETE(-1),
    /**
     * @since 1.13
     */
    BLACK_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    BLACK_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    BLACK_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    BLACK_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    BLACK_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    BLACK_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    BLACK_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    BLACK_WOOL(-1),
    /**
     * @since 1.16.1
     */
    BLACKSTONE(-1),
    /**
     * @since 1.16.1
     */
    BLACKSTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.16.1
     */
    BLACKSTONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.16.1
     */
    BLACKSTONE_WALL(-1, Wall.class),
    /**
     * @since 1.14
     */
    BLAST_FURNACE(-1, Furnace.class),
    /**
     * @since 1.13
     */
    BLUE_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    BLUE_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    BLUE_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    BLUE_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    BLUE_CARPET(-1),
    /**
     * @since 1.13
     */
    BLUE_CONCRETE(-1),
    /**
     * @since 1.13
     */
    BLUE_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    BLUE_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.13
     */
    BLUE_ICE(-1),
    /**
     * @since 1.13
     */
    BLUE_ORCHID(-1),
    /**
     * @since 1.11
     */
    BLUE_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    BLUE_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    BLUE_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    BLUE_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    BLUE_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    BLUE_WOOL(-1),
    /**
     * @since 1.10.2
     */
    BONE_BLOCK(-1, Orientable.class),
    /**
     * @since 1.0.0
     */
    BOOKSHELF(-1),
    /**
     * @since 1.13
     */
    BRAIN_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    BRAIN_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    BRAIN_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    BRAIN_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.0.0
     */
    BREWING_STAND(-1, BrewingStand.class),
    /**
     * @since 1.13
     */
    BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.0.0
     */
    BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    BRICKS(-1),
    /**
     * @since 1.13
     */
    BROWN_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    BROWN_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    BROWN_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    BROWN_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    BROWN_CARPET(-1),
    /**
     * @since 1.13
     */
    BROWN_CONCRETE(-1),
    /**
     * @since 1.13
     */
    BROWN_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    BROWN_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.0.0
     */
    BROWN_MUSHROOM(-1),
    /**
     * @since 1.13
     */
    BROWN_MUSHROOM_BLOCK(-1, MultipleFacing.class),
    /**
     * @since 1.11
     */
    BROWN_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    BROWN_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    BROWN_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    BROWN_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    BROWN_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    BROWN_WOOL(-1),
    /**
     * @since 1.13
     */
    BUBBLE_COLUMN(-1, BubbleColumn.class),
    /**
     * @since 1.13
     */
    BUBBLE_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    BUBBLE_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    BUBBLE_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    BUBBLE_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.17
     */
    BUDDING_AMETHYST(-1),
    /**
     * @since 1.21.6
     */
    BUSH(-1),
    /**
     * @since 1.0.0
     */
    CACTUS(-1, Ageable.class),
    /**
     * @since 1.21.6
     */
    CACTUS_FLOWER(-1),
    /**
     * @since 1.0.0
     */
    CAKE(-1, Cake.class),
    /**
     * @since 1.17
     */
    CALCITE(-1),
    /**
     * @since 1.20
     */
    CALIBRATED_SCULK_SENSOR(-1, CalibratedSculkSensor.class),
    /**
     * @since 1.14
     */
    CAMPFIRE(-1, Campfire.class),
    /**
     * @since 1.17
     */
    CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    CARROTS(-1, Ageable.class),
    /**
     * @since 1.14
     */
    CARTOGRAPHY_TABLE(-1),
    /**
     * @since 1.13
     */
    CARVED_PUMPKIN(-1, Directional.class),
    /**
     * @since 1.0.0
     */
    CAULDRON(-1),
    /**
     * @since 1.13
     */
    CAVE_AIR(-1),
    /**
     * @since 1.17
     */
    CAVE_VINES(-1, CaveVines.class),
    /**
     * @since 1.17
     */
    CAVE_VINES_PLANT(-1, CaveVinesPlant.class),
    /**
     * @since 1.13
     */
    CHAIN_COMMAND_BLOCK(-1, CommandBlock.class),
    /**
     * @since 1.19.4
     */
    CHERRY_BUTTON(-1, Switch.class),
    /**
     * @since 1.19.4
     */
    CHERRY_DOOR(-1, Door.class),
    /**
     * @since 1.19.4
     */
    CHERRY_FENCE(-1, Fence.class),
    /**
     * @since 1.19.4
     */
    CHERRY_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.4
     */
    CHERRY_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.19.4
     */
    CHERRY_LEAVES(-1, Leaves.class),
    /**
     * @since 1.19.4
     */
    CHERRY_LOG(-1, Orientable.class),
    /**
     * @since 1.19.4
     */
    CHERRY_PLANKS(-1),
    /**
     * @since 1.19.4
     */
    CHERRY_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.19.4
     */
    CHERRY_SAPLING(-1, Sapling.class),
    /**
     * @since 1.21.10
     */
    CHERRY_SHELF(-1, Shelf.class),
    /**
     * @since 1.19.4
     */
    CHERRY_SIGN(-1, Sign.class),
    /**
     * @since 1.19.4
     */
    CHERRY_SLAB(-1, Slab.class),
    /**
     * @since 1.19.4
     */
    CHERRY_STAIRS(-1, Stairs.class),
    /**
     * @since 1.19.4
     */
    CHERRY_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.4
     */
    CHERRY_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.19.4
     */
    CHERRY_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.19.4
     */
    CHERRY_WOOD(-1, Orientable.class),
    /**
     * @since 1.0.0
     */
    CHEST(-1, Chest.class),
    /**
     * @since 1.13
     */
    CHIPPED_ANVIL(-1, Directional.class),
    /**
     * @since 1.19.3
     */
    CHISELED_BOOKSHELF(-1, ChiseledBookshelf.class),
    /**
     * @since 26.2
     */
    CHISELED_CINNABAR(-1),
    /**
     * @since 1.20.4
     */
    CHISELED_COPPER(-1),
    /**
     * @since 1.17
     */
    CHISELED_DEEPSLATE(-1),
    /**
     * @since 1.16.1
     */
    CHISELED_NETHER_BRICKS(-1),
    /**
     * @since 1.16.1
     */
    CHISELED_POLISHED_BLACKSTONE(-1),
    /**
     * @since 1.13
     */
    CHISELED_QUARTZ_BLOCK(-1),
    /**
     * @since 1.13
     */
    CHISELED_RED_SANDSTONE(-1),
    /**
     * @since 1.21.4
     */
    CHISELED_RESIN_BRICKS(-1),
    /**
     * @since 1.13
     */
    CHISELED_SANDSTONE(-1),
    /**
     * @since 1.13
     */
    CHISELED_STONE_BRICKS(-1),
    /**
     * @since 26.2
     */
    CHISELED_SULFUR(-1),
    /**
     * @since 1.20.4
     */
    CHISELED_TUFF(-1),
    /**
     * @since 1.20.4
     */
    CHISELED_TUFF_BRICKS(-1),
    /**
     * @since 1.9.4
     */
    CHORUS_FLOWER(-1, Ageable.class),
    /**
     * @since 1.9.4
     */
    CHORUS_PLANT(-1, MultipleFacing.class),
    /**
     * @since 26.2
     */
    CINNABAR(-1),
    /**
     * @since 26.2
     */
    CINNABAR_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 26.2
     */
    CINNABAR_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 26.2
     */
    CINNABAR_BRICK_WALL(-1, Wall.class),
    /**
     * @since 26.2
     */
    CINNABAR_BRICKS(-1),
    /**
     * @since 26.2
     */
    CINNABAR_SLAB(-1, Slab.class),
    /**
     * @since 26.2
     */
    CINNABAR_STAIRS(-1, Stairs.class),
    /**
     * @since 26.2
     */
    CINNABAR_WALL(-1, Wall.class),
    /**
     * @since 1.0.0
     */
    CLAY(-1),
    /**
     * @since 1.21.4
     */
    CLOSED_EYEBLOSSOM(-1),
    /**
     * @since 1.6.1
     */
    COAL_BLOCK(-1),
    /**
     * @since 1.0.0
     */
    COAL_ORE(-1),
    /**
     * @since 1.13
     */
    COARSE_DIRT(-1),
    /**
     * @since 1.17
     */
    COBBLED_DEEPSLATE(-1),
    /**
     * @since 1.17
     */
    COBBLED_DEEPSLATE_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    COBBLED_DEEPSLATE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.17
     */
    COBBLED_DEEPSLATE_WALL(-1, Wall.class),
    /**
     * @since 1.0.0
     */
    COBBLESTONE(-1),
    /**
     * @since 1.13
     */
    COBBLESTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.0.0
     */
    COBBLESTONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    COBBLESTONE_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    COBWEB(-1),
    /**
     * @since 1.3.1
     */
    COCOA(-1, Cocoa.class),
    /**
     * @since 1.13
     */
    COMMAND_BLOCK(-1, CommandBlock.class),
    /**
     * @since 1.13
     */
    COMPARATOR(-1, Comparator.class),
    /**
     * @since 1.14
     */
    COMPOSTER(-1, Levelled.class),
    /**
     * @since 1.13
     */
    CONDUIT(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    COPPER_BARS(-1, Fence.class),
    /**
     * @since 1.17
     */
    COPPER_BLOCK(-1),
    /**
     * @since 1.20.4
     */
    COPPER_BULB(-1, CopperBulb.class),
    /**
     * @since 1.21.10
     */
    COPPER_CHAIN(-1, Chain.class),
    /**
     * @since 1.21.10
     */
    COPPER_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    COPPER_DOOR(-1, Door.class),
    /**
     * @since 1.21.10
     */
    COPPER_GOLEM_STATUE(-1, CopperGolemStatue.class),
    /**
     * @since 1.20.4
     */
    COPPER_GRATE(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    COPPER_LANTERN(-1, Lantern.class),
    /**
     * @since 1.17
     */
    COPPER_ORE(-1),
    /**
     * @since 1.21.10
     */
    COPPER_TORCH(-1),
    /**
     * @since 1.20.4
     */
    COPPER_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.21.10
     */
    COPPER_WALL_TORCH(-1, Directional.class),
    /**
     * @since 1.14
     */
    CORNFLOWER(-1),
    /**
     * @since 1.17
     */
    CRACKED_DEEPSLATE_BRICKS(-1),
    /**
     * @since 1.17
     */
    CRACKED_DEEPSLATE_TILES(-1),
    /**
     * @since 1.16.1
     */
    CRACKED_NETHER_BRICKS(-1),
    /**
     * @since 1.16.1
     */
    CRACKED_POLISHED_BLACKSTONE_BRICKS(-1),
    /**
     * @since 1.13
     */
    CRACKED_STONE_BRICKS(-1),
    /**
     * @since 1.20.4
     */
    CRAFTER(-1, Crafter.class),
    /**
     * @since 1.13
     */
    CRAFTING_TABLE(-1),
    /**
     * @since 1.21.3
     */
    CREAKING_HEART(-1, CreakingHeart.class),
    /**
     * @since 1.13
     */
    CREEPER_HEAD(-1, Skull.class),
    /**
     * @since 1.13
     */
    CREEPER_WALL_HEAD(-1, WallSkull.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_BUTTON(-1, Switch.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_DOOR(-1, Door.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_FENCE(-1, Fence.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_FUNGUS(-1),
    /**
     * @since 1.19.3
     */
    CRIMSON_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_HYPHAE(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_NYLIUM(-1),
    /**
     * @since 1.16.1
     */
    CRIMSON_PLANKS(-1),
    /**
     * @since 1.16.1
     */
    CRIMSON_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_ROOTS(-1),
    /**
     * @since 1.21.10
     */
    CRIMSON_SHELF(-1, Shelf.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_SIGN(-1, Sign.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_SLAB(-1, Slab.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_STAIRS(-1, Stairs.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_STEM(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    CRIMSON_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.16.1
     */
    CRIMSON_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.16.1
     */
    CRYING_OBSIDIAN(-1),
    /**
     * @since 1.17
     */
    CUT_COPPER(-1),
    /**
     * @since 1.17
     */
    CUT_COPPER_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    CUT_COPPER_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    CUT_RED_SANDSTONE(-1),
    /**
     * @since 1.14
     */
    CUT_RED_SANDSTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    CUT_SANDSTONE(-1),
    /**
     * @since 1.14
     */
    CUT_SANDSTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    CYAN_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    CYAN_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    CYAN_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    CYAN_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    CYAN_CARPET(-1),
    /**
     * @since 1.13
     */
    CYAN_CONCRETE(-1),
    /**
     * @since 1.13
     */
    CYAN_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    CYAN_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    CYAN_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    CYAN_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    CYAN_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    CYAN_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    CYAN_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    CYAN_WOOL(-1),
    /**
     * @since 1.13
     */
    DAMAGED_ANVIL(-1, Directional.class),
    /**
     * @since 1.13
     */
    DANDELION(-1),
    /**
     * @since 1.13
     */
    DARK_OAK_BUTTON(-1, Switch.class),
    /**
     * @since 1.8
     */
    DARK_OAK_DOOR(-1, Door.class),
    /**
     * @since 1.8
     */
    DARK_OAK_FENCE(-1, Fence.class),
    /**
     * @since 1.8
     */
    DARK_OAK_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.3
     */
    DARK_OAK_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.13
     */
    DARK_OAK_LEAVES(-1, Leaves.class),
    /**
     * @since 1.13
     */
    DARK_OAK_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    DARK_OAK_PLANKS(-1),
    /**
     * @since 1.13
     */
    DARK_OAK_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.13
     */
    DARK_OAK_SAPLING(-1, Sapling.class),
    /**
     * @since 1.21.10
     */
    DARK_OAK_SHELF(-1, Shelf.class),
    /**
     * @since 1.14
     */
    DARK_OAK_SIGN(-1, Sign.class),
    /**
     * @since 1.13
     */
    DARK_OAK_SLAB(-1, Slab.class),
    /**
     * @since 1.7.2
     */
    DARK_OAK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    DARK_OAK_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    DARK_OAK_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.14
     */
    DARK_OAK_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.13
     */
    DARK_OAK_WOOD(-1, Orientable.class),
    /**
     * @since 1.13
     */
    DARK_PRISMARINE(-1),
    /**
     * @since 1.13
     */
    DARK_PRISMARINE_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    DARK_PRISMARINE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.5.1
     */
    DAYLIGHT_DETECTOR(-1, DaylightDetector.class),
    /**
     * @since 1.13.1
     */
    DEAD_BRAIN_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_BRAIN_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    DEAD_BRAIN_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_BRAIN_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.13.1
     */
    DEAD_BUBBLE_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_BUBBLE_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    DEAD_BUBBLE_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_BUBBLE_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.0.0
     */
    DEAD_BUSH(-1),
    /**
     * @since 1.13.1
     */
    DEAD_FIRE_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_FIRE_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    DEAD_FIRE_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_FIRE_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.13.1
     */
    DEAD_HORN_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_HORN_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    DEAD_HORN_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_HORN_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.13.1
     */
    DEAD_TUBE_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_TUBE_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    DEAD_TUBE_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    DEAD_TUBE_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.19.4
     */
    DECORATED_POT(-1, DecoratedPot.class),
    /**
     * @since 1.17
     */
    DEEPSLATE(-1, Orientable.class),
    /**
     * @since 1.17
     */
    DEEPSLATE_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    DEEPSLATE_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.17
     */
    DEEPSLATE_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.17
     */
    DEEPSLATE_BRICKS(-1),
    /**
     * @since 1.17
     */
    DEEPSLATE_COAL_ORE(-1),
    /**
     * @since 1.17
     */
    DEEPSLATE_COPPER_ORE(-1),
    /**
     * @since 1.17
     */
    DEEPSLATE_DIAMOND_ORE(-1),
    /**
     * @since 1.17
     */
    DEEPSLATE_EMERALD_ORE(-1),
    /**
     * @since 1.17
     */
    DEEPSLATE_GOLD_ORE(-1),
    /**
     * @since 1.17
     */
    DEEPSLATE_IRON_ORE(-1),
    /**
     * @since 1.17
     */
    DEEPSLATE_LAPIS_ORE(-1),
    /**
     * @since 1.17
     */
    DEEPSLATE_REDSTONE_ORE(-1, Lightable.class),
    /**
     * @since 1.17
     */
    DEEPSLATE_TILE_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    DEEPSLATE_TILE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.17
     */
    DEEPSLATE_TILE_WALL(-1, Wall.class),
    /**
     * @since 1.17
     */
    DEEPSLATE_TILES(-1),
    /**
     * @since 1.0.0
     */
    DETECTOR_RAIL(-1, RedstoneRail.class),
    /**
     * @since 1.0.0
     */
    DIAMOND_BLOCK(-1),
    /**
     * @since 1.0.0
     */
    DIAMOND_ORE(-1),
    /**
     * @since 1.13
     */
    DIORITE(-1),
    /**
     * @since 1.14
     */
    DIORITE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    DIORITE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    DIORITE_WALL(-1, Wall.class),
    /**
     * @since 1.0.0
     */
    DIRT(-1),
    /**
     * @since 1.17
     */
    DIRT_PATH(-1),
    /**
     * @since 1.0.0
     */
    DISPENSER(-1, Dispenser.class),
    /**
     * @since 1.0.0
     */
    DRAGON_EGG(-1),
    /**
     * @since 1.13
     */
    DRAGON_HEAD(-1, Skull.class),
    /**
     * @since 1.13
     */
    DRAGON_WALL_HEAD(-1, WallSkull.class),
    /**
     * @since 1.21.6
     */
    DRIED_GHAST(-1, DriedGhast.class),
    /**
     * @since 1.13
     */
    DRIED_KELP_BLOCK(-1),
    /**
     * @since 1.17
     */
    DRIPSTONE_BLOCK(-1),
    /**
     * @since 1.5.1
     */
    DROPPER(-1, Dispenser.class),
    /**
     * @since 1.3.1
     */
    EMERALD_BLOCK(-1),
    /**
     * @since 1.3.1
     */
    EMERALD_ORE(-1),
    /**
     * @since 1.13
     */
    ENCHANTING_TABLE(-1),
    /**
     * @since 1.9.4
     */
    END_GATEWAY(-1),
    /**
     * @since 1.13
     */
    END_PORTAL(-1),
    /**
     * @since 1.13
     */
    END_PORTAL_FRAME(-1, EndPortalFrame.class),
    /**
     * @since 1.9.4
     */
    END_ROD(-1, Directional.class),
    /**
     * @since 1.13
     */
    END_STONE(-1),
    /**
     * @since 1.14
     */
    END_STONE_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    END_STONE_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    END_STONE_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    END_STONE_BRICKS(-1),
    /**
     * @since 1.3.1
     */
    ENDER_CHEST(-1, EnderChest.class),
    /**
     * @since 1.20.4
     */
    EXPOSED_CHISELED_COPPER(-1),
    /**
     * @since 1.17
     */
    EXPOSED_COPPER(-1),
    /**
     * @since 1.21.10
     */
    EXPOSED_COPPER_BARS(-1, Fence.class),
    /**
     * @since 1.20.4
     */
    EXPOSED_COPPER_BULB(-1, CopperBulb.class),
    /**
     * @since 1.21.10
     */
    EXPOSED_COPPER_CHAIN(-1, Chain.class),
    /**
     * @since 1.21.10
     */
    EXPOSED_COPPER_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    EXPOSED_COPPER_DOOR(-1, Door.class),
    /**
     * @since 1.21.10
     */
    EXPOSED_COPPER_GOLEM_STATUE(-1, CopperGolemStatue.class),
    /**
     * @since 1.20.4
     */
    EXPOSED_COPPER_GRATE(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    EXPOSED_COPPER_LANTERN(-1, Lantern.class),
    /**
     * @since 1.20.4
     */
    EXPOSED_COPPER_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.17
     */
    EXPOSED_CUT_COPPER(-1),
    /**
     * @since 1.17
     */
    EXPOSED_CUT_COPPER_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    EXPOSED_CUT_COPPER_STAIRS(-1, Stairs.class),
    /**
     * @since 1.21.10
     */
    EXPOSED_LIGHTNING_ROD(-1, LightningRod.class),
    /**
     * @since 1.13
     */
    FARMLAND(-1, Farmland.class),
    /**
     * @since 1.13
     */
    FERN(-1),
    /**
     * @since 1.0.0
     */
    FIRE(-1, Fire.class),
    /**
     * @since 1.13
     */
    FIRE_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    FIRE_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    FIRE_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    FIRE_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.21.6
     */
    FIREFLY_BUSH(-1),
    /**
     * @since 1.14
     */
    FLETCHING_TABLE(-1),
    /**
     * @since 1.4.5
     */
    FLOWER_POT(-1),
    /**
     * @since 1.17
     */
    FLOWERING_AZALEA(-1),
    /**
     * @since 1.17
     */
    FLOWERING_AZALEA_LEAVES(-1, Leaves.class),
    /**
     * @since 1.19
     */
    FROGSPAWN(-1),
    /**
     * @since 1.9.4
     */
    FROSTED_ICE(-1, Ageable.class),
    /**
     * @since 1.0.0
     */
    FURNACE(-1, Furnace.class),
    /**
     * @since 1.16.1
     */
    GILDED_BLACKSTONE(-1),
    /**
     * @since 1.0.0
     */
    GLASS(-1),
    /**
     * @since 1.13
     */
    GLASS_PANE(-1, Fence.class),
    /**
     * @since 1.17
     */
    GLOW_LICHEN(-1, GlowLichen.class),
    /**
     * @since 1.0.0
     */
    GLOWSTONE(-1),
    /**
     * @since 1.0.0
     */
    GOLD_BLOCK(-1),
    /**
     * @since 1.0.0
     */
    GOLD_ORE(-1),
    /**
     * @since 26.2
     */
    GOLDEN_DANDELION(-1),
    /**
     * @since 1.13
     */
    GRANITE(-1),
    /**
     * @since 1.14
     */
    GRANITE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    GRANITE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    GRANITE_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    GRASS_BLOCK(-1, Snowable.class),
    /**
     * @since 1.0.0
     */
    GRAVEL(-1),
    /**
     * @since 1.13
     */
    GRAY_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    GRAY_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    GRAY_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    GRAY_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    GRAY_CARPET(-1),
    /**
     * @since 1.13
     */
    GRAY_CONCRETE(-1),
    /**
     * @since 1.13
     */
    GRAY_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    GRAY_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    GRAY_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    GRAY_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    GRAY_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    GRAY_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    GRAY_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    GRAY_WOOL(-1),
    /**
     * @since 1.13
     */
    GREEN_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    GREEN_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    GREEN_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    GREEN_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    GREEN_CARPET(-1),
    /**
     * @since 1.13
     */
    GREEN_CONCRETE(-1),
    /**
     * @since 1.13
     */
    GREEN_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    GREEN_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    GREEN_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    GREEN_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    GREEN_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    GREEN_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    GREEN_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    GREEN_WOOL(-1),
    /**
     * @since 1.14
     */
    GRINDSTONE(-1, Grindstone.class),
    /**
     * @since 1.17
     */
    HANGING_ROOTS(-1, Waterlogged.class),
    /**
     * @since 1.6.1
     */
    HAY_BLOCK(-1, Orientable.class),
    /**
     * @since 1.20.6
     */
    HEAVY_CORE(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    HEAVY_WEIGHTED_PRESSURE_PLATE(-1, AnaloguePowerable.class),
    /**
     * @since 1.15
     */
    HONEY_BLOCK(-1),
    /**
     * @since 1.15
     */
    HONEYCOMB_BLOCK(-1),
    /**
     * @since 1.5.1
     */
    HOPPER(-1, Hopper.class),
    /**
     * @since 1.13
     */
    HORN_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    HORN_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    HORN_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    HORN_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.0.0
     */
    ICE(-1),
    /**
     * @since 1.13
     */
    INFESTED_CHISELED_STONE_BRICKS(-1),
    /**
     * @since 1.13
     */
    INFESTED_COBBLESTONE(-1),
    /**
     * @since 1.13
     */
    INFESTED_CRACKED_STONE_BRICKS(-1),
    /**
     * @since 1.17
     */
    INFESTED_DEEPSLATE(-1, Orientable.class),
    /**
     * @since 1.13
     */
    INFESTED_MOSSY_STONE_BRICKS(-1),
    /**
     * @since 1.13
     */
    INFESTED_STONE(-1),
    /**
     * @since 1.13
     */
    INFESTED_STONE_BRICKS(-1),
    /**
     * @since 1.13
     */
    IRON_BARS(-1, Fence.class),
    /**
     * @since 1.0.0
     */
    IRON_BLOCK(-1),
    /**
     * @since 1.21.10
     */
    IRON_CHAIN(-1, Chain.class),
    /**
     * @since 1.0.0
     */
    IRON_DOOR(-1, Door.class),
    /**
     * @since 1.0.0
     */
    IRON_ORE(-1),
    /**
     * @since 1.8
     */
    IRON_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.0.0
     */
    JACK_O_LANTERN(-1, Directional.class),
    /**
     * @since 1.14
     */
    JIGSAW(-1, Jigsaw.class),
    /**
     * @since 1.0.0
     */
    JUKEBOX(-1, Jukebox.class),
    /**
     * @since 1.13
     */
    JUNGLE_BUTTON(-1, Switch.class),
    /**
     * @since 1.8
     */
    JUNGLE_DOOR(-1, Door.class),
    /**
     * @since 1.8
     */
    JUNGLE_FENCE(-1, Fence.class),
    /**
     * @since 1.8
     */
    JUNGLE_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.3
     */
    JUNGLE_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.13
     */
    JUNGLE_LEAVES(-1, Leaves.class),
    /**
     * @since 1.13
     */
    JUNGLE_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    JUNGLE_PLANKS(-1),
    /**
     * @since 1.13
     */
    JUNGLE_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.13
     */
    JUNGLE_SAPLING(-1, Sapling.class),
    /**
     * @since 1.21.10
     */
    JUNGLE_SHELF(-1, Shelf.class),
    /**
     * @since 1.14
     */
    JUNGLE_SIGN(-1, Sign.class),
    /**
     * @since 1.13
     */
    JUNGLE_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    JUNGLE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    JUNGLE_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    JUNGLE_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.14
     */
    JUNGLE_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.13
     */
    JUNGLE_WOOD(-1, Orientable.class),
    /**
     * @since 1.13
     */
    KELP(-1, Ageable.class),
    /**
     * @since 1.13
     */
    KELP_PLANT(-1),
    /**
     * @since 1.0.0
     */
    LADDER(-1, Ladder.class),
    /**
     * @since 1.14
     */
    LANTERN(-1, Lantern.class),
    /**
     * @since 1.0.0
     */
    LAPIS_BLOCK(-1),
    /**
     * @since 1.0.0
     */
    LAPIS_ORE(-1),
    /**
     * @since 1.17
     */
    LARGE_AMETHYST_BUD(-1, AmethystCluster.class),
    /**
     * @since 1.13
     */
    LARGE_FERN(-1, Bisected.class),
    /**
     * @since 1.0.0
     */
    LAVA(-1, Levelled.class),
    /**
     * @since 1.17
     */
    LAVA_CAULDRON(-1),
    /**
     * @since 1.21.6
     */
    LEAF_LITTER(-1, LeafLitter.class),
    /**
     * @since 1.14
     */
    LECTERN(-1, Lectern.class),
    /**
     * @since 1.0.0
     */
    LEVER(-1, Switch.class),
    /**
     * @since 1.17
     */
    LIGHT(-1, Light.class),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    LIGHT_BLUE_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    LIGHT_BLUE_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_CARPET(-1),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_CONCRETE(-1),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    LIGHT_BLUE_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    LIGHT_BLUE_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    LIGHT_BLUE_WOOL(-1),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    LIGHT_GRAY_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    LIGHT_GRAY_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_CARPET(-1),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_CONCRETE(-1),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_CONCRETE_POWDER(-1),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    LIGHT_GRAY_WOOL(-1),
    /**
     * @since 1.13
     */
    LIGHT_WEIGHTED_PRESSURE_PLATE(-1, AnaloguePowerable.class),
    /**
     * @since 1.17
     */
    LIGHTNING_ROD(-1, LightningRod.class),
    /**
     * @since 1.13
     */
    LILAC(-1, Bisected.class),
    /**
     * @since 1.14
     */
    LILY_OF_THE_VALLEY(-1),
    /**
     * @since 1.13
     */
    LILY_PAD(-1),
    /**
     * @since 1.13
     */
    LIME_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    LIME_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    LIME_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    LIME_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    LIME_CARPET(-1),
    /**
     * @since 1.13
     */
    LIME_CONCRETE(-1),
    /**
     * @since 1.13
     */
    LIME_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    LIME_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    LIME_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    LIME_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    LIME_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    LIME_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    LIME_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    LIME_WOOL(-1),
    /**
     * @since 1.16.1
     */
    LODESTONE(-1),
    /**
     * @since 1.14
     */
    LOOM(-1, Directional.class),
    /**
     * @since 1.13
     */
    MAGENTA_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    MAGENTA_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    MAGENTA_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    MAGENTA_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    MAGENTA_CARPET(-1),
    /**
     * @since 1.13
     */
    MAGENTA_CONCRETE(-1),
    /**
     * @since 1.13
     */
    MAGENTA_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    MAGENTA_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    MAGENTA_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    MAGENTA_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    MAGENTA_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    MAGENTA_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    MAGENTA_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    MAGENTA_WOOL(-1),
    /**
     * @since 1.13
     */
    MAGMA_BLOCK(-1),
    /**
     * @since 1.19
     */
    MANGROVE_BUTTON(-1, Switch.class),
    /**
     * @since 1.19
     */
    MANGROVE_DOOR(-1, Door.class),
    /**
     * @since 1.19
     */
    MANGROVE_FENCE(-1, Fence.class),
    /**
     * @since 1.19
     */
    MANGROVE_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.3
     */
    MANGROVE_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.19
     */
    MANGROVE_LEAVES(-1, Leaves.class),
    /**
     * @since 1.19
     */
    MANGROVE_LOG(-1, Orientable.class),
    /**
     * @since 1.19
     */
    MANGROVE_PLANKS(-1),
    /**
     * @since 1.19
     */
    MANGROVE_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.19
     */
    MANGROVE_PROPAGULE(-1, MangrovePropagule.class),
    /**
     * @since 1.19
     */
    MANGROVE_ROOTS(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    MANGROVE_SHELF(-1, Shelf.class),
    /**
     * @since 1.19
     */
    MANGROVE_SIGN(-1, Sign.class),
    /**
     * @since 1.19
     */
    MANGROVE_SLAB(-1, Slab.class),
    /**
     * @since 1.19
     */
    MANGROVE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.19
     */
    MANGROVE_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    MANGROVE_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.19
     */
    MANGROVE_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.19
     */
    MANGROVE_WOOD(-1, Orientable.class),
    /**
     * @since 1.17
     */
    MEDIUM_AMETHYST_BUD(-1, AmethystCluster.class),
    /**
     * @since 1.0.0
     */
    MELON(-1),
    /**
     * @since 1.0.0
     */
    MELON_STEM(-1, Ageable.class),
    /**
     * @since 1.17
     */
    MOSS_BLOCK(-1),
    /**
     * @since 1.17
     */
    MOSS_CARPET(-1),
    /**
     * @since 1.0.0
     */
    MOSSY_COBBLESTONE(-1),
    /**
     * @since 1.14
     */
    MOSSY_COBBLESTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    MOSSY_COBBLESTONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    MOSSY_COBBLESTONE_WALL(-1, Wall.class),
    /**
     * @since 1.14
     */
    MOSSY_STONE_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    MOSSY_STONE_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    MOSSY_STONE_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    MOSSY_STONE_BRICKS(-1),
    /**
     * @since 1.13
     */
    MOVING_PISTON(-1, TechnicalPiston.class),
    /**
     * @since 1.19
     */
    MUD(-1),
    /**
     * @since 1.19
     */
    MUD_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.19
     */
    MUD_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.19
     */
    MUD_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.19
     */
    MUD_BRICKS(-1),
    /**
     * @since 1.19
     */
    MUDDY_MANGROVE_ROOTS(-1, Orientable.class),
    /**
     * @since 1.13
     */
    MUSHROOM_STEM(-1, MultipleFacing.class),
    /**
     * @since 1.13
     */
    MYCELIUM(-1, Snowable.class),
    /**
     * @since 1.13
     */
    NETHER_BRICK_FENCE(-1, Fence.class),
    /**
     * @since 1.13
     */
    NETHER_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.0.0
     */
    NETHER_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    NETHER_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    NETHER_BRICKS(-1),
    /**
     * @since 1.16.1
     */
    NETHER_GOLD_ORE(-1),
    /**
     * @since 1.13
     */
    NETHER_PORTAL(-1, Orientable.class),
    /**
     * @since 1.13
     */
    NETHER_QUARTZ_ORE(-1),
    /**
     * @since 1.16.1
     */
    NETHER_SPROUTS(-1),
    /**
     * @since 1.13
     */
    NETHER_WART(-1, Ageable.class),
    /**
     * @since 1.10.2
     */
    NETHER_WART_BLOCK(-1),
    /**
     * @since 1.16.1
     */
    NETHERITE_BLOCK(-1),
    /**
     * @since 1.0.0
     */
    NETHERRACK(-1),
    /**
     * @since 1.0.0
     */
    NOTE_BLOCK(-1, NoteBlock.class),
    /**
     * @since 1.13
     */
    OAK_BUTTON(-1, Switch.class),
    /**
     * @since 1.13
     */
    OAK_DOOR(-1, Door.class),
    /**
     * @since 1.13
     */
    OAK_FENCE(-1, Fence.class),
    /**
     * @since 1.13
     */
    OAK_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.3
     */
    OAK_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.13
     */
    OAK_LEAVES(-1, Leaves.class),
    /**
     * @since 1.13
     */
    OAK_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    OAK_PLANKS(-1),
    /**
     * @since 1.13
     */
    OAK_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.13
     */
    OAK_SAPLING(-1, Sapling.class),
    /**
     * @since 1.21.10
     */
    OAK_SHELF(-1, Shelf.class),
    /**
     * @since 1.14
     */
    OAK_SIGN(-1, Sign.class),
    /**
     * @since 1.13
     */
    OAK_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    OAK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    OAK_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    OAK_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.14
     */
    OAK_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.13
     */
    OAK_WOOD(-1, Orientable.class),
    /**
     * @since 1.11
     */
    OBSERVER(-1, Observer.class),
    /**
     * @since 1.0.0
     */
    OBSIDIAN(-1),
    /**
     * @since 1.19
     */
    OCHRE_FROGLIGHT(-1, Orientable.class),
    /**
     * @since 1.21.4
     */
    OPEN_EYEBLOSSOM(-1),
    /**
     * @since 1.13
     */
    ORANGE_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    ORANGE_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    ORANGE_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    ORANGE_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    ORANGE_CARPET(-1),
    /**
     * @since 1.13
     */
    ORANGE_CONCRETE(-1),
    /**
     * @since 1.13
     */
    ORANGE_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    ORANGE_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    ORANGE_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    ORANGE_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    ORANGE_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    ORANGE_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    ORANGE_TULIP(-1),
    /**
     * @since 1.13
     */
    ORANGE_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    ORANGE_WOOL(-1),
    /**
     * @since 1.13
     */
    OXEYE_DAISY(-1),
    /**
     * @since 1.20.4
     */
    OXIDIZED_CHISELED_COPPER(-1),
    /**
     * @since 1.17
     */
    OXIDIZED_COPPER(-1),
    /**
     * @since 1.21.10
     */
    OXIDIZED_COPPER_BARS(-1, Fence.class),
    /**
     * @since 1.20.4
     */
    OXIDIZED_COPPER_BULB(-1, CopperBulb.class),
    /**
     * @since 1.21.10
     */
    OXIDIZED_COPPER_CHAIN(-1, Chain.class),
    /**
     * @since 1.21.10
     */
    OXIDIZED_COPPER_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    OXIDIZED_COPPER_DOOR(-1, Door.class),
    /**
     * @since 1.21.10
     */
    OXIDIZED_COPPER_GOLEM_STATUE(-1, CopperGolemStatue.class),
    /**
     * @since 1.20.4
     */
    OXIDIZED_COPPER_GRATE(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    OXIDIZED_COPPER_LANTERN(-1, Lantern.class),
    /**
     * @since 1.20.4
     */
    OXIDIZED_COPPER_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.17
     */
    OXIDIZED_CUT_COPPER(-1),
    /**
     * @since 1.17
     */
    OXIDIZED_CUT_COPPER_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    OXIDIZED_CUT_COPPER_STAIRS(-1, Stairs.class),
    /**
     * @since 1.21.10
     */
    OXIDIZED_LIGHTNING_ROD(-1, LightningRod.class),
    /**
     * @since 1.7.2
     */
    PACKED_ICE(-1),
    /**
     * @since 1.19
     */
    PACKED_MUD(-1),
    /**
     * @since 1.21.3
     */
    PALE_HANGING_MOSS(-1, HangingMoss.class),
    /**
     * @since 1.21.3
     */
    PALE_MOSS_BLOCK(-1),
    /**
     * @since 1.21.3
     */
    PALE_MOSS_CARPET(-1, MossyCarpet.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_BUTTON(-1, Switch.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_DOOR(-1, Door.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_FENCE(-1, Fence.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_LEAVES(-1, Leaves.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_LOG(-1, Orientable.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_PLANKS(-1),
    /**
     * @since 1.21.3
     */
    PALE_OAK_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_SAPLING(-1, Sapling.class),
    /**
     * @since 1.21.10
     */
    PALE_OAK_SHELF(-1, Shelf.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_SIGN(-1, Sign.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_SLAB(-1, Slab.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.21.3
     */
    PALE_OAK_WOOD(-1, Orientable.class),
    /**
     * @since 1.19
     */
    PEARLESCENT_FROGLIGHT(-1, Orientable.class),
    /**
     * @since 1.13
     */
    PEONY(-1, Bisected.class),
    /**
     * @since 1.13
     */
    PETRIFIED_OAK_SLAB(-1, Slab.class),
    /**
     * @since 1.19.3
     */
    PIGLIN_HEAD(-1, Skull.class),
    /**
     * @since 1.19.3
     */
    PIGLIN_WALL_HEAD(-1, WallSkull.class),
    /**
     * @since 1.13
     */
    PINK_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    PINK_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    PINK_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    PINK_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    PINK_CARPET(-1),
    /**
     * @since 1.13
     */
    PINK_CONCRETE(-1),
    /**
     * @since 1.13
     */
    PINK_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    PINK_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.19.4
     */
    PINK_PETALS(-1, FlowerBed.class),
    /**
     * @since 1.11
     */
    PINK_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    PINK_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    PINK_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    PINK_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    PINK_TULIP(-1),
    /**
     * @since 1.13
     */
    PINK_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    PINK_WOOL(-1),
    /**
     * @since 1.13
     */
    PISTON(-1, Piston.class),
    /**
     * @since 1.13
     */
    PISTON_HEAD(-1, PistonHead.class),
    /**
     * @since 1.20
     */
    PITCHER_CROP(-1, PitcherCrop.class),
    /**
     * @since 1.20
     */
    PITCHER_PLANT(-1, Bisected.class),
    /**
     * @since 1.13
     */
    PLAYER_HEAD(-1, Skull.class),
    /**
     * @since 1.13
     */
    PLAYER_WALL_HEAD(-1, WallSkull.class),
    /**
     * @since 1.13
     */
    PODZOL(-1, Snowable.class),
    /**
     * @since 1.17
     */
    POINTED_DRIPSTONE(-1, Speleothem.class),
    /**
     * @since 1.13
     */
    POLISHED_ANDESITE(-1),
    /**
     * @since 1.14
     */
    POLISHED_ANDESITE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    POLISHED_ANDESITE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BASALT(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE(-1),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_BRICKS(-1),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_BUTTON(-1, Switch.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.16.1
     */
    POLISHED_BLACKSTONE_WALL(-1, Wall.class),
    /**
     * @since 26.2
     */
    POLISHED_CINNABAR(-1),
    /**
     * @since 26.2
     */
    POLISHED_CINNABAR_SLAB(-1, Slab.class),
    /**
     * @since 26.2
     */
    POLISHED_CINNABAR_STAIRS(-1, Stairs.class),
    /**
     * @since 26.2
     */
    POLISHED_CINNABAR_WALL(-1, Wall.class),
    /**
     * @since 1.17
     */
    POLISHED_DEEPSLATE(-1),
    /**
     * @since 1.17
     */
    POLISHED_DEEPSLATE_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    POLISHED_DEEPSLATE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.17
     */
    POLISHED_DEEPSLATE_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    POLISHED_DIORITE(-1),
    /**
     * @since 1.14
     */
    POLISHED_DIORITE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    POLISHED_DIORITE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    POLISHED_GRANITE(-1),
    /**
     * @since 1.14
     */
    POLISHED_GRANITE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    POLISHED_GRANITE_STAIRS(-1, Stairs.class),
    /**
     * @since 26.2
     */
    POLISHED_SULFUR(-1),
    /**
     * @since 26.2
     */
    POLISHED_SULFUR_SLAB(-1, Slab.class),
    /**
     * @since 26.2
     */
    POLISHED_SULFUR_STAIRS(-1, Stairs.class),
    /**
     * @since 26.2
     */
    POLISHED_SULFUR_WALL(-1, Wall.class),
    /**
     * @since 1.20.4
     */
    POLISHED_TUFF(-1),
    /**
     * @since 1.20.4
     */
    POLISHED_TUFF_SLAB(-1, Slab.class),
    /**
     * @since 1.20.4
     */
    POLISHED_TUFF_STAIRS(-1, Stairs.class),
    /**
     * @since 1.20.4
     */
    POLISHED_TUFF_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    POPPY(-1),
    /**
     * @since 1.13
     */
    POTATOES(-1, Ageable.class),
    /**
     * @since 26.2
     */
    POTENT_SULFUR(-1, PotentSulfur.class),
    /**
     * @since 1.13
     */
    POTTED_ACACIA_SAPLING(-1),
    /**
     * @since 1.13
     */
    POTTED_ALLIUM(-1),
    /**
     * @since 1.17
     */
    POTTED_AZALEA_BUSH(-1),
    /**
     * @since 1.13
     */
    POTTED_AZURE_BLUET(-1),
    /**
     * @since 1.14
     */
    POTTED_BAMBOO(-1),
    /**
     * @since 1.13
     */
    POTTED_BIRCH_SAPLING(-1),
    /**
     * @since 1.13
     */
    POTTED_BLUE_ORCHID(-1),
    /**
     * @since 1.13
     */
    POTTED_BROWN_MUSHROOM(-1),
    /**
     * @since 1.13
     */
    POTTED_CACTUS(-1),
    /**
     * @since 1.19.4
     */
    POTTED_CHERRY_SAPLING(-1),
    /**
     * @since 1.21.4
     */
    POTTED_CLOSED_EYEBLOSSOM(-1),
    /**
     * @since 1.14
     */
    POTTED_CORNFLOWER(-1),
    /**
     * @since 1.16.1
     */
    POTTED_CRIMSON_FUNGUS(-1),
    /**
     * @since 1.16.1
     */
    POTTED_CRIMSON_ROOTS(-1),
    /**
     * @since 1.13
     */
    POTTED_DANDELION(-1),
    /**
     * @since 1.13
     */
    POTTED_DARK_OAK_SAPLING(-1),
    /**
     * @since 1.13
     */
    POTTED_DEAD_BUSH(-1),
    /**
     * @since 1.13
     */
    POTTED_FERN(-1),
    /**
     * @since 1.17
     */
    POTTED_FLOWERING_AZALEA_BUSH(-1),
    /**
     * @since 26.2
     */
    POTTED_GOLDEN_DANDELION(-1),
    /**
     * @since 1.13
     */
    POTTED_JUNGLE_SAPLING(-1),
    /**
     * @since 1.14
     */
    POTTED_LILY_OF_THE_VALLEY(-1),
    /**
     * @since 1.19
     */
    POTTED_MANGROVE_PROPAGULE(-1),
    /**
     * @since 1.13
     */
    POTTED_OAK_SAPLING(-1),
    /**
     * @since 1.21.4
     */
    POTTED_OPEN_EYEBLOSSOM(-1),
    /**
     * @since 1.13
     */
    POTTED_ORANGE_TULIP(-1),
    /**
     * @since 1.13
     */
    POTTED_OXEYE_DAISY(-1),
    /**
     * @since 1.21.3
     */
    POTTED_PALE_OAK_SAPLING(-1),
    /**
     * @since 1.13
     */
    POTTED_PINK_TULIP(-1),
    /**
     * @since 1.13
     */
    POTTED_POPPY(-1),
    /**
     * @since 1.13
     */
    POTTED_RED_MUSHROOM(-1),
    /**
     * @since 1.13
     */
    POTTED_RED_TULIP(-1),
    /**
     * @since 1.13
     */
    POTTED_SPRUCE_SAPLING(-1),
    /**
     * @since 1.19.4
     */
    POTTED_TORCHFLOWER(-1),
    /**
     * @since 1.16.1
     */
    POTTED_WARPED_FUNGUS(-1),
    /**
     * @since 1.16.1
     */
    POTTED_WARPED_ROOTS(-1),
    /**
     * @since 1.13
     */
    POTTED_WHITE_TULIP(-1),
    /**
     * @since 1.14
     */
    POTTED_WITHER_ROSE(-1),
    /**
     * @since 1.17
     */
    POWDER_SNOW(-1),
    /**
     * @since 1.17
     */
    POWDER_SNOW_CAULDRON(-1, Levelled.class),
    /**
     * @since 1.0.0
     */
    POWERED_RAIL(-1, RedstoneRail.class),
    /**
     * @since 1.8
     */
    PRISMARINE(-1),
    /**
     * @since 1.13
     */
    PRISMARINE_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    PRISMARINE_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    PRISMARINE_BRICKS(-1),
    /**
     * @since 1.13
     */
    PRISMARINE_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    PRISMARINE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    PRISMARINE_WALL(-1, Wall.class),
    /**
     * @since 1.0.0
     */
    PUMPKIN(-1),
    /**
     * @since 1.0.0
     */
    PUMPKIN_STEM(-1, Ageable.class),
    /**
     * @since 1.13
     */
    PURPLE_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    PURPLE_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    PURPLE_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    PURPLE_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    PURPLE_CARPET(-1),
    /**
     * @since 1.13
     */
    PURPLE_CONCRETE(-1),
    /**
     * @since 1.13
     */
    PURPLE_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    PURPLE_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    PURPLE_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    PURPLE_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    PURPLE_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    PURPLE_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    PURPLE_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    PURPLE_WOOL(-1),
    /**
     * @since 1.9.4
     */
    PURPUR_BLOCK(-1),
    /**
     * @since 1.9.4
     */
    PURPUR_PILLAR(-1, Orientable.class),
    /**
     * @since 1.9.4
     */
    PURPUR_SLAB(-1, Slab.class),
    /**
     * @since 1.9.4
     */
    PURPUR_STAIRS(-1, Stairs.class),
    /**
     * @since 1.5.1
     */
    QUARTZ_BLOCK(-1),
    /**
     * @since 1.16.1
     */
    QUARTZ_BRICKS(-1),
    /**
     * @since 1.13
     */
    QUARTZ_PILLAR(-1, Orientable.class),
    /**
     * @since 1.13
     */
    QUARTZ_SLAB(-1, Slab.class),
    /**
     * @since 1.5.1
     */
    QUARTZ_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    RAIL(-1, Rail.class),
    /**
     * @since 1.17
     */
    RAW_COPPER_BLOCK(-1),
    /**
     * @since 1.17
     */
    RAW_GOLD_BLOCK(-1),
    /**
     * @since 1.17
     */
    RAW_IRON_BLOCK(-1),
    /**
     * @since 1.13
     */
    RED_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    RED_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    RED_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    RED_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    RED_CARPET(-1),
    /**
     * @since 1.13
     */
    RED_CONCRETE(-1),
    /**
     * @since 1.13
     */
    RED_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    RED_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.0.0
     */
    RED_MUSHROOM(-1),
    /**
     * @since 1.13
     */
    RED_MUSHROOM_BLOCK(-1, MultipleFacing.class),
    /**
     * @since 1.14
     */
    RED_NETHER_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    RED_NETHER_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    RED_NETHER_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    RED_NETHER_BRICKS(-1),
    /**
     * @since 1.13
     */
    RED_SAND(-1),
    /**
     * @since 1.8
     */
    RED_SANDSTONE(-1),
    /**
     * @since 1.13
     */
    RED_SANDSTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.8
     */
    RED_SANDSTONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    RED_SANDSTONE_WALL(-1, Wall.class),
    /**
     * @since 1.11
     */
    RED_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    RED_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    RED_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    RED_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    RED_TULIP(-1),
    /**
     * @since 1.13
     */
    RED_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    RED_WOOL(-1),
    /**
     * @since 1.5.1
     */
    REDSTONE_BLOCK(-1),
    /**
     * @since 1.13
     */
    REDSTONE_LAMP(-1, Lightable.class),
    /**
     * @since 1.0.0
     */
    REDSTONE_ORE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    REDSTONE_TORCH(-1, Lightable.class),
    /**
     * @since 1.13
     */
    REDSTONE_WALL_TORCH(-1, RedstoneWallTorch.class),
    /**
     * @since 1.0.0
     */
    REDSTONE_WIRE(-1, RedstoneWire.class),
    /**
     * @since 1.19
     */
    REINFORCED_DEEPSLATE(-1),
    /**
     * @since 1.13
     */
    REPEATER(-1, Repeater.class),
    /**
     * @since 1.13
     */
    REPEATING_COMMAND_BLOCK(-1, CommandBlock.class),
    /**
     * @since 1.21.4
     */
    RESIN_BLOCK(-1),
    /**
     * @since 1.21.4
     */
    RESIN_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.21.4
     */
    RESIN_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.21.4
     */
    RESIN_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.21.4
     */
    RESIN_BRICKS(-1),
    /**
     * @since 1.21.4
     */
    RESIN_CLUMP(-1, ResinClump.class),
    /**
     * @since 1.16.1
     */
    RESPAWN_ANCHOR(-1, RespawnAnchor.class),
    /**
     * @since 1.17
     */
    ROOTED_DIRT(-1),
    /**
     * @since 1.13
     */
    ROSE_BUSH(-1, Bisected.class),
    /**
     * @since 1.0.0
     */
    SAND(-1),
    /**
     * @since 1.0.0
     */
    SANDSTONE(-1),
    /**
     * @since 1.13
     */
    SANDSTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.3.1
     */
    SANDSTONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    SANDSTONE_WALL(-1, Wall.class),
    /**
     * @since 1.14
     */
    SCAFFOLDING(-1, Scaffolding.class),
    /**
     * @since 1.19
     */
    SCULK(-1),
    /**
     * @since 1.19
     */
    SCULK_CATALYST(-1, SculkCatalyst.class),
    /**
     * @since 1.17
     */
    SCULK_SENSOR(-1, SculkSensor.class),
    /**
     * @since 1.19
     */
    SCULK_SHRIEKER(-1, SculkShrieker.class),
    /**
     * @since 1.19
     */
    SCULK_VEIN(-1, SculkVein.class),
    /**
     * @since 1.8
     */
    SEA_LANTERN(-1),
    /**
     * @since 1.13
     */
    SEA_PICKLE(-1, SeaPickle.class),
    /**
     * @since 1.13
     */
    SEAGRASS(-1),
    /**
     * @since 1.21.6
     */
    SHORT_DRY_GRASS(-1),
    /**
     * @since 1.20.4
     */
    SHORT_GRASS(-1),
    /**
     * @since 1.16.1
     */
    SHROOMLIGHT(-1),
    /**
     * @since 1.13
     */
    SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    SKELETON_SKULL(-1, Skull.class),
    /**
     * @since 1.13
     */
    SKELETON_WALL_SKULL(-1, WallSkull.class),
    /**
     * @since 1.8
     */
    SLIME_BLOCK(-1),
    /**
     * @since 1.17
     */
    SMALL_AMETHYST_BUD(-1, AmethystCluster.class),
    /**
     * @since 1.17
     */
    SMALL_DRIPLEAF(-1, SmallDripleaf.class),
    /**
     * @since 1.14
     */
    SMITHING_TABLE(-1),
    /**
     * @since 1.14
     */
    SMOKER(-1, Furnace.class),
    /**
     * @since 1.17
     */
    SMOOTH_BASALT(-1),
    /**
     * @since 1.13
     */
    SMOOTH_QUARTZ(-1),
    /**
     * @since 1.14
     */
    SMOOTH_QUARTZ_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    SMOOTH_QUARTZ_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    SMOOTH_RED_SANDSTONE(-1),
    /**
     * @since 1.14
     */
    SMOOTH_RED_SANDSTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    SMOOTH_RED_SANDSTONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    SMOOTH_SANDSTONE(-1),
    /**
     * @since 1.14
     */
    SMOOTH_SANDSTONE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    SMOOTH_SANDSTONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    SMOOTH_STONE(-1),
    /**
     * @since 1.14
     */
    SMOOTH_STONE_SLAB(-1, Slab.class),
    /**
     * @since 1.20
     */
    SNIFFER_EGG(-1, Hatchable.class),
    /**
     * @since 1.0.0
     */
    SNOW(-1, Snow.class),
    /**
     * @since 1.0.0
     */
    SNOW_BLOCK(-1),
    /**
     * @since 1.16.1
     */
    SOUL_CAMPFIRE(-1, Campfire.class),
    /**
     * @since 1.16.1
     */
    SOUL_FIRE(-1),
    /**
     * @since 1.16.1
     */
    SOUL_LANTERN(-1, Lantern.class),
    /**
     * @since 1.0.0
     */
    SOUL_SAND(-1),
    /**
     * @since 1.16.1
     */
    SOUL_SOIL(-1),
    /**
     * @since 1.16.1
     */
    SOUL_TORCH(-1),
    /**
     * @since 1.16.1
     */
    SOUL_WALL_TORCH(-1, Directional.class),
    /**
     * @since 1.13
     */
    SPAWNER(-1),
    /**
     * @since 1.0.0
     */
    SPONGE(-1),
    /**
     * @since 1.17
     */
    SPORE_BLOSSOM(-1),
    /**
     * @since 1.13
     */
    SPRUCE_BUTTON(-1, Switch.class),
    /**
     * @since 1.8
     */
    SPRUCE_DOOR(-1, Door.class),
    /**
     * @since 1.8
     */
    SPRUCE_FENCE(-1, Fence.class),
    /**
     * @since 1.8
     */
    SPRUCE_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.19.3
     */
    SPRUCE_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.13
     */
    SPRUCE_LEAVES(-1, Leaves.class),
    /**
     * @since 1.13
     */
    SPRUCE_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    SPRUCE_PLANKS(-1),
    /**
     * @since 1.13
     */
    SPRUCE_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.13
     */
    SPRUCE_SAPLING(-1, Sapling.class),
    /**
     * @since 1.21.10
     */
    SPRUCE_SHELF(-1, Shelf.class),
    /**
     * @since 1.14
     */
    SPRUCE_SIGN(-1, Sign.class),
    /**
     * @since 1.13
     */
    SPRUCE_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    SPRUCE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.13
     */
    SPRUCE_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    SPRUCE_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.14
     */
    SPRUCE_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.13
     */
    SPRUCE_WOOD(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STICKY_PISTON(-1, Piston.class),
    /**
     * @since 1.0.0
     */
    STONE(-1),
    /**
     * @since 1.13
     */
    STONE_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.13
     */
    STONE_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    STONE_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    STONE_BRICKS(-1),
    /**
     * @since 1.0.0
     */
    STONE_BUTTON(-1, Switch.class),
    /**
     * @since 1.13
     */
    STONE_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.13
     */
    STONE_SLAB(-1, Slab.class),
    /**
     * @since 1.14
     */
    STONE_STAIRS(-1, Stairs.class),
    /**
     * @since 1.14
     */
    STONECUTTER(-1, Directional.class),
    /**
     * @since 1.13
     */
    STRIPPED_ACACIA_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_ACACIA_WOOD(-1, Orientable.class),
    /**
     * @since 1.19.3
     */
    STRIPPED_BAMBOO_BLOCK(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_BIRCH_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_BIRCH_WOOD(-1, Orientable.class),
    /**
     * @since 1.19.4
     */
    STRIPPED_CHERRY_LOG(-1, Orientable.class),
    /**
     * @since 1.19.4
     */
    STRIPPED_CHERRY_WOOD(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    STRIPPED_CRIMSON_HYPHAE(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    STRIPPED_CRIMSON_STEM(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_DARK_OAK_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_DARK_OAK_WOOD(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_JUNGLE_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_JUNGLE_WOOD(-1, Orientable.class),
    /**
     * @since 1.19
     */
    STRIPPED_MANGROVE_LOG(-1, Orientable.class),
    /**
     * @since 1.19
     */
    STRIPPED_MANGROVE_WOOD(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_OAK_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_OAK_WOOD(-1, Orientable.class),
    /**
     * @since 1.21.3
     */
    STRIPPED_PALE_OAK_LOG(-1, Orientable.class),
    /**
     * @since 1.21.3
     */
    STRIPPED_PALE_OAK_WOOD(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_SPRUCE_LOG(-1, Orientable.class),
    /**
     * @since 1.13
     */
    STRIPPED_SPRUCE_WOOD(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    STRIPPED_WARPED_HYPHAE(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    STRIPPED_WARPED_STEM(-1, Orientable.class),
    /**
     * @since 1.9.4
     */
    STRUCTURE_BLOCK(-1, StructureBlock.class),
    /**
     * @since 1.10.2
     */
    STRUCTURE_VOID(-1),
    /**
     * @since 1.0.0
     */
    SUGAR_CANE(-1, Ageable.class),
    /**
     * @since 26.2
     */
    SULFUR(-1),
    /**
     * @since 26.2
     */
    SULFUR_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 26.2
     */
    SULFUR_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 26.2
     */
    SULFUR_BRICK_WALL(-1, Wall.class),
    /**
     * @since 26.2
     */
    SULFUR_BRICKS(-1),
    /**
     * @since 26.2
     */
    SULFUR_SLAB(-1, Slab.class),
    /**
     * @since 26.2
     */
    SULFUR_SPIKE(-1, Speleothem.class),
    /**
     * @since 26.2
     */
    SULFUR_STAIRS(-1, Stairs.class),
    /**
     * @since 26.2
     */
    SULFUR_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    SUNFLOWER(-1, Bisected.class),
    /**
     * @since 1.20
     */
    SUSPICIOUS_GRAVEL(-1, Brushable.class),
    /**
     * @since 1.19.4
     */
    SUSPICIOUS_SAND(-1, Brushable.class),
    /**
     * @since 1.14
     */
    SWEET_BERRY_BUSH(-1, Ageable.class),
    /**
     * @since 1.21.6
     */
    TALL_DRY_GRASS(-1),
    /**
     * @since 1.13
     */
    TALL_GRASS(-1, Bisected.class),
    /**
     * @since 1.13
     */
    TALL_SEAGRASS(-1, Bisected.class),
    /**
     * @since 1.16.1
     */
    TARGET(-1, AnaloguePowerable.class),
    /**
     * @since 1.13
     */
    TERRACOTTA(-1),
    /**
     * @since 1.21.6
     */
    TEST_BLOCK(-1, TestBlock.class),
    /**
     * @since 1.21.6
     */
    TEST_INSTANCE_BLOCK(-1),
    /**
     * @since 1.17
     */
    TINTED_GLASS(-1),
    /**
     * @since 1.0.0
     */
    TNT(-1, TNT.class),
    /**
     * @since 1.0.0
     */
    TORCH(-1),
    /**
     * @since 1.19.4
     */
    TORCHFLOWER(-1),
    /**
     * @since 1.19.4
     */
    TORCHFLOWER_CROP(-1, Ageable.class),
    /**
     * @since 1.5.1
     */
    TRAPPED_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    TRIAL_SPAWNER(-1, TrialSpawner.class),
    /**
     * @since 1.3.1
     */
    TRIPWIRE(-1, Tripwire.class),
    /**
     * @since 1.3.1
     */
    TRIPWIRE_HOOK(-1, TripwireHook.class),
    /**
     * @since 1.13
     */
    TUBE_CORAL(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    TUBE_CORAL_BLOCK(-1),
    /**
     * @since 1.13
     */
    TUBE_CORAL_FAN(-1, Waterlogged.class),
    /**
     * @since 1.13
     */
    TUBE_CORAL_WALL_FAN(-1, CoralWallFan.class),
    /**
     * @since 1.17
     */
    TUFF(-1),
    /**
     * @since 1.20.4
     */
    TUFF_BRICK_SLAB(-1, Slab.class),
    /**
     * @since 1.20.4
     */
    TUFF_BRICK_STAIRS(-1, Stairs.class),
    /**
     * @since 1.20.4
     */
    TUFF_BRICK_WALL(-1, Wall.class),
    /**
     * @since 1.20.4
     */
    TUFF_BRICKS(-1),
    /**
     * @since 1.20.4
     */
    TUFF_SLAB(-1, Slab.class),
    /**
     * @since 1.20.4
     */
    TUFF_STAIRS(-1, Stairs.class),
    /**
     * @since 1.20.4
     */
    TUFF_WALL(-1, Wall.class),
    /**
     * @since 1.13
     */
    TURTLE_EGG(-1, TurtleEgg.class),
    /**
     * @since 1.16.1
     */
    TWISTING_VINES(-1, Ageable.class),
    /**
     * @since 1.16.1
     */
    TWISTING_VINES_PLANT(-1),
    /**
     * @since 1.20.6
     */
    VAULT(-1, Vault.class),
    /**
     * @since 1.19
     */
    VERDANT_FROGLIGHT(-1, Orientable.class),
    /**
     * @since 1.0.0
     */
    VINE(-1, MultipleFacing.class),
    /**
     * @since 1.13
     */
    VOID_AIR(-1),
    /**
     * @since 1.13
     */
    WALL_TORCH(-1, Directional.class),
    /**
     * @since 1.16.1
     */
    WARPED_BUTTON(-1, Switch.class),
    /**
     * @since 1.16.1
     */
    WARPED_DOOR(-1, Door.class),
    /**
     * @since 1.16.1
     */
    WARPED_FENCE(-1, Fence.class),
    /**
     * @since 1.16.1
     */
    WARPED_FENCE_GATE(-1, Gate.class),
    /**
     * @since 1.16.1
     */
    WARPED_FUNGUS(-1),
    /**
     * @since 1.19.3
     */
    WARPED_HANGING_SIGN(-1, HangingSign.class),
    /**
     * @since 1.16.1
     */
    WARPED_HYPHAE(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    WARPED_NYLIUM(-1),
    /**
     * @since 1.16.1
     */
    WARPED_PLANKS(-1),
    /**
     * @since 1.16.1
     */
    WARPED_PRESSURE_PLATE(-1, Powerable.class),
    /**
     * @since 1.16.1
     */
    WARPED_ROOTS(-1),
    /**
     * @since 1.21.10
     */
    WARPED_SHELF(-1, Shelf.class),
    /**
     * @since 1.16.1
     */
    WARPED_SIGN(-1, Sign.class),
    /**
     * @since 1.16.1
     */
    WARPED_SLAB(-1, Slab.class),
    /**
     * @since 1.16.1
     */
    WARPED_STAIRS(-1, Stairs.class),
    /**
     * @since 1.16.1
     */
    WARPED_STEM(-1, Orientable.class),
    /**
     * @since 1.16.1
     */
    WARPED_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.19.3
     */
    WARPED_WALL_HANGING_SIGN(-1, WallHangingSign.class),
    /**
     * @since 1.16.1
     */
    WARPED_WALL_SIGN(-1, WallSign.class),
    /**
     * @since 1.16.1
     */
    WARPED_WART_BLOCK(-1),
    /**
     * @since 1.0.0
     */
    WATER(-1, Levelled.class),
    /**
     * @since 1.17
     */
    WATER_CAULDRON(-1, Levelled.class),
    /**
     * @since 1.20.4
     */
    WAXED_CHISELED_COPPER(-1),
    /**
     * @since 1.21.10
     */
    WAXED_COPPER_BARS(-1, Fence.class),
    /**
     * @since 1.17
     */
    WAXED_COPPER_BLOCK(-1),
    /**
     * @since 1.20.4
     */
    WAXED_COPPER_BULB(-1, CopperBulb.class),
    /**
     * @since 1.21.10
     */
    WAXED_COPPER_CHAIN(-1, Chain.class),
    /**
     * @since 1.21.10
     */
    WAXED_COPPER_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    WAXED_COPPER_DOOR(-1, Door.class),
    /**
     * @since 1.21.10
     */
    WAXED_COPPER_GOLEM_STATUE(-1, CopperGolemStatue.class),
    /**
     * @since 1.20.4
     */
    WAXED_COPPER_GRATE(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    WAXED_COPPER_LANTERN(-1, Lantern.class),
    /**
     * @since 1.20.4
     */
    WAXED_COPPER_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.17
     */
    WAXED_CUT_COPPER(-1),
    /**
     * @since 1.17
     */
    WAXED_CUT_COPPER_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    WAXED_CUT_COPPER_STAIRS(-1, Stairs.class),
    /**
     * @since 1.20.4
     */
    WAXED_EXPOSED_CHISELED_COPPER(-1),
    /**
     * @since 1.17
     */
    WAXED_EXPOSED_COPPER(-1),
    /**
     * @since 1.21.10
     */
    WAXED_EXPOSED_COPPER_BARS(-1, Fence.class),
    /**
     * @since 1.20.4
     */
    WAXED_EXPOSED_COPPER_BULB(-1, CopperBulb.class),
    /**
     * @since 1.21.10
     */
    WAXED_EXPOSED_COPPER_CHAIN(-1, Chain.class),
    /**
     * @since 1.21.10
     */
    WAXED_EXPOSED_COPPER_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    WAXED_EXPOSED_COPPER_DOOR(-1, Door.class),
    /**
     * @since 1.21.10
     */
    WAXED_EXPOSED_COPPER_GOLEM_STATUE(-1, CopperGolemStatue.class),
    /**
     * @since 1.20.4
     */
    WAXED_EXPOSED_COPPER_GRATE(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    WAXED_EXPOSED_COPPER_LANTERN(-1, Lantern.class),
    /**
     * @since 1.20.4
     */
    WAXED_EXPOSED_COPPER_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.17
     */
    WAXED_EXPOSED_CUT_COPPER(-1),
    /**
     * @since 1.17
     */
    WAXED_EXPOSED_CUT_COPPER_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    WAXED_EXPOSED_CUT_COPPER_STAIRS(-1, Stairs.class),
    /**
     * @since 1.21.10
     */
    WAXED_EXPOSED_LIGHTNING_ROD(-1, LightningRod.class),
    /**
     * @since 1.21.10
     */
    WAXED_LIGHTNING_ROD(-1, LightningRod.class),
    /**
     * @since 1.20.4
     */
    WAXED_OXIDIZED_CHISELED_COPPER(-1),
    /**
     * @since 1.17
     */
    WAXED_OXIDIZED_COPPER(-1),
    /**
     * @since 1.21.10
     */
    WAXED_OXIDIZED_COPPER_BARS(-1, Fence.class),
    /**
     * @since 1.20.4
     */
    WAXED_OXIDIZED_COPPER_BULB(-1, CopperBulb.class),
    /**
     * @since 1.21.10
     */
    WAXED_OXIDIZED_COPPER_CHAIN(-1, Chain.class),
    /**
     * @since 1.21.10
     */
    WAXED_OXIDIZED_COPPER_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    WAXED_OXIDIZED_COPPER_DOOR(-1, Door.class),
    /**
     * @since 1.21.10
     */
    WAXED_OXIDIZED_COPPER_GOLEM_STATUE(-1, CopperGolemStatue.class),
    /**
     * @since 1.20.4
     */
    WAXED_OXIDIZED_COPPER_GRATE(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    WAXED_OXIDIZED_COPPER_LANTERN(-1, Lantern.class),
    /**
     * @since 1.20.4
     */
    WAXED_OXIDIZED_COPPER_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.17
     */
    WAXED_OXIDIZED_CUT_COPPER(-1),
    /**
     * @since 1.17
     */
    WAXED_OXIDIZED_CUT_COPPER_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    WAXED_OXIDIZED_CUT_COPPER_STAIRS(-1, Stairs.class),
    /**
     * @since 1.21.10
     */
    WAXED_OXIDIZED_LIGHTNING_ROD(-1, LightningRod.class),
    /**
     * @since 1.20.4
     */
    WAXED_WEATHERED_CHISELED_COPPER(-1),
    /**
     * @since 1.17
     */
    WAXED_WEATHERED_COPPER(-1),
    /**
     * @since 1.21.10
     */
    WAXED_WEATHERED_COPPER_BARS(-1, Fence.class),
    /**
     * @since 1.20.4
     */
    WAXED_WEATHERED_COPPER_BULB(-1, CopperBulb.class),
    /**
     * @since 1.21.10
     */
    WAXED_WEATHERED_COPPER_CHAIN(-1, Chain.class),
    /**
     * @since 1.21.10
     */
    WAXED_WEATHERED_COPPER_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    WAXED_WEATHERED_COPPER_DOOR(-1, Door.class),
    /**
     * @since 1.21.10
     */
    WAXED_WEATHERED_COPPER_GOLEM_STATUE(-1, CopperGolemStatue.class),
    /**
     * @since 1.20.4
     */
    WAXED_WEATHERED_COPPER_GRATE(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    WAXED_WEATHERED_COPPER_LANTERN(-1, Lantern.class),
    /**
     * @since 1.20.4
     */
    WAXED_WEATHERED_COPPER_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.17
     */
    WAXED_WEATHERED_CUT_COPPER(-1),
    /**
     * @since 1.17
     */
    WAXED_WEATHERED_CUT_COPPER_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    WAXED_WEATHERED_CUT_COPPER_STAIRS(-1, Stairs.class),
    /**
     * @since 1.21.10
     */
    WAXED_WEATHERED_LIGHTNING_ROD(-1, LightningRod.class),
    /**
     * @since 1.20.4
     */
    WEATHERED_CHISELED_COPPER(-1),
    /**
     * @since 1.17
     */
    WEATHERED_COPPER(-1),
    /**
     * @since 1.21.10
     */
    WEATHERED_COPPER_BARS(-1, Fence.class),
    /**
     * @since 1.20.4
     */
    WEATHERED_COPPER_BULB(-1, CopperBulb.class),
    /**
     * @since 1.21.10
     */
    WEATHERED_COPPER_CHAIN(-1, Chain.class),
    /**
     * @since 1.21.10
     */
    WEATHERED_COPPER_CHEST(-1, Chest.class),
    /**
     * @since 1.20.4
     */
    WEATHERED_COPPER_DOOR(-1, Door.class),
    /**
     * @since 1.21.10
     */
    WEATHERED_COPPER_GOLEM_STATUE(-1, CopperGolemStatue.class),
    /**
     * @since 1.20.4
     */
    WEATHERED_COPPER_GRATE(-1, Waterlogged.class),
    /**
     * @since 1.21.10
     */
    WEATHERED_COPPER_LANTERN(-1, Lantern.class),
    /**
     * @since 1.20.4
     */
    WEATHERED_COPPER_TRAPDOOR(-1, TrapDoor.class),
    /**
     * @since 1.17
     */
    WEATHERED_CUT_COPPER(-1),
    /**
     * @since 1.17
     */
    WEATHERED_CUT_COPPER_SLAB(-1, Slab.class),
    /**
     * @since 1.17
     */
    WEATHERED_CUT_COPPER_STAIRS(-1, Stairs.class),
    /**
     * @since 1.21.10
     */
    WEATHERED_LIGHTNING_ROD(-1, LightningRod.class),
    /**
     * @since 1.16.1
     */
    WEEPING_VINES(-1, Ageable.class),
    /**
     * @since 1.16.1
     */
    WEEPING_VINES_PLANT(-1),
    /**
     * @since 1.13
     */
    WET_SPONGE(-1),
    /**
     * @since 1.0.0
     */
    WHEAT(-1, Ageable.class),
    /**
     * @since 1.13
     */
    WHITE_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    WHITE_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    WHITE_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    WHITE_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    WHITE_CARPET(-1),
    /**
     * @since 1.13
     */
    WHITE_CONCRETE(-1),
    /**
     * @since 1.13
     */
    WHITE_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    WHITE_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    WHITE_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    WHITE_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    WHITE_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    WHITE_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    WHITE_TULIP(-1),
    /**
     * @since 1.13
     */
    WHITE_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    WHITE_WOOL(-1),
    /**
     * @since 1.21.6
     */
    WILDFLOWERS(-1, FlowerBed.class),
    /**
     * @since 1.14
     */
    WITHER_ROSE(-1),
    /**
     * @since 1.13
     */
    WITHER_SKELETON_SKULL(-1, Skull.class),
    /**
     * @since 1.13
     */
    WITHER_SKELETON_WALL_SKULL(-1, WallSkull.class),
    /**
     * @since 1.13
     */
    YELLOW_BANNER(-1, Rotatable.class),
    /**
     * @since 1.13
     */
    YELLOW_BED(-1, Bed.class),
    /**
     * @since 1.17
     */
    YELLOW_CANDLE(-1, Candle.class),
    /**
     * @since 1.17
     */
    YELLOW_CANDLE_CAKE(-1, Lightable.class),
    /**
     * @since 1.13
     */
    YELLOW_CARPET(-1),
    /**
     * @since 1.13
     */
    YELLOW_CONCRETE(-1),
    /**
     * @since 1.13
     */
    YELLOW_CONCRETE_POWDER(-1),
    /**
     * @since 1.12
     */
    YELLOW_GLAZED_TERRACOTTA(-1, Directional.class),
    /**
     * @since 1.11
     */
    YELLOW_SHULKER_BOX(-1, Directional.class),
    /**
     * @since 1.13
     */
    YELLOW_STAINED_GLASS(-1),
    /**
     * @since 1.13
     */
    YELLOW_STAINED_GLASS_PANE(-1, GlassPane.class),
    /**
     * @since 1.13
     */
    YELLOW_TERRACOTTA(-1),
    /**
     * @since 1.13
     */
    YELLOW_WALL_BANNER(-1, Directional.class),
    /**
     * @since 1.13
     */
    YELLOW_WOOL(-1),
    /**
     * @since 1.13
     */
    ZOMBIE_HEAD(-1, Skull.class),
    /**
     * @since 1.13
     */
    ZOMBIE_WALL_HEAD(-1, WallSkull.class),
    // End generate - Blocks
    // ----- Legacy Separator -----
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_AIR(0),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE(1),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GRASS(2),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIRT(3),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COBBLESTONE(4),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD(5, org.bukkit.material.Wood.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SAPLING(6, org.bukkit.material.Sapling.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BEDROCK(7),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WATER(8, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STATIONARY_WATER(9, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LAVA(10, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STATIONARY_LAVA(11, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SAND(12),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GRAVEL(13),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_ORE(14),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_ORE(15),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COAL_ORE(16),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LOG(17, org.bukkit.material.Tree.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEAVES(18, org.bukkit.material.Leaves.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPONGE(19),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GLASS(20),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LAPIS_ORE(21),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LAPIS_BLOCK(22),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DISPENSER(23, org.bukkit.material.Dispenser.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SANDSTONE(24, org.bukkit.material.Sandstone.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NOTE_BLOCK(25),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BED_BLOCK(26, org.bukkit.material.Bed.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_POWERED_RAIL(27, org.bukkit.material.PoweredRail.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DETECTOR_RAIL(28, org.bukkit.material.DetectorRail.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PISTON_STICKY_BASE(29, org.bukkit.material.PistonBaseMaterial.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WEB(30),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LONG_GRASS(31, org.bukkit.material.LongGrass.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DEAD_BUSH(32),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PISTON_BASE(33, org.bukkit.material.PistonBaseMaterial.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PISTON_EXTENSION(34, org.bukkit.material.PistonExtensionMaterial.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOL(35, org.bukkit.material.Wool.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PISTON_MOVING_PIECE(36),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_YELLOW_FLOWER(37),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RED_ROSE(38),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BROWN_MUSHROOM(39),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RED_MUSHROOM(40),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_BLOCK(41),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_BLOCK(42),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DOUBLE_STEP(43, org.bukkit.material.Step.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STEP(44, org.bukkit.material.Step.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BRICK(45),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_TNT(46),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOOKSHELF(47),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MOSSY_COBBLESTONE(48),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_OBSIDIAN(49),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_TORCH(50, org.bukkit.material.Torch.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FIRE(51),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MOB_SPAWNER(52),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_STAIRS(53, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHEST(54, org.bukkit.material.Chest.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_WIRE(55, org.bukkit.material.RedstoneWire.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_ORE(56),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_BLOCK(57),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WORKBENCH(58),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CROPS(59, org.bukkit.material.Crops.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SOIL(60, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FURNACE(61, org.bukkit.material.Furnace.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BURNING_FURNACE(62, org.bukkit.material.Furnace.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SIGN_POST(63, org.bukkit.material.Sign.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOODEN_DOOR(64, org.bukkit.material.Door.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LADDER(65, org.bukkit.material.Ladder.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RAILS(66, org.bukkit.material.Rails.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COBBLESTONE_STAIRS(67, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WALL_SIGN(68, org.bukkit.material.Sign.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEVER(69, org.bukkit.material.Lever.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE_PLATE(70, org.bukkit.material.PressurePlate.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_DOOR_BLOCK(71, org.bukkit.material.Door.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_PLATE(72, org.bukkit.material.PressurePlate.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_ORE(73),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GLOWING_REDSTONE_ORE(74),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_TORCH_OFF(75, org.bukkit.material.RedstoneTorch.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_TORCH_ON(76, org.bukkit.material.RedstoneTorch.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE_BUTTON(77, org.bukkit.material.Button.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SNOW(78),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ICE(79),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SNOW_BLOCK(80),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CACTUS(81, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CLAY(82),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SUGAR_CANE_BLOCK(83, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_JUKEBOX(84),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FENCE(85),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PUMPKIN(86, org.bukkit.material.Pumpkin.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHERRACK(87),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SOUL_SAND(88),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GLOWSTONE(89),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PORTAL(90),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_JACK_O_LANTERN(91, org.bukkit.material.Pumpkin.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CAKE_BLOCK(92, org.bukkit.material.Cake.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIODE_BLOCK_OFF(93, org.bukkit.material.Diode.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIODE_BLOCK_ON(94, org.bukkit.material.Diode.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STAINED_GLASS(95),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_TRAP_DOOR(96, org.bukkit.material.TrapDoor.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MONSTER_EGGS(97, org.bukkit.material.MonsterEggs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SMOOTH_BRICK(98, org.bukkit.material.SmoothBrick.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_HUGE_MUSHROOM_1(99, org.bukkit.material.Mushroom.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_HUGE_MUSHROOM_2(100, org.bukkit.material.Mushroom.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_FENCE(101),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_THIN_GLASS(102),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MELON_BLOCK(103),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PUMPKIN_STEM(104, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MELON_STEM(105, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_VINE(106, org.bukkit.material.Vine.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FENCE_GATE(107, org.bukkit.material.Gate.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BRICK_STAIRS(108, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SMOOTH_STAIRS(109, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MYCEL(110),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WATER_LILY(111),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHER_BRICK(112),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHER_FENCE(113),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHER_BRICK_STAIRS(114, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHER_WARTS(115, org.bukkit.material.NetherWarts.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ENCHANTMENT_TABLE(116),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BREWING_STAND(117, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CAULDRON(118, org.bukkit.material.Cauldron.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ENDER_PORTAL(119),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ENDER_PORTAL_FRAME(120),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ENDER_STONE(121),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DRAGON_EGG(122),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_LAMP_OFF(123),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_LAMP_ON(124),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_DOUBLE_STEP(125, org.bukkit.material.Wood.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_STEP(126, org.bukkit.material.WoodenStep.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COCOA(127, org.bukkit.material.CocoaPlant.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SANDSTONE_STAIRS(128, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_EMERALD_ORE(129),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ENDER_CHEST(130, org.bukkit.material.EnderChest.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_TRIPWIRE_HOOK(131, org.bukkit.material.TripwireHook.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_TRIPWIRE(132, org.bukkit.material.Tripwire.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_EMERALD_BLOCK(133),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPRUCE_WOOD_STAIRS(134, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BIRCH_WOOD_STAIRS(135, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_JUNGLE_WOOD_STAIRS(136, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COMMAND(137, org.bukkit.material.Command.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BEACON(138),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COBBLE_WALL(139),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FLOWER_POT(140, org.bukkit.material.FlowerPot.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CARROT(141, org.bukkit.material.Crops.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_POTATO(142, org.bukkit.material.Crops.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_BUTTON(143, org.bukkit.material.Button.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SKULL(144, org.bukkit.material.Skull.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ANVIL(145),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_TRAPPED_CHEST(146, org.bukkit.material.Chest.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_PLATE(147),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_PLATE(148),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_COMPARATOR_OFF(149, org.bukkit.material.Comparator.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_COMPARATOR_ON(150, org.bukkit.material.Comparator.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DAYLIGHT_DETECTOR(151),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_BLOCK(152),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_QUARTZ_ORE(153),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_HOPPER(154, org.bukkit.material.Hopper.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_QUARTZ_BLOCK(155),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_QUARTZ_STAIRS(156, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ACTIVATOR_RAIL(157, org.bukkit.material.PoweredRail.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DROPPER(158, org.bukkit.material.Dispenser.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STAINED_CLAY(159),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STAINED_GLASS_PANE(160),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEAVES_2(161, org.bukkit.material.Leaves.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LOG_2(162, org.bukkit.material.Tree.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ACACIA_STAIRS(163, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DARK_OAK_STAIRS(164, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SLIME_BLOCK(165),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BARRIER(166),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_TRAPDOOR(167, org.bukkit.material.TrapDoor.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PRISMARINE(168),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SEA_LANTERN(169),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_HAY_BLOCK(170),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CARPET(171),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_HARD_CLAY(172),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COAL_BLOCK(173),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PACKED_ICE(174),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DOUBLE_PLANT(175),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STANDING_BANNER(176, org.bukkit.material.Banner.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WALL_BANNER(177, org.bukkit.material.Banner.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DAYLIGHT_DETECTOR_INVERTED(178),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RED_SANDSTONE(179),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RED_SANDSTONE_STAIRS(180, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DOUBLE_STONE_SLAB2(181),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE_SLAB2(182),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPRUCE_FENCE_GATE(183, org.bukkit.material.Gate.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BIRCH_FENCE_GATE(184, org.bukkit.material.Gate.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_JUNGLE_FENCE_GATE(185, org.bukkit.material.Gate.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DARK_OAK_FENCE_GATE(186, org.bukkit.material.Gate.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ACACIA_FENCE_GATE(187, org.bukkit.material.Gate.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPRUCE_FENCE(188),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BIRCH_FENCE(189),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_JUNGLE_FENCE(190),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DARK_OAK_FENCE(191),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ACACIA_FENCE(192),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPRUCE_DOOR(193, org.bukkit.material.Door.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BIRCH_DOOR(194, org.bukkit.material.Door.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_JUNGLE_DOOR(195, org.bukkit.material.Door.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ACACIA_DOOR(196, org.bukkit.material.Door.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DARK_OAK_DOOR(197, org.bukkit.material.Door.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_END_ROD(198),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHORUS_PLANT(199),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHORUS_FLOWER(200),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PURPUR_BLOCK(201),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PURPUR_PILLAR(202),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PURPUR_STAIRS(203, org.bukkit.material.Stairs.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PURPUR_DOUBLE_SLAB(204),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PURPUR_SLAB(205),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_END_BRICKS(206),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BEETROOT_BLOCK(207, org.bukkit.material.Crops.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GRASS_PATH(208),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_END_GATEWAY(209),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COMMAND_REPEATING(210, org.bukkit.material.Command.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COMMAND_CHAIN(211, org.bukkit.material.Command.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FROSTED_ICE(212),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MAGMA(213),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHER_WART_BLOCK(214),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RED_NETHER_BRICK(215),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BONE_BLOCK(216),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STRUCTURE_VOID(217),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_OBSERVER(218, org.bukkit.material.Observer.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WHITE_SHULKER_BOX(219),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ORANGE_SHULKER_BOX(220),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MAGENTA_SHULKER_BOX(221),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LIGHT_BLUE_SHULKER_BOX(222),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_YELLOW_SHULKER_BOX(223),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LIME_SHULKER_BOX(224),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PINK_SHULKER_BOX(225),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GRAY_SHULKER_BOX(226),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SILVER_SHULKER_BOX(227),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CYAN_SHULKER_BOX(228),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PURPLE_SHULKER_BOX(229),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BLUE_SHULKER_BOX(230),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BROWN_SHULKER_BOX(231),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GREEN_SHULKER_BOX(232),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RED_SHULKER_BOX(233),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BLACK_SHULKER_BOX(234),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WHITE_GLAZED_TERRACOTTA(235),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ORANGE_GLAZED_TERRACOTTA(236),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MAGENTA_GLAZED_TERRACOTTA(237),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LIGHT_BLUE_GLAZED_TERRACOTTA(238),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_YELLOW_GLAZED_TERRACOTTA(239),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LIME_GLAZED_TERRACOTTA(240),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PINK_GLAZED_TERRACOTTA(241),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GRAY_GLAZED_TERRACOTTA(242),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SILVER_GLAZED_TERRACOTTA(243),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CYAN_GLAZED_TERRACOTTA(244),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PURPLE_GLAZED_TERRACOTTA(245),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BLUE_GLAZED_TERRACOTTA(246),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BROWN_GLAZED_TERRACOTTA(247),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GREEN_GLAZED_TERRACOTTA(248),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RED_GLAZED_TERRACOTTA(249),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BLACK_GLAZED_TERRACOTTA(250),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CONCRETE(251),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CONCRETE_POWDER(252),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STRUCTURE_BLOCK(255),
    // ----- Item Separator -----
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_SPADE(256),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_PICKAXE(257),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_AXE(258),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FLINT_AND_STEEL(259),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_APPLE(260),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOW(261),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ARROW(262),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COAL(263, org.bukkit.material.Coal.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND(264),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_INGOT(265),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_INGOT(266),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_SWORD(267),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_SWORD(268),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_SPADE(269),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_PICKAXE(270),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_AXE(271),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE_SWORD(272),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE_SPADE(273),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE_PICKAXE(274),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE_AXE(275),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_SWORD(276),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_SPADE(277),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_PICKAXE(278),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_AXE(279),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STICK(280),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOWL(281),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MUSHROOM_SOUP(282),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_SWORD(283),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_SPADE(284),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_PICKAXE(285),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_AXE(286),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STRING(287),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FEATHER(288),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SULPHUR(289),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_HOE(290),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STONE_HOE(291),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_HOE(292),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_HOE(293),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_HOE(294),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SEEDS(295),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WHEAT(296),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BREAD(297),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEATHER_HELMET(298),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEATHER_CHESTPLATE(299),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEATHER_LEGGINGS(300),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEATHER_BOOTS(301),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHAINMAIL_HELMET(302),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHAINMAIL_CHESTPLATE(303),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHAINMAIL_LEGGINGS(304),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHAINMAIL_BOOTS(305),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_HELMET(306),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_CHESTPLATE(307),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_LEGGINGS(308),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_BOOTS(309),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_HELMET(310),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_CHESTPLATE(311),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_LEGGINGS(312),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_BOOTS(313),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_HELMET(314),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_CHESTPLATE(315),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_LEGGINGS(316),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_BOOTS(317),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FLINT(318),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PORK(319),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GRILLED_PORK(320),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PAINTING(321),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLDEN_APPLE(322),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SIGN(323),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WOOD_DOOR(324),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BUCKET(325),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WATER_BUCKET(326),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LAVA_BUCKET(327),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MINECART(328),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SADDLE(329),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_DOOR(330),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE(331),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SNOW_BALL(332),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOAT(333),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEATHER(334),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MILK_BUCKET(335),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CLAY_BRICK(336),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CLAY_BALL(337),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SUGAR_CANE(338),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PAPER(339),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOOK(340),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SLIME_BALL(341),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_STORAGE_MINECART(342),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_POWERED_MINECART(343),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_EGG(344),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COMPASS(345),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FISHING_ROD(346),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WATCH(347),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GLOWSTONE_DUST(348),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RAW_FISH(349),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COOKED_FISH(350),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_INK_SACK(351, org.bukkit.material.Dye.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BONE(352),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SUGAR(353),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CAKE(354),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BED(355),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIODE(356),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COOKIE(357),
    /**
     * @see org.bukkit.map.MapView
     */
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MAP(358, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SHEARS(359),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MELON(360),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PUMPKIN_SEEDS(361),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MELON_SEEDS(362),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RAW_BEEF(363),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COOKED_BEEF(364),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RAW_CHICKEN(365),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COOKED_CHICKEN(366),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ROTTEN_FLESH(367),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ENDER_PEARL(368),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BLAZE_ROD(369),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GHAST_TEAR(370),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_NUGGET(371),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHER_STALK(372),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_POTION(373, org.bukkit.material.MaterialData.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GLASS_BOTTLE(374),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPIDER_EYE(375),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FERMENTED_SPIDER_EYE(376),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BLAZE_POWDER(377),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MAGMA_CREAM(378),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BREWING_STAND_ITEM(379),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CAULDRON_ITEM(380),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_EYE_OF_ENDER(381),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPECKLED_MELON(382),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MONSTER_EGG(383, org.bukkit.material.SpawnEgg.class),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_EXP_BOTTLE(384),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FIREBALL(385),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOOK_AND_QUILL(386),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_WRITTEN_BOOK(387),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_EMERALD(388),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ITEM_FRAME(389),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FLOWER_POT_ITEM(390),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CARROT_ITEM(391),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_POTATO_ITEM(392),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BAKED_POTATO(393),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_POISONOUS_POTATO(394),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_EMPTY_MAP(395),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLDEN_CARROT(396),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SKULL_ITEM(397),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CARROT_STICK(398),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHER_STAR(399),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PUMPKIN_PIE(400),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FIREWORK(401),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_FIREWORK_CHARGE(402),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ENCHANTED_BOOK(403),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_REDSTONE_COMPARATOR(404),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NETHER_BRICK_ITEM(405),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_QUARTZ(406),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_EXPLOSIVE_MINECART(407),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_HOPPER_MINECART(408),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PRISMARINE_SHARD(409),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_PRISMARINE_CRYSTALS(410),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RABBIT(411),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COOKED_RABBIT(412),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RABBIT_STEW(413),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RABBIT_FOOT(414),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RABBIT_HIDE(415),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ARMOR_STAND(416),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_BARDING(417),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_BARDING(418),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DIAMOND_BARDING(419),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LEASH(420),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_NAME_TAG(421),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COMMAND_MINECART(422),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_MUTTON(423),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_COOKED_MUTTON(424),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BANNER(425),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_END_CRYSTAL(426),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPRUCE_DOOR_ITEM(427),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BIRCH_DOOR_ITEM(428),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_JUNGLE_DOOR_ITEM(429),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ACACIA_DOOR_ITEM(430),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DARK_OAK_DOOR_ITEM(431),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHORUS_FRUIT(432),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_CHORUS_FRUIT_POPPED(433),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BEETROOT(434),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BEETROOT_SEEDS(435),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BEETROOT_SOUP(436),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_DRAGONS_BREATH(437),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPLASH_POTION(438),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SPECTRAL_ARROW(439),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_TIPPED_ARROW(440),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_LINGERING_POTION(441),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SHIELD(442),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_ELYTRA(443),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOAT_SPRUCE(444),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOAT_BIRCH(445),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOAT_JUNGLE(446),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOAT_ACACIA(447),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_BOAT_DARK_OAK(448),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_TOTEM(449),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_SHULKER_SHELL(450),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_IRON_NUGGET(452),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_KNOWLEDGE_BOOK(453),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GOLD_RECORD(2256),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_GREEN_RECORD(2257),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_3(2258),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_4(2259),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_5(2260),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_6(2261),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_7(2262),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_8(2263),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_9(2264),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_10(2265),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_11(2266),
    @Deprecated(since = "1.13", forRemoval = true)
    LEGACY_RECORD_12(2267),
    ;
    //</editor-fold>

    @Deprecated(since = "1.13", forRemoval = true)
    public static final String LEGACY_PREFIX = "LEGACY_";

    private final int id;
    private final Constructor<? extends MaterialData> ctor;
    private static final Map<String, Material> BY_NAME = Maps.newHashMap();
    /**
     * @since 1.0.0
     */
    public final Class<?> data;
    private final boolean legacy;
    private final NamespacedKey key;
    private final Supplier<ItemType> itemType;
    private final Supplier<BlockType> blockType;

    private Material(final int id) {
        this(id, MaterialData.class);
    }

    private Material(final int id, final Class<?> data) {
        this.id = id;
        this.data = data;
        this.legacy = this.name().startsWith(LEGACY_PREFIX);
        this.key = NamespacedKey.minecraft(this.name().toLowerCase(Locale.ROOT));
        // try to cache the constructor for this material
        try {
            if (MaterialData.class.isAssignableFrom(data)) {
                this.ctor = (Constructor<? extends MaterialData>) data.getConstructor(Material.class, byte.class);
            } else {
                this.ctor = null;
            }
        } catch (NoSuchMethodException ex) {
            throw new AssertionError(ex);
        } catch (SecurityException ex) {
            throw new AssertionError(ex);
        }

        this.itemType = Suppliers.memoize(() -> {
            Material material = this;
            if (isLegacy()) {
                material = Bukkit.getUnsafe().fromLegacy(new MaterialData(this), true);
            }
            return Registry.ITEM.get(material.key);
        });
        this.blockType = Suppliers.memoize(() -> {
            Material material = this;
            if (isLegacy()) {
                material = Bukkit.getUnsafe().fromLegacy(new MaterialData(this), false);
            }
            return Registry.BLOCK.get(material.key);
        });
    }

    /**
     * {@inheritDoc}
     * @since 1.17.1
     */
    // Paper start - add Translatable
    @Override
    public @NotNull String translationKey() {
        if (this.isItem()) {
            return java.util.Objects.requireNonNull(this.asItemType()).translationKey();
        } else {
            return java.util.Objects.requireNonNull(this.asBlockType()).translationKey();
        }
    }
    // Paper end - add Translatable

    // Paper start - item rarity API
    /**
     * Returns the item rarity for the item. The Material <b>MUST</b> be an Item not a block.
     * Use {@link #isItem()} before this.
     *
     * @return the item rarity
     * @deprecated use {@link org.bukkit.inventory.meta.ItemMeta#hasRarity()} and {@link org.bukkit.inventory.meta.ItemMeta#getRarity()}
     */
    @NotNull
    @Deprecated(forRemoval = true, since = "1.20.5")
    public io.papermc.paper.inventory.ItemRarity getItemRarity() {
        return new org.bukkit.inventory.ItemStack(this).getRarity();
    }
    // Paper end - item rarity API

    // Paper start - item default attributes API
    /**
     * Returns an immutable multimap of attributes for the slot.
     * {@link #isItem()} must be true for this material.
     *
     * @param equipmentSlot the slot to get the attributes for
     * @throws IllegalArgumentException if {@link #isItem()} is false
     * @return an immutable multimap of attributes
     * @deprecated use {@link #getDefaultAttributeModifiers(EquipmentSlot)}
     */
    @NotNull
    @Deprecated(forRemoval = true, since = "1.20.5")
    public Multimap<Attribute, AttributeModifier> getItemAttributes(@NotNull EquipmentSlot equipmentSlot) {
        return this.getDefaultAttributeModifiers(equipmentSlot);
    }
    // Paper end - item default attributes API

    // Paper start - isCollidable API
    /**
     * Checks if this material is collidable.
     *
     * @return true if collidable
     * @throws IllegalArgumentException if {@link #isBlock()} is false
     * @since 1.17.1
     */
    public boolean isCollidable() {
        if (this.isBlock()) {
            return this.asBlockType().hasCollision();
        }
        throw new IllegalArgumentException(this + " isn't a block type");
    }
    // Paper end - isCollidable API

    /**
     * Do not use for any reason.
     *
     * @return ID of this material
     * @apiNote Internal Use Only
     */
    @ApiStatus.Internal // Paper
    public int getId() {
        Preconditions.checkArgument(legacy, "Cannot get ID of Modern Material");
        return id;
    }

    /**
     * Checks if this constant is a legacy material.
     *
     * @return legacy status
     * @since 1.13
     */
    // @Deprecated(since = "1.13", forRemoval = true) // Paper - this is useful, don't deprecate
    public boolean isLegacy() {
        return legacy;
    }

    /**
     * @since 1.13
     */
    @NotNull
    @Override
    public NamespacedKey getKey() {
        Preconditions.checkArgument(!legacy, "Cannot get key of Legacy Material");
        return key;
    }

    /**
     * Gets the maximum amount of this material that can be held in a stack.
     * <p>
     * Note that this is the <strong>default</strong> maximum size for this Material.
     * {@link ItemStack ItemStacks} are able to change their maximum stack size per
     * stack with {@link ItemMeta#setMaxStackSize(Integer)}. If an ItemStack instance
     * is available, {@link ItemStack#getMaxStackSize()} may be preferred.
     *
     * @return Maximum stack size for this material
     * @since 1.0.0
     */
    public int getMaxStackSize() {
        if (this == LEGACY_AIR) {
            return 0;
        }
        ItemType type = asItemType();
        return type == null ? 64 : type.getMaxStackSize();
    }

    /**
     * Gets the maximum durability of this material
     *
     * @return Maximum durability for this material
     * @since 1.0.0
     */
    public short getMaxDurability() {
        ItemType type = asItemType();
        return type == null ? 0 : type.getMaxDurability();
    }

    /**
     * Creates a new {@link BlockData} instance for this Material, with all
     * properties initialized to unspecified defaults.
     *
     * @return new data instance
     * @since 1.13
     */
    @NotNull
    public BlockData createBlockData() {
        return Bukkit.createBlockData(this);
    }

    /**
     * Creates a new {@link BlockData} instance for this Material, with
     * all properties initialized to unspecified defaults.
     *
     * @param consumer consumer to run on new instance before returning
     * @return new data instance
     * @since 1.13
     */
    @NotNull
    public BlockData createBlockData(@Nullable Consumer<? super BlockData> consumer) {
        return Bukkit.createBlockData(this, consumer);
    }

    /**
     * Creates a new {@link BlockData} instance for this Material, with all
     * properties initialized to unspecified defaults, except for those provided
     * in data.
     *
     * @param data data string
     * @return new data instance
     * @throws IllegalArgumentException if the specified data is not valid
     * @since 1.13
     */
    @NotNull
    public BlockData createBlockData(@Nullable String data) throws IllegalArgumentException {
        return Bukkit.createBlockData(this, data);
    }

    /**
     * Gets the MaterialData class associated with this Material
     *
     * @return MaterialData associated with this Material
     * @deprecated use {@link #createBlockData()}
     * @since 1.0.0
     */
    @NotNull
    @Deprecated // Paper
    public Class<? extends MaterialData> getData() {
        Preconditions.checkArgument(legacy, "Cannot get data class of Modern Material");
        return ctor.getDeclaringClass();
    }

    /**
     * Constructs a new MaterialData relevant for this Material, with the
     * given initial data
     *
     * @param raw Initial data to construct the MaterialData with
     * @return New MaterialData with the given data
     * @deprecated Magic value
     * @since 1.0.0
     */
    @Deprecated(since = "1.6.2")
    @NotNull
    public MaterialData getNewData(final byte raw) {
        Preconditions.checkArgument(legacy, "Cannot get new data of Modern Material");
        try {
            return ctor.newInstance(this, raw);
        } catch (InstantiationException ex) {
            final Throwable t = ex.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            }
            if (t instanceof Error) {
                throw (Error) t;
            }
            throw new AssertionError(t);
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }

    /**
     * Checks if this Material is a placable block
     *
     * @return true if this material is a block
     * @since 1.0.0
     */
    public boolean isBlock() {
        return asBlockType() != null;
    }

    /**
     * Checks if this Material provides the {@link io.papermc.paper.datacomponent.DataComponentTypes#FOOD} and
     * {@link io.papermc.paper.datacomponent.DataComponentTypes#CONSUMABLE} and, thereby, is edible by a player.
     *
     * @return true if this Material is edible.
     * @since 1.1.0
     */
    public boolean isEdible() {
        ItemType type = asItemType();
        return type != null && type.isEdible();
    }

    /**
     * Attempts to get the Material with the given name.
     * <p>
     * This is a normal lookup, names must be the precise name they are given
     * in the enum.
     *
     * @param name Name of the material to get
     * @return Material if found, or null
     * @since 1.0.0
     */
    @Nullable
    public static Material getMaterial(@NotNull final String name) {
        return getMaterial(name, false);
    }

    /**
     * Attempts to get the Material with the given name.
     * <p>
     * This is a normal lookup, names must be the precise name they are given in
     * the enum (but optionally including the LEGACY_PREFIX if legacyName is
     * true).
     * <p>
     * If legacyName is true, then the lookup will be against legacy materials,
     * but the returned Material will be a modern material (ie this method is
     * useful for updating stored data).
     *
     * @param name Name of the material to get
     * @param legacyName whether this is a legacy name lookup
     * @return Material if found, or null
     * @since 1.13
     */
    @Nullable
    public static Material getMaterial(@NotNull String name, boolean legacyName) {
        if (legacyName) {
            if (!name.startsWith(LEGACY_PREFIX)) {
                name = LEGACY_PREFIX + name;
            }

            Material match = BY_NAME.get(name);
            return Bukkit.getUnsafe().fromLegacy(match);
        }

        return BY_NAME.get(name);
    }

    /**
     * Attempts to match the Material with the given name.
     * <p>
     * This is a match lookup; names will be stripped of the "minecraft:"
     * namespace, converted to uppercase, then stripped of special characters in
     * an attempt to format it like the enum.
     *
     * @param name Name of the material to get
     * @return Material if found, or null
     * @since 1.0.0
     */
    @Nullable
    public static Material matchMaterial(@NotNull final String name) {
        return matchMaterial(name, false);
    }

    /**
     * Attempts to match the Material with the given name.
     * <p>
     * This is a match lookup; names will be stripped of the "minecraft:"
     * namespace, converted to uppercase, then stripped of special characters in
     * an attempt to format it like the enum.
     *
     * @param name Name of the material to get
     * @param legacyName whether this is a legacy name (see
     * {@link #getMaterial(java.lang.String, boolean)}
     * @return Material if found, or null
     * @since 1.13
     */
    @Nullable
    public static Material matchMaterial(@NotNull final String name, boolean legacyName) {
        Preconditions.checkArgument(name != null, "Name cannot be null");

        String filtered = name;
        if (filtered.startsWith(NamespacedKey.MINECRAFT + ":")) {
            filtered = filtered.substring((NamespacedKey.MINECRAFT + ":").length());
        }

        filtered = filtered.toUpperCase(Locale.ROOT);

        filtered = filtered.replaceAll("\\s+", "_").replaceAll("\\W", "");
        return getMaterial(filtered, legacyName);
    }

    static {
        for (Material material : values()) {
            BY_NAME.put(material.name(), material);
        }
    }

    /**
     * @return True if this material represents a playable music disk.
     * @since 1.1.0
     */
    public boolean isRecord() {
        ItemType type = asItemType();
        return type != null && type.isRecord();
    }

    /**
     * Check if the material is a block and solid (can be built upon)
     *
     * @return True if this material is a block and solid
     * @since 1.4.5
     */
    public boolean isSolid() {
        BlockType type = asBlockType();
        return type != null && type.isSolid();
    }

    /**
     * Check if the material is an air block.
     *
     * @return True if this material is an air block.
     * @since 1.14.4
     */
    public boolean isAir() {
        BlockType type = asBlockType();
        return type != null && type.isAir();
    }

    /**
     * @return If the type is either AIR, CAVE_AIR or VOID_AIR
     * @deprecated use {@link #isAir()}
     * @since 1.13.1
     */
    @Deprecated(since = "1.21.5")
    public boolean isEmpty() {
        return this.isAir();
    }

    /**
     * Check if the material is a block and does not block any light
     *
     * @return True if this material is a block and does not block any light
     * @deprecated currently does not have an implementation which is well
     * linked to the underlying server. Contributions welcome.
     */
    @Deprecated(since = "1.13", forRemoval = true)
    public boolean isTransparent() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isTransparent">
            // Start generate - Material#isTransparent
            case ACACIA_BUTTON:
            case ACACIA_SAPLING:
            case ACTIVATOR_RAIL:
            case AIR:
            case ALLIUM:
            case ATTACHED_MELON_STEM:
            case ATTACHED_PUMPKIN_STEM:
            case AZURE_BLUET:
            case BARRIER:
            case BEETROOTS:
            case BIRCH_BUTTON:
            case BIRCH_SAPLING:
            case BLACK_CARPET:
            case BLUE_CARPET:
            case BLUE_ORCHID:
            case BROWN_CARPET:
            case BROWN_MUSHROOM:
            case CARROTS:
            case CAVE_AIR:
            case CHORUS_FLOWER:
            case CHORUS_PLANT:
            case COCOA:
            case COMPARATOR:
            case CREEPER_HEAD:
            case CREEPER_WALL_HEAD:
            case CYAN_CARPET:
            case DANDELION:
            case DARK_OAK_BUTTON:
            case DARK_OAK_SAPLING:
            case DEAD_BUSH:
            case DETECTOR_RAIL:
            case DRAGON_HEAD:
            case DRAGON_WALL_HEAD:
            case END_GATEWAY:
            case END_PORTAL:
            case END_ROD:
            case FERN:
            case FIRE:
            case FLOWER_POT:
            case GRAY_CARPET:
            case GREEN_CARPET:
            case JUNGLE_BUTTON:
            case JUNGLE_SAPLING:
            case LADDER:
            case LARGE_FERN:
            case LEVER:
            case LIGHT_BLUE_CARPET:
            case LIGHT_GRAY_CARPET:
            case LILAC:
            case LILY_PAD:
            case LIME_CARPET:
            case MAGENTA_CARPET:
            case MELON_STEM:
            case NETHER_PORTAL:
            case NETHER_WART:
            case OAK_BUTTON:
            case OAK_SAPLING:
            case ORANGE_CARPET:
            case ORANGE_TULIP:
            case OXEYE_DAISY:
            case PEONY:
            case PINK_CARPET:
            case PINK_TULIP:
            case PLAYER_HEAD:
            case PLAYER_WALL_HEAD:
            case POPPY:
            case POTATOES:
            case POTTED_ACACIA_SAPLING:
            case POTTED_ALLIUM:
            case POTTED_AZALEA_BUSH:
            case POTTED_AZURE_BLUET:
            case POTTED_BIRCH_SAPLING:
            case POTTED_BLUE_ORCHID:
            case POTTED_BROWN_MUSHROOM:
            case POTTED_CACTUS:
            case POTTED_DANDELION:
            case POTTED_DARK_OAK_SAPLING:
            case POTTED_DEAD_BUSH:
            case POTTED_FERN:
            case POTTED_FLOWERING_AZALEA_BUSH:
            case POTTED_JUNGLE_SAPLING:
            case POTTED_OAK_SAPLING:
            case POTTED_ORANGE_TULIP:
            case POTTED_OXEYE_DAISY:
            case POTTED_PINK_TULIP:
            case POTTED_POPPY:
            case POTTED_RED_MUSHROOM:
            case POTTED_RED_TULIP:
            case POTTED_SPRUCE_SAPLING:
            case POTTED_WHITE_TULIP:
            case POWERED_RAIL:
            case PUMPKIN_STEM:
            case PURPLE_CARPET:
            case RAIL:
            case REDSTONE_TORCH:
            case REDSTONE_WALL_TORCH:
            case REDSTONE_WIRE:
            case RED_CARPET:
            case RED_MUSHROOM:
            case RED_TULIP:
            case REPEATER:
            case ROSE_BUSH:
            case SHORT_GRASS:
            case SKELETON_SKULL:
            case SKELETON_WALL_SKULL:
            case SNOW:
            case SPRUCE_BUTTON:
            case SPRUCE_SAPLING:
            case STONE_BUTTON:
            case STRUCTURE_VOID:
            case SUGAR_CANE:
            case SUNFLOWER:
            case TALL_GRASS:
            case TORCH:
            case TRIPWIRE:
            case TRIPWIRE_HOOK:
            case VINE:
            case VOID_AIR:
            case WALL_TORCH:
            case WHEAT:
            case WHITE_CARPET:
            case WHITE_TULIP:
            case WITHER_SKELETON_SKULL:
            case WITHER_SKELETON_WALL_SKULL:
            case YELLOW_CARPET:
            case ZOMBIE_HEAD:
            case ZOMBIE_WALL_HEAD:
            // End generate - Material#isTransparent
            // ----- Legacy Separator -----
            case LEGACY_AIR:
            case LEGACY_SAPLING:
            case LEGACY_POWERED_RAIL:
            case LEGACY_DETECTOR_RAIL:
            case LEGACY_LONG_GRASS:
            case LEGACY_DEAD_BUSH:
            case LEGACY_YELLOW_FLOWER:
            case LEGACY_RED_ROSE:
            case LEGACY_BROWN_MUSHROOM:
            case LEGACY_RED_MUSHROOM:
            case LEGACY_TORCH:
            case LEGACY_FIRE:
            case LEGACY_REDSTONE_WIRE:
            case LEGACY_CROPS:
            case LEGACY_LADDER:
            case LEGACY_RAILS:
            case LEGACY_LEVER:
            case LEGACY_REDSTONE_TORCH_OFF:
            case LEGACY_REDSTONE_TORCH_ON:
            case LEGACY_STONE_BUTTON:
            case LEGACY_SNOW:
            case LEGACY_SUGAR_CANE_BLOCK:
            case LEGACY_PORTAL:
            case LEGACY_DIODE_BLOCK_OFF:
            case LEGACY_DIODE_BLOCK_ON:
            case LEGACY_PUMPKIN_STEM:
            case LEGACY_MELON_STEM:
            case LEGACY_VINE:
            case LEGACY_WATER_LILY:
            case LEGACY_NETHER_WARTS:
            case LEGACY_ENDER_PORTAL:
            case LEGACY_COCOA:
            case LEGACY_TRIPWIRE_HOOK:
            case LEGACY_TRIPWIRE:
            case LEGACY_FLOWER_POT:
            case LEGACY_CARROT:
            case LEGACY_POTATO:
            case LEGACY_WOOD_BUTTON:
            case LEGACY_SKULL:
            case LEGACY_REDSTONE_COMPARATOR_OFF:
            case LEGACY_REDSTONE_COMPARATOR_ON:
            case LEGACY_ACTIVATOR_RAIL:
            case LEGACY_BARRIER:
            case LEGACY_CARPET:
            case LEGACY_DOUBLE_PLANT:
            case LEGACY_END_ROD:
            case LEGACY_CHORUS_PLANT:
            case LEGACY_CHORUS_FLOWER:
            case LEGACY_BEETROOT_BLOCK:
            case LEGACY_END_GATEWAY:
            case LEGACY_STRUCTURE_VOID:
            //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and can catch fire
     *
     * @return True if this material is a block and can catch fire
     * @since 1.4.5
     */
    public boolean isFlammable() {
        BlockType type = asBlockType();
        return type != null && type.isFlammable();
    }

    /**
     * Check if the material is a block and can burn away
     *
     * @return True if this material is a block and can burn away
     * @since 1.4.5
     */
    public boolean isBurnable() {
        BlockType type = asBlockType();
        return type != null && type.isBurnable();
    }

    /**
     * Checks if this Material can be used as fuel in a Furnace
     *
     * @return true if this Material can be used as fuel.
     * @since 1.11.2
     */
    public boolean isFuel() {
        ItemType type = asItemType();
        return type != null && type.isFuel();
    }

    /**
     * Check if the material is a block and occludes light in the lighting engine.
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
     * @return True if this material is a block and occludes light
     * @since 1.4.5
     */
    public boolean isOccluding() {
        BlockType type = asBlockType();
        return type != null && type.isOccluding();
    }

    /**
     * @return True if this material is affected by gravity.
     * @since 1.5.1
     */
    public boolean hasGravity() {
        BlockType type = asBlockType();
        return type != null && type.hasGravity();
    }

    /**
     * Checks if this Material is an obtainable item.
     *
     * @return true if this material is an item
     * @since 1.12.2
     */
    public boolean isItem() {
        return asItemType() != null;
    }

    /**
     * Checks if this Material can be interacted with.
     *
     * Interactable materials include those with functionality when they are
     * interacted with by a player such as chests, furnaces, etc.
     *
     * Some blocks such as piston heads and stairs are considered interactable
     * though may not perform any additional functionality.
     *
     * Note that the interactability of some materials may be dependant on their
     * state as well. This method will return true if there is at least one
     * state in which additional interact handling is performed for the
     * material.
     *
     * @return true if this material can be interacted with.
     * @deprecated This method is not comprehensive and does not accurately reflect what block types are
     * interactable. Many "interactions" are defined on the item not block, and many are conditional on some other world state
     * checks being true.
     * @since 1.13
     */
    @Deprecated // Paper
    public boolean isInteractable() {
        BlockType type = asBlockType();
        return type != null && type.isInteractable();
    }

    /**
     * Obtains the block's hardness level (also known as "strength").
     * <br>
     * This number is used to calculate the time required to break each block.
     * <br>
     * Only available when {@link #isBlock()} is true.
     *
     * @return the hardness of that material.
     * @since 1.13
     */
    public float getHardness() {
        BlockType type = asBlockType();
        Preconditions.checkArgument(type != null, "The Material is not a block!");
        return type.getHardness();

    }

    /**
     * Obtains the blast resistance value (also known as block "durability").
     * <br>
     * This value is used in explosions to calculate whether a block should be
     * broken or not.
     * <br>
     * Only available when {@link #isBlock()} is true.
     *
     * @return the blast resistance of that material.
     * @since 1.13
     */
    public float getBlastResistance() {
        BlockType type = asBlockType();
        Preconditions.checkArgument(type != null, "The Material is not a block!");
        return type.getBlastResistance();
    }

    /**
     * Returns a value that represents how 'slippery' the block is.
     *
     * Blocks with higher slipperiness, like {@link Material#ICE} can be slid on
     * further by the player and other entities.
     *
     * Most blocks have a default slipperiness of {@code 0.6f}.
     *
     * Only available when {@link #isBlock()} is true.
     *
     * @return the slipperiness of this block
     * @since 1.17
     */
    public float getSlipperiness() {
        BlockType type = asBlockType();
        Preconditions.checkArgument(type != null, "The Material is not a block!");
        return type.getSlipperiness();
    }

    /**
     * Determines the remaining item in a crafting grid after crafting with this
     * ingredient.
     * <br>
     * Only available when {@link #isItem()} is true.
     *
     * @return the item left behind when crafting, or null if nothing is.
     * @since 1.15.2
     */
    @Nullable
    public Material getCraftingRemainingItem() {
        ItemType type = asItemType();
        Preconditions.checkArgument(type != null, "The Material is not an item!");
        return type.getCraftingRemainingItem() == null ? null : type.getCraftingRemainingItem().asMaterial();
    }

    /**
     * Get the best suitable slot for this Material.
     *
     * For most items this will be {@link EquipmentSlot#HAND}.
     *
     * @return the best EquipmentSlot for this Material
     * @since 1.16.5
     */
    @NotNull
    public EquipmentSlot getEquipmentSlot() {
        ItemType type = asItemType();
        Preconditions.checkArgument(type != null, "The Material is not an item!");
        Equippable equippable = type.getDefaultData(DataComponentTypes.EQUIPPABLE);
        return equippable == null ? EquipmentSlot.HAND : equippable.slot();
    }

    // Paper start - improve default item attribute API
    /**
     * Return an immutable copy of all default {@link Attribute}s and their {@link AttributeModifier}s.
     * <p>
     * Default attributes are those that are always preset on some items, unless
     * they are specifically overridden on that {@link ItemStack}. Examples include
     * the attack damage on weapons or the armor value on armor.
     * <p>
     * Only available when {@link #isItem()} is true.
     *
     * @return the immutable {@link Multimap} with the respective default
     * Attributes and modifiers, or an empty map if no attributes are set.
     * @since 1.20.6
     */
    public @NotNull @org.jetbrains.annotations.Unmodifiable Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers() {
        final ItemType type = this.asItemType();
        Preconditions.checkArgument(type != null, "The Material is not an item!");
        return type.getDefaultAttributeModifiers();
    }
    // Paper end - improve default item attribute API

    /**
     * Return an immutable copy of all default {@link Attribute}s and their
     * {@link AttributeModifier}s for a given {@link EquipmentSlot}.
     * <p>
     * Default attributes are those that are always preset on some items, unless
     * they are specifically overridden on that {@link ItemStack}. Examples include
     * the attack damage on weapons or the armor value on armor.
     * <p>
     * Only available when {@link #isItem()} is true.
     *
     * @param slot the {@link EquipmentSlot} to check
     * @return the immutable {@link Multimap} with the respective default
     * Attributes and modifiers, or an empty map if no attributes are set.
     * @since 1.18.1
     */
    @NotNull
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(@NotNull EquipmentSlot slot) {
        ItemType type = asItemType();
        Preconditions.checkArgument(type != null, "The Material is not an item!");
        return type.getDefaultAttributeModifiers(slot);
    }

    /**
     * Get the {@link CreativeCategory} to which this material belongs.
     *
     * @return the creative category. null if it does not belong to a category
     * @deprecated items can belong to multiple creative categories and this is no
     * longer implemented, will always be {@link CreativeCategory#BUILDING_BLOCKS} if not null
     */
    @Deprecated(since = "1.20.6", forRemoval = true)
    public @Nullable CreativeCategory getCreativeCategory() {
        ItemType type = asItemType();
        return type == null ? null : type.getCreativeCategory();
    }

    /**
     * Get the translation key of the item or block associated with this
     * material.
     *
     * If this material has both an item and a block form, the item form is
     * used.
     *
     * @return the translation key of the item or block associated with this
     * material
     * @see #getBlockTranslationKey()
     * @see #getItemTranslationKey()
     * @deprecated use {@link #translationKey()}
     */
    @Override
    @NotNull
    @Deprecated(forRemoval = true) // Paper
    public String getTranslationKey() {
        if (this.isItem()) {
            return asItemType().getTranslationKey();
        } else {
            return asBlockType().getTranslationKey();
        }
    }

    /**
     * Get the translation key of the block associated with this material, or
     * null if this material does not have an associated block.
     *
     * @return the translation key of the block associated with this material,
     * or null if this material does not have an associated block
     * @since 1.19.3
     */
    @Nullable
    public String getBlockTranslationKey() {
        BlockType type = asBlockType();
        return type == null ? null : type.getTranslationKey();
    }

    /**
     * Get the translation key of the item associated with this material, or
     * null if this material does not have an associated item.
     *
     * @return the translation key of the item associated with this material, or
     * null if this material does not have an associated item.
     * @since 1.19.3
     */
    @Nullable
    public String getItemTranslationKey() {
        ItemType type = asItemType();
        return type == null ? null : type.getTranslationKey();
    }

    /**
     * Checks whether this material is compostable (can be inserted into a
     * composter).
     *
     * @return true if this material is compostable
     * @see #getCompostChance()
     * @since 1.20.6
     */
    public boolean isCompostable() {
        return isItem() && asItemType().isCompostable();
    }

    /**
     * Get the chance that this material will successfully compost. The returned
     * value is between 0 and 1 (inclusive).
     *
     * Materials with a compost chance of 1 will always raise the composter's
     * level, while materials with a compost chance of 0 will never raise it.
     *
     * Plugins should check that {@link #isCompostable} returns true before
     * calling this method.
     *
     * @return the chance that this material will successfully compost
     * @throws IllegalArgumentException if the material is not compostable
     * @see #isCompostable()
     * @since 1.20.6
     */
    public float getCompostChance() {
        ItemType type = asItemType();
        Preconditions.checkArgument(type != null, "The Material is not an item!");
        return type.getCompostChance();
    }

    /**
     * Tries to convert this Material to an item type
     *
     * @return the converted item type or null
     * @since 1.20.6
     */
    @Nullable
    @org.jetbrains.annotations.Contract(pure = true) // Paper
    public ItemType asItemType() {
        return itemType.get();
    }

    /**
     * Tries to convert this Material to a block type
     *
     * @return the converted block type or null
     * @since 1.20.6
     */
    @Nullable
    @org.jetbrains.annotations.Contract(pure = true) // Paper
    public BlockType asBlockType() {
        return blockType.get();
    }

    // Paper start - data component API
    /**
     * Gets the default value of the data component type for this item type.
     *
     * @param type the data component type
     * @param <T> the value type
     * @return the default value or {@code null} if there is none
     * @see #hasDefaultData(io.papermc.paper.datacomponent.DataComponentType) for DataComponentType.NonValued
     * @throws IllegalArgumentException if {@link #isItem()} is {@code false}
     * @since 1.21.3
     */
    public @Nullable <T> T getDefaultData(final io.papermc.paper.datacomponent.DataComponentType.@NotNull Valued<T> type) {
        Preconditions.checkArgument(this.asItemType() != null);
        return this.asItemType().getDefaultData(type);
    }

    /**
     * Checks if the data component type has a default value for this item type.
     *
     * @param type the data component type
     * @return {@code true} if there is a default value
     * @throws IllegalArgumentException if {@link #isItem()} is {@code false}
     * @since 1.21.3
     */
    public boolean hasDefaultData(final io.papermc.paper.datacomponent.@NotNull DataComponentType type) {
        Preconditions.checkArgument(this.asItemType() != null);
        return this.asItemType().hasDefaultData(type);
    }

    /**
     * Gets the default data component types for this item type.
     *
     * @return an immutable set of data component types
     * @throws IllegalArgumentException if {@link #isItem()} is {@code false}
     * @since 1.21.3
     */
    public java.util.@org.jetbrains.annotations.Unmodifiable @NotNull Set<io.papermc.paper.datacomponent.DataComponentType> getDefaultDataTypes() {
        Preconditions.checkArgument(this.asItemType() != null);
        return this.asItemType().getDefaultDataTypes();
    }
    // Paper end - data component API
}
