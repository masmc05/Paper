package org.bukkit.inventory;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import net.kyori.adventure.text.Component;
import org.bukkit.Keyed;
import org.bukkit.Registry;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.view.AnvilView;
import org.bukkit.inventory.view.BeaconView;
import org.bukkit.inventory.view.BrewingStandView;
import org.bukkit.inventory.view.CrafterView;
import org.bukkit.inventory.view.EnchantmentView;
import org.bukkit.inventory.view.FurnaceView;
import org.bukkit.inventory.view.LecternView;
import org.bukkit.inventory.view.LoomView;
import org.bukkit.inventory.view.MerchantView;
import org.bukkit.inventory.view.StonecutterView;
import org.bukkit.inventory.view.builder.InventoryViewBuilder;
import org.bukkit.inventory.view.builder.LocationInventoryViewBuilder;
import org.bukkit.inventory.view.builder.MerchantInventoryViewBuilder;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Represents different kinds of views, also known as menus, which can be
 * created and viewed by the player.
 *
 * @since 1.21.1
 */
@NullMarked
public interface MenuType extends Keyed, io.papermc.paper.world.flag.FeatureDependant { // Paper - make FeatureDependant

    /**
     * A MenuType which represents a chest with 1 row.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, InventoryViewBuilder<InventoryView>> GENERIC_9X1 = get("generic_9x1");
    /**
     * A MenuType which represents a chest with 2 rows.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, InventoryViewBuilder<InventoryView>> GENERIC_9X2 = get("generic_9x2");
    /**
     * A MenuType which represents a chest with 3 rows.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> GENERIC_9X3 = get("generic_9x3");
    /**
     * A MenuType which represents a chest with 4 rows.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, InventoryViewBuilder<InventoryView>> GENERIC_9X4 = get("generic_9x4");
    /**
     * A MenuType which represents a chest with 5 rows.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, InventoryViewBuilder<InventoryView>> GENERIC_9X5 = get("generic_9x5");
    /**
     * A MenuType which represents a chest with 6 rows.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> GENERIC_9X6 = get("generic_9x6");
    /**
     * A MenuType which represents a dispenser/dropper like menu with 3 columns
     * and 3 rows.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> GENERIC_3X3 = get("generic_3x3");
    /**
     * A MenuType which represents a crafter
     *
     * @since 1.21.1
     */
    MenuType.Typed<CrafterView, LocationInventoryViewBuilder<CrafterView>> CRAFTER_3X3 = get("crafter_3x3");
    /**
     * A MenuType which represents an anvil.
     *
     * @since 1.21.1
     */
    MenuType.Typed<AnvilView, LocationInventoryViewBuilder<AnvilView>> ANVIL = get("anvil");
    /**
     * A MenuType which represents a beacon.
     *
     * @since 1.21.1
     */
    MenuType.Typed<BeaconView, LocationInventoryViewBuilder<BeaconView>> BEACON = get("beacon");
    /**
     * A MenuType which represents a blast furnace.
     *
     * @since 1.21.1
     */
    MenuType.Typed<FurnaceView, LocationInventoryViewBuilder<FurnaceView>> BLAST_FURNACE = get("blast_furnace");
    /**
     * A MenuType which represents a brewing stand.
     *
     * @since 1.21.1
     */
    MenuType.Typed<BrewingStandView, LocationInventoryViewBuilder<BrewingStandView>> BREWING_STAND = get("brewing_stand");
    /**
     * A MenuType which represents a crafting table.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> CRAFTING = get("crafting");
    /**
     * A MenuType which represents an enchantment table.
     *
     * @since 1.21.1
     */
    MenuType.Typed<EnchantmentView, LocationInventoryViewBuilder<EnchantmentView>> ENCHANTMENT = get("enchantment");
    /**
     * A MenuType which represents a furnace.
     *
     * @since 1.21.1
     */
    MenuType.Typed<FurnaceView, LocationInventoryViewBuilder<FurnaceView>> FURNACE = get("furnace");
    /**
     * A MenuType which represents a grindstone.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> GRINDSTONE = get("grindstone");
    /**
     * A MenuType which represents a hopper.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> HOPPER = get("hopper");
    /**
     * A MenuType which represents a lectern, a book like view.
     *
     * @since 1.21.1
     */
    MenuType.Typed<LecternView, LocationInventoryViewBuilder<LecternView>> LECTERN = get("lectern");
    /**
     * A MenuType which represents a loom.
     *
     * @since 1.21.1
     */
    MenuType.Typed<LoomView, LocationInventoryViewBuilder<LoomView>> LOOM = get("loom");
    /**
     * A MenuType which represents a merchant.
     *
     * @since 1.21.1
     */
    MenuType.Typed<MerchantView, MerchantInventoryViewBuilder<MerchantView>> MERCHANT = get("merchant");
    /**
     * A MenuType which represents a shulker box.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> SHULKER_BOX = get("shulker_box");
    /**
     * A MenuType which represents a smithing table.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> SMITHING = get("smithing");
    /**
     * A MenuType which represents a smoker.
     *
     * @since 1.21.1
     */
    MenuType.Typed<FurnaceView, LocationInventoryViewBuilder<FurnaceView>> SMOKER = get("smoker");
    /**
     * A MenuType which represents a cartography table.
     *
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, LocationInventoryViewBuilder<InventoryView>> CARTOGRAPHY_TABLE = get("cartography_table");
    /**
     * A MenuType which represents a stonecutter.
     *
     * @since 1.21.1
     */
    MenuType.Typed<StonecutterView, LocationInventoryViewBuilder<StonecutterView>> STONECUTTER = get("stonecutter");

