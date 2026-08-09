package org.bukkit.event.block;

import java.util.List;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.StructureGrowEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called with the block changes resulting from a player fertilizing a given
 * block with bonemeal. Will be called after the applicable
 * {@link StructureGrowEvent}.
 *
 * @since 1.13
 */
public class BlockFertilizeEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final List<BlockState> blocks;

    private boolean cancelled;

    @ApiStatus.Internal
    public BlockFertilizeEvent(@NotNull Block block, @Nullable Player player, @NotNull List<BlockState> blocks) {
        super(block);
        this.player = player;
        this.blocks = blocks;
    }

    /**
     * Gets the player that triggered the fertilization.
     *
     * @return triggering player, or {@code null} if not applicable
     * @since 1.13
     */
    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    /**
     * Gets a list of all blocks changed by the fertilization.
     *
     * @return list of all changed blocks
     * @since 1.13
     */
    @NotNull
    public List<BlockState> getBlocks() {
        return this.blocks;
    }

    /**
     * @since 1.13
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
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
        return HANDLER_LIST;
    }

    /**
     * @since 1.13
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
