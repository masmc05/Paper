package org.bukkit.event.player;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called whenever a player captures an entity in a bucket.
 *
 * @since 1.16.5
 */
public class PlayerBucketEntityEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Entity entity;
    private final ItemStack originalBucket;
    private final ItemStack entityBucket;
    private final EquipmentSlot hand;

    public PlayerBucketEntityEvent(@NotNull Player player, @NotNull Entity entity, @NotNull ItemStack originalBucket, @NotNull ItemStack entityBucket, @NotNull EquipmentSlot hand) {
        super(player);
        this.entity = entity;
        this.originalBucket = originalBucket;
        this.entityBucket = entityBucket;
        this.hand = hand;
    }

    /**
     * Gets the {@link Entity} being put into the bucket.
     *
     * @return The {@link Entity} being put into the bucket
     * @since 1.16.5
     */
    @NotNull
    public Entity getEntity() {
        return entity;
    }

    /**
     * Gets the bucket used to capture the {@link Entity}.
     *
     * This refers to the bucket clicked with, eg {@link Material#WATER_BUCKET}.
     *
     * @return The used bucket
     * @since 1.16.5
     */
    @NotNull
    public ItemStack getOriginalBucket() {
        return originalBucket;
    }

    /**
     * Gets the bucket that the {@link Entity} will be put into.
     *
     * This refers to the bucket with the entity, eg
     * {@link Material#PUFFERFISH_BUCKET}.
     *
     * @return The bucket that the {@link Entity} will be put into
     * @since 1.16.5
     */
    @NotNull
    public ItemStack getEntityBucket() {
        return entityBucket;
    }

    /**
     * Get the hand that was used to bucket the entity.
     *
     * @return the hand
     * @since 1.19.2
     */
    @NotNull
    public EquipmentSlot getHand() {
        return hand;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.16.5
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.16.5
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
