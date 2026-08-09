package org.bukkit;

import java.net.URI;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a collections of links which may be sent to a client.
 *
 * @since 1.21
 */
public interface ServerLinks {

    /**
     * Gets the link of a given type, if it exists.
     *
     * @param type link type
     * @return link or null
     * @since 1.21
     */
    @Nullable
    ServerLink getLink(@NotNull Type type);

    /**
     * Gets an immutable list of all links.
     *
     * @return immutable list
     * @since 1.21
     */
    @NotNull
    List<ServerLink> getLinks();

    /**
     * Adds the given link, overwriting the first link of the same type if
     * already set.
     *
     * @param type link type
     * @param url link url
     * @return the added link
     * @since 1.21
     */
    @NotNull
    ServerLink setLink(@NotNull Type type, @NotNull URI url);

    /**
     * Adds the given link to the list of links.
     *
     * @param type link type
     * @param url link url
     * @return the added link
     * @since 1.21
     */
    @NotNull
    ServerLink addLink(@NotNull Type type, @NotNull URI url);

    // Paper start - Adventure
    /**
     * Adds the given link to the list of links.
     *
     * @param displayName link name / display text Component
     * @param url link url
     * @return the added link
     * @since 1.21
     */
    @NotNull
    ServerLink addLink(@NotNull net.kyori.adventure.text.Component displayName, @NotNull URI url);
    // Paper end - Adventure

    /**
     * Adds the given link to the list of links.
     *
     * @param displayName link name / display text
     * @param url link url
     * @return the added link
     * @deprecated in favour of {@link ServerLinks#addLink(net.kyori.adventure.text.Component, URI)}
     * @since 1.21
     */
    @Deprecated // Paper - Adventure
    @NotNull
    ServerLink addLink(@NotNull String displayName, @NotNull URI url);

    /**
     * Removes the given link.
     *
     * @param link the link to remove
     * @return if the link existed and was removed
     * @since 1.21
     */
    boolean removeLink(@NotNull ServerLink link);

    /**
     * Returns a copy of this link collection, unassociated from the server.
     *
     * @return copied links
     * @since 1.21
     */
    @NotNull
    ServerLinks copy();

    /**
     * Represents a server link.
     *
     * @since 1.21
     */
    public interface ServerLink {

        /**
         * Gets the type of this link if it is a known special type.
         *
         * @return type or null
         * @since 1.21
         */
        @Nullable
        Type getType();

        // Paper start - Adventure
        /**
         * Gets the display name/text Component of this link.
         *
         * @return display name Component
         * @since 1.21
         */
        @NotNull
        net.kyori.adventure.text.Component displayName();
        // Paper end - Adventure

        /**
         * Gets the display name/text of this link.
         *
         * @return display name
         * @deprecated in favour of {@link ServerLink#displayName()}
         * @since 1.21
         */
        @Deprecated // Paper - Adventure
        @NotNull
        String getDisplayName();

        /**
         * Gets the url of this link.
         *
         * @return link url
         * @since 1.21
         */
        @NotNull
        URI getUrl();
    }

    /**
     * Represents a known type of link which will be translated by the client
     * and may have special functionality.
     *
     * @since 1.21
     */
    public enum Type {

        /**
         * Bug report links which may appear on disconnect/crash screens.
         *
         * @since 1.21
         */
        REPORT_BUG,
        /**
         * @since 1.21
         */
        COMMUNITY_GUIDELINES,
        /**
         * @since 1.21
         */
        SUPPORT,
        /**
         * @since 1.21
         */
        STATUS,
        /**
         * @since 1.21
         */
        FEEDBACK,
        /**
         * @since 1.21
         */
        COMMUNITY,
        /**
         * @since 1.21
         */
        WEBSITE,
        /**
         * @since 1.21
         */
        FORUMS,
        /**
         * @since 1.21
         */
        NEWS,
        /**
         * @since 1.21
         */
        ANNOUNCEMENTS;
    }
}
