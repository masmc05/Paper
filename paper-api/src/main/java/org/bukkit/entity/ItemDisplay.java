package org.bukkit.entity;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an item display entity.
 *
 * @since 1.19.4
 */
public interface ItemDisplay extends Display {

    /**
     * Gets the displayed item stack.
     *
     * @return the displayed item stack
     * @since 1.19.4
     */
    @NotNull // Paper
    ItemStack getItemStack();

    /**
     * Sets the displayed item stack.
     *
     * @param item the new item stack
     * @since 1.19.4
     */
    void setItemStack(@Nullable ItemStack item);

    /**
     * Gets the item display transform for this entity.
     *
     * Defaults to {@link ItemDisplayTransform#FIXED}.
     *
     * @return item display transform
     * @since 1.19.4
     */
    @NotNull
    ItemDisplayTransform getItemDisplayTransform();

    /**
     * Sets the item display transform for this entity.
     *
     * Defaults to {@link ItemDisplayTransform#FIXED}.
     *
     * @param display new display
     */
    void setItemDisplayTransform(@NotNull ItemDisplayTransform display);

    /**
     * Represents the item model transform to be applied to the displayed item.
     *
     * @since 1.19.4
     */
    public enum ItemDisplayTransform {

        NONE,
        THIRDPERSON_LEFTHAND,
        THIRDPERSON_RIGHTHAND,
        FIRSTPERSON_LEFTHAND,
        FIRSTPERSON_RIGHTHAND,
        HEAD,
        GUI,
        GROUND,
        FIXED;
    }
}
