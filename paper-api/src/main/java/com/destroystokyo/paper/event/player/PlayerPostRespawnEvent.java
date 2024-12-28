package com.destroystokyo.paper.event.player;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Fired after a player has respawned
 *
 * @since 1.13.2
 */
@NullMarked
public class PlayerPostRespawnEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Location respawnedLocation;
    private final boolean isBedSpawn;

    @ApiStatus.Internal
    public PlayerPostRespawnEvent(final Player respawnPlayer, final Location respawnedLocation, final boolean isBedSpawn) {
        super(respawnPlayer);
        this.respawnedLocation = respawnedLocation;
        this.isBedSpawn = isBedSpawn;
    }

    /**
     * Returns the location of the respawned player
     *
     * @return location of the respawned player
     * @since 1.13.2
     */
    public Location getRespawnedLocation() {
        return this.respawnedLocation.clone();
    }

    /**
     * Checks if the player respawned to their bed
     *
     * @return whether the player respawned to their bed
     * @since 1.13.2
     */
    public boolean isBedSpawn() {
        return this.isBedSpawn;
    }

    /**
     * @since 1.13.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.13.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
