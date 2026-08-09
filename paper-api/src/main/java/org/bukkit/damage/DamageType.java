package org.bukkit.damage;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.bukkit.Translatable;
import org.jetbrains.annotations.NotNull;

/**
 * Represent a type of damage that an entity can receive.
 * <p>
 * Constants in this class include the base types provided by the vanilla
 * server. Data packs are capable of registering more types of damage which may
 * be obtained through {@link io.papermc.paper.registry.RegistryAccess#getRegistry(RegistryKey)} and {@link RegistryKey#DAMAGE_TYPE}.
 *
 * @see <a href="https://minecraft.wiki/w/Damage_type">Minecraft Wiki</a>
 * @since 1.20.4
 */
public interface DamageType extends Keyed, Translatable {

    /**
     * @since 1.20.4
     */
    // Start generate - DamageType
    DamageType ARROW = getDamageType("arrow");

    /**
     * @since 1.20.4
     */
    DamageType BAD_RESPAWN_POINT = getDamageType("bad_respawn_point");

    /**
     * @since 1.20.4
     */
    DamageType CACTUS = getDamageType("cactus");

    /**
     * @since 1.21
     */
    DamageType CAMPFIRE = getDamageType("campfire");

    /**
     * @since 1.20.4
     */
    DamageType CRAMMING = getDamageType("cramming");

    /**
     * @since 1.20.4
     */
    DamageType DRAGON_BREATH = getDamageType("dragon_breath");

    /**
     * @since 1.20.4
     */
    DamageType DROWN = getDamageType("drown");

    /**
     * @since 1.20.4
     */
    DamageType DRY_OUT = getDamageType("dry_out");

    /**
     * @since 1.21.3
     */
    DamageType ENDER_PEARL = getDamageType("ender_pearl");

    /**
     * @since 1.20.4
     */
    DamageType EXPLOSION = getDamageType("explosion");

    /**
     * @since 1.20.4
     */
    DamageType FALL = getDamageType("fall");

    /**
     * @since 1.20.4
     */
    DamageType FALLING_ANVIL = getDamageType("falling_anvil");

    /**
     * @since 1.20.4
     */
    DamageType FALLING_BLOCK = getDamageType("falling_block");

    /**
     * @since 1.20.4
     */
    DamageType FALLING_STALACTITE = getDamageType("falling_stalactite");

    /**
     * @since 1.20.4
     */
    DamageType FIREBALL = getDamageType("fireball");

    /**
     * @since 1.20.4
     */
    DamageType FIREWORKS = getDamageType("fireworks");

    /**
     * @since 1.20.4
     */
    DamageType FLY_INTO_WALL = getDamageType("fly_into_wall");

    /**
     * @since 1.20.4
     */
    DamageType FREEZE = getDamageType("freeze");

    /**
     * @since 1.20.4
     */
    DamageType GENERIC = getDamageType("generic");

    /**
     * @since 1.20.4
     */
    DamageType GENERIC_KILL = getDamageType("generic_kill");

    /**
     * @since 1.20.4
     */
    DamageType HOT_FLOOR = getDamageType("hot_floor");

    /**
     * @since 1.20.4
     */
    DamageType IN_FIRE = getDamageType("in_fire");

    /**
     * @since 1.20.4
     */
    DamageType IN_WALL = getDamageType("in_wall");

    /**
     * @since 1.20.4
     */
    DamageType INDIRECT_MAGIC = getDamageType("indirect_magic");

    /**
     * @since 1.20.4
     */
    DamageType LAVA = getDamageType("lava");

    /**
     * @since 1.20.4
     */
    DamageType LIGHTNING_BOLT = getDamageType("lightning_bolt");

    /**
     * @since 1.21.3
     */
    DamageType MACE_SMASH = getDamageType("mace_smash");

    /**
     * @since 1.20.4
     */
    DamageType MAGIC = getDamageType("magic");

