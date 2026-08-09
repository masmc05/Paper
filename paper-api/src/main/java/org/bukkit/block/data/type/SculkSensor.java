package org.bukkit.block.data.type;

import org.bukkit.block.data.AnaloguePowerable;
import org.bukkit.block.data.Waterlogged;
import org.jetbrains.annotations.NotNull;

/**
 * 'sculk_sensor_phase' indicates the current operational phase of the sensor.
 *
 * @since 1.17
 */
public interface SculkSensor extends AnaloguePowerable, Waterlogged {

    /**
     * Gets the value of the 'sculk_sensor_phase' property.
     *
     * @return the 'sculk_sensor_phase' value
     * @deprecated bad name, use {@link #getSculkSensorPhase()}
     * @since 1.17
     */
    @NotNull
    @Deprecated
    default Phase getPhase() {
        return this.getSculkSensorPhase();
    }

    /**
     * Sets the value of the 'sculk_sensor_phase' property.
     *
     * @param phase the new 'sculk_sensor_phase' value
     * @deprecated bad name, use {@link #setSculkSensorPhase(Phase)}
     * @since 1.17
     */
    @Deprecated
    default void setPhase(@NotNull Phase phase) {
        this.setSculkSensorPhase(phase);
    }

    /**
     * Gets the value of the 'sculk_sensor_phase' property.
     *
     * @return the 'sculk_sensor_phase' value
     * @since 1.21.6
     */
    @NotNull
    Phase getSculkSensorPhase();

    /**
     * Sets the value of the 'sculk_sensor_phase' property.
     *
     * @param phase the new 'sculk_sensor_phase' value
     * @since 1.21.6
     */
    void setSculkSensorPhase(@NotNull Phase phase);

    /**
     * The Phase of the sensor.
     *
     * @since 1.17
     */
    public enum Phase {

        /**
         * The sensor is inactive.
         *
         * @since 1.17
         */
        INACTIVE,
        /**
         * The sensor is active.
         *
         * @since 1.17
         */
        ACTIVE,
        /**
         * The sensor is cooling down.
         *
         * @since 1.17
         */
        COOLDOWN;
    }
}
