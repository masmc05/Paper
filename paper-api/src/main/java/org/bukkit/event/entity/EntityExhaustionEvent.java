package org.bukkit.event.entity;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a human entity experiences exhaustion.
 * <br>
 * An exhaustion level greater than 4.0 causes a decrease in saturation by 1.
 *
 * @since 1.16.5
 */
public class EntityExhaustionEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ExhaustionReason exhaustionReason;
    private float exhaustion;

    private boolean cancelled;

    @ApiStatus.Internal
    public EntityExhaustionEvent(@NotNull HumanEntity human, @NotNull ExhaustionReason exhaustionReason, float exhaustion) {
        super(human);
        this.exhaustionReason = exhaustionReason;
        this.exhaustion = exhaustion;
    }

    /**
     * @since 1.16.5
     */
    @NotNull
    @Override
    public HumanEntity getEntity() {
        return (HumanEntity) super.entity;
    }

    /**
     * Gets the {@link ExhaustionReason} for this event
     *
     * @return the exhaustion reason
     * @since 1.16.5
     */
    @NotNull
    public ExhaustionReason getExhaustionReason() {
        return this.exhaustionReason;
    }

    /**
     * Get the amount of exhaustion to add to the player's current exhaustion.
     *
     * @return amount of exhaustion
     * @since 1.16.5
     */
    public float getExhaustion() {
        return this.exhaustion;
    }

    /**
     * Set the exhaustion to apply to the player.
     * <p>
     * The maximum exhaustion that a player can have is 40. No error will be
     * thrown if this limit is hit. This value may be negative, but there is
     * unknown behavior for when exhaustion is below 0.
     *
     * @param exhaustion new exhaustion to add
     * @since 1.16.5
     */
    public void setExhaustion(float exhaustion) {
        this.exhaustion = exhaustion;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.16.5
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * The reason for why a PlayerExhaustionEvent takes place
     *
     * @since 1.16.5
     */
    public enum ExhaustionReason {

        /**
         * Player mines a block
         *
         * @since 1.16.5
         */
        BLOCK_MINED,
        /**
         * Player has the hunger potion effect
         *
         * @since 1.16.5
         */
        HUNGER_EFFECT,
        /**
         * Player takes damage
         *
         * @since 1.16.5
         */
        DAMAGED,
        /**
         * Player attacks another entity
         *
         * @since 1.16.5
         */
        ATTACK,
        /**
         * Player is sprint jumping
         *
         * @since 1.16.5
         */
        JUMP_SPRINT,
        /**
         * Player jumps
         *
         * @since 1.16.5
         */
        JUMP,
        /**
         * Player swims one centimeter
         *
         * @since 1.16.5
         */
        SWIM,
        /**
         * Player walks underwater one centimeter
         *
         * @since 1.16.5
         */
        WALK_UNDERWATER,
        /**
         * Player moves on the surface of water one centimeter
         *
         * @since 1.16.5
         */
        WALK_ON_WATER,
        /**
         * Player sprints one centimeter
         *
         * @since 1.16.5
         */
        SPRINT,
        /**
         * Player crouches one centimeter (does not effect exhaustion, but fires
         * nonetheless)
         *
         * @since 1.16.5
         */
        CROUCH,
        /**
         * Player walks one centimeter (does not effect exhaustion, but fires
         * nonetheless)
         *
         * @since 1.16.5
         */
        WALK,
        /**
         * Player regenerated health
         *
         * @since 1.16.5
         */
        REGEN,
        /**
         * Player was affected by an enchantment
         * @see <a href="https://minecraft.wiki/w/Enchantment_definition#apply_exhaustion">Minecraft Wiki: Enchantment Effects "apply_exhaustion"</a>
         * @since 1.21.11
         */
        ENCHANTMENT_EFFECT,
        /**
         * Unknown exhaustion reason
         *
         * @since 1.16.5
         */
        UNKNOWN
    }

    /**
     * @since 1.16.5
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.5
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
