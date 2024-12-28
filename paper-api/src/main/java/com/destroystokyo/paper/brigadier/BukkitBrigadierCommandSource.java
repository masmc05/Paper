package com.destroystokyo.paper.brigadier;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.Nullable;

/**
 * @deprecated For removal, see {@link io.papermc.paper.command.brigadier.Commands} on how to use the new Brigadier API.
 * @since 1.20.6
 */
@Deprecated(forRemoval = true)
public interface BukkitBrigadierCommandSource {

    /**
     * @since 1.20.6
     */
    @Nullable
    Entity getBukkitEntity();

    /**
     * @since 1.20.6
     */
    @Nullable
    World getBukkitWorld();

    /**
     * @since 1.20.6
     */
    @Nullable
    Location getBukkitLocation();

    /**
     * @since 1.20.6
     */
    CommandSender getBukkitSender();
}
