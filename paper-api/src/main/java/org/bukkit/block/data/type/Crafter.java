package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Powerable;
import org.jetbrains.annotations.NotNull;

/**
 * 'orientation' is the direction the block is facing.
 * <br>
 * Similar to {@link Powerable}, 'triggered' indicates whether or not the
 * dispenser is currently activated.
 * <br>
 * 'crafting' is whether crafter's mouth is open and top is glowing.
 *
 * @since 1.20.4
 */
public interface Crafter extends BlockData {

    /**
     * Gets the value of the 'crafting' property.
     *
     * @return the 'crafting' value
     * @since 1.20.4
     */
    boolean isCrafting();

    /**
     * Sets the value of the 'crafting' property.
     *
     * @param crafting the new 'crafting' value
     * @since 1.20.4
     */
    void setCrafting(boolean crafting);

    /**
     * Gets the value of the 'triggered' property.
     *
     * @return the 'triggered' value
     * @since 1.20.4
     */
    boolean isTriggered();

    /**
     * Sets the value of the 'triggered' property.
     *
     * @param triggered the new 'triggered' value
     * @since 1.20.4
     */
    void setTriggered(boolean triggered);

    /**
     * Gets the value of the 'orientation' property.
     *
     * @return the 'orientation' value
     * @since 1.20.4
     */
    @NotNull
    org.bukkit.block.Orientation getOrientation();

    /**
     * Sets the value of the 'orientation' property.
     *
     * @param orientation the new 'orientation' value
     * @since 1.20.4
     */
    void setOrientation(@NotNull org.bukkit.block.Orientation orientation);

    /**
     * The directions the Crafter can be oriented.
     *
     * @deprecated this property is not specific to the Crafter, use
     * {@link org.bukkit.block.Orientation} instead. All references
     * to this enum will be redirected to that enum at runtime.
     * @since 1.20.4
     */
    @Deprecated
    public enum Orientation {

        /**
         * @since 1.20.4
         */
        DOWN_EAST,
        /**
         * @since 1.20.4
         */
        DOWN_NORTH,
        /**
         * @since 1.20.4
         */
        DOWN_SOUTH,
        /**
         * @since 1.20.4
         */
        DOWN_WEST,
        /**
         * @since 1.20.4
         */
        UP_EAST,
        /**
         * @since 1.20.4
         */
        UP_NORTH,
        /**
         * @since 1.20.4
         */
        UP_SOUTH,
        /**
         * @since 1.20.4
         */
        UP_WEST,
        /**
         * @since 1.20.4
         */
        WEST_UP,
        /**
         * @since 1.20.4
         */
        EAST_UP,
        /**
         * @since 1.20.4
         */
        NORTH_UP,
        /**
         * @since 1.20.4
         */
        SOUTH_UP;
    }
}
