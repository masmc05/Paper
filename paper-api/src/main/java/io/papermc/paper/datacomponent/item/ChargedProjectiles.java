package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import java.util.List;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Unmodifiable;
import org.jspecify.annotations.NullMarked;

/**
 * Holds all projectiles that have been loaded into a Crossbow.
 * @see io.papermc.paper.datacomponent.DataComponentTypes#CHARGED_PROJECTILES
 * @since 1.21.3
 */
@NullMarked
@ApiStatus.NonExtendable
public interface ChargedProjectiles {

    /**
     * @since 1.21.3
     */
    @Contract(value = "_ -> new", pure = true)
    static ChargedProjectiles chargedProjectiles(final List<ItemStack> projectiles) {
        return chargedProjectiles().addAll(projectiles).build();
    }

    /**
     * @since 1.21.3
     */
    @Contract(value = "-> new", pure = true)
    static ChargedProjectiles.Builder chargedProjectiles() {
        return ItemComponentTypesBridge.bridge().chargedProjectiles();
    }

    /**
     * Lists the projectiles that are currently loaded into this component.
     *
     * @return the loaded projectiles
     * @since 1.21.3
     */
    @Contract(value = "-> new", pure = true)
    @Unmodifiable List<ItemStack> projectiles();

    /**
     * Builder for {@link ChargedProjectiles}.
     *
     * @since 1.21.3
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<ChargedProjectiles> {

        /**
         * Adds a projectile to be loaded in this builder.
         *
         * @param item projectile
         * @return the builder for chaining
         * @see #projectiles()
         * @since 1.21.3
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder add(ItemStack item);

        /**
         * Adds projectiles to be loaded in this builder.
         *
         * @param items projectiles
         * @return the builder for chaining
         * @see #projectiles()
         * @since 1.21.3
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder addAll(List<ItemStack> items);
    }
}
