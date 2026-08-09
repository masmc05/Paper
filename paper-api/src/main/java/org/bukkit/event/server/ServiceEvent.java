package org.bukkit.event.server;

import org.bukkit.plugin.RegisteredServiceProvider;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * An event relating to a registered service. This is called in a {@link
 * org.bukkit.plugin.ServicesManager}
 *
 * @since 1.1.0
 */
public abstract class ServiceEvent extends ServerEvent {

    private final RegisteredServiceProvider<?> provider;

    protected ServiceEvent(@NotNull final RegisteredServiceProvider<?> provider) {
        this.provider = provider;
    }

    /**
     * @since 1.1.0
     */
    @NotNull
    public RegisteredServiceProvider<?> getProvider() {
        return this.provider;
    }
}
