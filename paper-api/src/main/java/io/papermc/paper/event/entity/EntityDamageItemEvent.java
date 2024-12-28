package io.papermc.paper.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when an item on or used by an entity takes durability damage as a result of being hit/used.
 * <p>
 * NOTE: default vanilla behaviour dictates that armor/tools picked up by
 * mobs do not take damage (except via Thorns).
 *
 * @since 1.17.1
 */
@NullMarked
public class EntityDamageItemEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ItemStack item;
    private int damage;

    private boolean cancelled;

    @ApiStatus.Internal
    public EntityDamageItemEvent(final Entity entity, final ItemStack item, final int damage) {
        super(entity);
        this.item = item;
        this.damage = damage;
    }

    /**
     * Gets the item being damaged.
     *
     * @return the item
     * @since 1.17.1
     */
    public ItemStack getItem() {
        return this.item;
    }

    /**
     * Gets the amount of durability damage this item will be taking.
     *
     * @return durability change
     * @since 1.17.1
     */
    public int getDamage() {
        return this.damage;
    }

    /**
     * Sets the amount of durability damage this item will be taking.
     *
     * @param damage the damage amount to cause
     * @since 1.17.1
     */
    public void setDamage(final int damage) {
        this.damage = damage;
    }

    /**
     * @since 1.17.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.17.1
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.17.1
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.17.1
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
