package org.bukkit.block.data.type;

import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.NotNull;

/**
 * 'mode' represents the different modes in which this structure block may
 * operate.
 *
 * @since 1.13
 */
public interface StructureBlock extends BlockData {

    /**
     * Gets the value of the 'mode' property.
     *
     * @return the 'mode' value
     * @since 1.13
     */
    @NotNull
    Mode getMode();

    /**
     * Sets the value of the 'mode' property.
     *
     * @param mode the new 'mode' value
     * @since 1.13
     */
    void setMode(@NotNull Mode mode);

    /**
     * Operating mode of a structure block.
     *
     * @since 1.13
     */
    public enum Mode {
        /**
         * Allows selection and saving of a structure.
         *
         * @since 1.13
         */
        SAVE,
        /**
         * Allows loading of a structure.
         *
         * @since 1.13
         */
        LOAD,
        /**
         * Used for detection of two opposite corners of a structure.
         *
         * @since 1.13
         */
        CORNER,
        /**
         * Dummy block used to run a custom function during world generation
         * before being removed.
         *
         * @since 1.13
         */
        DATA;
    }
}
