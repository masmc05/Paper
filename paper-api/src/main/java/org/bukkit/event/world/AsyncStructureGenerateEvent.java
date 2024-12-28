package org.bukkit.event.world;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.event.HandlerList;
import org.bukkit.generator.structure.Structure;
import org.bukkit.util.BlockTransformer;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.EntityTransformer;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This event will sometimes fire synchronously, depending on how it was
 * triggered.
 * <p>
 * The constructor provides a boolean to indicate if the event was fired
 * synchronously or asynchronously. When asynchronous, this event can be called
 * from any thread, sans the main thread, and has limited access to the API.
 * <p>
 * If a {@link Structure} is naturally placed in a chunk of the world, this
 * event will be asynchronous. If a player executes the '/place structure'
 * command, this event will be synchronous.
 *
 * Allows to register transformers that can modify the blocks placed and
 * entities spawned by the structure.
 * <p>
 * Care should be taken to check {@link #isAsynchronous()} and treat the event
 * appropriately.
 * <p>
 *
 * @since 1.20.2
 */
@ApiStatus.Experimental
public class AsyncStructureGenerateEvent extends WorldEvent {

    /**
     * @since 1.20.2
     */
    public static enum Cause {
        COMMAND,
        WORLD_GENERATION,
        CUSTOM;
    }

    private static final HandlerList handlers = new HandlerList();

    private final Cause cause;

    private final Structure structure;
    private final BoundingBox boundingBox;

    private final int chunkX, chunkZ;

    private final Map<NamespacedKey, BlockTransformer> blockTransformers = new LinkedHashMap<>();
    private final Map<NamespacedKey, EntityTransformer> entityTransformers = new LinkedHashMap<>();

    public AsyncStructureGenerateEvent(@NotNull World world, boolean async, @NotNull Cause cause, @NotNull Structure structure, @NotNull BoundingBox boundingBox, int chunkX, int chunkZ) {
        super(world, async);
        this.structure = structure;
        this.boundingBox = boundingBox;
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
        this.cause = cause;
    }

    /**
     * Gets the event cause.
     *
     * @return the event cause
     * @since 1.20.2
     */
    @NotNull
    public Cause getCause() {
        return cause;
    }

    /**
     * Gets a block transformer by key.
     *
     * @param key the key of the block transformer
     *
     * @return the block transformer or null
     * @since 1.20.2
     */
    @Nullable
    public BlockTransformer getBlockTransformer(@NotNull NamespacedKey key) {
        Preconditions.checkNotNull(key, "NamespacedKey cannot be null");
        return blockTransformers.get(key);
    }

    /**
     * Sets a block transformer to a key.
     *
     * @param key the key
     * @param transformer the block transformer
     * @since 1.20.2
     */
    public void setBlockTransformer(@NotNull NamespacedKey key, @NotNull BlockTransformer transformer) {
        Preconditions.checkNotNull(key, "NamespacedKey cannot be null");
        Preconditions.checkNotNull(transformer, "BlockTransformer cannot be null");
        blockTransformers.put(key, transformer);
    }

    /**
     * Removes a block transformer.
     *
     * @param key the key of the block transformer
     * @since 1.20.2
     */
    public void removeBlockTransformer(@NotNull NamespacedKey key) {
        Preconditions.checkNotNull(key, "NamespacedKey cannot be null");
        blockTransformers.remove(key);
    }

    /**
     * Removes all block transformers.
     *
     * @since 1.20.2
     */
    public void clearBlockTransformers() {
        blockTransformers.clear();
    }

    /**
     * Gets all block transformers in a unmodifiable map.
     *
     * @return the block transformers in a map
     * @since 1.20.2
     */
    @NotNull
    public Map<NamespacedKey, BlockTransformer> getBlockTransformers() {
        return Collections.unmodifiableMap(blockTransformers);
    }

    /**
     * Gets a entity transformer by key.
     *
     * @param key the key of the entity transformer
     *
     * @return the entity transformer or null
     * @since 1.20.2
     */
    @Nullable
    public EntityTransformer getEntityTransformer(@NotNull NamespacedKey key) {
        Preconditions.checkNotNull(key, "NamespacedKey cannot be null");
        return entityTransformers.get(key);
    }

    /**
     * Sets a entity transformer to a key.
     *
     * @param key the key
     * @param transformer the entity transformer
     * @since 1.20.2
     */
    public void setEntityTransformer(@NotNull NamespacedKey key, @NotNull EntityTransformer transformer) {
        Preconditions.checkNotNull(key, "NamespacedKey cannot be null");
        Preconditions.checkNotNull(transformer, "EntityTransformer cannot be null");
        entityTransformers.put(key, transformer);
    }

    /**
     * Removes a entity transformer.
     *
     * @param key the key of the entity transformer
     * @since 1.20.2
     */
    public void removeEntityTransformer(@NotNull NamespacedKey key) {
        Preconditions.checkNotNull(key, "NamespacedKey cannot be null");
        entityTransformers.remove(key);
    }

    /**
     * Removes all entity transformers.
     *
     * @since 1.20.2
     */
    public void clearEntityTransformers() {
        entityTransformers.clear();
    }

    /**
     * Gets all entity transformers in a unmodifiable map.
     *
     * @return the entity transformers in a map
     * @since 1.20.2
     */
    @NotNull
    public Map<NamespacedKey, EntityTransformer> getEntityTransformers() {
        return Collections.unmodifiableMap(entityTransformers);
    }

    /**
     * Get the structure reference that is generated.
     *
     * @return the structure
     * @since 1.20.2
     */
    @NotNull
    public Structure getStructure() {
        return structure;
    }

    /**
     * Get the bounding box of the structure.
     *
     * @return the bounding box
     * @since 1.20.2
     */
    @NotNull
    public BoundingBox getBoundingBox() {
        return boundingBox.clone();
    }

    /**
     * Get the x coordinate of the origin chunk of the structure.
     *
     * @return the chunk x coordinate
     * @since 1.20.2
     */
    public int getChunkX() {
        return chunkX;
    }

    /**
     * Get the z coordinate of the origin chunk of the structure.
     *
     * @return the chunk z coordinate
     * @since 1.20.2
     */
    public int getChunkZ() {
        return chunkZ;
    }

    /**
     * @since 1.20.2
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @since 1.20.2
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
