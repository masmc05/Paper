package org.bukkit.attribute;

import com.google.common.base.Preconditions;
import io.papermc.paper.registry.RegistryKey;
import java.util.Locale;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Bukkit;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.Translatable;
import org.bukkit.entity.EntityType;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Types of attributes which may be present on an {@link Attributable}.
 *
 * @since 1.9.4
 */
public interface Attribute extends OldEnum<Attribute>, Keyed, Translatable, net.kyori.adventure.translation.Translatable { // Paper - Adventure translations

    /**
     * Maximum health of an Entity.
     *
     * @since 1.21.3
     */
    Attribute MAX_HEALTH = getAttribute("max_health");
    /**
     * Range at which an Entity will follow others.
     *
     * @since 1.21.3
     */
    Attribute FOLLOW_RANGE = getAttribute("follow_range");
    /**
     * Resistance of an Entity to knockback.
     *
     * @since 1.21.3
     */
    Attribute KNOCKBACK_RESISTANCE = getAttribute("knockback_resistance");
    /**
     * Movement speed of an Entity.
     *
     * @since 1.21.3
     */
    Attribute MOVEMENT_SPEED = getAttribute("movement_speed");
    /**
     * Flying speed of an Entity.
     *
     * @since 1.21.3
     */
    Attribute FLYING_SPEED = getAttribute("flying_speed");
    /**
     * Attack damage of an Entity.
     *
     * @since 1.21.3
     */
    Attribute ATTACK_DAMAGE = getAttribute("attack_damage");
    /**
     * Attack knockback of an Entity.
     *
     * @since 1.21.3
     */
    Attribute ATTACK_KNOCKBACK = getAttribute("attack_knockback");
    /**
     * Attack speed of an Entity.
     *
     * @since 1.21.3
     */
    Attribute ATTACK_SPEED = getAttribute("attack_speed");
    /**
     * Armor bonus of an Entity.
     *
     * @since 1.21.3
     */
    Attribute ARMOR = getAttribute("armor");
    /**
     * Armor durability bonus of an Entity.
     *
     * @since 1.21.3
     */
    Attribute ARMOR_TOUGHNESS = getAttribute("armor_toughness");
    /**
     * The fall damage multiplier of an Entity.
     *
     * @since 1.21.3
     */
    Attribute FALL_DAMAGE_MULTIPLIER = getAttribute("fall_damage_multiplier");
    /**
     * Luck bonus of an Entity.
     *
     * @since 1.21.3
     */
    Attribute LUCK = getAttribute("luck");
    /**
     * Maximum absorption of an Entity.
     *
     * @since 1.21.3
     */
    Attribute MAX_ABSORPTION = getAttribute("max_absorption");
    /**
     * The distance which an Entity can fall without damage.
     *
     * @since 1.21.3
     */
    Attribute SAFE_FALL_DISTANCE = getAttribute("safe_fall_distance");
    /**
     * The relative scale of an Entity.
     *
     * @since 1.21.3
     */
    Attribute SCALE = getAttribute("scale");
    /**
     * The height which an Entity can walk over.
     *
     * @since 1.21.3
     */
    Attribute STEP_HEIGHT = getAttribute("step_height");
    /**
     * The gravity applied to an Entity.
     *
     * @since 1.21.3
     */
    Attribute GRAVITY = getAttribute("gravity");
    /**
     * Strength with which an Entity will jump.
     *
     * @since 1.21.3
     */
    Attribute JUMP_STRENGTH = getAttribute("jump_strength");
    /**
     * How long an entity remains burning after ignition.
     *
     * @since 1.21.3
     */
    Attribute BURNING_TIME = getAttribute("burning_time");
    /**
     * The camera distance of a player to their own entity.
     *
     * @since 1.21.6
     */
    Attribute CAMERA_DISTANCE = getAttribute("camera_distance");
    /**
     * Resistance to knockback from explosions.
     *
     * @since 1.21.3
     */
    Attribute EXPLOSION_KNOCKBACK_RESISTANCE = getAttribute("explosion_knockback_resistance");
    /**
     * Movement speed through difficult terrain.
     *
     * @since 1.21.3
     */
    Attribute MOVEMENT_EFFICIENCY = getAttribute("movement_efficiency");
    /**
     * Oxygen use underwater.
     *
     * @since 1.21.3
     */
    Attribute OXYGEN_BONUS = getAttribute("oxygen_bonus");
    /**
     * Movement speed through water.
     *
     * @since 1.21.3
     */
    Attribute WATER_MOVEMENT_EFFICIENCY = getAttribute("water_movement_efficiency");
    /**
     * Range at which mobs will be tempted by items.
     *
     * @since 1.21.3
     */
    Attribute TEMPT_RANGE = getAttribute("tempt_range");
    /**
     * The block reach distance of a Player.
     *
     * @since 1.21.3
     */
    Attribute BLOCK_INTERACTION_RANGE = getAttribute("block_interaction_range");
    /**
     * The entity reach distance of a Player.
     *
     * @since 1.21.3
     */
    Attribute ENTITY_INTERACTION_RANGE = getAttribute("entity_interaction_range");
    /**
     * Block break speed of a Player.
     *
     * @since 1.21.3
     */
    Attribute BLOCK_BREAK_SPEED = getAttribute("block_break_speed");
    /**
     * Mining speed for correct tools.
     *
     * @since 1.21.3
     */
    Attribute MINING_EFFICIENCY = getAttribute("mining_efficiency");
    /**
     * Sneaking speed.
     *
     * @since 1.21.3
     */
    Attribute SNEAKING_SPEED = getAttribute("sneaking_speed");
    /**
     * Underwater mining speed.
     *
     * @since 1.21.3
     */
    Attribute SUBMERGED_MINING_SPEED = getAttribute("submerged_mining_speed");
    /**
     * Sweeping damage.
     *
     * @since 1.21.3
     */
    Attribute SWEEPING_DAMAGE_RATIO = getAttribute("sweeping_damage_ratio");
    /**
     * Chance of a zombie to spawn reinforcements.
     *
     * @since 1.21.3
     */
    Attribute SPAWN_REINFORCEMENTS = getAttribute("spawn_reinforcements");
    /**
     * Attribute controlling the range an entity transmits itself as a waypoint.
     *
     * @since 1.21.6
     */
    Attribute WAYPOINT_TRANSMIT_RANGE = getAttribute("waypoint_transmit_range");
    /**
     * Attribute controlling the range an entity receives other waypoints from.
     *
     * @since 1.21.6
     */
    Attribute WAYPOINT_RECEIVE_RANGE = getAttribute("waypoint_receive_range");
    /**
     * The air friction an entity receives when moving.
     *
     * @since 26.2
     */
    Attribute AIR_DRAG_MODIFIER = getAttribute("air_drag_modifier");
    /**
     * The ground friction an entity receives when moving.
     *
     * @since 26.2
     */
    Attribute FRICTION_MODIFIER = getAttribute("friction_modifier");
    /**
     * The received motion when landing on the ground.
     *
     * @since 26.2
     */
    Attribute BOUNCINESS = getAttribute("bounciness");
    /**
     * The minimum distance the scoreboard objective in the below_name display slot become visible for others.
     *
     * @since 26.2
     */
    Attribute BELOW_NAME_DISTANCE = getAttribute("below_name_distance");
    /**
     * The minimum distance the display name become visible for others.
     *
     * @since 26.2
     */
    Attribute NAME_TAG_DISTANCE = getAttribute("name_tag_distance");

