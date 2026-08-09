package org.bukkit.entity;

/**
 * A baby {@link Frog}.
 *
 * @since 1.19
 */
public interface Tadpole extends Fish {

    /**
     * Gets the age of this tadpole.
     *
     * @return Age
     * @since 1.19
     */
    public int getAge();

    /**
     * Sets the age of this tadpole.
     *
     * @param age New age
     * @since 1.19
     */
    public void setAge(int age);

    /**
     * Lock the age of the tadpole, setting this will prevent the tadpole from
     * maturing. Plugins can still increase the age manually, however.
     *
     * @param lock new lock state
     * @since 1.19.3
     */
    void setAgeLock(boolean lock);

    /**
     * Checks if the age of the tadpole is locked.
     *
     * @return the current lock state
     * @see #setAgeLock(boolean)
     * @since 1.19.3
     */
    boolean getAgeLock();
}
