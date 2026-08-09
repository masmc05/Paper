package io.papermc.paper.text;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Denotes that this type is filterable by the client, and may be shown differently
 * depending on the player's set configuration.
 *
 * @param <T> type of value
 * @since 1.21.3
 */
@NullMarked
public interface Filtered<T> {

    /**
     * @since 1.21.3
     */
    @Contract(value = "_, _ -> new", pure = true)
    static <T> Filtered<T> of(final T raw, final @Nullable T filtered) {
        @ApiStatus.Internal
        record Instance<T>(T raw, @Nullable T filtered) implements Filtered<T> {}

        return new Instance<>(raw, filtered);
    }

    /**
     * @since 1.21.3
     */
    @Contract(pure = true)
    T raw();

    /**
     * @since 1.21.3
     */
    @Contract(pure = true)
    @Nullable
    T filtered();
}
