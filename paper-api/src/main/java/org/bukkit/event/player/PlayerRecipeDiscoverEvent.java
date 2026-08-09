package org.bukkit.event.player;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a player discovers a new recipe in the recipe book.
 *
 * @since 1.13.1
 */
@NullMarked
public class PlayerRecipeDiscoverEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final NamespacedKey recipe;
    private boolean cancelled;
    private boolean showNotification;

    @ApiStatus.Internal
    public PlayerRecipeDiscoverEvent(Player player, NamespacedKey recipe, boolean showNotification) {
        super(player);
        this.recipe = recipe;
        this.showNotification = showNotification;
    }

    /**
     * Get the namespaced key of the discovered recipe.
     *
     * @return the discovered recipe
     * @since 1.13.1
     */
    public NamespacedKey getRecipe() {
        return this.recipe;
    }

    /**
     * Get if the player should be notified (toast) of the discovery.
     *
     * @return true if the player should be notified
     * @since 1.21.8
     */
    public boolean shouldShowNotification() {
        return this.showNotification;
    }

    /**
     * Set if the player should be notified (toast) of the discovery.
     *
     * @param showNotification true if the player should be notified
     * @since 1.21.8
     */
    public void shouldShowNotification(boolean showNotification) {
        this.showNotification = showNotification;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.13.1
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
