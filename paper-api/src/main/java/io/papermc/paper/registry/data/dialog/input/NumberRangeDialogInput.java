package io.papermc.paper.registry.data.dialog.input;

import net.kyori.adventure.text.Component;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Range;
import org.jspecify.annotations.Nullable;

/**
 * A number range dialog input.
 * <p>Created via {@link DialogInput#numberRange(String, int, Component, String, float, float, Float, Float)}</p>
 *
 * @since 1.21.7
 */
@ApiStatus.NonExtendable
public non-sealed interface NumberRangeDialogInput extends DialogInput {

    /**
     * The width of the input.
     *
     * @return the width
     * @since 1.21.7
     */
    @Contract(pure = true)
    @Range(from = 1, to = 1024) int width();

    /**
     * The label for the input.
     *
     * @return the label component
     * @since 1.21.7
     */
    @Contract(pure = true)
    Component label();

    /**
     * The format for the label, which can be a translation key or a format string.
     * <p>Example: {@code "%s: %s"} or {@code "options.generic_value"}</p>
     *
     * @return the label format
     * @since 1.21.7
     */
    @Contract(pure = true)
    String labelFormat();

    /**
     * The start of the range.
     *
     * @return the start value
     * @since 1.21.7
     */
    @Contract(pure = true)
    float start();

    /**
     * The end of the range.
     *
     * @return the end value
     * @since 1.21.7
     */
    @Contract(pure = true)
    float end();

    /**
     * The initial value of the input, or null if not set.
     *
     * @return the initial value, or null
     * @since 1.21.7
     */
    @Contract(pure = true)
    @Nullable Float initial();

    /**
     * The step size for the input, or null if not set.
     *
     * @return the step size, or null
     * @since 1.21.7
     */
    @Contract(pure = true)
    @Positive @Nullable Float step();

    /**
     * A builder for creating instances of {@link NumberRangeDialogInput}.
     * <p>Created via {@link DialogInput#numberRange(String, Component, float, float)}</p>
     *
     * @since 1.21.7
     */
    @ApiStatus.NonExtendable
    interface Builder {

        /**
         * Sets the width of the input.
         *
         * @param width the width
         * @return this builder
         * @since 1.21.7
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder width(@Range(from = 1, to = 1024) int width);

        /**
         * Sets the format for the label.
         * <p>Example: {@code "%s: %s"} or {@code "options.generic_value"}</p>
         *
         * @param labelFormat the label format
         * @return this builder
         * @since 1.21.7
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder labelFormat(String labelFormat);

        /**
         * Sets the initial value for the input.
         *
         * @param initial the initial value, or null if not set
         * @return this builder
         * @since 1.21.7
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder initial(@Nullable Float initial);

        /**
         * Sets the step of the range.
         *
         * @param step the step size, or null if not set
         * @return this builder
         * @since 1.21.7
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder step(@Positive @Nullable Float step);

        /**
         * Builds the instance with the configured values.
         *
         * @return a new instance
         * @since 1.21.7
         */
        @Contract(pure = true, value = "-> new")
        NumberRangeDialogInput build();
    }
}
