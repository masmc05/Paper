package org.bukkit;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a vibration from a Skulk sensor.
 *
 * @since 1.17
 */
public class Vibration {

    private final Location origin;
    private final Destination destination;
    private final int arrivalTime;

    /**
     * @since 1.19
     */
    public Vibration(@NotNull Destination destination, @NotNull int arrivalTime) {
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.origin = new Location(null, 0, 0, 0); // Dummy origin because getter expects not null
    }

    @Deprecated(forRemoval = true)
    public Vibration(@NotNull Location origin, @NotNull Destination destination, int arrivalTime) {
        this.origin = origin;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
    }

    /**
     * Get the origin of the vibration.
     *
     * @deprecated unused as of 1.19
     * @return origin
     */
    @NotNull
    @Deprecated(forRemoval = true) // Paper
    public Location getOrigin() {
        return origin;
    }

    /**
     * Get the vibration destination.
     *
     * @return destination
     * @since 1.17
     */
    @NotNull
    public Destination getDestination() {
        return destination;
    }

    /**
     * Get the vibration arrival time in ticks.
     *
     * @return arrival time
     * @since 1.17
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @since 1.17
     */
    public interface Destination {

        /**
         * @since 1.17
         */
        public static class EntityDestination implements Destination {

            private final Entity entity;

            /**
             * @since 1.17
             */
            public EntityDestination(@NotNull Entity entity) {
                this.entity = entity;
            }

            /**
             * @since 1.17
             */
            @NotNull
            public Entity getEntity() {
                return entity;
            }
        }

        /**
         * @since 1.17
         */
        public static class BlockDestination implements Destination {

            private final Location block;

            /**
             * @since 1.17
             */
            public BlockDestination(@NotNull Location block) {
                this.block = block.clone();
            }

            /**
             * @since 1.17
             */
            public BlockDestination(@NotNull Block block) {
                this(block.getLocation());
            }

            /**
             * @since 1.17
             */
            @NotNull
            public Location getLocation() {
                return block.clone();
            }

            /**
             * @since 1.17
             */
            @NotNull
            public Block getBlock() {
                return block.getBlock();
            }
        }
    }
}
