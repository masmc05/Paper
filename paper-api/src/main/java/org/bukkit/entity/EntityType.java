package org.bukkit.entity;

import com.google.common.base.Preconditions;
import io.papermc.paper.InternalAPIBridge;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bukkit.Keyed;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.Translatable;
import org.bukkit.World;
import org.bukkit.entity.boat.AcaciaBoat;
import org.bukkit.entity.boat.AcaciaChestBoat;
import org.bukkit.entity.boat.BambooChestRaft;
import org.bukkit.entity.boat.BambooRaft;
import org.bukkit.entity.boat.BirchBoat;
import org.bukkit.entity.boat.BirchChestBoat;
import org.bukkit.entity.boat.CherryBoat;
import org.bukkit.entity.boat.CherryChestBoat;
import org.bukkit.entity.boat.DarkOakBoat;
import org.bukkit.entity.boat.DarkOakChestBoat;
import org.bukkit.entity.boat.JungleBoat;
import org.bukkit.entity.boat.JungleChestBoat;
import org.bukkit.entity.boat.MangroveBoat;
import org.bukkit.entity.boat.MangroveChestBoat;
import org.bukkit.entity.boat.OakBoat;
import org.bukkit.entity.boat.OakChestBoat;
import org.bukkit.entity.boat.PaleOakBoat;
import org.bukkit.entity.boat.PaleOakChestBoat;
import org.bukkit.entity.boat.SpruceBoat;
import org.bukkit.entity.boat.SpruceChestBoat;
import org.bukkit.entity.minecart.CommandMinecart;
import org.bukkit.entity.minecart.ExplosiveMinecart;
import org.bukkit.entity.minecart.HopperMinecart;
import org.bukkit.entity.minecart.PoweredMinecart;
import org.bukkit.entity.minecart.RideableMinecart;
import org.bukkit.entity.minecart.SpawnerMinecart;
import org.bukkit.entity.minecart.StorageMinecart;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1.1.0
 */
public enum EntityType implements Keyed, Translatable, net.kyori.adventure.translation.Translatable, io.papermc.paper.world.flag.FeatureDependant { // Paper - translatable

