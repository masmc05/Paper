package org.bukkit.entity;

/**
 * Represents an entity that can age.
 *
 * @since 1.3.1
 */
public interface Ageable extends Creature {
    /**
     * Gets the age of this mob.
     *
     * @return Age
     * @since 1.3.1
     */
    public int getAge();

    /**
     * Sets the age of this mob.
     *
     * @param age New age
     * @since 1.3.1
     */
    public void setAge(int age);

    /**
     * Lock the age of the animal, setting this will prevent the animal from
     * maturing or getting ready for mating.
     *
     * @param lock new lock
     * @deprecated see {@link Breedable#setAgeLock(boolean)}
     * @since 1.3.1
     */
    @Deprecated(since = "1.16.2")
    public void setAgeLock(boolean lock);

    /**
     * Gets the current agelock.
     *
     * @return the current agelock
     * @deprecated see {@link Breedable#getAgeLock()}
     * @since 1.3.1
     */
    @Deprecated(since = "1.16.2")
    public boolean getAgeLock();

    /**
     * Sets the age of the mob to a baby
     *
     * @since 1.3.1
     */
    public void setBaby();

    /**
     * Sets the age of the mob to an adult
     *
     * @since 1.3.1
     */
    public void setAdult();

    /**
     * Returns true if the mob is an adult.
     *
     * @return return true if the mob is an adult
     * @since 1.3.1
     */
    public boolean isAdult();

    /**
     * Return the ability to breed of the animal.
     *
     * @return the ability to breed of the animal
     * @deprecated see {@link Breedable#canBreed()}
     * @since 1.3.1
     */
    @Deprecated(since = "1.16.2")
    public boolean canBreed();

    /**
     * Set breedability of the animal, if the animal is a baby and set to
     * breed it will instantly grow up.
     *
     * @param breed breedability of the animal
     * @deprecated see {@link Breedable#setBreed(boolean)}
     * @since 1.3.1
     */
    @Deprecated(since = "1.16.2")
    public void setBreed(boolean breed);
}
