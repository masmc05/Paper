package org.bukkit.event.entity;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when any Entity changes a block and a more specific event is not available.
 *
 * @since 1.1.0
 */
public class EntityChangeBlockEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Block block;
    private final BlockData to;

    private boolean cancelled;

    @ApiStatus.Internal
    public EntityChangeBlockEvent(@NotNull final Entity entity, @NotNull final Block block, @NotNull final BlockData to) {
        super(entity);
        this.block = block;
        this.to = to;
    }

    /**
     * Gets the block the entity is changing
     *
     * @return the block that is changing
     * @since 1.1.0
     */
    @NotNull
    public Block getBlock() {
        return this.block;
    }

    /**
     * Gets the Material that the block is changing into
     *
     * @return the material that the block is changing into
     * @since 1.1.0
     */
    @NotNull
    public Material getTo() {
        return this.to.getMaterial();
    }

    /**
     * Gets the data for the block that would be changed into
     *
     * @return the data for the block that would be changed into
     * @since 1.13
     */
    @NotNull
    public BlockData getBlockData() {
        return this.to.clone();
    }

    /**
     * @since 1.1.0
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.1.0
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
