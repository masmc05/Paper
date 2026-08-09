package io.papermc.paper.event.player;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Runs when a player attempts to move, but is prevented from doing so by the server
 *
 * @since 1.20.1
 */
@NullMarked
public class PlayerFailMoveEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final FailReason failReason;
    private final Location from;
    private final Location to;
    private boolean allowed;
    private boolean logWarning;

    @ApiStatus.Internal
    public PlayerFailMoveEvent(final Player player, final FailReason failReason, final boolean allowed, final boolean logWarning, final Location from, final Location to) {
        super(player);
        this.failReason = failReason;
        this.allowed = allowed;
        this.logWarning = logWarning;
        this.from = from;
        this.to = to;
    }

    /**
     * Gets the reason this movement was prevented by the server
     *
     * @return The reason the movement was prevented
     * @since 1.20.1
     */
    public FailReason getFailReason() {
        return this.failReason;
    }

    /**
     * Gets the location this player moved from
     *
     * @return Location the player moved from
     * @since 1.20.1
     */
    public Location getFrom() {
        return this.from.clone();
    }

    /**
     * Gets the location this player tried to move to
     *
     * @return Location the player tried to move to
     * @since 1.20.1
     */
    public Location getTo() {
        return this.to.clone();
    }

    /**
     * Gets if the check should be bypassed, allowing the movement
     *
     * @return whether to bypass the check
     * @since 1.20.1
     */
    public boolean isAllowed() {
        return this.allowed;
    }

    /**
     * Set if the check should be bypassed and the movement should be allowed
     *
     * @param allowed whether to bypass the check
     * @since 1.20.1
     */
    public void setAllowed(final boolean allowed) {
        this.allowed = allowed;
    }

    /**
     * Gets if warnings will be printed to console. e.g. "Player123 moved too quickly!"
     *
     * @return whether to log warnings
     * @since 1.20.1
     */
    public boolean getLogWarning() {
        return this.logWarning;
    }

    /**
     * Set if a warning is printed to console. e.g. "Player123 moved too quickly!"
     *
     * @param logWarning whether to log warnings
     * @since 1.20.1
     */
    public void setLogWarning(final boolean logWarning) {
        this.logWarning = logWarning;
    }

    /**
     * @since 1.20.1
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.20.1
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.20.1
     */
    public enum FailReason {
        /**
         * @since 1.20.1
         */
        MOVED_INTO_UNLOADED_CHUNK, // Only fired if the world setting prevent-moving-into-unloaded-chunks is true
        /**
         * @since 1.20.1
         */
        MOVED_TOO_QUICKLY,
        /**
         * @since 1.20.1
         */
        MOVED_WRONGLY,
        /**
         * @since 1.20.1
         */
        CLIPPED_INTO_BLOCK
    }

}
