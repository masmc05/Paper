package org.bukkit.event.world;

import org.bukkit.World;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.generator.structure.Structure;
import org.bukkit.util.BoundingBox;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a {@link Structure} is naturally generated in the world.
 *
 * @since 1.19.4
 */
public class AsyncStructureSpawnEvent extends WorldEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Structure structure;
    private final BoundingBox boundingBox;

    private final int chunkX, chunkZ;

    private boolean cancelled;

    @ApiStatus.Internal
    public AsyncStructureSpawnEvent(@NotNull World world, @NotNull Structure structure, @NotNull BoundingBox boundingBox, int chunkX, int chunkZ) {
        super(world, true);
        this.structure = structure;
        this.boundingBox = boundingBox;
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
    }

    /**
     * Get the structure reference that is generated.
     *
     * @return the structure
     * @since 1.19.4
     */
    @NotNull
    public Structure getStructure() {
        return this.structure;
    }

    /**
     * Get the bounding box of the structure.
     *
     * @return the bounding box
     * @since 1.19.4
     */
    @NotNull
    public BoundingBox getBoundingBox() {
        return this.boundingBox.clone();
    }

    /**
     * Get the x coordinate of the origin chunk of the structure.
     * <p>
     * <b>Note, it is not safe to attempt to retrieve or interact with this
     * chunk. This event is informative only!</b>
     *
     * @return the chunk x coordinate
     * @since 1.19.4
     */
    public int getChunkX() {
        return this.chunkX;
    }

    /**
     * Get the z coordinate of the origin chunk of the structure.
     * <p>
     * <b>Note, it is not safe to attempt to retrieve or interact with this
     * chunk. This event is informative only!</b>
     *
     * @return the chunk z coordinate
     * @since 1.19.4
     */
    public int getChunkZ() {
        return this.chunkZ;
    }

    /**
     * @since 1.19.4
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.19.4
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.19.4
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.19.4
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
