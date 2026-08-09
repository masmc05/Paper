package org.bukkit.event.entity;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a ThrownExpBottle hits and releases experience.
 *
 * @since 1.3.1
 */
public class ExpBottleEvent extends ProjectileHitEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private int exp;
    private boolean showEffect = true;

    @ApiStatus.Internal
    @Deprecated(since = "1.20.2", forRemoval = true)
    public ExpBottleEvent(@NotNull final ThrownExpBottle bottle, final int exp) {
        this(bottle, null, null, null, exp);
    }

    @ApiStatus.Internal
    public ExpBottleEvent(@NotNull final ThrownExpBottle bottle, @Nullable Entity hitEntity, @Nullable Block hitBlock, @Nullable BlockFace hitFace, final int exp) {
        super(bottle, hitEntity, hitBlock, hitFace);
        this.exp = exp;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    @Override
    public ThrownExpBottle getEntity() {
        return (ThrownExpBottle) this.entity;
    }

    /**
     * This method indicates if the particle effect should be shown.
     *
     * @return {@code true} if the effect will be shown, {@code false} otherwise
     * @since 1.3.1
     */
    public boolean getShowEffect() {
        return this.showEffect;
    }

    /**
     * This method sets if the particle effect will be shown.
     * <p>
     * This does not change the experience created.
     *
     * @param showEffect {@code true} indicates the effect will be shown, false
     *     indicates no effect will be shown
     * @since 1.3.1
     */
    public void setShowEffect(final boolean showEffect) {
        this.showEffect = showEffect;
    }

    /**
     * This method retrieves the amount of experience to be created.
     * <p>
     * The number indicates a total amount to be divided into orbs.
     *
     * @return the total amount of experience to be created
     * @since 1.3.1
     */
    public int getExperience() {
        return this.exp;
    }

    /**
     * This method sets the amount of experience to be created.
     * <p>
     * The number indicates a total amount to be divided into orbs.
     *
     * @param exp the total amount of experience to be created
     * @since 1.3.1
     */
    public void setExperience(final int exp) {
        this.exp = exp;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
