package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Range;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.11
 */
@NullMarked
@ApiStatus.NonExtendable
public interface AttackRange {

    /**
     * Returns a new builder for creating an Attack Range.
     *
     * @return a builder instance
     * @since 1.21.11
     */
    @Contract(value = "-> new", pure = true)
    static Builder attackRange() {
        return ItemComponentTypesBridge.bridge().attackRange();
    }

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Range(from = 0, to = 64) float minReach();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Range(from = 0, to = 64) float maxReach();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Range(from = 0, to = 64) float minCreativeReach();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Range(from = 0, to = 64) float maxCreativeReach();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Range(from = 0, to = 1) float hitboxMargin();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Range(from = 0, to = 2) float mobFactor();

    /**
     * Builder for {@link AttackRange}.
     *
     * @since 1.21.11
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<AttackRange> {

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder minReach(@Range(from = 0, to = 64) float minReach);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder maxReach(@Range(from = 0, to = 64) float maxReach);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder minCreativeReach(@Range(from = 0, to = 64) float minCreativeReach);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder maxCreativeReach(@Range(from = 0, to = 64) float maxCreativeReach);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder hitboxMargin(@Range(from = 0, to = 1) float hitboxMargin);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder mobFactor(@Range(from = 0, to = 2) float mobFactor);
    }
}
