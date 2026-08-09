package org.bukkit.potion;

import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import org.bukkit.Bukkit;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This enum reflects and matches each potion state that can be obtained from
 * the Creative mode inventory
 *
 * @since 1.1.0
 */
public enum PotionType implements Keyed, io.papermc.paper.world.flag.FeatureDependant { // Paper - feature flag API
    /**
     * @since 1.9.4
     */
    // Start generate - PotionType
    AWKWARD("awkward"),
    /**
     * @since 1.1.0
     */
    FIRE_RESISTANCE("fire_resistance"),
    /**
     * @since 1.20.6
     */
    HARMING("harming"),
    /**
     * @since 1.20.6
     */
    HEALING("healing"),
    /**
     * @since 1.20.6
     */
    INFESTED("infested"),
    /**
     * @since 1.4.5
     */
    INVISIBILITY("invisibility"),
    /**
     * @since 1.20.6
     */
    LEAPING("leaping"),
    /**
     * @since 1.20.2
     */
    LONG_FIRE_RESISTANCE("long_fire_resistance"),
    /**
     * @since 1.20.2
     */
    LONG_INVISIBILITY("long_invisibility"),
    /**
     * @since 1.20.2
     */
    LONG_LEAPING("long_leaping"),
    /**
     * @since 1.20.2
     */
    LONG_NIGHT_VISION("long_night_vision"),
    /**
     * @since 1.20.2
     */
    LONG_POISON("long_poison"),
    /**
     * @since 1.20.2
     */
    LONG_REGENERATION("long_regeneration"),
    /**
     * @since 1.20.2
     */
    LONG_SLOW_FALLING("long_slow_falling"),
    /**
     * @since 1.20.2
     */
    LONG_SLOWNESS("long_slowness"),
    /**
     * @since 1.20.2
     */
    LONG_STRENGTH("long_strength"),
    /**
     * @since 1.20.2
     */
    LONG_SWIFTNESS("long_swiftness"),
    /**
     * @since 1.20.2
     */
    LONG_TURTLE_MASTER("long_turtle_master"),
    /**
     * @since 1.20.2
     */
    LONG_WATER_BREATHING("long_water_breathing"),
    /**
     * @since 1.20.2
     */
    LONG_WEAKNESS("long_weakness"),
    /**
     * @since 1.9.4
     */
    LUCK("luck"),
    /**
     * @since 1.9.4
     */
    MUNDANE("mundane"),
    /**
     * @since 1.4.5
     */
    NIGHT_VISION("night_vision"),
    /**
     * @since 1.20.6
     */
    OOZING("oozing"),
    /**
     * @since 1.1.0
     */
    POISON("poison"),
    /**
     * @since 1.20.6
     */
    REGENERATION("regeneration"),
    /**
     * @since 1.13
     */
    SLOW_FALLING("slow_falling"),
    /**
     * @since 1.1.0
     */
    SLOWNESS("slowness"),
    /**
     * @since 1.1.0
     */
    STRENGTH("strength"),
    /**
     * @since 1.20.2
     */
    STRONG_HARMING("strong_harming"),
    /**
     * @since 1.20.2
     */
    STRONG_HEALING("strong_healing"),
    /**
     * @since 1.20.2
     */
    STRONG_LEAPING("strong_leaping"),
    /**
     * @since 1.20.2
     */
    STRONG_POISON("strong_poison"),
    /**
     * @since 1.20.2
     */
    STRONG_REGENERATION("strong_regeneration"),
    /**
     * @since 1.20.2
     */
    STRONG_SLOWNESS("strong_slowness"),
    /**
     * @since 1.20.2
     */
    STRONG_STRENGTH("strong_strength"),
    /**
     * @since 1.20.2
     */
    STRONG_SWIFTNESS("strong_swiftness"),
    /**
     * @since 1.20.2
     */
    STRONG_TURTLE_MASTER("strong_turtle_master"),
    /**
     * @since 1.20.6
     */
    SWIFTNESS("swiftness"),
    /**
     * @since 1.9.4
     */
    THICK("thick"),
    /**
     * @since 1.13
     */
    TURTLE_MASTER("turtle_master"),
    /**
     * @since 1.1.0
     */
    WATER("water"),
    /**
     * @since 1.7.2
     */
    WATER_BREATHING("water_breathing"),
    /**
     * @since 1.1.0
     */
    WEAKNESS("weakness"),
    /**
     * @since 1.20.6
     */
    WEAVING("weaving"),
    /**
     * @since 1.20.6
     */
    WIND_CHARGED("wind_charged");
    // End generate - PotionType

    private final NamespacedKey key;
    private final Supplier<InternalPotionData> internalPotionDataSupplier;

    PotionType(String key) {
        this.key = NamespacedKey.minecraft(key);
        this.internalPotionDataSupplier = Suppliers.memoize(() -> Bukkit.getUnsafe().getInternalPotionData(this.key));
    }

    /**
     * @return the potion effect type of this potion type
     * @deprecated Potions can have multiple effects use {@link #getPotionEffects()}
     * @since 1.1.0
     */
    @Nullable
    @Deprecated(since = "1.20.2")
    public PotionEffectType getEffectType() {
        return internalPotionDataSupplier.get().getEffectType();
    }

    /**
     * @return a list of all effects this potion type has
     * @since 1.20.2
     */
    @NotNull
    public List<PotionEffect> getPotionEffects() {
        return internalPotionDataSupplier.get().getPotionEffects();
    }

    /**
     * @return if this potion type is instant
     * @deprecated PotionType can have multiple effects, some of which can be instant and others not.
     * Use {@link PotionEffectType#isInstant()} in combination with {@link #getPotionEffects()} and {@link PotionEffect#getType()}
     * @since 1.1.0
     */
    @Deprecated(since = "1.20.2")
    public boolean isInstant() {
        return internalPotionDataSupplier.get().isInstant();
    }

    /**
     * Checks if the potion type has an upgraded state.
     * This refers to whether or not the potion type can be Tier 2,
     * such as Potion of Fire Resistance II.
     *
     * @return true if the potion type can be upgraded;
     * @since 1.9.4
     */
    public boolean isUpgradeable() {
        return internalPotionDataSupplier.get().isUpgradeable();
    }

    /**
     * Checks if the potion type has an extended state.
     * This refers to the extended duration potions
     *
     * @return true if the potion type can be extended
     * @since 1.9.4
     */
    public boolean isExtendable() {
        return internalPotionDataSupplier.get().isExtendable();
    }

    /**
     * @since 1.1.0
     */
    public int getMaxLevel() {
        return internalPotionDataSupplier.get().getMaxLevel();
    }

    /**
     * @param effectType the effect to get by
     * @return the matching potion type
     * @deprecated Misleading
     * @since 1.1.0
     */
    @Deprecated(since = "1.9")
    @Nullable
    public static PotionType getByEffect(@Nullable PotionEffectType effectType) {
        if (effectType == null)
            return WATER;
        for (PotionType type : PotionType.values()) {
            if (effectType.equals(type.getEffectType()))
                return type;
        }
        return null;
    }

    /**
     * @since 1.20.2
     */
    @NotNull
    @Override
    public NamespacedKey getKey() {
        return key;
    }

    /**
     * @deprecated Do not use, interface will get removed, and the plugin won't run
     */
    @Deprecated(since = "1.20.2", forRemoval = true)
    @ApiStatus.Internal
    public interface InternalPotionData {

        PotionEffectType getEffectType();

        List<PotionEffect> getPotionEffects();

        boolean isInstant();

        boolean isUpgradeable();

        boolean isExtendable();

        int getMaxLevel();
    }
}
