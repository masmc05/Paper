package org.bukkit.advancement;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 * @since 1.21.3
 */
public interface AdvancementRequirement {

    /**
     * Get all required criteria.
     *
     * @return the list of required criteria for this requirement.
     * @since 1.21.3
     */
    @NotNull
    List<String> getRequiredCriteria();

    /**
     * Check if the requirement is strict.
     *
     * @return true if requirement list contains one criteria, false if
     * multiple.
     * @since 1.21.3
     */
    boolean isStrict();
}
