package io.papermc.paper.datacomponent;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.3
 */
@NullMarked
@ApiStatus.NonExtendable
public interface BuildableDataComponent<C extends BuildableDataComponent<C, B>, B extends DataComponentBuilder<C>> {

    /**
     * Creates a new builder from this data component.
     *
     * @return a new builder
     * @since 1.21.3
     */
    @Contract(value = "-> new", pure = true)
    B toBuilder();
}
