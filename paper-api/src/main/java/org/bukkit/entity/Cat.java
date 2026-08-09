package org.bukkit.entity;

import com.google.common.base.Preconditions;
import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import java.util.Locale;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.DyeColor;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Meow.
 *
 * @since 1.14
 */
public interface Cat extends Tameable, Sittable, io.papermc.paper.entity.CollarColorable { // Paper - CollarColorable

    /**
     * Gets the current type of this cat.
     *
     * @return Type of the cat.
     * @since 1.14
     */
    @NotNull
    public Type getCatType();

    /**
     * Sets the current type of this cat.
     *
     * @param type New type of this cat.
     * @since 1.14
     */
    public void setCatType(@NotNull Type type);

    /**
     * Get the sound variant of this cat.
     *
     * @return cat sound variant
     * @since 26.2
     */
    @NotNull
    SoundVariant getSoundVariant();

    /**
     * Set the sound variant of this cat.
     *
     * @param variant cat sound variant
     * @since 26.2
     */
    void setSoundVariant(@NotNull SoundVariant variant);

    /**
     * Get the collar color of this cat
     *
     * @return the color of the collar
     * @since 1.14
     */
    @NotNull
    @Override // Paper
    public DyeColor getCollarColor();

    /**
     * Set the collar color of this cat
     *
     * @param color the color to apply
     * @since 1.14
     */
    @Override // Paper
    public void setCollarColor(@NotNull DyeColor color);

    /**
     * Represents the various different cat types there are.
     *
     * @since 1.14
     */
    interface Type extends OldEnum<Type>, Keyed {

        /**
         * @since 1.14
         */
        // Start generate - CatType
        Type ALL_BLACK = getType("all_black");

        /**
         * @since 1.14
         */
        Type BLACK = getType("black");

        /**
         * @since 1.14
         */
        Type BRITISH_SHORTHAIR = getType("british_shorthair");

        /**
         * @since 1.14
         */
        Type CALICO = getType("calico");

        /**
         * @since 1.14
         */
        Type JELLIE = getType("jellie");

        /**
         * @since 1.14
         */
        Type PERSIAN = getType("persian");

        /**
         * @since 1.14
         */
        Type RAGDOLL = getType("ragdoll");

        /**
         * @since 1.14
         */
        Type RED = getType("red");

        /**
         * @since 1.14
         */
        Type SIAMESE = getType("siamese");

        /**
         * @since 1.14
         */
        Type TABBY = getType("tabby");

        /**
         * @since 1.14
         */
        Type WHITE = getType("white");
        // End generate - CatType

        @NotNull
        private static Type getType(@NotNull @KeyPattern.Value final String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.CAT_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }

        /**
         * @param name of the cat type.
         * @return the cat type with the given name.
         * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
         */
        @NotNull
        @Deprecated(since = "1.21", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
        static Type valueOf(@NotNull String name) {
            final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
            Type type = key == null ? null : RegistryAccess.registryAccess().getRegistry(RegistryKey.CAT_VARIANT).get(key);
            Preconditions.checkArgument(type != null, "No cat type found with the name %s", name);
            return type;
        }

        /**
         * @return an array of all known cat types.
         * @deprecated use {@link Registry#stream()}.
         */
        @NotNull
        @Deprecated(since = "1.21", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
        static Type[] values() {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.CAT_VARIANT).stream().toArray(Type[]::new);
        }
    }

    /**
     * Represents the sound variant of a cat.
     *
     * @since 26.2
     */
    interface SoundVariant extends Keyed {

        /**
         * @since 26.2
         */
        // Start generate - CatSoundVariant
        SoundVariant CLASSIC = getSoundVariant("classic");

        /**
         * @since 26.2
         */
        SoundVariant ROYAL = getSoundVariant("royal");
        // End generate - CatSoundVariant

        @NotNull
        private static SoundVariant getSoundVariant(@KeyPattern.Value final @NotNull String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.CAT_SOUND_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }

    /**
     * Sets if the cat is lying down.
     * This is visual and does not affect the behaviour of the cat.
     *
     * @param lyingDown whether the cat should lie down
     * @since 1.17.1
     */
    public void setLyingDown(boolean lyingDown);

    /**
     * Gets if the cat is lying down.
     *
     * @return whether the cat is lying down
     * @since 1.17.1
     */
    public boolean isLyingDown();

    /**
     * Sets if the cat has its head up.
     * This is visual and does not affect the behaviour of the cat.
     *
     * @param headUp head is up
     * @since 1.17.1
     */
    public void setHeadUp(boolean headUp);

    /**
     * Gets if the cat has its head up.
     *
     * @return head is up
     * @since 1.17.1
     */
    public boolean isHeadUp();
}
