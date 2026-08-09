package org.bukkit.metadata;

import com.google.common.base.Preconditions;
import java.lang.ref.WeakReference;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.NumberConversions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Optional base class for facilitating MetadataValue implementations.
 * <p>
 * This provides all the conversion functions for MetadataValue so that
 * writing an implementation of MetadataValue is as simple as implementing
 * value() and invalidate().
 *
 * @deprecated This system is extremely misleading and does not cleanup values for metadatable entities that have been
 * removed. It is recommended that when wanting persistent metadata, you use {@link org.bukkit.persistence.PersistentDataContainer}.
 * <p>
 * If you want temporary values on an entity, use the entity lifecycle events and a {@link java.util.Map} of your own. (See {@link com.destroystokyo.paper.event.entity.EntityAddToWorldEvent} and {@link com.destroystokyo.paper.event.entity.EntityRemoveFromWorldEvent})
 * @since 1.5.1
 */
@Deprecated
public abstract class MetadataValueAdapter implements MetadataValue {
    protected final WeakReference<Plugin> owningPlugin;

    protected MetadataValueAdapter(@NotNull Plugin owningPlugin) {
        Preconditions.checkArgument(owningPlugin != null, "owningPlugin cannot be null");
        this.owningPlugin = new WeakReference<Plugin>(owningPlugin);
    }

    /**
     * @since 1.5.1
     */
    @Override
    @Nullable
    public Plugin getOwningPlugin() {
        return owningPlugin.get();
    }

    /**
     * @since 1.5.1
     */
    @Override
    public int asInt() {
        return NumberConversions.toInt(value());
    }

    /**
     * @since 1.5.1
     */
    @Override
    public float asFloat() {
        return NumberConversions.toFloat(value());
    }

    /**
     * @since 1.5.1
     */
    @Override
    public double asDouble() {
        return NumberConversions.toDouble(value());
    }

    /**
     * @since 1.5.1
     */
    @Override
    public long asLong() {
        return NumberConversions.toLong(value());
    }

    /**
     * @since 1.5.1
     */
    @Override
    public short asShort() {
        return NumberConversions.toShort(value());
    }

    /**
     * @since 1.5.1
     */
    @Override
    public byte asByte() {
        return NumberConversions.toByte(value());
    }

    /**
     * @since 1.5.1
     */
    @Override
    public boolean asBoolean() {
        Object value = value();
        if (value instanceof Boolean) {
            return (Boolean) value;
        }

        if (value instanceof Number) {
            return ((Number) value).intValue() != 0;
        }

        if (value instanceof String) {
            return Boolean.parseBoolean((String) value);
        }

        return value != null;
    }

    /**
     * @since 1.5.1
     */
    @Override
    @NotNull
    public String asString() {
        Object value = value();

        if (value == null) {
            return "";
        }
        return value.toString();
    }

}
