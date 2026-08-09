package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an entity stops riding another entity.
 *
 * @since 1.20.4
 */
public class EntityDismountEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Entity dismounted;
    private final boolean isCancellable;

    private boolean cancelled;

    @ApiStatus.Internal
    public EntityDismountEvent(@NotNull Entity entity, @NotNull Entity dismounted) {
        this(entity, dismounted, true);
    }

    @ApiStatus.Internal
    public EntityDismountEvent(@NotNull Entity entity, @NotNull Entity dismounted, boolean isCancellable) {
        super(entity);
        this.dismounted = dismounted;
        this.isCancellable = isCancellable;
    }

    /**
     * Gets the entity which will no longer be ridden.
     *
     * @return dismounted entity
     * @since 1.20.4
     */
    @NotNull
    public Entity getDismounted() {
        return this.dismounted;
    }

    /**
     * @since 1.20.4
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.20.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        if (cancel && !this.isCancellable) {
            return;
        }
        this.cancelled = cancel;
    }

    /**
     * @since 1.20.4
     */
    public boolean isCancellable() {
        return this.isCancellable;
    }

    /**
     * @since 1.20.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.20.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
