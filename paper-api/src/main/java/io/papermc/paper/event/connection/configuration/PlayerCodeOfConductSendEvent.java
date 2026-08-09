package io.papermc.paper.event.connection.configuration;

import io.papermc.paper.connection.PlayerCommonConnection;
import io.papermc.paper.connection.PlayerConfigurationConnection;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * This event is called when the code of conduct is potentially sent to the player.
 *
 * @since 26.2
 */
@NullMarked
public class PlayerCodeOfConductSendEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private @Nullable String codeOfConduct;
    private final PlayerCommonConnection connection;

    @ApiStatus.Internal
    public PlayerCodeOfConductSendEvent(final PlayerConfigurationConnection connection, final @Nullable String codeOfConduct) {
        this.connection = connection;
        this.codeOfConduct = codeOfConduct;
    }

    /**
     * Gets the connection that will receive the code of conduct.
     *
     * @return connection
     * @since 26.2
     */
    public PlayerCommonConnection getConnection() {
        return connection;
    }

    /**
     * Gets the code of conduct to be sent.
     *
     * @return the code of conduct or null if none will be sent
     * @since 26.2
     */
    public @Nullable String getCodeOfConduct() {
        return this.codeOfConduct;
    }

    /**
     * Sets the code of conduct to be sent.
     *
     * @param codeOfConduct the code of conduct or null to not send one
     * @since 26.2
     */
    public void setCodeOfConduct(final @Nullable String codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    /**
     * @since 26.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 26.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
