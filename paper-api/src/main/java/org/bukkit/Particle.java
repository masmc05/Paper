package org.bukkit;

import com.google.common.base.Preconditions;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.NotNull;

import static io.papermc.paper.util.BoundChecker.requirePositive;
import static io.papermc.paper.util.BoundChecker.requireRange;

/**
 * @since 1.9.4
 */
public enum Particle implements Keyed {
    /**
     * @since 1.20.6
     */
    POOF("poof"),
    /**
     * @since 1.20.6
     */
    EXPLOSION("explosion"),
    /**
     * @since 1.20.6
     */
    EXPLOSION_EMITTER("explosion_emitter"),
    /**
     * @since 1.20.6
     */
    FIREWORK("firework"),
    /**
     * @since 1.20.6
     */
    BUBBLE("bubble"),
    /**
     * @since 1.20.6
     */
    SPLASH("splash"),
    /**
     * @since 1.20.6
     */
    FISHING("fishing"),
    /**
     * @since 1.20.6
     */
    UNDERWATER("underwater"),
    /**
     * @since 1.9.4
     */
    CRIT("crit"),
    /**
     * @since 1.20.6
     */
    ENCHANTED_HIT("enchanted_hit"),
    /**
     * @since 1.20.6
     */
    SMOKE("smoke"),
    /**
     * @since 1.20.6
     */
    LARGE_SMOKE("large_smoke"),
    /**
     * Uses {@link Spell} as DataType
     *
     * @since 1.20.6
     */
    EFFECT("effect", Spell.class),
    /**
     * Uses {@link Spell} as DataType
     *
     * @since 1.20.6
     */
    INSTANT_EFFECT("instant_effect", Spell.class),
    /**
     * Uses {@link Color} as DataType (with alpha support)
     *
     * @since 1.20.6
     */
    ENTITY_EFFECT("entity_effect", Color.class),
    /**
     * @since 1.20.6
     */
    WITCH("witch"),
    /**
     * @since 1.20.6
     */
    DRIPPING_WATER("dripping_water"),
    /**
     * @since 1.20.6
     */
    DRIPPING_LAVA("dripping_lava"),
    /**
     * @since 1.20.6
     */
    ANGRY_VILLAGER("angry_villager"),
    /**
     * @since 1.20.6
     */
    HAPPY_VILLAGER("happy_villager"),
    /**
     * @since 1.20.6
     */
    MYCELIUM("mycelium"),
    /**
     * @since 1.9.4
     */
    NOTE("note"),
    /**
     * @since 1.9.4
     */
    PORTAL("portal"),
    /**
     * @since 1.20.6
     */
    ENCHANT("enchant"),
    /**
     * @since 1.9.4
     */
    FLAME("flame"),
    /**
     * @since 1.9.4
     */
    LAVA("lava"),
    /**
     * @since 1.9.4
     */
    CLOUD("cloud"),
    /**
     * Uses {@link DustOptions} as DataType
     *
     * @since 1.20.6
     */
    DUST("dust", DustOptions.class),
    /**
     * @since 1.20.6
     */
    ITEM_SNOWBALL("item_snowball"),
    /**
     * @since 1.20.6
     */
    ITEM_SLIME("item_slime"),
    /**
     * @since 1.9.4
     */
    HEART("heart"),
    /**
     * Uses {@link ItemStack} as DataType
     *
     * @since 1.20.6
     */
    ITEM("item", ItemStack.class),
    /**
     * Uses {@link BlockData} as DataType
     *
     * @since 1.20.6
     */
    BLOCK("block", BlockData.class),
    /**
     * @since 1.20.6
     */
    RAIN("rain"),
    /**
     * @since 1.20.6
     */
    ELDER_GUARDIAN("elder_guardian"),
    /**
     * Uses {@link Float} as DataType, for the power of the breath
     *
     * @since 1.9.4
     */
    DRAGON_BREATH("dragon_breath", Float.class),
    /**
     * @since 1.9.4
     */
    END_ROD("end_rod"),
    /**
     * @since 1.9.4
     */
    DAMAGE_INDICATOR("damage_indicator"),
    /**
     * @since 1.9.4
     */
    SWEEP_ATTACK("sweep_attack"),
    /**
     * Uses {@link BlockData} as DataType
     *
     * @since 1.10.2
     */
    FALLING_DUST("falling_dust", BlockData.class),
    /**
     * @since 1.20.6
     */
    TOTEM_OF_UNDYING("totem_of_undying"),
    /**
     * @since 1.11
     */
    SPIT("spit"),
    /**
     * @since 1.13
     */
    SQUID_INK("squid_ink"),
    /**
     * @since 1.13
     */
    BUBBLE_POP("bubble_pop"),
    /**
     * @since 1.13
     */
    CURRENT_DOWN("current_down"),
    /**
     * @since 1.13
     */
    BUBBLE_COLUMN_UP("bubble_column_up"),
    /**
     * @since 1.13
     */
    NAUTILUS("nautilus"),
    /**
     * @since 1.13
     */
    DOLPHIN("dolphin"),
    /**
     * @since 1.14
     */
    SNEEZE("sneeze"),
    /**
     * @since 1.14
     */
    CAMPFIRE_COSY_SMOKE("campfire_cosy_smoke"),
    /**
     * @since 1.14
     */
    CAMPFIRE_SIGNAL_SMOKE("campfire_signal_smoke"),
    /**
     * @since 1.14
     */
    COMPOSTER("composter"),
    /**
     * Uses {@link Color} as DataType
     *
     * @since 1.14
     */
    FLASH("flash", Color.class),
    /**
     * @since 1.14
     */
    FALLING_LAVA("falling_lava"),
    /**
     * @since 1.14
     */
    LANDING_LAVA("landing_lava"),
    /**
     * @since 1.14
     */
    FALLING_WATER("falling_water"),
    /**
     * @since 1.15
     */
    DRIPPING_HONEY("dripping_honey"),
    /**
     * @since 1.15
     */
    FALLING_HONEY("falling_honey"),
    /**
     * @since 1.15
     */
    LANDING_HONEY("landing_honey"),
    /**
     * @since 1.15
     */
    FALLING_NECTAR("falling_nectar"),
    /**
     * @since 1.16.1
     */
    SOUL_FIRE_FLAME("soul_fire_flame"),
    /**
     * @since 1.16.1
     */
    ASH("ash"),
    /**
     * @since 1.16.1
     */
    CRIMSON_SPORE("crimson_spore"),
    /**
     * @since 1.16.1
     */
    WARPED_SPORE("warped_spore"),
    /**
     * @since 1.16.1
     */
    SOUL("soul"),
    /**
     * @since 1.16.1
     */
    DRIPPING_OBSIDIAN_TEAR("dripping_obsidian_tear"),
    /**
     * @since 1.16.1
     */
    FALLING_OBSIDIAN_TEAR("falling_obsidian_tear"),
    /**
     * @since 1.16.1
     */
    LANDING_OBSIDIAN_TEAR("landing_obsidian_tear"),
    /**
     * @since 1.16.1
     */
    REVERSE_PORTAL("reverse_portal"),
    /**
     * @since 1.16.1
     */
    WHITE_ASH("white_ash"),
    /**
     * Uses {@link DustTransition} as DataType
     *
     * @since 1.17
     */
    DUST_COLOR_TRANSITION("dust_color_transition", DustTransition.class),
    /**
     * Uses {@link Vibration} as DataType
     *
     * @since 1.17
     */
    VIBRATION("vibration", Vibration.class),
    /**
     * @since 1.17
     */
    FALLING_SPORE_BLOSSOM("falling_spore_blossom"),
    /**
     * @since 1.17
     */
    SPORE_BLOSSOM_AIR("spore_blossom_air"),
    /**
     * @since 1.17
     */
    SMALL_FLAME("small_flame"),
    /**
     * @since 1.17
     */
    SNOWFLAKE("snowflake"),
    /**
     * @since 1.17
     */
    DRIPPING_DRIPSTONE_LAVA("dripping_dripstone_lava"),
    /**
     * @since 1.17
     */
    FALLING_DRIPSTONE_LAVA("falling_dripstone_lava"),
    /**
     * @since 1.17
     */
    DRIPPING_DRIPSTONE_WATER("dripping_dripstone_water"),
    /**
     * @since 1.17
     */
    FALLING_DRIPSTONE_WATER("falling_dripstone_water"),
    /**
     * @since 1.17
     */
    GLOW_SQUID_INK("glow_squid_ink"),
    /**
     * @since 1.17
     */
    GLOW("glow"),
    /**
     * @since 1.17
     */
    WAX_ON("wax_on"),
    /**
     * @since 1.17
     */
    WAX_OFF("wax_off"),
    /**
     * @since 1.17
     */
    ELECTRIC_SPARK("electric_spark"),
    /**
     * @since 1.17
     */
    SCRAPE("scrape"),
    /**
     * @since 1.19
     */
    SONIC_BOOM("sonic_boom"),
    /**
     * @since 1.19
     */
    SCULK_SOUL("sculk_soul"),
    /**
     * Uses {@link Float} as DataType, the angle in radians
     *
     * @since 1.19
     */
    SCULK_CHARGE("sculk_charge", Float.class),
    /**
     * @since 1.19
     */
    SCULK_CHARGE_POP("sculk_charge_pop"),
    /**
     * Uses {@link Integer} as DataType
     *
     * @since 1.19
     */
    SHRIEK("shriek", Integer.class),
    /**
     * @since 1.20
     */
    CHERRY_LEAVES("cherry_leaves"),
    /**
     * @since 1.21.4
     */
    PALE_OAK_LEAVES("pale_oak_leaves"),
    /**
     * Uses {@link Color} as DataType
     *
     * @since 1.21.6
     */
    TINTED_LEAVES("tinted_leaves", Color.class),
    /**
     * @since 1.20
     */
    EGG_CRACK("egg_crack"),
    /**
     * @since 1.20.4
     */
    DUST_PLUME("dust_plume"),
    /**
     * @since 1.20.4
     */
    WHITE_SMOKE("white_smoke"),
    /**
     * @since 1.20.4
     */
    GUST("gust"),
    /**
     * @since 1.20.6
     */
    SMALL_GUST("small_gust"),
    /**
     * @since 1.20.6
     */
    GUST_EMITTER_LARGE("gust_emitter_large"),
    /**
     * @since 1.20.6
     */
    GUST_EMITTER_SMALL("gust_emitter_small"),
    /**
     * @since 1.20.4
     */
    TRIAL_SPAWNER_DETECTION("trial_spawner_detection"),
    /**
     * @since 1.20.6
     */
    TRIAL_SPAWNER_DETECTION_OMINOUS("trial_spawner_detection_ominous"),
    /**
     * @since 1.20.6
     */
    VAULT_CONNECTION("vault_connection"),
    /**
     * @since 1.20.6
     */
    INFESTED("infested"),
    /**
     * @since 1.20.6
     */
    ITEM_COBWEB("item_cobweb"),
    /**
     * Uses {@link BlockData} as DataType
     *
     * @since 1.20.6
     */
    DUST_PILLAR("dust_pillar", BlockData.class),
    /**
     * Uses {@link BlockData} as DataType
     *
     * @since 1.21.3
     */
    BLOCK_CRUMBLE("block_crumble", BlockData.class),
    /**
     * @since 1.21.6
     */
    FIREFLY("firefly"),
    /**
     * Uses {@link Trail} as DataType
     *
     * @since 1.21.3
     */
    TRAIL("trail", Trail.class),
    /**
     * @since 1.20.6
     */
    OMINOUS_SPAWNING("ominous_spawning"),
    /**
     * @since 1.20.6
     */
    RAID_OMEN("raid_omen"),
    /**
     * @since 1.20.6
     */
    TRIAL_OMEN("trial_omen"),
    /**
     * Uses {@link BlockData} as DataType
     *
     * @since 1.18.1
     */
    BLOCK_MARKER("block_marker", BlockData.class),
    /**
     * @since 1.21.10
     */
    COPPER_FIRE_FLAME("copper_fire_flame"),
    /**
     * @since 26.2
     */
    PAUSE_MOB_GROWTH("pause_mob_growth"),
    /**
     * @since 26.2
     */
    RESET_MOB_GROWTH("reset_mob_growth"),
    /**
     * @since 26.2
     */
    NOXIOUS_GAS("noxious_gas"),
    /**
     * @since 26.2
     */
    NOXIOUS_GAS_CLOUD("noxious_gas_cloud"),
    /**
     * @since 26.2
     */
    SULFUR_CUBE_GOO("sulfur_cube_goo"),
    /**
     * @since 26.2
     */
    SULFUR_BUBBLES("sulfur_bubbles"),
    /**
     * Uses {@link Geyser} as DataType
     *
     * @since 26.2
     */
    GEYSER("geyser", Geyser.class),
    /**
     * Uses {@link GeyserBase} as DataType
     *
     * @since 26.2
     */
    GEYSER_BASE("geyser_base", GeyserBase.class),
    /**
     * Uses {@link Geyser} as DataType
     *
     * @since 26.2
     */
    GEYSER_PLUME("geyser_plume", Geyser.class),
    /**
     * Uses {@link GeyserBase} as DataType
     *
     * @since 26.2
     */
    GEYSER_POOF("geyser_poof", GeyserBase.class),
    ;

