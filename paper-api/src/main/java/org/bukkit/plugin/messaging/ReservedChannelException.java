package org.bukkit.plugin.messaging;

/**
 * Thrown if a plugin attempts to register for a reserved channel (such as
 * "REGISTER")
 *
 * @since 1.1.0
 */
@SuppressWarnings("serial")
public class ReservedChannelException extends RuntimeException {
    /**
     * @since 1.1.0
     */
    public ReservedChannelException() {
        this("Attempted to register for a reserved channel name.");
    }

    /**
     * @since 1.1.0
     */
    public ReservedChannelException(String name) {
        super("Attempted to register for a reserved channel name ('" + name + "')");
    }
}
