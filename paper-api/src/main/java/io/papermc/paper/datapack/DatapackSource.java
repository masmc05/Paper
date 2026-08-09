package io.papermc.paper.datapack;

import org.jspecify.annotations.NullMarked;

/**
 * Source of a datapack.
 *
 * @since 1.21.1
 */
@NullMarked
public sealed interface DatapackSource permits DatapackSourceImpl {

    /**
     * @since 1.21.1
     */
    DatapackSource DEFAULT = create("default");
    /**
     * @since 1.21.1
     */
    DatapackSource BUILT_IN = create("built_in");
    /**
     * @since 1.21.1
     */
    DatapackSource FEATURE = create("feature");
    /**
     * @since 1.21.1
     */
    DatapackSource WORLD = create("world");
    /**
     * @since 1.21.1
     */
    DatapackSource SERVER = create("server");
    /**
     * @since 1.21.4
     */
    DatapackSource PLUGIN = create("plugin");

    private static DatapackSource create(final String name) {
        return new DatapackSourceImpl(name);
    }
}
