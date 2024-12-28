package org.bukkit.event.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Sent when an entity's gliding status is toggled with an Elytra.
 * Examples of when this event would be called:
 * <ul>
 *     <li>Player presses the jump key while in midair and using an Elytra</li>
 *     <li>Player lands on ground while they are gliding (with an Elytra)</li>
 * </ul>
 * This can be visually estimated by the animation in which a player turns horizontal.
 *
 * @since 1.9.4
 */
public class EntityToggleGlideEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private boolean cancel = false;
    private final boolean isGliding;

    public EntityToggleGlideEvent(@NotNull LivingEntity who, final boolean isGliding) {
        super(who);
        this.isGliding = isGliding;
    }

    /**
     * @since 1.9.4
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * @since 1.9.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Returns true if the entity is now gliding or
     * false if the entity stops gliding.
     *
     * @return new gliding state
     * @since 1.9.4
     */
    public boolean isGliding() {
        return isGliding;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
