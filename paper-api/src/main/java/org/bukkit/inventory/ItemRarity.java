package org.bukkit.inventory;

import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;

/**
 * An item's rarity determines the default color of its name. This enum is
 * ordered from least rare to most rare.
 *
 * @since 1.20.6
 */
public enum ItemRarity {

    /**
     * @since 1.20.6
     */
    // Start generate - ItemRarity
    COMMON(NamedTextColor.WHITE),
    /**
     * @since 1.20.6
     */
    UNCOMMON(NamedTextColor.YELLOW),
    /**
     * @since 1.20.6
     */
    RARE(NamedTextColor.AQUA),
    /**
     * @since 1.20.6
     */
    EPIC(NamedTextColor.LIGHT_PURPLE);
    // End generate - ItemRarity

    private final net.kyori.adventure.text.format.NamedTextColor color;

    ItemRarity(final net.kyori.adventure.text.format.NamedTextColor color) {
        this.color = color;
    }

    /**
     * Gets the color formatting associated with this rarity.
     *
     * @return the color
     * @since 1.20.6
     */
    public @org.jetbrains.annotations.NotNull TextColor color() {
        return this.color;
    }
}
