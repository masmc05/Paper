package org.bukkit.scheduler;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a task being executed by the scheduler
 *
 * @since 1.0.0
 */
public interface BukkitTask {

    /**
     * Returns the taskId for the task.
     *
     * @return Task id number
     * @since 1.0.0
     */
    public int getTaskId();

    /**
     * Returns the Plugin that owns this task.
     *
     * @return The Plugin that owns the task
     * @since 1.0.0
     */
    @NotNull
    public Plugin getOwner();

    /**
     * Returns true if the Task is a sync task.
     *
     * @return true if the task is run by main thread
     * @since 1.0.0
     */
    public boolean isSync();

    /**
     * Returns true if this task has been cancelled.
     *
     * @return true if the task has been cancelled
     * @since 1.12.1
     */
    public boolean isCancelled();

    /**
     * Will attempt to cancel this task.
     *
     * @since 1.3.2
     */
    public void cancel();
}