    /**
     * @since 1.20.4
     */
    DamageType MOB_ATTACK = getDamageType("mob_attack");

    /**
     * @since 1.20.4
     */
    DamageType MOB_ATTACK_NO_AGGRO = getDamageType("mob_attack_no_aggro");

    /**
     * @since 1.20.4
     */
    DamageType MOB_PROJECTILE = getDamageType("mob_projectile");

    /**
     * @since 1.20.4
     */
    DamageType ON_FIRE = getDamageType("on_fire");

    /**
     * @since 1.20.4
     */
    DamageType OUT_OF_WORLD = getDamageType("out_of_world");

    /**
     * @since 1.20.4
     */
    DamageType OUTSIDE_BORDER = getDamageType("outside_border");

    /**
     * @since 1.20.4
     */
    DamageType PLAYER_ATTACK = getDamageType("player_attack");

    /**
     * @since 1.20.4
     */
    DamageType PLAYER_EXPLOSION = getDamageType("player_explosion");

    /**
     * @since 1.20.4
     */
    DamageType SONIC_BOOM = getDamageType("sonic_boom");

    /**
     * @since 1.21.11
     */
    DamageType SPEAR = getDamageType("spear");

    /**
     * @since 1.20.6
     */
    DamageType SPIT = getDamageType("spit");

    /**
     * @since 1.20.4
     */
    DamageType STALAGMITE = getDamageType("stalagmite");

    /**
     * @since 1.20.4
     */
    DamageType STARVE = getDamageType("starve");

    /**
     * @since 1.20.4
     */
    DamageType STING = getDamageType("sting");

    /**
     * @since 26.2
     */
    DamageType SULFUR_CUBE_HOT = getDamageType("sulfur_cube_hot");

    /**
     * @since 1.20.4
     */
    DamageType SWEET_BERRY_BUSH = getDamageType("sweet_berry_bush");

    /**
     * @since 1.20.4
     */
    DamageType THORNS = getDamageType("thorns");

    /**
     * @since 1.20.4
     */
    DamageType THROWN = getDamageType("thrown");

    /**
     * @since 1.20.4
     */
    DamageType TRIDENT = getDamageType("trident");

    /**
     * @since 1.20.4
     */
    DamageType UNATTRIBUTED_FIREBALL = getDamageType("unattributed_fireball");

    /**
     * @since 1.20.6
     */
    DamageType WIND_CHARGE = getDamageType("wind_charge");

    /**
     * @since 1.20.4
     */
    DamageType WITHER = getDamageType("wither");

    /**
     * @since 1.20.4
     */
    DamageType WITHER_SKULL = getDamageType("wither_skull");
    // End generate - DamageType

    @NotNull
    private static DamageType getDamageType(@NotNull @KeyPattern.Value String key) {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.DAMAGE_TYPE).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * {@inheritDoc}
     * <p>
     * The returned key is that of the death message sent when this damage type
     * is responsible for the death of an entity.
     * <p>
     * <strong>Note</strong> This translation key is only used if
     * {@link #getDeathMessageType()} is {@link DeathMessageType#DEFAULT}
     *
     * @since 1.20.4
     */
    @NotNull
    @Override
    public String getTranslationKey();

    /**
     * Get the {@link DamageScaling} for this damage type.
     *
     * @return the damage scaling
     * @since 1.20.4
     */
    @NotNull
    public DamageScaling getDamageScaling();

    /**
     * Get the {@link DamageEffect} for this damage type.
     *
     * @return the damage effect
     * @since 1.20.4
     */
    @NotNull
    public DamageEffect getDamageEffect();

    /**
     * Get the {@link DeathMessageType} for this damage type.
     *
     * @return the death message type
     * @since 1.20.4
     */
    @NotNull
    public DeathMessageType getDeathMessageType();

    /**
     * Get the amount of hunger exhaustion caused by this damage type.
     *
     * @return the exhaustion
     * @since 1.20.4
     */
    public float getExhaustion();
}
