package com.destroystokyo.paper.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Turtle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Fired when a Turtle starts digging to lay eggs
 *
 * @since 1.13.1
 */
@NullMarked
public class TurtleStartDiggingEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Location location;
    private boolean cancelled;

    @ApiStatus.Internal
    public TurtleStartDiggingEvent(final Turtle turtle, final Location location) {
        super(turtle);
        this.location = location;
    }

    /**
     * The turtle digging
     *
     * @return The turtle
     * @since 1.13.1
     */
    @Override
    public Turtle getEntity() {
        return (Turtle) super.getEntity();
    }

    /**
     * Get the location where the turtle is digging
     *
     * @return Location where digging
     * @since 1.13.1
     */
    public Location getLocation() {
        return this.location.clone();
    }

    /**
     * @since 1.13.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.13.1
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
