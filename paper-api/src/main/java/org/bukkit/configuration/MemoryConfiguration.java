package org.bukkit.configuration;

import com.google.common.base.Preconditions;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This is a {@link Configuration} implementation that does not save or load
 * from any source, and stores all values in memory only.
 * This is useful for temporary Configurations for providing defaults.
 *
 * @since 1.0.0
 */
public class MemoryConfiguration extends MemorySection implements Configuration {
    protected Configuration defaults;
    protected MemoryConfigurationOptions options;

    /**
     * Creates an empty {@link MemoryConfiguration} with no default values.
     */
    public MemoryConfiguration() {}

    /**
     * Creates an empty {@link MemoryConfiguration} using the specified {@link
     * Configuration} as a source for all default values.
     *
     * @param defaults Default value provider
     * @throws IllegalArgumentException Thrown if defaults is null
     */
    public MemoryConfiguration(@Nullable Configuration defaults) {
        this.defaults = defaults;
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void addDefault(@NotNull String path, @Nullable Object value) {
        Preconditions.checkArgument(path != null, "Path may not be null");

        if (defaults == null) {
            defaults = new MemoryConfiguration();
        }

        defaults.set(path, value);
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void addDefaults(@NotNull Map<String, Object> defaults) {
        Preconditions.checkArgument(defaults != null, "Defaults may not be null");

        for (Map.Entry<String, Object> entry : defaults.entrySet()) {
            addDefault(entry.getKey(), entry.getValue());
        }
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void addDefaults(@NotNull Configuration defaults) {
        Preconditions.checkArgument(defaults != null, "Defaults may not be null");

        for (String key : defaults.getKeys(true)) {
            if (!defaults.isConfigurationSection(key)) {
                addDefault(key, defaults.get(key));
            }
        }
    }

    /**
     * @since 1.0.0
     */
    @Override
    public void setDefaults(@NotNull Configuration defaults) {
        Preconditions.checkArgument(defaults != null, "Defaults may not be null");

        this.defaults = defaults;
    }

    /**
     * @since 1.0.0
     */
    @Override
    @Nullable
    public Configuration getDefaults() {
        return defaults;
    }

    /**
     * @since 1.0.0
     */
    @Nullable
    @Override
    public ConfigurationSection getParent() {
        return null;
    }

    /**
     * @since 1.0.0
     */
    @Override
    @NotNull
    public MemoryConfigurationOptions options() {
        if (options == null) {
            options = new MemoryConfigurationOptions(this);
        }

        return options;
    }
}
