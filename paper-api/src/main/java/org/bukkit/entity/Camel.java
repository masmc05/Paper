package org.bukkit.entity;

/**
 * Represents a Camel.
 *
 * @since 1.19.3
 */
public interface Camel extends AbstractHorse, Sittable {

    /**
     * Gets whether this camel is dashing (sprinting).
     *
     * @return dashing status
     * @since 1.19.3
     */
    boolean isDashing();

    /**
     * Sets whether this camel is dashing (sprinting).
     *
     * @param dashing new dashing status
     * @since 1.19.3
     */
    void setDashing(boolean dashing);
}
