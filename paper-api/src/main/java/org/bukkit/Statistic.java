package org.bukkit;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a countable statistic, which is tracked by the server.
 *
 * @since 1.0.0
 */
public enum Statistic implements Keyed {
    /**
     * @since 1.7.10
     */
    // Start generate - StatisticCustom
    ANIMALS_BRED,
    /**
     * @since 1.9.4
     */
    AVIATE_ONE_CM,
    /**
     * @since 1.14
     */
    BELL_RING,
    /**
     * @since 1.7.10
     */
    BOAT_ONE_CM,
    /**
     * @since 1.8.8
     */
    ARMOR_CLEANED,
    /**
     * @since 1.8.8
     */
    BANNER_CLEANED,
    /**
     * @since 1.13.1
     */
    CLEAN_SHULKER_BOX,
    /**
     * @since 1.7.10
     */
    CLIMB_ONE_CM,
    /**
     * @since 1.8
     */
    CROUCH_ONE_CM,
    /**
     * @since 1.13.1
     */
    DAMAGE_ABSORBED,
    /**
     * @since 1.13.1
     */
    DAMAGE_BLOCKED_BY_SHIELD,
    /**
     * @since 1.0.0
     */
    DAMAGE_DEALT,
    /**
     * @since 1.13.1
     */
    DAMAGE_DEALT_ABSORBED,
    /**
     * @since 1.13.1
     */
    DAMAGE_DEALT_RESISTED,
    /**
     * @since 1.13.1
     */
    DAMAGE_RESISTED,
    /**
     * @since 1.0.0
     */
    DAMAGE_TAKEN,
    /**
     * @since 1.0.0
     */
    DEATHS,
    /**
     * @since 1.13
     */
    DROP_COUNT,
    /**
     * @since 1.8.8
     */
    CAKE_SLICES_EATEN,
    /**
     * @since 1.8.8
     */
    ITEM_ENCHANTED,
    /**
     * @since 1.7.10
     */
    FALL_ONE_CM,
    /**
     * @since 1.8.8
     */
    CAULDRON_FILLED,
    /**
     * @since 1.0.0
     */
    FISH_CAUGHT,
    /**
     * @since 1.7.10
     */
    FLY_ONE_CM,
    /**
     * @since 1.21.6
     */
    HAPPY_GHAST_ONE_CM,
    /**
     * @since 1.7.10
     */
    HORSE_ONE_CM,
    /**
     * @since 1.8.8
     */
    DISPENSER_INSPECTED,
    /**
     * @since 1.8.8
     */
    DROPPER_INSPECTED,
    /**
     * @since 1.8.8
     */
    HOPPER_INSPECTED,
    /**
     * @since 1.15
     */
    INTERACT_WITH_ANVIL,
    /**
     * @since 1.8.8
     */
    BEACON_INTERACTION,
    /**
     * @since 1.14
     */
    INTERACT_WITH_BLAST_FURNACE,
    /**
     * @since 1.8.8
     */
    BREWINGSTAND_INTERACTION,
    /**
     * @since 1.14
     */
    INTERACT_WITH_CAMPFIRE,
    /**
     * @since 1.14
     */
    INTERACT_WITH_CARTOGRAPHY_TABLE,
    /**
     * @since 1.8.8
     */
    CRAFTING_TABLE_INTERACTION,
    /**
     * @since 1.8.8
     */
    FURNACE_INTERACTION,
    /**
     * @since 1.15
     */
    INTERACT_WITH_GRINDSTONE,
    /**
     * @since 1.14
     */
    INTERACT_WITH_LECTERN,
    /**
     * @since 1.14
     */
    INTERACT_WITH_LOOM,
    /**
     * @since 1.16.1
     */
    INTERACT_WITH_SMITHING_TABLE,
    /**
     * @since 1.14
     */
    INTERACT_WITH_SMOKER,
    /**
     * @since 1.14
     */
    INTERACT_WITH_STONECUTTER,
    /**
     * @since 1.7.10
     */
    JUMP,
    /**
     * @since 1.7.10
     */
    LEAVE_GAME,
    /**
     * @since 1.7.10
     */
    MINECART_ONE_CM,
    /**
     * @since 1.0.0
     */
    MOB_KILLS,
    /**
     * @since 1.21.11
     */
    NAUTILUS_ONE_CM,
    /**
     * @since 1.14
     */
    OPEN_BARREL,
    /**
     * @since 1.8.8
     */
    CHEST_OPENED,
    /**
     * @since 1.8.8
     */
    ENDERCHEST_OPENED,
    /**
     * @since 1.11
     */
    SHULKER_BOX_OPENED,
    /**
     * @since 1.7.10
     */
    PIG_ONE_CM,
    /**
     * @since 1.8.8
     */
    NOTEBLOCK_PLAYED,
    /**
     * @since 1.8.8
     */
    RECORD_PLAYED,
    /**
     * @since 1.13
     */
    PLAY_ONE_MINUTE,
    /**
     * @since 1.0.0
     */
    PLAYER_KILLS,
    /**
     * @since 1.8.8
     */
    FLOWER_POTTED,
    /**
     * @since 1.14
     */
    RAID_TRIGGER,
    /**
     * @since 1.14
     */
    RAID_WIN,
    /**
     * @since 1.9.4
     */
    SLEEP_IN_BED,
    /**
     * @since 1.9.4
     */
    SNEAK_TIME,
    /**
     * @since 1.8
     */
    SPRINT_ONE_CM,
    /**
     * @since 1.16.1
     */
    STRIDER_ONE_CM,
    /**
     * @since 1.7.10
     */
    SWIM_ONE_CM,
    /**
     * @since 1.8
     */
    TALKED_TO_VILLAGER,
    /**
     * @since 1.16.1
     */
    TARGET_HIT,
    /**
     * @since 1.8
     */
    TIME_SINCE_DEATH,
    /**
     * @since 1.13
     */
    TIME_SINCE_REST,
    /**
     * @since 1.17
     */
    TOTAL_WORLD_TIME,
    /**
     * @since 1.8
     */
    TRADED_WITH_VILLAGER,
    /**
     * @since 1.8.8
     */
    TRAPPED_CHEST_TRIGGERED,
    /**
     * @since 1.8.8
     */
    NOTEBLOCK_TUNED,
    /**
     * @since 1.8.8
     */
    CAULDRON_USED,
    /**
     * @since 1.13
     */
    WALK_ON_WATER_ONE_CM,
    /**
     * @since 1.7.10
     */
    WALK_ONE_CM,
    /**
     * @since 1.13
     */
    WALK_UNDER_WATER_ONE_CM,
    /**
     * @since 1.0.0
     */
    // End generate - StatisticCustom
    // Start generate - StatisticType
    BREAK_ITEM(Type.ITEM),
    /**
     * @since 1.7.10
     */
    CRAFT_ITEM(Type.ITEM),
    /**
     * @since 1.7.10
     */
    DROP(Type.ITEM),
    /**
     * @since 1.7.10
     */
    KILL_ENTITY(Type.ENTITY),
    /**
     * @since 1.7.10
     */
    ENTITY_KILLED_BY(Type.ENTITY),
    /**
     * @since 1.0.0
     */
    MINE_BLOCK(Type.BLOCK),
    /**
     * @since 1.9.4
     */
    PICKUP(Type.ITEM),
    /**
     * @since 1.0.0
     */
    USE_ITEM(Type.ITEM);
    // End generate - StatisticType