    /**
     * @since 1.21.3
     */
    // Start generate - EntityType
    ACACIA_BOAT("acacia_boat", AcaciaBoat.class, -1),
    /**
     * @since 1.21.3
     */
    ACACIA_CHEST_BOAT("acacia_chest_boat", AcaciaChestBoat.class, -1),
    /**
     * @since 1.19
     */
    ALLAY("allay", Allay.class, -1),
    /**
     * @since 1.9.4
     */
    AREA_EFFECT_CLOUD("area_effect_cloud", AreaEffectCloud.class, 3),
    /**
     * @since 1.20.6
     */
    ARMADILLO("armadillo", Armadillo.class, -1),
    /**
     * @since 1.8
     */
    ARMOR_STAND("armor_stand", ArmorStand.class, 30),
    /**
     * @since 1.1.0
     */
    ARROW("arrow", Arrow.class, 10),
    /**
     * @since 1.17
     */
    AXOLOTL("axolotl", Axolotl.class, -1),
    /**
     * @since 1.21.3
     */
    BAMBOO_CHEST_RAFT("bamboo_chest_raft", BambooChestRaft.class, -1),
    /**
     * @since 1.21.3
     */
    BAMBOO_RAFT("bamboo_raft", BambooRaft.class, -1),
    /**
     * @since 1.4.5
     */
    BAT("bat", Bat.class, 65),
    /**
     * @since 1.15
     */
    BEE("bee", Bee.class, -1),
    /**
     * @since 1.21.3
     */
    BIRCH_BOAT("birch_boat", BirchBoat.class, -1),
    /**
     * @since 1.21.3
     */
    BIRCH_CHEST_BOAT("birch_chest_boat", BirchChestBoat.class, -1),
    /**
     * @since 1.1.0
     */
    BLAZE("blaze", Blaze.class, 61),
    /**
     * @since 1.19.4
     */
    BLOCK_DISPLAY("block_display", BlockDisplay.class, -1),
    /**
     * @since 1.20.6
     */
    BOGGED("bogged", Bogged.class, -1),
    /**
     * @since 1.20.4
     */
    BREEZE("breeze", Breeze.class, -1),
    /**
     * @since 1.20.6
     */
    BREEZE_WIND_CHARGE("breeze_wind_charge", BreezeWindCharge.class, -1),
    /**
     * @since 1.19.3
     */
    CAMEL("camel", Camel.class, -1),
    /**
     * @since 1.21.11
     */
    CAMEL_HUSK("camel_husk", CamelHusk.class, -1),
    /**
     * @since 1.14
     */
    CAT("cat", Cat.class, -1),
    /**
     * @since 1.1.0
     */
    CAVE_SPIDER("cave_spider", CaveSpider.class, 59),
    /**
     * @since 1.21.3
     */
    CHERRY_BOAT("cherry_boat", CherryBoat.class, -1),
    /**
     * @since 1.21.3
     */
    CHERRY_CHEST_BOAT("cherry_chest_boat", CherryChestBoat.class, -1),
    /**
     * @since 1.20.6
     */
    CHEST_MINECART("chest_minecart", StorageMinecart.class, 43),
    /**
     * @since 1.1.0
     */
    CHICKEN("chicken", Chicken.class, 93),
    /**
     * @since 1.13
     */
    COD("cod", Cod.class, -1),
    /**
     * @since 1.20.6
     */
    COMMAND_BLOCK_MINECART("command_block_minecart", CommandMinecart.class, 40),
    /**
     * @since 1.21.10
     */
    COPPER_GOLEM("copper_golem", CopperGolem.class, -1),
    /**
     * @since 1.1.0
     */
    COW("cow", Cow.class, 92),
    /**
     * @since 1.21.3
     */
    CREAKING("creaking", Creaking.class, -1),
    /**
     * @since 1.1.0
     */
    CREEPER("creeper", Creeper.class, 50),
    /**
     * @since 1.21.3
     */
    DARK_OAK_BOAT("dark_oak_boat", DarkOakBoat.class, -1),
    /**
     * @since 1.21.3
     */
    DARK_OAK_CHEST_BOAT("dark_oak_chest_boat", DarkOakChestBoat.class, -1),
    /**
     * @since 1.13
     */
    DOLPHIN("dolphin", Dolphin.class, -1),
    /**
     * @since 1.11
     */
    DONKEY("donkey", Donkey.class, 31),
    /**
     * @since 1.9.4
     */
    DRAGON_FIREBALL("dragon_fireball", DragonFireball.class, 26),
    /**
     * @since 1.13
     */
    DROWNED("drowned", Drowned.class, -1),
    /**
     * @since 1.1.0
     */
    EGG("egg", Egg.class, 7),
    /**
     * @since 1.11
     */
    ELDER_GUARDIAN("elder_guardian", ElderGuardian.class, 4),
    /**
     * @since 1.20.6
     */
    END_CRYSTAL("end_crystal", EnderCrystal.class, 200),
    /**
     * @since 1.1.0
     */
    ENDER_DRAGON("ender_dragon", EnderDragon.class, 63),
    /**
     * @since 1.1.0
     */
    ENDER_PEARL("ender_pearl", EnderPearl.class, 14),
    /**
     * @since 1.1.0
     */
    ENDERMAN("enderman", Enderman.class, 58),
    /**
     * @since 1.8
     */
    ENDERMITE("endermite", Endermite.class, 67),
    /**
     * @since 1.11
     */
    EVOKER("evoker", Evoker.class, 34),
    /**
     * @since 1.11
     */
    EVOKER_FANGS("evoker_fangs", EvokerFangs.class, 33),
    /**
     * @since 1.20.6
     */
    EXPERIENCE_BOTTLE("experience_bottle", ThrownExpBottle.class, 17),
    /**
     * @since 1.1.0
     */
    EXPERIENCE_ORB("experience_orb", ExperienceOrb.class, 2),
    /**
     * @since 1.20.6
     */
    EYE_OF_ENDER("eye_of_ender", EnderSignal.class, 15),
    /**
     * @since 1.1.0
     */
    FALLING_BLOCK("falling_block", FallingBlock.class, 21),
    /**
     * @since 1.1.0
     */
    FIREBALL("fireball", LargeFireball.class, 12),
    /**
     * @since 1.20.6
     */
    FIREWORK_ROCKET("firework_rocket", Firework.class, 22),
    /**
     * @since 1.20.6
     */
    FISHING_BOBBER("fishing_bobber", FishHook.class, -1, false),
    /**
     * @since 1.14
     */
    FOX("fox", Fox.class, -1),
    /**
     * @since 1.19
     */
    FROG("frog", Frog.class, -1),
    /**
     * @since 1.20.6
     */
    FURNACE_MINECART("furnace_minecart", PoweredMinecart.class, 44),
    /**
     * @since 1.1.0
     */
    GHAST("ghast", Ghast.class, 56),
    /**
     * @since 1.1.0
     */
    GIANT("giant", Giant.class, 53),
    /**
     * @since 1.17
     */
    GLOW_ITEM_FRAME("glow_item_frame", GlowItemFrame.class, -1),
    /**
     * @since 1.17
     */
    GLOW_SQUID("glow_squid", GlowSquid.class, -1),
    /**
     * @since 1.17
     */
    GOAT("goat", Goat.class, -1),
    /**
     * @since 1.8
     */
    GUARDIAN("guardian", Guardian.class, 68),
    /**
     * @since 1.21.6
     */
    HAPPY_GHAST("happy_ghast", HappyGhast.class, -1),
    /**
     * @since 1.16.1
     */
    HOGLIN("hoglin", Hoglin.class, -1),
    /**
     * @since 1.20.6
     */
    HOPPER_MINECART("hopper_minecart", HopperMinecart.class, 46),
    /**
     * @since 1.6.1
     */
    HORSE("horse", Horse.class, 100),
    /**
     * @since 1.11
     */
    HUSK("husk", Husk.class, 23),
    /**
     * @since 1.12
     */
    ILLUSIONER("illusioner", Illusioner.class, 37),
    /**
     * @since 1.19.4
     */
    INTERACTION("interaction", Interaction.class, -1),
    /**
     * @since 1.2.2
     */
    IRON_GOLEM("iron_golem", IronGolem.class, 99),
    /**
     * @since 1.20.6
     */
    ITEM("item", Item.class, 1),
    /**
     * @since 1.19.4
     */
    ITEM_DISPLAY("item_display", ItemDisplay.class, -1),
    /**
     * @since 1.4.5
     */
    ITEM_FRAME("item_frame", ItemFrame.class, 18),
    /**
     * @since 1.21.3
     */
    JUNGLE_BOAT("jungle_boat", JungleBoat.class, -1),
    /**
     * @since 1.21.3
     */
    JUNGLE_CHEST_BOAT("jungle_chest_boat", JungleChestBoat.class, -1),
    /**
     * @since 1.20.6
     */
    LEASH_KNOT("leash_knot", LeashHitch.class, 8),
    /**
     * @since 1.20.6
     */
    LIGHTNING_BOLT("lightning_bolt", LightningStrike.class, -1),
    /**
     * @since 1.9.4
     */
    LINGERING_POTION("lingering_potion", LingeringPotion.class, -1),
    /**
     * @since 1.11
     */
    LLAMA("llama", Llama.class, 103),
    /**
     * @since 1.11
     */
    LLAMA_SPIT("llama_spit", LlamaSpit.class, 104),
    /**
     * @since 1.1.0
     */
    MAGMA_CUBE("magma_cube", MagmaCube.class, 62),
    /**
     * @since 1.21.3
     */
    MANGROVE_BOAT("mangrove_boat", MangroveBoat.class, -1),
    /**
     * @since 1.21.3
     */
    MANGROVE_CHEST_BOAT("mangrove_chest_boat", MangroveChestBoat.class, -1),
    /**
     * @since 1.21.10
     */
    MANNEQUIN("mannequin", Mannequin.class, -1),
    /**
     * @since 1.17
     */
    MARKER("marker", Marker.class, -1),
    /**
     * @since 1.1.0
     */
    MINECART("minecart", RideableMinecart.class, 42),
    /**
     * @since 1.20.6
     */
    MOOSHROOM("mooshroom", MushroomCow.class, 96),
    /**
     * @since 1.11
     */
    MULE("mule", Mule.class, 32),
    /**
     * @since 1.21.11
     */
    NAUTILUS("nautilus", Nautilus.class, -1),
    /**
     * @since 1.21.3
     */
    OAK_BOAT("oak_boat", OakBoat.class, -1),
    /**
     * @since 1.21.3
     */
    OAK_CHEST_BOAT("oak_chest_boat", OakChestBoat.class, -1),
    /**
     * @since 1.2.2
     */
    OCELOT("ocelot", Ocelot.class, 98),
    /**
     * @since 1.20.6
     */
    OMINOUS_ITEM_SPAWNER("ominous_item_spawner", OminousItemSpawner.class, -1),
    /**
     * @since 1.1.0
     */
    PAINTING("painting", Painting.class, 9),
    /**
     * @since 1.21.3
     */
    PALE_OAK_BOAT("pale_oak_boat", PaleOakBoat.class, -1),
    /**
     * @since 1.21.3
     */
    PALE_OAK_CHEST_BOAT("pale_oak_chest_boat", PaleOakChestBoat.class, -1),
    /**
     * @since 1.14
     */
    PANDA("panda", Panda.class, -1),
    /**
     * @since 1.21.11
     */
    PARCHED("parched", Parched.class, -1),
    /**
     * @since 1.12
     */
    PARROT("parrot", Parrot.class, 105),
    /**
     * @since 1.13
     */
    PHANTOM("phantom", Phantom.class, -1),
    /**
     * @since 1.1.0
     */
    PIG("pig", Pig.class, 90),
    /**
     * @since 1.16.1
     */
    PIGLIN("piglin", Piglin.class, -1),
    /**
     * @since 1.16.2
     */
    PIGLIN_BRUTE("piglin_brute", PiglinBrute.class, -1),
    /**
     * @since 1.14
     */
    PILLAGER("pillager", Pillager.class, -1),
    /**
     * @since 1.1.0
     */
    PLAYER("player", Player.class, -1, false),
    /**
     * @since 1.10.2
     */
    POLAR_BEAR("polar_bear", PolarBear.class, 102),
    /**
     * @since 1.13
     */
    PUFFERFISH("pufferfish", PufferFish.class, -1),
    /**
     * @since 1.8
     */
    RABBIT("rabbit", Rabbit.class, 101),
    /**
     * @since 1.14
     */
    RAVAGER("ravager", Ravager.class, -1),
    /**
     * @since 1.13
     */
    SALMON("salmon", Salmon.class, -1),
    /**
     * @since 1.1.0
     */
    SHEEP("sheep", Sheep.class, 91),
    /**
     * @since 1.9.4
     */
    SHULKER("shulker", Shulker.class, 69),
    /**
     * @since 1.9.4
     */
    SHULKER_BULLET("shulker_bullet", ShulkerBullet.class, 25),
    /**
     * @since 1.1.0
     */
    SILVERFISH("silverfish", Silverfish.class, 60),
    /**
     * @since 1.1.0
     */
    SKELETON("skeleton", Skeleton.class, 51),
    /**
     * @since 1.11
     */
    SKELETON_HORSE("skeleton_horse", SkeletonHorse.class, 28),
    /**
     * @since 1.1.0
     */
    SLIME("slime", Slime.class, 55),
    /**
     * @since 1.1.0
     */
    SMALL_FIREBALL("small_fireball", SmallFireball.class, 13),
    /**
     * @since 1.19.4
     */
    SNIFFER("sniffer", Sniffer.class, -1),
    /**
     * @since 1.20.6
     */
    SNOW_GOLEM("snow_golem", Snowman.class, 97),
    /**
     * @since 1.1.0
     */
    SNOWBALL("snowball", Snowball.class, 11),
    /**
     * @since 1.20.6
     */
    SPAWNER_MINECART("spawner_minecart", SpawnerMinecart.class, 47),
    /**
     * @since 1.9.4
     */
    SPECTRAL_ARROW("spectral_arrow", SpectralArrow.class, 24),
    /**
     * @since 1.1.0
     */
    SPIDER("spider", Spider.class, 52),
    /**
     * @since 1.1.0
     */
    SPLASH_POTION("splash_potion", SplashPotion.class, 16),
    /**
     * @since 1.21.3
     */
    SPRUCE_BOAT("spruce_boat", SpruceBoat.class, -1),
    /**
     * @since 1.21.3
     */
    SPRUCE_CHEST_BOAT("spruce_chest_boat", SpruceChestBoat.class, -1),
    /**
     * @since 1.1.0
     */
    SQUID("squid", Squid.class, 94),
    /**
     * @since 1.11
     */
    STRAY("stray", Stray.class, 6),
    /**
     * @since 1.16.1
     */
    STRIDER("strider", Strider.class, -1),
    /**
     * @since 26.2
     */
    SULFUR_CUBE("sulfur_cube", SulfurCube.class, -1),
    /**
     * @since 1.19
     */
    TADPOLE("tadpole", Tadpole.class, -1),
    /**
     * @since 1.19.4
     */
    TEXT_DISPLAY("text_display", TextDisplay.class, -1),
    /**
     * @since 1.20.6
     */
    TNT("tnt", TNTPrimed.class, 20),
    /**
     * @since 1.20.6
     */
    TNT_MINECART("tnt_minecart", ExplosiveMinecart.class, 45),
    /**
     * @since 1.14
     */
    TRADER_LLAMA("trader_llama", TraderLlama.class, -1),
    /**
     * @since 1.13
     */
    TRIDENT("trident", Trident.class, -1),
    /**
     * @since 1.13
     */
    TROPICAL_FISH("tropical_fish", TropicalFish.class, -1),
    /**
     * @since 1.13
     */
    TURTLE("turtle", Turtle.class, -1),
    /**
     * @since 1.11
     */
    VEX("vex", Vex.class, 35),
    /**
     * @since 1.1.0
     */
    VILLAGER("villager", Villager.class, 120),
    /**
     * @since 1.11
     */
    VINDICATOR("vindicator", Vindicator.class, 36),
    /**
     * @since 1.14
     */
    WANDERING_TRADER("wandering_trader", WanderingTrader.class, -1),
    /**
     * @since 1.19
     */
    WARDEN("warden", Warden.class, -1),
    /**
     * @since 1.20.4
     */
    WIND_CHARGE("wind_charge", WindCharge.class, -1),
    /**
     * @since 1.4.5
     */
    WITCH("witch", Witch.class, 66),
    /**
     * @since 1.4.5
     */
    WITHER("wither", Wither.class, 64),
    /**
     * @since 1.11
     */
    WITHER_SKELETON("wither_skeleton", WitherSkeleton.class, 5),
    /**
     * @since 1.4.5
     */
    WITHER_SKULL("wither_skull", WitherSkull.class, 19),
    /**
     * @since 1.1.0
     */
    WOLF("wolf", Wolf.class, 95),
    /**
     * @since 1.16.1
     */
    ZOGLIN("zoglin", Zoglin.class, -1),
    /**
     * @since 1.1.0
     */
    ZOMBIE("zombie", Zombie.class, 54),
    /**
     * @since 1.11
     */
    ZOMBIE_HORSE("zombie_horse", ZombieHorse.class, 29),
    /**
     * @since 1.21.11
     */
    ZOMBIE_NAUTILUS("zombie_nautilus", ZombieNautilus.class, -1),
    /**
     * @since 1.11
     */
    ZOMBIE_VILLAGER("zombie_villager", ZombieVillager.class, 27),
    /**
     * @since 1.16.1
     */
    ZOMBIFIED_PIGLIN("zombified_piglin", PigZombie.class, 57),
    // End generate - EntityType
    /**
     * An unknown entity without an Entity Class
     *
     * @since 1.1.0
     */
    UNKNOWN(null, null, -1, false);

