package io.papermc.paper.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.jspecify.annotations.NullMarked;

/**
 * Called when the server detects a player stopping using an item.
 * Examples of this are letting go of the interact button when holding a bow, an edible item, or a spyglass.
 *
 * @since 1.18.2
 */
@NullMarked
public class PlayerStopUsingItemEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ItemStack item;
    private final int ticksHeldFor;

    /**
     * @since 1.18.2
     */
    public PlayerStopUsingItemEvent(final Player player, final ItemStack item, final int ticksHeldFor) {
        super(player);
        this.item = item;
        this.ticksHeldFor = ticksHeldFor;
    }

    /**
     * Gets the exact item the player is releasing
     *
     * @return ItemStack the exact item the player released
     * @since 1.18.2
     */
    public ItemStack getItem() {
        return this.item;
    }

    /**
     * Gets the number of ticks the item was held for
     *
     * @return int the number of ticks the item was held for
     * @since 1.18.2
     */
    public int getTicksHeldFor() {
        return this.ticksHeldFor;
    }

    /**
     * @since 1.18.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.18.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
