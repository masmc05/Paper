package io.papermc.paper.inventory;

import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.jetbrains.annotations.NotNull;

/**
 * @deprecated use {@link org.bukkit.inventory.ItemRarity} with {@link org.bukkit.inventory.meta.ItemMeta#getRarity()}
 * @since 1.16.5
 */
@Deprecated(forRemoval = true, since = "1.20.5")
public enum ItemRarity {

    COMMON(NamedTextColor.WHITE),
    UNCOMMON(NamedTextColor.YELLOW),
    RARE(NamedTextColor.AQUA),
    EPIC(NamedTextColor.LIGHT_PURPLE);

    TextColor color;

    ItemRarity(TextColor color) {
        this.color = color;
    }

    /**
     * Gets the color formatting associated with the rarity.
     * @return
     * @since 1.16.5
     */
    @NotNull
    public TextColor getColor() {
        return color;
    }
}
