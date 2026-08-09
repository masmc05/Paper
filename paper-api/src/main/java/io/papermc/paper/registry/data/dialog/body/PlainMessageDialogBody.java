package io.papermc.paper.registry.data.dialog.body;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Range;

/**
 * A plain message body for a dialog.
 * <p>Created via {@link DialogBody#plainMessage(Component, int)}</p>
 *
 * @since 1.21.7
 */
public non-sealed interface PlainMessageDialogBody extends DialogBody {

    /**
     * The contents of the plain message body.
     *
     * @return the component contents
     * @since 1.21.7
     */
    @Contract(pure = true)
    Component contents();

    /**
     * The width of the plain message body.
     *
     * @return the width
     * @since 1.21.7
     */
    @Contract(pure = true)
    @Range(from = 1, to = 1024) int width();
}
