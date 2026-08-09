package org.bukkit.entity;

/**
 * Represents an entity that can age and breed.
 *
 * @since 1.16.2
 */
public interface Breedable extends Ageable {

    /**
     * Return the ability to breed of the animal.
     *
     * @return the ability to breed of the animal
     * @since 1.16.2
     */
    public boolean canBreed();

    /**
     * Set breedability of the animal, if the animal is a baby and set to
     * breed it will instantly grow up.
     *
     * @param breed breedability of the animal
     * @since 1.16.2
     */
    public void setBreed(boolean breed);

}
