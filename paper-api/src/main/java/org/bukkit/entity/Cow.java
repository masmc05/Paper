package org.bukkit.entity;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a Cow.
 *
 * @since 1.0.0
 */
@NullMarked
public interface Cow extends AbstractCow {

    /**
     * Gets the variant of this cow.
     *
     * @return the cow variant
     * @since 1.21.6
     */
    Variant getVariant();

    /**
     * Sets the variant of this cow.
     *
     * @param variant the cow variant
     * @since 1.21.6
     */
    void setVariant(Variant variant);

    /**
     * Get the sound variant of this cow.
     *
     * @return cow sound variant
     * @since 26.2
     */
    SoundVariant getSoundVariant();

    /**
     * Set the sound variant of this cow.
     *
     * @param variant cow sound variant
     * @since 26.2
     */
    void setSoundVariant(SoundVariant variant);

    /**
     * Represents the variant of a cow.
     *
     * @since 1.21.6
     */
    interface Variant extends Keyed {

        /**
         * @since 1.21.6
         */
        // Start generate - CowVariant
        Variant COLD = getVariant("cold");

        /**
         * @since 1.21.6
         */
        Variant TEMPERATE = getVariant("temperate");

        /**
         * @since 1.21.6
         */
        Variant WARM = getVariant("warm");
        // End generate - CowVariant

        private static Variant getVariant(@KeyPattern.Value final String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.COW_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }

    /**
     * Represents the sound variant of a cow.
     *
     * @since 26.2
     */
    interface SoundVariant extends Keyed {

        /**
         * @since 26.2
         */
        // Start generate - CowSoundVariant
        SoundVariant CLASSIC = getSoundVariant("classic");

        /**
         * @since 26.2
         */
        SoundVariant MOODY = getSoundVariant("moody");
        // End generate - CowSoundVariant

        private static SoundVariant getSoundVariant(@KeyPattern.Value final String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.COW_SOUND_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }
}
