package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an entity stops riding another entity.
 *
 * @since 1.20.4
 */
public class EntityDismountEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Entity dismounted;
    private final boolean isCancellable; // Paper

    public EntityDismountEvent(@NotNull Entity what, @NotNull Entity dismounted) {
        // Paper start
        this(what, dismounted, true);
    }

    public EntityDismountEvent(@NotNull Entity what, @NotNull Entity dismounted, boolean isCancellable) {
        // Paper end
        super(what);
        this.dismounted = dismounted;
        this.isCancellable = isCancellable; // Paper
    }

    /**
     * Gets the entity which will no longer be ridden.
     *
     * @return dismounted entity
     * @since 1.20.4
     */
    @NotNull
    public Entity getDismounted() {
        return dismounted;
    }

    /**
     * @since 1.20.4
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.20.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        // Paper start
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
        // Paper end
    }

    /**
     * @since 1.20.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.20.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
