package org.bukkit.entity;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a Pig.
 *
 * @since 1.0.0
 */
@NullMarked
public interface Pig extends Steerable, Vehicle {

    /**
     * Gets the variant of this pig.
     *
     * @return the pig variant
     * @since 1.21.6
     */
    Variant getVariant();

    /**
     * Sets the variant of this pig.
     *
     * @param variant the pig variant
     * @since 1.21.6
     */
    void setVariant(Variant variant);

    /**
     * Get the sound variant of this pig.
     *
     * @return pig sound variant
     * @since 26.2
     */
    SoundVariant getSoundVariant();

    /**
     * Set the sound variant of this pig.
     *
     * @param variant pig sound variant
     * @since 26.2
     */
    void setSoundVariant(SoundVariant variant);

    /**
     * Represents the variant of a pig.
     *
     * @since 1.21.6
     */
    interface Variant extends Keyed {

        /**
         * @since 1.21.6
         */
        // Start generate - PigVariant
        Variant COLD = getVariant("cold");

        /**
         * @since 1.21.6
         */
        Variant TEMPERATE = getVariant("temperate");

        /**
         * @since 1.21.6
         */
        Variant WARM = getVariant("warm");
        // End generate - PigVariant

        private static Variant getVariant(@KeyPattern.Value final String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.PIG_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }

    /**
     * Represents the sound variant of a pig.
     *
     * @since 26.2
     */
    interface SoundVariant extends Keyed {

        /**
         * @since 26.2
         */
        // Start generate - PigSoundVariant
        SoundVariant BIG = getSoundVariant("big");

        /**
         * @since 26.2
         */
        SoundVariant CLASSIC = getSoundVariant("classic");

        /**
         * @since 26.2
         */
        SoundVariant MINI = getSoundVariant("mini");
        // End generate - PigSoundVariant

        private static SoundVariant getSoundVariant(@KeyPattern.Value final String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.PIG_SOUND_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }
}
