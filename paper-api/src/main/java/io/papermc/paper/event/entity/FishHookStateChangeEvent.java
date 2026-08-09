package io.papermc.paper.event.entity;

import org.bukkit.entity.FishHook;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called just before a {@link FishHook}'s {@link FishHook.HookState} is changed.
 *
 * <p>If you want to monitor a player's fishing state transition, you can use {@link PlayerFishEvent}.</p>
 *
 * @since 1.21.6
 */
@NullMarked
public final class FishHookStateChangeEvent extends EntityEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final FishHook.HookState newHookState;

    @ApiStatus.Internal
    public FishHookStateChangeEvent(final FishHook entity, final FishHook.HookState newHookState) {
        super(entity);
        this.newHookState = newHookState;
    }

    /**
     * Get the <strong>new</strong> hook state of the {@link FishHook}.
     *
     * <p>Refer to {@link FishHook#getState()} to get the current hook state.</p>
     *
     * @return the <strong>new</strong> hook state
     * @since 1.21.6
     */
    public FishHook.HookState getNewHookState() {
        return this.newHookState;
    }

    /**
     * @since 1.21.6
     */
    @Override
    public FishHook getEntity() {
        return (FishHook) super.getEntity();
    }

    /**
     * @since 1.21.6
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.21.6
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
