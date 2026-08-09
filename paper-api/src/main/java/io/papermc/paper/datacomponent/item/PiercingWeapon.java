package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Range;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * @since 1.21.11
 */
@NullMarked
@ApiStatus.NonExtendable
public interface PiercingWeapon {

    /**
     * Returns a new builder for creating a Piercing Weapon.
     *
     * @return a builder instance
     * @since 1.21.11
     */
    static Builder piercingWeapon() {
        return ItemComponentTypesBridge.bridge().piercingWeapon();
    }

    /**
     * @since 1.21.11
     */
    boolean dealsKnockback();

    /**
     * @since 1.21.11
     */
    boolean dismounts();

    /**
     * @since 1.21.11
     */
    @Nullable Key sound();

    /**
     * @since 1.21.11
     */
    @Nullable Key hitSound();

    /**
     * Builder for {@link PiercingWeapon}.
     *
     * @since 1.21.11
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<PiercingWeapon> {

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder dealsKnockback(boolean dealsKnockback);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder dismounts(boolean dismounts);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder sound(@Nullable Key sound);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder hitSound(@Nullable Key sound);
    }
}
