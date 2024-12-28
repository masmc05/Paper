package org.bukkit.entity;

import org.bukkit.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a text display entity.
 *
 * @since 1.19.4
 */
public interface TextDisplay extends Display {

    /**
     * Gets the displayed text.
     *
     * @return the displayed text.
     * @deprecated in favour of {@link #text()}
     * @since 1.19.4
     */
    @Nullable
    @Deprecated // Paper
    String getText();

    /**
     * Sets the displayed text.
     *
     * @param text the new text
     * @deprecated in favour of {@link #text(net.kyori.adventure.text.Component)}
     * @since 1.19.4
     */
    @Deprecated // Paper
    void setText(@Nullable String text);

    // Paper start
    /**
     * Gets the displayed text.
     *
     * @return the displayed text
     * @since 1.19.4
     */
    net.kyori.adventure.text.@NotNull Component text();

    /**
     * Sets the displayed text.
     *
     * @param text the new text
     * @since 1.19.4
     */
    void text(net.kyori.adventure.text.@Nullable Component text);
    // Paper end

    /**
     * Gets the maximum line width before wrapping.
     *
     * @return the line width
     * @since 1.19.4
     */
    int getLineWidth();

    /**
     * Sets the maximum line width before wrapping.
     *
     * @param width new line width
     * @since 1.19.4
     */
    void setLineWidth(int width);

    /**
     * Gets the text background color.
     *
     * @return the background color
     * @since 1.19.4
     */
    @Nullable
    Color getBackgroundColor();

    /**
     * Sets the text background color.
     *
     * @param color new background color
     * @since 1.19.4
     */
    void setBackgroundColor(@Nullable Color color);

    /**
     * Gets the text opacity.
     *
     * @return opacity or -1 if not set
     * @since 1.19.4
     */
    byte getTextOpacity();

    /**
     * Sets the text opacity.
     *
     * @param opacity new opacity or -1 if default
     * @since 1.19.4
     */
    void setTextOpacity(byte opacity);

    /**
     * Gets if the text is shadowed.
     *
     * @return shadow status
     * @since 1.19.4
     */
    boolean isShadowed();

    /**
     * Sets if the text is shadowed.
     *
     * @param shadow if shadowed
     * @since 1.19.4
     */
    void setShadowed(boolean shadow);

    /**
     * Gets if the text is see through.
     *
     * @return see through status
     * @since 1.19.4
     */
    boolean isSeeThrough();

    /**
     * Sets if the text is see through.
     *
     * @param seeThrough if see through
     * @since 1.19.4
     */
    void setSeeThrough(boolean seeThrough);

    /**
     * Gets if the text has its default background.
     *
     * @return default background
     * @since 1.19.4
     */
    boolean isDefaultBackground();

    /**
     * Sets if the text has its default background.
     *
     * @param defaultBackground if default
     * @since 1.19.4
     */
    void setDefaultBackground(boolean defaultBackground);

    /**
     * Gets the text alignment for this display.
     *
     * @return text alignment
     * @since 1.19.4
     */
    @NotNull
    TextAlignment getAlignment();

    /**
     * Sets the text alignment for this display.
     *
     * @param alignment new alignment
     */
    void setAlignment(@NotNull TextAlignment alignment);

    /**
     * Represents possible text alignments for this display.
     *
     * @since 1.19.4
     */
    public enum TextAlignment {

        /**
         * Center aligned text (default).
         */
        CENTER,
        /**
         * Left aligned text.
         */
        LEFT,
        /**
         * Right aligned text.
         */
        RIGHT;
    }
}
