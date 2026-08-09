package org.bukkit.event.entity;

import org.bukkit.entity.Sheep;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a sheep regrows its wool
 *
 * @since 1.1.0
 */
public class SheepRegrowWoolEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private boolean cancelled;

    @ApiStatus.Internal
    public SheepRegrowWoolEvent(@NotNull final Sheep sheep) {
        super(sheep);
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public Sheep getEntity() {
        return (Sheep) this.entity;
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
