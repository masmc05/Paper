package com.destroystokyo.paper.entity.ai;

import java.util.Collection;
import org.bukkit.entity.Mob;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Represents a part of the "brain" of a mob. It tracks all tasks (running or not), allows adding and removing goals
 *
 * @since 1.15.2
 */
@NullMarked
public interface MobGoals {

    /**
     * @since 1.15.2
     */
    <T extends Mob> void addGoal(T mob, int priority, Goal<T> goal);

    /**
     * @since 1.15.2
     */
    <T extends Mob> void removeGoal(T mob, Goal<T> goal);

    /**
     * @since 1.15.2
     */
    <T extends Mob> void removeAllGoals(T mob);

    /**
     * @since 1.15.2
     */
    <T extends Mob> void removeAllGoals(T mob, GoalType type);

    /**
     * @since 1.15.2
     */
    <T extends Mob> void removeGoal(T mob, GoalKey<T> key);

    /**
     * @since 1.15.2
     */
    <T extends Mob> boolean hasGoal(T mob, GoalKey<T> key);

    /**
     * @since 1.15.2
     */
    <T extends Mob> @Nullable Goal<T> getGoal(T mob, GoalKey<T> key);

    /**
     * @since 1.15.2
     */
    <T extends Mob> Collection<Goal<T>> getGoals(T mob, GoalKey<T> key);

    /**
     * @since 1.15.2
     */
    <T extends Mob> Collection<Goal<T>> getAllGoals(T mob);

    /**
     * @since 1.15.2
     */
    <T extends Mob> Collection<Goal<T>> getAllGoals(T mob, GoalType type);

    /**
     * @since 1.15.2
     */
    <T extends Mob> Collection<Goal<T>> getAllGoalsWithout(T mob, GoalType type);

    /**
     * @since 1.15.2
     */
    <T extends Mob> Collection<Goal<T>> getRunningGoals(T mob);

    /**
     * @since 1.15.2
     */
    <T extends Mob> Collection<Goal<T>> getRunningGoals(T mob, GoalType type);

    /**
     * @since 1.15.2
     */
    <T extends Mob> Collection<Goal<T>> getRunningGoalsWithout(T mob, GoalType type);
}
