package org.bukkit.entity;

import com.google.common.base.Preconditions;
import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import java.util.Locale;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Frog.
 *
 * @since 1.19
 */
public interface Frog extends Animals {

    /**
     * Gets the tongue target of this frog.
     *
     * @return tongue target or null if not set
     * @since 1.19
     */
    @Nullable
    Entity getTongueTarget();

    /**
     * Sets the tongue target of this frog.
     *
     * @param target tongue target or null to clear
     * @since 1.19
     */
    void setTongueTarget(@Nullable Entity target);

    /**
     * Get the variant of this frog.
     *
     * @return frog variant
     * @since 1.19
     */
    @NotNull
    Variant getVariant();

    /**
     * Set the variant of this frog.
     *
     * @param variant frog variant
     * @since 1.19
     */
    void setVariant(@NotNull Variant variant);

    /**
     * Represents the variant of a frog - ie its color.
     *
     * @since 1.19
     */
    interface Variant extends OldEnum<Variant>, Keyed {

        /**
         * @since 1.19
         */
        // Start generate - FrogVariant
        Variant COLD = getVariant("cold");

        /**
         * @since 1.19
         */
        Variant TEMPERATE = getVariant("temperate");

        /**
         * @since 1.19
         */
        Variant WARM = getVariant("warm");
        // End generate - FrogVariant

        @NotNull
        private static Variant getVariant(@NotNull @KeyPattern.Value String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.FROG_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }

        /**
         * @param name of the frog variant.
         * @return the frog variant with the given name.
         * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
         */
        @NotNull
        @Deprecated(since = "1.21", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
        static Variant valueOf(@NotNull String name) {
            final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
            Variant variant = key == null ? null : RegistryAccess.registryAccess().getRegistry(RegistryKey.FROG_VARIANT).get(key);
            Preconditions.checkArgument(variant != null, "No frog variant found with the name %s", name);
            return variant;
        }

        /**
         * @return an array of all known frog variants.
         * @deprecated use {@link Registry#stream()}.
         */
        @NotNull
        @Deprecated(since = "1.21", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
        static Variant[] values() {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.FROG_VARIANT).stream().toArray(Variant[]::new);
        }
    }
}
