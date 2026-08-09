package org.bukkit.entity;

import org.bukkit.inventory.ItemStack;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.15.2
 */
@NullMarked
public interface ThrowableProjectile extends Projectile {

    /**
     * Gets the ItemStack the thrown projectile will display.
     *
     * @return The thrown item display ItemStack
     * @since 1.15.2
     */
    ItemStack getItem();

    /**
     * Sets the display ItemStack for the thrown projectile.
     *
     * @param item ItemStack set to be displayed
     * @since 1.15.2
     */
    void setItem(ItemStack item);
}
