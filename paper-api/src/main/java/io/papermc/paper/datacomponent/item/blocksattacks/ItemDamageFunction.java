package io.papermc.paper.datacomponent.item.blocksattacks;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import org.checkerframework.checker.index.qual.NonNegative;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * Hold how much damage should be applied to the item from a given attack.
 *
 * @see io.papermc.paper.datacomponent.DataComponentTypes#BLOCKS_ATTACKS
 * @see io.papermc.paper.datacomponent.item.BlocksAttacks#itemDamage()
 * @since 1.21.6
 */
@NullMarked
@ApiStatus.NonExtendable
public interface ItemDamageFunction {

    /**
     * @since 1.21.6
     */
    @Contract(value = "-> new", pure = true)
    static ItemDamageFunction.Builder itemDamageFunction() {
        return BlocksAttacksBridge.bridge().blocksAttacksItemDamageFunction();
    }

    /**
     * Get the minimum amount of damage dealt by the attack before item damage is applied to the item.
     *
     * @return the threshold
     * @since 1.21.6
     */
    @NonNegative float threshold();

    /**
     * Get the constant amount of damage applied to the item, if threshold is passed.
     *
     * @return the base
     * @since 1.21.6
     */
    float base();

    /**
     * Get the fraction of the dealt damage that should be applied to the item, if threshold is passed.
     *
     * @return the factor
     * @since 1.21.6
     */
    float factor();

    /**
     * Get the damage to apply for the item.
     *
     * @apiNote this doesn't apply enchantments like {@link org.bukkit.enchantments.Enchantment#UNBREAKING}
     * @return the damage to apply
     * @since 1.21.6
     */
    int damageToApply(float damage);

    /**
     * Builder for {@link ItemDamageFunction}.
     *
     * @since 1.21.6
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<ItemDamageFunction> {

        /**
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        ItemDamageFunction.Builder threshold(final @NonNegative float threshold);

        /**
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        ItemDamageFunction.Builder base(final float base);

        /**
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        ItemDamageFunction.Builder factor(final float factor);
    }
}
