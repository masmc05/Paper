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
public class VaultDisplayItemEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private ItemStack displayItem;
    private boolean cancelled;

    @ApiStatus.Internal
    public VaultDisplayItemEvent(@NotNull Block vault, @Nullable ItemStack displayItem) {
        super(vault);
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
        return this.displayItem;
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
        return this.cancelled;
    }

    /**
     * @since 1.21.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.21.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.21.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
