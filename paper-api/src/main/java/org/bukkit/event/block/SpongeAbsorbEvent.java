package org.bukkit.event.block;

import java.util.List;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a sponge absorbs water from the world.
 * <br>
 * The world will be in its previous state, and {@link #getBlocks()} will
 * represent the changes to be made to the world, if the event is not cancelled.
 * <br>
 * As this is a physics based event it may be called multiple times for "the
 * same" changes.
 *
 * @since 1.13
 */
public class SpongeAbsorbEvent extends BlockEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final List<BlockState> blocks;

    public SpongeAbsorbEvent(@NotNull Block block, @NotNull List<BlockState> waterblocks) {
        super(block);
        this.blocks = waterblocks;
    }

    /**
     * Get a list of all blocks to be removed by the sponge.
     * <br>
     * This list is mutable and contains the blocks in their removed state, i.e.
     * having a type of {@link Material#AIR}.
     *
     * @return list of the to be removed blocks.
     * @since 1.13
     */
    @NotNull
    public List<BlockState> getBlocks() {
        return blocks;
    }

    /**
     * @since 1.13
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.13
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.13
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.13
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
