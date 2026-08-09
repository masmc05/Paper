package io.papermc.paper.math;

/**
 * Represents an angle that can be relative or absolute.
 *
 * @since 26.2
 */
public sealed interface Angle permits AngleImpl {

    /**
     * Creates a new absolute angle with the specified value. Absolute
     * angles are regardless of the current orientation.
     *
     * @param degrees the angle value, measured in degrees
     * @return a new {@code Angle} instance with the specified value
     * @since 26.2
     */
    static Angle absolute(final float degrees) {
        return new AngleImpl(degrees, false);
    }

    /**
     * Creates a new relative angle with the specified value. Relative
     * angles are relative to the current orientation.
     *
     * @param degrees the angle value, measured in degrees
     * @return a new {@code Angle} instance with the specified value
     * @since 26.2
     */
    static Angle relative(final float degrees) {
        return new AngleImpl(degrees, true);
    }

    /**
     * Retrieves the value of the angle, measured in degrees.
     *
     * @return the angle value in degrees
     * @since 26.2
     */
    float degrees();


    /**
     * Determines whether the angle is relative or absolute.
     *
     * @return {@code true} if the angle is relative, {@code false} if it is absolute
     * @since 26.2
     */
    boolean relative();
}
