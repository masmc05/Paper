package org.bukkit.event.weather;

import org.bukkit.World;
import org.bukkit.entity.LightningStrike;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Stores data for lightning striking
 *
 * @since 1.0.0
 */
public class LightningStrikeEvent extends WeatherEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final LightningStrike bolt;
    private final Cause cause;

    private boolean cancelled;

    @ApiStatus.Internal
    @Deprecated(since = "1.13.1", forRemoval = true)
    public LightningStrikeEvent(@NotNull final World world, @NotNull final LightningStrike bolt) {
        this(world, bolt, Cause.UNKNOWN);
    }

    @ApiStatus.Internal
    public LightningStrikeEvent(@NotNull final World world, @NotNull final LightningStrike bolt, @NotNull final Cause cause) {
        super(world);
        this.bolt = bolt;
        this.cause = cause;
    }

    /**
     * Gets the bolt which is striking the earth.
     *
     * @return lightning entity
     * @since 1.0.0
     */
    @NotNull
    public LightningStrike getLightning() {
        return this.bolt;
    }

    /**
     * Gets the cause of this lightning strike.
     *
     * @return strike cause
     * @since 1.13.1
     */
    @NotNull
    public Cause getCause() {
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
     * @since 1.13.1
     */
    public enum Cause {
        /**
         * Triggered by the /summon command.
         *
         * @since 1.13.1
         */
        COMMAND,
        /**
         * Triggered by a Plugin.
         *
         * @since 1.17.1
         */
        CUSTOM,
        /**
         * Triggered by a Spawner.
         *
         * @since 1.17.1
         */
        SPAWNER,
        /**
         * Triggered by an enchanted trident.
         *
         * @since 1.13.1
         */
        TRIDENT,
        /**
         * Triggered by a skeleton horse trap.
         *
         * @since 1.13.1
         */
        TRAP,
        /**
         * Triggered by weather.
         *
         * @since 1.13.1
         */
        WEATHER,
        /**
         * Triggered by an enchantment but not a trident.
         *
         * @since 1.21
         */
        ENCHANTMENT,
        /**
         * Unknown trigger.
         *
         * @since 1.13.1
         */
        UNKNOWN
    }
}
