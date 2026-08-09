package org.bukkit;

import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import net.kyori.adventure.text.Component;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a song which may play in a Jukebox.
 *
 * @since 1.21
 */
@NullMarked
public interface JukeboxSong extends Keyed, Translatable {

    /**
     * @since 1.21
     */
    // Start generate - JukeboxSong
    JukeboxSong ELEVEN = get("11");

    /**
     * @since 1.21
     */
    JukeboxSong THIRTEEN = get("13");

    /**
     * @since 1.21
     */
    JukeboxSong FIVE = get("5");

    /**
     * @since 1.21
     */
    JukeboxSong BLOCKS = get("blocks");

    /**
     * @since 26.2
     */
    JukeboxSong BOUNCE = get("bounce");

    /**
     * @since 1.21
     */
    JukeboxSong CAT = get("cat");

    /**
     * @since 1.21
     */
    JukeboxSong CHIRP = get("chirp");

    /**
     * @since 1.21
     */
    JukeboxSong CREATOR = get("creator");

    /**
     * @since 1.21
     */
    JukeboxSong CREATOR_MUSIC_BOX = get("creator_music_box");

    /**
     * @since 1.21
     */
    JukeboxSong FAR = get("far");

    /**
     * @since 1.21.7
     */
    JukeboxSong LAVA_CHICKEN = get("lava_chicken");

    /**
     * @since 1.21
     */
    JukeboxSong MALL = get("mall");

    /**
     * @since 1.21
     */
    JukeboxSong MELLOHI = get("mellohi");

    /**
     * @since 1.21
     */
    JukeboxSong OTHERSIDE = get("otherside");

    /**
     * @since 1.21
     */
    JukeboxSong PIGSTEP = get("pigstep");

    /**
     * @since 1.21
     */
    JukeboxSong PRECIPICE = get("precipice");

    /**
     * @since 1.21
     */
    JukeboxSong RELIC = get("relic");

    /**
     * @since 1.21
     */
    JukeboxSong STAL = get("stal");

    /**
     * @since 1.21
     */
    JukeboxSong STRAD = get("strad");

    /**
     * @since 1.21.6
     */
    JukeboxSong TEARS = get("tears");

    /**
     * @since 1.21
     */
    JukeboxSong WAIT = get("wait");

    /**
     * @since 1.21
     */
    JukeboxSong WARD = get("ward");
    // End generate - JukeboxSong

    private static JukeboxSong get(@KeyPattern.Value String key) {
        return RegistryAccess.registryAccess().getRegistry(RegistryKey.JUKEBOX_SONG).getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }

    /**
     * @deprecated this method assumes that jukebox song description will
     * always be a translatable component which is not guaranteed.
     */
    @Override
    @Deprecated(forRemoval = true)
    String getTranslationKey();

    /**
     * Gets the sound for this song.
     *
     * @return the sound
     * @since 1.21.10
     */
    Sound getSound();

    /**
     * Gets the description for this song.
     *
     * @return the description
     * @since 1.21.10
     */
    Component getDescription();

    /**
     * Gets the length in seconds for this song.
     *
     * @return the length in seconds
     * @since 1.21.10
     */
    float getLengthInSeconds();

    /**
     * Gets the comparator output for this song.
     *
     * @return the comparator output
     * @since 1.21.10
     */
    int getComparatorOutput();
}
