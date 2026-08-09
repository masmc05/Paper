package org.bukkit;

import com.google.common.base.Enums;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A list of effects that the server is able to send to players.
 *
 * @since 1.0.0
 */
public enum Effect {
    /**
     * Sound when a dispenser interaction succeeded.
     *
     * @since 26.2
     */
    DISPENSER_DISPENSE(1000, Type.SOUND),
    /**
     * Sound when a dispenser interaction failed.
     *
     * @since 26.2
     */
    DISPENSER_FAIL(1001, Type.SOUND),
    /**
     * Sound when a projectile is launched from a dispenser.
     *
     * @since 26.2
     */
    DISPENSER_PROJECTILE_LAUNCH(1002, Type.SOUND),
    /**
     * Sound of a door opening.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_WOODEN_DOOR_OPEN
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    DOOR_TOGGLE(1006, Type.SOUND),
    /**
     * Sound of an iron door opening.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_IRON_DOOR_OPEN
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    IRON_DOOR_TOGGLE(1005, Type.SOUND),
    /**
     * Sound of a trapdoor opening.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_WOODEN_TRAPDOOR_OPEN
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    TRAPDOOR_TOGGLE(1007, Type.SOUND),
    /**
     * Sound of an iron trapdoor opening.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_IRON_TRAPDOOR_OPEN
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    IRON_TRAPDOOR_TOGGLE(1037, Type.SOUND),
    /**
     * Sound of a fence gate opening.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_FENCE_GATE_OPEN
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    FENCE_GATE_TOGGLE(1008, Type.SOUND),
    /**
     * Sound of a door closing.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_WOODEN_DOOR_CLOSE
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    DOOR_CLOSE(1012, Type.SOUND),
    /**
     * Sound of an iron door closing.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_IRON_DOOR_CLOSE
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    IRON_DOOR_CLOSE(1011, Type.SOUND),
    /**
     * Sound of a trapdoor closing.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_WOODEN_TRAPDOOR_CLOSE
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    TRAPDOOR_CLOSE(1013, Type.SOUND),
    /**
     * Sound of an iron trapdoor closing.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_IRON_TRAPDOOR_CLOSE
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    IRON_TRAPDOOR_CLOSE(1036, Type.SOUND),
    /**
     * Sound of a fence gate closing.
     *
     * @deprecated no longer exists
     * @see Sound#BLOCK_FENCE_GATE_CLOSE
     */
    @Deprecated(since = "1.19.3", forRemoval = true)
    FENCE_GATE_CLOSE(1014, Type.SOUND),
    /**
     * The sound played when launching an ender eye.
     *
     * @deprecated no longer exists
     */
    @Deprecated(since = "1.21", forRemoval = true)
    ENDEREYE_LAUNCH(1003, Type.SOUND),
    /**
     * The sound played when launching a firework.
     *
     * @since 1.9.4
     */
    FIREWORK_SHOOT(1004, Type.SOUND),
    /**
     * Sound of fire being extinguished.
     * {@link Boolean} param is true if the fire is extinguished by the powder snow.
     *
     * @since 1.0.0
     */
    EXTINGUISH(1009, Type.SOUND, Boolean.class),
    /**
     * Play a song from a jukebox.
     * {@link JukeboxSong} param is the song to play.
     *
     * @since 1.0.0
     */
    RECORD_PLAY(1010, Type.SOUND, JukeboxSong.class, Material.class), // jukebox song is more correct, but the impl of the methods will still work with Material
    /**
     * Stop the song currently played.
     *
     * @since 26.2
     */
    RECORD_STOP(1011, Type.SOUND),
    /**
     * Sound of ghast shrieking.
     *
     * @since 1.1.0
     */
    GHAST_SHRIEK(1015, Type.SOUND),
    /**
     * Sound of ghast firing.
     *
     * @since 1.1.0
     */
    GHAST_SHOOT(1016, Type.SOUND),
    /**
     * Sound of an ender dragon firing.
     *
     * @since 26.2
     */
    ENDER_DRAGON_SHOOT(1017, Type.SOUND),
    /**
     * Sound of blaze firing.
     *
     * @since 1.1.0
     */
    BLAZE_SHOOT(1018, Type.SOUND),
    /**
     * Sound of zombies chewing on wooden doors.
     *
     * @since 1.3.1
     */
    ZOMBIE_CHEW_WOODEN_DOOR(1019, Type.SOUND),
    /**
     * Sound of zombies chewing on iron doors.
     *
     * @since 1.3.1
     */
    ZOMBIE_CHEW_IRON_DOOR(1020, Type.SOUND),
    /**
     * Sound of zombies destroying a door.
     *
     * @since 1.3.1
     */
    ZOMBIE_DESTROY_DOOR(1021, Type.SOUND),
    /**
     * Sound played when a wither breaks a block.
     *
     * @since 1.9.4
     */
    WITHER_BREAK_BLOCK(1022, Type.SOUND),
    /**
     * Sound of a wither spawning.
     *
     * @since 1.16.5
     */
    WITHER_SPAWNED(1023, Type.SOUND),
    /**
     * Sound of a wither shooting.
     *
     * @since 1.9.4
     */
    WITHER_SHOOT(1024, Type.SOUND),
    /**
     * Sound played by a bat taking off.
     *
     * @since 1.9.4
     */
    BAT_TAKEOFF(1025, Type.SOUND),
    /**
     * The sound played when a zombie infects a target.
     *
     * @since 1.9.4
     */
    ZOMBIE_INFECT(1026, Type.SOUND),
    /**
     * The sound played when a villager is converted by a zombie.
     *
     * @since 26.2
     */
    ZOMBIE_CONVERTED_TO_VILLAGER(1027, Type.SOUND),
    /**
     * The sound of an ender dragon dying.
     *
     * @since 1.16.5
     */
    ENDER_DRAGON_DEATH(1028, Type.SOUND),
    /**
     * The sound played when an anvil breaks.
     *
     * @since 1.9.4
     */
    ANVIL_BREAK(1029, Type.SOUND),
    /**
     * The sound played when an anvil is used.
     *
     * @since 1.9.4
     */
    ANVIL_USE(1030, Type.SOUND),
    /**
     * The sound played when an anvil lands after falling.
     *
     * @since 1.9.4
     */
    ANVIL_LAND(1031, Type.SOUND),
    /**
     * The sound played when traveling through a portal.
     *
     * @since 1.9.4
     */
    PORTAL_TRAVEL(1032, Type.SOUND),
    /**
     * The sound played when a chorus flower grows.
     *
     * @since 1.9.4
     */
    CHORUS_FLOWER_GROW(1033, Type.SOUND),
    /**
     * The sound played when a chorus flower dies.
     *
     * @since 1.9.4
     */
    CHORUS_FLOWER_DEATH(1034, Type.SOUND),
    /**
     * The sound played by brewing stands when brewing.
     *
     * @since 1.9.4
     */
    BREWING_STAND_BREW(1035, Type.SOUND),
    /**
     * The sound of an ender portal being created in the overworld.
     *
     * @since 1.16.5
     */
    END_PORTAL_CREATED_IN_OVERWORLD(1038, Type.SOUND),
    /**
     * The sound played when phantom bites.
     *
     * @since 1.17.1
     */
    PHANTOM_BITE(1039, Type.SOUND),
    /**
     * The sound played when a zombie converts to a drowned.
     *
     * @since 1.17.1
     */
    ZOMBIE_CONVERTED_TO_DROWNED(1040, Type.SOUND),
    /**
     * The sound played when a husk converts to a zombie.
     *
     * @since 1.17.1
     */
    HUSK_CONVERTED_TO_ZOMBIE(1041, Type.SOUND),
    /**
     * The sound played when a grindstone is being used.
     *
     * @since 1.17.1
     */
    GRINDSTONE_USE(1042, Type.SOUND),
    /**
     * The sound played when a book page is being turned.
     *
     * @since 1.17.1
     */
    BOOK_PAGE_TURN(1043, Type.SOUND),
    /**
     * The sound played when a smithing table is being used.
     *
     * @since 1.17.1
     */
    SMITHING_TABLE_USE(1044, Type.SOUND),
    /**
     * The sound played when a pointed dripstone hits the surface.
     *
     * @since 1.17.1
     */
    POINTED_DRIPSTONE_LAND(1045, Type.SOUND),
    /**
     * The sound played when a pointed dripstone drips lava into a cauldron.
     *
     * @since 1.17.1
     */
    POINTED_DRIPSTONE_DRIP_LAVA_INTO_CAULDRON(1046, Type.SOUND),
    /**
     * The sound played when a pointed dripstone drips water into a cauldron.
     *
     * @since 1.17.1
     */
    POINTED_DRIPSTONE_DRIP_WATER_INTO_CAULDRON(1047, Type.SOUND),
    /**
     * The sound played when a skeleton converts to a stray.
     *
     * @since 1.17.1
     */
    SKELETON_CONVERTED_TO_STRAY(1048, Type.SOUND),
    /**
     * @since 1.20.4
     */
    CRAFTER_CRAFT(1049, Type.SOUND),
    /**
     * @since 1.20.4
     */
    CRAFTER_FAIL(1050, Type.SOUND),
    /**
     * @since 26.2
     */
    WIND_CHARGE_SHOOT(1051, Type.SOUND),
    /**
     * @since 26.2
     */
    SULFUR_SPIKE_LAND(1052, Type.SOUND),
    /**
     * The sound played / particles shown when a composter is being attempted to
     * fill.
     * {@link Boolean} param is true for a successful attempt.
     *
     * @since 1.17.1
     */
    COMPOSTER_FILL_ATTEMPT(1500, Type.VISUAL, Boolean.class),
    /**
     * The sound played / particles shown when lava interacts with the world.
     * <p>
     * For example by forming stone, obsidian, basalt or destroying blocks such
     * as torches.
     *
     * @since 1.17.1
     */
    LAVA_INTERACT(1501, Type.VISUAL),
    /**
     * The sound played / particles shown when a redstone torch burns out.
     *
     * @since 1.17.1
     */
    REDSTONE_TORCH_BURNOUT(1502, Type.VISUAL),
    /**
     * The sound played / particles shown when an eye of ender is placed into an
     * ender portal frame.
     *
     * @since 1.17.1
     */
    END_PORTAL_FRAME_FILL(1503, Type.VISUAL),
    /**
     * The particles shown when a dripstone drips lava or water.
     * <p>
     * This effect requires a dripstone at the location as well as lava or water
     * at the root of the dripstone.
     *
     * @since 1.17.1
     */
    DRIPPING_DRIPSTONE(1504, Type.VISUAL),
    /**
     * The sound played / particles shown when bone meal is used to grow a
     * plant.
     * {@link Integer} param is the number of particles.
     *
     * @since 1.17.1
     */
    BONE_MEAL_USE(1505, Type.VISUAL, Integer.class),
    /**
     * A visual smoke effect.
     * {@link BlockFace} param is the direction to shoot.
     *
     * @since 26.2
     */
    SMOKE_SHOOT(2000, Type.VISUAL, BlockFace.class),
    /**
     * Sound of a block breaking.
     * {@link BlockData} param is the block being broken.
     *
     * @deprecated use {@link #DESTROY_BLOCK}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    STEP_SOUND(2001, Type.SOUND, BlockData.class, Material.class), // block data is more correct, but the impl of the methods will still work with Material
    /**
     * Block breaking.
     * {@link BlockData} param is the block being broken.
     *
     * @since 26.2
     */
    DESTROY_BLOCK(2001, Type.VISUAL, BlockData.class),
    /**
     * Visual effect of a splash potion breaking.
     * {@link Color} param is the color of the potion.
     *
     * @since 1.1.0
     */
    POTION_BREAK(2002, Type.VISUAL, Color.class),
    /**
     * An ender eye signal; a visual effect.
     *
     * @since 1.1.0
     */
    ENDER_SIGNAL(2003, Type.VISUAL),
    /**
     * The flames seen on a mobspawner; a visual effect.
     *
     * @since 1.1.0
     */
    MOBSPAWNER_FLAMES(2004, Type.VISUAL),
    /**
     * The sound/particles used by the ender dragon's breath
     * attack.
     * {@link Boolean} param is true if the sound is muted.
     *
     * @since 26.2
     */
    ENDER_DRAGON_BREATH(2006, Type.VISUAL, Boolean.class),
    /**
     * Visual effect of an instant splash potion breaking.
     * {@link Color} param is the color of the potion.
     *
     * @since 1.15.2
     */
    INSTANT_POTION_BREAK(2007, Type.VISUAL, Color.class),
    /**
     * The particles shown when an ender dragon destroys blocks.
     *
     * @since 1.17.1
     */
    ENDER_DRAGON_DESTROY_BLOCK(2008, Type.VISUAL),
    /**
     * The particles shown when a sponge dries in an ultra warm world (nether).
     *
     * @since 1.17.1
     */
    SPONGE_DRY(2009, Type.VISUAL),
    /**
     * {@link BlockFace} param is the direction to shoot.
     *
     * @since 26.2
     */
    WHITE_SMOKE_SHOOT(2010, Type.VISUAL, BlockFace.class),
    /**
     * {@link Integer} param is the number of particles.
     *
     * @since 1.20.6
     */
    BEE_GROWTH(2011, Type.VISUAL, Integer.class),
    /**
     * {@link Integer} param is the number of particles.
     *
     * @since 1.20.6
     */
    TURTLE_EGG_PLACEMENT(2012, Type.VISUAL, Integer.class),
    /**
     * {@link Integer} param is relative to the number of particles.
     *
     * @since 1.20.6
     */
    SMASH_ATTACK(2013, Type.VISUAL, Integer.class),
    /**
     * The sound/particles caused by an end gateway spawning.
     *
     * @since 1.9.4
     */
    END_GATEWAY_SPAWN(3000, Type.VISUAL),
    /**
     * The sound of an ender dragon growling.
     *
     * @since 26.2
     */
    ENDER_DRAGON_GROWL(3001, Type.SOUND),
    /**
     * The particles shown when a lightning hits a lightning rod or oxidized
     * copper.
     * {@link Axis} param is the axis which the particle should be shown. If no data is
     * provided it will show the particles at the block faces.
     *
     * @since 1.17.1
     */
    ELECTRIC_SPARK(3002, Type.VISUAL, Axis.class),
    /**
     * The sound played / particles shown when wax is applied to a copper block.
     *
     * @since 1.17.1
     */
    COPPER_WAX_ON(3003, Type.VISUAL),
    /**
     * The particles shown when wax is removed from a copper block.
     *
     * @since 1.17.1
     */
    COPPER_WAX_OFF(3004, Type.VISUAL),
    /**
     * The particles shown when oxidation is scraped of an oxidized copper.
     * block.
     *
     * @since 1.17.1
     */
    OXIDISED_COPPER_SCRAPE(3005, Type.VISUAL),
    /**
     * @since 26.2
     */
    SCULK_CHARGE(3006, Type.VISUAL, Integer.class), // not worth to implement properly without a new api
    /**
     * @since 26.2
     */
    SCULK_SHRIEK(3007, Type.SOUND),
    /**
     * {@link BlockData} param is the block being brushed.
     *
     * @since 26.2
     */
    BRUSH_BLOCK_COMPLETE(3008, Type.VISUAL, BlockData.class),
    /**
     * @since 26.2
     */
    EGG_CRACK(3009, Type.VISUAL),
    /**
     * @deprecated no longer exists
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    GUST_DUST(3010, Type.VISUAL),
    /**
     * {@link Boolean} param is true for "ominous" trial spawners.
     *
     * @since 1.20.4
     */
    TRIAL_SPAWNER_SPAWN(3011, Type.VISUAL, Boolean.class),
    /**
     * {@link Boolean} param is true for "ominous" trial spawners.
     *
     * @since 1.20.4
     */
    TRIAL_SPAWNER_SPAWN_MOB_AT(3012, Type.VISUAL, Boolean.class),
    /**
     * {@link Integer} param is the number of players.
     *
     * @since 1.20.4
     */
    TRIAL_SPAWNER_DETECT_PLAYER(3013, Type.VISUAL, Integer.class),
    /**
     * @since 1.20.4
     */
    TRIAL_SPAWNER_EJECT_ITEM(3014, Type.VISUAL),
    /**
     * {@link Boolean} param is true for "ominous" vaults.
     *
     * @since 1.20.6
     */
    VAULT_ACTIVATE(3015, Type.VISUAL, Boolean.class),
    /**
     * {@link Boolean} param is true for "ominous" vaults.
     *
     * @since 1.20.6
     */
    VAULT_DEACTIVATE(3016, Type.VISUAL, Boolean.class),
    /**
     * @since 1.20.6
     */
    VAULT_EJECT_ITEM(3017, Type.VISUAL),
    /**
     * @since 1.20.6
     */
    SPAWN_COBWEB(3018, Type.VISUAL),
    /**
     * {@link Integer} param is the number of players.
     *
     * @since 1.20.6
     */
    TRIAL_SPAWNER_DETECT_PLAYER_OMINOUS(3019, Type.VISUAL, Integer.class),
    /**
     * {@link Boolean} param is true for changing to "ominous".
     *
     * @since 1.20.6
     */
    TRIAL_SPAWNER_BECOME_OMINOUS(3020, Type.VISUAL, Boolean.class),
    /**
     * {@link Boolean} param is true for "ominous" trial spawners.
     *
     * @since 1.20.6
     */
    TRIAL_SPAWNER_SPAWN_ITEM(3021, Type.VISUAL, Boolean.class),
    ;

