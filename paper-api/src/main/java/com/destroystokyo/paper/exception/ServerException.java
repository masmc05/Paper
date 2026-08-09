package com.destroystokyo.paper.exception;

/**
 * Wrapper exception for all exceptions that are thrown by the server.
 *
 * @since 1.9.4
 */
public class ServerException extends Exception {

    /**
     * @since 1.9.4
     */
    public ServerException(String message) {
        super(message);
    }

    /**
     * @since 1.9.4
     */
    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @since 1.9.4
     */
    public ServerException(Throwable cause) {
        super(cause);
    }

    protected ServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
