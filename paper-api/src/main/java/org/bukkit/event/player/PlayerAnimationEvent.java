package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a player animation event
 *
 * @since 1.0.0
 */
public class PlayerAnimationEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final PlayerAnimationType animationType;
    private boolean cancelled;

    @ApiStatus.Internal
    @Deprecated(since = "1.19", forRemoval = true)
    public PlayerAnimationEvent(@NotNull final Player player) {
        this(player, PlayerAnimationType.ARM_SWING);
    }

    @ApiStatus.Internal
    public PlayerAnimationEvent(@NotNull final Player player, @NotNull final PlayerAnimationType playerAnimationType) {
        super(player);
        this.animationType = playerAnimationType;
    }

    /**
     * Get the type of this animation event
     *
     * @return the animation type
     * @since 1.0.0
     */
    @NotNull
    public PlayerAnimationType getAnimationType() {
        return this.animationType;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
