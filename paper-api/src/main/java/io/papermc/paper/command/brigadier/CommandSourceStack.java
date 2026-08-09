package io.papermc.paper.command.brigadier;

import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.Nullable;

/**
 * The command source type for Brigadier commands registered using Paper API.
 * <p>
 * While the general use case for CommandSourceStack is similar to that of {@link CommandSender}, it provides access to
 * important additional context for the command execution.
 * Specifically, commands such as {@literal /execute} may alter the location or executor of the source stack before
 * passing it to another command.
 * <p>The {@link CommandSender} returned by {@link #getSender()} may be a "no-op"
 * instance of {@link CommandSender} in cases where the server either doesn't
 * exist yet, or no specific sender is available. Methods on such a {@link CommandSender}
 * will either have no effect or throw an {@link UnsupportedOperationException}.</p>
 *
 * @since 1.20.6
 */
@ApiStatus.NonExtendable
public interface CommandSourceStack {

    /**
     * Gets the location that this command is being executed at.
     *
     * @return a cloned location instance.
     * @since 1.20.6
     */
    Location getLocation();

    /**
     * Gets the command sender that executed this command.
     * The sender of a command source stack is the one that initiated/triggered the execution of a command.
     * It differs to {@link #getExecutor()} as the executor can be changed by a command, e.g. {@literal /execute}.
     *
     * @return the command sender instance
     * @since 1.20.6
     */
    CommandSender getSender();

    /**
     * Gets the entity that executes this command.
     * May not always be {@link #getSender()} as the executor of a command can be changed to a different entity
     * than the one that triggered the command.
     *
     * @return entity that executes this command
     * @since 1.20.6
     */
    @Nullable Entity getExecutor();

    /**
     * {@return the {@link Player} that is executing this command}
     * @throws CommandSyntaxException if the {@link #getExecutor() executor} of this command is not a {@link Player}
     * @since 26.2
     */
    Player getPlayerOrThrow() throws CommandSyntaxException;

    /**
     * {@return the {@link Entity} that is executing this command}
     * @throws CommandSyntaxException if the {@link #getExecutor() executor} of this command is not an {@link Entity}
     * @since 26.2
     */
    Entity getEntityOrThrow() throws CommandSyntaxException;

    /**
     * Creates a new CommandSourceStack object with a different location for redirecting commands to other nodes.
     *
     * @param location The location to create a new CommandSourceStack object with
     * @return The newly created CommandSourceStack
     * @see #getLocation()
     * @see com.mojang.brigadier.builder.ArgumentBuilder#fork(CommandNode, RedirectModifier)
     * @since 1.21.4
     */
    CommandSourceStack withLocation(Location location);

    /**
     * Creates a new CommandSourceStack object with a different executor for redirecting commands to other nodes.
     *
     * @param executor The executing entity to create a new CommandSourceStack object with
     * @return The newly created CommandSourceStack
     * @see #getExecutor()
     * @see com.mojang.brigadier.builder.ArgumentBuilder#fork(CommandNode, RedirectModifier)
     * @since 1.21.4
     */
    CommandSourceStack withExecutor(Entity executor);
}
