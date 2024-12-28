package org.bukkit.event.entity;

import org.bukkit.entity.Sheep;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a sheep regrows its wool
 *
 * @since 1.1.0
 */
public class SheepRegrowWoolEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;

    public SheepRegrowWoolEvent(@NotNull final Sheep sheep) {
        super(sheep);
        this.cancel = false;
    }

    /**
     * @since 1.1.0
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * @since 1.1.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public Sheep getEntity() {
        return (Sheep) entity;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
