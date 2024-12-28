package org.bukkit.advancement;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Holds information about how the advancement is displayed by the game.
 *
 * @deprecated use {@link io.papermc.paper.advancement.AdvancementDisplay}
 * @since 1.18.2
 */
@Deprecated(forRemoval = true) // Paper
public interface AdvancementDisplay {

    /**
     * Gets the title of the advancement.
     *
     * @return The advancement title without colour codes.
     * @since 1.18.2
     */
    @NotNull
    String getTitle();

    /**
     * Gets the visible description of the advancement.
     *
     * @return The advancement description without colour codes.
     * @since 1.18.2
     */
    @NotNull
    String getDescription();

    /**
     * The icon that is used for this advancement.
     *
     * @return an ItemStack that represents the advancement.
     * @since 1.18.2
     */
    @NotNull
    ItemStack getIcon();

    /**
     * Whether to show a toast to the player when this advancement has been
     * completed.
     *
     * @return true if a toast is shown.
     * @since 1.18.2
     */
    boolean shouldShowToast();

    /**
     * Whether to announce in the chat when this advancement has been completed.
     *
     * @return true if announced in chat.
     * @since 1.18.2
     */
    boolean shouldAnnounceChat();

    /**
     * Whether to hide this advancement and all its children from the
     * advancement screen until this advancement have been completed.
     *
     * Has no effect on root advancements themselves, but still affects all
     * their children.
     *
     * @return true if hidden.
     * @since 1.18.2
     */
    boolean isHidden();

    /**
     * The X position of the advancement in the advancement screen.
     *
     * @return the X coordinate as float
     * @since 1.18.2
     */
    float getX();

    /**
     * The Y position of the advancement in the advancement screen.
     *
     * @return the Y coordinate as float
     * @since 1.18.2
     */
    float getY();

    /**
     * The display type of this advancement.
     *
     * @return an enum representing the type.
     * @since 1.18.2
     */
    @NotNull
    AdvancementDisplayType getType();
}
