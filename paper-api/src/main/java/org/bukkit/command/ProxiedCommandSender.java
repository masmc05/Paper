
package org.bukkit.command;

import net.kyori.adventure.audience.ForwardingAudience;
import net.kyori.adventure.chat.ChatType;
import net.kyori.adventure.chat.SignedMessage;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

/**
 * @since 1.8
 */
public interface ProxiedCommandSender extends CommandSender, net.kyori.adventure.audience.ForwardingAudience.Single { // Paper

    /**
     * Returns the CommandSender which triggered this proxied command
     *
     * @return the caller which triggered the command
     * @since 1.8
     */
    @NotNull
    CommandSender getCaller();

    /**
     * Returns the CommandSender which is being used to call the command
     *
     * @return the caller which the command is being run as
     * @since 1.8
     */
    @NotNull
    CommandSender getCallee();

    /**
     * {@inheritDoc}
     * @since 26.2
     */
    // Paper start
    @Override
    default void sendMessage(final @NotNull Component message, final ChatType.@NotNull Bound boundChatType) {
        ForwardingAudience.Single.super.sendMessage(message, boundChatType);
    }

    /**
     * {@inheritDoc}
     * @since 26.2
     */
    @Override
    default void sendMessage(final @NotNull Component message) {
        ForwardingAudience.Single.super.sendMessage(message);
    }

    /**
     * {@inheritDoc}
     * @since 26.2
     */
    @Override
    default void sendMessage(final @NotNull SignedMessage signedMessage, final ChatType.@NotNull Bound boundChatType) {
        ForwardingAudience.Single.super.sendMessage(signedMessage, boundChatType);
    }

    /**
     * {@inheritDoc}
     * @since 1.16.5
     */
    @NotNull
    @Override
    default net.kyori.adventure.audience.Audience audience() {
        return this.getCaller();
    }
    // Paper end
}
