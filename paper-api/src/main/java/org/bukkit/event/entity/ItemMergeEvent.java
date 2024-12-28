package org.bukkit.event.entity;

import org.bukkit.entity.Item;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * @since 1.8.8
 */
public class ItemMergeEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Item target;

    public ItemMergeEvent(@NotNull Item item, @NotNull Item target) {
        super(item);
        this.target = target;
    }

    /**
     * @since 1.8.8
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.8.8
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @since 1.8.8
     */
    @NotNull
    @Override
    public Item getEntity() {
        return (Item) entity;
    }

    /**
     * Gets the Item entity the main Item is being merged into.
     *
     * @return The Item being merged with
     * @since 1.8.8
     */
    @NotNull
    public Item getTarget() {
        return target;
    }

    /**
     * @since 1.8.8
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.8.8
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
