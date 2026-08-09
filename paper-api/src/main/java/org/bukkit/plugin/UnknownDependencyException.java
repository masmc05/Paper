package org.bukkit.plugin;

/**
 * Thrown when attempting to load an invalid Plugin file
 *
 * @since 1.0.0
 */
public class UnknownDependencyException extends RuntimeException {

    private static final long serialVersionUID = 5721389371901775895L;

    /**
     * Constructs a new UnknownDependencyException based on the given
     * Exception
     *
     * @param throwable Exception that triggered this Exception
     * @since 1.0.0
     */
    public UnknownDependencyException(final Throwable throwable) {
        super(throwable);
    }

    /**
     * Constructs a new UnknownDependencyException with the given message
     *
     * @param message Brief message explaining the cause of the exception
     * @since 1.0.0
     */
    public UnknownDependencyException(final String message) {
        super(message);
    }

    /**
     * Constructs a new UnknownDependencyException based on the given
     * Exception
     *
     * @param message Brief message explaining the cause of the exception
     * @param throwable Exception that triggered this Exception
     * @since 1.0.0
     */
    public UnknownDependencyException(final Throwable throwable, final String message) {
        super(message, throwable);
    }

    /**
     * Constructs a new UnknownDependencyException
     *
     * @since 1.0.0
     */
    public UnknownDependencyException() {

    }
    // Paper start
    /**
     * Create a new {@link UnknownDependencyException} with a message informing
     * about which dependencies are missing for what plugin.
     *
     * @param missingDependencies missing dependencies
     * @param pluginName plugin which is missing said dependencies
     * @since 1.16.5
     */
    public UnknownDependencyException(final @org.jetbrains.annotations.NotNull java.util.Collection<String> missingDependencies, final @org.jetbrains.annotations.NotNull String pluginName) {
        this("Unknown/missing dependency plugins: [" + String.join(", ", missingDependencies) + "]. Please download and install these plugins to run '" + pluginName + "'.");
    }
    // Paper end
}
