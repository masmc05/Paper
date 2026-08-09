package org.bukkit.map;

import com.google.common.base.Preconditions;
import java.util.Locale;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a cursor on a map.
 *
 * @since 1.0.0
 */
public final class MapCursor {
    private byte x, y;
    private byte direction;
    private boolean visible;
    private net.kyori.adventure.text.Component caption; // Paper
    private Type type;

    /**
     * Initialize the map cursor.
     *
     * @param x The x coordinate, from -128 to 127.
     * @param y The y coordinate, from -128 to 127.
     * @param direction The facing of the cursor, from 0 to 15.
     * @param type The type (color/style) of the map cursor.
     * @param visible Whether the cursor is visible by default.
     * @deprecated Magic value
     * @since 1.0.0
     */
    @Deprecated(since = "1.6.2")
    public MapCursor(byte x, byte y, byte direction, byte type, boolean visible) {
        this(x, y, direction, type, visible, (String) null); // Paper
    }

    /**
     * Initialize the map cursor.
     *
     * @param x The x coordinate, from -128 to 127.
     * @param y The y coordinate, from -128 to 127.
     * @param direction The facing of the cursor, from 0 to 15.
     * @param type The type (color/style) of the map cursor.
     * @param visible Whether the cursor is visible by default.
     * @since 1.12.1
     */
    public MapCursor(byte x, byte y, byte direction, @NotNull Type type, boolean visible) {
        this(x, y, direction, type, visible, (String) null); // Paper
    }

    /**
     * Initialize the map cursor.
     *
     * @param x The x coordinate, from -128 to 127.
     * @param y The y coordinate, from -128 to 127.
     * @param direction The facing of the cursor, from 0 to 15.
     * @param type The type (color/style) of the map cursor.
     * @param visible Whether the cursor is visible by default.
     * @param caption cursor caption
     * @deprecated Magic value. Use {@link #MapCursor(byte, byte, byte, Type, boolean, net.kyori.adventure.text.Component)}
     * @since 1.13
     */
    @Deprecated(since = "1.13")
    public MapCursor(byte x, byte y, byte direction, byte type, boolean visible, @Nullable String caption) {
        this.x = x;
        this.y = y;
        setDirection(direction);
        setRawType(type);
        this.visible = visible;
        this.caption = caption == null ? null : net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer.legacySection().deserialize(caption); // Paper
    }
    // Paper start
    /**
     * Initialize the map cursor.
     *
     * @param x The x coordinate, from -128 to 127.
     * @param y The y coordinate, from -128 to 127.
     * @param direction The facing of the cursor, from 0 to 15.
     * @param type The type (color/style) of the map cursor.
     * @param visible Whether the cursor is visible by default.
     * @param caption cursor caption
     * @deprecated Magic value
     * @since 1.16.5
     */
    @Deprecated
    public MapCursor(byte x, byte y, byte direction, byte type, boolean visible, net.kyori.adventure.text.@Nullable Component caption) {
        this.x = x; this.y = y; this.visible = visible; this.caption = caption;
        setDirection(direction);
        setRawType(type);
    }
    /**
     * Initialize the map cursor.
     *
     * @param x The x coordinate, from -128 to 127.
     * @param y The y coordinate, from -128 to 127.
     * @param direction The facing of the cursor, from 0 to 15.
     * @param type The type (color/style) of the map cursor.
     * @param visible Whether the cursor is visible by default.
     * @param caption cursor caption
     * @since 1.16.5
     */
    public MapCursor(byte x, byte y, byte direction, @NotNull Type type, boolean visible, net.kyori.adventure.text.@Nullable Component caption) {
        this.x = x; this.y = y; this.visible = visible; this.caption = caption;
        setDirection(direction);
        setType(type);
    }
    // Paper end

    /**
     * Initialize the map cursor.
     *
     * @param x The x coordinate, from -128 to 127.
     * @param y The y coordinate, from -128 to 127.
     * @param direction The facing of the cursor, from 0 to 15.
     * @param type The type (color/style) of the map cursor.
     * @param visible Whether the cursor is visible by default.
     * @param caption cursor caption
     * @since 1.13
     */
    public MapCursor(byte x, byte y, byte direction, @NotNull Type type, boolean visible, @Nullable String caption) {
        this.x = x;
        this.y = y;
        setDirection(direction);
        this.type = type;
        this.visible = visible;
        this.caption = caption == null ? null : net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer.legacySection().deserialize(caption); // Paper
    }

    /**
     * Get the X position of this cursor.
     *
     * @return The X coordinate.
     * @since 1.0.0
     */
    public byte getX() {
        return x;
    }

