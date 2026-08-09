package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import org.bukkit.Color;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * Represents the tint of the decorations on the Filled Map item.
 * @see io.papermc.paper.datacomponent.DataComponentTypes#MAP_COLOR
 * @since 1.21.3
 */
@NullMarked
@ApiStatus.NonExtendable
public interface MapItemColor {

    /**
     * @since 1.21.3
     */
    @Contract(value = "-> new", pure = true)
    static MapItemColor.Builder mapItemColor() {
        return ItemComponentTypesBridge.bridge().mapItemColor();
    }

    /**
     * The tint to apply.
     *
     * @return color
     * @since 1.21.3
     */
    Color color();

    /**
     * @since 1.21.3
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<MapItemColor> {

        /**
         * Sets the tint color of this map.
         *
         * @param color tint color
         * @return the builder for chaining
         * @see #color()
         * @since 1.21.3
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder color(Color color);
    }
}
