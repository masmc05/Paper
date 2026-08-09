package org.bukkit.entity;

import org.jspecify.annotations.NullMarked;

/**
 * Represents an Armadillo.
 *
 * @since 1.20.6
 */
@NullMarked
public interface Armadillo extends Animals {

    /**
     * Get the current state of the armadillo.
     *
     * @return the state of the armadillo
     * @since 1.21.6
     */
    State getState();

    /**
     * Attempt to roll up if the armadillo is {@link State#IDLE}
     *
     * @since 1.21.6
     */
    void rollUp();

    /**
     * Attempt to roll out if the armadillo is not {@link State#IDLE}
     *
     * @since 1.21.6
     */
    void rollOut();

    /**
     * Represents the current state of the armadillo.
     *
     * @since 1.21.6
     */
    enum State {
        /**
         * @since 1.21.6
         */
        // Start generate - ArmadilloState
        IDLE,
        /**
         * @since 1.21.6
         */
        ROLLING,
        /**
         * @since 1.21.6
         */
        SCARED,
        /**
         * @since 1.21.6
         */
        UNROLLING;
        // End generate - ArmadilloState
    }

}
