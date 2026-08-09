package io.papermc.paper.registry.data;

import io.papermc.paper.registry.RegistryBuilder;
import net.kyori.adventure.key.Key;
import org.bukkit.block.banner.PatternType;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

/**
 * A data-centric version-specific registry entry for the {@link PatternType} type.
 *
 * @since 1.21.4
 */
@ApiStatus.NonExtendable
public interface BannerPatternRegistryEntry {

    /**
     * Provides the asset id of the pattern type, which is the location of the sprite to use.
     *
     * @return the asset id
     * @since 1.21.4
     */
    Key assetId();

    /**
     * Provides the translation key for displaying the pattern inside the banner's tooltip.
     *
     * @return the translation key
     * @since 1.21.4
     */
    String translationKey();

    /**
     * A mutable builder for the {@link BannerPatternRegistryEntry} plugins may change in applicable registry events.
     * <p>
     * The following values are required for each builder:
     * <ul>
     *     <li>{@link #assetId(Key)}</li>
     *     <li>{@link #translationKey(String)}</li>
     * </ul>
     *
     * @since 1.21.4
     */
    @ApiStatus.NonExtendable
    interface Builder extends BannerPatternRegistryEntry, RegistryBuilder<PatternType> {

        /**
         * Sets the asset id of the pattern type, which is the location of the sprite to use.
         *
         * @param assetId the asset id
         * @return this builder instance
         * @see BannerPatternRegistryEntry#assetId()
         * @since 1.21.4
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder assetId(Key assetId);

        /**
         * Sets the translation key for displaying the pattern inside the banner's tooltip.
         *
         * @param translationKey the translation key
         * @return this builder instance
         * @see BannerPatternRegistryEntry#translationKey()
         * @since 1.21.4
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder translationKey(String translationKey);
    }
}
