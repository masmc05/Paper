package io.papermc.paper.registry.data;

import io.papermc.paper.registry.RegistryBuilder;
import io.papermc.paper.registry.data.client.ClientTextureAsset;
import org.bukkit.entity.Cat;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

/**
 * A data-centric version-specific registry entry for the {@link Cat.Type} type.
 *
 * @since 1.21.6
 */
@ApiStatus.NonExtendable
public interface CatTypeRegistryEntry {

    /**
     * Provides the client texture asset of the cat type, which represents the texture to use.
     *
     * @return the client texture asset
     * @since 1.21.6
     */
    ClientTextureAsset clientTextureAsset();

    /**
     * Provides the client texture asset of the cat type for baby cats.
     *
     * @return the baby client texture asset
     * @since 26.2
     */
    ClientTextureAsset babyClientTextureAsset();

    /**
     * A mutable builder for the {@link CatTypeRegistryEntry} plugins may change in applicable registry events.
     * <p>
     * The following values are required for each builder:
     * <ul>
     *     <li>{@link #clientTextureAsset(ClientTextureAsset)}</li>
     *     <li>{@link #babyClientTextureAsset(ClientTextureAsset)}</li>
     * </ul>
     *
     * @since 1.21.6
     */
    @ApiStatus.NonExtendable
    interface Builder extends CatTypeRegistryEntry, RegistryBuilder<Cat.Type> {

        /**
         * Sets the client texture asset of the cat type, which is the location of the texture to use.
         *
         * @param clientTextureAsset the client texture asset
         * @return this builder instance
         * @see CatTypeRegistryEntry#clientTextureAsset()
         * @since 1.21.6
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder clientTextureAsset(ClientTextureAsset clientTextureAsset);

        /**
         * Sets the client texture asset of the cat type for baby cats.
         *
         * @param babyClientTextureAsset the baby client texture asset
         * @return this builder instance
         * @see CatTypeRegistryEntry#babyClientTextureAsset()
         * @since 26.2
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder babyClientTextureAsset(ClientTextureAsset babyClientTextureAsset);
    }
}