    //<editor-fold desc="Replaced effects" defaultstate="collapsed">
    /**
     * An alternate click sound.
     *
     * @deprecated use {@link #DISPENSER_DISPENSE}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect CLICK2 = DISPENSER_DISPENSE;
    /**
     * A click sound.
     *
     * @deprecated use {@link #DISPENSER_FAIL}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect CLICK1 = DISPENSER_FAIL;
    /**
     * Sound of a bow firing.
     *
     * @deprecated use {@link #DISPENSER_PROJECTILE_LAUNCH}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect BOW_FIRE = DISPENSER_PROJECTILE_LAUNCH;
    /**
     * @deprecated use {@link #RECORD_STOP}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect SOUND_STOP_JUKEBOX_SONG = RECORD_STOP;
    /**
     * Sound of an ender dragon firing.
     *
     * @deprecated use {@link #ENDER_DRAGON_SHOOT}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect ENDERDRAGON_SHOOT = ENDER_DRAGON_SHOOT;
    /**
     * The sound played when a villager is converted by a zombie.
     *
     * @deprecated use {@link #ZOMBIE_CONVERTED_TO_VILLAGER}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect ZOMBIE_CONVERTED_VILLAGER = ZOMBIE_CONVERTED_TO_VILLAGER;
    /**
     * @deprecated use {@link #WIND_CHARGE_SHOOT}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect SOUND_WITH_CHARGE_SHOT = WIND_CHARGE_SHOOT;
    /**
     * The sound/particles used by the ender dragon's breath
     * attack.
     * {@link Boolean} param is true if the sound is muted.
     * @deprecated use {@link #ENDER_DRAGON_BREATH}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect DRAGON_BREATH = ENDER_DRAGON_BREATH;
    /**
     * Particles displayed when a villager grows a plant.
     * {@link Integer} param is the number of particles.
     *
     * @deprecated partially replaced by {@link #BEE_GROWTH}
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    public static final Effect VILLAGER_PLANT_GROW = BEE_GROWTH;
    /**
     * A visual smoke effect.
     * {@link BlockFace} param is the direction the smoke is launched.
     *
     * @deprecated use {@link #SMOKE_SHOOT}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect SMOKE = SMOKE_SHOOT;
    /**
     * {@link BlockFace} param is the direction to shoot.
     *
     * @deprecated use {@link #WHITE_SMOKE_SHOOT}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect SHOOT_WHITE_SMOKE = WHITE_SMOKE_SHOOT;
    /**
     * The sound of an ender dragon growling.
     *
     * @deprecated use {@link #ENDER_DRAGON_GROWL}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect ENDERDRAGON_GROWL = ENDER_DRAGON_GROWL;
    /**
     * @deprecated use {@link #SCULK_CHARGE}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect PARTICLES_SCULK_CHARGE = SCULK_CHARGE;
    /**
     * @deprecated use {@link #SCULK_SHRIEK}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect PARTICLES_SCULK_SHRIEK = SCULK_SHRIEK;
    /**
     * {@link BlockData} param is the block being brushed.
     *
     * @deprecated use {@link #BRUSH_BLOCK_COMPLETE}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect PARTICLES_AND_SOUND_BRUSH_BLOCK_COMPLETE = BRUSH_BLOCK_COMPLETE;
    /**
     * @deprecated use {@link #EGG_CRACK}
     */
    @Deprecated(since = "26.2", forRemoval = true)
    public static final Effect PARTICLES_EGG_CRACK = EGG_CRACK;
    //</editor-fold>

