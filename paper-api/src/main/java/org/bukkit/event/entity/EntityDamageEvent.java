package org.bukkit.event.entity;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import org.bukkit.Material;
import org.bukkit.WorldBorder;
import org.bukkit.damage.DamageSource;
import org.bukkit.damage.DamageType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Stores data for damage events
 *
 * @since 1.0.0
 */
public class EntityDamageEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private static final DamageModifier[] MODIFIERS = DamageModifier.values();
    private static final Function<? super Double, Double> ZERO = Functions.constant(-0.0);
    private final Map<DamageModifier, Double> modifiers;
    private final Map<DamageModifier, ? extends Function<? super Double, Double>> modifierFunctions;
    private final Map<DamageModifier, Double> originals;
    private final DamageCause cause;
    private final DamageSource damageSource;

    private boolean cancelled;

    @ApiStatus.Internal
    @Deprecated(since = "1.20.4", forRemoval = true)
    public EntityDamageEvent(@NotNull final Entity damagee, @NotNull final DamageCause cause, final double damage) {
        this(damagee, cause, DamageSource.builder(DamageType.GENERIC).build(), damage);
    }

    @ApiStatus.Internal
    @Deprecated(forRemoval = true)
    public EntityDamageEvent(@NotNull final Entity damagee, @NotNull final DamageCause cause, @NotNull final DamageSource damageSource, final double damage) {
        this(damagee, cause, damageSource, new EnumMap<>(ImmutableMap.of(DamageModifier.BASE, damage)), new EnumMap<DamageModifier, Function<? super Double, Double>>(ImmutableMap.of(DamageModifier.BASE, ZERO)));
    }

    @ApiStatus.Internal
    @Deprecated(since = "1.20.4", forRemoval = true)
    public EntityDamageEvent(@NotNull final Entity damagee, @NotNull final DamageCause cause, @NotNull final Map<DamageModifier, Double> modifiers, @NotNull final Map<DamageModifier, ? extends Function<? super Double, Double>> modifierFunctions) {
        this(damagee, cause, DamageSource.builder(DamageType.GENERIC).build(), modifiers, modifierFunctions);
    }

    @ApiStatus.Internal
    public EntityDamageEvent(@NotNull final Entity damagee, @NotNull final DamageCause cause, @NotNull final DamageSource damageSource, @NotNull final Map<DamageModifier, Double> modifiers, @NotNull final Map<DamageModifier, ? extends Function<? super Double, Double>> modifierFunctions) {
        super(damagee);
        Preconditions.checkArgument(modifiers.containsKey(DamageModifier.BASE), "BASE DamageModifier missing");
        Preconditions.checkArgument(!modifiers.containsKey(null), "Cannot have null DamageModifier");
        Preconditions.checkArgument(modifiers.values().stream().allMatch(Objects::nonNull), "Cannot have null modifier values");
        Preconditions.checkArgument(modifiers.keySet().equals(modifierFunctions.keySet()), "Must have a modifier function for each DamageModifier");
        Preconditions.checkArgument(modifierFunctions.values().stream().allMatch(Objects::nonNull), "Cannot have null modifier function");
        this.originals = new EnumMap<>(modifiers);
        this.cause = cause;
        this.modifiers = modifiers;
        this.modifierFunctions = modifierFunctions;
        this.damageSource = damageSource;
    }

    /**
     * Gets the original damage for the specified modifier, as defined at this
     * event's construction.
     *
     * @param type the modifier
     * @return the original damage
     * @since 1.7.10
     */
    public double getOriginalDamage(@NotNull DamageModifier type) throws IllegalArgumentException {
        Preconditions.checkArgument(type != null, "Cannot have null DamageModifier");
        final Double damage = this.originals.get(type);
        return (damage != null) ? damage : 0;
    }

    /**
     * Sets the damage for the specified modifier.
     *
     * @param type the damage modifier
     * @param damage the scalar value of the damage's modifier
     * @throws UnsupportedOperationException if the caller does not support
     *     the particular DamageModifier, or to rephrase, when {@link
     *     #isApplicable(DamageModifier)} returns false
     * @see #getFinalDamage()
     * @since 1.7.10
     */
    public void setDamage(@NotNull DamageModifier type, double damage) throws IllegalArgumentException, UnsupportedOperationException {
        Preconditions.checkArgument(type != null, "Cannot have null DamageModifier");
        if (!this.modifiers.containsKey(type)) {
            throw new UnsupportedOperationException(type + " is not applicable to " + getEntity());
        }
        this.modifiers.put(type, damage);
    }

    /**
     * Gets the damage change for some modifier
     *
     * @param type the damage modifier
     * @return The raw amount of damage caused by the event
     * @see DamageModifier#BASE
     * @since 1.7.10
     */
    public double getDamage(@NotNull DamageModifier type) throws IllegalArgumentException {
        Preconditions.checkArgument(type != null, "Cannot have null DamageModifier");
        final Double damage = this.modifiers.get(type);
        return damage == null ? 0 : damage;
    }

    /**
     * This checks to see if a particular modifier is valid for this event's
     * caller, such that, {@link #setDamage(DamageModifier, double)} will not
     * throw an {@link UnsupportedOperationException}.
     * <p>
     * {@link DamageModifier#BASE} is always applicable.
     *
     * @param type the modifier
     * @return {@code true} if the modifier is supported by the caller, {@code false} otherwise
     * @since 1.7.10
     */
    public boolean isApplicable(@NotNull DamageModifier type) throws IllegalArgumentException {
        Preconditions.checkArgument(type != null, "Cannot have null DamageModifier");
        return this.modifiers.containsKey(type);
    }

    /**
     * Gets the raw amount of damage caused by the event
     *
     * @return The raw amount of damage caused by the event
     * @see DamageModifier#BASE
     * @since 1.0.0
     */
    public double getDamage() {
        return this.getDamage(DamageModifier.BASE);
    }

    /**
     * Gets the amount of damage caused by the event after all damage
     * reduction is applied.
     *
     * @return the amount of damage caused by the event
     * @since 1.7.10
     */
    public final double getFinalDamage() {
        double damage = 0;
        for (DamageModifier modifier : MODIFIERS) {
            damage += this.getDamage(modifier);
        }
        return damage;
    }

    /**
     * Sets the raw amount of damage caused by the event.
     * <p>
     * For compatibility this also recalculates the modifiers and scales
     * them by the difference between the modifier for the previous damage
     * value and the new one.
     *
     * @param damage The raw amount of damage caused by the event
     * @since 1.6.1
     */
    public void setDamage(double damage) {
        // These have to happen in the same order as the server calculates them, keep the enum sorted
        double remaining = damage;
        double oldRemaining = this.getDamage(DamageModifier.BASE);
        for (DamageModifier modifier : MODIFIERS) {
            if (!this.isApplicable(modifier)) {
                continue;
            }

            Function<? super Double, Double> modifierFunction = modifierFunctions.get(modifier);
            double newVanilla = modifierFunction.apply(remaining);
            double oldVanilla = modifierFunction.apply(oldRemaining);
            double difference = oldVanilla - newVanilla;

            // Don't allow value to cross zero, assume zero values should be negative
            double old = this.getDamage(modifier);
            if (old > 0) {
                this.setDamage(modifier, Math.max(0, old - difference));
            } else {
                this.setDamage(modifier, Math.min(0, old - difference));
            }
            remaining += newVanilla;
            oldRemaining += oldVanilla;
        }

        this.setDamage(DamageModifier.BASE, damage);
    }

    /**
     * Gets the cause of the damage.
     * <p>
     * While a DamageCause may indicate a specific Bukkit-assigned cause of damage,
     * {@link #getDamageSource()} may expose additional types of damage such as custom
     * damage types provided by data packs, as well as any direct or indirect entities,
     * locations, or other contributing factors to the damage being inflicted. The
     * alternative is generally preferred, but DamageCauses provided to this event
     * should largely encompass most common use cases for developers if a simple cause
     * is required.
     *
     * @return a DamageCause value detailing the cause of the damage.
     * @since 1.0.0
     */
    @NotNull
    public DamageCause getCause() {
        return this.cause;
    }

    /**
     * Get the source of damage.
     *
     * @return a DamageSource detailing the source of the damage.
     * @since 1.20.4
     */
    @NotNull
    public DamageSource getDamageSource() {
        return this.damageSource;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * An enum to specify the types of modifier
     *
     * @deprecated This API is responsible for a large number of implementation
     * problems and is in general unsustainable to maintain.
     * @since 1.7.10
     */
    @Deprecated(since = "1.12")
    public enum DamageModifier {
        /**
         * This represents the amount of damage being done, also known as the
         * raw {@link EntityDamageEvent#getDamage()}.
         *
         * @since 1.7.10
         */
        BASE,
        /**
         * @since 1.21.3
         */
        INVULNERABILITY_REDUCTION, // Paper - fix invulnerability reduction in EntityDamageEvent - needs to be right under BASE as it's the first reduction all others are based on
        /**
         * This represents the damage increased by freezing status.
         *
         * @since 1.21
         */
        FREEZING,
        /**
         * This represents the damage reduced by a wearing a helmet when hit
         * by a falling block.
         *
         * @since 1.7.10
         */
        HARD_HAT,
        /**
         * This represents  the damage reduction caused by blocking, only present for
         * {@link Player Players}.
         *
         * @since 1.7.10
         */
        BLOCKING,
        /**
         * This represents the damage reduction caused by wearing armor.
         *
         * @since 1.7.10
         */
        ARMOR,
        /**
         * This represents the damage reduction caused by the Resistance potion effect.
         *
         * @since 1.7.10
         */
        RESISTANCE,
        /**
         * This represents the damage reduction caused by the combination of:
         * <ul>
         * <li>
         *     Armor enchantments
         * </li><li>
         *     Witch's potion resistance
         * </li>
         * </ul>
         *
         * @since 1.7.10
         */
        MAGIC,
        /**
         * This represents the damage reduction caused by the absorption potion
         * effect.
         *
         * @since 1.7.10
         */
        ABSORPTION,
        ;
    }

    /**
     * An enum to specify the cause of the damage
     *
     * @since 1.0.0
     */
    public enum DamageCause {

        /**
         * Damage caused by /kill command.
         * <p>
         * Damage: {@link Float#MAX_VALUE}
         *
         * @since 1.20
         */
        KILL,
        /**
         * Damage caused by the World Border.
         * <p>
         * Damage: {@link WorldBorder#getDamageAmount()} <!-- todo not accurate -->
         *
         * @since 1.20
         */
        WORLD_BORDER,
        /**
         * Damage caused when an entity contacts another entity (sulfur cube) or block (cactus, dripstone stalagmite,
         * berry bush, campfire, magma block).
         * <p>
         * Damage: variable
         *
         * @since 1.0.0
         */
        CONTACT,
        /**
         * Damage caused when an entity attacks another entity.
         * <p>
         * Damage: variable
         *
         * @since 1.0.0
         */
        ENTITY_ATTACK,
        /**
         * Damage caused when an entity attacks another entity in a sweep attack.
         * <p>
         * Damage: variable
         *
         * @since 1.11.2
         */
        ENTITY_SWEEP_ATTACK,
        /**
         * Damage caused when attacked by a projectile.
         * <p>
         * Damage: variable
         *
         * @since 1.0.0
         */
        PROJECTILE,
        /**
         * Damage caused by being put in a block.
         * <p>
         * Damage: 1
         *
         * @since 1.0.0
         */
        SUFFOCATION,
        /**
         * Damage caused when an entity falls a distance greater than the {@link org.bukkit.attribute.Attribute#SAFE_FALL_DISTANCE safe fall distance}.
         * <p>
         * Damage: fall height - {@link org.bukkit.attribute.Attribute#SAFE_FALL_DISTANCE safe fall distance} <!-- todo not accurate -->
         *
         * @since 1.0.0
         */
        FALL,
        /**
         * Damage caused by direct exposure to fire.
         * <p>
         * Damage: 1 or 2 (for soul fire)
         *
         * @since 1.0.0
         */
        FIRE,
        /**
         * Damage caused due to burns caused by fire.
         * <p>
         * Damage: 1
         *
         * @since 1.0.0
         */
        FIRE_TICK,
        /**
         * Damage caused due to a snowman melting.
         * <p>
         * Damage: 1
         *
         * @since 1.3.1
         */
        MELTING,
        /**
         * Damage caused by direct exposure to lava.
         * <p>
         * Damage: 4
         *
         * @since 1.0.0
         */
        LAVA,
        /**
         * Damage caused by running out of air while in water.
         * <p>
         * Damage: 1 or 2
         *
         * @since 1.0.0
         */
        DROWNING,
        /**
         * Damage caused by being in the area when a block explodes.
         * <p>
         * Damage: variable
         *
         * @since 1.0.0
         */
        BLOCK_EXPLOSION,
        /**
         * Damage caused by being in the area when an entity, such as a
         * Creeper, explodes.
         * <p>
         * Damage: variable
         *
         * @since 1.0.0
         */
        ENTITY_EXPLOSION,
        /**
         * Damage caused by falling into the void.
         * <p>
         * Damage: {@link org.bukkit.World#getVoidDamageAmount()}
         *
         * @since 1.0.0
         */
        VOID,
        /**
         * Damage caused by being struck by lightning.
         * <p>
         * Damage: 5 or {@link Float#MAX_VALUE} for turtle
         *
         * @since 1.0.0
         */
        LIGHTNING,
        /**
         * Damage caused by committing suicide.
         * <p>
         * <b>Note:</b> This is currently only used by plugins, default commands
         * like /minecraft:kill use {@link #KILL} to damage players.
         * <p>
         * Damage: variable
         *
         * @since 1.0.0
         */
        SUICIDE,
        /**
         * Damage caused by starving due to having an empty hunger bar.
         * <p>
         * Damage: 1
         *
         * @since 1.0.0
         */
        STARVATION,
        /**
         * Damage caused due to an ongoing poison effect.
         * <p>
         * Damage: 1
         *
         * @since 1.1.0
         */
        POISON,
        /**
         * Damage caused by being hit by a damage potion or spell.
         * <p>
         * Damage: variable
         *
         * @since 1.1.0
         */
        MAGIC,
        /**
         * Damage caused by Wither potion effect
         *
         * @since 1.4.5
         */
        WITHER,
        /**
         * Damage caused by being hit by a falling block which deals damage.
         * <p>
         * <b>Note:</b> Not every block deals damage
         * <p>
         * Damage: variable
         *
         * @since 1.4.5
         */
        FALLING_BLOCK,
        /**
         * Damage caused in retaliation to another attack by the {@link org.bukkit.enchantments.Enchantment#THORNS}
         * enchantment or guardian.
         * <p>
         * Damage: 1-5 (thorns) or 2 (guardian)
         *
         * @since 1.5.1
         */
        THORNS,
        /**
         * Damage caused by a dragon breathing fire.
         * <p>
         * Damage: variable
         *
         * @deprecated never used without help of commands or plugins,
         * {@link #ENTITY_ATTACK} will be used instead
         * @since 1.9.4
         */
        @Deprecated(since = "1.21.5")
        DRAGON_BREATH,
        /**
         * Damage caused when an entity runs into a wall.
         * <p>
         * Damage: variable
         *
         * @since 1.9.4
         */
        FLY_INTO_WALL,
        /**
         * Damage caused when an entity steps on {@link Material#MAGMA_BLOCK}.
         * <p>
         * Damage: 1
         *
         * @deprecated use {@link #CONTACT}, the block will be exposed in the event
         * @since 1.10.2
         */
        @Deprecated(since = "26.2")
        HOT_FLOOR,
        /**
         * Damage caused when an entity steps on {@link Material#CAMPFIRE} or {@link Material#SOUL_CAMPFIRE}.
         * <p>
         * Damage: 1 or 2 (for soul fire)
         *
         * @deprecated use {@link #CONTACT}, the block will be exposed in the event
         * @since 1.21
         */
        @Deprecated(since = "26.2")
        CAMPFIRE,
        /**
         * Damage caused when an entity is colliding with too many entities due
         * to the {@link org.bukkit.GameRules#MAX_ENTITY_CRAMMING}.
         * <p>
         * Damage: 6
         *
         * @since 1.11
         */
        CRAMMING,
        /**
         * Damage caused when an entity that should be in water is not.
         * <p>
         * Damage: 1 or 2
         *
         * @since 1.13
         */
        DRYOUT,
        /**
         * Damage caused from freezing.
         * <p>
         * Damage: 1 or 5 (for {@link org.bukkit.Tag#ENTITY_TYPES_FREEZE_HURTS_EXTRA_TYPES sensitive} entities)
         *
         * @since 1.17
         */
        FREEZE,
        /**
         * Damage caused by the Sonic Boom attack from {@link org.bukkit.entity.Warden}.
         * <p>
         * Damage: 10
         *
         * @since 1.19
         */
        SONIC_BOOM,
        /**
         * Custom damage.
         * <p>
         * Damage: variable
         *
         * @since 1.0.0
         */
        CUSTOM;
    }
}
