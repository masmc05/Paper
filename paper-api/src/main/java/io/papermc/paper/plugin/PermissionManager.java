package io.papermc.paper.plugin;

import java.util.List;
import java.util.Set;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.Permission;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * A permission manager implementation to keep backwards compatibility partially alive with existing plugins that used
 * the bukkit one before.
 *
 * @since 1.19.3
 */
@ApiStatus.Experimental
@NullMarked
public interface PermissionManager {

    /**
     * Gets a {@link Permission} from its fully qualified name
     *
     * @param name Name of the permission
     * @return Permission, or null if none
     * @since 1.19.3
     */
    @Nullable Permission getPermission(String name);

    /**
     * Adds a {@link Permission} to this plugin manager.
     * <p>
     * If a permission is already defined with the given name of the new
     * permission, an exception will be thrown.
     *
     * @param perm Permission to add
     * @throws IllegalArgumentException Thrown when a permission with the same
     *                                  name already exists
     * @since 1.19.3
     */
    void addPermission(Permission perm);

    /**
     * Removes a {@link Permission} registration from this plugin manager.
     * <p>
     * If the specified permission does not exist in this plugin manager,
     * nothing will happen.
     * <p>
     * Removing a permission registration will <b>not</b> remove the
     * permission from any {@link Permissible}s that have it.
     *
     * @param perm Permission to remove
     * @since 1.19.3
     */
    void removePermission(Permission perm);

    /**
     * Removes a {@link Permission} registration from this plugin manager.
     * <p>
     * If the specified permission does not exist in this plugin manager,
     * nothing will happen.
     * <p>
     * Removing a permission registration will <b>not</b> remove the
     * permission from any {@link Permissible}s that have it.
     *
     * @param name Permission to remove
     * @since 1.19.3
     */
    void removePermission(String name);

    /**
     * Gets the default permissions for the given op status
     *
     * @param op Which set of default permissions to get
     * @return The default permissions
     * @since 1.19.3
     */
    Set<Permission> getDefaultPermissions(boolean op);

    /**
     * Recalculates the defaults for the given {@link Permission}.
     * <p>
     * This will have no effect if the specified permission is not registered
     * here.
     *
     * @param perm Permission to recalculate
     * @since 1.19.3
     */
    void recalculatePermissionDefaults(Permission perm);

    /**
     * Subscribes the given Permissible for information about the requested
     * Permission, by name.
     * <p>
     * If the specified Permission changes in any form, the Permissible will
     * be asked to recalculate.
     *
     * @param permission  Permission to subscribe to
     * @param permissible Permissible subscribing
     * @since 1.19.3
     */
    void subscribeToPermission(String permission, Permissible permissible);

    /**
     * Unsubscribes the given Permissible for information about the requested
     * Permission, by name.
     *
     * @param permission  Permission to unsubscribe from
     * @param permissible Permissible subscribing
     * @since 1.19.3
     */
    void unsubscribeFromPermission(String permission, Permissible permissible);

    /**
     * Gets a set containing all subscribed {@link Permissible}s to the given
     * permission, by name
     *
     * @param permission Permission to query for
     * @return Set containing all subscribed permissions
     * @since 1.19.3
     */
    Set<Permissible> getPermissionSubscriptions(String permission);

    /**
     * Subscribes to the given Default permissions by operator status
     * <p>
     * If the specified defaults change in any form, the Permissible will be
     * asked to recalculate.
     *
     * @param op          Default list to subscribe to
     * @param permissible Permissible subscribing
     * @since 1.19.3
     */
    void subscribeToDefaultPerms(boolean op, Permissible permissible);

    /**
     * Unsubscribes from the given Default permissions by operator status
     *
     * @param op          Default list to unsubscribe from
     * @param permissible Permissible subscribing
     * @since 1.19.3
     */
    void unsubscribeFromDefaultPerms(boolean op, Permissible permissible);

    /**
     * Gets a set containing all subscribed {@link Permissible}s to the given
     * default list, by op status
     *
     * @param op Default list to query for
     * @return Set containing all subscribed permissions
     * @since 1.19.3
     */
    Set<Permissible> getDefaultPermSubscriptions(boolean op);

    /**
     * Gets a set of all registered permissions.
     * <p>
     * This set is a copy and will not be modified live.
     *
     * @return Set containing all current registered permissions
     * @since 1.19.3
     */
    Set<Permission> getPermissions();

    /**
     * Adds a list of permissions.
     * <p>
     * This is meant as an optimization for adding multiple permissions without recalculating each permission.
     *
     * @param perm permission
     * @since 1.19.3
     */
    void addPermissions(List<Permission> perm);

    /**
     * Clears all the current registered permissions.
     * <p>
     * This is used for reloading.
     *
     * @since 1.19.3
     */
    void clearPermissions();

}
