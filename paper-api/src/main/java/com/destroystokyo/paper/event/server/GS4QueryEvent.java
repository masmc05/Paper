package com.destroystokyo.paper.event.server;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * This event is fired if server is getting queried over GS4 Query protocol.
 * <br>
 * Adapted from Velocity's ProxyQueryEvent
 *
 * @author Mark Vainomaa
 * @since 1.13.2
 */
@NullMarked
public final class GS4QueryEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final QueryType queryType;
    private final InetAddress querierAddress;
    private QueryResponse response;

    @ApiStatus.Internal
    public GS4QueryEvent(final QueryType queryType, final InetAddress querierAddress, final QueryResponse response) {
        super(true); // should always be called async
        this.queryType = queryType;
        this.querierAddress = querierAddress;
        this.response = response;
    }

    /**
     * Get query type
     *
     * @return query type
     * @since 1.13.2
     */
    public QueryType getQueryType() {
        return this.queryType;
    }

    /**
     * Get querier address
     *
     * @return querier address
     * @since 1.13.2
     */
    public InetAddress getQuerierAddress() {
        return this.querierAddress;
    }

    /**
     * Get query response
     *
     * @return query response
     * @since 1.13.2
     */
    public QueryResponse getResponse() {
        return this.response;
    }

    /**
     * Set query response
     *
     * @param response query response
     * @since 1.13.2
     */
    public void setResponse(final QueryResponse response) {
        this.response = Preconditions.checkNotNull(response, "response");
    }

    /**
     * @since 1.13.2
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.13.2
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * The type of query
     *
     * @since 1.13.2
     */
    public enum QueryType {
        /**
         * Basic query asks only a subset of information, such as motd, game type (hardcoded to <pre>MINECRAFT</pre>), map,
         * current players, max players, server port and server motd
         *
         * @since 1.13.2
         */
        BASIC,

        /**
         * Full query asks pretty much everything present on this event (only hardcoded values cannot be modified here).
         *
         * @since 1.13.2
         */
        FULL
    }

    /**
     * @since 1.13.2
     */
    public static final class QueryResponse {

        private final String motd;
        private final String gameVersion;
        private final String map;
        private final int currentPlayers;
        private final int maxPlayers;
        private final String hostname;
        private final int port;
        private final Collection<String> players;
        private final String serverVersion;
        private final Collection<PluginInformation> plugins;

        private QueryResponse(final String motd, final String gameVersion, final String map, final int currentPlayers, final int maxPlayers, final String hostname, final int port, final Collection<String> players, final String serverVersion, final Collection<PluginInformation> plugins) {
            this.motd = motd;
            this.gameVersion = gameVersion;
            this.map = map;
            this.currentPlayers = currentPlayers;
            this.maxPlayers = maxPlayers;
            this.hostname = hostname;
            this.port = port;
            this.players = players;
            this.serverVersion = serverVersion;
            this.plugins = plugins;
        }

        /**
         * Get motd which will be used to reply to the query. By default, it is {@link Server#getMotd()}.
         *
         * @return motd
         * @since 1.13.2
         */
        public String getMotd() {
            return this.motd;
        }

        /**
         * Get game version which will be used to reply to the query. By default, supported Minecraft versions range is sent.
         *
         * @return game version
         * @since 1.13.2
         */
        public String getGameVersion() {
            return this.gameVersion;
        }

        /**
         * Get map name which will be used to reply to the query. By default {@code world} is sent.
         *
         * @return map name
         * @since 1.13.2
         */
        public String getMap() {
            return this.map;
        }

        /**
         * Get current online player count which will be used to reply to the query.
         *
         * @return online player count
         * @since 1.13.2
         */
        public int getCurrentPlayers() {
            return this.currentPlayers;
        }

        /**
         * Get max player count which will be used to reply to the query.
         *
         * @return max player count
         * @since 1.13.2
         */
        public int getMaxPlayers() {
            return this.maxPlayers;
        }

        /**
         * Get server (public facing) hostname.
         *
         * @return server hostname
         * @since 1.13.2
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * Get server (public facing) port.
         *
         * @return server port
         * @since 1.13.2
         */
        public int getPort() {
            return this.port;
        }

        /**
         * Get collection of players which will be used to reply to the query.
         *
         * @return collection of players
         * @since 1.13.2
         */
        public Collection<String> getPlayers() {
            return this.players;
        }

        /**
         * Get server software (name and version) which will be used to reply to the query.
         *
         * @return server software
         * @since 1.13.2
         */
        public String getServerVersion() {
            return this.serverVersion;
        }

        /**
         * Get list of plugins which will be used to reply to the query.
         *
         * @return collection of plugins
         * @since 1.13.2
         */
        public Collection<PluginInformation> getPlugins() {
            return this.plugins;
        }

        /**
         * Creates a new {@link Builder} instance from data represented by this response.
         *
         * @return {@link QueryResponse} builder
         * @since 1.13.2
         */
        public Builder toBuilder() {
            return QueryResponse.builder()
                .motd(this.getMotd())
                .gameVersion(this.getGameVersion())
                .map(this.getMap())
                .currentPlayers(this.getCurrentPlayers())
                .maxPlayers(this.getMaxPlayers())
                .hostname(this.getHostname())
                .port(this.getPort())
                .players(this.getPlayers())
                .serverVersion(this.getServerVersion())
                .plugins(this.getPlugins());
        }

        /**
         * Creates a new {@link Builder} instance.
         *
         * @return {@link QueryResponse} builder
         * @since 1.13.2
         */
        public static Builder builder() {
            return new Builder();
        }

        /**
         * A builder for {@link QueryResponse} objects.
         *
         * @since 1.13.2
         */
        public static final class Builder {

            private @MonotonicNonNull String motd;
            private @MonotonicNonNull String gameVersion;
            private @MonotonicNonNull String map;
            private @MonotonicNonNull String hostname;
            private @MonotonicNonNull String serverVersion;

            private int currentPlayers;
            private int maxPlayers;
            private int port;

            private final List<String> players = new ArrayList<>();
            private final List<PluginInformation> plugins = new ArrayList<>();

            private Builder() {
            }

            /**
             * @since 1.13.2
             */
            public Builder motd(final String motd) {
                this.motd = Preconditions.checkNotNull(motd, "motd");
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder gameVersion(final String gameVersion) {
                this.gameVersion = Preconditions.checkNotNull(gameVersion, "gameVersion");
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder map(final String map) {
                this.map = Preconditions.checkNotNull(map, "map");
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder currentPlayers(final int currentPlayers) {
                Preconditions.checkArgument(currentPlayers >= 0, "currentPlayers cannot be negative");
                this.currentPlayers = currentPlayers;
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder maxPlayers(final int maxPlayers) {
                Preconditions.checkArgument(maxPlayers >= 0, "maxPlayers cannot be negative");
                this.maxPlayers = maxPlayers;
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder hostname(final String hostname) {
                this.hostname = Preconditions.checkNotNull(hostname, "hostname");
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder port(final int port) {
                Preconditions.checkArgument(port >= 1 && port <= 65535, "port must be between 1-65535");
                this.port = port;
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder players(final Collection<String> players) {
                this.players.addAll(Preconditions.checkNotNull(players, "players"));
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder players(final String... players) {
                this.players.addAll(Arrays.asList(Preconditions.checkNotNull(players, "players")));
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder clearPlayers() {
                this.players.clear();
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder serverVersion(final String serverVersion) {
                this.serverVersion = Preconditions.checkNotNull(serverVersion, "serverVersion");
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder plugins(final Collection<PluginInformation> plugins) {
                this.plugins.addAll(Preconditions.checkNotNull(plugins, "plugins"));
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder plugins(final PluginInformation... plugins) {
                this.plugins.addAll(Arrays.asList(Preconditions.checkNotNull(plugins, "plugins")));
                return this;
            }

            /**
             * @since 1.13.2
             */
            public Builder clearPlugins() {
                this.plugins.clear();
                return this;
            }

            /**
             * Builds new {@link QueryResponse} with supplied data.
             *
             * @return response
             * @since 1.13.2
             */
            public QueryResponse build() {
                return new QueryResponse(
                    Preconditions.checkNotNull(this.motd, "motd"),
                    Preconditions.checkNotNull(this.gameVersion, "gameVersion"),
                    Preconditions.checkNotNull(this.map, "map"),
                    this.currentPlayers,
                    this.maxPlayers,
                    Preconditions.checkNotNull(this.hostname, "hostname"),
                    this.port,
                    ImmutableList.copyOf(this.players),
                    Preconditions.checkNotNull(this.serverVersion, "serverVersion"),
                    ImmutableList.copyOf(this.plugins)
                );
            }
        }

        /**
         * Plugin information
         *
         * @since 1.13.2
         */
        public static class PluginInformation {

            private String name;
            private String version;

            /**
             * @since 1.13.2
             */
            public PluginInformation(final String name, final String version) {
                this.name = Preconditions.checkNotNull(name, "name");
                this.version = Preconditions.checkNotNull(version, "version");
            }

            /**
             * @since 1.13.2
             */
            public String getName() {
                return this.name;
            }

            /**
             * @since 1.13.2
             */
            public void setName(final String name) {
                this.name = name;
            }

            /**
             * @since 1.13.2
             */
            public void setVersion(final String version) {
                this.version = version;
            }

            /**
             * @since 1.13.2
             */
            public String getVersion() {
                return this.version;
            }

            /**
             * @since 1.13.2
             */
            public static PluginInformation of(final String name, final String version) {
                return new PluginInformation(name, version);
            }
        }
    }
}
