package io.papermc.paper.event.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when an entity attempts to perform a smash attack.
 *
 * @since 1.21.4
 */
@NullMarked
public class EntityAttemptSmashAttackEvent extends EntityEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final LivingEntity target;
    private final ItemStack weapon;
    private final boolean originalResult;
    private Result result = Result.DEFAULT;

    @ApiStatus.Internal
    public EntityAttemptSmashAttackEvent(
        final LivingEntity attacker,
        final LivingEntity target,
        final ItemStack weapon,
        final boolean originalResult
    ) {
        super(attacker);
        this.target = target;
        this.weapon = weapon;
        this.originalResult = originalResult;
    }

    /**
     * Yields the target of the attempted smash attack.
     *
     * @return the target entity
     * @since 1.21.4
     */
    public LivingEntity getTarget() {
        return target;
    }

    /**
     * Yields a copy of the itemstack used in the smash attack attempt.
     *
     * @return the itemstack
     * @since 1.21.4
     */
    public ItemStack getWeapon() {
        return weapon.clone();
    }

    /**
     * Yields the original result the server computed.
     *
     * @return {@code true} if this attempt would have been successful by vanilla's logic, {@code false} otherwise.
     * @since 1.21.4
     */
    public boolean getOriginalResult() {
        return originalResult;
    }

    /**
     * Yields the effective result of this event.
     * The result may take one of three values:
     *
     * <ul>
     *     <li>{@link Result#ALLOW}: The attempt will succeed.</li>
     *     <li>{@link Result#DENY}: The attempt will fail.</li>
     *     <li>{@link Result#DEFAULT}: The attempt will succeed if {@link #getOriginalResult()} is {@code true} and fail otherwise.</li>
     * </ul>
     *
     * @return the result.
     * @since 1.21.4
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * Configures a new result for this event.
     * The passes result may take one of three values:
     *
     * <ul>
     *     <li>{@link Result#ALLOW}: The attempt will succeed.</li>
     *     <li>{@link Result#DENY}: The attempt will fail.</li>
     *     <li>{@link Result#DEFAULT}: The attempt will succeed if {@link #getOriginalResult()} is {@code true} and fail otherwise.</li>
     * </ul>
     *
     * @param result the new result of the event.
     * @since 1.21.4
     */
    public void setResult(final Result result) {
        this.result = result;
    }

    /**
     * @since 1.21.4
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.21.4
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
