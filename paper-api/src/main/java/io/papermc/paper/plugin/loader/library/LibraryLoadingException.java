package io.papermc.paper.plugin.loader.library;

/**
 * Indicates that an exception has occurred while loading a library.
 *
 * @since 1.19.3
 */
public class LibraryLoadingException extends RuntimeException {

    /**
     * @since 1.19.3
     */
    public LibraryLoadingException(String s) {
        super(s);
    }

    /**
     * @since 1.19.3
     */
    public LibraryLoadingException(String s, Exception e) {
        super(s, e);
    }
}
