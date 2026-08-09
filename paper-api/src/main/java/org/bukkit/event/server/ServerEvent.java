package org.bukkit.event.server;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;

/**
 * Miscellaneous server events
 *
 * @since 1.0.0
 */
public abstract class ServerEvent extends Event {

    /**
     * @since 1.1.0
     */
    public ServerEvent() {
        super(!Bukkit.isPrimaryThread()); // Paper
    }

    /**
     * @since 1.9.4
     */
    public ServerEvent(boolean isAsync) {
        super(isAsync);
    }
}
