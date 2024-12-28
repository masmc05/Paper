package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a vault in a trial chamber is about to display an item.
 *
 * @since 1.21.1
 */
@ApiStatus.Experimental
public class VaultDisplayItemEvent extends BlockEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private ItemStack displayItem;

    public VaultDisplayItemEvent(@NotNull Block theBlock, @Nullable ItemStack displayItem) {
        super(theBlock);
        this.displayItem = displayItem;
    }

    /**
     * Gets the item that will be displayed inside the vault.
     *
     * @return the item to be displayed
     * @since 1.21.1
     */
    @Nullable
    public ItemStack getDisplayItem() {
        return displayItem;
    }

    /**
     * Sets the item that will be displayed inside the vault.
     *
     * @param displayItem the item to be displayed
     * @since 1.21.1
     */
    public void setDisplayItem(@Nullable ItemStack displayItem) {
        this.displayItem = displayItem;
    }

    /**
     * @since 1.21.1
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.21.1
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @since 1.21.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.21.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