    private final NamespacedKey key;
    private final Class<?> dataType;
    // Paper - all particles are registered

    Particle(String key) {
        this(key, Void.class);
    }

    // Paper - all particles are registered

    Particle(String key, /*@NotNull*/ Class<?> data) {
        // Paper - all particles are registered
        if (key != null) {
            this.key = NamespacedKey.minecraft(key);
        } else {
            this.key = null;
        }
        dataType = data;
        // Paper - all particles are registered
    }

    /**
     * Returns the required data type for the particle
     * @return the required data type
     * @since 1.9.4
     */
    @NotNull
    public Class<?> getDataType() {
        return dataType;
    }

    /**
     * @since 1.20.2
     */
    @NotNull
    @Override
    public NamespacedKey getKey() {
        if (key == null) {
            throw new UnsupportedOperationException("Cannot get key from legacy particle");
        }

        return key;
    }

    // Paper start - Particle API expansion
    /**
     * Creates a {@link com.destroystokyo.paper.ParticleBuilder}
     *
     * @return a {@link com.destroystokyo.paper.ParticleBuilder} for the particle
     * @since 1.12.2
     */
    @NotNull
    public com.destroystokyo.paper.ParticleBuilder builder() {
        return new com.destroystokyo.paper.ParticleBuilder(this);
    }
    // Paper end

