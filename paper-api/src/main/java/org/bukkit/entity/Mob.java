package org.bukkit.entity;

import com.destroystokyo.paper.entity.Pathfinder;
import io.papermc.paper.entity.Leashable;
import net.kyori.adventure.util.TriState;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.loot.LootTable;
import org.bukkit.loot.Lootable;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Represents a Mob. Mobs are living entities with simple AI.
 *
 * @since 1.13
 */
@NullMarked
public interface Mob extends LivingEntity, Lootable, Leashable {

    /**
     * Check if a mob should be despawned when the world is set to peaceful difficulty.
     *
     * @return True if the entity should be removed in peaceful
     * @since 1.21.8
     */
    boolean shouldDespawnInPeaceful();

    /**
     * Sets if the entity should be despawned when the game is set to peaceful difficulty.
     * <ul>
     *     <li>{@link TriState#NOT_SET} – Use the default behavior for the entity</li>
     *     <li>{@link TriState#TRUE} – The entity will be removed in Peaceful difficulty</li>
     *     <li>{@link TriState#FALSE} – The entity will not automatically be removed in Peaceful difficulty</li>
     * </ul>
     *
     * @param state a TriState representing the state of the override
     * @deprecated the client no longer allow to change that setting and will not render the entity
     * @since 1.21.8
     */
    @Deprecated(since = "26.2")
    void setDespawnInPeacefulOverride(TriState state);

    /**
     * Gets the current override value for whether this entity should despawn in peaceful difficulty.
     * <ul>
     *     <li>{@link TriState#NOT_SET} – Use the default behavior for the entity</li>
     *     <li>{@link TriState#TRUE} – The entity will be removed in Peaceful difficulty</li>
     *     <li>{@link TriState#FALSE} – The entity will not automatically be removed in Peaceful difficulty</li>
     * </ul>
     *
     * @return a TriState representing the state of the override
     * @see Mob#setDespawnInPeacefulOverride(TriState)
     * @deprecated the client no longer allow to change that setting and will not render the entity
     * @since 1.21.8
     */
    @Deprecated(since = "26.2")
    TriState getDespawnInPeacefulOverride();

    /**
     * @since 1.17.1
     */
    @Override
    EntityEquipment getEquipment();

    /**
     * Enables access to control the pathing of an Entity
     * @return Pathfinding Manager for this entity
     * @since 1.13.1
     */
    Pathfinder getPathfinder();

    /**
     * Check if this mob is exposed to daylight
     *
     * @return True if mob is exposed to daylight
     * @since 1.13.1
     */
    boolean isInDaylight();

    /**
     * Instruct this Mob to look at a specific Location
     * <p>
     * Useful when implementing custom mob goals
     *
     * @param location location to look at
     * @since 1.16.5
     */
    void lookAt(Location location);

    /**
     * Instruct this Mob to look at a specific Location
     * <p>
     * Useful when implementing custom mob goals
     *
     * @param location location to look at
     * @param headRotationSpeed head rotation speed
     * @param maxHeadPitch max head pitch rotation
     * @since 1.16.5
     */
    void lookAt(Location location, float headRotationSpeed, float maxHeadPitch);

    /**
     * Instruct this Mob to look at a specific Entity
     * <p>
     * If a LivingEntity, look at eye location
     * <p>
     * Useful when implementing custom mob goals
     *
     * @param entity entity to look at
     * @since 1.16.5
     */
    void lookAt(Entity entity);

    /**
     * Instruct this Mob to look at a specific Entity
     * <p>
     * If a LivingEntity, look at eye location
     * <p>
     * Useful when implementing custom mob goals
     *
     * @param entity entity to look at
     * @param headRotationSpeed head rotation speed
     * @param maxHeadPitch max head pitch rotation
     * @since 1.16.5
     */
    void lookAt(Entity entity, float headRotationSpeed, float maxHeadPitch);

    /**
     * Instruct this Mob to look at a specific position
     * <p>
     * Useful when implementing custom mob goals
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param z z coordinate
     * @since 1.16.5
     */
    void lookAt(double x, double y, double z);

