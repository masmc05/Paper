package org.bukkit.entity;

import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a vehicle entity.
 *
 * @since 1.0.0
 */
public interface Vehicle extends Entity {

    /**
     * Gets the vehicle's velocity.
     *
     * @return velocity vector
     * @since 1.0.0
     */
    @Override
    @NotNull
    public Vector getVelocity();

    /**
     * Sets the vehicle's velocity in meters per tick.
     *
     * @param vel velocity vector
     * @since 1.0.0
     */
    @Override
    public void setVelocity(@NotNull Vector vel);
}
