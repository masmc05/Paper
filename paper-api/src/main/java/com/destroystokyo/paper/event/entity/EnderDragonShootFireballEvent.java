package com.destroystokyo.paper.event.entity;

import org.bukkit.entity.DragonFireball;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Fired when an EnderDragon shoots a fireball
 *
 * @since 1.13
 */
@NullMarked
public class EnderDragonShootFireballEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final DragonFireball fireball;
    private boolean cancelled;

    @ApiStatus.Internal
    public EnderDragonShootFireballEvent(final EnderDragon entity, final DragonFireball fireball) {
        super(entity);
        this.fireball = fireball;
    }

    /**
     * The enderdragon shooting the fireball
     *
     * @since 1.13
     */
    @Override
    public EnderDragon getEntity() {
        return (EnderDragon) super.getEntity();
    }

    /**
     * @return The fireball being shot
     * @since 1.13
     */
    public DragonFireball getFireball() {
        return this.fireball;
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
