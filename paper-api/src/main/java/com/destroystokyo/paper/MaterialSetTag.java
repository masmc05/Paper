/*
 * Copyright (c) 2018 Daniel Ennis (Aikar) MIT License
 */

package com.destroystokyo.paper;

import com.google.common.collect.Lists;
import io.papermc.paper.tag.BaseTag;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1.13.1
 */
public class MaterialSetTag extends BaseTag<Material, MaterialSetTag> {

    /**
     * @deprecated Use NamespacedKey version of constructor
     * @since 1.13.1
     */
    @Deprecated
    public MaterialSetTag(@NotNull Predicate<Material> filter) {
        this(null, Stream.of(Material.values()).filter(filter).collect(Collectors.toList()));
    }

    /**
     * @deprecated Use NamespacedKey version of constructor
     * @since 1.13.1
     */
    @Deprecated
    public MaterialSetTag(@NotNull Collection<Material> materials) {
        this(null, materials);
    }

    /**
     * @deprecated Use NamespacedKey version of constructor
     * @since 1.13.1
     */
    @Deprecated
    public MaterialSetTag(@NotNull Material... materials) {
        this(null, materials);
    }

    /**
     * @since 1.13.2
     */
    public MaterialSetTag(@Nullable NamespacedKey key, @NotNull Predicate<Material> filter) {
        this(key, Stream.of(Material.values()).filter(filter).collect(Collectors.toList()));
    }

    /**
     * @since 1.13.2
     */
    public MaterialSetTag(@Nullable NamespacedKey key, @NotNull Material... materials) {
        this(key, Lists.newArrayList(materials));
    }

    /**
     * @since 1.13.2
     */
    public MaterialSetTag(@Nullable NamespacedKey key, @NotNull Collection<Material> materials) {
        this(key != null ? key : NamespacedKey.randomKey(), materials, ((Predicate<Material>) Material::isLegacy).negate());
    }

    /**
     * @since 1.16.4
     */
    public MaterialSetTag(@Nullable NamespacedKey key, @NotNull Collection<Material> materials, @NotNull Predicate<Material>...globalPredicates) {
        super(Material.class, key != null ? key : NamespacedKey.randomKey(), materials, globalPredicates);
    }

    @NotNull
    @Override
    @ApiStatus.Internal
    protected Set<Material> getAllPossibleValues() {
        return Stream.of(Material.values()).collect(Collectors.toSet());
    }

    @Override
    @NotNull
    @ApiStatus.Internal
    protected String getName(@NotNull Material value) {
        return value.name();
    }

    /**
     * @since 1.13.1
     */
    public boolean isTagged(@NotNull BlockData block) {
        return isTagged(block.getMaterial());
    }

    /**
     * @since 1.13.1
     */
    public boolean isTagged(@NotNull BlockState block) {
        return isTagged(block.getType());
    }

    /**
     * @since 1.13.1
     */
    public boolean isTagged(@NotNull Block block) {
        return isTagged(block.getType());
    }

    /**
     * @since 1.13.1
     */
    public boolean isTagged(@NotNull ItemStack item) {
        return isTagged(item.getType());
    }

    /**
     * @since 1.13.1
     */
    @Override
    public boolean isTagged(@NotNull Material material) {
        return super.isTagged(material);
    }
}
