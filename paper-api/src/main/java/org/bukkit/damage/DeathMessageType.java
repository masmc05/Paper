package org.bukkit.damage;

/**
 * Represents a type of death message used by a {@link DamageSource}.
 *
 * @since 1.20.4
 */
public enum DeathMessageType {

    /**
     * No special death message logic is applied.
     *
     * @since 1.20.4
     */
    DEFAULT,
    /**
     * Shows a variant of fall damage death instead of a regular death message.
     * <br>
     * <b>Example:</b> death.fell.assist.item
     *
     * @since 1.20.4
     */
    FALL_VARIANTS,
    /**
     * Shows the intentional game design death message instead of a regular
     * death message.
     *
     * @since 1.20.4
     */
    INTENTIONAL_GAME_DESIGN;
}
