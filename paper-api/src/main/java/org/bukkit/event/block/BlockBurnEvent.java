package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a block is destroyed as a result of being burnt by fire.
 * <p>
 * If this event is cancelled, the block will not be destroyed as a
 * result of being burnt by fire.
 *
 * @since 1.0.0
 */
public class BlockBurnEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Block ignitingBlock;
    private boolean cancelled;

    @Deprecated(since = "1.11.2", forRemoval = true)
    @ApiStatus.Internal
    public BlockBurnEvent(@NotNull final Block block) {
        this(block, null);
    }

    @ApiStatus.Internal
    public BlockBurnEvent(@NotNull final Block block, @Nullable final Block ignitingBlock) {
        super(block);
        this.ignitingBlock = ignitingBlock;
    }

    /**
     * Gets the block which ignited this block.
     *
     * @return The Block that ignited and burned this block, or {@code null} if no
     * source block exists
     * @since 1.11.2
     */
    @Nullable
    public Block getIgnitingBlock() {
        return this.ignitingBlock;
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
