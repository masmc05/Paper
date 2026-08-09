package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.11
 */
@NullMarked
@ApiStatus.NonExtendable
public interface SwingAnimation {

    /**
     * @since 1.21.11
     */
    @Contract(value = "-> new", pure = true)
    static Builder swingAnimation() {
        return ItemComponentTypesBridge.bridge().swingAnimation();
    }

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    Animation type();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Positive int duration();

    /**
     * @since 1.21.11
     */
    enum Animation {
        /**
         * @since 1.21.11
         */
        // Start generate - SwingAnimationType
        NONE,
        /**
         * @since 1.21.11
         */
        WHACK,
        /**
         * @since 1.21.11
         */
        STAB;
        // End generate - SwingAnimationType
    }

    /**
     * Builder for {@link SwingAnimation}.
     *
     * @since 1.21.11
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<SwingAnimation> {

        /**
         * Sets the swing animation type.
         *
         * @param type animation type
         * @return the builder for chaining
         * @see #type()
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder type(Animation type);

        /**
         * Sets the swing animation duration in ticks.
         *
         * @param duration duration (>= 0)
         * @return the builder for chaining
         * @see #duration()
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder duration(@Positive int duration);
    }
}
