package org.bukkit.event.block;

import org.bukkit.GameEvent;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a Sculk sensor receives a game event and hence might activate.
 *
 * Will be called cancelled if the block's default behavior is to ignore the
 * event.
 *
 * @since 1.17
 */
public class BlockReceiveGameEvent extends BlockEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final GameEvent event;
    private final Entity entity;
    private boolean cancelled;

    public BlockReceiveGameEvent(@NotNull GameEvent event, @NotNull Block block, @Nullable Entity entity) {
        super(block);
        this.event = event;
        this.entity = entity;
    }

    /**
     * Get the underlying event.
     *
     * @return the event
     * @since 1.17
     */
    @NotNull
    public GameEvent getEvent() {
        return event;
    }

    /**
     * Get the entity which triggered this event, if present.
     *
     * @return triggering entity or null
     * @since 1.17
     */
    @Nullable
    public Entity getEntity() {
        return entity;
    }

    /**
     * @since 1.17
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.17
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.17
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.17
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
