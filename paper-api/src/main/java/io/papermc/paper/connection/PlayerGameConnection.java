package io.papermc.paper.connection;

import org.bukkit.entity.Player;

/**
 * @since 1.21.7
 */
public interface PlayerGameConnection extends PlayerCommonConnection {

    /**
     * Bumps the player to the configuration stage.
     * <p>
     * This will, by default, cause the player to stay until their connection is released by
     * {@link PlayerConfigurationConnection#completeReconfiguration()}
     *
     * @since 1.21.7
     */
    void reenterConfiguration();

    /**
     * Gets the player that is associated with this game connection.
     *
     * @return player
     * @since 1.21.7
     */
    Player getPlayer();
}
