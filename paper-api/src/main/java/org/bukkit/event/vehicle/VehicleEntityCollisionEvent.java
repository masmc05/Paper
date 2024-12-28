package org.bukkit.event.vehicle;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Raised when a vehicle collides with an entity.
 *
 * @since 1.0.0
 */
public class VehicleEntityCollisionEvent extends VehicleCollisionEvent implements Cancellable {
    private final Entity entity;
    private boolean cancelled = false;
    private boolean cancelledPickup = false;
    private boolean cancelledCollision = false;

    public VehicleEntityCollisionEvent(@NotNull final Vehicle vehicle, @NotNull final Entity entity) {
        super(vehicle);
        this.entity = entity;
    }

    /**
     * @since 1.0.0
     */
    @NotNull
    public Entity getEntity() {
        return entity;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.0.0
     */
    @Deprecated(forRemoval = true) // Paper - Unused
    public boolean isPickupCancelled() {
        return cancelledPickup;
    }

    /**
     * @since 1.0.0
     */
    @Deprecated(forRemoval = true) // Paper - Unused
    public void setPickupCancelled(boolean cancel) {
        cancelledPickup = cancel;
    }

    /**
     * @since 1.0.0
     */
    @Deprecated(forRemoval = true) // Paper - Unused
    public boolean isCollisionCancelled() {
        return cancelledCollision;
    }

    /**
     * @since 1.0.0
     */
    @Deprecated(forRemoval = true) // Paper - Unused
    public void setCollisionCancelled(boolean cancel) {
        cancelledCollision = cancel;
    }
}
