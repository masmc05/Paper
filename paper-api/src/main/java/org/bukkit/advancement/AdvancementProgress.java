package org.bukkit.advancement;

import java.util.Collection;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The individual status of an advancement for a player. This class is not
 * reference safe as the underlying advancement may be reloaded.
 *
 * @since 1.12
 */
public interface AdvancementProgress {

    /**
     * The advancement this progress is concerning.
     *
     * @return the relevant advancement
     * @since 1.12
     */
    @NotNull
    Advancement getAdvancement();

    /**
     * Check if all criteria for this advancement have been met.
     *
     * @return true if this advancement is done
     * @since 1.12
     */
    boolean isDone();

    /**
     * Mark the specified criteria as awarded at the current time.
     *
     * @param criteria the criteria to mark
     * @return true if awarded, false if criteria does not exist or already
     * awarded.
     * @since 1.12
     */
    boolean awardCriteria(@NotNull String criteria);

    /**
     * Mark the specified criteria as uncompleted.
     *
     * @param criteria the criteria to mark
     * @return true if removed, false if criteria does not exist or not awarded
     * @since 1.12
     */
    boolean revokeCriteria(@NotNull String criteria);

    /**
     * Get the date the specified criteria was awarded.
     *
     * @param criteria the criteria to check
     * @return date awarded or null if unawarded or criteria does not exist
     * @since 1.12
     */
    @Nullable
    Date getDateAwarded(@NotNull String criteria);

    /**
     * Get the criteria which have not been awarded.
     *
     * @return unmodifiable copy of criteria remaining
     * @since 1.12
     */
    @NotNull
    Collection<String> getRemainingCriteria();

    /**
     * Gets the criteria which have been awarded.
     *
     * @return unmodifiable copy of criteria awarded
     * @since 1.12
     */
    @NotNull
    Collection<String> getAwardedCriteria();
}
