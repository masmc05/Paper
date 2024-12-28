package org.bukkit.block;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.inventory.DoubleChestInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a double chest.
 *
 * @since 1.3.1
 */
public class DoubleChest implements InventoryHolder {
    private DoubleChestInventory inventory;

    public DoubleChest(@NotNull DoubleChestInventory chest) {
        inventory = chest;
    }

    /**
     * @since 1.3.1
     */
    @Override
    @NotNull
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @since 1.3.1
     */
    @Nullable
    public InventoryHolder getLeftSide() {
        return inventory.getLeftSide().getHolder();
    }

    /**
     * @since 1.3.1
     */
    @Nullable
    public InventoryHolder getRightSide() {
        return inventory.getRightSide().getHolder();
    }

    /**
     * @since 1.15.2
     */
    // Paper start - getHolder without snapshot
    @Nullable
    public InventoryHolder getLeftSide(boolean useSnapshot) {
        return inventory.getLeftSide().getHolder(useSnapshot);
    }

    /**
     * @since 1.15.2
     */
    @Nullable
    public InventoryHolder getRightSide(boolean useSnapshot) {
        return inventory.getRightSide().getHolder(useSnapshot);
    }
    // Paper end

    /**
     * @since 1.3.1
     */
    @NotNull
    public Location getLocation() {
        return getInventory().getLocation();
    }

    /**
     * @since 1.3.1
     */
    @Nullable
    public World getWorld() {
        return getLocation().getWorld();
    }

    /**
     * @since 1.3.1
     */
    public double getX() {
        return getLocation().getX();
    }

    /**
     * @since 1.3.1
     */
    public double getY() {
        return getLocation().getY();
    }

    /**
     * @since 1.3.1
     */
    public double getZ() {
        return getLocation().getZ();
    }
}
