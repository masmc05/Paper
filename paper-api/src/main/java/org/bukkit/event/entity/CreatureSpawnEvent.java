package org.bukkit.event.entity;

import org.bukkit.Chunk;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.world.ChunkLoadEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a creature is spawned into a world.
 * <p>
 * If this event is cancelled, the creature will not spawn.
 *
 * @since 1.0.0
 */
public class CreatureSpawnEvent extends EntitySpawnEvent {

    private final SpawnReason spawnReason;

    @ApiStatus.Internal
    public CreatureSpawnEvent(@NotNull final LivingEntity spawnee, @NotNull final SpawnReason spawnReason) {
        super(spawnee);
        this.spawnReason = spawnReason;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) this.entity;
    }

    /**
     * Gets the reason for why the creature is being spawned.
     *
     * @return A SpawnReason value detailing the reason for the creature being
     *     spawned
     * @since 1.0.0
     */
    @NotNull
    public SpawnReason getSpawnReason() {
        return this.spawnReason;
    }

    /**
     * An enum to specify the type of spawning
     *
     * @since 1.0.0
     */
    public enum SpawnReason {

        /**
         * When something spawns from natural means
         *
         * @since 1.0.0
         */
        NATURAL,
        /**
         * When an entity spawns as a jockey of another entity (mostly spider
         * jockeys)
         *
         * @since 1.1.0
         */
        JOCKEY,
        /**
         * When a creature spawns due to chunk generation
         *
         * @deprecated no longer called, chunks are generated with entities
         * already existing. Consider using {@link ChunkLoadEvent},
         * {@link ChunkLoadEvent#isNewChunk()} and {@link Chunk#getEntities()}
         * for similar effect.
         */
        @Deprecated(since = "1.14", forRemoval = true)
        CHUNK_GEN,
        /**
         * When a creature spawns from a spawner
         *
         * @since 1.0.0
         */
        SPAWNER,
        /**
         * When a creature spawns from a trial spawner
         *
         * @since 1.21
         */
        TRIAL_SPAWNER,
        /**
         * When a creature spawns from an egg
         *
         * @since 1.0.0
         */
        EGG,
        /**
         * When a creature spawns from a Spawner Egg
         *
         * @since 1.1.0
         */
        SPAWNER_EGG,
        /**
         * When a creature spawns because of a lightning strike
         *
         * @since 1.0.0
         */
        LIGHTNING,
        /**
         * When a snowman is spawned by being built
         *
         * @since 1.1.0
         */
        BUILD_SNOWMAN,
        /**
         * When an iron golem is spawned by being built
         *
         * @since 1.3.1
         */
        BUILD_IRONGOLEM,
        /**
         * When a copper golem is spawned by being built
         *
         * @since 1.21.10
         */
        BUILD_COPPERGOLEM,
        /**
         * When a wither boss is spawned by being built
         *
         * @since 1.4.5
         */
        BUILD_WITHER,
        /**
         * When an iron golem is spawned to defend a village
         *
         * @since 1.3.1
         */
        VILLAGE_DEFENSE,
        /**
         * When a zombie is spawned to invade a village
         *
         * @since 1.3.1
         */
        VILLAGE_INVASION,
        /**
         * When an entity breeds to create a child, this also include Shulker and Allay
         *
         * @since 1.3.1
         */
        BREEDING,
        /**
         * When a slime splits
         *
         * @since 1.3.1
         */
        SLIME_SPLIT,
        /**
         * When an entity calls for reinforcements
         *
         * @since 1.6.2
         */
        REINFORCEMENTS,
        /**
         * When a creature is spawned by nether portal
         *
         * @since 1.7.10
         */
        NETHER_PORTAL,
        /**
         * When a creature is spawned by a dispenser dispensing an egg
         *
         * @since 1.7.10
         */
        DISPENSE_EGG,
        /**
         * When a zombie infects a villager
         *
         * @since 1.7.10
         */
        INFECTION,
        /**
         * When a villager is cured from infection
         *
         * @since 1.7.10
         */
        CURED,
        /**
         * When an ocelot has a baby spawned along with them
         *
         * @since 1.7.10
         */
        OCELOT_BABY,
        /**
         * When a silverfish spawns from a block
         *
         * @since 1.7.10
         */
        SILVERFISH_BLOCK,
        /**
         * When an entity spawns as a mount of another entity (mostly chicken
         * jockeys)
         *
         * @since 1.7.10
         */
        MOUNT,
        /**
         * When an entity spawns as a trap for players approaching
         *
         * @since 1.9.4
         */
        TRAP,
        /**
         * When an entity is spawned as a result of ender pearl usage
         *
         * @since 1.10.2
         */
        ENDER_PEARL,
        /**
         * When an entity is spawned as a result of the entity it is being
         * perched on jumping or being damaged
         *
         * @since 1.12
         */
        SHOULDER_ENTITY,
        /**
         * When a creature is spawned by another entity drowning
         *
         * @since 1.13
         */
        DROWNED,
        /**
         * When a cow is spawned by shearing a mushroom cow
         *
         * @since 1.13.2
         */
        SHEARED,
        /**
         * When an entity is spawned as a result of an explosion. Like an area effect cloud from
         * a creeper or a dragon fireball.
         *
         * @since 1.14.3
         */
        EXPLOSION,
        /**
         * When an entity is spawned as part of a raid
         *
         * @since 1.14.4
         */
        RAID,
        /**
         * When an entity is spawned as part of a patrol
         *
         * @since 1.14.4
         */
        PATROL,
        /**
         * When a bee is released from a beehive/bee nest
         *
         * @since 1.15.1
         */
        BEEHIVE,
        /**
         * When a piglin is converted to a zombified piglin.
         *
         * @since 1.16.5
         */
        PIGLIN_ZOMBIFIED,
        /**
         * When an entity is created by a cast spell.
         *
         * @since 1.18.1
         */
        SPELL,
        /**
         * When an entity is shaking in Powder Snow and a new entity spawns.
         *
         * @since 1.17.1
         */
        FROZEN,
        /**
         * When a tadpole converts to a frog
         *
         * @since 1.19
         */
        METAMORPHOSIS,
        /**
         * When an Allay duplicate itself
         *
         * @since 1.19.2
         */
        DUPLICATION,
        /**
         * When a creature is spawned by the "/summon" command
         *
         * @since 1.16.5
         */
        COMMAND,
        /**
         * When a creature is spawned by an enchantment
         *
         * @since 1.21
         */
        ENCHANTMENT,
        /**
         * When an entity spawns from an ominous item spawner
         *
         * @since 1.21
         */
        OMINOUS_ITEM_SPAWNER,
        /**
         * When an entity spawns from a bucket
         *
         * @since 1.21.4
         */
        BUCKET,
        /**
         * When a creature is spawned by a potion effect, for example:
         * {@link org.bukkit.potion.PotionType#OOZING}, {@link org.bukkit.potion.PotionType#INFESTED}
         *
         * @since 1.21
         */
        POTION_EFFECT,
        /**
         * When a Copper Golem Statue turns back into a Copper Golem
         *
         * @apiNote Canceling a {@link CreatureSpawnEvent} with this reason does not prevent the statue block from being removed, use {@link EntityChangeBlockEvent} to account for all side effects
         * @since 1.21.10
         */
        REANIMATE,
        /**
         * When a creature is spawned by being rehydrated
         *
         * @since 1.21.7
         */
        REHYDRATION,
        /**
         * When a creature is spawned by plugins
         *
         * @since 1.0.0
         */
        CUSTOM,
        /**
         * When an entity is missing a SpawnReason
         *
         * @since 1.3.1
         */
        DEFAULT
    }
}
