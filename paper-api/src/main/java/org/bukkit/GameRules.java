package org.bukkit;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * All the vanilla gamerules
 *
 * @since 1.21.11
 */
@NullMarked
public final class GameRules {

    /**
     * @since 1.21.11
     */
    // Start generate - GameRules
    public static final GameRule<Boolean> ADVANCE_TIME = getRule("advance_time");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> ADVANCE_WEATHER = getRule("advance_weather");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> ALLOW_ENTERING_NETHER_USING_PORTALS = getRule("allow_entering_nether_using_portals");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> BLOCK_DROPS = getRule("block_drops");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> BLOCK_EXPLOSION_DROP_DECAY = getRule("block_explosion_drop_decay");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> COMMAND_BLOCK_OUTPUT = getRule("command_block_output");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> COMMAND_BLOCKS_WORK = getRule("command_blocks_work");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> DROWNING_DAMAGE = getRule("drowning_damage");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> ELYTRA_MOVEMENT_CHECK = getRule("elytra_movement_check");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> ENDER_PEARLS_VANISH_ON_DEATH = getRule("ender_pearls_vanish_on_death");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> ENTITY_DROPS = getRule("entity_drops");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> FALL_DAMAGE = getRule("fall_damage");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> FIRE_DAMAGE = getRule("fire_damage");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> FIRE_SPREAD_RADIUS_AROUND_PLAYER = getRule("fire_spread_radius_around_player");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> FORGIVE_DEAD_PLAYERS = getRule("forgive_dead_players");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> FREEZE_DAMAGE = getRule("freeze_damage");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> GLOBAL_SOUND_EVENTS = getRule("global_sound_events");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> IMMEDIATE_RESPAWN = getRule("immediate_respawn");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> KEEP_INVENTORY = getRule("keep_inventory");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> LAVA_SOURCE_CONVERSION = getRule("lava_source_conversion");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> LIMITED_CRAFTING = getRule("limited_crafting");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> LOCATOR_BAR = getRule("locator_bar");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> LOG_ADMIN_COMMANDS = getRule("log_admin_commands");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> MAX_BLOCK_MODIFICATIONS = getRule("max_block_modifications");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> MAX_COMMAND_FORKS = getRule("max_command_forks");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> MAX_COMMAND_SEQUENCE_LENGTH = getRule("max_command_sequence_length");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> MAX_ENTITY_CRAMMING = getRule("max_entity_cramming");

    /**
     * @since 1.21.11
     */
    @MinecraftExperimental(MinecraftExperimental.Requires.MINECART_IMPROVEMENTS)
    @ApiStatus.Experimental
    public static final GameRule<Integer> MAX_MINECART_SPEED = getRule("max_minecart_speed");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> MAX_SNOW_ACCUMULATION_HEIGHT = getRule("max_snow_accumulation_height");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> MOB_DROPS = getRule("mob_drops");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> MOB_EXPLOSION_DROP_DECAY = getRule("mob_explosion_drop_decay");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> MOB_GRIEFING = getRule("mob_griefing");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> NATURAL_HEALTH_REGENERATION = getRule("natural_health_regeneration");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> PLAYER_MOVEMENT_CHECK = getRule("player_movement_check");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> PLAYERS_NETHER_PORTAL_CREATIVE_DELAY = getRule("players_nether_portal_creative_delay");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> PLAYERS_NETHER_PORTAL_DEFAULT_DELAY = getRule("players_nether_portal_default_delay");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> PLAYERS_SLEEPING_PERCENTAGE = getRule("players_sleeping_percentage");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> PROJECTILES_CAN_BREAK_BLOCKS = getRule("projectiles_can_break_blocks");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> PVP = getRule("pvp");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> RAIDS = getRule("raids");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> RANDOM_TICK_SPEED = getRule("random_tick_speed");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> REDUCED_DEBUG_INFO = getRule("reduced_debug_info");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Integer> RESPAWN_RADIUS = getRule("respawn_radius");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SEND_COMMAND_FEEDBACK = getRule("send_command_feedback");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SHOW_ADVANCEMENT_MESSAGES = getRule("show_advancement_messages");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SHOW_DEATH_MESSAGES = getRule("show_death_messages");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPAWN_MOBS = getRule("spawn_mobs");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPAWN_MONSTERS = getRule("spawn_monsters");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPAWN_PATROLS = getRule("spawn_patrols");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPAWN_PHANTOMS = getRule("spawn_phantoms");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPAWN_WANDERING_TRADERS = getRule("spawn_wandering_traders");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPAWN_WARDENS = getRule("spawn_wardens");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPAWNER_BLOCKS_WORK = getRule("spawner_blocks_work");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPECTATORS_GENERATE_CHUNKS = getRule("spectators_generate_chunks");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> SPREAD_VINES = getRule("spread_vines");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> TNT_EXPLODES = getRule("tnt_explodes");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> TNT_EXPLOSION_DROP_DECAY = getRule("tnt_explosion_drop_decay");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> UNIVERSAL_ANGER = getRule("universal_anger");

    /**
     * @since 1.21.11
     */
    public static final GameRule<Boolean> WATER_SOURCE_CONVERSION = getRule("water_source_conversion");
    // End generate - GameRules

    @SuppressWarnings("unchecked")
    private static <T> GameRule<T> getRule(@KeyPattern.Value String key) {
        return (GameRule<T>) Registry.GAME_RULE.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    private GameRules() {
    }
}
