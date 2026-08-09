package org.bukkit.entity;

import org.bukkit.Location;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Represents a Creaking.
 *
 * @since 1.21.3
 */
@NullMarked
public interface Creaking extends Monster {

    /**
     * Gets the home location for this creaking (where its {@link org.bukkit.block.CreakingHeart} could be found).
     *
     * @return the location of the home if available, null otherwise
     * @since 1.21.4
     */
    @Nullable
    Location getHome();

    /**
     * Activates this creaking to target and follow a player.
     *
     * @param player the target
     * @since 1.21.4
     */
    void activate(final Player player);

    /**
     * Deactivates the creaking, clearing its current attack target and
     * marking it as inactive.
     *
     * @since 1.21.4
     */
    void deactivate();

    /**
     * Returns if this creaking is currently active and hunting.
     *
     * @see #activate(Player)
     *
     * @return true if active
     * @since 1.21.4
     */
    boolean isActive();

}
