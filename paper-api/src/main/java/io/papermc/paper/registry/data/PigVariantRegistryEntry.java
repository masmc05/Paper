package io.papermc.paper.registry.data;

import io.papermc.paper.registry.RegistryBuilder;
import io.papermc.paper.registry.data.client.ClientTextureAsset;
import org.bukkit.entity.Pig;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

/**
 * A data-centric version-specific registry entry for the {@link Pig.Variant} type.
 *
 * @since 1.21.6
 */
@ApiStatus.NonExtendable
public interface PigVariantRegistryEntry {

    /**
     * The model of the pig variant to render the configured texture on.
     *
     * @since 1.21.6
     */
    enum Model {
        /**
         * The normal pig model.
         *
         * @since 1.21.6
         */
        NORMAL,

        /**
         * The cold pig model.
         *
         * @since 1.21.6
         */
        COLD,
    }

    /**
     * Provides the client texture asset of the pig variant, which represents the texture to use.
     *
     * @return the client texture asset
     * @since 1.21.6
     */
    ClientTextureAsset clientTextureAsset();

    /**
     * Provides the client texture asset of the baby pig variant, which represents the texture to use.
     *
     * @return the baby client texture asset
     * @since 26.2
     */
    ClientTextureAsset babyClientTextureAsset();

    /**
     * Provides the model of the pig variant.
     *
     * @return the model
     * @since 1.21.6
     */
    Model model();

    /**
     * A mutable builder for the {@link PigVariantRegistryEntry} plugins may change in applicable registry events.
     * <p>
     * The following values are required for each builder:
     * <ul>
     *     <li>{@link #clientTextureAsset(ClientTextureAsset)}</li>
     *     <li>{@link #babyClientTextureAsset(ClientTextureAsset)}</li>
     *     <li>{@link #model(Model)}</li>
     * </ul>
     *
     * @since 1.21.6
     */
    @ApiStatus.NonExtendable
    interface Builder extends PigVariantRegistryEntry, RegistryBuilder<Pig.Variant> {

        /**
         * Sets the client texture asset of the pig variant, which is the location of the texture to use.
         *
         * @param clientTextureAsset the client texture asset
         * @return this builder instance
         * @see PigVariantRegistryEntry#clientTextureAsset()
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder clientTextureAsset(ClientTextureAsset clientTextureAsset);

        /**
         * Sets the client texture asset of the baby pig variant, which is the location of the texture to use.
         *
         * @param babyClientTextureAsset the baby client texture asset
         * @return this builder instance
         * @see PigVariantRegistryEntry#babyClientTextureAsset()
         * @since 26.2
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder babyClientTextureAsset(ClientTextureAsset babyClientTextureAsset);

        /**
         * Sets the model to use for this pig variant.
         *
         * @param model the model
         * @return this builder instance
         * @see PigVariantRegistryEntry#model()
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder model(Model model);
    }
}
