package org.bukkit.event.vehicle;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Raised when a living entity exits a vehicle.
 *
 * @since 1.0.0
 */
public class VehicleExitEvent extends VehicleEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final LivingEntity exited;
    private final boolean isCancellable;

    private boolean cancelled;

    @ApiStatus.Internal
    public VehicleExitEvent(@NotNull final Vehicle vehicle, @NotNull final LivingEntity exited, boolean isCancellable) {
        super(vehicle);
        this.exited = exited;
        this.isCancellable = isCancellable;
    }

    @ApiStatus.Internal
    public VehicleExitEvent(@NotNull final Vehicle vehicle, @NotNull final LivingEntity exited) {
        this(vehicle, exited, true);
    }

    /**
     * Get the living entity that exited the vehicle.
     *
     * @return The entity.
     * @since 1.0.0
     */
    @NotNull
    public LivingEntity getExited() {
        return this.exited;
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
        if (cancel && !this.isCancellable) {
            return;
        }
        this.cancelled = cancel;
    }

    /**
     * @since 1.13.2
     */
    public boolean isCancellable() {
        return this.isCancellable;
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
