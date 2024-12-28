package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a bell is being rung.
 *
 * @since 1.19.4
 */
public class BellRingEvent extends BlockEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final BlockFace direction;
    private final Entity entity;
    private boolean cancelled;

    public BellRingEvent(@NotNull Block theBlock, @NotNull BlockFace direction, @Nullable Entity entity) {
        super(theBlock);
        this.direction = direction;
        this.entity = entity;
    }

    /**
     * Get the direction in which the bell was rung.
     *
     * @return the direction
     * @since 1.19.4
     */
    @NotNull
    public BlockFace getDirection() {
        return direction;
    }

    /**
     * Get the {@link Entity} that rang the bell (if there was one).
     *
     * @return the entity
     * @since 1.19.4
     */
    @Nullable
    public Entity getEntity() {
        return entity;
    }

    /**
     * @since 1.19.4
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @since 1.19.4
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.19.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.19.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
