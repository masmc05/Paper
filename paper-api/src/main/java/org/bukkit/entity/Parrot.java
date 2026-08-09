package org.bukkit.entity;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a Parrot.
 *
 * @since 1.12
 */
public interface Parrot extends Tameable, Sittable {

    /**
     * Get the variant of this parrot.
     *
     * @return parrot variant
     * @since 1.12
     */
    @NotNull
    public Variant getVariant();

    /**
     * Set the variant of this parrot.
     *
     * @param variant parrot variant
     * @since 1.12
     */
    public void setVariant(@NotNull Variant variant);

    /**
     * Gets whether a parrot is dancing
     *
     * @return Whether the parrot is dancing
     * @since 1.19
     */
    public boolean isDancing();

    /**
     * Represents the variant of a parrot - ie its color.
     *
     * @since 1.12
     */
    public enum Variant {
        /**
         * Classic parrot - red with colored wingtips.
         *
         * @since 1.12
         */
        RED,
        /**
         * Royal blue colored parrot.
         *
         * @since 1.12
         */
        BLUE,
        /**
         * Green colored parrot.
         *
         * @since 1.12
         */
        GREEN,
        /**
         * Cyan colored parrot.
         *
         * @since 1.12
         */
        CYAN,
        /**
         * Gray colored parrot.
         *
         * @since 1.12
         */
        GRAY;
    }
}
