package org.bukkit.conversations;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The Conversable interface is used to indicate objects that can have
 * conversations.
 *
 * @since 1.1.0
 */
public interface Conversable {

    /**
     * Tests to see of a Conversable object is actively engaged in a
     * conversation.
     *
     * @return True if a conversation is in progress
     * @since 1.1.0
     */
    public boolean isConversing();

    /**
     * Accepts input into the active conversation. If no conversation is in
     * progress, this method does nothing.
     *
     * @param input The input message into the conversation
     * @since 1.1.0
     */
    public void acceptConversationInput(@NotNull String input);

    /**
     * Enters into a dialog with a Conversation object.
     *
     * @param conversation The conversation to begin
     * @return True if the conversation should proceed, false if it has been
     *     enqueued
     * @since 1.1.0
     */
    public boolean beginConversation(@NotNull Conversation conversation);

    /**
     * Abandons an active conversation.
     *
     * @param conversation The conversation to abandon
     * @since 1.1.0
     */
    public void abandonConversation(@NotNull Conversation conversation);

    /**
     * Abandons an active conversation.
     *
     * @param conversation The conversation to abandon
     * @param details Details about why the conversation was abandoned
     * @since 1.3.1
     */
    public void abandonConversation(@NotNull Conversation conversation, @NotNull ConversationAbandonedEvent details);

    /**
     * Sends this sender a message raw
     *
     * @param message Message to be displayed
     * @since 1.1.0
     */
    @org.jetbrains.annotations.ApiStatus.Obsolete // Paper
    public void sendRawMessage(@NotNull String message);

    /**
     * Sends this sender a message raw
     *
     * @param message Message to be displayed
     * @param sender The sender of this message
     * @deprecated sender UUID is ignored
     * @since 1.16.3
     */
    @Deprecated // Paper
    public void sendRawMessage(@Nullable UUID sender, @NotNull String message);
}
