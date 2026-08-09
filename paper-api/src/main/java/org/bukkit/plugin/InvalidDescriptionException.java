package org.bukkit.plugin;

/**
 * Thrown when attempting to load an invalid PluginDescriptionFile
 *
 * @since 1.0.0
 */
public class InvalidDescriptionException extends Exception {
    private static final long serialVersionUID = 5721389122281775896L;

    /**
     * Constructs a new InvalidDescriptionException based on the given
     * Exception
     *
     * @param message Brief message explaining the cause of the exception
     * @param cause Exception that triggered this Exception
     * @since 1.0.0
     */
    public InvalidDescriptionException(final Throwable cause, final String message) {
        super(message, cause);
    }

    /**
     * Constructs a new InvalidDescriptionException based on the given
     * Exception
     *
     * @param cause Exception that triggered this Exception
     * @since 1.0.0
     */
    public InvalidDescriptionException(final Throwable cause) {
        super("Invalid plugin.yml", cause);
    }

    /**
     * Constructs a new InvalidDescriptionException with the given message
     *
     * @param message Brief message explaining the cause of the exception
     * @since 1.0.0
     */
    public InvalidDescriptionException(final String message) {
        super(message);
    }

    /**
     * Constructs a new InvalidDescriptionException
     *
     * @since 1.0.0
     */
    public InvalidDescriptionException() {
        super("Invalid plugin.yml");
    }
}
