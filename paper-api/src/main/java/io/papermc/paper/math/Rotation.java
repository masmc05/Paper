package io.papermc.paper.math;

/**
 * Represents a rotation with specified pitch and yaw values.
 *
 * @since 1.21.4
 */
public interface Rotation {
    /**
     * Creates a new rotation with the specified yaw and pitch values.
     *
     * @param yaw   the yaw component of the rotation, measured in degrees
     * @param pitch the pitch component of the rotation, measured in degrees
     * @return a new {@code Rotation} instance with the specified yaw and pitch
     * @since 1.21.4
     */
    static Rotation rotation(float yaw, float pitch) {
        return new RotationImpl(yaw, pitch);
    }

    /**
     * Retrieves the pitch component of the rotation, measured in degrees.
     *
     * @return the pitch value in degrees
     * @since 1.21.4
     */
    float pitch();

    /**
     * Retrieves the yaw component of the rotation, measured in degrees.
     *
     * @return the yaw value in degrees
     * @since 1.21.4
     */
    float yaw();
}
