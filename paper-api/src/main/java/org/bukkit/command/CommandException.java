package org.bukkit.command;

/**
 * Thrown when an unhandled exception occurs during the execution of a Command
 *
 * @since 1.0.0
 */
@SuppressWarnings("serial")
public class CommandException extends RuntimeException {

    /**
     * Creates a new instance of <code>CommandException</code> without detail
     * message.
     *
     * @since 1.0.0
     */
    public CommandException() {}

    /**
     * Constructs an instance of <code>CommandException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     * @since 1.0.0
     */
    public CommandException(String msg) {
        super(msg);
    }

    /**
     * @since 1.0.0
     */
    public CommandException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
