package io.papermc.paper.registry.data.dialog.type;

import io.papermc.paper.registry.data.dialog.ActionButton;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

/**
 * Represents a notice dialog.
 * @see DialogType#notice(ActionButton)
 * @since 1.21.7
 */
@ApiStatus.NonExtendable
public non-sealed interface NoticeType extends DialogType {

    /**
     * Returns the action button associated with this notice type.
     *
     * @return the action button
     * @since 1.21.7
     */
    @Contract(pure = true)
    ActionButton action();
}
