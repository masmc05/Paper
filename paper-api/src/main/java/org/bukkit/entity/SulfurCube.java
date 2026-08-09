package org.bukkit.entity;

import io.papermc.paper.entity.Bucketable;
import io.papermc.paper.entity.Shearable;
import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a Sulfur Cube.
 *
 * @since 26.2
 */
@NullMarked
public interface SulfurCube extends AbstractCubeMob, Shearable, Bucketable, Ageable {

    /**
     * Gets the amount of ticks until this sulfur cube explode.
     *
     * @return the fuse ticks or -1 if not exploding
     * @since 26.2
     */
    int getFuseTicks();

    /**
     * Sets the amount of ticks until this sulfur cube explode.
     *
     * @param ticks the new fuse ticks
     * @since 26.2
     */
    void setFuseTicks(int ticks);

    /**
     * Determines whether this sulfur cube is capable of exploding.
     *
     * @return {@code true} if the sulfur cube can explode, {@code false} otherwise
     * @since 26.2
     */
    boolean canExplode();

    /**
     * Ignites this sulfur cube, beginning its fuse if {@link #canExplode()} is {@code true}.
     * <p>
     * The amount of time the sulfur cube takes to explode is defined in the {@link Archetype}
     * of the entity and further controlled by the {@code imminent} parameter.
     * <p>
     * This action can be cancelled using {@link io.papermc.paper.event.entity.EntityIgniteEvent}.
     * The resulting explosion can also be cancelled by an
     * {@link org.bukkit.event.entity.ExplosionPrimeEvent} and obeys the mob
     * griefing gamerule.
     *
     * @param imminent if {@code true} the fuse time is shortened but still depends on the {@link Archetype}
     * @return whether the sulfur cube got ignited
     * @see #canExplode()
     * @see #ignite()
     * @since 26.2
     */
    boolean ignite(boolean imminent);

    /**
     * Ignites this sulfur cube, beginning its fuse if {@link #canExplode()} is {@code true}.
     * <p>
     * The amount of time the sulfur cube takes to explode is defined in the {@link Archetype}
     * of the entity.
     * <p>
     * This action can be cancelled using {@link io.papermc.paper.event.entity.EntityIgniteEvent}.
     * The resulting explosion can also be cancelled by an
     * {@link org.bukkit.event.entity.ExplosionPrimeEvent} and obeys the mob
     * griefing gamerule.
     *
     * @return whether the sulfur cube got ignited
     * @see #canExplode()
     * @see #ignite(boolean)
     * @since 26.2
     */
    default boolean ignite() {
        return this.ignite(false);
    }

    /**
     * Represents the archetype of a sulfur cube
     * which define a lot of possible behavior and interaction
     * throughout its lifetime.
     *
     * @since 26.2
     */
    interface Archetype extends Keyed {

        /**
         * @since 26.2
         */
        // Start generate - SulfurCubeArchetype
        Archetype BOUNCY = getArchetype("bouncy");

        /**
         * @since 26.2
         */
        Archetype EXPLOSIVE = getArchetype("explosive");

        /**
         * @since 26.2
         */
        Archetype FAST_FLAT = getArchetype("fast_flat");

        /**
         * @since 26.2
         */
        Archetype FAST_SLIDING = getArchetype("fast_sliding");

        /**
         * @since 26.2
         */
        Archetype HIGH_RESISTANCE = getArchetype("high_resistance");

        /**
         * @since 26.2
         */
        Archetype HOT = getArchetype("hot");

        /**
         * @since 26.2
         */
        Archetype LIGHT = getArchetype("light");

        /**
         * @since 26.2
         */
        Archetype REGULAR = getArchetype("regular");

        /**
         * @since 26.2
         */
        Archetype SLOW_BOUNCY = getArchetype("slow_bouncy");

        /**
         * @since 26.2
         */
        Archetype SLOW_FLAT = getArchetype("slow_flat");

        /**
         * @since 26.2
         */
        Archetype SLOW_SLIDING = getArchetype("slow_sliding");

        /**
         * @since 26.2
         */
        Archetype STICKY = getArchetype("sticky");
        // End generate - SulfurCubeArchetype

        private static Archetype getArchetype(@KeyPattern.Value final String key) {
            return RegistryAccess.registryAccess().getRegistry(RegistryKey.SULFUR_CUBE_ARCHETYPE).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }
    }
}
