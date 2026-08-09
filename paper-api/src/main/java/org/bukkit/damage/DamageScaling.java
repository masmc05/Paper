package org.bukkit.damage;

import org.bukkit.entity.Player;

/**
 * A means of damage scaling with respect to the server's difficulty.
 *
 * @since 1.20.4
 */
public enum DamageScaling {

    /**
     * Damage is not scaled.
     *
     * @since 1.20.4
     */
    NEVER,
    /**
     * Damage is scaled only when the
     * {@link DamageSource#getCausingEntity() causing entity} is not a
     * {@link Player}.
     *
     * @since 1.20.4
     */
    WHEN_CAUSED_BY_LIVING_NON_PLAYER,
    /**
     * Damage is always scaled.
     *
     * @since 1.20.4
     */
    ALWAYS;
}
