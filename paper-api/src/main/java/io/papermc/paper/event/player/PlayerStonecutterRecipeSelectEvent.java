package io.papermc.paper.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.StonecutterInventory;
import org.bukkit.inventory.StonecuttingRecipe;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.16.5
 */
@NullMarked
public class PlayerStonecutterRecipeSelectEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final StonecutterInventory stonecutterInventory;
    private StonecuttingRecipe stonecuttingRecipe;

    private boolean cancelled;

    /**
     * @since 1.16.5
     */
    public PlayerStonecutterRecipeSelectEvent(final Player player, final StonecutterInventory stonecutterInventory, final StonecuttingRecipe stonecuttingRecipe) {
        super(player);
        this.stonecutterInventory = stonecutterInventory;
        this.stonecuttingRecipe = stonecuttingRecipe;
    }

    /**
     * @since 1.16.5
     */
    public StonecutterInventory getStonecutterInventory() {
        return this.stonecutterInventory;
    }

    /**
     * @since 1.16.5
     */
    public StonecuttingRecipe getStonecuttingRecipe() {
        return this.stonecuttingRecipe;
    }

    /**
     * @since 1.16.5
     */
    public void setStonecuttingRecipe(final StonecuttingRecipe stonecuttingRecipe) {
        this.stonecuttingRecipe = stonecuttingRecipe;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.5
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
