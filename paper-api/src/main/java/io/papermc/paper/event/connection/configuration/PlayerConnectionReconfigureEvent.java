package io.papermc.paper.event.connection.configuration;

import io.papermc.paper.connection.PlayerConfigurationConnection;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;

/**
 * Indicates that this player is being reconfigured, meaning that this connection will be held in the configuration
 * stage unless kicked out through {@link PlayerConfigurationConnection#completeReconfiguration()}
 *
 * @since 1.21.7
 */
public class PlayerConnectionReconfigureEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final PlayerConfigurationConnection connection;

    @ApiStatus.Internal
    public PlayerConnectionReconfigureEvent(final PlayerConfigurationConnection connection) {
        super(!Bukkit.isPrimaryThread());
        this.connection = connection;
    }

    /**
     * @since 1.21.7
     */
    public PlayerConfigurationConnection getConnection() {
        return this.connection;
    }

    /**
     * @since 1.21.7
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.21.7
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
