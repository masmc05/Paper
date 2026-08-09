package org.bukkit.block.banner;

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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1.8
 */
public interface PatternType extends OldEnum<PatternType>, Keyed {

    /**
     * @since 1.8
     */
    // Start generate - PatternType
    PatternType BASE = getType("base");

    /**
     * @since 1.8
     */
    PatternType BORDER = getType("border");

    /**
     * @since 1.8
     */
    PatternType BRICKS = getType("bricks");

    /**
     * @since 1.20.6
     */
    PatternType CIRCLE = getType("circle");

    /**
     * @since 1.8
     */
    PatternType CREEPER = getType("creeper");

    /**
     * @since 1.8
     */
    PatternType CROSS = getType("cross");

    /**
     * @since 1.8
     */
    PatternType CURLY_BORDER = getType("curly_border");

    /**
     * @since 1.8
     */
    PatternType DIAGONAL_LEFT = getType("diagonal_left");

    /**
     * @since 1.8
     */
    PatternType DIAGONAL_RIGHT = getType("diagonal_right");

    /**
     * @since 1.20.6
     */
    PatternType DIAGONAL_UP_LEFT = getType("diagonal_up_left");

    /**
     * @since 1.20.6
     */
    PatternType DIAGONAL_UP_RIGHT = getType("diagonal_up_right");

    /**
     * @since 1.20.6
     */
    PatternType FLOW = getType("flow");

    /**
     * @since 1.8
     */
    PatternType FLOWER = getType("flower");

    /**
     * @since 1.14
     */
    PatternType GLOBE = getType("globe");

    /**
     * @since 1.8
     */
    PatternType GRADIENT = getType("gradient");

    /**
     * @since 1.8
     */
    PatternType GRADIENT_UP = getType("gradient_up");

    /**
     * @since 1.20.6
     */
    PatternType GUSTER = getType("guster");

    /**
     * @since 1.8
     */
    PatternType HALF_HORIZONTAL = getType("half_horizontal");

    /**
     * @since 1.20.6
     */
    PatternType HALF_HORIZONTAL_BOTTOM = getType("half_horizontal_bottom");

    /**
     * @since 1.8
     */
    PatternType HALF_VERTICAL = getType("half_vertical");

    /**
     * @since 1.20.6
     */
    PatternType HALF_VERTICAL_RIGHT = getType("half_vertical_right");

    /**
     * @since 1.8
     */
    PatternType MOJANG = getType("mojang");

    /**
     * @since 1.16.1
     */
    PatternType PIGLIN = getType("piglin");

    /**
     * @since 1.20.6
     */
    PatternType RHOMBUS = getType("rhombus");

    /**
     * @since 1.8
     */
    PatternType SKULL = getType("skull");

    /**
     * @since 1.20.6
     */
    PatternType SMALL_STRIPES = getType("small_stripes");

    /**
     * @since 1.8
     */
    PatternType SQUARE_BOTTOM_LEFT = getType("square_bottom_left");

    /**
     * @since 1.8
     */
    PatternType SQUARE_BOTTOM_RIGHT = getType("square_bottom_right");

    /**
     * @since 1.8
     */
    PatternType SQUARE_TOP_LEFT = getType("square_top_left");

    /**
     * @since 1.8
     */
    PatternType SQUARE_TOP_RIGHT = getType("square_top_right");

    /**
     * @since 1.8
     */
    PatternType STRAIGHT_CROSS = getType("straight_cross");

    /**
     * @since 1.8
     */
    PatternType STRIPE_BOTTOM = getType("stripe_bottom");

    /**
     * @since 1.8
     */
    PatternType STRIPE_CENTER = getType("stripe_center");

    /**
     * @since 1.8
     */
    PatternType STRIPE_DOWNLEFT = getType("stripe_downleft");

    /**
     * @since 1.8
     */
    PatternType STRIPE_DOWNRIGHT = getType("stripe_downright");

    /**
     * @since 1.8
     */
    PatternType STRIPE_LEFT = getType("stripe_left");

    /**
     * @since 1.8
     */
    PatternType STRIPE_MIDDLE = getType("stripe_middle");

    /**
     * @since 1.8
     */
    PatternType STRIPE_RIGHT = getType("stripe_right");

    /**
     * @since 1.8
     */
    PatternType STRIPE_TOP = getType("stripe_top");

    /**
     * @since 1.8
     */
    PatternType TRIANGLE_BOTTOM = getType("triangle_bottom");

    /**
     * @since 1.8
     */
    PatternType TRIANGLE_TOP = getType("triangle_top");

    /**
     * @since 1.8
     */
    PatternType TRIANGLES_BOTTOM = getType("triangles_bottom");

    /**
     * @since 1.8
     */
    PatternType TRIANGLES_TOP = getType("triangles_top");
    // End generate - PatternType

    // Paper start - deprecate getKey
    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#BANNER_PATTERN}. PatternTypes can exist without a key.
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    @Override
    default net.kyori.adventure.key.@org.jetbrains.annotations.NotNull Key key() {
        return org.bukkit.Keyed.super.key();
    }

    /**
     * @deprecated use {@link Registry#getKey(Keyed)}, {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)},
     * and {@link io.papermc.paper.registry.RegistryKey#BANNER_PATTERN}. PatternTypes can exist without a key.
     */
    @Deprecated(since = "1.20.5", forRemoval = true)
    // Paper end - deprecate getKey
    @Override
    @NotNull
    public NamespacedKey getKey();

    /**
     * Returns the identifier used to represent
     * this pattern type
     *
     * @return the pattern's identifier
     * @see #getKey
     * @deprecated magic value
     */
    @NotNull
    @Deprecated(since = "1.20.4", forRemoval = true)
    public String getIdentifier();

    /**
     * Returns the pattern type which matches the passed
     * identifier or null if no matches are found
     *
     * @param identifier the identifier
     * @return the matched pattern type or null
     * @deprecated magic value, use {@link Registry#get(NamespacedKey)} instead with {@link io.papermc.paper.registry.RegistryAccess#getRegistry(io.papermc.paper.registry.RegistryKey)} and {@link io.papermc.paper.registry.RegistryKey#BANNER_PATTERN}
     */
    @Contract("null -> null")
    @Nullable
    @Deprecated(since = "1.20.4", forRemoval = true)
    public static PatternType getByIdentifier(@Nullable String identifier) {
        if (identifier == null) {
            return null;
        }

        for (PatternType type : RegistryAccess.registryAccess().getRegistry(RegistryKey.BANNER_PATTERN)) {
            if (identifier.equals(type.getIdentifier())) {
                return type;
            }
        }

        return null;
    }

    @NotNull
    private static PatternType getType(@NotNull @KeyPattern.Value String key) {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.BANNER_PATTERN).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * @param name of the pattern type.
     * @return the pattern type with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated(since = "1.21", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static PatternType valueOf(@NotNull String name) {
        final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
        PatternType type = key == null ? null : RegistryAccess.registryAccess().getRegistry(RegistryKey.BANNER_PATTERN).get(key);
        Preconditions.checkArgument(type != null, "No pattern type found with the name %s", name);
        return type;
    }

    /**
     * @return an array of all known pattern types.
     * @deprecated use {@link Registry#stream()}.
     */
    @NotNull
    @Deprecated(since = "1.21", forRemoval = true) @org.jetbrains.annotations.ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
    static PatternType[] values() {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.BANNER_PATTERN).stream().toArray(PatternType[]::new);
    }
}
