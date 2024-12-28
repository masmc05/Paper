package org.bukkit.block;

import java.util.List;
import org.bukkit.DyeColor;
import org.bukkit.block.banner.Pattern;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a captured state of a banner.
 *
 * @since 1.8
 */
public interface Banner extends TileState, org.bukkit.Nameable { // Paper - Nameable API

    /**
     * Returns the base color for this banner
     *
     * @return the base color
     * @since 1.8
     */
    @NotNull
    DyeColor getBaseColor();

    /**
     * Sets the base color for this banner.
     * <b>Only valid for shield pseudo banners, otherwise base depends on block
     * type</b>
     *
     * @param color the base color
     * @since 1.8
     */
    void setBaseColor(@NotNull DyeColor color);

    /**
     * Returns a list of patterns on this banner
     *
     * @return the patterns
     * @since 1.8
     */
    @NotNull
    List<Pattern> getPatterns();

    /**
     * Sets the patterns used on this banner
     *
     * @param patterns the new list of patterns
     * @since 1.8
     */
    void setPatterns(@NotNull List<Pattern> patterns);

    /**
     * Adds a new pattern on top of the existing
     * patterns
     *
     * @param pattern the new pattern to add
     * @since 1.8
     */
    void addPattern(@NotNull Pattern pattern);

    /**
     * Returns the pattern at the specified index
     *
     * @param i the index
     * @return the pattern
     * @since 1.8
     */
    @NotNull
    Pattern getPattern(int i);

    /**
     * Removes the pattern at the specified index
     *
     * @param i the index
     * @return the removed pattern
     * @since 1.8
     */
    @NotNull
    Pattern removePattern(int i);

    /**
     * Sets the pattern at the specified index
     *
     * @param i       the index
     * @param pattern the new pattern
     * @since 1.8
     */
    void setPattern(int i, @NotNull Pattern pattern);

    /**
     * Returns the number of patterns on this
     * banner
     *
     * @return the number of patterns
     * @since 1.8
     */
    int numberOfPatterns();
}
