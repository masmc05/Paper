package org.bukkit.event.entity;

import org.bukkit.entity.AbstractCubeMob;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a Slime splits into smaller Slimes upon death
 *
 * @since 1.0.0
 */
public class SlimeSplitEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private int count;
    private boolean cancelled;

    @ApiStatus.Internal
    public SlimeSplitEvent(@NotNull final AbstractCubeMob cubeMob, final int count) {
        super(cubeMob);
        this.count = count;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public AbstractCubeMob getEntity() {
        return (AbstractCubeMob) this.entity;
    }

    /**
     * Gets the amount of smaller slimes to spawn
     *
     * @return the amount of slimes to spawn
     * @since 1.0.0
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Sets how many smaller slimes will spawn on the split
     *
     * @param count the amount of slimes to spawn
     * @since 1.0.0
     */
    public void setCount(int count) {
        this.count = count;
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
