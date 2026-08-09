package org.bukkit.spawner;

import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.SpawnerMinecart;
import org.bukkit.inventory.ItemStack;
import org.jspecify.annotations.NullMarked;

/**
 * Represents an entity spawner. <br>
 * May be a {@link SpawnerMinecart} or a {@link CreatureSpawner}.
 *
 * @since 1.21
 */
@NullMarked
public interface Spawner extends BaseSpawner {

    /**
     * {@inheritDoc}
     * <br>
     * If set to -1, the spawn delay will be reset to a random value between
     * {@link #getMinSpawnDelay} and {@link #getMaxSpawnDelay()}.
     *
     * @param delay The delay.
     * @since 1.21
     */
    @Override
    void setDelay(int delay);

    /**
     * The minimum spawn delay amount (in ticks).
     * <br>
     * This value is used when the spawner resets its delay (for any reason).
     * It will choose a random number between {@link #getMinSpawnDelay()}
     * and {@link #getMaxSpawnDelay()} for its next {@link #getDelay()}.
     * <br>
     * Default value is 200 ticks.
     *
     * @return the minimum spawn delay amount
     * @since 1.21
     */
    int getMinSpawnDelay();

    /**
     * Set the minimum spawn delay amount (in ticks).
     *
     * @param delay the minimum spawn delay amount
     * @see #getMinSpawnDelay()
     * @since 1.21
     */
    void setMinSpawnDelay(int delay);

    /**
     * The maximum spawn delay amount (in ticks).
     * <br>
     * This value is used when the spawner resets its delay (for any reason).
     * It will choose a random number between {@link #getMinSpawnDelay()}
     * and {@link #getMaxSpawnDelay()} for its next {@link #getDelay()}.
     * <br>
     * This value <b>must</b> be greater than 0 and less than or equal to
     * {@link #getMaxSpawnDelay()}.
     * <br>
     * Default value is 800 ticks.
     *
     * @return the maximum spawn delay amount
     * @since 1.21
     */
    int getMaxSpawnDelay();

    /**
     * Set the maximum spawn delay amount (in ticks).
     * <br>
     * This value <b>must</b> be greater than 0, as well as greater than or
     * equal to {@link #getMinSpawnDelay()}
     *
     * @param delay the new maximum spawn delay amount
     * @see #getMaxSpawnDelay()
     * @since 1.21
     */
    void setMaxSpawnDelay(int delay);

    /**
     * Get how many mobs attempt to spawn.
     * <br>
     * Default value is 4.
     *
     * @return the current spawn count
     * @since 1.21
     */
    int getSpawnCount();

    /**
     * Set how many mobs attempt to spawn.
     *
     * @param spawnCount the new spawn count
     * @since 1.21
     */
    void setSpawnCount(int spawnCount);

    /**
     * Get the maximum number of similar entities that are allowed to be
     * within the spawning range of this spawner.
     * <br>
     * If more than the maximum number of entities are within range, the spawner
     * will not spawn and try again with a new {@link #getDelay()}.
     * <br>
     * Default value is 6.
     *
     * @return the maximum number of nearby, similar, entities
     * @since 1.21
     */
    int getMaxNearbyEntities();

    /**
     * Set the maximum number of similar entities that are allowed to be within
     * spawning range of this spawner.
     * <br>
     * Similar entities are entities that are of the same {@link EntityType}
     *
     * @param maxNearbyEntities the maximum number of nearby, similar, entities
     * @since 1.21
     */
    void setMaxNearbyEntities(int maxNearbyEntities);

    /**
     * Check if spawner is activated (a player is close enough)
     *
     * @return True if a player is close enough to activate it
     * @since 1.21
     */
    boolean isActivated();

    /**
     * Resets the spawn delay timer within the min/max range
     *
     * @since 1.21
     */
    void resetTimer();

    /**
     * Sets the {@link EntityType} to {@link EntityType#ITEM} and sets the data to the given
     * {@link org.bukkit.inventory.ItemStack ItemStack}.
     * <p>
     * {@link #setSpawnCount(int)} does not dictate the amount of items in the stack spawned, but rather how many
     * stacks should be spawned.
     *
     * @param itemStack The item to spawn. Must not {@link ItemStack#isEmpty() be empty}.
     * @see #setSpawnedType(EntityType)
     * @since 1.21
     */
    void setSpawnedItem(ItemStack itemStack);
}