    private final String name;
    private final Class<? extends Entity> clazz;
    private final short typeId;
    private final boolean independent, living;
    private final NamespacedKey key;

    private static final Map<String, EntityType> NAME_MAP = new HashMap<String, EntityType>();
    private static final Map<Short, EntityType> ID_MAP = new HashMap<Short, EntityType>();

    static {
        for (EntityType type : values()) {
            if (type.name != null) {
                NAME_MAP.put(type.name.toLowerCase(Locale.ROOT), type);
            }
            if (type.typeId > 0) {
                ID_MAP.put(type.typeId, type);
            }
        }
    }

    private EntityType(/*@Nullable*/ String name, /*@Nullable*/ Class<? extends Entity> clazz, int typeId) {
        this(name, clazz, typeId, true);
    }

    private EntityType(/*@Nullable*/ String name, /*@Nullable*/ Class<? extends Entity> clazz, int typeId, boolean independent) {
        this.name = name;
        this.clazz = clazz;
        this.typeId = (short) typeId;
        this.independent = independent;
        this.living = clazz != null && LivingEntity.class.isAssignableFrom(clazz);
        this.key = (name == null) ? null : NamespacedKey.minecraft(name);
    }

    /**
     * Gets the entity type name.
     *
     * @return the entity type's name
     * @deprecated Magic value
     * @since 1.1.0
     */
    @Deprecated(since = "1.6.2")
    @Nullable
    public String getName() {
        return name;
    }

