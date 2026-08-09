package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.CookingRecipe;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when an ItemStack is successfully cooked in a block.
 *
 * @since 1.14
 */
public class BlockCookEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ItemStack source;
    private ItemStack result;
    private final CookingRecipe<?> recipe;

    private boolean cancelled;

    @Deprecated(forRemoval = true)
    @ApiStatus.Internal
    public BlockCookEvent(@NotNull final Block block, @NotNull final ItemStack source, @NotNull final ItemStack result) {
        this(block, source, result, null);
    }

    @ApiStatus.Internal
    public BlockCookEvent(@NotNull final Block block, @NotNull final ItemStack source, @NotNull final ItemStack result, @Nullable CookingRecipe<?> recipe) {
        super(block);
        this.source = source;
        this.result = result;
        this.recipe = recipe;
    }

    /**
     * Gets the smelted ItemStack for this event
     *
     * @return smelting source ItemStack
     * @since 1.14
     */
    @NotNull
    public ItemStack getSource() {
        return this.source;
    }

    /**
     * Gets the resultant ItemStack for this event
     *
     * @return smelting result ItemStack
     * @since 1.14
     */
    @NotNull
    public ItemStack getResult() {
        return this.result;
    }

    /**
     * Sets the resultant ItemStack for this event
     *
     * @param result new result ItemStack
     * @since 1.14
     */
    public void setResult(@NotNull ItemStack result) {
        this.result = result;
    }

    /**
     * Gets the cooking recipe associated with this event.
     *
     * @return the recipe
     * @since 1.16.5
     */
    @Nullable
    public org.bukkit.inventory.CookingRecipe<?> getRecipe() {
        return this.recipe;
    }

    /**
     * @since 1.14
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.14
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.14
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.14
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
