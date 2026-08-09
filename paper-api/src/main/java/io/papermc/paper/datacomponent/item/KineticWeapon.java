package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import net.kyori.adventure.key.Key;
import org.checkerframework.checker.index.qual.NonNegative;
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
public interface KineticWeapon {

    /**
     * Returns a new builder for creating a Kinetic Weapon.
     *
     * @return a builder instance
     * @since 1.21.11
     */
    @Contract(value = "-> new", pure = true)
    static Builder kineticWeapon() {
        return ItemComponentTypesBridge.bridge().kineticWeapon();
    }

    /**
     * Creates a {@link Condition} object.
     *
     * @since 1.21.11
     */
    @Contract(value = "_, _, _ -> new", pure = true)
    static Condition condition(final @NonNegative int maxDurationTicks, final float minSpeed, final float minRelativeSpeed) {
        return ItemComponentTypesBridge.bridge().kineticWeaponCondition(maxDurationTicks, minSpeed, minRelativeSpeed);
    }

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @NonNegative int contactCooldownTicks();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @NonNegative int delayTicks();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Nullable Condition dismountConditions();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Nullable Condition knockbackConditions();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Nullable Condition damageConditions();

    /**
     * @since 1.21.11
     */
    float forwardMovement();

    /**
     * @since 1.21.11
     */
    float damageMultiplier();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Nullable Key sound();

    /**
     * @since 1.21.11
     */
    @Contract(pure = true)
    @Nullable Key hitSound();

    /**
     * @since 1.21.11
     */
    interface Condition {

        /**
         * @since 1.21.11
         */
        @Contract(pure = true)
        @NonNegative int maxDurationTicks();

        /**
         * @since 1.21.11
         */
        @Contract(pure = true)
        float minSpeed();

        /**
         * @since 1.21.11
         */
        @Contract(pure = true)
        float minRelativeSpeed();
    }

    /**
     * Builder for {@link KineticWeapon}.
     *
     * @since 1.21.11
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<KineticWeapon> {

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder contactCooldownTicks(@NonNegative int ticks);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder delayTicks(@NonNegative int ticks);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder dismountConditions(@Nullable Condition condition);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder knockbackConditions(@Nullable Condition condition);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder damageConditions(@Nullable Condition condition);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder forwardMovement(float forwardMovement);

        /**
         * @since 1.21.11
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder damageMultiplier(float damageMultiplier);

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
