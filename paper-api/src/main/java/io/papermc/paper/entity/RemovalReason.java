package io.papermc.paper.entity;

import org.bukkit.entity.Entity;

/**
 * Represents the reason an entity was removed.
 *
 * @see Entity#getRemovalReason()
 * @since 26.2
 */
public enum RemovalReason {
    /**
     * @since 26.2
     */
    // Start generate - RemovalReason
    KILLED(true, false),
    /**
     * @since 26.2
     */
    DISCARDED(true, false),
    /**
     * @since 26.2
     */
    UNLOADED_TO_CHUNK(false, true),
    /**
     * @since 26.2
     */
    UNLOADED_WITH_PLAYER(false, false),
    /**
     * @since 26.2
     */
    CHANGED_DIMENSION(false, false);
    // End generate - RemovalReason

    private final boolean destroy;
    private final boolean save;

    RemovalReason(final boolean destroy, final boolean save) {
        this.destroy = destroy;
        this.save = save;
    }

    /**
     * {@return whether the entity should be destroyed after being removed}
     *
     * @since 26.2
     */
    public boolean shouldDestroy() {
        return this.destroy;
    }

    /**
     * {@return whether the entity should be saved after being removed}
     *
     * @since 26.2
     */
    public boolean shouldSave() {
        return this.save;
    }
}
