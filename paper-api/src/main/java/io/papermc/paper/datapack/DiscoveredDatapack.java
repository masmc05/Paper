package io.papermc.paper.datapack;

import java.util.Set;
import net.kyori.adventure.text.Component;
import org.bukkit.FeatureFlag;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Unmodifiable;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a snapshot of a datapack that the server has found by
 * searching available sources. It may or may not be enabled and isn't
 * guaranteed to be available. This object won't be
 * updated as datapacks are updated.
 * @see DatapackRegistrar
 * @since 1.21.4
 */
@NullMarked
@ApiStatus.NonExtendable
public interface DiscoveredDatapack {

    /**
     * Gets the name/id of this datapack.
     *
     * @return the name of the pack
     * @since 1.21.4
     */
    @Contract(pure = true)
    String getName();

    /**
     * Gets the title component of this datapack.
     *
     * @return the title
     * @since 1.21.4
     */
    Component getTitle();

    /**
     * Gets the description component of this datapack.
     *
     * @return the description
     * @since 1.21.4
     */
    Component getDescription();

    /**
     * Gets if this datapack is required.
     * <p>
     * A "required" datapack will always be enabled on server startup, even if previously disabled.
     *
     * @return true if the pack is required
     * @since 1.21.4
     */
    boolean isRequired();

    /**
     * Gets the compatibility status of this pack.
     *
     * @return the compatibility of the pack
     * @since 1.21.4
     */
    Datapack.Compatibility getCompatibility();

    /**
     * Gets the set of required features for this datapack.
     *
     * @return the set of required features
     * @since 1.21.4
     */
    @Unmodifiable
    Set<FeatureFlag> getRequiredFeatures();

    /**
     * Gets the source for this datapack.
     *
     * @return the pack source
     * @since 1.21.4
     */
    DatapackSource getSource();
}
