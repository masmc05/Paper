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
     * Defaults to {@link ItemDisplayTransform#NONE}.
     *
     * @return item display transform
     * @since 1.19.4
     */
    @NotNull
    ItemDisplayTransform getItemDisplayTransform();

    /**
     * Sets the item display transform for this entity.
     *
     * Defaults to {@link ItemDisplayTransform#NONE}.
     *
     * @param display new display
     * @since 1.19.4
     */
    void setItemDisplayTransform(@NotNull ItemDisplayTransform display);

    /**
     * Represents the item model transform to be applied to the displayed item.
     *
     * @since 1.19.4
     */
    public enum ItemDisplayTransform {

        /**
         * @since 1.19.4
         */
        NONE,
        /**
         * @since 1.19.4
         */
        THIRDPERSON_LEFTHAND,
        /**
         * @since 1.19.4
         */
        THIRDPERSON_RIGHTHAND,
        /**
         * @since 1.19.4
         */
        FIRSTPERSON_LEFTHAND,
        /**
         * @since 1.19.4
         */
        FIRSTPERSON_RIGHTHAND,
        /**
         * @since 1.19.4
         */
        HEAD,
        /**
         * @since 1.19.4
         */
        GUI,
        /**
         * @since 1.19.4
         */
        GROUND,
        /**
         * @since 1.19.4
         */
        FIXED;
    }
}
