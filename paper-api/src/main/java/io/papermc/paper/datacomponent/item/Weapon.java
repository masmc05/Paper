package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import org.checkerframework.checker.index.qual.NonNegative;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.6
 */
@NullMarked
@ApiStatus.NonExtendable
public interface Weapon {

    /**
     * Returns a new builder for creating a Weapon.
     *
     * @return a builder instance.
     * @since 1.21.6
     */
    static Builder weapon() {
        return ItemComponentTypesBridge.bridge().weapon();
    }

    /**
     * Amount of durability to remove each time the weapon is used to attack.
     *
     * @return durability
     * @since 1.21.6
     */
    @NonNegative int itemDamagePerAttack();

    /**
     * The number of seconds that blocking is disabled.
     *
     * @return seconds
     * @since 1.21.6
     */
    float disableBlockingForSeconds();

    /**
     * Builder for {@link Weapon}.
     *
     * @since 1.21.6
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<Weapon> {

        /**
         * Controls the amount of durability to remove each time the weapon is used to attack.
         *
         * @param damage durability to remove
         * @return the builder for chaining
         * @see #itemDamagePerAttack()
         * @since 1.21.6
         */
        Builder itemDamagePerAttack(@NonNegative int damage);

        /**
         * Sets the disable blocking duration (in seconds).
         *
         * @param seconds the duration in seconds.
         * @return the builder for chaining.
         * @since 1.21.6
         */
        Builder disableBlockingForSeconds(float seconds);
    }
}
