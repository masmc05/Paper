package com.destroystokyo.paper.event.player;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a player clicks a recipe in the recipe book
 *
 * @since 1.15.2
 */
@NullMarked
public class PlayerRecipeBookClickEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private NamespacedKey recipe;
    private boolean makeAll;

    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerRecipeBookClickEvent(final Player player, final NamespacedKey recipe, final boolean makeAll) {
        super(player);
        this.recipe = recipe;
        this.makeAll = makeAll;
    }

    /**
     * Gets the namespaced key of the recipe that was clicked by the player
     *
     * @return The namespaced key of the recipe
     * @since 1.15.2
     */
    public NamespacedKey getRecipe() {
        return this.recipe;
    }

    /**
     * Changes what recipe is requested. This sets the requested recipe to the recipe with the given key
     *
     * @param recipe The key of the recipe that should be requested
     * @since 1.15.2
     */
    public void setRecipe(final NamespacedKey recipe) {
        this.recipe = recipe;
    }

    /**
     * Gets a boolean which indicates whether the player requested to make the maximum amount of results. This is
     * {@code true} if shift is pressed while the recipe is clicked in the recipe book
     *
     * @return {@code true} if shift is pressed while the recipe is clicked
     * @since 1.15.2
     */
    public boolean isMakeAll() {
        return this.makeAll;
    }

    /**
     * Sets whether the maximum amount of results should be made. If this is {@code true}, the request is handled as if
     * the player had pressed shift while clicking on the recipe
     *
     * @param makeAll {@code true} if the request should attempt to make the maximum amount of results
     * @since 1.15.2
     */
    public void setMakeAll(final boolean makeAll) {
        this.makeAll = makeAll;
    }

    /**
     * @since 1.15.2
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.15.2
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.15.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.15.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
