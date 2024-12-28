package io.papermc.paper.datacomponent;

import org.bukkit.Keyed;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.21.3
 */
@NullMarked
@ApiStatus.Experimental
@ApiStatus.NonExtendable
public interface DataComponentType extends Keyed {

    /**
     * Checks if this data component type is persistent, or
     * that it will be saved with any itemstack it's attached to.
     *
     * @return {@code true} if persistent, {@code false} otherwise
     * @since 1.21.3
     */
    boolean isPersistent();

    /**
     * @since 1.21.3
     */
    @SuppressWarnings("unused")
    @ApiStatus.NonExtendable
    interface Valued<T> extends DataComponentType {

    }

    /**
     * @since 1.21.3
     */
    @ApiStatus.NonExtendable
    interface NonValued extends DataComponentType {

    }
}
