package org.bukkit.event.inventory;

/**
 * Represents the effect of a drag that will be applied to an Inventory in an
 * InventoryDragEvent.
 *
 * @since 1.6.1
 */
public enum DragType {
    /**
     * One item from the cursor is placed in each selected slot.
     *
     * @since 1.6.1
     */
    SINGLE,
    /**
     * The cursor is split evenly across all selected slots, not to exceed the
     * Material's max stack size, with the remainder going to the cursor.
     *
     * @since 1.6.1
     */
    EVEN,
}
