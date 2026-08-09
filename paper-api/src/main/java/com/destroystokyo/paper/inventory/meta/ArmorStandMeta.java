package com.destroystokyo.paper.inventory.meta;

import org.bukkit.inventory.meta.ItemMeta;

/**
 * @since 1.12.2
 */
public interface ArmorStandMeta extends ItemMeta {

    /**
     * Gets whether the ArmorStand should be invisible when spawned
     *
     * @return true if this should be invisible
     * @since 1.12.2
     */
    boolean isInvisible();

    /**
     * Gets whether this ArmorStand should have no base plate when spawned
     *
     * @return true if it will not have a base plate
     * @since 1.12.2
     */
    boolean hasNoBasePlate();

    /**
     * Gets whether this ArmorStand should show arms when spawned
     *
     * @return true if it will show arms
     * @since 1.12.2
     */
    boolean shouldShowArms();

    /**
     * Gets whether this ArmorStand will be small when spawned
     *
     * @return true if it will be small
     * @since 1.12.2
     */
    boolean isSmall();

    /**
     * Gets whether this ArmorStand will be a marker when spawned
     * The exact details of this flag are an implementation detail
     *
     * @return true if it will be a marker
     * @since 1.12.2
     */
    boolean isMarker();

    /**
     * Sets that this ArmorStand should be invisible when spawned
     *
     * @param invisible true if set invisible
     * @since 1.12.2
     */
    void setInvisible(boolean invisible);

    /**
     * Sets that this ArmorStand should have no base plate when spawned
     *
     * @param noBasePlate true if no base plate
     * @since 1.12.2
     */
    void setNoBasePlate(boolean noBasePlate);

    /**
     * Sets that this ArmorStand should show arms when spawned
     *
     * @param showArms true if show arms
     * @since 1.12.2
     */
    void setShowArms(boolean showArms);

    /**
     * Sets that this ArmorStand should be small when spawned
     *
     * @param small true if small
     * @since 1.12.2
     */
    void setSmall(boolean small);

    /**
     * Sets that this ArmorStand should be a marker when spawned
     * The exact details of this flag are an implementation detail
     *
     * @param marker true if a marker
     * @since 1.12.2
     */
    void setMarker(boolean marker);
}
