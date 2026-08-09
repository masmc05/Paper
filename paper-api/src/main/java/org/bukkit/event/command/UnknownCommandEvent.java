package org.bukkit.event.command;

import io.papermc.paper.command.brigadier.CommandSourceStack;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Thrown when a player executes a command that is not defined
 *
 * @since 1.12
 */
@NullMarked
public class UnknownCommandEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final CommandSourceStack commandSource;
    private final String commandLine;
    private @Nullable Component message;

    @ApiStatus.Internal
    public UnknownCommandEvent(final CommandSourceStack commandSource, final String commandLine, final @Nullable Component message) {
        super(false);
        this.commandSource = commandSource;
        this.commandLine = commandLine;
        this.message = message;
    }

    /**
     * Gets the CommandSender
     *
     * @return sender of the command
     * @since 1.12
     */
    public CommandSender getSender() {
        return this.commandSource.getSender();
    }

    /**
     * Gets the command source associated with this event
     *
     * @return the {@link CommandSourceStack}
     * @since 1.21.10
     */
    public CommandSourceStack getCommandSource() {
        return this.commandSource;
    }

    /**
     * Gets the command that was sent
     *
     * @return command sent
     * @since 1.12
     */
    public String getCommandLine() {
        return this.commandLine;
    }

    /**
     * Gets the message that will be returned
     *
     * @return unknown command message
     * @deprecated use {@link #message()}
     * @since 1.12
     */
    @Deprecated
    public @Nullable String getMessage() {
        return this.message == null ? null : LegacyComponentSerializer.legacySection().serialize(this.message);
    }

    /**
     * Sets the message that will be returned
     * <p>
     * Set to {@code null} to avoid any message being sent
     *
     * @param message the message to be returned, or {@code null}
     * @deprecated use {@link #message(Component)}
     * @since 1.12
     */
    @Deprecated
    public void setMessage(@Nullable String message) {
        this.message(message == null ? null : LegacyComponentSerializer.legacySection().deserialize(message));
    }

    /**
     * Gets the message that will be returned
     *
     * @return unknown command message
     * @since 1.16.5
     */
    @Contract(pure = true)
    public @Nullable Component message() {
        return this.message;
    }

    /**
     * Sets the message that will be returned
     * <p>
     * Set to {@code null} to avoid any message being sent
     *
     * @param message the message to be returned, or {@code null}
     * @since 1.16.5
     */
    public void message(@Nullable Component message) {
        this.message = message;
    }

    /**
     * @since 1.12
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.12
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}

