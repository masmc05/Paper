package io.papermc.paper.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a block tries to dispense an item, but its inventory is empty.
 *
 * @since 1.16.4
 */
@NullMarked
public class BlockFailedDispenseEvent extends BlockEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private boolean shouldPlayEffect = true;

    @ApiStatus.Internal
    public BlockFailedDispenseEvent(final Block block) {
        super(block);
    }

    /**
     * @return if the effect should be played
     * @since 1.16.4
     */
    public boolean shouldPlayEffect() {
        return this.shouldPlayEffect;
    }

    /**
     * Sets if the effect for empty dispensers should be played
     *
     * @param playEffect if the effect should be played
     * @since 1.16.4
     */
    public void shouldPlayEffect(final boolean playEffect) {
        this.shouldPlayEffect = playEffect;
    }

    /**
     * @return {@link #shouldPlayEffect()}
     * @since 1.16.4
     */
    @Override
    public boolean callEvent() {
        super.callEvent();
        return this.shouldPlayEffect();
    }

    /**
     * @since 1.16.4
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.4
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