    private final Type type;
    private final NamespacedKey key;

    private Statistic() {
        this(Type.UNTYPED);
    }

    private Statistic(/*@NotNull*/ Type type) {
        this.type = type;
        this.key = NamespacedKey.minecraft(name().toLowerCase(Locale.ROOT));
    }

    /**
     * Gets the type of this statistic.
     *
     * @return the type of this statistic
     * @since 1.7.10
     */
    @NotNull
    public Type getType() {
        return type;
    }

    /**
     * Checks if this is a substatistic.
     * <p>
     * A substatistic exists en masse for each block, item, or entitytype, depending on
     * {@link #getType()}.
     * <p>
     * This is a redundant method and equivalent to checking
     * <code>getType() != Type.UNTYPED</code>
     *
     * @return true if this is a substatistic
     * @since 1.0.0
     */
    public boolean isSubstatistic() {
        return type != Type.UNTYPED;
    }

    /**
     * Checks if this is a substatistic dealing with blocks.
     * <p>
     * This is a redundant method and equivalent to checking
     * <code>getType() == Type.BLOCK</code>
     *
     * @return true if this deals with blocks
     * @since 1.0.0
     */
    public boolean isBlock() {
        return type == Type.BLOCK;
    }

    /**
     * @since 1.14
     */
    @NotNull
    @Override
    public NamespacedKey getKey() {
        return key;
    }

    /**
     * The type of statistic.
     *
     *
     * @since 1.7.10
     */
    public enum Type {
        /**
         * Statistics of this type do not require a qualifier.
         *
         * @since 1.7.10
         */
        UNTYPED,

        /**
         * Statistics of this type require an Item Material qualifier.
         *
         * @since 1.7.10
         */
        ITEM,

        /**
         * Statistics of this type require a Block Material qualifier.
         *
         * @since 1.7.10
         */
        BLOCK,

        /**
         * Statistics of this type require an EntityType qualifier.
         *
         * @since 1.7.10
         */
        ENTITY;
    }
}
