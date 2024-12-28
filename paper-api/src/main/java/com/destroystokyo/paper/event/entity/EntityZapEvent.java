package com.destroystokyo.paper.event.entity;

import java.util.Collections;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LightningStrike;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityTransformEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Fired when lightning strikes an entity
 *
 * @since 1.10.2
 */
@NullMarked
public class EntityZapEvent extends EntityTransformEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final LightningStrike bolt;
    private boolean cancelled;

    @ApiStatus.Internal
    public EntityZapEvent(final Entity entity, final LightningStrike bolt, final Entity replacementEntity) {
        super(entity, Collections.singletonList(replacementEntity), TransformReason.LIGHTNING);
        this.bolt = bolt;
    }

    /**
     * Gets the lightning bolt that is striking the entity.
     *
     * @return The lightning bolt responsible for this event
     * @since 1.10.2
     */
    public LightningStrike getBolt() {
        return this.bolt;
    }

    /**
     * Gets the entity that will replace the struck entity.
     *
     * @return The entity that will replace the struck entity
     * @since 1.10.2
     */
    public Entity getReplacementEntity() {
        return super.getTransformedEntity();
    }

    /**
     * @since 1.10.2
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.10.2
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.10.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.10.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
