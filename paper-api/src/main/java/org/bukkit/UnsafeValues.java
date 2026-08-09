package org.bukkit;

import io.papermc.paper.entity.EntitySerializationFlag;
import io.papermc.paper.registry.RegistryKey;
import java.util.List;
import java.util.Map;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.event.HoverEvent;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.potion.PotionType;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This interface provides value conversions that may be specific to a
 * runtime, or have arbitrary meaning (read: magic values).
 * <p>
 * Their existence and behavior is not guaranteed across future versions. They
 * may be poorly named, throw exceptions, have misleading parameters, or any
 * other bad programming practice.
 *
 * @since 1.7.2
 */
@Deprecated(since = "1.7.2")
public interface UnsafeValues {

    /**
     * @since 1.13
     */
    Material toLegacy(Material material);

    /**
     * @since 1.13
     */
    Material fromLegacy(Material material);

    /**
     * @since 1.13
     */
    Material fromLegacy(MaterialData material);

    /**
     * @since 1.13
     */
    Material fromLegacy(MaterialData material, boolean itemPriority);

    /**
     * @since 1.13
     */
    BlockData fromLegacy(Material material, byte data);

    /**
     * @since 1.14
     */
    Material getMaterial(String material, int version);

    /**
     * @since 1.13
     */
    int getDataVersion();

    /**
     * @since 1.7.2
     */
    ItemStack modifyItemStack(ItemStack item, String components);

    /**
     * @since 1.13
     */
    void checkSupported(PluginDescriptionFile pdf) throws InvalidPluginException;

    /**
     * @since 1.13
     */
    byte[] processClass(PluginDescriptionFile pdf, String path, byte[] clazz);

    /**
     * Load an advancement represented by the specified string into the server.
     * The advancement format is governed by Minecraft and has no specified layout.
     * <p>
     * It is currently a JSON object, as described by the <a href="https://minecraft.wiki/w/Advancement_definition">Minecraft wiki</a>.
     * <p>
     * Loaded advancements will be stored and persisted across server restarts
     * and reloads.
     *
     * @param key the unique advancement key
     * @param advancement representation of the advancement
     * @return the loaded advancement or {@code null} if an error occurred
     * @since 1.12
     */
    default @Nullable Advancement loadAdvancement(final NamespacedKey key, @Language("json") final String advancement) {
        return this.loadAdvancement(key, advancement, true);
    }

    /**
     * Load an advancement represented by the specified string into the server.
     * The advancement format is governed by Minecraft and has no specified layout.
     * <p>
     * It is currently a JSON object, as described by the <a href="https://minecraft.wiki/w/Advancement_definition">Minecraft wiki</a>.
     * <p>
     * Loaded advancements will only be stored and persisted across server restarts
     * and reloads, if the {@code persist} parameter is set to {@code true}.
     *
     * @param key the unique advancement key
     * @param advancement representation of the advancement
     * @param persist whether to store this advancement in the bukkit datapack for persistence
     * @return the loaded advancement or {@code null} if an error occurred
     * @since 26.2
     */
    @Nullable Advancement loadAdvancement(Key key, @Language("json") String advancement, boolean persist);

    /**
     * Load multiple advancements represented by the specified strings into the server.
     * The advancement format is governed by Minecraft and has no specified layout.
     * <p>
     * It is currently a JSON object, as described by the <a href="https://minecraft.wiki/w/Advancement_definition">Minecraft wiki</a>.
     * <p>
     * Loaded advancements will only be stored and persisted across server restarts
     * and reloads, if the {@code persist} parameter is set to true.
     * <p>
     * Callers should be prepared for {@link Exception} to be thrown.
     *
     * @param advancements the advancements to register. The key is the unique advancement key and the value is the advancement's JSON representation
     * @param persist whether to store this advancement in the bukkit datapack for persistence
     * @return list of all successfully loaded advancements
     * @since 26.2
     */
    List<Advancement> loadAdvancements(Map<Key, String> advancements, boolean persist);

    /**
     * Delete an advancement which was loaded and saved by
     * {@link #loadAdvancement(Key, String, boolean)} or {@link #loadAdvancements(Map, boolean)}.
     * <p>
     * This method will only remove advancement from persistent storage. It
     * should be accompanied by a call to {@link Server#reloadData()} in order
     * to fully remove it from the running instance.
     *
     * @param key the unique advancement key
     * @return true if a file matching this key was found and deleted
     * @since 1.12
     */
    boolean removeAdvancement(NamespacedKey key);

    /**
     * Do not use, method will get removed, and the plugin won't run
     *
     * @param key of the potion type
     * @return an internal potion data
     */
    @ApiStatus.Internal
    @Deprecated(since = "1.20.2", forRemoval = true)
    PotionType.InternalPotionData getInternalPotionData(NamespacedKey key);

    @ApiStatus.Internal
    String get(Class<?> elementClass, String value);

    @ApiStatus.Internal
    @Nullable <B extends Keyed> B get(RegistryKey<B> registry, NamespacedKey key);

    // Paper start
    @Deprecated(forRemoval = true)
    boolean isSupportedApiVersion(String apiVersion);

    @Deprecated(forRemoval = true)
    static boolean isLegacyPlugin(org.bukkit.plugin.Plugin plugin) {
        return !Bukkit.getUnsafe().isSupportedApiVersion(plugin.getDescription().getAPIVersion());
    }
    // Paper end

