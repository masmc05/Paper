package org.bukkit.event.entity;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an entity interacts with an object
 *
 * @since 1.0.0
 */
public class EntityInteractEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    protected Block block;

    private boolean cancelled;

    @ApiStatus.Internal
    public EntityInteractEvent(@NotNull final Entity entity, @NotNull final Block block) {
        super(entity);
        this.block = block;
    }

    /**
     * Returns the involved block
     *
     * @return the block clicked with this item.
     * @since 1.0.0
     */
    @NotNull
    public Block getBlock() {
        return this.block;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
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
