package org.bukkit.entity;

import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Warden.
 *
 * @since 1.19
 */
public interface Warden extends Monster {

    /**
     * Gets the anger level of this warden.
     *
     * Anger is an integer from 0 to 150. Once a Warden reaches 80 anger at a
     * target it will actively pursue it.
     *
     * @return anger level
     * @since 1.19.2
     */
    int getAnger();

    /**
     * Gets the anger level of this warden.
     *
     * Anger is an integer from 0 to 150. Once a Warden reaches 80 anger at a
     * target it will actively pursue it.
     *
     * @param entity target entity
     * @return anger level
     * @since 1.19
     */
    int getAnger(@NotNull Entity entity);

    /**
     * Gets the highest anger level of this warden.
     * <p>
     * Anger is an integer from 0 to 150. Once a Warden reaches 80 anger at a
     * target it will actively pursue it.
     *
     * @return highest anger level
     * @since 1.19.2
     */
    int getHighestAnger();

    /**
     * Increases the anger level of this warden.
     *
     * Anger is an integer from 0 to 150. Once a Warden reaches 80 anger at a
     * target it will actively pursue it.
     *
     * @param entity target entity
     * @param increase number to increase by
     * @see #getAnger(org.bukkit.entity.Entity)
     * @since 1.19
     */
    void increaseAnger(@NotNull Entity entity, int increase);

    /**
     * Sets the anger level of this warden.
     *
     * Anger is an integer from 0 to 150. Once a Warden reaches 80 anger at a
     * target it will actively pursue it.
     *
     * @param entity target entity
     * @param anger new anger level
     * @see #getAnger(org.bukkit.entity.Entity)
     * @since 1.19
     */
    void setAnger(@NotNull Entity entity, int anger);

    /**
     * Clears the anger level of this warden.
     *
     * @param entity target entity
     * @since 1.19.2
     */
    void clearAnger(@NotNull Entity entity);

    /**
     * Gets the {@link LivingEntity} at which this warden is most angry.
     *
     * @return The target {@link LivingEntity} or null
     * @since 1.19.2
     */
    @Nullable
    LivingEntity getEntityAngryAt();

    /**
     * Make the warden sense a disturbance in the force at the location given.
     *
     * @param location location of the disturbance
     * @since 1.19.2
     */
    void setDisturbanceLocation(@NotNull Location location);

    /**
     * Get the level of anger of this warden.
     *
     * @return The level of anger
     * @since 1.19.2
     */
    @NotNull
    AngerLevel getAngerLevel();

    /**
     * @since 1.19.2
     */
    public enum AngerLevel {

        /**
         * Anger level 0-39.
         *
         * @since 1.19.2
         */
        CALM,
        /**
         * Anger level 40-79.
         *
         * @since 1.19.2
         */
        AGITATED,
        /**
         * Anger level 80 or above.
         *
         * @since 1.19.2
         */
        ANGRY;
    }
}
