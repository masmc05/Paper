package io.papermc.paper.registry.data;

import io.papermc.paper.registry.RegistryBuilder;
import org.bukkit.damage.DamageEffect;
import org.bukkit.damage.DamageScaling;
import org.bukkit.damage.DamageType;
import org.bukkit.damage.DeathMessageType;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

/**
 * A data-centric version-specific registry entry for the {@link DamageType} type.
 *
 * @since 1.21.4
 */
@ApiStatus.NonExtendable
public interface DamageTypeRegistryEntry {

    /**
     * Provides part of the death message translation key. (death.attack.&lt;message_id&gt;)
     * <p>
     * <strong>Note</strong> The translation key is only used if
     * {@link #deathMessageType()} is {@link DeathMessageType#DEFAULT}
     *
     * @return part of the translation key
     * @since 1.21.4
     */
    String messageId();

    /**
     * Provides the {@link DamageScaling} for this damage type.
     *
     * @return the damage scaling
     * @since 1.21.4
     */
    DamageScaling damageScaling();

    /**
     * Provides the amount of hunger exhaustion caused by this damage type.
     *
     * @return the exhaustion
     * @since 1.21.4
     */
    float exhaustion();

    /**
     * Provides the {@link DamageEffect} for this damage type.
     *
     * @return the damage effect
     * @since 1.21.4
     */
    DamageEffect damageEffect();

    /**
     * Provides the {@link DeathMessageType} for this damage type.
     *
     * @return the death message type
     * @since 1.21.4
     */
    DeathMessageType deathMessageType();

    /**
     * A mutable builder for the {@link DamageTypeRegistryEntry} plugins may change in applicable registry events.
     * <p>
     * The following values are required for each builder:
     * <ul>
     *     <li>{@link #messageId(String)}</li>
     *     <li>{@link #exhaustion(float)}</li>
     *     <li>{@link #damageScaling(DamageScaling)}</li>
     * </ul>
     *
     * @since 1.21.4
     */
    @ApiStatus.NonExtendable
    interface Builder extends DamageTypeRegistryEntry, RegistryBuilder<DamageType> {

        /**
         * Sets part of the death message translation key.
         *
         * @return this builder instance
         * @see DamageTypeRegistryEntry#messageId()
         * @see DamageType#getTranslationKey()
         * @since 1.21.4
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder messageId(String messageId);

        /**
         * Sets the amount of hunger exhaustion caused by this damage type.
         *
         * @return this builder instance
         * @see DamageTypeRegistryEntry#exhaustion()
         * @see DamageType#getExhaustion()
         * @since 1.21.4
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder exhaustion(float exhaustion);

        /**
         * Sets the {@link DamageScaling} for this damage type.
         *
         * @return this builder instance
         * @see DamageTypeRegistryEntry#damageScaling()
         * @see DamageType#getDamageScaling()
         * @since 1.21.4
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder damageScaling(DamageScaling scaling);

        /**
         * Sets the {@link DamageEffect} for this damage type.
         *
         * @return this builder instance
         * @see DamageTypeRegistryEntry#damageEffect()
         * @see DamageType#getDamageEffect()
         * @since 1.21.4
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder damageEffect(DamageEffect effect);

        /**
         * Sets the {@link DeathMessageType} for this damage type.
         *
         * @return this builder instance
         * @see DamageTypeRegistryEntry#deathMessageType()
         * @see DamageType#getDeathMessageType()
         * @since 1.21.4
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder deathMessageType(DeathMessageType deathMessageType);
    }
}
