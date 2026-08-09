package io.papermc.paper.event.player;

import io.papermc.paper.block.bed.BedEnterAction;
import net.kyori.adventure.text.Component;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * @since 1.16.5
 */
@NullMarked
public class PlayerBedFailEnterEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final FailReason failReason;
    private final Block bed;
    private final BedEnterAction enterAction;
    private boolean willExplode;
    private @Nullable Component message;

    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerBedFailEnterEvent(final Player player, final FailReason failReason, final Block bed, final boolean willExplode, final @Nullable Component message, BedEnterAction enterAction) {
        super(player);
        this.failReason = failReason;
        this.bed = bed;
        this.enterAction = enterAction;
        this.willExplode = willExplode;
        this.message = message;
    }

    /**
     * @deprecated This enum has been replaced with a system that better
     * represents how beds work. See {@link #enterAction}
     * @since 1.16.5
     */
    @ApiStatus.Obsolete(since = "1.21.11")
    public FailReason getFailReason() {
        return this.failReason;
    }

    /**
     * This describes the default outcome of this event.
     *
     * @return the action representing the default outcome of this event
     * @since 1.21.11
     */
    public BedEnterAction enterAction() {
        return this.enterAction;
    }

    /**
     * @since 1.16.5
     */
    public Block getBed() {
        return this.bed;
    }

    /**
     * @since 1.16.5
     */
    public boolean getWillExplode() {
        return this.willExplode;
    }

    /**
     * @since 1.16.5
     */
    public void setWillExplode(final boolean willExplode) {
        this.willExplode = willExplode;
    }

    /**
     * @since 1.16.5
     */
    public @Nullable Component getMessage() {
        return this.message;
    }

    /**
     * @since 1.16.5
     */
    public void setMessage(final @Nullable Component message) {
        this.message = message;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <b>NOTE</b>: This does not cancel the player getting in the bed, but any messages/explosions
     * that may occur because of the interaction.
     *
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

    /**
     * @deprecated Enums no longer represents reliably how beds work and fail. This has been
     * replaced with {@link BedEnterAction} that better fits the new beds
     * @since 1.16.5
     */
    @ApiStatus.Obsolete(since = "1.21.11")
    public enum FailReason {
        /**
         * The world doesn't allow sleeping (ex. Nether or The End). Entering
         * the bed is prevented but the bed doesn't explode. When the bed
         * explodes, {@link #EXPLOSION} is used instead.
         *
         * @since 1.16.5
         */
        NOT_POSSIBLE_HERE,
        /**
         * Entering the bed is prevented due to it not being night nor
         * thundering currently.
         * <p>
         * If the event is forcefully allowed during daytime, the player will
         * enter the bed (and set its bed location), but might get immediately
         * thrown out again.
         *
         * @since 1.16.5
         */
        NOT_POSSIBLE_NOW,
        /**
         * Entering the bed is prevented due to the player being too far away.
         *
         * @since 1.16.5
         */
        TOO_FAR_AWAY,
        /**
         * Bed is obstructed.
         *
         * @since 1.16.5
         */
        OBSTRUCTED,
        /**
         * Entering the bed is prevented due to there being some other problem.
         *
         * @since 1.16.5
         */
        OTHER_PROBLEM,
        /**
         * Entering the bed is prevented due to there being monsters nearby.
         *
         * @since 1.16.5
         */
        NOT_SAFE,
        /**
         * Entering the bed is prevented and the bed explodes.
         *
         * @since 1.21.11
         */
        EXPLOSION
    }
}
