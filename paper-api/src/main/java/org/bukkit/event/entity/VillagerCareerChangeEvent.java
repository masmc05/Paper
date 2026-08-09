package org.bukkit.event.entity;

import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * @since 1.14.1
 */
public class VillagerCareerChangeEvent extends EntityEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private Profession profession;
    private final ChangeReason reason;

    private boolean cancelled;

    @ApiStatus.Internal
    public VillagerCareerChangeEvent(@NotNull Villager villager, @NotNull Profession profession, @NotNull ChangeReason reason) {
        super(villager);
        this.profession = profession;
        this.reason = reason;
    }

    /**
     * @since 1.14.1
     */
    @NotNull
    @Override
    public Villager getEntity() {
        return (Villager) this.entity;
    }

    /**
     * Gets the future profession of the villager.
     *
     * @return The profession the villager will change to
     * @since 1.14.1
     */
    @NotNull
    public Profession getProfession() {
        return this.profession;
    }

    /**
     * Sets the profession the villager will become from this event.
     *
     * @param profession new profession
     * @since 1.14.1
     */
    public void setProfession(@NotNull Profession profession) {
        this.profession = profession;
    }

    /**
     * Gets the reason for why the villager's career is changing.
     *
     * @return Reason for villager's profession changing
     * @since 1.14.1
     */
    @NotNull
    public ChangeReason getReason() {
        return this.reason;
    }

    /**
     * @since 1.14.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.14.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.14.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.14.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * Reasons for the villager's profession changing.
     *
     * @since 1.14.1
     */
    public enum ChangeReason {

        /**
         * Villager lost their job due to too little experience.
         *
         * @since 1.14.1
         */
        LOSING_JOB,
        /**
         * Villager gained employment.
         *
         * @since 1.14.1
         */
        EMPLOYED;
    }
}
