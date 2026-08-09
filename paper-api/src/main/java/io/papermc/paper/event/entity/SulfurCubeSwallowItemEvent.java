package io.papermc.paper.event.entity;

import org.bukkit.entity.Player;
import org.bukkit.entity.SulfurCube;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a SulfurCube swallows an item.
 * <p>
 * If the ItemStack is modified, the SulfurCube will swallow the new item
 * and not remove the original one from the player's inventory.
 * <p>
 * If the event is cancelled, the SulfurCube will not swallow the item, and
 * it will not be removed from the player's inventory.
 *
 * @since 26.2
 */
@NullMarked
public class SulfurCubeSwallowItemEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final ItemStack oldItem;
    private ItemStack newItem;

    private boolean cancelled;

    @ApiStatus.Internal
    public SulfurCubeSwallowItemEvent(final SulfurCube sulfurCube, final Player player, final ItemStack oldItem, final ItemStack newItem) {
        super(sulfurCube);
        this.player = player;
        this.oldItem = oldItem;
        this.newItem = newItem;
    }

    /**
     * Gets the player interacting with the SulfurCube.
     *
     * @return the player that interacted with the SulfurCube
     * @since 26.2
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * Gets the item that is currently swallowed by the SulfurCube.
     *
     * @return an ItemStack for the item currently swallowed
     * @since 26.2
     */
    public ItemStack getOldItem() {
        return this.oldItem.clone();
    }

    /**
     * Gets the item that is being swallowed. Modifying the returned item will
     * have no effect, you must use {@link
     * #setNewItem(org.bukkit.inventory.ItemStack)} instead.
     *
     * @return an ItemStack for the item being swallowed
     * @since 26.2
     */
    public ItemStack getNewItem() {
        return this.newItem.clone();
    }

    /**
     * Set the item being swallowed.
     *
     * @param newItem the item being swallowed
     * @since 26.2
     */
    public void setNewItem(ItemStack newItem) {
        this.newItem = newItem;
    }

    /**
     * @since 26.2
     */
    @Override
    public SulfurCube getEntity() {
        return (SulfurCube) super.getEntity();
    }

    /**
     * @since 26.2
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 26.2
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 26.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 26.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
