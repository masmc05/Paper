package io.papermc.paper.datapack;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * This is a snapshot of a datapack on the server. It
 * won't be updated as datapacks are updated.
 *
 * @since 1.16.5
 */
@NullMarked
@ApiStatus.NonExtendable
public interface Datapack extends DiscoveredDatapack {

    /**
     * Gets the enabled state of this pack.
     *
     * @return whether the pack is currently enabled
     * @since 1.16.5
     */
    boolean isEnabled();

    /**
     * Changes the enabled state of this pack. Will
     * cause a reload of resources ({@code /minecraft:reload}) if
     * any change happens.
     *
     * @param enabled true to enable, false to disable
     * @apiNote This method may be deprecated in the future as setters on a "snapshot" type are undesirable.
     * @since 1.16.5
     */
    void setEnabled(boolean enabled);

    /**
     * Computes the component vanilla Minecraft uses
     * to display this datapack. Includes the {@link #getSource()},
     * {@link #getDescription()}, {@link #getName()}, and the enabled state.
     *
     * @return a new component
     * @since 1.21.1
     */
    @Contract(pure = true, value = "-> new")
    Component computeDisplayName();

    /**
     * @since 1.16.5
     */
    enum Compatibility {
        /**
         * @since 1.16.5
         */
        TOO_OLD,
        /**
         * @since 1.16.5
         */
        TOO_NEW,
        /**
         * @since 1.16.5
         */
        COMPATIBLE,
    }

    /**
     * Position of the pack in the load order.
     *
     * @since 1.21.4
     */
    enum Position {
        /**
         * @since 1.21.4
         */
        TOP, /**
         * @since 1.21.4
         */
        BOTTOM
    }
}
