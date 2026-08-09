package org.bukkit.event.block;

import com.google.common.base.Preconditions;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a note block is being played through player interaction or a
 * redstone current.
 *
 * @since 1.3.1
 */
public class NotePlayEvent extends BlockEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private Instrument instrument;
    private Note note;

    private boolean cancelled;

    @ApiStatus.Internal
    public NotePlayEvent(@NotNull Block block, @NotNull Instrument instrument, @NotNull Note note) {
        super(block);
        this.instrument = instrument;
        this.note = note;
    }

    /**
     * Gets the {@link Instrument} to be used.
     *
     * @return the Instrument
     * @since 1.3.1
     */
    @NotNull
    public Instrument getInstrument() {
        return this.instrument;
    }

    /**
     * Gets the {@link Note} to be played.
     *
     * @return the Note
     * @since 1.3.1
     */
    @NotNull
    public Note getNote() {
        return this.note;
    }

    /**
     * Overrides the {@link Instrument} to be used.
     * <p>
     * Only works when the note block isn't under a player head.
     * For this specific case the 'note_block_sound' property of the
     * player head state takes the priority.
     *
     * @param instrument the Instrument.
     * @since 1.3.1
     */
    public void setInstrument(@NotNull Instrument instrument) {
        Preconditions.checkArgument(instrument != null, "instrument cannot be null");
        this.instrument = instrument;
    }

    /**
     * Overrides the {@link Note} to be played.
     *
     * @param note the Note.
     * @since 1.3.1
     */
    public void setNote(@NotNull Note note) {
        Preconditions.checkArgument(note != null, "note cannot be null");
        this.note = note;
    }

    /**
     * @since 1.3.1
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * @since 1.3.1
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * @since 1.3.1
     */
    @NotNull
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
