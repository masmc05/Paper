package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.11
 */
@NullMarked
@ApiStatus.NonExtendable
public interface UseEffects {

    /**
     * Returns a new builder for creating a UseEffects component.
     *
     * @return a builder instance.
     * @since 1.21.11
     */
    static Builder useEffects() {
        return ItemComponentTypesBridge.bridge().useEffects();
    }

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    boolean canSprint();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    boolean interactVibrations();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    float speedMultiplier();

    /**
     * Builder for {@link UseEffects}.
     *
     * @since 1.21.11
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<UseEffects> {

        /**
         * Sets whether the player can sprint while using the item.
         *
         * @param canSprint true to allow sprinting
         * @return the builder for chaining
         * @see #canSprint()
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder canSprint(boolean canSprint);

        /**
         * Sets whether using the item generates interaction vibrations.
         *
         * @param interactVibrations true to generate vibrations
         * @return the builder for chaining
         * @see #interactVibrations()
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder interactVibrations(boolean interactVibrations);

        /**
         * Sets the speed multiplier while using the item.
         *
         * @param speedMultiplier multiplier (1.0 >= value >= 0.0)
         * @return the builder for chaining
         * @see #speedMultiplier()
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder speedMultiplier(float speedMultiplier);
    }
}
