package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.CraftingRecipe;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when a Crafter is about to craft an item.
 *
 * @since 1.21
 */
public class CrafterCraftEvent extends BlockEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final CraftingRecipe recipe;
    private ItemStack result;
    private boolean cancelled;

    @org.jetbrains.annotations.ApiStatus.Internal // Paper - fix upstream annotation mistakes
    public CrafterCraftEvent(@NotNull Block theBlock, @NotNull CraftingRecipe recipe, @NotNull ItemStack result) {
        super(theBlock);
        this.result = result;
        this.recipe = recipe;
    }

    /**
     * Gets the result for the craft.
     *
     * @return the result for the craft
     * @since 1.21
     */
    @NotNull
    public ItemStack getResult() {
        return result.clone();
    }

    /**
     * Sets the result of the craft.
     *
     * @param result the result of the craft
     * @since 1.21
     */
    public void setResult(@NotNull ItemStack result) {
        this.result = result.clone();
    }

    /**
     * Gets the recipe that was used to craft this item.
     *
     * @return the recipe that was used to craft this item
     * @since 1.21
     */
    @NotNull
    public CraftingRecipe getRecipe() {
        return recipe;
    }

    /**
     * @since 1.21
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.21
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.21
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.21
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
