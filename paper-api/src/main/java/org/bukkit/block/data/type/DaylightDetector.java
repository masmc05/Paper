package org.bukkit.block.data.type;

import org.bukkit.block.data.AnaloguePowerable;

/**
 * 'inverted' denotes whether this daylight detector is in the inverted mode,
 * i.e. activates in the absence of light rather than presence.
 *
 * @since 1.13
 */
public interface DaylightDetector extends AnaloguePowerable {

    /**
     * Gets the value of the 'inverted' property.
     *
     * @return the 'inverted' value
     * @since 1.13
     */
    boolean isInverted();

    /**
     * Sets the value of the 'inverted' property.
     *
     * @param inverted the new 'inverted' value
     * @since 1.13
     */
    void setInverted(boolean inverted);
}
