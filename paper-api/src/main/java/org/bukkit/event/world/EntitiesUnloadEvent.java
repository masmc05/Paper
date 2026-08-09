package org.bukkit.event.world;

import java.util.List;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/**
 * Called when entities are unloaded.
 * <br>
 * The provided chunk may or may not be loaded.
 *
 * @since 1.17.1
 */
public class EntitiesUnloadEvent extends ChunkEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final List<Entity> entities;

    @ApiStatus.Internal
    public EntitiesUnloadEvent(@NotNull Chunk chunk, @NotNull List<Entity> entities) {
        super(chunk);
        this.entities = entities;
    }

    /**
     * Get the entities which are being unloaded.
     *
     * @return unmodifiable list of unloaded entities.
     * @since 1.17.1
     */
    @NotNull
    public @Unmodifiable List<Entity> getEntities() {
        return this.entities;
    }

    /**
     * @since 1.17.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.17.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
