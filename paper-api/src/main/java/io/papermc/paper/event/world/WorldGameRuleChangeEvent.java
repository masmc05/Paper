package io.papermc.paper.event.world;

import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.WorldEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Called when a world's gamerule is changed, either by command, world options menu, or by api.
 * @see <a href="https://minecraft.wiki/w/Game_rule#Modifying_game_rules">Modifying game rules - Minecraft wiki</a>
 * @since 1.16.4
 */
@NullMarked
public class WorldGameRuleChangeEvent extends WorldEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final @Nullable CommandSender commandSender;
    protected final GameRule<?> gameRule;
    private String value;
    private boolean cancelled;

    @ApiStatus.Internal
    public WorldGameRuleChangeEvent(final World world, final @Nullable CommandSender commandSender, final GameRule<?> gameRule, final String value) {
        super(world);
        this.commandSender = commandSender;
        this.gameRule = gameRule;
        this.value = value;
    }

    /**
     * Gets the command sender associated with this event.
     *
     * @return {@code null} if the gamerule was changed via api, otherwise the {@link CommandSender}.
     * @since 1.16.4
     */
    public @Nullable CommandSender getCommandSender() {
        return this.commandSender;
    }

    /**
     * Gets the game rule associated with this event.
     *
     * @return the gamerule being changed.
     * @since 1.16.4
     */
    public GameRule<?> getGameRule() {
        return this.gameRule;
    }

    /**
     * Gets the new value of the gamerule.
     *
     * @return the new value of the gamerule.
     * @since 1.16.4
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Sets the new value of this gamerule.
     *
     * @param value the new value of the gamerule.
     * @since 1.16.4
     */
    public void setValue(final String value) {
        this.value = value;
    }

    /**
     * @since 1.16.4
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.16.4
     */
    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.16.4
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.16.4
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
