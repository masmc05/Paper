package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;
import org.jspecify.annotations.NullMarked;

/**
 * 'potent_sulfur_state' represents the environmental state of the block and whether it can form a geyser.
 *
 * @since 26.2
 */
@NullMarked
public interface PotentSulfur extends BlockData {

    /**
     * Gets the value of the 'potent_sulfur_state' property.
     *
     * @return the 'potent_sulfur_state' value
     * @since 26.2
     */
    State getPotentSulfurState();

    /**
     * Sets the value of the 'potent_sulfur_state' property.
     *
     * @param state the new 'potent_sulfur_state' value
     * @since 26.2
     */
    void setPotentSulfurState(State state);

    /**
     * The environmental state of the potent sulfur.
     *
     * @since 26.2
     */
    enum State {
        /**
         * @since 26.2
         */
        DRY,
        /**
         * @since 26.2
         */
        WET,
        /**
         * @since 26.2
         */
        DORMANT,
        /**
         * @since 26.2
         */
        ERUPTING,
        /**
         * @since 26.2
         */
        CONTINUOUS;
    }
}
