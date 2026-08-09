package io.papermc.paper.datacomponent.item;

import io.papermc.paper.registry.set.RegistryKeySet;
import org.bukkit.damage.DamageType;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

/**
 * Holds the contents of damage types that the item entity containing this item is invincible to.
 * @see io.papermc.paper.datacomponent.DataComponentTypes#DAMAGE_RESISTANT
 * @since 1.21.3
 */
@NullMarked
@ApiStatus.NonExtendable
public interface DamageResistant {

    /**
     * @since 26.2
     */
    @Contract(value = "_ -> new", pure = true)
    static DamageResistant damageResistant(final RegistryKeySet<DamageType> types) {
        return ItemComponentTypesBridge.bridge().damageResistant(types);
    }

    /**
     * The types that this damage type is invincible to.
     *
     * @return the registry key set holding the respective damage types.
     * @since 1.21.3
     */
    @Contract(value = "-> new", pure = true)
    RegistryKeySet<DamageType> types();
}
