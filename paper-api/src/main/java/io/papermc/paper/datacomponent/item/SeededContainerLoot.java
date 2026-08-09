package io.papermc.paper.datacomponent.item;

import io.papermc.paper.datacomponent.DataComponentBuilder;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * Holds the loot table and seed for a container.
 * @see io.papermc.paper.datacomponent.DataComponentTypes#CONTAINER_LOOT
 * @since 1.21.3
 */
@NullMarked
@ApiStatus.NonExtendable
public interface SeededContainerLoot {

    /**
     * @since 1.21.3
     */
    @Contract(value = "_, _ -> new", pure = true)
    static SeededContainerLoot seededContainerLoot(final Key lootTableKey, final long seed) {
        return SeededContainerLoot.seededContainerLoot(lootTableKey).seed(seed).build();
    }

    /**
     * @since 1.21.3
     */
    @Contract(value = "_ -> new", pure = true)
    static SeededContainerLoot.Builder seededContainerLoot(final Key lootTableKey) {
        return ItemComponentTypesBridge.bridge().seededContainerLoot(lootTableKey);
    }

    /**
     * Gets the loot table key.
     *
     * @return the loot table key
     * @since 1.21.3
     */
    @Contract(pure = true)
    Key lootTable();

    /**
     * Gets the loot table seed.
     *
     * @return the seed
     * @since 1.21.3
     */
    @Contract(pure = true)
    long seed();

    /**
     * Builder for {@link SeededContainerLoot}.
     *
     * @since 1.21.3
     */
    @ApiStatus.NonExtendable
    interface Builder extends DataComponentBuilder<SeededContainerLoot> {

        /**
         * Sets the loot table key.
         *
         * @param key the loot table key
         * @return the builder for chaining
         * @see #lootTable()
         * @since 1.21.3
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder lootTable(Key key);

        /**
         * Sets the loot table seed.
         *
         * @param seed the seed
         * @return the builder for chaining
         * @see #seed()
         * @since 1.21.3
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder seed(long seed);
    }
}
