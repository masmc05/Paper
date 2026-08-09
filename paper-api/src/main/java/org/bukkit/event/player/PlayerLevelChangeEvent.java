package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a players level changes
 *
 * @since 1.1.0
 */
public class PlayerLevelChangeEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final int oldLevel;
    private final int newLevel;

    @ApiStatus.Internal
    public PlayerLevelChangeEvent(@NotNull final Player player, final int oldLevel, final int newLevel) {
        super(player);
        this.oldLevel = oldLevel;
        this.newLevel = newLevel;
    }

    /**
     * Gets the old level of the player
     *
     * @return The old level of the player
     * @since 1.1.0
     */
    public int getOldLevel() {
        return this.oldLevel;
    }

    /**
     * Gets the new level of the player
     *
     * @return The new (current) level of the player
     * @since 1.1.0
     */
    public int getNewLevel() {
        return this.newLevel;
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
