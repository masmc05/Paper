package org.bukkit.inventory.meta.trim;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryBuilderFactory;
import io.papermc.paper.registry.RegistryKey;
import io.papermc.paper.registry.data.InlinedRegistryBuilderProvider;
import io.papermc.paper.registry.data.TrimMaterialRegistryEntry;
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
 * Represents a material that may be used in an {@link ArmorTrim}.
 *
 * @since 1.19.4
 */
@NullMarked
public interface TrimMaterial extends Keyed, Translatable {

    /**
     * Creates an inlined trim material.
     *
     * @param value a consumer for the builder factory
     * @return the created trim material
     * @since 26.2
     */
    static TrimMaterial create(final Consumer<RegistryBuilderFactory<TrimMaterial, ? extends TrimMaterialRegistryEntry.Builder>> value) {
        return InlinedRegistryBuilderProvider.instance().createTrimMaterial(value);
    }

    /**
     * @since 1.19.4
     */
    // Start generate - TrimMaterial
    TrimMaterial AMETHYST = getTrimMaterial("amethyst");

    /**
     * @since 1.19.4
     */
    TrimMaterial COPPER = getTrimMaterial("copper");

    /**
     * @since 1.19.4
     */
    TrimMaterial DIAMOND = getTrimMaterial("diamond");

    /**
     * @since 1.19.4
     */
    TrimMaterial EMERALD = getTrimMaterial("emerald");

    /**
     * @since 1.19.4
     */
    TrimMaterial GOLD = getTrimMaterial("gold");

    /**
     * @since 1.19.4
     */
    TrimMaterial IRON = getTrimMaterial("iron");

    /**
     * @since 1.19.4
     */
    TrimMaterial LAPIS = getTrimMaterial("lapis");

    /**
     * @since 1.19.4
     */
    TrimMaterial NETHERITE = getTrimMaterial("netherite");

    /**
     * @since 1.19.4
     */
    TrimMaterial QUARTZ = getTrimMaterial("quartz");

    /**
     * @since 1.19.4
     */
    TrimMaterial REDSTONE = getTrimMaterial("redstone");

    /**
     * @since 1.21.4
     */
    TrimMaterial RESIN = getTrimMaterial("resin");
    // End generate - TrimMaterial

    private static TrimMaterial getTrimMaterial(final @KeyPattern.Value String key) {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.TRIM_MATERIAL).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * Get the description of this {@link TrimMaterial}.
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

    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#TRIM_MATERIAL}. TrimMaterials can exist without a key.
     */
    @Deprecated(forRemoval = true, since = "1.20.4")
    @Override
    NamespacedKey getKey();

    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#TRIM_MATERIAL}. TrimMaterials can exist without a key.
     */
    @Deprecated(forRemoval = true, since = "1.20.4")
    @Override
    default Key key() {
        return Keyed.super.key();
    }
}
