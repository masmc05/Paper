package org.bukkit.entity;

/**
 * Represents groups of entities with shared spawn behaviors and mob caps.
 *
 * @see <a href="https://minecraft.wiki/w/Spawn#Java_Edition_mob_cap">Minecraft Wiki</a>
 * @since 1.18.1
 */
public enum SpawnCategory {

    /**
     * Entities related to Monsters, eg: Witch, Zombie, Creeper, etc.
     *
     * @since 1.18.1
     */
    MONSTER,
    /**
     * Entities related to Animals, eg: Strider, Cow, Turtle, etc.
     *
     * @since 1.18.1
     */
    ANIMAL,
    /**
     * Entities related to Water Animals, eg: Squid or Dolphin.
     *
     * @since 1.18.1
     */
    WATER_ANIMAL,
    /**
     * Entities related to Water Ambient, eg: Cod, PufferFish, Tropical Fish,
     * Salmon, etc.
     *
     * @since 1.18.1
     */
    WATER_AMBIENT,
    /**
     * Entities related to Water Underground, eg: Glow Squid.
     *
     * @since 1.18.1
     */
    WATER_UNDERGROUND_CREATURE,
    /**
     * Entities related to Ambient, eg: Bat.
     *
     * @since 1.18.1
     */
    AMBIENT,
    /**
     * All the Axolotl are represented by this Category.
     *
     * @since 1.18.1
     */
    AXOLOTL,
    /**
     * Entities not related to a mob, eg: Player, ArmorStand, Boat, etc.
     *
     * @since 1.18.1
     */
    MISC;
}
