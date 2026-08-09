package io.papermc.paper.world.damagesource;

import net.kyori.adventure.translation.Translatable;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a type of location from which the entity fell.
 *
 * @since 1.21.6
 */
@NullMarked
public sealed interface FallLocationType extends Translatable permits FallLocationTypeImpl {

    /**
     * Gets the fall location id.
     *
     * @return the fall location id
     * @since 1.21.6
     */
    String id();

    /**
     * Gets the translation key used for a fall death message
     * caused by falling from this location
     *
     * @return the translation key
     * @since 1.21.6
     */
    @Override
    String translationKey();

    /**
     * The entity was not within a special fall location.
     *
     * @since 1.21.6
     */
    FallLocationType GENERIC = new FallLocationTypeImpl("generic");
    /**
     * The entity was within the ladder.
     *
     * @since 1.21.6
     */
    FallLocationType LADDER = new FallLocationTypeImpl("ladder");
    /**
     * The entity was in vines.
     *
     * @since 1.21.6
     */
    FallLocationType VINES = new FallLocationTypeImpl("vines");
    /**
     * The entity was in weeping wines.
     *
     * @since 1.21.6
     */
    FallLocationType WEEPING_VINES = new FallLocationTypeImpl("weeping_vines");
    /**
     * The entity was in twisting vines.
     *
     * @since 1.21.6
     */
    FallLocationType TWISTING_VINES = new FallLocationTypeImpl("twisting_vines");
    /**
     * The entity was in scaffolding.
     *
     * @since 1.21.6
     */
    FallLocationType SCAFFOLDING = new FallLocationTypeImpl("scaffolding");
    /**
     * The entity was within some other climbable block.
     *
     * @since 1.21.6
     */
    FallLocationType OTHER_CLIMBABLE = new FallLocationTypeImpl("other_climbable");
    /**
     * The entity was in water.
     *
     * @since 1.21.6
     */
    FallLocationType WATER = new FallLocationTypeImpl("water");

}
