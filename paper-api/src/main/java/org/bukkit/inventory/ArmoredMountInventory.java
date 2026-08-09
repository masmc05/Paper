package org.bukkit.inventory;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * @since 1.21.11
 */
@NullMarked
public interface ArmoredMountInventory extends MountInventory {

    /**
     * Gets the item in the mount's armor slot.
     *
     * @return the armor item
     * @since 1.21.11
     */
    @Nullable ItemStack getArmor();

    /**
     * Sets the item in the mount's armor slot.
     *
     * @param stack the new item
     * @since 1.21.11
     */
    void setArmor(@Nullable ItemStack stack);
}
