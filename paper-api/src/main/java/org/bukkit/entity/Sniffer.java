package org.bukkit.entity;

import java.util.Collection;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a Sniffer.
 *
 * @since 1.19.4
 */
public interface Sniffer extends Animals {

    /**
     * Gets the locations explored by the sniffer.
     *
     * @return a collection of locations
     * @since 1.19.4
     */
    @NotNull
    public Collection<Location> getExploredLocations();

    /**
     * Remove a location of the explored locations.
     *
     * @param location the location to remove
     * @see #getExploredLocations()
     * @since 1.19.4
     */
    public void removeExploredLocation(@NotNull Location location);

    /**
     * Add a location to the explored locations.
     * <br>
     * <b>Note:</b> the location must be in the sniffer's current world for this
     * method to have any effect.
     *
     * @param location the location to add
     * @see #getExploredLocations()
     * @since 1.19.4
     */
    public void addExploredLocation(@NotNull Location location);

    /**
     * Get the current state of the sniffer.
     *
     * @return the state of the sniffer
     * @since 1.19.4
     */
    @NotNull
    public Sniffer.State getState();

    /**
     * Set a new state for the sniffer.
     * <br>
     * This will also make the sniffer make the transition to the new state.
     *
     * @param state the new state
     */
    public void setState(@NotNull Sniffer.State state);

    /**
     * Try to get a possible location where the sniffer can dig.
     *
     * @return a {@link Location} if found or null
     * @since 1.19.4
     */
    @Nullable
    public Location findPossibleDigLocation();

    /**
     * Gets whether the sniffer can dig in the current {@link Location} below
     * its head.
     *
     * @return {@code true} if can dig or {@code false} otherwise
     * @since 1.19.4
     */
    public boolean canDig();

    /**
     * Represents the current state of the Sniffer.
     *
     * @since 1.19.4
     */
    public enum State {
        IDLING,
        FEELING_HAPPY,
        SCENTING,
        SNIFFING,
        SEARCHING,
        DIGGING,
        RISING;
    }
}
