package org.bukkit.plugin;

import org.jetbrains.annotations.NotNull;
import java.util.Locale;

/**
 * Represents a base {@link Plugin}
 * <p>
 * Extend this class if your plugin is not a {@link
 * org.bukkit.plugin.java.JavaPlugin}
 *
 * @since 1.1.0
 */
public abstract class PluginBase implements Plugin {
    @Override
    public final int hashCode() {
        return getName().hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Plugin)) {
            return false;
        }
        return getName().equals(((Plugin) obj).getName());
    }

    /**
     * @since 1.1.0
     */
    @Override
    @NotNull
    public final String getName() {
        return getPluginMeta().getName(); // Paper
    }

    /**
     * @since 1.21.8
     */
    @Override
    @NotNull
    public String namespace() {
        return this.getPluginMeta().namespace();
    }
}
