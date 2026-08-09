package org.bukkit.event.inventory;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an ItemStack is successfully burned as fuel in a furnace-like block such as a
 * {@link org.bukkit.block.Furnace}, {@link org.bukkit.block.Smoker}, or
 * {@link org.bukkit.block.BlastFurnace}.
 *
 * @since 1.0.0
 */
public class FurnaceBurnEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ItemStack fuel;
    private int burnTime;
    private boolean burning = true;
    private boolean consumeFuel = true;

    private boolean cancelled;

    @ApiStatus.Internal
    public FurnaceBurnEvent(@NotNull final Block furnace, @NotNull final ItemStack fuel, final int burnTime) {
        super(furnace);
        this.fuel = fuel;
        this.burnTime = burnTime;
    }

    /**
     * Gets the fuel ItemStack for this event
     *
     * @return the fuel ItemStack
     * @since 1.0.0
     */
    @NotNull
    public ItemStack getFuel() {
        return this.fuel;
    }

    /**
     * Gets the burn time for this fuel
     *
     * @return the burn time for this fuel
     * @since 1.0.0
     */
    public int getBurnTime() {
        return this.burnTime;
    }

    /**
     * Sets the burn time for this fuel
     *
     * @param burnTime the burn time for this fuel
     * @since 1.0.0
     */
    public void setBurnTime(@org.jetbrains.annotations.Range(from = Short.MIN_VALUE, to = Short.MAX_VALUE) int burnTime) {
        this.burnTime = Math.clamp(burnTime, Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * Gets whether the furnace's fuel is burning or not.
     *
     * @return whether the furnace's fuel is burning or not.
     * @since 1.0.0
     */
    public boolean isBurning() {
        return this.burning;
    }

    /**
     * Sets whether the furnace's fuel is burning or not.
     *
     * @param burning {@code true} if the furnace's fuel is burning
     * @since 1.0.0
     */
    public void setBurning(boolean burning) {
        this.burning = burning;
    }

    /**
     * Gets whether the furnace's fuel will be consumed or not.
     *
     * @return whether the furnace's fuel will be consumed
     * @since 1.16.5
     */
    public boolean willConsumeFuel() {
        return this.consumeFuel;
    }

    /**
     * Sets whether the furnace's fuel will be consumed or not.
     *
     * @param consumeFuel {@code true} to consume the fuel
     * @since 1.16.5
     */
    public void setConsumeFuel(boolean consumeFuel) {
        this.consumeFuel = consumeFuel;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
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
}
