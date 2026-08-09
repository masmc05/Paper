package org.bukkit.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an Evoker "Illager".
 *
 * @since 1.11
 */
public interface Evoker extends Spellcaster {

    /**
     * Represents the current spell the Evoker is using.
     *
     * @deprecated future versions of Minecraft have additional spell casting
     * entities.
     * @since 1.11
     */
    @Deprecated(since = "1.11.2")
    public enum Spell {

        /**
         * No spell is being evoked.
         *
         * @since 1.11
         */
        NONE,
        /**
         * The spell that summons Vexes.
         *
         * @since 1.11
         */
        SUMMON,
        /**
         * The spell that summons Fangs.
         *
         * @since 1.11
         */
        FANGS,
        /**
         * The "wololo" spell.
         *
         * @since 1.11
         */
        WOLOLO,
        /**
         * The spell that makes the casting entity invisible.
         *
         * @since 1.12
         */
        DISAPPEAR,
        /**
         * The spell that makes the target blind.
         *
         * @since 1.12
         */
        BLINDNESS;
    }

    /**
     * Gets the {@link Spell} the Evoker is currently using.
     *
     * @return the current spell
     * @deprecated future versions of Minecraft have additional spell casting
     * entities.
     *
     * @since 1.11
     */
    @Deprecated(since = "1.11.2")
    @NotNull
    Spell getCurrentSpell();

    /**
     * Sets the {@link Spell} the Evoker is currently using.
     *
     * @param spell the spell the evoker should be using
     * @deprecated future versions of Minecraft have additional spell casting
     * entities.
     * @since 1.11
     */
    @Deprecated(since = "1.11.2")
    void setCurrentSpell(@Nullable Spell spell);

    /**
     * @return the sheep being targeted by the {@link Spell#WOLOLO wololo spell}, or {@code null} if none
     * @since 1.16.2
     */
    @Nullable
    Sheep getWololoTarget();

    /**
     * Set the sheep to be the target of the {@link Spell#WOLOLO wololo spell}, or {@code null} to clear.
     *
     * @param sheep new wololo target
     * @since 1.16.2
     */
    void setWololoTarget(@Nullable Sheep sheep);
}
