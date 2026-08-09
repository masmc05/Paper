package io.papermc.paper.world;

import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.NullMarked;

/**
 * @since 1.16.2
 */
@NullMarked
public enum MoonPhase {
    /**
     * @since 1.16.2
     */
    FULL_MOON(0L),
    /**
     * @since 1.16.2
     */
    WANING_GIBBOUS(1L),
    /**
     * @since 1.16.2
     */
    LAST_QUARTER(2L),
    /**
     * @since 1.16.2
     */
    WANING_CRESCENT(3L),
    /**
     * @since 1.16.2
     */
    NEW_MOON(4L),
    /**
     * @since 1.16.2
     */
    WAXING_CRESCENT(5L),
    /**
     * @since 1.16.2
     */
    FIRST_QUARTER(6L),
    /**
     * @since 1.16.2
     */
    WAXING_GIBBOUS(7L);

    private final long day;

    MoonPhase(final long day) {
        this.day = day;
    }

    private static final Map<Long, MoonPhase> BY_DAY = new HashMap<>();

    static {
        for (final MoonPhase phase : values()) {
            BY_DAY.put(phase.day, phase);
        }
    }

    /**
     * @since 1.16.2
     */
    public static MoonPhase getPhase(final long day) {
        return BY_DAY.get(day % 8L);
    }
}
