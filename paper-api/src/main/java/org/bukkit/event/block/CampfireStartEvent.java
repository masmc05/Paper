package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.inventory.CampfireRecipe;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a Campfire starts to cook.
 *
 * @since 1.19.3
 */
public class CampfireStartEvent extends InventoryBlockStartEvent {

    private final CampfireRecipe campfireRecipe;
    private int cookingTime;

    @ApiStatus.Internal
    public CampfireStartEvent(@NotNull final Block campfire, @NotNull ItemStack source, @NotNull CampfireRecipe recipe) {
        super(campfire, source);
        this.cookingTime = recipe.getCookingTime();
        this.campfireRecipe = recipe;
    }

    /**
     * Gets the CampfireRecipe associated with this event.
     *
     * @return the CampfireRecipe being cooked
     * @since 1.19.3
     */
    @NotNull
    public CampfireRecipe getRecipe() {
        return this.campfireRecipe;
    }

    /**
     * Gets the total cook time associated with this event.
     *
     * @return the total cook time
     * @since 1.19.3
     */
    public int getTotalCookTime() {
        return this.cookingTime;
    }

    /**
     * Sets the total cook time for this event.
     *
     * @param cookTime the new total cook time
     * @since 1.19.3
     */
    public void setTotalCookTime(int cookTime) {
        this.cookingTime = cookTime;
    }
}
