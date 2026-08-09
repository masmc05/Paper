
package org.bukkit.event.inventory;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.InventoryView;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a player closes an inventory.
 * <p>
 * Because InventoryCloseEvent occurs within a modification of the Inventory,
 * not all Inventory related methods are safe to use.
 * <p>
 * Methods that change the view a player is looking at should never be invoked
 * by an EventHandler for InventoryCloseEvent using the HumanEntity or
 * InventoryView associated with this event.
 * Examples of these include:
 * <ul>
 * <li>{@link HumanEntity#closeInventory()}
 * <li>{@link HumanEntity#openInventory(org.bukkit.inventory.Inventory)}
 * <li>{@link InventoryView#close()}
 * </ul>
 * To invoke one of these methods, schedule a task using
 * {@link org.bukkit.scheduler.BukkitScheduler#runTask(org.bukkit.plugin.Plugin, Runnable)}, which will run the task
 * on the next tick. Also be aware that this is not an exhaustive list, and
 * other methods could potentially create issues as well.
 *
 * @since 1.1.0
 */
public class InventoryCloseEvent extends InventoryEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Reason reason;

    @ApiStatus.Internal
    public InventoryCloseEvent(@NotNull InventoryView transaction) {
        this(transaction, Reason.UNKNOWN);
    }

    @ApiStatus.Internal
    public InventoryCloseEvent(@NotNull InventoryView transaction, @NotNull Reason reason) {
        super(transaction);
        this.reason = reason;
    }

    /**
     * Returns the player involved in this event
     *
     * @return Player who is involved in this event
     * @since 1.1.0
     */
    @NotNull
    public final HumanEntity getPlayer() {
        return this.transaction.getPlayer();
    }

    /**
     * @since 1.12.2
     */
    @NotNull
    public Reason getReason() {
        return this.reason;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.12.2
     */
    public enum Reason {
        /**
         * Unknown reason
         *
         * @since 1.12.2
         */
        UNKNOWN,
        /**
         * Player is teleporting
         *
         * @deprecated As of 1.21.10, this is not called anymore as inventories are not closed on teleportation.
         * @since 1.12.2
         */
        @Deprecated(since = "1.21.10")
        TELEPORT,
        /**
         * Player is no longer permitted to use this inventory
         *
         * @since 1.12.2
         */
        CANT_USE,
        /**
         * The chunk the inventory was in was unloaded
         *
         * @since 1.12.2
         */
        UNLOADED,
        /**
         * Opening new inventory instead
         *
         * @since 1.12.2
         */
        OPEN_NEW,
        /**
         * Closed
         *
         * @since 1.12.2
         */
        PLAYER,
        /**
         * Closed due to disconnect
         *
         * @since 1.12.2
         */
        DISCONNECT,
        /**
         * The player died
         *
         * @since 1.12.2
         */
        DEATH,
        /**
         * Closed by Bukkit API
         *
         * @since 1.12.2
         */
        PLUGIN,
    }
}
