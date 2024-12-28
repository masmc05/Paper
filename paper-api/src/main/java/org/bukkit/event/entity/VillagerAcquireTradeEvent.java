package org.bukkit.event.entity;

import org.bukkit.entity.AbstractVillager;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.MerchantRecipe;
import org.jetbrains.annotations.NotNull;

/**
 * Called whenever a villager acquires a new trade.
 *
 * @since 1.9.4
 */
public class VillagerAcquireTradeEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    //
    private MerchantRecipe recipe;

    public VillagerAcquireTradeEvent(@NotNull AbstractVillager what, @NotNull MerchantRecipe recipe) {
        super(what);
        this.recipe = recipe;
    }

    /**
     * Get the recipe to be acquired.
     *
     * @return the new recipe
     * @since 1.9.4
     */
    @NotNull
    public MerchantRecipe getRecipe() {
        return recipe;
    }

    /**
     * Set the recipe to be acquired.
     *
     * @param recipe the new recipe
     * @since 1.9.4
     */
    public void setRecipe(@NotNull MerchantRecipe recipe) {
        this.recipe = recipe;
    }

    /**
     * @since 1.9.4
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @since 1.9.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    @Override
    public AbstractVillager getEntity() {
        return (AbstractVillager) super.getEntity();
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
