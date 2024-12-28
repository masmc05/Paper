package org.bukkit.configuration;

import org.jetbrains.annotations.NotNull;

/**
 * Various settings for controlling the input and output of a {@link
 * MemoryConfiguration}
 *
 * @since 1.0.0
 */
public class MemoryConfigurationOptions extends ConfigurationOptions {
    protected MemoryConfigurationOptions(@NotNull MemoryConfiguration configuration) {
        super(configuration);
    }

    /**
     * @since 1.0.0
     */
    @NotNull
    @Override
    public MemoryConfiguration configuration() {
        return (MemoryConfiguration) super.configuration();
    }

    /**
     * @since 1.0.0
     */
    @NotNull
    @Override
    public MemoryConfigurationOptions copyDefaults(boolean value) {
        super.copyDefaults(value);
        return this;
    }

    /**
     * @since 1.0.0
     */
    @NotNull
    @Override
    public MemoryConfigurationOptions pathSeparator(char value) {
        super.pathSeparator(value);
        return this;
    }
}
