package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Thrown when a non-player entity is teleported from one location to another.
 * <br>
 * This may be as a result of natural causes (Enderman, Shulker), pathfinding
 * (Wolf), or commands (/teleport).
 *
 * @since 1.1.0
 */
public class EntityTeleportEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private Location from;
    private Location to;

    public EntityTeleportEvent(@NotNull Entity what, @NotNull Location from, @Nullable Location to) {
        super(what);
        this.from = from;
        this.to = to;
        this.cancel = false;
    }

    /**
     * @since 1.1.0
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * @since 1.1.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Gets the location that this entity moved from
     *
     * @return Location this entity moved from
     * @since 1.1.0
     */
    @NotNull
    public Location getFrom() {
        return from;
    }

    /**
     * Sets the location that this entity moved from
     *
     * @param from New location this entity moved from
     * @since 1.1.0
     */
    public void setFrom(@NotNull Location from) {
        this.from = from.clone();
    }

    /**
     * Gets the location that this entity moved to
     *
     * @return Location the entity moved to
     * @since 1.1.0
     */
    @Nullable
    public Location getTo() {
        return to;
    }

    /**
     * Sets the location that this entity moved to
     *
     * @param to New Location this entity moved to
     * @since 1.1.0
     */
    public void setTo(@Nullable Location to) {
        this.to = to != null ? to.clone() : null;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
