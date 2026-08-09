package org.bukkit;

import com.google.common.base.Preconditions;
import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.util.Index;
import org.intellij.lang.annotations.Subst;
import org.jetbrains.annotations.ApiStatus;

/**
 * This represents a Feature Flag for a {@link io.papermc.paper.world.flag.FeatureFlagSetHolder}.
 *
 * @since 1.19.4
 */
public interface FeatureFlag extends Keyed {

    /**
     * @since 1.21.3
     */
    // Start generate - FeatureFlag
    @ApiStatus.Experimental
    FeatureFlag MINECART_IMPROVEMENTS = create("minecart_improvements");

    /**
     * @since 1.21.3
     */
    @ApiStatus.Experimental
    FeatureFlag REDSTONE_EXPERIMENTS = create("redstone_experiments");

    /**
     * @since 1.20.2
     */
    @ApiStatus.Experimental
    FeatureFlag TRADE_REBALANCE = create("trade_rebalance");

    /**
     * @since 1.19.4
     */
    FeatureFlag VANILLA = create("vanilla");
    // End generate - FeatureFlag

    /**
     * <strong>AVAILABLE BETWEEN VERSIONS:</strong> 1.19 - 1.19.4
     *
     * @deprecated not available since 1.20
     * The {@code trade_rebalance} feature flag.
     * @since 1.19.4
     */
    @Deprecated(since = "1.20")
    FeatureFlag UPDATE_1_20 = deprecated("update_1_20");

    /**
     * <strong>AVAILABLE BETWEEN VERSIONS:</strong> 1.20.5 - 1.20.6
     *
     * @deprecated not available since 1.21
     * @since 1.20.4
     */
    @Deprecated(since = "1.21")
    FeatureFlag UPDATE_121 = deprecated("update_1_21");

    /**
     * <strong>AVAILABLE BETWEEN VERSIONS:</strong> 1.19.3 - 1.21.1
     *
     * @deprecated not available since 1.21.2
     * @since 1.19.4
     */
    @Deprecated(since = "1.21.2")
    FeatureFlag BUNDLE = deprecated("bundle");

    /**
     * <strong>AVAILABLE BETWEEN VERSIONS:</strong> 1.21.2 - 1.21.3
     *
     * @deprecated not available since 1.21.4
     * @since 1.21.3
     */
    @Deprecated(since = "1.21.4")
    FeatureFlag WINTER_DROP = deprecated("winter_drop");

    /**
     * An index of all feature flags.
     *
     * @since 1.21.1
     */
    Index<Key, FeatureFlag> ALL_FLAGS = Index.create(FeatureFlag::key, List.copyOf(FeatureFlagImpl.ALL_FLAGS));

    private static FeatureFlag create(@Subst("vanilla") final String name) {
        final FeatureFlag flag = new FeatureFlagImpl(NamespacedKey.minecraft(name));
        Preconditions.checkState(FeatureFlagImpl.ALL_FLAGS.add(flag), "Tried to add duplicate feature flag: " + name);
        return flag;
    }

    private static FeatureFlag deprecated(@Subst("vanilla") final String name) {
        return new FeatureFlagImpl.Deprecated(NamespacedKey.minecraft(name));
    }

}
