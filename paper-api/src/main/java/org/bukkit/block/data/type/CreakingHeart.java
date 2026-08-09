package org.bukkit.block.data.type;

import org.bukkit.block.data.Orientable;
import org.jetbrains.annotations.NotNull;

/**
 * 'creaking_heart_state' is the state of the block depending on the time and its position.
 * <br>
 * 'natural' is whether this is a naturally generated block.
 *
 * @since 1.21.3
 */
public interface CreakingHeart extends Orientable {

    /**
     * Gets the value of the 'active' property.
     *
     * @return the 'active' value
     * @deprecated use {@link #getCreakingHeartState()}
     */
    @Deprecated(since = "1.21.5", forRemoval = true)
    default boolean isActive() {
        return this.getCreakingHeartState() != State.UPROOTED;
    }

    /**
     * Sets the value of the 'active' property.
     *
     * @param active the new 'active' value
     * @deprecated use {@link #setCreakingHeartState(State)}
     */
    @Deprecated(since = "1.21.5", forRemoval = true)
    default void setActive(boolean active) {
        this.setCreakingHeartState(active ? State.AWAKE : State.UPROOTED);
    }

    /**
     * Gets the value of the 'creaking_heart_state' property.
     *
     * @return the 'creaking_heart_state' value
     * @since 1.21.6
     */
    @NotNull
    State getCreakingHeartState();

    /**
     * Sets the value of the 'creaking_heart_state' property.
     *
     * @param state the new 'creaking_heart_state' value
     * @since 1.21.6
     */
    void setCreakingHeartState(@NotNull State state);

    /**
     * Gets the value of the 'natural' property.
     *
     * @return the 'natural' value
     * @since 1.21.4
     */
    boolean isNatural();

    /**
     * Sets the value of the 'natural' property.
     *
     * @param natural the new 'natural' value
     * @since 1.21.4
     */
    void setNatural(boolean natural);

    /**
     * @since 1.21.6
     */
    enum State {
        /**
         * @since 1.21.6
         */
        UPROOTED,
        /**
         * @since 1.21.6
         */
        DORMANT,
        /**
         * @since 1.21.6
         */
        AWAKE
    }
}
