package com.destroystokyo.paper;

import io.papermc.paper.InternalAPIBridge;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * Represents the different parts of a player's skin that can be toggled on or off.
 *
 * @since 1.15.2
 */
@NullMarked
public interface SkinParts {

    /**
     * Creates a new instance of {@link SkinParts} with all parts enabled.
     *
     * @return a new {@link SkinParts} instance
     * @since 1.21.10
     */
    @Contract(value = "-> new", pure = true)
    static SkinParts.Mutable allParts() {
        return InternalAPIBridge.get().allSkinParts();
    }

    /**
     * @since 1.15.2
     */
    boolean hasCapeEnabled();

    /**
     * @since 1.15.2
     */
    boolean hasJacketEnabled();

    /**
     * @since 1.15.2
     */
    boolean hasLeftSleeveEnabled();

    /**
     * @since 1.15.2
     */
    boolean hasRightSleeveEnabled();

    /**
     * @since 1.15.2
     */
    boolean hasLeftPantsEnabled();

    /**
     * @since 1.15.2
     */
    boolean hasRightPantsEnabled();

    /**
     * @since 1.15.2
     */
    boolean hasHatsEnabled();

    /**
     * @since 1.15.2
     */
    int getRaw();

    /**
     * @since 1.21.10
     */
    Mutable mutableCopy();

    /**
     * @since 1.21.10
     */
    interface Mutable extends SkinParts {

        /**
         * @since 1.21.10
         */
        void setCapeEnabled(boolean enabled);

        /**
         * @since 1.21.10
         */
        void setJacketEnabled(boolean enabled);

        /**
         * @since 1.21.10
         */
        void setLeftSleeveEnabled(boolean enabled);

        /**
         * @since 1.21.10
         */
        void setRightSleeveEnabled(boolean enabled);

        /**
         * @since 1.21.10
         */
        void setLeftPantsEnabled(boolean enabled);

        /**
         * @since 1.21.10
         */
        void setRightPantsEnabled(boolean enabled);

        /**
         * @since 1.21.10
         */
        void setHatsEnabled(boolean enabled);

        /**
         * @since 1.21.10
         */
        SkinParts immutableCopy();
    }
}
