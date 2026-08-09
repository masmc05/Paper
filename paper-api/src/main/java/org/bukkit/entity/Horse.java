package org.bukkit.entity;

import org.bukkit.inventory.HorseInventory;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a Horse.
 *
 * @since 1.6.1
 */
public interface Horse extends AbstractHorse {

    /**
     * @deprecated different variants are differing classes
     * @since 1.6.2
     */
    @Deprecated(since = "1.11")
    public enum Variant {
        /**
         * A normal horse
         *
         * @since 1.6.2
         */
        HORSE,
        /**
         * A donkey
         *
         * @since 1.6.2
         */
        DONKEY,
        /**
         * A mule
         *
         * @since 1.6.2
         */
        MULE,
        /**
         * An undead horse
         *
         * @since 1.6.2
         */
        UNDEAD_HORSE,
        /**
         * A skeleton horse
         *
         * @since 1.6.2
         */
        SKELETON_HORSE,
        /**
         * Not really a horse :)
         *
         * @since 1.11
         */
        LLAMA,
        /**
         * Also not really a horse :)
         *
         * @since 1.19.3
         */
        CAMEL,
        ;
    }

    /**
     * Represents the base color that the horse has.
     *
     * @since 1.6.2
     */
    public enum Color {
        /**
         * Snow white
         *
         * @since 1.6.2
         */
        WHITE,
        /**
         * Very light brown
         *
         * @since 1.6.2
         */
        CREAMY,
        /**
         * Chestnut
         *
         * @since 1.6.2
         */
        CHESTNUT,
        /**
         * Light brown
         *
         * @since 1.6.2
         */
        BROWN,
        /**
         * Pitch black
         *
         * @since 1.6.2
         */
        BLACK,
        /**
         * Gray
         *
         * @since 1.6.2
         */
        GRAY,
        /**
         * Dark brown
         *
         * @since 1.6.2
         */
        DARK_BROWN,
        ;
    }

    /**
     * Represents the style, or markings, that the horse has.
     *
     * @since 1.6.2
     */
    public enum Style {
        /**
         * No markings
         *
         * @since 1.6.2
         */
        NONE,
        /**
         * White socks or stripes
         *
         * @since 1.6.2
         */
        WHITE,
        /**
         * Milky splotches
         *
         * @since 1.6.2
         */
        WHITEFIELD,
        /**
         * Round white dots
         *
         * @since 1.6.2
         */
        WHITE_DOTS,
        /**
         * Small black dots
         *
         * @since 1.6.2
         */
        BLACK_DOTS,
        ;
    }

    /**
     * Gets the horse's color.
     * <p>
     * Colors only apply to horses, not to donkeys, mules, skeleton horses
     * or undead horses.
     *
     * @return a {@link Color} representing the horse's group
     * @since 1.6.2
     */
    @NotNull
    public Color getColor();

    /**
     * Sets the horse's color.
     * <p>
     * Attempting to set a color for any donkey, mule, skeleton horse or
     * undead horse will not result in a change.
     *
     * @param color a {@link Color} for this horse
     * @since 1.6.2
     */
    public void setColor(@NotNull Color color);

    /**
     * Gets the horse's style.
     * Styles determine what kind of markings or patterns a horse has.
     * <p>
     * Styles only apply to horses, not to donkeys, mules, skeleton horses
     * or undead horses.
     *
     * @return a {@link Style} representing the horse's style
     * @since 1.6.2
     */
    @NotNull
    public Style getStyle();

    /**
     * Sets the style of this horse.
     * Styles determine what kind of markings or patterns a horse has.
     * <p>
     * Attempting to set a style for any donkey, mule, skeleton horse or
     * undead horse will not result in a change.
     *
     * @param style a {@link Style} for this horse
     * @since 1.6.2
     */
    public void setStyle(@NotNull Style style);

    /**
     * @return carrying chest status
     * @deprecated see {@link ChestedHorse}
     */
    @Deprecated(since = "1.11", forRemoval = true)
    public boolean isCarryingChest();

    /**
     * @param chest chest
     * @deprecated see {@link ChestedHorse}
     */
    @Deprecated(since = "1.11", forRemoval = true)
    public void setCarryingChest(boolean chest);

    /**
     * @since 1.6.2
     */
    @NotNull
    @Override
    public HorseInventory getInventory();
}
