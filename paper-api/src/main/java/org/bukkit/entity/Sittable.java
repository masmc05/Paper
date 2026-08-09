package org.bukkit.entity;

/**
 * An entity that can sit still.
 *
 * @since 1.12
 */
public interface Sittable extends Entity {

    /**
     * Checks if this entity is sitting
     *
     * @return true if sitting
     * @since 1.12
     */
    boolean isSitting();

    /**
     * Sets if this entity is sitting. Will remove any path that the entity
     * was following beforehand.
     *
     * @param sitting true if sitting
     * @since 1.12
     */
    void setSitting(boolean sitting);

}
