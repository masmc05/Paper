package org.bukkit.event.player;

import org.bukkit.block.Lectern;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This event is called when a player clicks the button to take a book of a
 * Lectern. If this event is cancelled the book remains on the lectern.
 *
 * @since 1.14.1
 */
public class PlayerTakeLecternBookEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Lectern lectern;
    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerTakeLecternBookEvent(@NotNull Player player, @NotNull Lectern lectern) {
        super(player);
        this.lectern = lectern;
    }

    /**
     * Gets the lectern involved.
     *
     * @return the Lectern
     * @since 1.14.1
     */
    @NotNull
    public Lectern getLectern() {
        return this.lectern;
    }

    /**
     * Gets the current ItemStack on the lectern.
     *
     * @return the ItemStack on the Lectern
     * @since 1.14.1
     */
    @Nullable
    public ItemStack getBook() {
        return this.lectern.getInventory().getItem(0);
    }

    /**
     * @since 1.14.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.14.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.14.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.14.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
