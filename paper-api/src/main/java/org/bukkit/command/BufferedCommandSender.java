package org.bukkit.command;

import org.jetbrains.annotations.NotNull;

/**
 * @deprecated Timings will be removed in the future
 * @since 1.11.2
 */
@Deprecated(forRemoval = true)
public class BufferedCommandSender implements MessageCommandSender {
    private final StringBuffer buffer = new StringBuffer();
    /**
     * @since 1.11.2
     */
    @Override
    public void sendMessage(@NotNull String message) {
        buffer.append(message);
        buffer.append("\n");
    }

    /**
     * @since 1.11.2
     */
    @NotNull
    public String getBuffer() {
        return buffer.toString();
    }

    /**
     * @since 1.11.2
     */
    public void reset() {
        this.buffer.setLength(0);
    }
}
