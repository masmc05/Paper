package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a block of TNT in the world become primed.
 * <p>
 * If this event is cancelled, the block of TNT will not become primed.
 *
 * @since 1.19.4
 */
public class TNTPrimeEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final PrimeCause igniteCause;
    private final Entity primingEntity;
    private final Block primingBlock;

    private boolean cancelled;

    @ApiStatus.Internal
    public TNTPrimeEvent(@NotNull final Block block, @NotNull final PrimeCause igniteCause, @Nullable final Entity primingEntity, @Nullable final Block primingBlock) {
        super(block);
        this.igniteCause = igniteCause;
        this.primingEntity = primingEntity;
        this.primingBlock = primingBlock;
    }

    /**
     * Get the cause of the TNT becoming primed.
     *
     * @return the cause
     * @since 1.19.4
     */
    @NotNull
    public PrimeCause getCause() {
        return this.igniteCause;
    }

    /**
     * Get the entity that caused the TNT to be primed.
     *
     * @return the entity that caused the TNT to be primed, or {@code null} if it was
     * not caused by an entity.
     * @since 1.19.4
     */
    @Nullable
    public Entity getPrimingEntity() {
        return this.primingEntity;
    }

    /**
     * Get the block that caused the TNT to be primed.
     *
     * @return the block that caused the TNT to be primed, or {@code null} if it was not
     * caused by a block.
     * @since 1.19.4
     */
    @Nullable
    public Block getPrimingBlock() {
        return this.primingBlock;
    }

    /**
     * @since 1.19.4
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.19.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.19.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.19.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * An enum to represent the cause of a TNT block becoming primed.
     *
     * @since 1.19.4
     */
    public enum PrimeCause {

        /**
         * When TNT is primed by fire spreading.
         *
         * @since 1.19.4
         */
        FIRE,
        /**
         * When TNT is primed by a redstone signal.
         *
         * @since 1.19.4
         */
        REDSTONE,
        /**
         * When TNT is primed by a player interacting with it directly.
         *
         * @since 1.19.4
         */
        PLAYER,
        /**
         * When TNT is primed by a nearby explosion.
         *
         * @since 1.19.4
         */
        EXPLOSION,
        /**
         * When TNT is primed after getting hit with a burning projectile.
         *
         * @since 1.19.4
         */
        PROJECTILE,
        /**
         * When TNT with the unstable block state set to {@code true} is broken.
         * <p>
         * Note: Canceling a prime event with this cause will stop the primed
         * TNT from spawning but will not stop the block from being broken.
         *
         * @since 1.19.4
         */
        BLOCK_BREAK,
        /**
         * When TNT is primed by a dispenser holding flint and steel.
         * <p>
         * Note: This event is not called for a dispenser dispensing TNT
         * directly.
         *
         * @since 1.19.4
         */
        DISPENSER;
    }
}
