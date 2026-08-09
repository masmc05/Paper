package org.bukkit.event.world;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * An event that is called when a world's spawn changes. The world's previous
 * spawn location is included.
 *
 * @since 1.0.0
 */
public class SpawnChangeEvent extends WorldEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Location previousLocation;

    @ApiStatus.Internal
    public SpawnChangeEvent(@NotNull final World world, @NotNull final Location previousLocation) {
        super(world);
        this.previousLocation = previousLocation;
    }

    /**
     * Gets the previous spawn location
     *
     * @return Location that used to be spawn
     * @since 1.0.0
     */
    @NotNull
    public Location getPreviousLocation() {
        return this.previousLocation.clone();
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
