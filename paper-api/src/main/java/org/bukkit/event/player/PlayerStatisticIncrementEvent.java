package org.bukkit.event.player;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.material.MaterialData;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a player statistic is incremented.
 * <p>
 * This event is not called for some high frequency statistics, e.g. movement
 * based statistics.
 *
 * @since 1.7.10
 */
public class PlayerStatisticIncrementEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    protected final Statistic statistic;
    private final int initialValue;
    private final int newValue;
    private final EntityType entityType;
    private final Material material;

    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerStatisticIncrementEvent(@NotNull Player player, @NotNull Statistic statistic, int initialValue, int newValue) {
        super(player);
        this.statistic = statistic;
        this.initialValue = initialValue;
        this.newValue = newValue;
        this.entityType = null;
        this.material = null;
    }

    @ApiStatus.Internal
    public PlayerStatisticIncrementEvent(@NotNull Player player, @NotNull Statistic statistic, int initialValue, int newValue, @NotNull EntityType entityType) {
        super(player);
        this.statistic = statistic;
        this.initialValue = initialValue;
        this.newValue = newValue;
        this.entityType = entityType;
        this.material = null;
    }

    @ApiStatus.Internal
    public PlayerStatisticIncrementEvent(@NotNull Player player, @NotNull Statistic statistic, int initialValue, int newValue, @NotNull Material material) {
        super(player);
        this.statistic = statistic;
        this.initialValue = initialValue;
        this.newValue = newValue;
        this.entityType = null;
        if (material != null && material.isLegacy()) {
            if (statistic.getType() == Statistic.Type.BLOCK) {
                material = Bukkit.getUnsafe().fromLegacy(new MaterialData(material), false);
            } else if (statistic.getType() == Statistic.Type.ITEM) {
                material = Bukkit.getUnsafe().fromLegacy(new MaterialData(material), true);
            } else {
                // Theoretically, this should not happen, can probably print a warning, but for now it should be fine.
                material = Bukkit.getUnsafe().fromLegacy(new MaterialData(material), false);
            }
        }
        this.material = material;
    }

    /**
     * Gets the statistic that is being incremented.
     *
     * @return the incremented statistic
     * @since 1.7.10
     */
    @NotNull
    public Statistic getStatistic() {
        return this.statistic;
    }

    /**
     * Gets the previous value of the statistic.
     *
     * @return the previous value of the statistic
     * @since 1.7.10
     */
    public int getPreviousValue() {
        return this.initialValue;
    }

    /**
     * Gets the new value of the statistic.
     *
     * @return the new value of the statistic
     * @since 1.7.10
     */
    public int getNewValue() {
        return this.newValue;
    }

    /**
     * Gets the EntityType if {@link #getStatistic()} is an
     * entity statistic otherwise returns {@code null}.
     *
     * @return the EntityType of the statistic
     * @since 1.7.10
     */
    @Nullable
    public EntityType getEntityType() {
        return this.entityType;
    }

    /**
     * Gets the Material if {@link #getStatistic()} is a block
     * or item statistic otherwise returns {@code null}.
     *
     * @return the Material of the statistic
     * @since 1.7.10
     */
    @Nullable
    public Material getMaterial() {
        return this.material;
    }

    /**
     * @since 1.7.10
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.7.10
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.7.10
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.7.10
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
