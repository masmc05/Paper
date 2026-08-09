package io.papermc.paper.connection;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import net.kyori.adventure.text.Component;
import org.jspecify.annotations.Nullable;

/**
 * @since 1.21.7
 */
public interface PlayerConnection {

    /**
     * Disconnects the player connection.
     * <p>
     * Note that calling this during connection related events may cause undefined behavior.
     *
     * @param component disconnect reason
     * @since 1.21.7
     */
    void disconnect(Component component);

    /**
     * {@return whether this connection is currently open and active}
     *
     * @since 1.21.10
     */
    boolean isConnected();

    /**
     * Gets if this connection originated from a transferred connection.
     * <p>
     * Do note that this is sent and stored on the client.
     *
     * @return is transferred
     * @since 1.21.7
     */
    boolean isTransferred();

    /**
     * Gets the raw remote address of the connection. This may be a proxy address
     * or a Unix domain socket address, depending on how the channel was established.
     *
     * @return the remote {@link SocketAddress} of the channel
     * @since 1.21.7
     */
    SocketAddress getAddress();

    /**
     * Gets the real client address of the player. If the connection is behind a proxy,
     * this will be the actual player’s IP address extracted from the proxy handshake.
     *
     * @return the client {@link InetSocketAddress}
     * @since 1.21.7
     */
    InetSocketAddress getClientAddress();

    /**
     * Returns the virtual host the client is connected to.
     *
     * <p>The virtual host refers to the hostname/port the client used to
     * connect to the server.</p>
     *
     * @return The client's virtual host, or {@code null} if unknown
     * @since 1.21.7
     */
    @Nullable InetSocketAddress getVirtualHost();

    /**
     * Gets the socket address of this player's proxy
     *
     * @return the player's proxy address, null if the server doesn't have Proxy Protocol enabled, or the player didn't connect to an HAProxy instance
     * @since 1.21.7
     */
    @Nullable InetSocketAddress getHAProxyAddress();
}
