package io.papermc.paper.plugin.lifecycle.event.registrar;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

/**
 * A lifecycle event that exposes a {@link Registrar} that is
 * reloadable.
 *
 * @param <R> the registrar type
 * @see RegistrarEvent
 * @since 1.20.4
 */
@ApiStatus.NonExtendable
public interface ReloadableRegistrarEvent<R extends Registrar> extends RegistrarEvent<R> {

    /**
     * Get the cause of this reload.
     *
     * @return the cause
     * @since 1.20.4
     */
    @Contract(pure = true)
    Cause cause();

    /**
     * @since 1.20.4
     */
    enum Cause {
        /**
         * The initial load of the server.
         *
         * @since 1.20.4
         */
        INITIAL,
        /**
         * A reload, triggered via one of the various mechanisms like
         * the bukkit or minecraft reload commands.
         *
         * @since 1.20.4
         */
        RELOAD
    }
}
