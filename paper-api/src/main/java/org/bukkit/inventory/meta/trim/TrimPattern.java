package org.bukkit.inventory.meta.trim;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryBuilderFactory;
import io.papermc.paper.registry.RegistryKey;
import io.papermc.paper.registry.data.InlinedRegistryBuilderProvider;
import io.papermc.paper.registry.data.TrimPatternRegistryEntry;
import java.util.function.Consumer;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import net.kyori.adventure.text.Component;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.Translatable;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a pattern that may be used in an {@link ArmorTrim}.
 *
 * @since 1.19.4
 */
@NullMarked
public interface TrimPattern extends Keyed, Translatable {

    /**
     * Creates an inlined trim pattern.
     *
     * @param value a consumer for the builder factory
     * @return the created trim pattern
     * @since 26.2
     */
    static TrimPattern create(final Consumer<RegistryBuilderFactory<TrimPattern, ? extends TrimPatternRegistryEntry.Builder>> value) {
        return InlinedRegistryBuilderProvider.instance().createTrimPattern(value);
    }

    /**
     * @since 1.20.6
     */
    // Start generate - TrimPattern
    TrimPattern BOLT = getTrimPattern("bolt");

    /**
     * @since 1.19.4
     */
    TrimPattern COAST = getTrimPattern("coast");

    /**
     * @since 1.19.4
     */
    TrimPattern DUNE = getTrimPattern("dune");

    /**
     * @since 1.19.4
     */
    TrimPattern EYE = getTrimPattern("eye");

    /**
     * @since 1.20.6
     */
    TrimPattern FLOW = getTrimPattern("flow");

    /**
     * @since 1.20
     */
    TrimPattern HOST = getTrimPattern("host");

    /**
     * @since 1.20
     */
    TrimPattern RAISER = getTrimPattern("raiser");

    /**
     * @since 1.19.4
     */
    TrimPattern RIB = getTrimPattern("rib");

    /**
     * @since 1.19.4
     */
    TrimPattern SENTRY = getTrimPattern("sentry");

    /**
     * @since 1.20
     */
    TrimPattern SHAPER = getTrimPattern("shaper");

    /**
     * @since 1.20
     */
    TrimPattern SILENCE = getTrimPattern("silence");

    /**
     * @since 1.19.4
     */
    TrimPattern SNOUT = getTrimPattern("snout");

    /**
     * @since 1.19.4
     */
    TrimPattern SPIRE = getTrimPattern("spire");

    /**
     * @since 1.19.4
     */
    TrimPattern TIDE = getTrimPattern("tide");

    /**
     * @since 1.19.4
     */
    TrimPattern VEX = getTrimPattern("vex");

    /**
     * @since 1.19.4
     */
    TrimPattern WARD = getTrimPattern("ward");

    /**
     * @since 1.20
     */
    TrimPattern WAYFINDER = getTrimPattern("wayfinder");

    /**
     * @since 1.19.4
     */
    TrimPattern WILD = getTrimPattern("wild");
    // End generate - TrimPattern

    private static TrimPattern getTrimPattern(final @KeyPattern.Value String key) {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.TRIM_PATTERN).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    // Paper start - adventure
    /**
     * Get the description of this {@link TrimPattern}.
     *
     * @return the description
     * @since 1.20.4
     */
    Component description();

    /**
     * @deprecated this method assumes that {@link #description()} will
     * always be a translatable component which is not guaranteed.
     */
    @Override
    @Deprecated(forRemoval = true)
    String getTranslationKey();
    // Paper end - adventure

    // Paper start - Registry#getKey
    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#TRIM_PATTERN}. TrimPatterns can exist without a key.
     */
    @Deprecated(forRemoval = true, since = "1.20.4")
    @Override
    NamespacedKey getKey();

    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#TRIM_PATTERN}. TrimPatterns can exist without a key.
     */
    @Deprecated(forRemoval = true, since = "1.20.4")
    @Override
    default Key key() {
        return Keyed.super.key();
    }
    // Paper end - Registry#getKey
}