    /**
     * @since 1.14
     */
    @NotNull
    @Override
    public NamespacedKey getKey() {
        Preconditions.checkArgument(key != null, "EntityType doesn't have key! Is it UNKNOWN?");

        return key;
    }

    /**
     * @since 1.1.0
     */
    @Nullable
    public Class<? extends Entity> getEntityClass() {
        return clazz;
    }

    /**
     * Gets the entity type id.
     *
     * @return the raw type id
     * @deprecated Magic value
     */
    @Deprecated(since = "1.6.2", forRemoval = true)
    public short getTypeId() {
        return typeId;
    }

    /**
     * Gets an entity type from its name.
     *
     * @param name the entity type's name
     * @return the matching entity type or null
     * @apiNote Internal Use Only
     */
    @org.jetbrains.annotations.ApiStatus.Internal // Paper
    @Contract("null -> null")
    @Nullable
    public static EntityType fromName(@Nullable String name) {
        if (name == null) {
            return null;
        }
        return NAME_MAP.get(name.toLowerCase(Locale.ROOT));
    }

    /**
     * Gets an entity from its id.
     *
     * @param id the raw type id
     * @return the matching entity type or null
     * @deprecated Magic value
     */
    @Deprecated(since = "1.6.2", forRemoval = true)
    @Nullable
    public static EntityType fromId(int id) {
        if (id > Short.MAX_VALUE) {
            return null;
        }
        return ID_MAP.get((short) id);
    }

