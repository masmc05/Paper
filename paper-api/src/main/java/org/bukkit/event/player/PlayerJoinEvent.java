package org.bukkit.event.player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a player joins a server and has been placed in loaded chunks.
 *
 * <p>Teleporting the player during this event will result in undefined behavior.
 * Use {@link io.papermc.paper.event.player.AsyncPlayerSpawnLocationEvent} to change the spawn location.</p>
 *
 * @since 1.0.0
 */
public class PlayerJoinEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private Component joinMessage;

    @ApiStatus.Internal
    public PlayerJoinEvent(@NotNull final Player playerJoined, @Nullable final Component joinMessage) {
        super(playerJoined);
        this.joinMessage = joinMessage;
    }

    @ApiStatus.Internal
    @Deprecated(forRemoval = true)
    public PlayerJoinEvent(@NotNull final Player playerJoined, @Nullable final String joinMessage) {
        super(playerJoined);
        this.joinMessage = joinMessage != null ? LegacyComponentSerializer.legacySection().deserialize(joinMessage) : null;
    }

    /**
     * Gets the join message to send to all online players
     *
     * @return string join message. Can be {@code null}
     * @since 1.16.5
     */
    public @Nullable Component joinMessage() {
        return this.joinMessage;
    }

    /**
     * Sets the join message to send to all online players
     *
     * @param joinMessage join message. If {@code null}, no message will be sent
     * @since 1.16.5
     */
    public void joinMessage(@Nullable Component joinMessage) {
        this.joinMessage = joinMessage;
    }

    /**
     * Gets the join message to send to all online players
     *
     * @return string join message. Can be {@code null}
     * @deprecated in favour of {@link #joinMessage()}
     * @since 1.0.0
     */
    @Nullable
    @Deprecated
    public String getJoinMessage() {
        return this.joinMessage == null ? null : LegacyComponentSerializer.legacySection().serialize(this.joinMessage);
    }

    /**
     * Sets the join message to send to all online players
     *
     * @param joinMessage join message. If {@code null}, no message will be sent
     * @deprecated in favour of {@link #joinMessage(Component)}
     * @since 1.0.0
     */
    @Deprecated
    public void setJoinMessage(@Nullable String joinMessage) {
        this.joinMessage = joinMessage != null ? LegacyComponentSerializer.legacySection().deserialize(joinMessage) : null;
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
}
