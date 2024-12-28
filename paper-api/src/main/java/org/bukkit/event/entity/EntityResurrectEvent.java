package org.bukkit.event.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.EquipmentSlot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when an entity dies and may have the opportunity to be resurrected.
 * Will be called in a cancelled state if the entity does not have a totem
 * equipped.
 *
 * @since 1.11
 */
public class EntityResurrectEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    //
    private boolean cancelled;

    private final EquipmentSlot hand;

    public EntityResurrectEvent(@NotNull LivingEntity what, @Nullable EquipmentSlot hand) {
        super(what);
        this.hand = hand;
    }

    @Deprecated(since = "1.19.2")
    public EntityResurrectEvent(@NotNull LivingEntity what) {
        this(what, null);
    }

    /**
     * @since 1.11
     */
    @NotNull
    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) entity;
    }

    /**
     * Get the hand in which the totem of undying was found, or null if the
     * entity did not have a totem of undying.
     *
     * @return the hand, or null
     * @since 1.19.2
     */
    @Nullable
    public EquipmentSlot getHand() {
        return hand;
    }

    /**
     * @since 1.11
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.11
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @since 1.11
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.11
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
