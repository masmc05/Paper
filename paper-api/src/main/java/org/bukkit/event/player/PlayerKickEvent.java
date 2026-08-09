package org.bukkit.event.player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Called when a player gets kicked from the server
 *
 * @since 1.0.0
 */
@NullMarked
public class PlayerKickEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private Component kickReason;
    private @Nullable Component leaveMessage;
    private final Cause cause;

    private boolean cancelled;

    @ApiStatus.Internal
    @Deprecated(forRemoval = true)
    public PlayerKickEvent(final Player playerKicked, final String kickReason, final String leaveMessage) {
        super(playerKicked);
        this.kickReason = LegacyComponentSerializer.legacySection().deserialize(kickReason);
        this.leaveMessage = LegacyComponentSerializer.legacySection().deserialize(leaveMessage);
        this.cause = Cause.UNKNOWN;
    }

    @ApiStatus.Internal
    @Deprecated(forRemoval = true)
    public PlayerKickEvent(final Player playerKicked, final Component kickReason, final Component leaveMessage) {
        super(playerKicked);
        this.kickReason = kickReason;
        this.leaveMessage = leaveMessage;
        this.cause = Cause.UNKNOWN;
    }

    @ApiStatus.Internal
    public PlayerKickEvent(final Player playerKicked, final Component kickReason, final Component leaveMessage, final Cause cause) {
        super(playerKicked);
        this.kickReason = kickReason;
        this.leaveMessage = leaveMessage;
        this.cause = cause;
    }

    /**
     * Gets the reason why the player is getting kicked
     *
     * @return string kick reason
     * @since 1.16.5
     */
    public Component reason() {
        return this.kickReason;
    }

    /**
     * Sets the reason why the player is getting kicked
     *
     * @param kickReason kick reason
     * @since 1.16.5
     */
    public void reason(Component kickReason) {
        this.kickReason = kickReason;
    }

    /**
     * Gets the reason why the player is getting kicked
     *
     * @return string kick reason
     * @deprecated in favour of {@link #reason()}
     * @since 1.0.0
     */
    @Deprecated
    public String getReason() {
        return LegacyComponentSerializer.legacySection().serialize(this.kickReason);
    }

    /**
     * Sets the reason why the player is getting kicked
     *
     * @param kickReason kick reason
     * @deprecated in favour of {@link #reason(Component)}
     * @since 1.0.0
     */
    @Deprecated
    public void setReason(String kickReason) {
        this.kickReason = LegacyComponentSerializer.legacySection().deserialize(kickReason);
    }

    /**
     * Gets the leave message send to all online players
     *
     * @return string kick reason
     * @since 1.16.5
     */
    public @Nullable Component leaveMessage() {
        return this.leaveMessage;
    }

    /**
     * Sets the leave message send to all online players
     *
     * @param leaveMessage leave message. If {@code null}, no message will be sent
     * @since 1.16.5
     */
    public void leaveMessage(@Nullable Component leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    /**
     * Gets the leave message send to all online players
     *
     * @return string kick reason
     * @deprecated in favour of {@link #leaveMessage()}
     * @since 1.0.0
     */
    @Deprecated
    public @Nullable String getLeaveMessage() {
        return LegacyComponentSerializer.legacySection().serializeOrNull(this.leaveMessage);
    }

    /**
     * Sets the leave message send to all online players
     *
     * @param leaveMessage leave message. If {@code null}, no message will be sent
     * @deprecated in favour of {@link #leaveMessage(Component)}
     * @since 1.0.0
     */
    @Deprecated
    public void setLeaveMessage(@Nullable String leaveMessage) {
        this.leaveMessage = LegacyComponentSerializer.legacySection().deserializeOrNull(leaveMessage);
    }

    /**
     * Gets the cause of this kick
     *
     * @since 1.16.5
     */
    public PlayerKickEvent.Cause getCause() {
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
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.5
     */
    public enum Cause {

        /**
         * @since 1.16.5
         */
        PLUGIN,
        /**
         * @since 1.16.5
         */
        WHITELIST,
        /**
         * @since 1.16.5
         */
        BANNED,
        /**
         * @since 1.16.5
         */
        IP_BANNED,
        /**
         * @since 26.2
         */
        KICKED,
        /**
         * @since 1.16.5
         */
        FLYING_PLAYER,
        /**
         * @since 1.16.5
         */
        FLYING_VEHICLE,
        /**
         * @since 1.16.5
         */
        TIMEOUT,
        /**
         * @since 1.16.5
         */
        IDLING,
        /**
         * @since 1.16.5
         */
        INVALID_VEHICLE_MOVEMENT,
        /**
         * @since 1.16.5
         */
        INVALID_PLAYER_MOVEMENT,
        /**
         * @since 1.16.5
         */
        INVALID_ENTITY_ATTACKED,
        /**
         * @since 1.16.5
         */
        INVALID_PAYLOAD,
        /**
         * @since 1.20.6
         */
        INVALID_COOKIE,
        /**
         * @since 1.16.5
         */
        SPAM,
        /**
         * @since 1.16.5
         */
        ILLEGAL_ACTION,
        /**
         * @since 1.16.5
         */
        ILLEGAL_CHARACTERS,
        /**
         * @since 1.19.1
         */
        OUT_OF_ORDER_CHAT,
        /**
         * @since 1.19.1
         */
        UNSIGNED_CHAT,
        /**
         * @since 1.19.1
         */
        CHAT_VALIDATION_FAILED,
        /**
         * @since 1.19.3
         */
        EXPIRED_PROFILE_PUBLIC_KEY,
        /**
         * @since 1.19.3
         */
        INVALID_PUBLIC_KEY_SIGNATURE,
        /**
         * @since 1.19.1
         */
        TOO_MANY_PENDING_CHATS,
        /**
         * @since 1.16.5
         */
        SELF_INTERACTION,
        /**
         * @since 1.16.5
         */
        DUPLICATE_LOGIN,
        /**
         * @since 1.17
         */
        RESOURCE_PACK_REJECTION,
        /**
         * Spigot's restart command
         *
         * @since 1.16.5
         */
        RESTART_COMMAND,
        /**
         * Fallback cause
         *
         * @since 1.16.5
         */
        UNKNOWN;

        /**
         * @deprecated use {@link #KICKED}, kicks can also occur through the server management protocol.
         * @since 1.16.5
         */
        @Deprecated(since = "26.2")
        public static final Cause KICK_COMMAND = KICKED;
    }
}
