package org.bukkit.plugin.messaging;

/**
 * Thrown if a Plugin Channel is too long.
 *
 * @since 1.1.0
 */
@SuppressWarnings("serial")
public class ChannelNameTooLongException extends RuntimeException {
    /**
     * @since 1.1.0
     */
    public ChannelNameTooLongException() {
        super("Attempted to send a Plugin Message to a channel that was too large. The maximum length a channel may be is " + Messenger.MAX_CHANNEL_SIZE + " chars.");
    }

    /**
     * @since 1.21.1
     */
    // Paper start
    public ChannelNameTooLongException(int length, String shortenedChannel) {
        super("Attempted to send a Plugin Message to a channel that was too large. The maximum length a channel may be is " + Messenger.MAX_CHANNEL_SIZE + " chars (attempted " + length + " - '" + shortenedChannel + ".");
        // Paper end
    }
}
