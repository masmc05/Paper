package org.bukkit.entity;

import org.jetbrains.annotations.Contract;

/**
 * Represents a Zombified piglin.
 *
 * @since 1.0.0
 */
public interface PigZombie extends Zombie {

    /**
     * Get the zombified piglin's current anger level.
     *
     * @return The anger level.
     * @since 1.0.0
     */
    int getAnger();

    /**
     * Set the zombified piglin's current anger level.
     *
     * @param level The anger level. Higher levels of anger take longer to
     *     wear off.
     * @since 1.0.0
     */
    void setAnger(int level);

    /**
     * Shorthand; sets to either 0 or the default level.
     *
     * @param angry Whether the piglin should be angry.
     * @since 1.0.0
     */
    void setAngry(boolean angry);

    /**
     * Shorthand; gets whether the piglin is angry.
     *
     * @return True if the piglin is angry, otherwise false.
     * @since 1.0.0
     */
    boolean isAngry();

    /**
     * <b>Not applicable to this entity</b>
     *
     * @return {@code false}
     * @since 1.13.2
     */
    @Override
    @Contract("-> false")
    public boolean isConverting();

    /**
     * <b>Not applicable to this entity</b>
     *
     * @since 1.13.2
     */
    @Override
    @Contract("-> fail")
    public int getConversionTime();

    /**
     * <b>Not applicable to this entity</b>
     *
     * @param time unused
     * @since 1.13.2
     */
    @Override
    @Contract("_ -> fail")
    public void setConversionTime(int time);
}
