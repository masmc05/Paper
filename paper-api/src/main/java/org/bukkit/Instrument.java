package org.bukkit;

import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1.0.0
 */
public enum Instrument {

    /**
     * Piano (Harp) is the standard instrument for a note block.
     *
     * @since 1.0.0
     */
    PIANO(Sound.BLOCK_NOTE_BLOCK_HARP),
    /**
     * Bass drum is normally played when a note block is on top of a
     * stone-like block.
     *
     * @since 1.0.0
     */
    BASS_DRUM(Sound.BLOCK_NOTE_BLOCK_BASEDRUM),
    /**
     * Snare drum is normally played when a note block is on top of a sandy
     * block.
     *
     * @since 1.0.0
     */
    SNARE_DRUM(Sound.BLOCK_NOTE_BLOCK_SNARE),
    /**
     * Sticks (Hat) are normally played when a note block is on top of a glass
     * block.
     *
     * @since 1.0.0
     */
    STICKS(Sound.BLOCK_NOTE_BLOCK_HAT),
    /**
     * Bass guitar is normally played when a note block is on top of a wooden
     * block.
     *
     * @since 1.0.0
     */
    BASS_GUITAR(Sound.BLOCK_NOTE_BLOCK_BASS),
    /**
     * Flute is normally played when a note block is on top of a clay block.
     *
     * @since 1.12
     */
    FLUTE(Sound.BLOCK_NOTE_BLOCK_FLUTE),
    /**
     * Bell is normally played when a note block is on top of a gold block.
     *
     * @since 1.12
     */
    BELL(Sound.BLOCK_NOTE_BLOCK_BELL),
    /**
     * Guitar is normally played when a note block is on top of a woolen block.
     *
     * @since 1.12
     */
    GUITAR(Sound.BLOCK_NOTE_BLOCK_GUITAR),
    /**
     * Chime is normally played when a note block is on top of a packed ice
     * block.
     *
     * @since 1.12
     */
    CHIME(Sound.BLOCK_NOTE_BLOCK_CHIME),
    /**
     * Xylophone is normally played when a note block is on top of a bone block.
     *
     * @since 1.12
     */
    XYLOPHONE(Sound.BLOCK_NOTE_BLOCK_XYLOPHONE),
    /**
     * Iron Xylophone is normally played when a note block is on top of an iron block.
     *
     * @since 1.14
     */
    IRON_XYLOPHONE(Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE),
    /**
     * Cow Bell is normally played when a note block is on top of a soul sand block.
     *
     * @since 1.14
     */
    COW_BELL(Sound.BLOCK_NOTE_BLOCK_COW_BELL),
    /**
     * Didgeridoo is normally played when a note block is on top of a pumpkin block.
     *
     * @since 1.14
     */
    DIDGERIDOO(Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO),
    /**
     * Bit is normally played when a note block is on top of an emerald block.
     *
     * @since 1.14
     */
    BIT(Sound.BLOCK_NOTE_BLOCK_BIT),
    /**
     * Banjo is normally played when a note block is on top of a hay block.
     *
     * @since 1.14
     */
    BANJO(Sound.BLOCK_NOTE_BLOCK_BANJO),
    /**
     * Pling is normally played when a note block is on top of a glowstone block.
     *
     * @since 1.14
     */
    PLING(Sound.BLOCK_NOTE_BLOCK_PLING),
    /**
     * Trumpet is normally played when a note block is on top of a copper block.
     *
     * @since 26.2
     */
    TRUMPET(Sound.BLOCK_NOTE_BLOCK_TRUMPET),
    /**
     * Trumpet exposed is normally played when a note block is on top of an exposed copper block.
     *
     * @since 26.2
     */
    TRUMPET_EXPOSED(Sound.BLOCK_NOTE_BLOCK_TRUMPET_EXPOSED),
    /**
     * Trumpet oxidized is normally played when a note block is on top of an oxidized copper block.
     *
     * @since 26.2
     */
    TRUMPET_OXIDIZED(Sound.BLOCK_NOTE_BLOCK_TRUMPET_OXIDIZED),
    /**
     * Trumpet weathered is normally played when a note block is on top of a weathered copper block.
     *
     * @since 26.2
     */
    TRUMPET_WEATHERED(Sound.BLOCK_NOTE_BLOCK_TRUMPET_WEATHERED),
    /**
     * Zombie is normally played when a Zombie Head is on top of the note block.
     *
     * @since 1.19.3
     */
    ZOMBIE(Sound.BLOCK_NOTE_BLOCK_IMITATE_ZOMBIE),
    /**
     * Skeleton is normally played when a Skeleton Head is on top of the note block.
     *
     * @since 1.19.3
     */
    SKELETON(Sound.BLOCK_NOTE_BLOCK_IMITATE_SKELETON),
    /**
     * Creeper is normally played when a Creeper Head is on top of the note block.
     *
     * @since 1.19.3
     */
    CREEPER(Sound.BLOCK_NOTE_BLOCK_IMITATE_CREEPER),
    /**
     * Dragon is normally played when a Dragon Head is on top of the note block.
     *
     * @since 1.19.3
     */
    DRAGON(Sound.BLOCK_NOTE_BLOCK_IMITATE_ENDER_DRAGON),
    /**
     * Wither Skeleton is normally played when a Wither Skeleton Head is on top of the note block.
     *
     * @since 1.19.3
     */
    WITHER_SKELETON(Sound.BLOCK_NOTE_BLOCK_IMITATE_WITHER_SKELETON),
    /**
     * Piglin is normally played when a Piglin Head is on top of the note block.
     *
     * @since 1.19.3
     */
    PIGLIN(Sound.BLOCK_NOTE_BLOCK_IMITATE_PIGLIN),
    /**
     * Custom Sound is normally played when a Player Head with the required data is on top of the note block.
     *
     * @since 1.19.3
     */
    CUSTOM_HEAD(null);

    private final Sound sound;

    Instrument(final Sound sound) {
        this.sound = sound;
    }

    /**
     * Gets the sound associated with this instrument. <br>
     * Will be null for {@link Instrument#CUSTOM_HEAD}
     *
     * @return the sound or null
     * @since 1.20.2
     */
    @Nullable
    public Sound getSound() {
        return this.sound;
    }

    /**
     * @return The type ID of this instrument.
     * @deprecated use {@link #ordinal()}, there's no meaning to this id
     * @since 1.0.0
     */
    @Deprecated(since = "26.1")
    public byte getType() {
        return (byte) this.ordinal();
    }

    /**
     * Get an instrument by its type ID.
     *
     * @param type The type ID
     * @return The instrument
     * @deprecated type is just the ordinal of the enum, no meaning in the game
     * @since 1.0.0
     */
    @Nullable
    @Deprecated(since = "26.1")
    public static Instrument getByType(final byte type) {
        return ArrayUtils.get(values(), type);
    }
}