    /**
     * Get the Y position of this cursor.
     *
     * @return The Y coordinate.
     * @since 1.0.0
     */
    public byte getY() {
        return y;
    }

    /**
     * Get the direction of this cursor.
     *
     * @return The facing of the cursor, from 0 to 15.
     * @since 1.0.0
     */
    public byte getDirection() {
        return direction;
    }

    /**
     * Get the type of this cursor.
     *
     * @return The type (color/style) of the map cursor.
     * @since 1.0.0
     */
    @NotNull
    public Type getType() {
        return type;
    }

    /**
     * Get the type of this cursor.
     *
     * @return The type (color/style) of the map cursor.
     * @apiNote Internal Use Only
     */
    @org.jetbrains.annotations.ApiStatus.Internal // Paper
    public byte getRawType() {
        return type.getValue();
    }

    /**
     * Get the visibility status of this cursor.
     *
     * @return True if visible, false otherwise.
     * @since 1.0.0
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Set the X position of this cursor.
     *
     * @param x The X coordinate.
     * @since 1.0.0
     */
    public void setX(byte x) {
        this.x = x;
    }

    /**
     * Set the Y position of this cursor.
     *
     * @param y The Y coordinate.
     * @since 1.0.0
     */
    public void setY(byte y) {
        this.y = y;
    }

    /**
     * Set the direction of this cursor.
     *
     * @param direction The facing of the cursor, from 0 to 15.
     * @since 1.0.0
     */
    public void setDirection(byte direction) {
        Preconditions.checkArgument(direction >= 0 && direction <= 15, "direction must be between 0 and 15 but is %s", direction);
        this.direction = direction;
    }

    /**
     * Set the type of this cursor.
     *
     * @param type The type (color/style) of the map cursor.
     * @since 1.0.0
     */
    public void setType(@NotNull Type type) {
        this.type = type;
    }

    /**
     * Set the type of this cursor.
     *
     * @param type The type (color/style) of the map cursor.
     * @deprecated use {@link #setType(Type)}
     */
    @Deprecated(since = "1.6.2", forRemoval = true) // Paper
    public void setRawType(byte type) {
        Type enumType = Type.byValue(type);
        Preconditions.checkArgument(enumType != null, "Unknown type by id %s", type);
        this.type = enumType;
    }

    /**
     * Set the visibility status of this cursor.
     *
     * @param visible True if visible.
     * @since 1.0.0
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    // Paper start
    /**
     * Gets the caption on this cursor.
     *
     * @return caption
     * @since 1.16.5
     */
    public net.kyori.adventure.text.@Nullable Component caption() {
        return this.caption;
    }
    /**
     * Sets the caption on this cursor.
     *
     * @param caption new caption
     * @since 1.16.5
     */
    public void caption(net.kyori.adventure.text.@Nullable Component caption) {
        this.caption = caption;
    }
    // Paper end
    /**
     * Gets the caption on this cursor.
     *
     * @return caption
     * @deprecated in favour of {@link #caption()}
     * @since 1.13
     */
    @Nullable
    @Deprecated // Paper
    public String getCaption() {
        return this.caption == null ? null : net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer.legacySection().serialize(this.caption); // Paper
    }

    /**
     * Sets the caption on this cursor.
     *
     * @param caption new caption
     * @deprecated in favour of {@link #caption(net.kyori.adventure.text.Component)}
     * @since 1.13
     */
    @Deprecated // Paper
    public void setCaption(@Nullable String caption) {
        this.caption = caption == null ? null : net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer.legacySection().deserialize(caption); // Paper
    }

    /**
     * Represents the standard types of map cursors. More may be made
     * available by resource packs - the value is used by the client as an
     * index in the file './assets/minecraft/textures/map/map_icons.png' from minecraft.jar or from a
     * resource pack.
     *
     * @since 1.0.0
     */
    public interface Type extends OldEnum<Type>, Keyed {

        /**
         * @since 1.13
         */
        // Start generate - MapCursorType
        Type BANNER_BLACK = getType("banner_black");

        /**
         * @since 1.13
         */
        Type BANNER_BLUE = getType("banner_blue");

        /**
         * @since 1.13
         */
        Type BANNER_BROWN = getType("banner_brown");

        /**
         * @since 1.13
         */
        Type BANNER_CYAN = getType("banner_cyan");

        /**
         * @since 1.13
         */
        Type BANNER_GRAY = getType("banner_gray");

        /**
         * @since 1.13
         */
        Type BANNER_GREEN = getType("banner_green");

