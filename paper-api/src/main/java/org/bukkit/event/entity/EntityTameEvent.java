package org.bukkit.event.entity;

import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Thrown when a LivingEntity is tamed
 *
 * @since 1.0.0
 */
public class EntityTameEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final AnimalTamer owner;
    private boolean cancelled;

    @ApiStatus.Internal
    public EntityTameEvent(@NotNull final LivingEntity entity, @NotNull final AnimalTamer owner) {
        super(entity);
        this.owner = owner;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) this.entity;
    }

    /**
     * Gets the owning AnimalTamer
     *
     * @return the owning AnimalTamer
     * @since 1.0.0
     */
    @NotNull
    public AnimalTamer getOwner() {
        return this.owner;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
