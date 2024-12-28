package org.bukkit.event.entity;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an {@link Entity} enters a block and is stored in that block.
 * <p>
 * This event is called for bees entering a bee hive.
 * <br>
 * It is not called when a silverfish "enters" a stone block. For that listen to
 * the {@link EntityChangeBlockEvent}.
 *
 * @since 1.15.2
 */
public class EntityEnterBlockEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Block block;
    private boolean cancel;

    public EntityEnterBlockEvent(@NotNull final Entity entity, @NotNull final Block block) {
        super(entity);

        this.block = block;
    }

    /**
     * Get the block the entity will enter.
     *
     * @return the block
     * @since 1.15.2
     */
    @NotNull
    public Block getBlock() {
        return block;
    }

    /**
     * @since 1.15.2
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * @since 1.15.2
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * @since 1.15.2
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.15.2
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
