package org.bukkit.event.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Sent when an entity's swimming status is toggled.
 *
 * @since 1.13
 */
public class EntityToggleSwimEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final boolean isSwimming;
    private boolean cancelled;

    @ApiStatus.Internal
    public EntityToggleSwimEvent(@NotNull LivingEntity livingEntity, final boolean isSwimming) {
        super(livingEntity);
        this.isSwimming = isSwimming;
    }

    /**
     * Returns {@code true} if the entity is now swims or
     * {@code false} if the entity stops swimming.
     *
     * @return new swimming state
     * @since 1.13
     */
    public boolean isSwimming() {
        return this.isSwimming;
    }

    /**
     * @since 1.13
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @deprecated This does nothing, the server and the client doesn't work
     * correctly when the server try to bypass this. A current workaround
     * exists. If you want to cancel the switch from the ground state to the
     * swimming state you need to disable the sprinting flag for the player after
     * the cancel action.
     * @since 1.13
     */
    @Deprecated
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.13
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.13
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
