package org.bukkit.tag;

import io.papermc.paper.annotation.MinecraftVersionDependent;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.bukkit.damage.DamageType;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

/**
 * Vanilla {@link DamageType} {@link Tag tags}.
 *
 * @since 1.21.3
 */
@MinecraftVersionDependent
public final class DamageTypeTags {

    /**
     * @since 1.21.3
     */
    // Start generate - DamageTypeTags
    public static final Tag<DamageType> ALWAYS_HURTS_ENDER_DRAGONS = getTag("always_hurts_ender_dragons");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> ALWAYS_KILLS_ARMOR_STANDS = getTag("always_kills_armor_stands");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> ALWAYS_MOST_SIGNIFICANT_FALL = getTag("always_most_significant_fall");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> ALWAYS_TRIGGERS_SILVERFISH = getTag("always_triggers_silverfish");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> AVOIDS_GUARDIAN_THORNS = getTag("avoids_guardian_thorns");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BURN_FROM_STEPPING = getTag("burn_from_stepping");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BURNS_ARMOR_STANDS = getTag("burns_armor_stands");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BYPASSES_ARMOR = getTag("bypasses_armor");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BYPASSES_EFFECTS = getTag("bypasses_effects");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BYPASSES_ENCHANTMENTS = getTag("bypasses_enchantments");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BYPASSES_INVULNERABILITY = getTag("bypasses_invulnerability");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BYPASSES_RESISTANCE = getTag("bypasses_resistance");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BYPASSES_SHIELD = getTag("bypasses_shield");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> BYPASSES_WOLF_ARMOR = getTag("bypasses_wolf_armor");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> CAN_BREAK_ARMOR_STAND = getTag("can_break_armor_stand");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> DAMAGES_HELMET = getTag("damages_helmet");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IGNITES_ARMOR_STANDS = getTag("ignites_armor_stands");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IS_DROWNING = getTag("is_drowning");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IS_EXPLOSION = getTag("is_explosion");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IS_FALL = getTag("is_fall");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IS_FIRE = getTag("is_fire");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IS_FREEZING = getTag("is_freezing");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IS_LIGHTNING = getTag("is_lightning");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IS_PLAYER_ATTACK = getTag("is_player_attack");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> IS_PROJECTILE = getTag("is_projectile");

    /**
     * @since 1.21.6
     */
    public static final Tag<DamageType> MACE_SMASH = getTag("mace_smash");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> NO_ANGER = getTag("no_anger");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> NO_IMPACT = getTag("no_impact");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> NO_KNOCKBACK = getTag("no_knockback");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> PANIC_CAUSES = getTag("panic_causes");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> PANIC_ENVIRONMENTAL_CAUSES = getTag("panic_environmental_causes");

    /**
     * @since 26.2
     */
    public static final Tag<DamageType> SULFUR_CUBE_WITH_BLOCK_IMMUNE_TO = getTag("sulfur_cube_with_block_immune_to");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> WITCH_RESISTANT_TO = getTag("witch_resistant_to");

    /**
     * @since 1.21.3
     */
    public static final Tag<DamageType> WITHER_IMMUNE_TO = getTag("wither_immune_to");
    // End generate - DamageTypeTags
    /**
     * Vanilla tag representing damage types which originate from mace smashes.
     *
     * @deprecated use {@link #MACE_SMASH}
     */
    @Deprecated(since = "1.21.4", forRemoval = true)
    public static final Tag<DamageType> IS_MACE_SMASH = MACE_SMASH;
    /**
     * Internal use only.
     */
    @ApiStatus.Internal
    public static final String REGISTRY_DAMAGE_TYPES = "damage_types";

    @Nullable
    private static Tag<DamageType> getTag(String key) {
        return Bukkit.getTag(REGISTRY_DAMAGE_TYPES, NamespacedKey.minecraft(key), DamageType.class);
    }

    private DamageTypeTags() {
    }
}
