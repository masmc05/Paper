package io.papermc.paper.registry.data.dialog;

import io.papermc.paper.dialog.Dialog;
import io.papermc.paper.registry.RegistryBuilder;
import io.papermc.paper.registry.data.dialog.type.DialogListType;
import io.papermc.paper.registry.data.dialog.type.DialogType;
import io.papermc.paper.registry.set.RegistryValueSetBuilder;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

/**
 * A data-centric version-specific registry entry for the {@link io.papermc.paper.dialog.Dialog} type.
 *
 * @since 1.21.7
 */
@ApiStatus.NonExtendable
public interface DialogRegistryEntry {

    /**
     * The base dialog for this entry.
     *
     * @return the base dialog
     * @since 1.21.7
     */
    @Contract(pure = true)
    DialogBase base();

    /**
     * The type of dialog for this entry.
     *
     * @return the dialog type
     * @since 1.21.7
     */
    @Contract(pure = true)
    DialogType type();

    /**
     * A mutable builder for the {@link DialogRegistryEntry} plugins may change in applicable registry events.
     * <p>
     * The following values are required for each builder:
     * <ul>
     *     <li>{@link #base(DialogBase)}</li>
     *     <li>{@link #type(DialogType)}</li>
     * </ul>
     *
     * @since 1.21.7
     */
    @ApiStatus.NonExtendable
    interface Builder extends DialogRegistryEntry, RegistryBuilder<Dialog> {

        /**
         * Provides a builder for dialog {@link io.papermc.paper.registry.set.RegistryValueSet} which
         * can be used inside {@link DialogListType}.
         * <p>Not a part of the registry entry.</p>
         *
         * @return a new registry value set builder
         * @since 1.21.7
         */
        @Contract(value = "-> new", pure = true)
        RegistryValueSetBuilder<Dialog, DialogRegistryEntry.Builder> registryValueSet();

        /**
         * Sets the base dialog for this entry.
         *
         * @param dialogBase the base dialog
         * @return this builder instance
         * @see DialogRegistryEntry#base()
         * @since 1.21.7
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder base(DialogBase dialogBase);

        /**
         * Sets the type of dialog for this entry.
         *
         * @param dialogType the type of dialog
         * @return this builder instance
         * @see DialogRegistryEntry#type()
         * @since 1.21.7
         */
        @Contract(value = "_ -> this", mutates = "this")
        Builder type(DialogType dialogType);
    }
}