    /**
     * Instruct this Mob to look at a specific position
     * <p>
     * Useful when implementing custom mob goals
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param z z coordinate
     * @param headRotationSpeed head rotation speed
     * @param maxHeadPitch max head pitch rotation
     * @since 1.16.5
     */
    void lookAt(double x, double y, double z, float headRotationSpeed, float maxHeadPitch);

    /**
     * Gets the head rotation speed
     *
     * @return the head rotation speed
     * @since 1.16.5
     */
    int getHeadRotationSpeed();

    /**
     * Gets the max head pitch rotation
     *
     * @return the max head pitch rotation
     * @since 1.16.5
     */
    int getMaxHeadPitch();

    /**
     * Instructs this Mob to set the specified LivingEntity as its target.
     * <p>
     * Hostile creatures may attack their target, and friendly creatures may
     * follow their target.
     *
     * @param target New LivingEntity to target, or null to clear the target
     * @since 1.13
     */
    void setTarget(@Nullable LivingEntity target);

    /**
     * Gets the current target of this Mob
     *
     * @return Current target of this creature, or null if none exists
     * @since 1.13
     */
    @Nullable LivingEntity getTarget();

    /**
     * Sets whether this mob is aware of its surroundings.
     * <p>
     * Unaware mobs will still move if pushed, attacked, etc. but will not move
     * or perform any actions on their own. Unaware mobs may also have other
     * unspecified behaviours disabled, such as drowning.
     *
     * @param aware whether the mob is aware
     * @since 1.15.2
     */
    void setAware(boolean aware);

    /**
     * Gets whether this mob is aware of its surroundings.
     *
     * Unaware mobs will still move if pushed, attacked, etc. but will not move
     * or perform any actions on their own. Unaware mobs may also have other
     * unspecified behaviours disabled, such as drowning.
     *
     * @return whether the mob is aware
     * @since 1.15.2
     */
    boolean isAware();

    /**
     * Get the {@link Sound} this mob makes while ambiently existing. This sound
     * may change depending on the current state of the entity, and may also
     * return null under specific conditions. This sound is not constant.
     * For instance, villagers will make different passive noises depending
     * on whether or not they are actively trading with a player, or make no
     * ambient noise while sleeping.
     *
     * @return the ambient sound, or null if this entity is ambiently quiet
     * @since 1.19.2
     */
    @Nullable Sound getAmbientSound();

    /**
     * @since 1.20.6
     */
    @Override
    default void setLootTable(final @Nullable LootTable table, final long seed) {
        this.setLootTable(table);
        this.setSeed(seed);
    }

    /**
     * Some mobs will raise their arm(s) when aggressive:
     * <ul>
     *     <li>{@link Drowned}</li>
     *     <li>{@link Piglin}</li>
     *     <li>{@link Skeleton}</li>
     *     <li>{@link Zombie}</li>
     *     <li>{@link ZombieVillager}</li>
     *     <li>{@link Illusioner}</li>
     *     <li>{@link Vindicator}</li>
     *     <li>{@link Panda}</li>
     *     <li>{@link Pillager}</li>
     *     <li>{@link PiglinBrute}</li>
     * </ul>
     * <p>
     * Note: This doesn't always show the actual aggressive state as
     * set by {@link #setAggressive(boolean)}. {@link Panda}'s are always
     * aggressive if their combined {@link Panda.Gene} is {@link Panda.Gene#AGGRESSIVE}.
     *
     * @return whether the mob is aggressive or not
     * @since 1.20.2
     */
    boolean isAggressive();

    /**
     * Some mobs will raise their arm(s) when aggressive,
     * see {@link #isAggressive()} for full list.
     *
     * @param aggressive whether the mob should be aggressive or not
     * @see #isAggressive()
     * @since 1.20.2
     */
    void setAggressive(boolean aggressive);

    /**
     * Check if Mob is left-handed
     *
     * @return True if left-handed
     * @since 1.17.1
     */
    boolean isLeftHanded();

    /**
      * Set if Mob is left-handed
      *
      * @param leftHanded True if left-handed
      * @since 1.17.1
     */
    void setLeftHanded(boolean leftHanded);

    /**
     * Gets the amount of experience the mob will possibly drop. This value is randomized and it can give different results
     *
     * @return the amount of experience the mob will possibly drop
     * @since 1.19.4
     */
    int getPossibleExperienceReward();
}
