package io.papermc.paper.event.server;

import org.bukkit.event.HandlerList;
import org.bukkit.event.server.ServerEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when resources such as datapacks are reloaded (e.g. /minecraft:reload)
 * <p>
 * Intended for use to re-register custom recipes, advancements that may be lost during a reload like this.
 *
 * @since 1.16.4
 */
@NullMarked
public class ServerResourcesReloadedEvent extends ServerEvent {

    public static final HandlerList HANDLER_LIST = new HandlerList();

    private final Cause cause;

    @ApiStatus.Internal
    public ServerResourcesReloadedEvent(final Cause cause) {
        this.cause = cause;
    }

    /**
     * Gets the cause of the resource reload.
     *
     * @return the reload cause
     * @since 1.16.4
     */
    public Cause getCause() {
        return this.cause;
    }

    /**
     * @since 1.16.4
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.4
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.4
     */
    public enum Cause {
        COMMAND,
        PLUGIN,
    }
}
