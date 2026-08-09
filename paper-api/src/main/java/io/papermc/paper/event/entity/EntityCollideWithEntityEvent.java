package io.papermc.paper.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import java.util.List;

/**
 * Fired when two entities collide with each other.
 * If cancelled, the entities won't get pushed away from each other.
 * <p>
 * Note that even if cancelled, the client may still run its own collision unless
 * disabled via player teams.
 *
 * @since 26.2
 */
public class EntityCollideWithEntityEvent extends Event implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean cancelled;
    private final List<Entity> entities;

    @ApiStatus.Internal
    public EntityCollideWithEntityEvent(@NotNull Entity entity1, @NotNull Entity entity2) {
        entities = List.of(entity1, entity2);
    }

    /**
     * Returns the entities involved in this event
     *
     * @return entities that are involved in this event
     * @since 26.2
     */
    public @NotNull List<Entity> getEntities() {
        return entities;
    }

    /**
     * @since 26.2
     */
    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 26.2
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 26.2
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 26.2
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }
}
