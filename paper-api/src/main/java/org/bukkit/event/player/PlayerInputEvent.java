package org.bukkit.event.player;

import org.bukkit.Input;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a player sends updated input to the server.
 *
 * @see Player#getCurrentInput()
 * @since 1.21.3
 */
public class PlayerInputEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Input input;

    @ApiStatus.Internal
    public PlayerInputEvent(@NotNull final Player player, @NotNull final Input input) {
        super(player);
        this.input = input;
    }

    /**
     * Gets the new input received from this player.
     *
     * @return the new input
     * @since 1.21.3
     */
    @NotNull
    public Input getInput() {
        return this.input;
    }

    /**
     * @since 1.21.3
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.21.3
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
