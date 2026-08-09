package org.bukkit.event.entity;

import org.bukkit.entity.Animals;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when an entity enters love mode.
 * <br>
 * This can be cancelled but the item will still be consumed that was used to
 * make the entity enter into love mode.
 *
 * @since 1.16.1
 */
public class EntityEnterLoveModeEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final HumanEntity humanEntity;
    private int ticksInLove;

    private boolean cancelled;

    @ApiStatus.Internal
    public EntityEnterLoveModeEvent(@NotNull Animals animalInLove, @Nullable HumanEntity humanEntity, int ticksInLove) {
        super(animalInLove);
        this.humanEntity = humanEntity;
        this.ticksInLove = ticksInLove;
    }

    /**
     * Gets the animal that is entering love mode.
     *
     * @return The animal that is entering love mode
     * @since 1.16.1
     */
    @NotNull
    @Override
    public Animals getEntity() {
        return (Animals) this.entity;
    }

    /**
     * Gets the Human Entity that caused the animal to enter love mode.
     *
     * @return The Human entity that caused the animal to enter love mode, or
     * {@code null} if there wasn't one.
     * @since 1.16.1
     */
    @Nullable
    public HumanEntity getHumanEntity() {
        return this.humanEntity;
    }

    /**
     * Gets the amount of ticks that the animal will fall in love for.
     *
     * @return The amount of ticks that the animal will fall in love for
     * @since 1.16.1
     */
    public int getTicksInLove() {
        return this.ticksInLove;
    }

    /**
     * Sets the amount of ticks that the animal will fall in love for.
     *
     * @param ticksInLove The amount of ticks that the animal will fall in love
     * for
     * @since 1.16.1
     */
    public void setTicksInLove(int ticksInLove) {
        this.ticksInLove = ticksInLove;
    }

    /**
     * @since 1.16.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.16.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.16.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
