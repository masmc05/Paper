package org.bukkit.entity;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.11
 */
@NullMarked
public interface ZombieNautilus extends AbstractNautilus {

    /**
     * Gets the variant of this zombie nautilus.
     *
     * @return the variant
     * @since 1.21.11
     */
    Variant getVariant();

    /**
     * Sets the variant of this zombie nautilus.
     *
     * @param variant the variant
     * @since 1.21.11
     */
    void setVariant(Variant variant);

    /**
     * Represents the variant of a Zombie Nautilus.
     *
     * @since 1.21.11
     */
    interface Variant extends Keyed {

        /**
         * @since 1.21.11
         */
        // Start generate - ZombieNautilusVariant
        Variant TEMPERATE = getVariant("temperate");

        /**
         * @since 1.21.11
         */
        Variant WARM = getVariant("warm");
        // End generate - ZombieNautilusVariant

        private static Variant getVariant(@KeyPattern.Value String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.ZOMBIE_NAUTILUS_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }
}