    /**
     * Options which can be applied to dust particles - a particle
     * color and size.
     *
     * @since 1.13
     */
    public static class DustOptions {

        private final Color color;
        private final float size;

        /**
         * @since 1.13
         */
        public DustOptions(@NotNull Color color, float size) {
            Preconditions.checkArgument(color != null, "color");
            this.color = color;
            this.size = requireRange(size, "size", 0.01F, 4.0F);
        }

        /**
         * The color of the particles to be displayed.
         *
         * @return particle color
         * @since 1.13
         */
        @NotNull
        public Color getColor() {
            return color;
        }

        /**
         * Relative size of the particle.
         *
         * @return relative particle size
         * @since 1.13
         */
        public float getSize() {
            return size;
        }
    }

    /**
     * Options which can be applied to a color transitioning dust particles.
     *
     * @since 1.17
     */
    public static class DustTransition extends DustOptions {

        private final Color toColor;

        /**
         * @since 1.17
         */
        public DustTransition(@NotNull Color fromColor, @NotNull Color toColor, float size) {
            super(fromColor, size);

            Preconditions.checkArgument(toColor != null, "toColor");
            this.toColor = toColor;
        }

        /**
         * The final of the particles to be displayed.
         *
         * @return final particle color
         * @since 1.17
         */
        @NotNull
        public Color getToColor() {
            return toColor;
        }
    }

