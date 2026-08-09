package org.bukkit.entity;

import org.bukkit.Location;
import org.jetbrains.annotations.Nullable;
import java.util.UUID;

/**
 * Represents a phantom.
 *
 * @since 1.13
 */
public interface Phantom extends Flying, Enemy {

    /**
     * @return The size of the phantom
     * @since 1.13
     */
    public int getSize();

    /**
     * @param size The new size of the phantom.
     * @since 1.13
     */
    public void setSize(int size);

    /**
     * Get the UUID of the entity that caused this phantom to spawn
     *
     * @return UUID
     * @since 1.13.1
     */
    @Nullable
    public UUID getSpawningEntity();

    /**
     * Check if this phantom will burn in the sunlight
     *
     * @return True if phantom will burn in sunlight
     * @since 1.16.5
     */
    public boolean shouldBurnInDay();

    /**
     * Set if this phantom should burn in the sunlight
     *
     * @param shouldBurnInDay True to burn in sunlight
     * @since 1.16.5
     */
    public void setShouldBurnInDay(boolean shouldBurnInDay);

    /**
     * Gets the location that this phantom circles around when not attacking a player
     * This will be changed after attacking a player.
     *
     * @return circling location
     * @since 1.19.2
     */
    @Nullable
    Location getAnchorLocation();

    /**
     * Sets the location that this phantom circles around when not attacking a player
     *
     * @param location circling location (world is ignored, will always use the entity's world)
     * @since 1.19.2
     */
    void setAnchorLocation(@Nullable Location location);
}
