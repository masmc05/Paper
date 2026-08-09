package org.bukkit.block;

import java.util.List;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a captured state of a block which stores entities.
 *
 * @param <T> Entity this block can store
 * @since 1.15.2
 */
public interface EntityBlockStorage<T extends Entity> extends TileState {

    /**
     * Check if the block is completely full of entities.
     *
     * @return True if block is full
     * @since 1.15.2
     */
    boolean isFull();

    /**
     * Get the amount of entities currently in this block.
     *
     * @return Amount of entities currently in this block
     * @since 1.15.2
     */
    int getEntityCount();

    /**
     * Get the maximum amount of entities this block can hold.
     *
     * @return Maximum amount of entities this block can hold
     * @since 1.15.2
     */
    int getMaxEntities();

    /**
     * Set the maximum amount of entities this block can hold.
     *
     * @param max Maximum amount of entities this block can hold
     * @since 1.15.2
     */
    void setMaxEntities(int max);

    /**
     * Release all the entities currently stored in the block.
     *
     * @return List of all entities which were released
     * @since 1.15.2
     */
    @NotNull
    List<T> releaseEntities();

    /**
     * Add an entity to the block.
     *
     * @param entity Entity to add to the block
     * @since 1.15.2
     */
    void addEntity(@NotNull T entity);

    // Paper start - Add EntityBlockStorage clearEntities
    /**
     * Clear all currently stored entities in the block.
     *
     * @since 1.16.5
     */
    void clearEntities();
    // Paper end
}
