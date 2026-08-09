package org.bukkit.event.entity;

import org.bukkit.entity.Item;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * @since 1.8.8
 */
public class ItemMergeEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Item target;

    private boolean cancelled;

    @ApiStatus.Internal
    public ItemMergeEvent(@NotNull Item item, @NotNull Item target) {
        super(item);
        this.target = target;
    }

    /**
     * @since 1.8.8
     */
    @NotNull
    @Override
    public Item getEntity() {
        return (Item) this.entity;
    }

    /**
     * Gets the Item entity the main Item is being merged into.
     *
     * @return The Item being merged with
     * @since 1.8.8
     */
    @NotNull
    public Item getTarget() {
        return this.target;
    }

    /**
     * @since 1.8.8
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.8.8
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.8.8
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.8.8
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