    @NotNull
    private static Attribute getAttribute(@NotNull @KeyPattern.Value String key) {
        return Registry.ATTRIBUTE.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * {@return the sentiment of this attribute}
     *
     * @since 1.21.8
     */
    @NotNull
    Sentiment getSentiment();

    /**
     * {@return the default value of this attribute}
     * <p>
     * Default attribute values may differ between entity types, use {@link EntityType#getDefaultAttributes()} to get default attribute values for a specific entity type.
     *
     * @since 26.2
     */
    double getDefaultValue();

    /**
     * @param name of the attribute.
     * @return the attribute with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static Attribute valueOf(@NotNull String name) {
        final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
        Attribute attribute = key == null ? null : Bukkit.getUnsafe().get(RegistryKey.ATTRIBUTE, key);
        Preconditions.checkArgument(attribute != null, "No attribute found with the name %s", name);
        return attribute;
    }

    /**
     * @return an array of all known attributes.
     * @deprecated use {@link Registry#stream()}.
     */
    @NotNull
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static Attribute[] values() {
        return Registry.ATTRIBUTE.stream().toArray(Attribute[]::new);
    }

    /**
     * An attribute sentiment describes the intent behind the attribute, meaning
     * whether it is supposed to be a positive, neutral, or negative attribute.
     *
     * @since 1.21.8
     */
    enum Sentiment {
        /**
         * @since 1.21.8
         */
        // Start generate - AttributeSentiment
        POSITIVE,
        /**
         * @since 1.21.8
         */
        NEUTRAL,
        /**
         * @since 1.21.8
         */
        NEGATIVE;
        // End generate - AttributeSentiment
    }
}
