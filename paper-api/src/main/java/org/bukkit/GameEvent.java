package org.bukkit;

import java.util.Collection;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a generic Mojang game event.
 *
 * @since 1.17
 */
public abstract class GameEvent implements Keyed {

    /**
     * @since 1.19
     */
    // Start generate - GameEvent
    public static final GameEvent BLOCK_ACTIVATE = getEvent("block_activate");

    /**
     * @since 1.17
     */
    public static final GameEvent BLOCK_ATTACH = getEvent("block_attach");

    /**
     * @since 1.17
     */
    public static final GameEvent BLOCK_CHANGE = getEvent("block_change");

    /**
     * @since 1.17
     */
    public static final GameEvent BLOCK_CLOSE = getEvent("block_close");

    /**
     * @since 1.19
     */
    public static final GameEvent BLOCK_DEACTIVATE = getEvent("block_deactivate");

    /**
     * @since 1.17
     */
    public static final GameEvent BLOCK_DESTROY = getEvent("block_destroy");

    /**
     * @since 1.17
     */
    public static final GameEvent BLOCK_DETACH = getEvent("block_detach");

    /**
     * @since 1.17
     */
    public static final GameEvent BLOCK_OPEN = getEvent("block_open");

    /**
     * @since 1.17
     */
    public static final GameEvent BLOCK_PLACE = getEvent("block_place");

    /**
     * @since 26.2
     */
    public static final GameEvent BOUNCE = getEvent("bounce");

    /**
     * @since 1.17
     */
    public static final GameEvent CONTAINER_CLOSE = getEvent("container_close");

    /**
     * @since 1.17
     */
    public static final GameEvent CONTAINER_OPEN = getEvent("container_open");

    /**
     * @since 1.19
     */
    public static final GameEvent DRINK = getEvent("drink");

    /**
     * @since 1.17
     */
    public static final GameEvent EAT = getEvent("eat");

    /**
     * @since 1.19
     */
    public static final GameEvent ELYTRA_GLIDE = getEvent("elytra_glide");

    /**
     * @since 1.20.2
     */
    public static final GameEvent ENTITY_ACTION = getEvent("entity_action");

    /**
     * @since 1.19
     */
    public static final GameEvent ENTITY_DAMAGE = getEvent("entity_damage");

    /**
     * @since 1.19
     */
    public static final GameEvent ENTITY_DIE = getEvent("entity_die");

    /**
     * @since 1.19.4
     */
    public static final GameEvent ENTITY_DISMOUNT = getEvent("entity_dismount");

    /**
     * @since 1.19
     */
    public static final GameEvent ENTITY_INTERACT = getEvent("entity_interact");

    /**
     * @since 1.19.4
     */
    public static final GameEvent ENTITY_MOUNT = getEvent("entity_mount");

    /**
     * @since 1.17
     */
    public static final GameEvent ENTITY_PLACE = getEvent("entity_place");

    /**
     * @since 1.17
     */
    public static final GameEvent EQUIP = getEvent("equip");

    /**
     * @since 1.17
     */
    public static final GameEvent EXPLODE = getEvent("explode");

    /**
     * @since 1.17
     */
    public static final GameEvent FLAP = getEvent("flap");

    /**
     * @since 1.17
     */
    public static final GameEvent FLUID_PICKUP = getEvent("fluid_pickup");

    /**
     * @since 1.17
     */
    public static final GameEvent FLUID_PLACE = getEvent("fluid_place");

    /**
     * @since 1.17
     */
    public static final GameEvent HIT_GROUND = getEvent("hit_ground");

    /**
     * @since 1.19
     */
    public static final GameEvent INSTRUMENT_PLAY = getEvent("instrument_play");

    /**
     * @since 1.19
     */
    public static final GameEvent ITEM_INTERACT_FINISH = getEvent("item_interact_finish");

    /**
     * @since 1.19
     */
    public static final GameEvent ITEM_INTERACT_START = getEvent("item_interact_start");

    /**
     * @since 1.19.1
     */
    public static final GameEvent JUKEBOX_PLAY = getEvent("jukebox_play");

    /**
     * @since 1.19.1
     */
    public static final GameEvent JUKEBOX_STOP_PLAY = getEvent("jukebox_stop_play");

    /**
     * @since 1.17
     */
    public static final GameEvent LIGHTNING_STRIKE = getEvent("lightning_strike");

    /**
     * @since 1.19
     */
    public static final GameEvent NOTE_BLOCK_PLAY = getEvent("note_block_play");

    /**
     * @since 1.17
     */
    public static final GameEvent PRIME_FUSE = getEvent("prime_fuse");

    /**
     * @since 1.17
     */
    public static final GameEvent PROJECTILE_LAND = getEvent("projectile_land");

    /**
     * @since 1.17
     */
    public static final GameEvent PROJECTILE_SHOOT = getEvent("projectile_shoot");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_1 = getEvent("resonate_1");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_2 = getEvent("resonate_2");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_3 = getEvent("resonate_3");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_4 = getEvent("resonate_4");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_5 = getEvent("resonate_5");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_6 = getEvent("resonate_6");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_7 = getEvent("resonate_7");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_8 = getEvent("resonate_8");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_9 = getEvent("resonate_9");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_10 = getEvent("resonate_10");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_11 = getEvent("resonate_11");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_12 = getEvent("resonate_12");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_13 = getEvent("resonate_13");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_14 = getEvent("resonate_14");

    /**
     * @since 1.20
     */
    public static final GameEvent RESONATE_15 = getEvent("resonate_15");

    /**
     * @since 1.19
     */
    public static final GameEvent SCULK_SENSOR_TENDRILS_CLICKING = getEvent("sculk_sensor_tendrils_clicking");

