package org.bukkit;

import com.google.common.base.Preconditions;
import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import java.util.Locale;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents the art on a painting.
 * <p>
 * The arts listed in this interface are present in the default server
 * or can be enabled via a {@link FeatureFlag}.
 * There may be additional arts present in the server, for example from a {@link io.papermc.paper.datapack.Datapack}
 * which can be accessed via {@link RegistryAccess#registryAccess()} and {@link RegistryKey#PAINTING_VARIANT}.
 *
 * @since 1.0.0
 */
public interface Art extends OldEnum<Art>, Keyed {

    /**
     * @since 1.0.0
     */
    // Start generate - Art
    Art ALBAN = getArt("alban");

    /**
     * @since 1.0.0
     */
    Art AZTEC = getArt("aztec");

    /**
     * @since 1.0.0
     */
    Art AZTEC2 = getArt("aztec2");

    /**
     * @since 1.21
     */
    Art BACKYARD = getArt("backyard");

    /**
     * @since 1.21
     */
    Art BAROQUE = getArt("baroque");

    /**
     * @since 1.0.0
     */
    Art BOMB = getArt("bomb");

    /**
     * @since 1.21
     */
    Art BOUQUET = getArt("bouquet");

    /**
     * @since 1.13
     */
    Art BURNING_SKULL = getArt("burning_skull");

    /**
     * @since 1.0.0
     */
    Art BUST = getArt("bust");

    /**
     * @since 1.21
     */
    Art CAVEBIRD = getArt("cavebird");

    /**
     * @since 1.21
     */
    Art CHANGING = getArt("changing");

    /**
     * @since 1.21
     */
    Art COTAN = getArt("cotan");

    /**
     * @since 1.0.0
     */
    Art COURBET = getArt("courbet");

    /**
     * @since 1.0.0
     */
    Art CREEBET = getArt("creebet");

    /**
     * @since 1.21.7
     */
    Art DENNIS = getArt("dennis");

    /**
     * @since 1.13
     */
    Art DONKEY_KONG = getArt("donkey_kong");

    /**
     * @since 1.19
     */
    Art EARTH = getArt("earth");

    /**
     * @since 1.21
     */
    Art ENDBOSS = getArt("endboss");

    /**
     * @since 1.21
     */
    Art FERN = getArt("fern");

    /**
     * @since 1.0.0
     */
    Art FIGHTERS = getArt("fighters");

    /**
     * @since 1.21
     */
    Art FINDING = getArt("finding");

    /**
     * @since 1.19
     */
    Art FIRE = getArt("fire");

    /**
     * @since 1.0.0
     */
    Art GRAHAM = getArt("graham");

    /**
     * @since 1.21
     */
    Art HUMBLE = getArt("humble");

    /**
     * @since 1.0.0
     */
    Art KEBAB = getArt("kebab");

    /**
     * @since 1.21
     */
    Art LOWMIST = getArt("lowmist");

    /**
     * @since 1.0.0
     */
    Art MATCH = getArt("match");

    /**
     * @since 1.21
     */
    Art MEDITATIVE = getArt("meditative");

    /**
     * @since 1.21
     */
    Art ORB = getArt("orb");

    /**
     * @since 1.21
     */
    Art OWLEMONS = getArt("owlemons");

    /**
     * @since 1.21
     */
    Art PASSAGE = getArt("passage");

    /**
     * @since 1.0.0
     */
    Art PIGSCENE = getArt("pigscene");

    /**
     * @since 1.0.0
     */
    Art PLANT = getArt("plant");

    /**
     * @since 1.0.0
     */
    Art POINTER = getArt("pointer");

    /**
     * @since 1.21
     */
    Art POND = getArt("pond");

    /**
     * @since 1.0.0
     */
    Art POOL = getArt("pool");

    /**
     * @since 1.21
     */
    Art PRAIRIE_RIDE = getArt("prairie_ride");

    /**
     * @since 1.0.0
     */
    Art SEA = getArt("sea");

    /**
     * @since 1.0.0
     */
    Art SKELETON = getArt("skeleton");

    /**
     * @since 1.0.0
     */
    Art SKULL_AND_ROSES = getArt("skull_and_roses");

    /**
     * @since 1.0.0
     */
    Art STAGE = getArt("stage");

    /**
     * @since 1.21
     */
    Art SUNFLOWERS = getArt("sunflowers");

    /**
     * @since 1.0.0
     */
    Art SUNSET = getArt("sunset");

    /**
     * @since 1.21
     */
    Art TIDES = getArt("tides");

    /**
     * @since 1.21
     */
    Art UNPACKED = getArt("unpacked");

    /**
     * @since 1.0.0
     */
    Art VOID = getArt("void");

    /**
     * @since 1.0.0
     */
    Art WANDERER = getArt("wanderer");

    /**
     * @since 1.0.0
     */
    Art WASTELAND = getArt("wasteland");

    /**
     * @since 1.19
     */
    Art WATER = getArt("water");

    /**
     * @since 1.19
     */
    Art WIND = getArt("wind");

    /**
     * @since 1.4.5
     */
    Art WITHER = getArt("wither");
    // End generate - Art

    @NotNull
    private static Art getArt(@NotNull @KeyPattern.Value String key) {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.PAINTING_VARIANT).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * Gets the width of the painting, in blocks
     *
     * @return The width of the painting, in blocks
     * @since 1.0.0
     */
    int getBlockWidth();

    /**
     * Gets the height of the painting, in blocks
     *
     * @return The height of the painting, in blocks
     * @since 1.0.0
     */
    int getBlockHeight();

    /**
     * Get the ID of this painting.
     *
     * @return The ID of this painting
     * @deprecated Magic value that is based on inconsistent, data-driven registry
     */
    @Deprecated(since = "1.6.2", forRemoval = true)
    int getId();

    // Paper start - deprecate getKey
    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#PAINTING_VARIANT}. Painting variants can exist without a key.
     */
    @Deprecated(since = "1.21", forRemoval = true)
    @Override
    @NotNull NamespacedKey getKey();

    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#PAINTING_VARIANT}. Painting variants can exist without a key.
     */
    @Deprecated(since = "1.21", forRemoval = true)
    @Override
    default net.kyori.adventure.key.@org.jetbrains.annotations.NotNull Key key() {
        return Keyed.super.key();
    }
    // Paper end - deprecate getKey

    // Paper start - name and author components, assetId key
    /**
     * Get the painting's title.
     *
     * @return the title
     * @since 1.21.3
     */
    net.kyori.adventure.text.@Nullable Component title();

    /**
     * Get the painting's author.
     *
     * @return the author
     * @since 1.21.3
     */
    net.kyori.adventure.text.@Nullable Component author();

    /**
     * Get the painting's asset id
     *
     * @return the asset id
     * @since 1.21.3
     */
    net.kyori.adventure.key.@NotNull Key assetId();
    // Paper end - name and author components, assetId key

    /**
     * Get a painting by its numeric ID
     *
     * @param id The ID
     * @return The painting
     * @deprecated Magic value that is based on inconsistent, data-driven registry
     */
    @Deprecated(since = "1.6.2", forRemoval = true)
    @Nullable
    static Art getById(int id) {
        for (Art art : RegistryAccess.registryAccess().getRegistry(RegistryKey.PAINTING_VARIANT)) {
            if (id == art.getId()) {
                return art;
            }
        }

        return null;
    }

    /**
     * Get a painting by its unique name
     * <p>
     * This ignores capitalization
     *
     * @param name The name
     * @return The painting
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     * @since 1.0.0
     */
    @Deprecated(since = "1.21.3")
    @Nullable
    static Art getByName(@NotNull String name) {
        Preconditions.checkArgument(name != null, "Name cannot be null");
        final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
        if (key == null) {
            return null;
        }

        return Bukkit.getUnsafe().get(RegistryKey.PAINTING_VARIANT, key);
    }

    /**
     * @param name of the art.
     * @return the art with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static Art valueOf(@NotNull String name) {
        final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
        final Art art = key == null ? null : Bukkit.getUnsafe().get(RegistryKey.PAINTING_VARIANT, key);
        Preconditions.checkArgument(art != null, "No art found with the name %s", name);
        return art;
    }

    /**
     * @return an array of all known arts.
     * @deprecated use {@link Registry#stream()}.
     */
    @NotNull
    @Deprecated(since = "1.21.3", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static Art[] values() {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.PAINTING_VARIANT).stream().toArray(Art[]::new);
    }
}
