package io.papermc.paper.registry.event;

import io.papermc.paper.dialog.Dialog;
import io.papermc.paper.registry.RegistryKey;
import io.papermc.paper.registry.data.BannerPatternRegistryEntry;
import io.papermc.paper.registry.data.CatTypeRegistryEntry;
import io.papermc.paper.registry.data.ChickenVariantRegistryEntry;
import io.papermc.paper.registry.data.CowVariantRegistryEntry;
import io.papermc.paper.registry.data.DamageTypeRegistryEntry;
import io.papermc.paper.registry.data.EnchantmentRegistryEntry;
import io.papermc.paper.registry.data.FrogVariantRegistryEntry;
import io.papermc.paper.registry.data.GameEventRegistryEntry;
import io.papermc.paper.registry.data.InstrumentRegistryEntry;
import io.papermc.paper.registry.data.JukeboxSongRegistryEntry;
import io.papermc.paper.registry.data.PaintingVariantRegistryEntry;
import io.papermc.paper.registry.data.PigVariantRegistryEntry;
import io.papermc.paper.registry.data.SulfurCubeArchetypeRegistryEntry;
import io.papermc.paper.registry.data.TrimMaterialRegistryEntry;
import io.papermc.paper.registry.data.TrimPatternRegistryEntry;
import io.papermc.paper.registry.data.WolfVariantRegistryEntry;
import io.papermc.paper.registry.data.ZombieNautilusVariantRegistryEntry;
import io.papermc.paper.registry.data.dialog.DialogRegistryEntry;
import org.bukkit.Art;
import org.bukkit.GameEvent;
import org.bukkit.JukeboxSong;
import org.bukkit.MusicInstrument;
import org.bukkit.block.banner.PatternType;
import org.bukkit.damage.DamageType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Cat;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Frog;
import org.bukkit.entity.Pig;
import org.bukkit.entity.SulfurCube;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.ZombieNautilus;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

import static io.papermc.paper.registry.event.RegistryEventProviderImpl.create;

/**
 * Holds providers for {@link RegistryEntryAddEvent} and {@link RegistryComposeEvent}
 * handlers for each applicable registry.
 *
 * @since 1.21
 */
public final class RegistryEvents {

    /**
     * @since 1.21
     */
    // Start generate - RegistryEvents
    public static final RegistryEventProvider<GameEvent, GameEventRegistryEntry.Builder> GAME_EVENT = create(RegistryKey.GAME_EVENT);
    /**
     * @since 26.2
     */
    public static final RegistryEventProvider<TrimMaterial, TrimMaterialRegistryEntry.Builder> TRIM_MATERIAL = create(RegistryKey.TRIM_MATERIAL);
    /**
     * @since 26.2
     */
    public static final RegistryEventProvider<TrimPattern, TrimPatternRegistryEntry.Builder> TRIM_PATTERN = create(RegistryKey.TRIM_PATTERN);
    /**
     * @since 1.21.4
     */
    public static final RegistryEventProvider<DamageType, DamageTypeRegistryEntry.Builder> DAMAGE_TYPE = create(RegistryKey.DAMAGE_TYPE);
    /**
     * @since 1.21.6
     */
    public static final RegistryEventProvider<Wolf.Variant, WolfVariantRegistryEntry.Builder> WOLF_VARIANT = create(RegistryKey.WOLF_VARIANT);
    /**
     * @since 1.21
     */
    public static final RegistryEventProvider<Enchantment, EnchantmentRegistryEntry.Builder> ENCHANTMENT = create(RegistryKey.ENCHANTMENT);
    /**
     * @since 1.21.6
     */
    public static final RegistryEventProvider<JukeboxSong, JukeboxSongRegistryEntry.Builder> JUKEBOX_SONG = create(RegistryKey.JUKEBOX_SONG);
    /**
     * @since 1.21.4
     */
    public static final RegistryEventProvider<PatternType, BannerPatternRegistryEntry.Builder> BANNER_PATTERN = create(RegistryKey.BANNER_PATTERN);
    /**
     * @since 1.21.3
     */
    public static final RegistryEventProvider<Art, PaintingVariantRegistryEntry.Builder> PAINTING_VARIANT = create(RegistryKey.PAINTING_VARIANT);
    /**
     * @since 1.21.7
     */
    public static final RegistryEventProvider<MusicInstrument, InstrumentRegistryEntry.Builder> INSTRUMENT = create(RegistryKey.INSTRUMENT);
    /**
     * @since 1.21.6
     */
    public static final RegistryEventProvider<Cat.Type, CatTypeRegistryEntry.Builder> CAT_VARIANT = create(RegistryKey.CAT_VARIANT);
    /**
     * @since 1.21.6
     */
    public static final RegistryEventProvider<Frog.Variant, FrogVariantRegistryEntry.Builder> FROG_VARIANT = create(RegistryKey.FROG_VARIANT);
    /**
     * @since 1.21.6
     */
    public static final RegistryEventProvider<Chicken.Variant, ChickenVariantRegistryEntry.Builder> CHICKEN_VARIANT = create(RegistryKey.CHICKEN_VARIANT);
    /**
     * @since 1.21.6
     */
    public static final RegistryEventProvider<Cow.Variant, CowVariantRegistryEntry.Builder> COW_VARIANT = create(RegistryKey.COW_VARIANT);
    /**
     * @since 1.21.6
     */
    public static final RegistryEventProvider<Pig.Variant, PigVariantRegistryEntry.Builder> PIG_VARIANT = create(RegistryKey.PIG_VARIANT);
    /**
     * @since 1.21.11
     */
    public static final RegistryEventProvider<ZombieNautilus.Variant, ZombieNautilusVariantRegistryEntry.Builder> ZOMBIE_NAUTILUS_VARIANT = create(RegistryKey.ZOMBIE_NAUTILUS_VARIANT);
    /**
     * @since 26.2
     */
    public static final RegistryEventProvider<SulfurCube.Archetype, SulfurCubeArchetypeRegistryEntry.Builder> SULFUR_CUBE_ARCHETYPE = create(RegistryKey.SULFUR_CUBE_ARCHETYPE);
    /**
     * @since 1.21.7
     */
    public static final RegistryEventProvider<Dialog, DialogRegistryEntry.Builder> DIALOG = create(RegistryKey.DIALOG);
    // End generate - RegistryEvents

    private RegistryEvents() {
    }
}
