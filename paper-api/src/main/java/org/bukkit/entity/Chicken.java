package org.bukkit.entity;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a Chicken.
 *
 * @since 1.0.0
 */
@NullMarked
public interface Chicken extends Animals {

    /**
     * Gets the variant of this chicken.
     *
     * @return the chicken variant
     * @since 1.21.6
     */
    Variant getVariant();

    /**
     * Sets the variant of this chicken.
     *
     * @param variant the chicken variant
     * @since 1.21.6
     */
    void setVariant(Variant variant);

    /**
     * Get the sound variant of this chicken.
     *
     * @return chicken sound variant
     * @since 26.2
     */
    SoundVariant getSoundVariant();

    /**
     * Set the sound variant of this chicken.
     *
     * @param variant chicken sound variant
     * @since 26.2
     */
    void setSoundVariant(SoundVariant variant);

    /**
     * Gets if this chicken was spawned as a chicken jockey.
     *
     * @return is chicken jockey
     * @since 1.19.2
     */
    boolean isChickenJockey();

    /**
     * Sets if this chicken was spawned as a chicken jockey.
     *
     * @param isChickenJockey is chicken jockey
     * @since 1.19.2
     */
    void setIsChickenJockey(boolean isChickenJockey);

    /**
     * Gets the number of ticks till this chicken lays an egg.
     *
     * @return ticks till the chicken lays an egg
     * @since 1.19.2
     */
    int getEggLayTime();

    /**
     * Sets the number of ticks till this chicken lays an egg.
     *
     * @param eggLayTime ticks till the chicken lays an egg
     * @since 1.19.2
     */
    void setEggLayTime(int eggLayTime);

    /**
     * Represents the variant of a chicken.
     *
     * @since 1.21.6
     */
    interface Variant extends Keyed {

        /**
         * @since 1.21.6
         */
        // Start generate - ChickenVariant
        Variant COLD = getVariant("cold");

        /**
         * @since 1.21.6
         */
        Variant TEMPERATE = getVariant("temperate");

        /**
         * @since 1.21.6
         */
        Variant WARM = getVariant("warm");
        // End generate - ChickenVariant

        private static Variant getVariant(@KeyPattern.Value final String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.CHICKEN_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }

    /**
     * Represents the sound variant of a chicken.
     *
     * @since 26.2
     */
    interface SoundVariant extends Keyed {

        /**
         * @since 26.2
         */
        // Start generate - ChickenSoundVariant
        SoundVariant CLASSIC = getSoundVariant("classic");

        /**
         * @since 26.2
         */
        SoundVariant PICKY = getSoundVariant("picky");
        // End generate - ChickenSoundVariant

        private static SoundVariant getSoundVariant(@KeyPattern.Value final String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.CHICKEN_SOUND_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }
}
