package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Pose;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an entity changes its pose.
 *
 * @see Entity#getPose()
 * @since 1.14
 */
public class EntityPoseChangeEvent extends EntityEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Pose pose;

    @ApiStatus.Internal
    public EntityPoseChangeEvent(@NotNull Entity entity, @NotNull Pose pose) {
        super(entity);
        this.pose = pose;
    }

    /**
     * Gets the entity's new pose.
     *
     * @return the new pose
     * @since 1.14
     */
    @NotNull
    public Pose getPose() {
        return this.pose;
    }

    /**
     * @since 1.14
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.14
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
