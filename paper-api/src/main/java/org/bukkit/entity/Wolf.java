package org.bukkit.entity;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.DyeColor;
import org.bukkit.Keyed;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a Wolf
 *
 * @since 1.0.0
 */
public interface Wolf extends Tameable, Sittable, io.papermc.paper.entity.CollarColorable { // Paper - CollarColorable

    /**
     * Checks if this wolf is angry
     *
     * @return Anger true if angry
     * @since 1.0.0
     */
    public boolean isAngry();

    /**
     * Sets the anger of this wolf.
     * <p>
     * An angry wolf can not be fed or tamed.
     *
     * @param angry true if angry
     * @see #setTarget(org.bukkit.entity.LivingEntity)
     * @since 1.0.0
     */
    public void setAngry(boolean angry);

    /**
     * Get the collar color of this wolf
     *
     * @return the color of the collar
     * @since 1.4.5
     */
    @NotNull
    @Override // Paper
    public DyeColor getCollarColor();

    /**
     * Set the collar color of this wolf
     *
     * @param color the color to apply
     * @since 1.4.5
     */
    @Override // Paper
    public void setCollarColor(@NotNull DyeColor color);

    /**
     * Gets whether the wolf is wet
     *
     * @return Whether the wolf is wet
     * @since 1.19
     */
    public boolean isWet();

    /**
     * Gets the wolf's tail angle in radians
     *
     * @return The angle of the wolf's tail in radians
     * @since 1.19
     */
    public float getTailAngle();

    /**
     * Gets if the wolf is interested
     *
     * @return Whether the wolf is interested
     * @since 1.18.2
     */
    public boolean isInterested();

    /**
     * Set wolf to be interested
     *
     * @param interested Whether the wolf is interested
     * @since 1.18.2
     */
    public void setInterested(boolean interested);

    /**
     * Get the variant of this wolf.
     *
     * @return wolf variant
     * @since 1.20.6
     */
    @NotNull
    Variant getVariant();

    /**
     * Set the variant of this wolf.
     *
     * @param variant wolf variant
     * @since 1.20.6
     */
    void setVariant(@NotNull Variant variant);

    /**
     * Get the sound variant of this wolf.
     *
     * @return wolf sound variant
     * @since 1.21.6
     */
    @NotNull
    SoundVariant getSoundVariant();

    /**
     * Set the sound variant of this wolf.
     *
     * @param soundVariant wolf sound variant
     * @since 1.21.6
     */
    void setSoundVariant(@NotNull SoundVariant soundVariant);

    /**
     * Represents the variant of a wolf.
     *
     * @since 1.20.6
     */
    interface Variant extends Keyed {

        /**
         * @since 1.20.6
         */
        // Start generate - WolfVariant
        // @GeneratedFrom 1.21.5
        Variant ASHEN = getVariant("ashen");

        /**
         * @since 1.20.6
         */
        Variant BLACK = getVariant("black");

        /**
         * @since 1.20.6
         */
        Variant CHESTNUT = getVariant("chestnut");

        /**
         * @since 1.20.6
         */
        Variant PALE = getVariant("pale");

        /**
         * @since 1.20.6
         */
        Variant RUSTY = getVariant("rusty");

        /**
         * @since 1.20.6
         */
        Variant SNOWY = getVariant("snowy");

        /**
         * @since 1.20.6
         */
        Variant SPOTTED = getVariant("spotted");

        /**
         * @since 1.20.6
         */
        Variant STRIPED = getVariant("striped");

        /**
         * @since 1.20.6
         */
        Variant WOODS = getVariant("woods");
        // End generate - WolfVariant

        @NotNull
        private static Variant getVariant(@NotNull @KeyPattern.Value String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.WOLF_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }

    /**
     * Represents the sound variant of a wolf.
     *
     * @since 1.21.6
     */
    interface SoundVariant extends Keyed {

        /**
         * @since 1.21.6
         */
        // Start generate - WolfSoundVariant
        SoundVariant ANGRY = getSoundVariant("angry");

        /**
         * @since 1.21.6
         */
        SoundVariant BIG = getSoundVariant("big");

        /**
         * @since 1.21.6
         */
        SoundVariant CLASSIC = getSoundVariant("classic");

        /**
         * @since 1.21.6
         */
        SoundVariant CUTE = getSoundVariant("cute");

        /**
         * @since 1.21.6
         */
        SoundVariant GRUMPY = getSoundVariant("grumpy");

        /**
         * @since 1.21.6
         */
        SoundVariant PUGLIN = getSoundVariant("puglin");

        /**
         * @since 1.21.6
         */
        SoundVariant SAD = getSoundVariant("sad");
        // End generate - WolfSoundVariant

        @NotNull
        private static SoundVariant getSoundVariant(@NotNull @KeyPattern.Value String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.WOLF_SOUND_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }
}
