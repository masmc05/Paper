package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when the moisture level of a soil block changes.
 *
 * @since 1.13.1
 */
public class MoistureChangeEvent extends BlockEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final BlockState newState;

    public MoistureChangeEvent(@NotNull final Block block, @NotNull final BlockState newState) {
        super(block);
        this.newState = newState;
        this.cancelled = false;
    }

    /**
     * Gets the new state of the affected block.
     *
     * @return new block state
     * @since 1.13.1
     */
    @NotNull
    public BlockState getNewState() {
        return newState;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.13.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.13.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
