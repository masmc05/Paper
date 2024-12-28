package com.destroystokyo.paper.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @deprecated Not used
 * @since 1.11.2
 */
@Deprecated(since = "1.16.4")
public class IllegalPacketEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    @Nullable private final String type;
    @Nullable private final String exceptionMessage;
    @Nullable private String kickMessage;
    private boolean shouldKick = true;

    @ApiStatus.Internal
    public IllegalPacketEvent(@NotNull Player player, @Nullable String type, @Nullable String kickMessage, @NotNull Exception e) {
        super(player);
        this.type = type;
        this.kickMessage = kickMessage;
        this.exceptionMessage = e.getMessage();
    }

    /**
     * @since 1.11.2
     */
    public boolean isShouldKick() {
        return this.shouldKick;
    }

    /**
     * @since 1.11.2
     */
    public void setShouldKick(boolean shouldKick) {
        this.shouldKick = shouldKick;
    }

    /**
     * @since 1.11.2
     */
    @Nullable
    public String getKickMessage() {
        return this.kickMessage;
    }

    /**
     * @since 1.11.2
     */
    public void setKickMessage(@Nullable String kickMessage) {
        this.kickMessage = kickMessage;
    }

    /**
     * @since 1.11.2
     */
    @Nullable
    public String getType() {
        return this.type;
    }

    /**
     * @since 1.11.2
     */
    @Nullable
    public String getExceptionMessage() {
        return this.exceptionMessage;
    }

    /**
     * @since 1.11.2
     */
    @NotNull
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.11.2
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
