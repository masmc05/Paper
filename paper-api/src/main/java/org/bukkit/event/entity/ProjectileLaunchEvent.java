package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a projectile is launched.
 *
 * @since 1.3.1
 */
public class ProjectileLaunchEvent extends EntitySpawnEvent implements Cancellable {

    private boolean cancelled;

    @ApiStatus.Internal
    public ProjectileLaunchEvent(@NotNull Entity entity) {
        super(entity);
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    @Override
    public Projectile getEntity() {
        return (Projectile) this.entity;
    }

    /**
     * @since 1.3.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.3.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
