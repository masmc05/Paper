package org.bukkit.event.entity;

import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Thrown when an entity picks an item up from the ground
 *
 * @since 1.12
 */
public class EntityPickupItemEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Item item;
    private final int remaining;

    private boolean cancelled;

    @ApiStatus.Internal
    public EntityPickupItemEvent(@NotNull final LivingEntity entity, @NotNull final Item item, final int remaining) {
        super(entity);
        this.item = item;
        this.remaining = remaining;
    }

    /**
     * @since 1.12
     */
    @NotNull
    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) this.entity;
    }

    /**
     * Gets the Item picked up by the entity.
     *
     * @return Item
     * @since 1.12
     */
    @NotNull
    public Item getItem() {
        return this.item;
    }

    /**
     * Gets the amount remaining on the ground, if any
     *
     * @return amount remaining on the ground
     * @since 1.12
     */
    public int getRemaining() {
        return this.remaining;
    }

    /**
     * @since 1.12
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.12
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.12
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.12
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
