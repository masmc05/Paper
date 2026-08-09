package org.bukkit.entity;

/**
 * Represents a Slime.
 *
 * @since 1.0.0
 */
public interface Slime extends AbstractCubeMob, Enemy {

    /**
     * Setting the size of the slime (regardless of previous size)
     * will set the following attributes:
     * <ul>
     *     <li>{@link org.bukkit.attribute.Attribute#MAX_HEALTH}</li>
     *     <li>{@link org.bukkit.attribute.Attribute#MOVEMENT_SPEED}</li>
     *     <li>{@link org.bukkit.attribute.Attribute#ATTACK_DAMAGE}</li>
     * </ul>
     * to their per-size defaults and heal the
     * slime to its max health (assuming it's alive).
     *
     * @param size the new size of the slime.
     * @since 1.0.0
     */
    void setSize(int size);
}
