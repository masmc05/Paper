package com.destroystokyo.paper.event.server;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.13.2
 */
@NullMarked
public class ServerTickStartEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final int tickNumber;

    @ApiStatus.Internal
    public ServerTickStartEvent(final int tickNumber) {
        this.tickNumber = tickNumber;
    }

    /**
     * @return What tick this is going be since start (first tick = 1)
     * @since 1.13.2
     */
    public int getTickNumber() {
        return this.tickNumber;
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
