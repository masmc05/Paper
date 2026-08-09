package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called after a player registers or unregisters a new plugin
 * channel.
 *
 * @since 1.3.1
 */
public abstract class PlayerChannelEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final String channel;

    protected PlayerChannelEvent(@NotNull final Player player, @NotNull final String channel) {
        super(player);
        this.channel = channel;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
