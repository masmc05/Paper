package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player changes recipe book settings.
 *
 * @since 1.20.2
 */
public class PlayerRecipeBookSettingsChangeEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final RecipeBookType recipeBookType;
    private final boolean open;
    private final boolean filtering;

    @ApiStatus.Internal
    public PlayerRecipeBookSettingsChangeEvent(@NotNull final Player player, @NotNull final RecipeBookType recipeBookType, final boolean open, final boolean filtering) {
        super(player);
        this.recipeBookType = recipeBookType;
        this.open = open;
        this.filtering = filtering;
    }

    /**
     * Gets the type of recipe book the player is changing the settings for.
     *
     * @return the type of recipe book
     * @since 1.20.2
     */
    @NotNull
    public RecipeBookType getRecipeBookType() {
        return this.recipeBookType;
    }

    /**
     * Checks if the recipe book is being opened or closed.
     *
     * @return {@code true} if opening
     * @since 1.20.2
     */
    public boolean isOpen() {
        return this.open;
    }

    /**
     * Checks if the recipe book filter is being enabled or disabled.
     *
     * @return {@code true} if enabling
     * @since 1.20.2
     */
    public boolean isFiltering() {
        return this.filtering;
    }

    /**
     * @since 1.20.2
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.20.2
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * Enum representing the various types of recipe book.
     * <br>
     * Different types of recipe book are shown in different GUIs.
     *
     * @since 1.20.2
     */
    public enum RecipeBookType {

        /**
         * Recipe book seen in crafting table and player inventory.
         *
         * @since 1.20.2
         */
        CRAFTING,
        /**
         * Recipe book seen in furnace.
         *
         * @since 1.20.2
         */
        FURNACE,
        /**
         * Recipe book seen in blast furnace.
         *
         * @since 1.20.2
         */
        BLAST_FURNACE,
        /**
         * Recipe book seen in smoker.
         *
         * @since 1.20.2
         */
        SMOKER;
    }
}
