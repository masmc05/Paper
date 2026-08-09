package com.destroystokyo.paper.entity.ai;

/**
 * Represents the subtype of a goal. Used by minecraft to disable certain types of goals if needed.
 *
 * @since 1.15.2
 */
public enum GoalType {

    /**
     * @since 1.15.2
     */
    MOVE,
    /**
     * @since 1.15.2
     */
    LOOK,
    /**
     * @since 1.15.2
     */
    JUMP,
    /**
     * @since 1.15.2
     */
    TARGET,
    /**
     * Used to map vanilla goals, that are a behavior goal but don't have a type set...
     *
     * @since 1.15.2
     */
    UNKNOWN_BEHAVIOR,

}
