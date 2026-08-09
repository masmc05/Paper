package io.papermc.paper.event.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a LivingEntity loads a crossbow with a projectile.
 *
 * @since 1.16.4
 */
@NullMarked
public class EntityLoadCrossbowEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ItemStack crossbow;
    private final EquipmentSlot hand;

    private boolean consumeItem = true;
    private boolean cancelled;

    @ApiStatus.Internal
    public EntityLoadCrossbowEvent(final LivingEntity entity, final ItemStack crossbow, final EquipmentSlot hand) {
        super(entity);
        this.crossbow = crossbow;
        this.hand = hand;
    }

    /**
     * @since 1.16.4
     */
    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) super.getEntity();
    }

    /**
     * Gets the crossbow {@link ItemStack} being loaded.
     *
     * @return the crossbow involved in this event
     * @since 1.16.4
     */
    public ItemStack getCrossbow() {
        return this.crossbow;
    }

    /**
     * Gets the hand from which the crossbow was loaded.
     *
     * @return the hand
     * @since 1.16.4
     */
    public EquipmentSlot getHand() {
        return this.hand;
    }

    /**
     * @return should the itemstack be consumed
     * @since 1.16.4
     */
    public boolean shouldConsumeItem() {
        return this.consumeItem;
    }

    /**
     * @param consume should the item be consumed
     * @since 1.16.4
     */
    public void setConsumeItem(final boolean consume) {
        this.consumeItem = consume;
    }

    /**
     * @since 1.16.4
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * Set whether to cancel the crossbow being loaded. If canceled, the
     * projectile that would be loaded into the crossbow will not be consumed.
     *
     * @since 1.16.4
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.16.4
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.4
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
