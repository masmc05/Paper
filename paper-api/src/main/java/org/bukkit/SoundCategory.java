package org.bukkit;

import net.kyori.adventure.sound.Sound;
import org.jspecify.annotations.NullMarked;

/**
 * An Enum of categories for sounds.
 *
 * @since 1.11
 */
@NullMarked
public enum SoundCategory implements Sound.Source.Provider {

    /**
     * @since 1.11
     */
    // Start generate - SoundCategory
    MASTER,
    /**
     * @since 1.11
     */
    MUSIC,
    /**
     * @since 1.11
     */
    RECORDS,
    /**
     * @since 1.11
     */
    WEATHER,
    /**
     * @since 1.11
     */
    BLOCKS,
    /**
     * @since 1.11
     */
    HOSTILE,
    /**
     * @since 1.11
     */
    NEUTRAL,
    /**
     * @since 1.11
     */
    PLAYERS,
    /**
     * @since 1.11
     */
    AMBIENT,
    /**
     * @since 1.11
     */
    VOICE,
    /**
     * @since 1.21.6
     */
    UI;
    // End generate - SoundCategory

    /**
     * {@inheritDoc}
     * @since 1.17
     */
    @Override
    public Sound.Source soundSource() {
        return switch (this) {
            case MASTER -> Sound.Source.MASTER;
            case MUSIC -> Sound.Source.MUSIC;
            case RECORDS -> Sound.Source.RECORD;
            case WEATHER -> Sound.Source.WEATHER;
            case BLOCKS -> Sound.Source.BLOCK;
            case HOSTILE -> Sound.Source.HOSTILE;
            case NEUTRAL -> Sound.Source.NEUTRAL;
            case PLAYERS -> Sound.Source.PLAYER;
            case AMBIENT -> Sound.Source.AMBIENT;
            case VOICE -> Sound.Source.VOICE;
            case UI -> Sound.Source.UI;
        };
    }
}
