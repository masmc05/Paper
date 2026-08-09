package org.bukkit.event.vehicle;

import org.bukkit.entity.Vehicle;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Raised when a vehicle collides.
 *
 * @since 1.0.0
 */
public abstract class VehicleCollisionEvent extends VehicleEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    protected VehicleCollisionEvent(@NotNull final Vehicle vehicle) {
        super(vehicle);
    }

    /**
     * @since 1.18.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.18.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
