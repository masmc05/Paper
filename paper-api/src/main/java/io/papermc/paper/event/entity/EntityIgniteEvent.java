package io.papermc.paper.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

import static io.papermc.paper.util.BoundChecker.requirePositive;

/**
 * Called when an entity is ignited often by fire or redstone power.
 *
 * @since 26.2
 */
@NullMarked
public class EntityIgniteEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private int fuseTime;
    private boolean cancelled;

    @ApiStatus.Internal
    public EntityIgniteEvent(final Entity entity, final int fuseTime) {
        super(entity);
        this.fuseTime = fuseTime;
    }

    /**
     * Gets the amount of ticks required for this entity to explode.
     *
     * @return the amount of ticks required
     * @since 26.2
     */
    public @Positive int getFuseTime() {
        return this.fuseTime;
    }

    /**
     * Sets the amount of ticks required for this entity to explode.
     *
     * @param ticks the amount of ticks required
     * @since 26.2
     */
    public void setFuseTime(final @Positive int ticks) {
        this.fuseTime = requirePositive(ticks, "ticks");
    }

    /**
     * @since 26.2
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 26.2
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 26.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 26.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
