package org.bukkit.event.player;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a visible entity is hidden from a player.
 * <br>
 * This event is only called when the entity's visibility status is actually
 * changed.
 * <br>
 * This event is called regardless of if the entity was within tracking range.
 *
 * @see Player#hideEntity(org.bukkit.plugin.Plugin, org.bukkit.entity.Entity)
 * @since 1.18.1
 */
public class PlayerHideEntityEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private final Entity entity;

    public PlayerHideEntityEvent(@NotNull Player who, @NotNull Entity entity) {
        super(who);
        this.entity = entity;
    }

    /**
     * Gets the entity which has been hidden from the player.
     *
     * @return the hidden entity
     * @since 1.18.1
     */
    @NotNull
    public Entity getEntity() {
        return entity;
    }

    /**
     * @since 1.18.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.18.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
