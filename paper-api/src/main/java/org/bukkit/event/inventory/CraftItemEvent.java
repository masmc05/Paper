package org.bukkit.event.inventory;

import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.Recipe;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when the recipe of an Item is completed inside a crafting matrix.
 *
 * @since 1.1.0
 */
public class CraftItemEvent extends InventoryClickEvent {

    private final Recipe recipe;

    @ApiStatus.Internal
    public CraftItemEvent(@NotNull Recipe recipe, @NotNull InventoryView view, @NotNull SlotType type, int slot, @NotNull ClickType click, @NotNull InventoryAction action) {
        super(view, type, slot, click, action);
        this.recipe = recipe;
    }

    @ApiStatus.Internal
    public CraftItemEvent(@NotNull Recipe recipe, @NotNull InventoryView view, @NotNull SlotType type, int slot, @NotNull ClickType click, @NotNull InventoryAction action, int key) {
        super(view, type, slot, click, action, key);
        this.recipe = recipe;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    @Override
    public CraftingInventory getInventory() {
        return (CraftingInventory) super.getInventory();
    }

    /**
     * @return A copy of the current recipe on the crafting matrix.
     * @since 1.1.0
     */
    @NotNull
    public Recipe getRecipe() {
        return this.recipe;
    }
}
