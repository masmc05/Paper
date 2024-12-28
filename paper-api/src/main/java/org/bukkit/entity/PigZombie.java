package org.bukkit.entity;

/**
 * Represents a Pig Zombie.
 *
 * @since 1.0.0
 */
public interface PigZombie extends Zombie {

    /**
     * Get the pig zombie's current anger level.
     *
     * @return The anger level.
     * @since 1.0.0
     */
    int getAnger();

    /**
     * Set the pig zombie's current anger level.
     *
     * @param level The anger level. Higher levels of anger take longer to
     *     wear off.
     * @since 1.0.0
     */
    void setAnger(int level);

    /**
     * Shorthand; sets to either 0 or the default level.
     *
     * @param angry Whether the zombie should be angry.
     * @since 1.0.0
     */
    void setAngry(boolean angry);

    /**
     * Shorthand; gets whether the zombie is angry.
     *
     * @return True if the zombie is angry, otherwise false.
     * @since 1.0.0
     */
    boolean isAngry();

    /**
     * <b>Not applicable to this entity</b>
     *
     * @return false
     * @since 1.13.2
     */
    @Override
    public boolean isConverting();

    /**
     * <b>Not applicable to this entity</b>
     *
     * @since 1.13.2
     */
    @Override
    public int getConversionTime();

    /**
     * <b>Not applicable to this entity</b>
     *
     * @param time unused
     * @since 1.13.2
     */
    @Override
    public void setConversionTime(int time);
}
