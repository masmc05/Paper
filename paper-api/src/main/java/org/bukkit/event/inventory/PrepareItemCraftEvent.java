package org.bukkit.event.inventory;

import org.bukkit.event.HandlerList;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.Recipe;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1.1.0
 */
public class PrepareItemCraftEvent extends InventoryEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final boolean repair;
    private final CraftingInventory matrix;

    @ApiStatus.Internal
    public PrepareItemCraftEvent(@NotNull CraftingInventory matrix, @NotNull InventoryView view, boolean isRepair) {
        super(view);
        this.matrix = matrix;
        this.repair = isRepair;
    }

    /**
     * Get the recipe that has been formed. If this event was triggered by a
     * tool repair, this will be a temporary shapeless recipe representing the
     * repair.
     *
     * @return The recipe being crafted.
     * @since 1.1.0
     */
    @Nullable
    public Recipe getRecipe() {
        return this.matrix.getRecipe();
    }

    /**
     * @return The crafting inventory on which the recipe was formed.
     * @since 1.1.0
     */
    @NotNull
    @Override
    public CraftingInventory getInventory() {
        return this.matrix;
    }

    /**
     * Check if this event was triggered by a tool repair operation rather
     * than a crafting recipe.
     *
     * @return {@code true} if this is a repair.
     * @since 1.1.0
     */
    public boolean isRepair() {
        return this.repair;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