    // Paper start
    /**
     * Serializes this itemstack to json format.
     * It is safe for data migrations as it will use the built-in data converter instead of bukkit's
     * dangerous serialization system.
     * <p>
     * The emitted json object's format will inherently change across versions and hence should not be used for
     * non-development purposes like plugin configurations or end-user input.
     *
     * @return json object representing this item.
     * @see #deserializeItemFromJson(com.google.gson.JsonObject)
     * @throws IllegalArgumentException if the passed itemstack is {@link ItemStack#empty()}.
     * @since 1.21.1
     */
    @NotNull
    com.google.gson.JsonObject serializeItemAsJson(@NotNull ItemStack itemStack);

    /**
     * Creates an itemstack from a json object.
     * <p>
     * This method expects a json object in the format emitted by {@link #serializeItemAsJson(ItemStack)}.
     * <p>
     * The emitted json object's format will inherently change across versions and hence should not be used for
     * non-development purposes like plugin configurations or end-user input.
     *
     * @param data object representing an item in Json format
     * @return the deserialize item stack, migrated to the latest data version if needed.
     * @throws IllegalArgumentException if the json object is not a valid item
     * @see #serializeItemAsJson(ItemStack)
     * @since 1.21.1
     */
    @NotNull ItemStack deserializeItemFromJson(@NotNull com.google.gson.JsonObject data) throws IllegalArgumentException;

    /**
     * Serializes the provided entity.
     *
     * @param entity entity
     * @return serialized entity data
     * @see #serializeEntity(Entity, EntitySerializationFlag...)
     * @see #deserializeEntity(byte[], World, boolean, boolean)
     * @throws IllegalArgumentException if couldn't serialize the entity
     * @since 1.17.1
     */
    default byte @NotNull [] serializeEntity(@NotNull Entity entity) {
        return serializeEntity(entity, new EntitySerializationFlag[0]);
    }

    /**
     * Serializes the provided entity.
     *
     * @param entity entity
     * @param serializationFlags serialization flags
     * @return serialized entity data
     * @throws IllegalArgumentException if couldn't serialize the entity
     * @see #deserializeEntity(byte[], World, boolean, boolean)
     * @since 1.21.4
     */
    byte @NotNull [] serializeEntity(@NotNull Entity entity, @NotNull EntitySerializationFlag... serializationFlags);

    /**
     * Deserializes the entity from data.
     * <br>The entity's {@link java.util.UUID} as well as passengers will not be preserved.
     *
     * @param data serialized entity data
     * @param world world
     * @return deserialized entity
     * @throws IllegalArgumentException if invalid serialized entity data provided
     * @see #deserializeEntity(byte[], World, boolean, boolean)
     * @see #serializeEntity(Entity, EntitySerializationFlag...)
     * @see Entity#spawnAt(Location, CreatureSpawnEvent.SpawnReason)
     * @since 1.17.1
     */
    default @NotNull Entity deserializeEntity(byte @NotNull [] data, @NotNull World world) {
        return deserializeEntity(data, world, false);
    }

    /**
     * Deserializes the entity from data.
     * <br>The entity's passengers will not be preserved.
     *
     * @param data serialized entity data
     * @param world world
     * @param preserveUUID whether to preserve the entity's uuid
     * @return deserialized entity
     * @throws IllegalArgumentException if invalid serialized entity data provided
     * @see #deserializeEntity(byte[], World, boolean, boolean)
     * @see #serializeEntity(Entity, EntitySerializationFlag...)
     * @see Entity#spawnAt(Location, CreatureSpawnEvent.SpawnReason)
     * @since 1.17.1
     */
    default @NotNull Entity deserializeEntity(byte @NotNull [] data, @NotNull World world, boolean preserveUUID) {
        return deserializeEntity(data, world, preserveUUID, false);
    }

    /**
     * Deserializes the entity from data.
     *
     * @param data serialized entity data
     * @param world world
     * @param preserveUUID whether to preserve uuids of the entity and its passengers
     * @param preservePassengers whether to preserve passengers
     * @return deserialized entity
     * @throws IllegalArgumentException if invalid serialized entity data provided
     * @see #serializeEntity(Entity, EntitySerializationFlag...)
     * @see Entity#spawnAt(Location, CreatureSpawnEvent.SpawnReason)
     * @since 1.21.4
     */
    @NotNull Entity deserializeEntity(byte @NotNull [] data, @NotNull World world, boolean preserveUUID, boolean preservePassengers);

    /**
     * Creates and returns the next EntityId available.
     * <p>
     * Use this when sending custom packets, so that there are no collisions on the client or server.
     *
     * @since 26.2
     */
    int nextEntityId(final World world);

    /**
     * Just don't use it.
     *
     * @since 1.18.2
     */
    @org.jetbrains.annotations.NotNull String getMainLevelName();

    /**
     * Returns the server's protocol version.
     *
     * @return the server's protocol version
     * @since 1.16.5
     */
    int getProtocolVersion();
    // Paper end

    /**
     * @since 1.21.6
     */
    @NotNull ItemStack deserializeStack(@NotNull Map<String, Object> args);

    /**
     * Deserializes a {@link HoverEvent.ShowItem} hover event value into an {@code ItemStack}.
     *
     * @param itemHover the hover to deserialize
     * @return the deserialized {@code ItemStack}
     * @since 1.21.11
     */
    @NotNull ItemStack deserializeItemHover(HoverEvent.@NotNull ShowItem itemHover);

}
