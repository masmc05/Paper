package com.destroystokyo.paper.entity.villager;

/**
 * A type of reputation gained with a {@link org.bukkit.entity.Villager Villager}.
 * <p>
 * All types but {@link #MAJOR_POSITIVE} are shared to other villagers.
 *
 * @since 1.15.2
 */
public enum ReputationType {
    /**
     * A gossip with a majorly negative effect. This is only gained through killing a nearby
     * villager.
     *
     * @since 1.15.2
     */
    MAJOR_NEGATIVE,

    /**
     * A gossip with a minor negative effect. This is only gained through damaging a villager.
     *
     * @since 1.15.2
     */
    MINOR_NEGATIVE,

    /**
     * A gossip with a minor positive effect. This is only gained through curing a zombie
     * villager.
     *
     * @since 1.15.2
     */
    MINOR_POSITIVE,

    /**
     * A gossip with a major positive effect. This is only gained through curing a zombie
     * villager.
     *
     * @since 1.15.2
     */
    MAJOR_POSITIVE,

    /**
     * A gossip with a minor positive effect. This is only gained through trading with a villager.
     *
     * @since 1.15.2
     */
    TRADING,
}
