package org.bukkit.entity;

import java.util.List;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.projectiles.ProjectileSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an area effect cloud which will imbue a potion effect onto
 * entities which enter it.
 *
 * @since 1.9.4
 */
public interface AreaEffectCloud extends Entity {

    /**
     * Gets the duration which this cloud will exist for (in ticks).
     *
     * @return cloud duration or {@link PotionEffect#INFINITE_DURATION} for no duration
     * @since 1.9.4
     */
    int getDuration();

    /**
     * Sets the duration which this cloud will exist for (in ticks).
     *
     * @param duration cloud duration or {@link PotionEffect#INFINITE_DURATION} for no duration
     * @since 1.9.4
     */
    void setDuration(int duration);

    /**
     * Gets the time which an entity has to be exposed to the cloud before the
     * effect is applied.
     *
     * @return wait time
     * @since 1.9.4
     */
    int getWaitTime();

    /**
     * Sets the time which an entity has to be exposed to the cloud before the
     * effect is applied.
     *
     * @param waitTime wait time
     * @since 1.9.4
     */
    void setWaitTime(int waitTime);

    /**
     * Gets the time that an entity will be immune from subsequent exposure.
     *
     * @return reapplication delay
     * @since 1.9.4
     */
    int getReapplicationDelay();

    /**
     * Sets the time that an entity will be immune from subsequent exposure.
     *
     * @param delay reapplication delay
     * @since 1.9.4
     */
    void setReapplicationDelay(int delay);

    /**
     * Gets the amount that the duration of this cloud will decrease by when it
     * applies an effect to an entity.
     *
     * @return duration on use delta
     * @since 1.9.4
     */
    int getDurationOnUse();

    /**
     * Sets the amount that the duration of this cloud will decrease by when it
     * applies an effect to an entity.
     *
     * @param duration duration on use delta
     * @since 1.9.4
     */
    void setDurationOnUse(int duration);

    /**
     * Gets the initial radius of the cloud.
     *
     * @return radius
     * @since 1.9.4
     */
    float getRadius();

    /**
     * Sets the initial radius of the cloud.
     *
     * @param radius radius
     * @since 1.9.4
     */
    void setRadius(float radius);

    /**
     * Gets the amount that the radius of this cloud will decrease by when it
     * applies an effect to an entity.
     *
     * @return radius on use delta
     * @since 1.9.4
     */
    float getRadiusOnUse();

    /**
     * Sets the amount that the radius of this cloud will decrease by when it
     * applies an effect to an entity.
     *
     * @param radius radius on use delta
     * @since 1.9.4
     */
    void setRadiusOnUse(float radius);

    /**
     * Gets the amount that the radius of this cloud will decrease by each tick.
     *
     * @return radius per tick delta
     * @since 1.9.4
     */
    float getRadiusPerTick();

    /**
     * Sets the amount that the radius of this cloud will decrease by each tick.
     *
     * @param radius per tick delta
     * @since 1.9.4
     */
    void setRadiusPerTick(float radius);

    /**
     * Gets the particle which this cloud will be composed of
     *
     * @return particle the set particle type
     * @since 1.9.4
     */
    @NotNull
    Particle getParticle();

    /**
     * Sets the particle which this cloud will be composed of
     *
     * @param particle the new particle type
     * @since 1.9.4
     */
    void setParticle(@NotNull Particle particle);

    /**
     * Sets the particle which this cloud will be composed of
     *
     * @param <T> type of particle data (see {@link Particle#getDataType()})
     * @param particle the new particle type
     * @param data the data to use for the particle or null,
     *             the type of this depends on {@link Particle#getDataType()}
     * @since 1.13
     */
    <T> void setParticle(@NotNull Particle particle, @Nullable T data);

    /**
     * Sets the underlying potion data
     *
     * @param data PotionData to set the base potion state to
     * @deprecated Upgraded / extended potions are now their own {@link PotionType} use {@link #setBasePotionType} instead.
     */
    @Deprecated(since = "1.20.6", forRemoval = true)
    void setBasePotionData(@Nullable PotionData data);

    /**
     * Returns the potion data about the base potion
     *
     * @return a PotionData object
     * @deprecated Upgraded / extended potions are now their own {@link PotionType} use {@link #getBasePotionType()} instead.
     */
    @Nullable
    @Deprecated(since = "1.20.6", forRemoval = true)
    PotionData getBasePotionData();

    /**
     * Sets the underlying potion type
     *
     * @param type PotionType to set the base potion state to
     * @since 1.20.2
     */
    void setBasePotionType(@Nullable PotionType type);

    /**
     * Returns the potion type about the base potion
     *
     * @return a PotionType object
     * @since 1.20.2
     */
    @Nullable
    PotionType getBasePotionType();

    /**
     * Checks for the presence of custom potion effects.
     *
     * @return true if custom potion effects are applied
     * @since 1.9.4
     */
    boolean hasCustomEffects();

    /**
     * Gets an immutable list containing all custom potion effects applied to
     * this cloud.
     * <p>
     * Plugins should check that hasCustomEffects() returns true before calling
     * this method.
     *
     * @return the immutable list of custom potion effects
     * @since 1.9.4
     */
    @NotNull
    List<PotionEffect> getCustomEffects();

    /**
     * Adds a custom potion effect to this cloud.
     *
     * @param effect the potion effect to add
     * @param overwrite true if any existing effect of the same type should be
     * overwritten
     * @return true if the effect was added as a result of this call
     * @since 1.9.4
     */
    boolean addCustomEffect(@NotNull PotionEffect effect, boolean overwrite);

    /**
     * Removes a custom potion effect from this cloud.
     *
     * @param type the potion effect type to remove
     * @return true if the effect was removed as a result of this call
     * @since 1.9.4
     */
    boolean removeCustomEffect(@NotNull PotionEffectType type);

    /**
     * Checks for a specific custom potion effect type on this cloud.
     *
     * @param type the potion effect type to check for
     * @return true if the potion has this effect
     * @since 1.9.4
     */
    boolean hasCustomEffect(@NotNull PotionEffectType type);

    /**
     * Removes all custom potion effects from this cloud.
     *
     * @since 1.9.4
     */
    void clearCustomEffects();

    /**
     * Gets the color of this cloud. Will be applied as a tint to its particles.
     *
     * @return cloud color
     * @since 1.9.4
     */
    @NotNull
    Color getColor();

    /**
     * Sets the color of this cloud. Will be applied as a tint to its particles.
     *
     * @param color cloud color or {@code null} to reset to default
     * @since 1.9.4
     */
    void setColor(@Nullable Color color);

    /**
     * Retrieve the original source of this cloud.
     *
     * @return the {@link ProjectileSource} that threw the LingeringPotion
     * @since 1.9.4
     */
    @Nullable
    public ProjectileSource getSource();

    /**
     * Set the original source of this cloud.
     *
     * @param source the {@link ProjectileSource} that threw the LingeringPotion
     * @since 1.9.4
     */
    public void setSource(@Nullable ProjectileSource source);

    // Paper start - owner API
    /**
     * Get the entity UUID for the owner of this area effect cloud.
     *
     * @return the entity owner uuid or null
     * @since 1.20.1
     */
    @Nullable java.util.UUID getOwnerUniqueId();

    /**
     * Sets the entity UUID for the owner of this area effect cloud.
     *
     * @param ownerUuid the entity owner uuid or null to clear
     * @since 1.20.1
     */
    void setOwnerUniqueId(@Nullable java.util.UUID ownerUuid);
    // Paper end
}
