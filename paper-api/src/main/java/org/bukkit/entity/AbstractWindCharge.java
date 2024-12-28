package org.bukkit.entity;

import org.jetbrains.annotations.ApiStatus;

/**
 * Represents a Wind Charge.
 *
 * @since 1.20.6
 */
public interface AbstractWindCharge extends Fireball {

    /**
     * Immediately explode this WindCharge.
     *
     * @since 1.20.6
     */
    public void explode();

}
