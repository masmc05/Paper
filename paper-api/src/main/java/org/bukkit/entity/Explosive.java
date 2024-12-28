package org.bukkit.entity;

/**
 * A representation of an explosive entity
 *
 * @since 1.0.0
 */
public interface Explosive extends Entity {

    /**
     * Set the radius affected by this explosive's explosion.
     * <br>
     * This is the base yield, which may be affected by other entity attributes.
     *
     * @param yield The explosive yield
     * @since 1.0.0
     */
    public void setYield(float yield);

    /**
     * Return the radius or yield of this explosive's explosion.
     * <br>
     * This is the base yield, which may be affected by other entity attributes.
     *
     * @return the radius of blocks affected
     * @since 1.0.0
     */
    public float getYield();

    /**
     * Set whether or not this explosive's explosion causes fire
     *
     * @param isIncendiary Whether it should cause fire
     * @since 1.0.0
     */
    public void setIsIncendiary(boolean isIncendiary);

    /**
     * Return whether or not this explosive creates a fire when exploding
     *
     * @return true if the explosive creates fire, false otherwise
     * @since 1.0.0
     */
    public boolean isIncendiary();
}