    /**
     * Some entities cannot be spawned using {@link
     * World#spawnEntity(Location, EntityType)} or {@link
     * World#spawn(Location, Class)}, usually because they require additional
     * information in order to spawn.
     *
     * @return False if the entity type cannot be spawned
     * @since 1.1.0
     */
    public boolean isSpawnable() {
        return independent;
    }

    /**
     * @since 1.1.0
     */
    public boolean isAlive() {
        return living;
    }

    @Override
    @NotNull
    @Deprecated(forRemoval = true) // Paper
    public String getTranslationKey() {
        return this.translationKey();
    }

    // Paper start
    /**
     * @throws IllegalArgumentException if the entity does not have a translation key
     * @since 1.17.1
     */
    @Override
    public @NotNull String translationKey() {
        Preconditions.checkArgument(this != UNKNOWN, "UNKNOWN entities do not have translation keys");
        return InternalAPIBridge.get().getTranslationKey(this);
    }

    /**
     * Gets the spawn category of this entity type.
     *
     * @return the spawn category
     * @throws IllegalArgumentException if the entity does not have a spawn category
     * @since 26.2
     */
    public @NotNull SpawnCategory getSpawnCategory() {
        Preconditions.checkArgument(this != UNKNOWN, "UNKNOWN entities do not have a spawn category");
        return InternalAPIBridge.get().getSpawnCategory(this);
    }

    /**
     * Checks if the entity type has default attributes.
     *
     * @return true if it has default attributes
     * @since 1.17.1
     */
    public boolean hasDefaultAttributes() {
        if (this == UNKNOWN) {
            return false;
        }
        return InternalAPIBridge.get().hasDefaultEntityAttributes(this.key);
    }

    /**
     * Gets the default attributes for the entity type.
     *
     * @return an unmodifiable instance of Attributable for reading default attributes.
     * @throws IllegalArgumentException if it doesn't have default attributes (use {@link #hasDefaultAttributes()} first)
     * @since 1.17.1
     */
    public @NotNull org.bukkit.attribute.Attributable getDefaultAttributes() {
        Preconditions.checkArgument(this.hasDefaultAttributes(), this.key + " doesn't have default attributes");
        return InternalAPIBridge.get().getDefaultEntityAttributes(this.key);
    }
    // Paper end
}