    /**
     * Typed represents a subtype of {@link MenuType}s that have a known
     * {@link InventoryView} type at compile time.
     *
     * @param <V> the generic type of {@link InventoryView} that represents the
     * view type.
     * @since 1.21.1
     */
    interface Typed<V extends InventoryView, B extends InventoryViewBuilder<V>> extends MenuType {

        /**
         * Creates a view of the specified menu type.
         * <p>
         * The player provided to create this view must be the player the view
         * is opened for. See {@link HumanEntity#openInventory(InventoryView)}
         * for more information.
         *
         * @param player the player the view belongs to
         * @return the created {@link InventoryView}
         * @since 1.21.4
         */
        default V create(HumanEntity player) {
            return create(player, (Component) null);
        }

        /**
         * Creates a view of the specified menu type.
         * <p>
         * The player provided to create this view must be the player the view
         * is opened for. See {@link HumanEntity#openInventory(InventoryView)}
         * for more information.
         *
         * @param player the player the view belongs to
         * @param title the title of the view
         * @return the created {@link InventoryView}
         * @deprecated Use {@link #create(HumanEntity, Component)} instead.
         * @since 1.21.1
         */
        @Deprecated(since = "1.21") // Paper - adventure
        V create(HumanEntity player, @Nullable String title);

        // Paper start - adventure
        /**
         * Creates a view of the specified menu type.
         * <p>
         * The player provided to create this view must be the player the view
         * is opened for. See {@link HumanEntity#openInventory(InventoryView)}
         * for more information.
         *
         * @param player the player the view belongs to
         * @param title the title of the view
         * @return the created {@link InventoryView}
         * @since 1.21.1
         */
        V create(HumanEntity player, @Nullable Component title);
        // Paper end - adventure

        /**
         * @since 1.21.4
         */
        B builder();
    }

    // Paper start - adventure
    /**
     * Creates a view of the specified menu type.
     * <p>
     * The player provided to create this view must be the player the view
     * is opened for. See {@link HumanEntity#openInventory(InventoryView)}
     * for more information.
     *
     * @param player the player the view belongs to
     * @param title the title of the view
     * @return the created {@link InventoryView}
     * @since 1.21.1
     */
    InventoryView create(HumanEntity player, @Nullable Component title);
    // Paper end - adventure

    /**
     * Yields this MenuType as a typed version of itself with a plain
     * {@link InventoryView} representing it.
     *
     * @return the typed MenuType.
     * @since 1.21.1
     */
    MenuType.Typed<InventoryView, InventoryViewBuilder<InventoryView>> typed();

    /**
     * Yields this MenuType as a typed version of itself with a specific
     * {@link InventoryView} representing it.
     *
     * @param viewClass the class type of the {@link InventoryView} to type this
     * {@link InventoryView} with.
     * @param <V> the generic type of the InventoryView to get this MenuType
     * with
     * @param <B> the generic type of the InventoryViewBuilder to get this
     * MenuType with
     * @return the typed MenuType
     * @throws IllegalArgumentException if the provided viewClass cannot be
     * typed to this MenuType
     * @since 1.21.1
     */
    <V extends InventoryView, B extends InventoryViewBuilder<V>> MenuType.Typed<V, B> typed(final Class<V> viewClass) throws IllegalArgumentException;

    /**
     * Gets the {@link InventoryView} class of this MenuType.
     *
     * @return the {@link InventoryView} class of this MenuType
     * @since 1.21.1
     */
    Class<? extends InventoryView> getInventoryViewClass();

    @SuppressWarnings("unchecked")
    private static <T extends MenuType> T get(@KeyPattern.Value final String key) {
        return (T) Registry.MENU.getOrThrow(Key.key(Key.MINECRAFT_NAMESPACE, key));
    }
}
