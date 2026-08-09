package org.bukkit.inventory.meta.components;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.checkerframework.checker.index.qual.NonNegative;
import org.jetbrains.annotations.ApiStatus;

/**
 * Represents a component which can turn any item into food.
 *
 * @since 1.20.6
 */
@ApiStatus.Experimental
public interface FoodComponent extends ConfigurationSerializable {

    /**
     * Gets the food restored by this item when eaten.
     *
     * @return nutrition value
     * @since 1.20.6
     */
    @NonNegative int getNutrition();

    /**
     * Sets the food restored by this item when eaten.
     *
     * @param nutrition new nutrition value, must be non-negative
     * @since 1.20.6
     */
    void setNutrition(@NonNegative int nutrition);

    /**
     * Gets the saturation restored by this item when eaten.
     *
     * @return saturation value
     * @since 1.20.6
     */
    float getSaturation();

    /**
     * Sets the saturation restored by this item when eaten.
     *
     * @param saturation new saturation value
     * @since 1.20.6
     */
    void setSaturation(float saturation);

    /**
     * Gets if this item can be eaten even when not hungry.
     *
     * @return true if always edible
     * @since 1.20.6
     */
    boolean canAlwaysEat();

    /**
     * Sets if this item can be eaten even when not hungry.
     *
     * @param canAlwaysEat whether always edible
     * @since 1.20.6
     */
    void setCanAlwaysEat(boolean canAlwaysEat);
}
