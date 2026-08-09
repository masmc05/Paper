package org.bukkit.inventory;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * @since 1.12
 */
@NullMarked
public interface ArmoredHorseInventory extends AbstractHorseInventory, ArmoredSaddledMountInventory {

    /**
     * @since 1.12
     */
    @Override
    @Nullable ItemStack getArmor();

    /**
     * @since 1.12
     */
    @Override
    void setArmor(@Nullable ItemStack stack);
}
