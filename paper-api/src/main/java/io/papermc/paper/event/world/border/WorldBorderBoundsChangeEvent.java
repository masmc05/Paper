package io.papermc.paper.event.world.border;

import com.google.common.base.Preconditions;
import io.papermc.paper.util.Tick;
import java.time.Duration;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.checkerframework.checker.index.qual.NonNegative;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Range;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a world border changes its bounds, either over time, or instantly.
 *
 * @since 1.16.5
 */
@NullMarked
public class WorldBorderBoundsChangeEvent extends WorldBorderEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private Type type;
    private final double oldSize;
    private double newSize;
    private long duration;
    private boolean cancelled;

    @ApiStatus.Internal
    public WorldBorderBoundsChangeEvent(final World world, final WorldBorder worldBorder, final Type type, final double oldSize, final double newSize, final long duration) {
        super(world, worldBorder);
        this.type = type;
        this.oldSize = oldSize;
        this.newSize = newSize;
        this.duration = duration;
    }

    /**
     * Gets if this change is an instant change or over-time change.
     *
     * @return the change type
     * @since 1.16.5
     */
    public Type getType() {
        return this.type;
    }

    /**
     * Gets the old size or the world border.
     *
     * @return the old size
     * @since 1.16.5
     */
    public double getOldSize() {
        return this.oldSize;
    }

    /**
     * Gets the new size of the world border.
     *
     * @return the new size
     * @since 1.16.5
     */
    public double getNewSize() {
        return this.newSize;
    }

    /**
     * Sets the new size of the world border.
     *
     * @param newSize the new size
     * @since 1.16.5
     */
    public void setNewSize(final double newSize) {
        this.newSize = Math.clamp(newSize, 1.0, this.worldBorder.getMaxSize());
    }

    /**
     * Gets the time in ticks for the change. Will be 0 if instant.
     *
     * @return the time in ticks for the change
     * @since 1.21.11
     */
    public @Range(from = 0, to = Integer.MAX_VALUE) long getDurationTicks() {
        return this.duration;
    }

    /**
     * Sets the time in ticks for the change. Will change {@link #getType()} to return
     * {@link Type#STARTED_MOVE}.
     *
     * @param duration the time in ticks for the change
     * @since 1.21.11
     */
    public void setDurationTicks(final @Range(from = 0, to = Integer.MAX_VALUE) long duration) {
        Preconditions.checkArgument(duration >= 0 && duration <= Integer.MAX_VALUE, "duration must be between 0-%s", Integer.MAX_VALUE);
        this.duration = duration;
        if (this.type == Type.INSTANT_MOVE) {
            this.type = Type.STARTED_MOVE;
        }
    }

    /**
     * Gets the time in milliseconds for the change. Will be 0 if instant.
     *
     * @return the time in milliseconds for the change
     * @deprecated in favor of {@link #getDurationTicks()}
     */
    @Deprecated(forRemoval = true, since = "1.21.11")
    public @NonNegative long getDuration() {
        return Tick.of(this.getDurationTicks()).toMillis();
    }

    /**
     * Sets the time in milliseconds for the change. Will change {@link #getType()} to return
     * {@link Type#STARTED_MOVE}.
     *
     * @param duration the time in milliseconds for the change
     * @deprecated in favor of {@link #setDurationTicks(long)}
     */
    @Deprecated(forRemoval = true, since = "1.21.11")
    public void setDuration(final @NonNegative long duration) {
        this.setDurationTicks(Tick.tick().fromDuration(Duration.ofMillis(duration)));
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

    /**
     * @since 1.16.5
     */
    public enum Type {
        /**
         * @since 1.16.5
         */
        STARTED_MOVE,
        /**
         * @since 1.16.5
         */
        INSTANT_MOVE
    }
}
