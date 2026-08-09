package org.bukkit.block.data.type;

import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Powerable;
import org.jetbrains.annotations.NotNull;

/**
 * 'mode' indicates what mode this comparator will operate in.
 *
 * @since 1.13
 */
public interface Comparator extends Directional, Powerable {

    /**
     * Gets the value of the 'mode' property.
     *
     * @return the 'mode' value
     * @since 1.13
     */
    @NotNull
    Mode getMode();

    /**
     * Sets the value of the 'mode' property.
     *
     * @param mode the new 'mode' value
     * @since 1.13
     */
    void setMode(@NotNull Mode mode);

    /**
     * The mode in which a comparator will operate in.
     *
     * @since 1.13
     */
    public enum Mode {

        /**
         * The default mode, similar to a transistor. The comparator will turn
         * off if either side input is greater than the rear input.
         *
         * @since 1.13
         */
        COMPARE,
        /**
         * Alternate subtraction mode. The output signal strength will be equal
         * to max(rear-max(left,right),0).
         *
         * @since 1.13
         */
        SUBTRACT;
    }
}