    /**
     * Options which can be applied to trail particles - a location, color and duration.
     *
     * @since 1.21.4
     */
    public static class Trail {

        private final Location target;
        private final Color color;
        private final int duration;

        /**
         * @since 1.21.4
         */
        public Trail(@NotNull Location target, @NotNull Color color, @Positive int duration) {
            this.target = target;
            this.color = color;
            this.duration = requirePositive(duration, "duration");
        }

        /**
         * The target of the particles to be displayed.
         *
         * @return particle target
         * @since 1.21.4
         */
        @NotNull
        public Location getTarget() {
            return target;
        }

        /**
         * The color of the particles to be displayed.
         *
         * @return particle color
         * @since 1.21.4
         */
        @NotNull
        public Color getColor() {
            return color;
        }

        /**
         * The duration of the trail to be displayed.
         *
         * @return trail duration
         * @since 1.21.4
         */
        public @Positive int getDuration() {
            return duration;
        }
    }

    /**
     * Options which can be applied to effect particles.
     *
     * @since 1.21.10
     */
    public static class Spell {

        private final Color color;
        private final float power;

        /**
         * @since 1.21.10
         */
        public Spell(@NotNull Color color, float power) {
            this.color = color;
            this.power = power;
        }

        /**
         * The color of the particles to be displayed.
         *
         * @return particle color
         * @since 1.21.10
         */
        public @NotNull Color getColor() {
            return color;
        }

        /**
         * The power of the particles to be displayed.
         *
         * @return particle power
         * @since 1.21.10
         */
        public float getPower() {
            return power;
        }
    }

    /**
     * Options which can be applied to geyser base particles.
     *
     * @since 26.2
     */
    public static class GeyserBase extends AbstractGeyser {

        private final float burstImpulse;

        /**
         * @since 26.2
         */
        public GeyserBase(final int waterBlocks, final float burstImpulse) {
            super(waterBlocks);
            this.burstImpulse = burstImpulse;
        }

        /**
         * {@return the burst impulse}
         *
         * @since 26.2
         */
        public float getBurstImpulse() {
            return this.burstImpulse;
        }
    }

    /**
     * Options which can be applied to geyser particles.
     *
     * @since 26.2
     */
    public static class Geyser extends AbstractGeyser {

        /**
         * @since 26.2
         */
        public Geyser(final int waterBlocks) {
            super(waterBlocks);
        }
    }

    private abstract static class AbstractGeyser {

        private final int waterBlocks;

        protected AbstractGeyser(final @Positive int waterBlocks) {
            this.waterBlocks = requirePositive(waterBlocks, "waterBlocks");
        }

        /**
         * The number of water blocks below the geyser
         * which scale the particle size and its burst impulse.
         *
         * @return the number of water blocks
         */
        public @Positive int getWaterBlocks() {
            return waterBlocks;
        }
    }
}