    /**
     * @since 1.17
     */
    public static final GameEvent SHEAR = getEvent("shear");

    /**
     * @since 1.19
     */
    public static final GameEvent SHRIEK = getEvent("shriek");

    /**
     * @since 1.17
     */
    public static final GameEvent SPLASH = getEvent("splash");

    /**
     * @since 1.17
     */
    public static final GameEvent STEP = getEvent("step");

    /**
     * @since 1.17
     */
    public static final GameEvent SWIM = getEvent("swim");

    /**
     * @since 1.19
     */
    public static final GameEvent TELEPORT = getEvent("teleport");

    /**
     * @since 1.20.2
     */
    public static final GameEvent UNEQUIP = getEvent("unequip");
    // End generate - GameEvent
    /**
     * @deprecated in favor of {@link #BLOCK_ACTIVATE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent BLOCK_PRESS = BLOCK_ACTIVATE;
    /**
     * @deprecated in favor of {@link #BLOCK_ACTIVATE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent BLOCK_SWITCH = BLOCK_ACTIVATE;
    /**
     * @deprecated in favor of {@link #BLOCK_DEACTIVATE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent BLOCK_UNPRESS = BLOCK_DEACTIVATE;
    /**
     * @deprecated in favor of {@link #BLOCK_DEACTIVATE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent BLOCK_UNSWITCH = BLOCK_DEACTIVATE;
    /**
     * @deprecated in favor of {@link #BLOCK_ACTIVATE}
     * @since 1.17
     */
    @Deprecated(since = "1.20")
    public static final GameEvent DISPENSE_FAIL = BLOCK_ACTIVATE;
    /**
     * @deprecated in favor of {@link #DRINK}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent DRINKING_FINISH = DRINK;
    /**
     * @deprecated in favor of {@link #ELYTRA_GLIDE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent ELYTRA_FREE_FALL = ELYTRA_GLIDE;
    /**
     * @deprecated in favor of {@link #ENTITY_DAMAGE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent ENTITY_DAMAGED = ENTITY_DAMAGE;
    /**
     * @deprecated in favor of {@link #ENTITY_DIE}
     * @since 1.19
     */
    @Deprecated(since = "1.19")
    public static final GameEvent ENTITY_DYING = ENTITY_DIE;
    /**
     * @deprecated in favor of {@link #ENTITY_DIE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent ENTITY_KILLED = ENTITY_DIE;
    /**
     * @deprecated in favor of {@link #ENTITY_ACTION}
     * @since 1.19
     */
    @Deprecated(since = "1.20.2")
    public static final GameEvent ENTITY_ROAR = ENTITY_ACTION;
    /**
     * @deprecated in favor of {@link #ENTITY_ACTION}
     * @since 1.19
     */
    @Deprecated(since = "1.20.2")
    public static final GameEvent ENTITY_SHAKE = ENTITY_ACTION;
    /**
     * @deprecated in favor of {@link #ENTITY_INTERACT}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent MOB_INTERACT = ENTITY_INTERACT;
    /**
     * @deprecated in favor of {@link #BLOCK_DEACTIVATE}
     * @since 1.17
     */
    @Deprecated(since = "1.20")
    public static final GameEvent PISTON_CONTRACT = BLOCK_DEACTIVATE;
    /**
     * @deprecated in favor of {@link #BLOCK_ACTIVATE}
     * @since 1.17
     */
    @Deprecated(since = "1.20")
    public static final GameEvent PISTON_EXTEND = BLOCK_ACTIVATE;
    /**
     * @deprecated in favor of {@link #ENTITY_ACTION}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent RAVAGER_ROAR = ENTITY_ACTION;
    /**
     * @deprecated in favor of {@link #BLOCK_CHANGE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent RING_BELL = BLOCK_CHANGE;
    /**
     * @deprecated in favor of {@link #CONTAINER_CLOSE}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent SHULKER_CLOSE = CONTAINER_CLOSE;
    /**
     * @deprecated in favor of {@link #CONTAINER_OPEN}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent SHULKER_OPEN = CONTAINER_OPEN;
    /**
     * @deprecated in favor of {@link #ENTITY_ACTION}
     * @since 1.17
     */
    @Deprecated(since = "1.19")
    public static final GameEvent WOLF_SHAKING = ENTITY_ACTION;

    /**
     * Returns a {@link GameEvent} by a {@link NamespacedKey}.
     *
     * @param namespacedKey the key
     * @return the event or null
     * @deprecated Use {@link Registry#get(NamespacedKey)} instead.
     * @since 1.17
     */
    @Nullable
    @Deprecated(since = "1.20.1")
    public static GameEvent getByKey(@NotNull NamespacedKey namespacedKey) {
        return Registry.GAME_EVENT.get(namespacedKey);
    }

    /**
     * Returns the set of all GameEvents.
     *
     * @return the memoryKeys
     * @deprecated use {@link Registry#stream()}.
     * @since 1.17
     */
    @NotNull
    @Deprecated(since = "1.20.1")
    public static Collection<GameEvent> values() {
        return Registry.GAME_EVENT.stream().toList();
    }

    @NotNull
    private static GameEvent getEvent(@NotNull @KeyPattern.Value String key) {
        return Registry.GAME_EVENT.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }
    // Paper start
    /**
     * Gets the range of the event which is used to
     * notify listeners of the event.
     *
     * @return the range
     * @since 1.21
     */
    public abstract int getRange();

    /**
     * Gets the vibration level of the game event for vibration listeners.
     * Not all events have vibration levels, and a level of 0 means
     * it won't cause any vibrations.
     *
     * @return the vibration level
     * @since 1.21
     */
    public abstract int getVibrationLevel();
    // Paper end
}
