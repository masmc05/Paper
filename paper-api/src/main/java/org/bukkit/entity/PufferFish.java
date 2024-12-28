package org.bukkit.entity;

/**
 * Represents a puffer fish.
 *
 * @since 1.13
 */
public interface PufferFish extends Fish {

    /**
     * Returns the current puff state of this fish (i.e. how inflated it is).
     *
     * @return current puff state
     * @since 1.13
     */
    int getPuffState();

    /**
     * Sets the current puff state of this fish (i.e. how inflated it is).
     *
     * @param state new puff state
     * @since 1.13
     */
    void setPuffState(int state);
}
