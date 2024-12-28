package org.bukkit.event.entity;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.LightningStrike;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a Creeper is struck by lightning.
 * <p>
 * If a Creeper Power event is cancelled, the Creeper will not be powered.
 *
 * @since 1.0.0
 */
public class CreeperPowerEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean canceled;
    private final PowerCause cause;
    private LightningStrike bolt;

    public CreeperPowerEvent(@NotNull final Creeper creeper, @NotNull final LightningStrike bolt, @NotNull final PowerCause cause) {
        this(creeper, cause);
        this.bolt = bolt;
    }

    public CreeperPowerEvent(@NotNull final Creeper creeper, @NotNull final PowerCause cause) {
        super(creeper);
        this.cause = cause;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return canceled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        canceled = cancel;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public Creeper getEntity() {
        return (Creeper) entity;
    }

    /**
     * Gets the lightning bolt which is striking the Creeper.
     *
     * @return The Entity for the lightning bolt which is striking the Creeper
     * @since 1.0.0
     */
    @Nullable
    public LightningStrike getLightning() {
        return bolt;
    }

    /**
     * Gets the cause of the creeper being (un)powered.
     *
     * @return A PowerCause value detailing the cause of change in power.
     * @since 1.0.0
     */
    @NotNull
    public PowerCause getCause() {
        return cause;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
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
         * Powered state: true
         */
        LIGHTNING,
        /**
         * Power change caused by something else (probably a plugin)
         * <p>
         * Powered state: true
         */
        SET_ON,
        /**
         * Power change caused by something else (probably a plugin)
         * <p>
         * Powered state: false
         */
        SET_OFF
    }
}
