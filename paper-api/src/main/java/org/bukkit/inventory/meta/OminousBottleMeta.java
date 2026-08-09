package org.bukkit.inventory.meta;

import org.jetbrains.annotations.NotNull;

/**
 * Represents an ominous bottle with an amplifier of the bad omen effect.
 *
 * @since 1.20.6
 */
public interface OminousBottleMeta extends ItemMeta {

    /**
     * Checks for the presence of an amplifier.
     *
     * @return true if a customer amplifier is applied
     * @since 1.20.6
     */
    boolean hasAmplifier();

    /**
     * Gets the amplifier amount for an Ominous Bottle's bad omen effect.
     * <p>
     * Plugins should check that hasAmplifier() returns true before calling this
     * method.
     *
     * @return amplifier
     * @since 1.20.6
     */
    int getAmplifier();

    /**
     * Sets the amplifier amount for an Ominous Bottle's bad omen effect.
     *
     * @param amplifier between 0 and 4
     * @since 1.20.6
     */
    void setAmplifier(int amplifier);

    @Override
    @NotNull
    OminousBottleMeta clone();
}
