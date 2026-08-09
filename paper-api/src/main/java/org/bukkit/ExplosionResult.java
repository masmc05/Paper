package org.bukkit;

/**
 * Represents the outcome of an explosion.
 *
 * @since 1.21
 */
public enum ExplosionResult {

    /**
     * Represents an explosion where no change took place.
     *
     * This is the case when {@link org.bukkit.GameRules#MOB_GRIEFING} is
     * disabled.
     *
     * @since 1.21
     */
    KEEP,
    /**
     * Represents an explosion where all destroyed blocks drop their items.
     *
     * This is the case when
     * {@link org.bukkit.GameRules#TNT_EXPLOSION_DROP_DECAY} or
     * {@link org.bukkit.GameRules#BLOCK_EXPLOSION_DROP_DECAY} is disabled.
     *
     * @since 1.21
     */
    DESTROY,
    /**
     * Represents an explosion where explosions cause only some blocks to drop.
     *
     * @since 1.21
     */
    DESTROY_WITH_DECAY,
    /**
     * Represents an explosion where a block change/update has happened.
     *
     * For example, when a wind charge is used it will cause nearby buttons,
     * levers and bells to be activated.
     *
     * @since 1.21
     */
    TRIGGER_BLOCK
}
