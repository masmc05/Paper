package org.bukkit.event.player;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player discovers a new recipe in the recipe book.
 *
 * @since 1.13.1
 */
public class PlayerRecipeDiscoverEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancel = false;
    private final NamespacedKey recipe;

    public PlayerRecipeDiscoverEvent(@NotNull Player who, @NotNull NamespacedKey recipe) {
        super(who);
        this.recipe = recipe;
    }

    /**
     * Get the namespaced key of the discovered recipe.
     *
     * @return the discovered recipe
     * @since 1.13.1
     */
    @NotNull
    public NamespacedKey getRecipe() {
        return recipe;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * @since 1.13.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * @since 1.13.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.13.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
