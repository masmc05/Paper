package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import io.papermc.paper.datacomponent.DataComponentType;
import java.util.Set;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.6
 */
@NullMarked
@ApiStatus.NonExtendable
public interface TooltipDisplay {

    /**
     * Returns a new builder for creating a TooltipDisplay.
     *
     * @return a builder
     * @since 1.21.6
     */
    @Contract(value = "-> new", pure = true)
    static Builder tooltipDisplay() {
        return ItemComponentTypesBridge.bridge().tooltipDisplay();
    }

    /**
     * @since 1.21.6
     */
    boolean hideTooltip();

    /**
     * @since 1.21.6
     */
    Set<DataComponentType> hiddenComponents();

    /**
     * Builder for {@link TooltipDisplay}.
     *
     * @since 1.21.6
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<TooltipDisplay> {

        /**
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder hideTooltip(boolean hide);

        /**
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder addHiddenComponents(DataComponentType... components);

        /**
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder hiddenComponents(Set<DataComponentType> components);
    }
}
