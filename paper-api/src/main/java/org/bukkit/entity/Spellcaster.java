package org.bukkit.entity;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a spell casting "Illager".
 *
 * @since 1.12
 */
public interface Spellcaster extends Illager {

    /**
     * Represents the current spell the entity is using.
     *
     * @since 1.12
     */
    public enum Spell {

        /**
         * No spell is being used.
         *
         * @since 1.12
         */
        NONE,
        /**
         * The spell that summons Vexes.
         *
         * @since 1.12
         */
        SUMMON_VEX,
        /**
         * The spell that summons Fangs.
         *
         * @since 1.12
         */
        FANGS,
        /**
         * The "wololo" spell.
         *
         * @since 1.12
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
     * Gets the {@link Spell} the entity is currently using.
     *
     * @return the current spell
     * @since 1.12
     */
    @NotNull
    Spell getSpell();

    /**
     * Sets the {@link Spell} the entity is currently using.
     *
     * @param spell the spell the entity should be using
     * @since 1.12
     */
    void setSpell(@NotNull Spell spell);
}
