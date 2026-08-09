package org.bukkit.entity;

import com.destroystokyo.paper.SkinParts;
import io.papermc.paper.InternalAPIBridge;
import io.papermc.paper.datacomponent.item.ResolvableProfile;
import java.util.Set;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.MainHand;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * @since 1.21.10
 */
@NullMarked
public interface Mannequin extends LivingEntity {

    /**
     * Returns the valid poses for a mannequin.
     *
     * @return the valid poses
     * @since 1.21.11
     */
    static Set<Pose> validPoses() {
        return InternalAPIBridge.get().validMannequinPoses();
    }

    /**
     * Returns the default mannequin profile.
     *
     * @return the default mannequin profile
     * @since 1.21.10
     */
    static ResolvableProfile defaultProfile() {
        return InternalAPIBridge.get().defaultMannequinProfile();
    }

    /**
     * Returns the default mannequin description.
     *
     * @return the default mannequin description
     * @since 1.21.10
     */
    static Component defaultDescription() {
        return InternalAPIBridge.get().defaultMannequinDescription();
    }

    /**
     * Gets the resolvable profile for this mannequin.
     *
     * @return the resolvable profile
     * @since 1.21.10
     */
    ResolvableProfile getProfile();

    /**
     * Sets the resolvable profile for this mannequin.
     *
     * @param profile the new resolvable profile
     * @since 1.21.10
     */
    void setProfile(ResolvableProfile profile);

    /**
     * Gets a copy of the current skin part options for this mannequin.
     *
     * @return a copy of the current skin part options
     * @since 1.21.10
     */
    SkinParts.Mutable getSkinParts();

    /**
     * Sets the skin part options for this mannequin.
     *
     * @param parts the new skin part options
     * @since 1.21.10
     */
    void setSkinParts(SkinParts parts);

    /**
     * Checks if this mannequin is immovable.
     *
     * @return whether this mannequin is immovable
     * @since 1.21.10
     */
    boolean isImmovable();

    /**
     * Sets whether this mannequin is immovable.
     *
     * @param immovable new immovable state
     * @since 1.21.10
     */
    void setImmovable(boolean immovable);

    /**
     * Gets the description text for this mannequin (appears below the name).
     *
     * @return the description, or null if none is set
     * @since 1.21.10
     */
    @Nullable Component getDescription();

    /**
     * Sets the description text for this mannequin (appears below the name).
     * Setting the description to null will remove it.
     *
     * @param description the new description, or null to remove it
     * @since 1.21.10
     */
    void setDescription(@Nullable Component description);

    /**
     * Gets the main hand of this mannequin.
     *
     * @return the main hand
     * @since 1.21.10
     */
    MainHand getMainHand();

    /**
     * Sets the main hand of this mannequin.
     *
     * @param hand the new main hand
     * @since 1.21.10
     */
    void setMainHand(MainHand hand);

    /**
     * @since 1.21.10
     */
    @Override
    EntityEquipment getEquipment();
}
