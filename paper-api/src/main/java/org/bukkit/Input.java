package org.bukkit;

import org.jetbrains.annotations.ApiStatus;

/**
 * Represents a movement input applied to an entity.
 *
 * @since 1.21.3
 */
@ApiStatus.Experimental
public interface Input {

    /**
     * Gets whether a forward input is applied.
     *
     * @return forward input
     * @since 1.21.3
     */
    boolean isForward();

    /**
     * Gets whether a backward input is applied.
     *
     * @return backward input
     * @since 1.21.3
     */
    boolean isBackward();

    /**
     * Gets whether a left input is applied.
     *
     * @return left input
     * @since 1.21.3
     */
    boolean isLeft();

    /**
     * Gets whether a right input is applied.
     *
     * @return right input
     * @since 1.21.3
     */
    boolean isRight();

    /**
     * Gets whether a jump input is applied.
     *
     * @return jump input
     * @since 1.21.3
     */
    boolean isJump();

    /**
     * Gets whether a sneak input is applied.
     *
     * @return sneak input
     * @since 1.21.3
     */
    boolean isSneak();

    /**
     * Gets whether a sprint input is applied.
     *
     * @return sprint input
     * @since 1.21.3
     */
    boolean isSprint();
}
