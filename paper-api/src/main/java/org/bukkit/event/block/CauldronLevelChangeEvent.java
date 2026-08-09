package org.bukkit.event.block;

import com.google.common.base.Preconditions;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1.9.4
 */
public class CauldronLevelChangeEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Entity entity;
    private final ChangeReason reason;
    private final BlockState newState;

    private boolean cancelled;

    @ApiStatus.Internal
    public CauldronLevelChangeEvent(@NotNull Block block, @Nullable Entity entity, @NotNull ChangeReason reason, @NotNull BlockState newBlock) {
        super(block);
        this.entity = entity;
        this.reason = reason;
        this.newState = newBlock;
    }

    /**
     * Get entity which did this. May be {@code null}.
     *
     * @return acting entity
     * @since 1.9.4
     */
    @Nullable
    public Entity getEntity() {
        return this.entity;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    public ChangeReason getReason() {
        return this.reason;
    }

    /**
     * Gets the new state of the cauldron.
     *
     * @return The block state of the block that will be changed
     * @since 1.17
     */
    @NotNull
    public BlockState getNewState() {
        return this.newState;
    }

    /**
     * Gets the old level of the cauldron.
     *
     * @return old level
     * @see #getBlock()
     * @deprecated not all cauldron contents are Levelled
     * @since 1.9.4
     */
    @Deprecated(since = "1.17")
    public int getOldLevel() {
        BlockData oldBlock = this.getBlock().getBlockData();
        return (oldBlock instanceof Levelled) ? ((Levelled) oldBlock).getLevel() : ((oldBlock.getMaterial() == Material.CAULDRON) ? 0 : 3);
    }

    /**
     * Gets the new level of the cauldron.
     *
     * @return new level
     * @see #getNewState()
     * @deprecated not all cauldron contents are Levelled
     * @since 1.9.4
     */
    @Deprecated(since = "1.17")
    public int getNewLevel() {
        BlockData newBlock = this.newState.getBlockData();
        return (newBlock instanceof Levelled) ? ((Levelled) newBlock).getLevel() : ((newBlock.getMaterial() == Material.CAULDRON) ? 0 : 3);
    }

    /**
     * Sets the new level of the cauldron.
     *
     * @param newLevel new level
     * @see #getNewState()
     * @deprecated not all cauldron contents are Levelled
     * @since 1.9.4
     */
    @Deprecated(since = "1.17")
    public void setNewLevel(int newLevel) {
        Preconditions.checkArgument(0 <= newLevel && newLevel <= 3, "Cauldron level out of bounds 0 <= %s <= 3", newLevel);
        if (newLevel == 0) {
            this.newState.setType(Material.CAULDRON);
        } else if (this.newState.getBlockData() instanceof Levelled) {
            ((Levelled) this.newState.getBlockData()).setLevel(newLevel);
        } else {
            // Error, non-levellable block
        }
    }

    /**
     * @since 1.9.4
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.9.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.9.4
     */
    public enum ChangeReason {
        /**
         * Player emptying the cauldron by filling their bucket.
         *
         * @since 1.9.4
         */
        BUCKET_FILL,
        /**
         * Player filling the cauldron by emptying their bucket.
         *
         * @since 1.9.4
         */
        BUCKET_EMPTY,
        /**
         * Player emptying the cauldron by filling their bottle.
         *
         * @since 1.9.4
         */
        BOTTLE_FILL,
        /**
         * Player filling the cauldron by emptying their bottle.
         *
         * @since 1.9.4
         */
        BOTTLE_EMPTY,
        /**
         * Player cleaning their banner.
         *
         * @since 1.9.4
         */
        BANNER_WASH,
        /**
         * Player cleaning their armor.
         *
         * @since 1.9.4
         */
        ARMOR_WASH,
        /**
         * Player cleaning a shulker box.
         *
         * @since 1.17
         */
        SHULKER_WASH,
        /**
         * Entity being extinguished.
         *
         * @since 1.9.4
         */
        EXTINGUISH,
        /**
         * Evaporating due to biome dryness.
         *
         * @since 1.9.4
         */
        EVAPORATE,
        /**
         * Filling due to natural fluid sources, e.g. rain or dripstone.
         *
         * @since 1.17
         */
        NATURAL_FILL,
        /**
         * Unknown.
         *
         * @since 1.9.4
         */
        UNKNOWN
    }
}
