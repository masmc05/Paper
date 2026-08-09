package io.papermc.paper.command.brigadier.argument.predicate;

import io.papermc.paper.command.brigadier.argument.ArgumentTypes;
import org.bukkit.block.Block;
import org.jetbrains.annotations.ApiStatus;

/**
 * A predicate for a {@link Block}.
 *
 * @see ArgumentTypes#blockInWorldPredicate()
 * @since 1.21.8
 */
@ApiStatus.Experimental
@ApiStatus.NonExtendable
public interface BlockInWorldPredicate {

    /**
     * Checks if the passed block matches the block predicate.
     * <p>
     * This method will load the chunk the block is at in a synchronous manner.
     *
     * @param block the block instance to check
     * @return the predicate result.
     * @since 1.21.8
     */
    default Result testBlock(final Block block) {
        return this.testBlock(block, true);
    }

    /**
     * Checks if the passed block matches the block predicate.
     *
     * @param block     the block instance to check
     * @param loadChunk if the chunk the block is located at should be loaded.
     * @return the predicate result.
     * @since 1.21.8
     */
    Result testBlock(Block block, boolean loadChunk);

    /**
     * The predicate result is yielded by the {@link BlockInWorldPredicate} when applied to a block.
     *
     * @see #testBlock(Block)
     * @see #testBlock(Block, boolean)
     * @since 1.21.8
     */
    enum Result {
        /**
         * The block passed to the predicate matches the predicate.
         *
         * @since 1.21.8
         */
        TRUE,

        /**
         * The block passed to the predicate does not match the predicate.
         *
         * @since 1.21.8
         */
        FALSE,

        /**
         * The block passed to the predicate was in an unloaded chunk and the {@code loadChunk} flag was false.
         *
         * @since 1.21.8
         */
        UNLOADED_CHUNK,
        ;

        /**
         * Converts the result into an approximated boolean representation.
         * Specifically, the following mappings are applied:
         * <ul>
         * <li>{@link #TRUE} -> {@code true}</li>
         * <li>{@link #FALSE} -> {@code false}</li>
         * <li>{@link #UNLOADED_CHUNK} -> {@code false}</li>
         * </ul>
         *
         * @return the boolean representation.
         * @since 1.21.8
         */
        public boolean asBoolean() {
            return this == TRUE;
        }
    }
}
