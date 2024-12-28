package com.destroystokyo.paper.event.entity;

import org.bukkit.entity.Witch;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * @since 1.12.2
 */
@NullMarked
public class WitchReadyPotionEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private @Nullable ItemStack potion;
    private boolean cancelled;

    @ApiStatus.Internal
    public WitchReadyPotionEvent(final Witch witch, final @Nullable ItemStack potion) {
        super(witch);
        this.potion = potion;
    }

    /**
     * @since 1.12.2
     */
    @Override
    public Witch getEntity() {
        return (Witch) super.getEntity();
    }

    /**
     * @return the potion the witch is readying to use
     * @since 1.12.2
     */
    public @Nullable ItemStack getPotion() {
        return this.potion;
    }

    /**
     * Sets the potion the which is going to hold and use
     *
     * @param potion The potion
     * @since 1.12.2
     */
    public void setPotion(final @Nullable ItemStack potion) {
        this.potion = potion != null ? potion.clone() : null;
    }

    /**
     * @since 1.12.2
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.12.2
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.12.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.12.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
