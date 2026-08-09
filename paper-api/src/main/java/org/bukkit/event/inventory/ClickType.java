package org.bukkit.event.inventory;

/**
 * What the client did to trigger this action (not the result).
 *
 * @since 1.6.1
 */
public enum ClickType {

    /**
     * The left (or primary) mouse button.
     *
     * @since 1.6.1
     */
    LEFT,
    /**
     * Holding shift while pressing the left mouse button.
     *
     * @since 1.6.1
     */
    SHIFT_LEFT,
    /**
     * The right mouse button.
     *
     * @since 1.6.1
     */
    RIGHT,
    /**
     * Holding shift while pressing the right mouse button.
     *
     * @since 1.6.1
     */
    SHIFT_RIGHT,
    /**
     * Clicking the left mouse button on the grey area around the inventory.
     *
     * @since 1.6.1
     */
    WINDOW_BORDER_LEFT,
    /**
     * Clicking the right mouse button on the grey area around the inventory.
     *
     * @since 1.6.1
     */
    WINDOW_BORDER_RIGHT,
    /**
     * The middle mouse button, or a "scrollwheel click".
     *
     * @since 1.6.1
     */
    MIDDLE,
    /**
     * One of the number keys 1-9, correspond to slots on the hotbar.
     *
     * @since 1.6.1
     */
    NUMBER_KEY,
    /**
     * Pressing the left mouse button twice in quick succession.
     *
     * @since 1.6.1
     */
    DOUBLE_CLICK,
    /**
     * The "Drop" key (defaults to Q).
     *
     * @since 1.6.1
     */
    DROP,
    /**
     * Holding Ctrl while pressing the "Drop" key (defaults to Q).
     *
     * @since 1.6.1
     */
    CONTROL_DROP,
    /**
     * Any action done with the Creative inventory open.
     *
     * @since 1.6.1
     */
    CREATIVE,
    /**
     * The "swap item with offhand" key (defaults to F).
     *
     * @since 1.16.1
     */
    SWAP_OFFHAND,
    /**
     * A type of inventory manipulation not yet recognized by Bukkit.
     * <p>
     * This is only for transitional purposes on a new Minecraft update, and
     * should never be relied upon.
     * <p>
     * Any ClickType.UNKNOWN is called on a best-effort basis.
     *
     * @since 1.6.1
     */
    UNKNOWN,
    ;

    /**
     * Gets whether this ClickType represents the pressing of a key on a
     * keyboard.
     *
     * @return {@code true} if this ClickType represents the pressing of a key
     * @since 1.6.1
     */
    public boolean isKeyboardClick() {
        return (this == ClickType.NUMBER_KEY) || (this == ClickType.DROP) || (this == ClickType.CONTROL_DROP) || (this == ClickType.SWAP_OFFHAND);
    }

    /**
     * Gets whether this ClickType represents the pressing of a mouse button
     *
     * @return {@code true} if this ClickType represents the pressing of a mouse button
     * @since 1.20.1
     */
    public boolean isMouseClick() {
        return (this == ClickType.DOUBLE_CLICK) || (this == ClickType.LEFT) || (this == ClickType.RIGHT) || (this == ClickType.MIDDLE)
                || (this == ClickType.WINDOW_BORDER_LEFT) || (this == ClickType.SHIFT_LEFT) || (this == ClickType.SHIFT_RIGHT) || (this == ClickType.WINDOW_BORDER_RIGHT);
    }

    /**
     * Gets whether this ClickType represents an action that can only be
     * performed by a Player in creative mode.
     *
     * @return {@code true} if this action requires Creative mode
     * @since 1.6.1
     */
    public boolean isCreativeAction() {
        // Why use middle click?
        return (this == ClickType.MIDDLE) || (this == ClickType.CREATIVE);
    }

    /**
     * Gets whether this ClickType represents a right click.
     *
     * @return {@code true} if this ClickType represents a right click
     * @since 1.6.1
     */
    public boolean isRightClick() {
        return (this == ClickType.RIGHT) || (this == ClickType.SHIFT_RIGHT);
    }

    /**
     * Gets whether this ClickType represents a left click.
     *
     * @return {@code true} if this ClickType represents a left click
     * @since 1.6.1
     */
    public boolean isLeftClick() {
        return (this == ClickType.LEFT) || (this == ClickType.SHIFT_LEFT) || (this == ClickType.DOUBLE_CLICK) || (this == ClickType.CREATIVE);
    }

    /**
     * Gets whether this ClickType indicates that the shift key was pressed
     * down when the click was made.
     *
     * @return {@code true} if the action uses Shift.
     * @since 1.6.1
     */
    public boolean isShiftClick() {
        return (this == ClickType.SHIFT_LEFT) || (this == ClickType.SHIFT_RIGHT);
    }
}
