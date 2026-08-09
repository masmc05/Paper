package io.papermc.paper.connection;

import org.bukkit.NamespacedKey;

/**
 * @since 1.21.7
 */
public interface WritablePlayerCookieConnection extends PlayerConnection {

    /**
     * Stores a cookie in this player's client.
     *
     * @param key the key identifying the cookie
     * @param value the data to store in the cookie
     * @throws IllegalStateException if a cookie cannot be stored at this time
     * @since 1.21.7
     */
    void storeCookie(NamespacedKey key, byte[] value);
}
