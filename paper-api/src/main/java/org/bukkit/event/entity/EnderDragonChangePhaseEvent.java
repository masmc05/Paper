package org.bukkit.event.entity;

import com.google.common.base.Preconditions;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when an EnderDragon switches controller phase.
 *
 * @since 1.9.4
 */
public class EnderDragonChangePhaseEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private final EnderDragon.Phase currentPhase;
    private EnderDragon.Phase newPhase;

    public EnderDragonChangePhaseEvent(@NotNull EnderDragon enderDragon, @Nullable EnderDragon.Phase currentPhase, @NotNull EnderDragon.Phase newPhase) {
        super(enderDragon);
        this.currentPhase = currentPhase;
        this.setNewPhase(newPhase);
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    @Override
    public EnderDragon getEntity() {
        return (EnderDragon) entity;
    }

    /**
     * Gets the current phase that the dragon is in. This method will return null
     * when a dragon is first spawned and hasn't yet been assigned a phase.
     *
     * @return the current dragon phase
     * @since 1.9.4
     */
    @Nullable
    public EnderDragon.Phase getCurrentPhase() {
        return currentPhase;
    }

    /**
     * Gets the new phase that the dragon will switch to.
     *
     * @return the new dragon phase
     * @since 1.9.4
     */
    @NotNull
    public EnderDragon.Phase getNewPhase() {
        return newPhase;
    }

    /**
     * Sets the new phase for the ender dragon.
     *
     * @param newPhase the new dragon phase
     */
    public void setNewPhase(@NotNull EnderDragon.Phase newPhase) {
        Preconditions.checkArgument(newPhase != null, "New dragon phase cannot be null");
        this.newPhase = newPhase;
    }

    /**
     * @since 1.9.4
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * @since 1.9.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.9.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
