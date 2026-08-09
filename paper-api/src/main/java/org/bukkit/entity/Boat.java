package org.bukkit.entity;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a boat entity.
 *
 * @since 1.0.0
 */
public interface Boat extends Vehicle, io.papermc.paper.entity.Leashable { // Paper - Leashable API

    /**
     * Gets the wood type of the boat.
     *
     * @return the wood type
     * @deprecated deprecated in favor of {@link #getBoatType()}
     */
    @Deprecated(since = "1.19", forRemoval = true)
    @NotNull
    TreeSpecies getWoodType();

    /**
     * Sets the wood type of the boat.
     *
     * @param species the new wood type
     * @deprecated deprecated in favor of {@link #setBoatType(Type)}
     */
    @Deprecated(since = "1.19", forRemoval = true)
    void setWoodType(@NotNull TreeSpecies species);

    /**
     * Gets the type of the boat.
     *
     * @return the boat type
     * @deprecated different boats types are now different entity types
     * @since 1.19
     */
    @Deprecated(since = "1.21.2")
    @NotNull
    Type getBoatType();

    /**
     * Sets the type of the boat.
     *
     * @param type the new type
     * @deprecated different boats types are now different entity types
     * @since 1.19
     */
    @Deprecated(since = "1.21.2")
    void setBoatType(@NotNull Type type);

    /**
     * Gets the maximum speed of a boat. The speed is unrelated to the
     * velocity.
     *
     * @return The max speed.
     * @deprecated boats are complex and many of these methods do not work correctly across multiple versions.
     * @since 1.0.0
     */
    @Deprecated(since = "1.9")
    public double getMaxSpeed();

    /**
     * Sets the maximum speed of a boat. Must be nonnegative. Default is 0.4D.
     *
     * @param speed The max speed.
     * @deprecated boats are complex and many of these methods do not work correctly across multiple versions.
     * @since 1.0.0
     */
    @Deprecated(since = "1.9")
    public void setMaxSpeed(double speed);

    /**
     * Gets the deceleration rate (newSpeed = curSpeed * rate) of occupied
     * boats. The default is 0.2.
     *
     * @return The rate of deceleration
     * @deprecated boats are complex and many of these methods do not work correctly across multiple versions.
     * @since 1.0.0
     */
    @Deprecated(since = "1.9")
    public double getOccupiedDeceleration();

    /**
     * Sets the deceleration rate (newSpeed = curSpeed * rate) of occupied
     * boats. Setting this to a higher value allows for quicker acceleration.
     * The default is 0.2.
     *
     * @param rate deceleration rate
     * @deprecated boats are complex and many of these methods do not work correctly across multiple versions.
     * @since 1.0.0
     */
    @Deprecated(since = "1.9")
    public void setOccupiedDeceleration(double rate);

    /**
     * Gets the deceleration rate (newSpeed = curSpeed * rate) of unoccupied
     * boats. The default is -1. Values below 0 indicate that no additional
     * deceleration is imposed.
     *
     * @return The rate of deceleration
     * @deprecated boats are complex and many of these methods do not work correctly across multiple versions.
     * @since 1.0.0
     */
    @Deprecated(since = "1.9")
    public double getUnoccupiedDeceleration();

    /**
     * Sets the deceleration rate (newSpeed = curSpeed * rate) of unoccupied
     * boats. Setting this to a higher value allows for quicker deceleration
     * of boats when a player disembarks. The default is -1. Values below 0
     * indicate that no additional deceleration is imposed.
     *
     * @param rate deceleration rate
     * @deprecated boats are complex and many of these methods do not work correctly across multiple versions.
     * @since 1.0.0
     */
    @Deprecated(since = "1.9")
    public void setUnoccupiedDeceleration(double rate);

    /**
     * Get whether boats can work on land.
     *
     * @return whether boats can work on land
     * @deprecated boats are complex and many of these methods do not work correctly across multiple versions.
     * @since 1.0.0
     */
    @Deprecated(since = "1.9")
    public boolean getWorkOnLand();

    /**
     * Set whether boats can work on land.
     *
     * @param workOnLand whether boats can work on land
     * @deprecated boats are complex and many of these methods do not work correctly across multiple versions.
     * @since 1.0.0
     */
    @Deprecated(since = "1.9")
    public void setWorkOnLand(boolean workOnLand);

    /**
     * Gets the status of the boat.
     *
     * @return the status
     * @since 1.19
     */
    @NotNull
    public Status getStatus();

    /**
     * Represents the type of boats.
     * @deprecated different boats types are now different entity types
     * @since 1.19
     */
    @Deprecated(since = "1.21.2")
    public enum Type {
        /**
         * @since 1.19
         */
        OAK(Material.OAK_PLANKS),
        /**
         * @since 1.19
         */
        SPRUCE(Material.SPRUCE_PLANKS),
        /**
         * @since 1.19
         */
        BIRCH(Material.BIRCH_PLANKS),
        /**
         * @since 1.19
         */
        JUNGLE(Material.JUNGLE_PLANKS),
        /**
         * @since 1.19
         */
        ACACIA(Material.ACACIA_PLANKS),
        /**
         * @since 1.19.4
         */
        CHERRY(Material.CHERRY_PLANKS),
        /**
         * @since 1.19
         */
        DARK_OAK(Material.DARK_OAK_PLANKS),
        /**
         * @since 1.19
         */
        MANGROVE(Material.MANGROVE_PLANKS),
        /**
         * @since 1.19.3
         */
        BAMBOO(Material.BAMBOO_PLANKS),
        ;

        private final Material materialBlock;

        private Type(Material materialBlock) {
            this.materialBlock = materialBlock;
        }

        /**
         * Gets the material of the boat type.
         *
         * @return a material
         * @since 1.19
         */
        @NotNull
        public Material getMaterial() {
            return this.materialBlock;
        }
    }

    /**
     * Represents the status of the boat.
     *
     * @since 1.19
     */
    public enum Status {

        /**
         * @since 1.20.1
         */
        NOT_IN_WORLD,
        /**
         * @since 1.19
         */
        // Start generate - BoatStatus
        IN_WATER,
        /**
         * @since 1.19
         */
        UNDER_WATER,
        /**
         * @since 1.19
         */
        UNDER_FLOWING_WATER,
        /**
         * @since 1.19
         */
        ON_LAND,
        /**
         * @since 1.19
         */
        IN_AIR;
        // End generate - BoatStatus
    }

    // Paper start
    /**
     * Gets the {@link Material} that represents this Boat type.
     *
     * @return the boat material.
     * @since 1.16.4
     */
    @NotNull
    public Material getBoatMaterial();
    // Paper end
}