        /**
         * @since 1.13
         */
        Type BANNER_LIGHT_BLUE = getType("banner_light_blue");

        /**
         * @since 1.13
         */
        Type BANNER_LIGHT_GRAY = getType("banner_light_gray");

        /**
         * @since 1.13
         */
        Type BANNER_LIME = getType("banner_lime");

        /**
         * @since 1.13
         */
        Type BANNER_MAGENTA = getType("banner_magenta");

        /**
         * @since 1.13
         */
        Type BANNER_ORANGE = getType("banner_orange");

        /**
         * @since 1.13
         */
        Type BANNER_PINK = getType("banner_pink");

        /**
         * @since 1.13
         */
        Type BANNER_PURPLE = getType("banner_purple");

        /**
         * @since 1.13
         */
        Type BANNER_RED = getType("banner_red");

        /**
         * @since 1.13
         */
        Type BANNER_WHITE = getType("banner_white");

        /**
         * @since 1.13
         */
        Type BANNER_YELLOW = getType("banner_yellow");

        /**
         * @since 1.20.6
         */
        Type BLUE_MARKER = getType("blue_marker");

        /**
         * @since 1.20.6
         */
        Type FRAME = getType("frame");

        /**
         * @since 1.20.2
         */
        Type JUNGLE_TEMPLE = getType("jungle_temple");

        /**
         * @since 1.11.2
         */
        Type MANSION = getType("mansion");

        /**
         * @since 1.20.6
         */
        Type MONUMENT = getType("monument");

        /**
         * @since 1.20.6
         */
        Type PLAYER = getType("player");

        /**
         * @since 1.20.6
         */
        Type PLAYER_OFF_LIMITS = getType("player_off_limits");

        /**
         * @since 1.20.6
         */
        Type PLAYER_OFF_MAP = getType("player_off_map");

        /**
         * @since 1.11.2
         */
        Type RED_MARKER = getType("red_marker");

        /**
         * @since 1.13
         */
        Type RED_X = getType("red_x");

        /**
         * @since 1.20.2
         */
        Type SWAMP_HUT = getType("swamp_hut");

        /**
         * @since 1.20.6
         */
        Type TARGET_POINT = getType("target_point");

        /**
         * @since 1.20.6
         */
        Type TARGET_X = getType("target_x");

        /**
         * @since 1.20.6
         */
        Type TRIAL_CHAMBERS = getType("trial_chambers");

        /**
         * @since 1.20.6
         */
        Type VILLAGE_DESERT = getType("village_desert");

        /**
         * @since 1.20.6
         */
        Type VILLAGE_PLAINS = getType("village_plains");

        /**
         * @since 1.20.6
         */
        Type VILLAGE_SAVANNA = getType("village_savanna");

        /**
         * @since 1.20.6
         */
        Type VILLAGE_SNOWY = getType("village_snowy");

        /**
         * @since 1.20.6
         */
        Type VILLAGE_TAIGA = getType("village_taiga");
        // End generate - MapCursorType

        @NotNull
        private static Type getType(@NotNull @KeyPattern.Value String key) {
            return Registry.MAP_DECORATION_TYPE.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
        }

        /**
         * Gets the internal value of the cursor.
         *
         * @return the value
         * @apiNote Internal Use Only
         */
        @ApiStatus.Internal // Paper
        byte getValue();

        /**
         * Get a cursor by its internal value.
         *
         * @param value the value
         * @return the matching type
         * @apiNote Internal Use Only
         */
        @ApiStatus.Internal // Paper
        @Nullable
        static Type byValue(byte value) {
            for (Type t : values()) {
                if (t.getValue() == value) return t;
            }
            return null;
        }

        /**
         * @param name of the type.
         * @return the type with the given name.
         * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
         */
        @NotNull
        @Deprecated(since = "1.21", forRemoval = true) @ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
        static Type valueOf(@NotNull String name) {
            final NamespacedKey key = NamespacedKey.fromString(name.toLowerCase(Locale.ROOT));
            Type type = key == null ? null : Registry.MAP_DECORATION_TYPE.get(key);
            Preconditions.checkArgument(type != null, "No Type found with the name %s", name);
            return type;
        }

        /**
         * @return an array of all known map cursor types.
         * @deprecated use {@link Registry#stream()}.
         */
        @NotNull
        @Deprecated(since = "1.21", forRemoval = true) @ApiStatus.ScheduledForRemoval(inVersion = "1.22") // Paper - will be removed via asm-utils
        static Type[] values() {
            return Registry.MAP_DECORATION_TYPE.stream().toArray(Type[]::new);
        }
    }

}
