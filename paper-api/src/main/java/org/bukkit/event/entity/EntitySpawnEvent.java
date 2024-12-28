package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an entity is spawned into a world.
 * <p>
 * If an Entity Spawn event is cancelled, the entity will not spawn.
 *
 * @since 1.6.1
 */
public class EntitySpawnEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean canceled;

    public EntitySpawnEvent(@NotNull final Entity spawnee) {
        super(spawnee);
    }

    /**
     * @since 1.6.1
     */
    @Override
    public boolean isCancelled() {
        return canceled;
    }

    /**
     * @since 1.6.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        canceled = cancel;
    }

    /**
     * Gets the location at which the entity is spawning.
     *
     * @return The location at which the entity is spawning
     * @since 1.6.1
     */
    @NotNull
    public Location getLocation() {
        return getEntity().getLocation();
    }

    /**
     * @since 1.6.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.6.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
