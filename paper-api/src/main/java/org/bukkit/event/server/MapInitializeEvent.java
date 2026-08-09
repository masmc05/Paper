package org.bukkit.event.server;

import org.bukkit.event.HandlerList;
import org.bukkit.map.MapView;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a map is initialized.
 *
 * @since 1.0.0
 */
public class MapInitializeEvent extends ServerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final MapView mapView;

    @ApiStatus.Internal
    public MapInitializeEvent(@NotNull final MapView mapView) {
        this.mapView = mapView;
    }

    /**
     * Gets the map initialized in this event.
     *
     * @return Map for this event
     * @since 1.0.0
     */
    @NotNull
    public MapView getMap() {
        return this.mapView;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