    private static final Map<Integer, Effect> BY_ID = new HashMap<>();

    private final int id;
    private final Type type;
    private final List<Class<?>> data;

    Effect(int id, Type type) {
        this(id, type, (Class<?>[]) null);
    }

    Effect(int id, Type type, Class<?>... data) {
        this.id = id;
        this.type = type;
        this.data = data != null ? List.of(data) : null;
    }

    /**
     * Gets the ID for this effect.
     *
     * @return ID of this effect
     * @apiNote Internal Use Only
     */
    @ApiStatus.Internal
    public int getId() {
        return this.id;
    }

    /**
     * @return The type of the effect.
     * @deprecated some effects can be both or neither
     * @since 1.1.0
     */
    @NotNull
    @Deprecated
    public Type getType() {
        return this.type;
    }

    /**
     * @return The class which represents data for this effect, or null if
     *     none
     * @since 1.1.0
     */
    @Nullable
    public Class<?> getData() {
        return this.data == null ? null : this.data.getFirst();
    }

    @ApiStatus.Internal
    public boolean isApplicable(Object obj) {
        return this.data != null && this.data.stream().anyMatch(aClass -> aClass.isAssignableFrom(obj.getClass()));
    }

    /**
     * Gets the Effect associated with the given ID.
     *
     * @param id ID of the Effect to return
     * @return Effect with the given ID
     * @apiNote Internal Use Only
     */
    @ApiStatus.Internal
    @Nullable
    public static Effect getById(int id) {
        return BY_ID.get(id);
    }

    static {
        for (Effect effect : values()) {
            if (Enums.getField(effect).isAnnotationPresent(Deprecated.class)) {
                continue;
            }
            BY_ID.put(effect.id, effect);
        }
    }

    /**
     * Represents the type of an effect.
     *
     * @deprecated not representative of what Effect does
     * @since 1.1.0
     */
    @Deprecated
    public enum Type { /**
         * @since 1.1.0
         */
        SOUND, /**
         * @since 1.1.0
         */
        VISUAL }
}
