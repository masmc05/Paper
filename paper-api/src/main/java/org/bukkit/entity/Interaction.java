package org.bukkit.entity;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an entity designed to only record interactions.
 *
 * @since 1.19.4
 */
public interface Interaction extends Entity {

    /**
     * Gets the width of this interaction entity.
     *
     * @return width
     * @since 1.19.4
     */
    public float getInteractionWidth();

    /**
     * Sets the width of this interaction entity.
     *
     * @param width new width
     * @since 1.19.4
     */
    public void setInteractionWidth(float width);

    /**
     * Gets the height of this interaction entity.
     *
     * @return height
     * @since 1.19.4
     */
    public float getInteractionHeight();

    /**
     * Sets the height of this interaction entity.
     *
     * @param height new height
     * @since 1.19.4
     */
    public void setInteractionHeight(float height);

    /**
     * Gets if this interaction entity should trigger a response when interacted
     * with.
     *
     * @return response setting
     * @since 1.19.4
     */
    public boolean isResponsive();

    /**
     * Sets if this interaction entity should trigger a response when interacted
     * with.
     *
     * @param response new setting
     * @since 1.19.4
     */
    public void setResponsive(boolean response);

    /**
     * Gets the last attack on this interaction entity.
     *
     * @return last attack data, if present
     * @since 1.19.4
     */
    @Nullable
    public PreviousInteraction getLastAttack();

    /**
     * Gets the last interaction on this entity.
     *
     * @return last interaction data, if present
     * @since 1.19.4
     */
    @Nullable
    public PreviousInteraction getLastInteraction();

    /**
     * Represents a previous interaction with this entity.
     *
     * @since 1.19.4
     */
    public interface PreviousInteraction {

        /**
         * Get the previous interacting player.
         *
         * @return interacting player
         * @since 1.19.4
         */
        @NotNull
        public OfflinePlayer getPlayer();

        /**
         * Gets the Unix timestamp at when this interaction occurred.
         *
         * @return interaction timestamp
         * @since 1.19.4
         */
        public long getTimestamp();
    }
}
