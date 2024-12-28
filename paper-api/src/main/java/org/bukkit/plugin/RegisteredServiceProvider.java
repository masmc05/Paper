package org.bukkit.plugin;

import org.jetbrains.annotations.NotNull;

/**
 * A registered service provider.
 *
 * @param <T> Service
 * @since 1.0.0
 */
public class RegisteredServiceProvider<T> implements Comparable<RegisteredServiceProvider<?>> {

    private Class<T> service;
    private Plugin plugin;
    private T provider;
    private ServicePriority priority;

    public RegisteredServiceProvider(@NotNull Class<T> service, @NotNull T provider, @NotNull ServicePriority priority, @NotNull Plugin plugin) {
        this.service = service;
        this.plugin = plugin;
        this.provider = provider;
        this.priority = priority;
    }

    /**
     * @since 1.0.0
     */
    @NotNull
    public Class<T> getService() {
        return service;
    }

    /**
     * @since 1.0.0
     */
    @NotNull
    public Plugin getPlugin() {
        return plugin;
    }

    /**
     * @since 1.0.0
     */
    @NotNull
    public T getProvider() {
        return provider;
    }

    /**
     * @since 1.0.0
     */
    @NotNull
    public ServicePriority getPriority() {
        return priority;
    }

    /**
     * {@inheritDoc}
     * @since 1.0.0
     */
    @Override
    public int compareTo(@NotNull RegisteredServiceProvider<?> other) {
        if (priority.ordinal() == other.getPriority().ordinal()) {
            return 0;
        } else {
            return priority.ordinal() < other.getPriority().ordinal() ? 1 : -1;
        }
    }
}
