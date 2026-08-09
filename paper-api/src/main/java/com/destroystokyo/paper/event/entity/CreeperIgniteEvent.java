package com.destroystokyo.paper.event.entity;

import io.papermc.paper.event.entity.EntityIgniteEvent;
import org.bukkit.entity.Creeper;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a Creeper is ignited either by a
 * flint and steel, {@link Creeper#ignite()} or
 * {@link Creeper#setIgnited(boolean)}.
 *
 * @since 1.13.1
 */
@NullMarked
public class CreeperIgniteEvent extends EntityIgniteEvent {

    private boolean ignited;

    @ApiStatus.Internal
    public CreeperIgniteEvent(final Creeper creeper, final boolean ignited) {
        super(creeper, creeper.getMaxFuseTicks());
        this.ignited = ignited;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public Creeper getEntity() {
        return (Creeper) super.getEntity();
    }

    /**
     * @since 1.13.1
     */
    public boolean isIgnited() {
        return this.ignited;
    }

    /**
     * @since 1.13.1
     */
    public void setIgnited(final boolean ignited) {
        this.ignited = ignited;
    }

    /**
     * @since 26.2
     */
    @Override
    public @Positive int getFuseTime() {
        return this.getEntity().getMaxFuseTicks();
    }

    /**
     * @since 26.2
     */
    @Override
    public void setFuseTime(final @Positive int ticks) {
        this.getEntity().setMaxFuseTicks(ticks);
    }

    /**
     * @since 1.13.1
     */
    @Override
    public boolean isCancelled() {
        return super.isCancelled();
    }

    /**
     * @since 1.13.1
     */
    @Override
    public void setCancelled(final boolean cancel) {
        super.setCancelled(cancel);
    }
}
