package org.bukkit.entity;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an ominous item spawner.
 *
 * @since 1.20.6
 */
public interface OminousItemSpawner extends Entity {

    /**
     * Gets the item which will be spawned by this spawner.
     *
     * @return the item
     * @since 1.20.6
     */
    @org.jetbrains.annotations.NotNull // Paper
    ItemStack getItem();

    /**
     * Sets the item which will be spawned by this spawner.
     *
     * @param item the item
     * @since 1.20.6
     */
    void setItem(@Nullable ItemStack item);

    /**
     * Gets the ticks after which this item will be spawned.
     *
     * @return total spawn ticks
     * @since 1.20.6
     */
    long getSpawnItemAfterTicks();

    /**
     * Sets the ticks after which this item will be spawned.
     *
     * @param ticks total spawn ticks
     * @since 1.20.6
     */
    void setSpawnItemAfterTicks(long ticks);
}
