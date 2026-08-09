package com.destroystokyo.paper.event.entity;

import org.bukkit.entity.AreaEffectCloud;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Fired when an EnderDragon spawns an AreaEffectCloud by shooting flames
 *
 * @since 1.13
 */
@NullMarked
public class EnderDragonFlameEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final AreaEffectCloud areaEffectCloud;
    private boolean cancelled;

    @ApiStatus.Internal
    public EnderDragonFlameEvent(final EnderDragon enderDragon, final AreaEffectCloud areaEffectCloud) {
        super(enderDragon);
        this.areaEffectCloud = areaEffectCloud;
    }

    /**
     * The enderdragon involved in this event
     *
     * @since 1.13
     */
    @Override
    public EnderDragon getEntity() {
        return (EnderDragon) super.getEntity();
    }

    /**
     * @return The area effect cloud spawned in this collision
     * @since 1.13
     */
    public AreaEffectCloud getAreaEffectCloud() {
        return this.areaEffectCloud;
    }

    /**
     * @since 1.13
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.13
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.13
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.13
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
