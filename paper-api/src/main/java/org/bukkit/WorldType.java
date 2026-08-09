package org.bukkit;

import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents various types of worlds that may exist
 *
 * @since 1.1.0
 */
public enum WorldType {
    /**
     * @since 1.1.0
     */
    NORMAL("DEFAULT"),
    /**
     * @since 1.1.0
     */
    FLAT("FLAT"),
    /**
     * @since 1.3.1
     */
    LARGE_BIOMES("LARGEBIOMES"),
    /**
     * @since 1.7.2
     */
    AMPLIFIED("AMPLIFIED"),
    /**
     * @since 26.2
     */
    SINGLE_BIOME_SURFACE("SINGLE_BIOME_SURFACE"),
    /**
     * @since 26.2
     */
    DEBUG_ALL_BLOCK_STATES("DEBUG");

    private static final Map<String, WorldType> BY_NAME = Maps.newHashMap();
    private final String name;

    private WorldType(/*@NotNull*/ String name) {
        this.name = name;
    }

    /**
     * Gets the name of this WorldType
     *
     * @return Name of this type
     * @since 1.1.0
     */
    @NotNull
    public String getName() {
        return name;
    }

    /**
     * Gets a WorldType by its name
     *
     * @param name Name of the WorldType to get
     * @return Requested WorldType, or null if not found
     * @since 1.1.0
     */
    @Nullable
    public static WorldType getByName(@NotNull String name) {
        return BY_NAME.get(name.toUpperCase(Locale.ROOT));
    }

    static {
        for (WorldType type : values()) {
            BY_NAME.put(type.name, type);
        }
    }
}
