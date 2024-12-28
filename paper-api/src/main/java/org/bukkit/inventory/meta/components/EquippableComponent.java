package org.bukkit.inventory.meta.components;

import java.util.Collection;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.Tag;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a component which can turn any item into equippable armor.
 *
 * @since 1.21.3
 */
@ApiStatus.Experimental
public interface EquippableComponent extends ConfigurationSerializable {

    /**
     * Gets the slot the item can be equipped to.
     *
     * @return slot
     * @since 1.21.3
     */
    @NotNull
    EquipmentSlot getSlot();

    /**
     * Sets the slot the item can be equipped to.
     *
     * @param slot new slot
     * @since 1.21.3
     */
    void setSlot(@NotNull EquipmentSlot slot);

    /**
     * Gets the sound to play when the item is equipped.
     *
     * @return the sound
     * @since 1.21.3
     */
    @NotNull // Paper
    Sound getEquipSound();

    /**
     * Sets the sound to play when the item is equipped.
     *
     * @param sound sound or null for current default
     * @since 1.21.3
     */
    void setEquipSound(@Nullable Sound sound);

    /**
     * Gets the key of the model to use when equipped.
     *
     * @return model key
     * @since 1.21.3
     */
    @Nullable
    NamespacedKey getModel();

    /**
     * Sets the key of the model to use when equipped.
     *
     * @param key model key
     * @since 1.21.3
     */
    void setModel(@Nullable NamespacedKey key);

    /**
     * Gets the key of the camera overlay to use when equipped.
     *
     * @return camera overlay key
     * @since 1.21.3
     */
    @Nullable
    NamespacedKey getCameraOverlay();

    /**
     * Sets the key of the camera overlay to use when equipped.
     *
     * @param key camera overlay key
     * @since 1.21.3
     */
    void setCameraOverlay(@Nullable NamespacedKey key);

    /**
     * Gets the entities which can equip this item.
     *
     * @return the entities
     * @since 1.21.3
     */
    @Nullable
    Collection<EntityType> getAllowedEntities();

    /**
     * Sets the entities which can equip this item.
     *
     * @param entities the entity types
     * @since 1.21.3
     */
    void setAllowedEntities(@Nullable EntityType entities);

    /**
     * Sets the entities which can equip this item.
     *
     * @param entities the entity types
     * @since 1.21.3
     */
    void setAllowedEntities(@Nullable Collection<EntityType> entities);

    /**
     * Set the entity types (represented as an entity {@link Tag}) which can
     * equip this item.
     *
     * @param tag the entity tag
     * @throws IllegalArgumentException if the passed {@code tag} is not an entity
     * tag
     * @since 1.21.3
     */
    void setAllowedEntities(@Nullable Tag<EntityType> tag);

    /**
     * Gets whether the item can be equipped by a dispenser.
     *
     * @return equippable status
     * @since 1.21.3
     */
    boolean isDispensable();

    /**
     * Sets whether the item can be equipped by a dispenser.
     *
     * @param dispensable new equippable status
     * @since 1.21.3
     */
    void setDispensable(boolean dispensable);

    /**
     * Gets if the item is swappable by right clicking.
     *
     * @return swappable status
     * @since 1.21.3
     */
    boolean isSwappable();

    /**
     * Sets if the item is swappable by right clicking.
     *
     * @param swappable new status
     * @since 1.21.3
     */
    void setSwappable(boolean swappable);

    /**
     * Gets if the item will be damaged when the wearing entity is damaged.
     *
     * @return whether the item will be damaged
     * @since 1.21.3
     */
    boolean isDamageOnHurt();

    /**
     * Sets if the item will be damaged when the wearing entity is damaged.
     *
     * @param damage whether the item will be damaged
     * @since 1.21.3
     */
    void setDamageOnHurt(boolean damage);
}
