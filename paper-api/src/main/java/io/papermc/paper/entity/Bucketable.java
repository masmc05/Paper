package io.papermc.paper.entity;

import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.jspecify.annotations.NullMarked;

/**
 * Represents an entity that can be bucketed.
 *
 * @since 1.18.1
 */
@NullMarked
public interface Bucketable extends Entity {

    /**
     * Gets if this entity originated from a bucket.
     *
     * @return originated from bucket
     * @since 1.18.1
     */
    boolean isFromBucket();

    /**
     * Sets if this entity originated from a bucket.
     *
     * @param fromBucket is from a bucket
     * @since 1.18.1
     */
    void setFromBucket(boolean fromBucket);

    /**
     * Gets the base itemstack of this entity in a bucket form.
     *
     * @return bucket form
     * @since 1.18.1
     */
    ItemStack getBaseBucketItem();

    /**
     * Gets the sound that is played when this entity
     * is picked up in a bucket.
     * @return bucket pickup sound
     * @since 1.18.1
     */
    Sound getPickupSound();
}
