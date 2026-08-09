package org.bukkit.inventory.meta;

import org.bukkit.entity.Axolotl;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a bucket of axolotl.
 *
 * @since 1.17.1
 */
@NullMarked
public interface AxolotlBucketMeta extends ItemMeta {

    /**
     * Get the variant of the axolotl in the bucket.
     * <p>
     * Plugins should check that hasVariant() returns {@code true} before
     * calling this method.
     *
     * @return axolotl variant
     * @throws IllegalStateException if hasVariant() returns {@code false}
     * @since 1.17.1
     */
    Axolotl.Variant getVariant();

    /**
     * Set the variant of this axolotl in the bucket.
     *
     * @param variant axolotl variant
     * @since 1.17.1
     */
    void setVariant(Axolotl.Variant variant);

    /**
     * Checks for the existence of a variant indicating a specific axolotl will be
     * spawned.
     *
     * @return if there is a variant
     * @since 1.17.1
     */
    boolean hasVariant();

    @Override
    AxolotlBucketMeta clone();
}
