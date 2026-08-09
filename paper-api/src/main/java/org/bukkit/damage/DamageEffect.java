package org.bukkit.damage;

import io.papermc.paper.InternalAPIBridge;
import org.bukkit.Sound;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a type of effect that occurs when damage is inflicted. Currently,
 * effects only determine the sound that plays.
 *
 * @since 1.20.4
 */
public interface DamageEffect {

    /**
     * The default damage effect.
     *
     * @since 1.20.4
     */
    public static final DamageEffect HURT = getDamageEffect("hurt");
    /**
     * Thorns.
     *
     * @since 1.20.4
     */
    public static final DamageEffect THORNS = getDamageEffect("thorns");
    /**
     * Drowning.
     *
     * @since 1.20.4
     */
    public static final DamageEffect DROWNING = getDamageEffect("drowning");
    /**
     * A single burn tick (fire, lava, etc.).
     *
     * @since 1.20.4
     */
    public static final DamageEffect BURNING = getDamageEffect("burning");
    /**
     * Poked by a berry bush.
     *
     * @since 1.20.4
     */
    public static final DamageEffect POKING = getDamageEffect("poking");
    /**
     * Freeze tick (powder snow).
     *
     * @since 1.20.4
     */
    public static final DamageEffect FREEZING = getDamageEffect("freezing");

    @NotNull
    private static DamageEffect getDamageEffect(@NotNull String key) {
        return InternalAPIBridge.get().getDamageEffect(key);
    }

    /**
     * Get the {@link Sound} played for this {@link DamageEffect}.
     *
     * @return the sound
     * @since 1.20.4
     */
    @NotNull
    public Sound getSound();
}
