package org.bukkit.material;

/**
 * Indicated a Material that may carry or create a Redstone current
 *
 * @since 1.0.0
 */
@Deprecated(forRemoval = true, since = "1.13")
public interface Redstone {

    /**
     * Gets the current state of this Material, indicating if it's powered or
     * unpowered
     *
     * @return true if powered, otherwise false
     * @since 1.0.0
     */
    public boolean isPowered();
}
