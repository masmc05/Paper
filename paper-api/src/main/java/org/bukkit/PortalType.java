package org.bukkit;

/**
 * Represents various types of portals that can be made in a world.
 *
 * @since 1.1.0
 */
public enum PortalType {

    /**
     * This is a Nether portal, made of obsidian.
     *
     * @since 1.1.0
     */
    NETHER,

    /**
     * This is an Ender portal.
     *
     * @since 1.1.0
     */
    ENDER,
    // Paper start
    /**
     * This is an end gateway
     *
     * @since 1.21
     */
    END_GATEWAY,
    // Paper end

    /**
     * This is a custom Plugin portal.
     *
     * @since 1.1.0
     */
    CUSTOM;
}
