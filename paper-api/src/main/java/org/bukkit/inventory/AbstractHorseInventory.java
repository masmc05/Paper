package org.bukkit.inventory;

import org.bukkit.entity.AbstractHorse;
import org.jetbrains.annotations.Nullable;

/**
 * An interface to the inventory of an {@link AbstractHorse}.
 *
 * @since 1.12.2
 */
public interface AbstractHorseInventory extends SaddledMountInventory {

    /**
     * @since 1.12.2
     */
    @Override
    @Nullable ItemStack getSaddle();

    /**
     * @since 1.12.2
     */
    @Override
    void setSaddle(@Nullable ItemStack stack);
}
