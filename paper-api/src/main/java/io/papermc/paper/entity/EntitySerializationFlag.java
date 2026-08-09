package io.papermc.paper.entity;

import org.bukkit.UnsafeValues;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

/**
 * Represents flags for entity serialization.
 *
 * @see UnsafeValues#serializeEntity(Entity, EntitySerializationFlag... serializationFlags)
 * @since 1.21.4
 */
public enum EntitySerializationFlag {

    /**
     * Serialize entities that wouldn't be serialized normally
     * (e.g. dead, despawned, non-persistent, etc.).
     *
     * @see Entity#isValid()
     * @see Entity#isPersistent()
     * @since 1.21.4
     */
    FORCE,
    /**
     * Serialize misc non-saveable entities like lighting bolts, fishing bobbers, etc.
     * <br>Note: players require a separate flag: {@link #PLAYER}.
     *
     * @since 1.21.4
     */
    MISC,
    /**
     * Include passengers in the serialized data.
     *
     * @since 1.21.4
     */
    PASSENGERS,
    /**
     * Allow serializing {@link Player}s.
     * <p>Note: deserializing player data will always fail.
     *
     * @since 1.21.4
     */
    PLAYER

}
