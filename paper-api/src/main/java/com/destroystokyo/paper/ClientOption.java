package com.destroystokyo.paper;

import java.util.Locale;
import net.kyori.adventure.translation.Translatable;
import net.kyori.adventure.util.Index;
import org.bukkit.inventory.MainHand;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.15.2
 */
@NullMarked
public final class ClientOption<T> {

    /**
     * @since 1.15.2
     */
    public static final ClientOption<SkinParts> SKIN_PARTS = new ClientOption<>(SkinParts.class);
    /**
     * @since 1.15.2
     */
    public static final ClientOption<Boolean> CHAT_COLORS_ENABLED = new ClientOption<>(Boolean.class);
    /**
     * @since 1.15.2
     */
    public static final ClientOption<ChatVisibility> CHAT_VISIBILITY = new ClientOption<>(ChatVisibility.class);
    /**
     * @since 1.15.2
     */
    public static final ClientOption<String> LOCALE = new ClientOption<>(String.class);
    /**
     * @since 1.15.2
     */
    public static final ClientOption<MainHand> MAIN_HAND = new ClientOption<>(MainHand.class);
    /**
     * @since 1.15.2
     */
    public static final ClientOption<Integer> VIEW_DISTANCE = new ClientOption<>(Integer.class);
    /**
     * @since 1.19.2
     */
    public static final ClientOption<Boolean> TEXT_FILTERING_ENABLED = new ClientOption<>(Boolean.class);
    /**
     * @since 1.19.2
     */
    public static final ClientOption<Boolean> ALLOW_SERVER_LISTINGS = new ClientOption<>(Boolean.class);
    /**
     * @since 1.21.3
     */
    public static final ClientOption<ParticleVisibility> PARTICLE_VISIBILITY = new ClientOption<>(ParticleVisibility.class);

    private final Class<T> type;

    private ClientOption(final Class<T> type) {
        this.type = type;
    }

    /**
     * @since 1.15.2
     */
    public Class<T> getType() {
        return this.type;
    }

    /**
     * @since 1.15.2
     */
    public enum ChatVisibility implements Translatable {
        /**
         * @since 1.15.2
         */
        // Start generate - ChatVisibility
        FULL("options.chat.visibility.full"),
        /**
         * @since 1.15.2
         */
        SYSTEM("options.chat.visibility.system"),
        /**
         * @since 1.15.2
         */
        HIDDEN("options.chat.visibility.hidden"),
        // End generate - ChatVisibility
        /**
         * @deprecated no longer used anymore since 1.15.2, the value fallback
         * to the default value of the setting when unknown on the server.
         * In this case {@link #FULL} will be returned.
         */
        @Deprecated(since = "1.15.2", forRemoval = true)
        UNKNOWN("unknown");

        /**
         * @since 1.17.1
         */
        public static final Index<String, ChatVisibility> NAMES = Index.create(ChatVisibility.class, chatVisibility -> chatVisibility.name().toLowerCase(Locale.ENGLISH));
        private final String translationKey;

        ChatVisibility(final String translationKey) {
            this.translationKey = translationKey;
        }

        /**
         * {@inheritDoc}
         * @since 1.17.1
         */
        @Override
        public String translationKey() {
            if (this == UNKNOWN) {
                throw new UnsupportedOperationException(this.name() + " doesn't have a translation key");
            }
            return this.translationKey;
        }
    }

    /**
     * @since 1.21.3
     */
    public enum ParticleVisibility implements Translatable {
        /**
         * @since 1.21.3
         */
        // Start generate - ParticleVisibility
        ALL("options.particles.all"),
        /**
         * @since 1.21.3
         */
        DECREASED("options.particles.decreased"),
        /**
         * @since 1.21.3
         */
        MINIMAL("options.particles.minimal");
        // End generate - ParticleVisibility

        /**
         * @since 1.21.3
         */
        public static final Index<String, ParticleVisibility> NAMES = Index.create(ParticleVisibility.class, particleVisibility -> particleVisibility.name().toLowerCase(Locale.ENGLISH));
        private final String translationKey;

        ParticleVisibility(final String translationKey) {
            this.translationKey = translationKey;
        }

        /**
         * {@inheritDoc}
         * @since 1.21.3
         */
        @Override
        public String translationKey() {
            return this.translationKey;
        }
    }
}
