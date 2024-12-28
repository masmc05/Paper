package io.papermc.paper.event.player;

import com.google.common.base.Preconditions;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.MerchantRecipe;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a player trades with a standalone merchant GUI.
 *
 * @since 1.16.5
 */
@NullMarked
public class PlayerPurchaseEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private boolean rewardExp;
    private boolean increaseTradeUses;
    private MerchantRecipe trade;

    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerPurchaseEvent(final Player player, final MerchantRecipe trade, final boolean rewardExp, final boolean increaseTradeUses) {
        super(player);
        this.trade = trade;
        this.rewardExp = rewardExp;
        this.increaseTradeUses = increaseTradeUses;
    }

    /**
     * Gets the associated trade with this event
     *
     * @return the trade
     * @since 1.16.5
     */
    public MerchantRecipe getTrade() {
        return this.trade;
    }

    /**
     * Sets the trade. This is then used to determine the next prices
     *
     * @param trade the trade to use
     * @since 1.16.5
     */
    public void setTrade(final MerchantRecipe trade) {
        Preconditions.checkArgument(trade != null, "Trade cannot be null!");
        this.trade = trade;
    }

    /**
     * @return will trade try to reward exp
     * @since 1.16.5
     */
    public boolean isRewardingExp() {
        return this.rewardExp;
    }

    /**
     * Sets whether the trade will try to reward exp
     *
     * @param rewardExp try to reward exp
     * @since 1.16.5
     */
    public void setRewardExp(final boolean rewardExp) {
        this.rewardExp = rewardExp;
    }

    /**
     * @return whether the trade will count as a use of the trade
     * @since 1.16.5
     */
    public boolean willIncreaseTradeUses() {
        return this.increaseTradeUses;
    }

    /**
     * Sets whether the trade will count as a use
     *
     * @param increaseTradeUses {@code true} to count, {@code false} otherwise
     * @since 1.16.5
     */
    public void setIncreaseTradeUses(final boolean increaseTradeUses) {
        this.increaseTradeUses = increaseTradeUses;
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
