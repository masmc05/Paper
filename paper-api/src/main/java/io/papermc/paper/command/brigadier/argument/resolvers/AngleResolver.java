package io.papermc.paper.command.brigadier.argument.resolvers;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.argument.ArgumentTypes;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * An {@link ArgumentResolver} capable of resolving
 * an angle value using a {@link CommandSourceStack}.
 *
 * @see ArgumentTypes#angle()
 * @since 1.21.8
 */
@ApiStatus.Experimental
@NullMarked
@ApiStatus.NonExtendable
public interface AngleResolver {

    /**
     * Resolves the argument with the given
     * command source stack.
     *
     * @param sourceStack source stack
     * @return the resolved angle in degrees.
     * @since 1.21.8
     */
    float resolve(CommandSourceStack sourceStack) throws CommandSyntaxException;
}
