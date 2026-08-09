package org.bukkit.entity;

import org.jetbrains.annotations.NotNull;

/**
 * @since 1.8
 */
public interface Rabbit extends Animals {

    /**
     * @return The type of rabbit.
     * @since 1.8
     */
    @NotNull
    public Type getRabbitType();

    /**
     * @param type Sets the type of rabbit for this entity.
     * @since 1.8
     */
    public void setRabbitType(@NotNull Type type);
    // Paper start
    /**
     * Sets how many ticks this rabbit will wait
     * until trying to find more carrots.
     *
     * @param ticks ticks
     * @since 1.19.3
     */
    void setMoreCarrotTicks(int ticks);

    /**
     * Returns how many ticks this rabbit
     * will wait until trying to find more carrots.
     *
     * @return ticks
     * @since 1.19.3
     */
    int getMoreCarrotTicks();
    // Paper end

    /**
     * Represents the various types a Rabbit might be.
     *
     * @since 1.8
     */
    public enum Type {

        /**
         * Chocolate colored rabbit.
         *
         * @since 1.8
         */
        BROWN,
        /**
         * Pure white rabbit.
         *
         * @since 1.8
         */
        WHITE,
        /**
         * Black rabbit.
         *
         * @since 1.8
         */
        BLACK,
        /**
         * Black with white patches, or white with black patches?
         *
         * @since 1.8
         */
        BLACK_AND_WHITE,
        /**
         * Golden bunny.
         *
         * @since 1.8
         */
        GOLD,
        /**
         * Salt and pepper colored, whatever that means.
         *
         * @since 1.8
         */
        SALT_AND_PEPPER,
        /**
         * Rabbit with pure white fur, blood red horizontal eyes, and is hostile to players.
         *
         * @since 1.8
         */
        THE_KILLER_BUNNY
    }
}
