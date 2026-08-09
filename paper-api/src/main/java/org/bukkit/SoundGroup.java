package org.bukkit;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a group of sounds for blocks that are played when various actions
 * happen (ie stepping, breaking, hitting, etc).
 *
 * @since 1.16.4
 */
public interface SoundGroup {

    /**
     * Get the volume these sounds are played at.
     *
     * Note that this volume does not always represent the actual volume
     * received by the client.
     *
     * @return volume
     * @since 1.16.4
     */
    public float getVolume();

    /**
     * Gets the pitch these sounds are played at.
     *
     * Note that this pitch does not always represent the actual pitch received
     * by the client.
     *
     * @return pitch
     * @since 1.16.4
     */
    public float getPitch();

    /**
     * Gets the corresponding breaking sound for this group.
     *
     * @return the break sound
     * @since 1.16.4
     */
    @NotNull
    public Sound getBreakSound();

    /**
     * Gets the corresponding step sound for this group.
     *
     * @return the step sound
     * @since 1.16.4
     */
    @NotNull
    public Sound getStepSound();

    /**
     * Gets the corresponding place sound for this group.
     *
     * @return the place sound
     * @since 1.16.4
     */
    @NotNull
    public Sound getPlaceSound();

    /**
     * Gets the corresponding hit sound for this group.
     *
     * @return the hit sound
     * @since 1.16.4
     */
    @NotNull
    public Sound getHitSound();

    /**
     * Gets the corresponding fall sound for this group.
     *
     * @return the fall sound
     * @since 1.16.4
     */
    @NotNull
    public Sound getFallSound();
}
