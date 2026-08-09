package org.bukkit.event.entity;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.LightningStrike;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a Creeper is struck by lightning.
 * <p>
 * If this event is cancelled, the Creeper will not be powered.
 *
 * @since 1.0.0
 */
public class CreeperPowerEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final PowerCause cause;
    private LightningStrike bolt;

    private boolean cancelled;

    @ApiStatus.Internal
    public CreeperPowerEvent(@NotNull final Creeper creeper, @NotNull final LightningStrike bolt, @NotNull final PowerCause cause) {
        this(creeper, cause);
        this.bolt = bolt;
    }

    @ApiStatus.Internal
    public CreeperPowerEvent(@NotNull final Creeper creeper, @NotNull final PowerCause cause) {
        super(creeper);
        this.cause = cause;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public Creeper getEntity() {
        return (Creeper) this.entity;
    }

    /**
     * Gets the lightning bolt which is striking the Creeper.
     *
     * @return The Entity for the lightning bolt which is striking the Creeper
     * @since 1.0.0
     */
    @Nullable
    public LightningStrike getLightning() {
        return this.bolt;
    }

    /**
     * Gets the cause of the creeper being (un)powered.
     *
     * @return A PowerCause value detailing the cause of change in power.
     * @since 1.0.0
     */
    @NotNull
    public PowerCause getCause() {
        return this.cause;
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

    /**
     * An enum to specify the cause of the change in power
     *
     * @since 1.0.0
     */
    public enum PowerCause {

        /**
         * Power change caused by a lightning bolt
         * <p>
         * Powered state: {@code true}
         *
         * @since 1.0.0
         */
        LIGHTNING,
        /**
         * Power change caused by something else (probably a plugin)
         * <p>
         * Powered state: {@code true}
         *
         * @since 1.0.0
         */
        SET_ON,
        /**
         * Power change caused by something else (probably a plugin)
         * <p>
         * Powered state: {@code false}
         *
         * @since 1.0.0
         */
        SET_OFF
    }
}
