package com.destroystokyo.paper.entity.ai;

import java.util.Objects;
import java.util.StringJoiner;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Mob;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Used to identify a Goal. Consists of a {@link NamespacedKey} and the type of mob the goal can be applied to
 *
 * @param <T> the type of mob the goal can be applied to
 * @since 1.15.2
 */
@NullMarked
public final class GoalKey<T extends Mob> {

    private final Class<T> type;
    private final NamespacedKey key;

    private GoalKey(Class<T> type, NamespacedKey key) {
        this.type = type;
        this.key = key;
    }

    /**
     * @since 1.15.2
     */
    public Class<T> getEntityClass() {
        return this.type;
    }

    /**
     * @since 1.15.2
     */
    public NamespacedKey getNamespacedKey() {
        return this.key;
    }

    @Override
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        GoalKey<?> goalKey = (GoalKey<?>) o;
        return Objects.equals(this.type, goalKey.type) &&
            Objects.equals(this.key, goalKey.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.type, this.key);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GoalKey.class.getSimpleName() + "[", "]")
            .add("type=" + this.type)
            .add("key=" + this.key)
            .toString();
    }

    /**
     * @since 1.15.2
     */
    public static <A extends Mob> GoalKey<A> of(Class<A> type, NamespacedKey key) {
        return new GoalKey<>(type, key);
    }
}
