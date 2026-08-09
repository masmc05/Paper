package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a block is ignited. If you want to catch when a Player places
 * fire, you need to use {@link BlockPlaceEvent}.
 * <p>
 * If this event is cancelled, the block will not be ignited.
 *
 * @since 1.0.0
 */
public class BlockIgniteEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final IgniteCause cause;
    private final Entity ignitingEntity;
    private final Block ignitingBlock;

    private boolean cancelled;

    @ApiStatus.Internal
    public BlockIgniteEvent(@NotNull final Block block, @NotNull final IgniteCause cause, @Nullable final Entity ignitingEntity) {
        this(block, cause, ignitingEntity, null);
    }

    @ApiStatus.Internal
    public BlockIgniteEvent(@NotNull final Block block, @NotNull final IgniteCause cause, @NotNull final Block ignitingBlock) {
        this(block, cause, null, ignitingBlock);
    }

    @ApiStatus.Internal
    public BlockIgniteEvent(@NotNull final Block block, @NotNull final IgniteCause cause, @Nullable final Entity ignitingEntity, @Nullable final Block ignitingBlock) {
        super(block);
        this.cause = cause;
        this.ignitingEntity = ignitingEntity;
        this.ignitingBlock = ignitingBlock;
    }

    /**
     * Gets the cause of block ignite.
     *
     * @return An IgniteCause value detailing the cause of block ignition
     * @since 1.0.0
     */
    @NotNull
    public IgniteCause getCause() {
        return this.cause;
    }

    /**
     * Gets the player who ignited this block
     *
     * @return The Player that placed/ignited the fire block, or {@code null} if not ignited by a Player.
     * @since 1.0.0
     */
    @Nullable
    public Player getPlayer() {
        if (this.ignitingEntity instanceof Player) {
            return (Player) this.ignitingEntity;
        }

        return null;
    }

    /**
     * Gets the entity who ignited this block
     *
     * @return The Entity that placed/ignited the fire block, or {@code null} if not ignited by an Entity.
     * @since 1.5.1
     */
    @Nullable
    public Entity getIgnitingEntity() {
        return this.ignitingEntity;
    }

    /**
     * Gets the block which ignited this block
     *
     * @return The Block that placed/ignited the fire block, or {@code null} if not ignited by a Block.
     * @since 1.5.1
     */
    @Nullable
    public Block getIgnitingBlock() {
        return this.ignitingBlock;
    }

    /**
     * An enum to specify the cause of the ignite
     *
     * @since 1.0.0
     */
    public enum IgniteCause {

        /**
         * Block ignition caused by lava.
         *
         * @since 1.0.0
         */
        LAVA,
        /**
         * Block ignition caused by a player or dispenser using flint-and-steel.
         *
         * @since 1.0.0
         */
        FLINT_AND_STEEL,
        /**
         * Block ignition caused by dynamic spreading of fire.
         *
         * @since 1.0.0
         */
        SPREAD,
        /**
         * Block ignition caused by lightning.
         *
         * @since 1.0.0
         */
        LIGHTNING,
        /**
         * Block ignition caused by an entity using a fireball.
         *
         * @since 1.3.1
         */
        FIREBALL,
        /**
         * Block ignition caused by an Ender Crystal.
         *
         * @since 1.5.1
         */
        ENDER_CRYSTAL,
        /**
         * Block ignition caused by explosion.
         *
         * @since 1.5.1
         */
        EXPLOSION,
        /**
         * Block ignition caused by a flaming arrow.
         *
         * @since 1.14.4
         */
        ARROW
    }

    /**
     * @since 1.0.0
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
