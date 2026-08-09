package io.papermc.paper.registry;

import io.papermc.paper.datacomponent.DataComponentType;
import io.papermc.paper.dialog.Dialog;
import io.papermc.paper.entity.poi.PoiType;
import io.papermc.paper.registry.tag.TagKey;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.KeyPattern;
import net.kyori.adventure.key.Keyed;
import org.bukkit.Art;
import org.bukkit.Fluid;
import org.bukkit.GameEvent;
import org.bukkit.GameRule;
import org.bukkit.JukeboxSong;
import org.bukkit.MusicInstrument;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.block.BlockType;
import org.bukkit.block.banner.PatternType;
import org.bukkit.damage.DamageType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Cat;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Frog;
import org.bukkit.entity.Pig;
import org.bukkit.entity.SulfurCube;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.ZombieNautilus;
import org.bukkit.entity.memory.MemoryKey;
import org.bukkit.generator.structure.Structure;
import org.bukkit.generator.structure.StructureType;
import org.bukkit.inventory.ItemType;
import org.bukkit.inventory.MenuType;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;
import org.bukkit.map.MapCursor;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.jspecify.annotations.NullMarked;

import static io.papermc.paper.registry.RegistryKeyImpl.create;

/**
 * Identifier for a specific registry. For use with
 * {@link TypedKey} and the registry modification API.
 * <p>
 * There are 2 types of registries, identified as "built-in"
 * or "data-driven". The former are not changeable by datapacks (which
 * doesn't necessarily mean they aren't changeable in the API) and
 * are loaded first. "Data-driven" registries are all created by
 * reading in data from the vanilla and other datapacks.
 *
 * @param <T> the value type
 * @since 1.20.2
 */
@SuppressWarnings("unused")
@NullMarked
public sealed interface RegistryKey<T> extends Keyed permits RegistryKeyImpl {

    /* ******************* *
     * Built-in Registries *
     * ******************* */
    /**
     * Built-in registry for game events
     * @see io.papermc.paper.registry.keys.GameEventKeys
     * @since 1.20.2
     */
    RegistryKey<GameEvent> GAME_EVENT = create("game_event");
    /**
     * Built-in registry for structure types.
     * @see io.papermc.paper.registry.keys.StructureTypeKeys
     * @since 1.20.2
     */
    RegistryKey<StructureType> STRUCTURE_TYPE = create("worldgen/structure_type");
    /**
     * Built-in registry for potion effect types (mob effects).
     * @see io.papermc.paper.registry.keys.MobEffectKeys
     * @since 1.20.6
     */
    RegistryKey<PotionEffectType> MOB_EFFECT = create("mob_effect");
    /**
     * Built-in registry for block types.
     * @see io.papermc.paper.registry.keys.BlockTypeKeys
     * @since 1.20.6
     */
    RegistryKey<BlockType> BLOCK = create("block");
    /**
     * Built-in registry for item types.
     * @see io.papermc.paper.registry.keys.ItemTypeKeys
     * @since 1.20.6
     */
    RegistryKey<ItemType> ITEM = create("item");
    /**
     * Built-in registry for villager professions.
     * @see io.papermc.paper.registry.keys.VillagerProfessionKeys
     * @since 1.20.6
     */
    RegistryKey<Villager.Profession> VILLAGER_PROFESSION = create("villager_profession");
    /**
     * Built-in registry for poi types.
     * @see io.papermc.paper.registry.keys.PoiTypeKeys
     * @since 26.2
     */
    RegistryKey<PoiType> POINT_OF_INTEREST_TYPE = create("point_of_interest_type");
    /**
     * Built-in registry for villager types.
     * @see io.papermc.paper.registry.keys.VillagerTypeKeys
     * @since 1.20.6
     */
    RegistryKey<Villager.Type> VILLAGER_TYPE = create("villager_type");
    /**
     * Built-in registry for map decoration types.
     * @see io.papermc.paper.registry.keys.MapDecorationTypeKeys
     * @since 1.20.6
     */
    RegistryKey<MapCursor.Type> MAP_DECORATION_TYPE = create("map_decoration_type");
    /**
     * Built-in registry for menu types.
     * @see io.papermc.paper.registry.keys.MenuTypeKeys
     * @since 1.21.1
     */
    RegistryKey<MenuType> MENU = create("menu");
    /**
     * Built-in registry for attributes.
     * @see io.papermc.paper.registry.keys.AttributeKeys
     * @since 1.20.6
     */
    RegistryKey<Attribute> ATTRIBUTE = create("attribute");
    /**
     * Built-in registry for fluids.
     * @see io.papermc.paper.registry.keys.FluidKeys
     * @since 1.20.6
     */
    RegistryKey<Fluid> FLUID = create("fluid");
    /**
     * Built-in registry for sound events.
     * @see io.papermc.paper.registry.keys.SoundEventKeys
     * @since 1.20.6
     */
    RegistryKey<Sound> SOUND_EVENT = create("sound_event");
    /**
     * Built-in registry for data component types.
     * @see io.papermc.paper.registry.keys.DataComponentTypeKeys
     * @since 1.21.3
     */
    RegistryKey<DataComponentType> DATA_COMPONENT_TYPE = create("data_component_type");
    /**
     * Built-in registry for game rules.
     * @see io.papermc.paper.registry.keys.GameRuleKeys
     * @since 1.21.11
     */
    RegistryKey<GameRule<?>> GAME_RULE = create("game_rule");

    /* ********************** *
     * Data-driven Registries *
     * ********************** */
    /**
     * Data-driven registry for biomes.
     * @see io.papermc.paper.registry.keys.BiomeKeys
     * @since 1.20.2
     */
    RegistryKey<Biome> BIOME = create("worldgen/biome");
    /**
     * Data-driven registry for structures.
     * @see io.papermc.paper.registry.keys.StructureKeys
     * @since 1.20.4
     */
    RegistryKey<Structure> STRUCTURE = create("worldgen/structure");
    /**
     * Data-driven registry for trim materials.
     * @see io.papermc.paper.registry.keys.TrimMaterialKeys
     * @since 1.20.2
     */
    RegistryKey<TrimMaterial> TRIM_MATERIAL = create("trim_material");
    /**
     * Data-driven registry for trim patterns.
     * @see io.papermc.paper.registry.keys.TrimPatternKeys
     * @since 1.20.2
     */
    RegistryKey<TrimPattern> TRIM_PATTERN = create("trim_pattern");
    /**
     * Data-driven registry for damage types.
     * @see io.papermc.paper.registry.keys.DamageTypeKeys
     * @since 1.20.6
     */
    RegistryKey<DamageType> DAMAGE_TYPE = create("damage_type");
    /**
     * Data-driven registry for wolf variants.
     * @see io.papermc.paper.registry.keys.WolfVariantKeys
     * @since 1.20.6
     */
    RegistryKey<Wolf.Variant> WOLF_VARIANT = create("wolf_variant");
    /**
     * Data-driven registry for wolf sound variants.
     * @see io.papermc.paper.registry.keys.WolfSoundVariantKeys
     * @since 1.21.6
     */
    RegistryKey<Wolf.SoundVariant> WOLF_SOUND_VARIANT = create("wolf_sound_variant");
    /**
     * Data-driven registry for enchantments.
     * @see io.papermc.paper.registry.keys.EnchantmentKeys
     * @since 1.20.6
     */
    RegistryKey<Enchantment> ENCHANTMENT = create("enchantment");
    /**
     * Data-driven registry for jukebox songs.
     * @see io.papermc.paper.registry.keys.JukeboxSongKeys
     * @since 1.21
     */
    RegistryKey<JukeboxSong> JUKEBOX_SONG = create("jukebox_song");
    /**
     * Data-driven registry for banner patterns.
     * @see io.papermc.paper.registry.keys.BannerPatternKeys
     * @since 1.20.6
     */
    RegistryKey<PatternType> BANNER_PATTERN = create("banner_pattern");
    /**
     * Data-driven registry for painting variants.
     * @see io.papermc.paper.registry.keys.PaintingVariantKeys
     * @since 1.20.6
     */
    RegistryKey<Art> PAINTING_VARIANT = create("painting_variant");
    /**
     * Data-driven registry for instruments.
     * @see io.papermc.paper.registry.keys.InstrumentKeys
     * @since 1.20.6
     */
    RegistryKey<MusicInstrument> INSTRUMENT = create("instrument");
    /**
     * Data-driven registry for cat variants.
     * @see io.papermc.paper.registry.keys.CatVariantKeys
     * @since 1.20.6
     */
    RegistryKey<Cat.Type> CAT_VARIANT = create("cat_variant");
    /**
     * Data-driven registry for cat sound variants.
     * @see io.papermc.paper.registry.keys.CatSoundVariantKeys
     * @since 26.2
     */
    RegistryKey<Cat.SoundVariant> CAT_SOUND_VARIANT = create("cat_sound_variant");
    /**
     * Data-driven registry for frog variants.
     * @see io.papermc.paper.registry.keys.FrogVariantKeys
     * @since 1.20.6
     */
    RegistryKey<Frog.Variant> FROG_VARIANT = create("frog_variant");
    /**
     * Data-driven registry for chicken variants.
     * @see io.papermc.paper.registry.keys.ChickenVariantKeys
     * @since 1.21.6
     */
    RegistryKey<Chicken.Variant> CHICKEN_VARIANT = create("chicken_variant");
    /**
     * Data-driven registry for chicken sound variants.
     * @see io.papermc.paper.registry.keys.ChickenSoundVariantKeys
     * @since 26.2
     */
    RegistryKey<Chicken.SoundVariant> CHICKEN_SOUND_VARIANT = create("chicken_sound_variant");
    /**
     * Data-driven registry for cow variants.
     * @see io.papermc.paper.registry.keys.CowVariantKeys
     * @since 1.21.6
     */
    RegistryKey<Cow.Variant> COW_VARIANT = create("cow_variant");
    /**
     * Data-driven registry for cow sound variants.
     * @see io.papermc.paper.registry.keys.CowSoundVariantKeys
     * @since 26.2
     */
    RegistryKey<Cow.SoundVariant> COW_SOUND_VARIANT = create("cow_sound_variant");
    /**
     * Data-driven registry for pig variants.
     * @see io.papermc.paper.registry.keys.PigVariantKeys
     * @since 1.21.6
     */
    RegistryKey<Pig.Variant> PIG_VARIANT = create("pig_variant");
    /**
     * Data-driven registry for pig sound variants.
     * @see io.papermc.paper.registry.keys.PigSoundVariantKeys
     * @since 26.2
     */
    RegistryKey<Pig.SoundVariant> PIG_SOUND_VARIANT = create("pig_sound_variant");
    /**
     * Data-driven registry for zombie nautilus variants.
     * @see io.papermc.paper.registry.keys.ZombieNautilusVariantKeys
     * @since 1.21.11
     */
    RegistryKey<ZombieNautilus.Variant> ZOMBIE_NAUTILUS_VARIANT = create("zombie_nautilus_variant");
    /**
     * Data-driven registry for sulfur cube archetypes.
     * @see io.papermc.paper.registry.keys.SulfurCubeArchetypeKeys
     * @since 26.2
     */
    RegistryKey<SulfurCube.Archetype> SULFUR_CUBE_ARCHETYPE = create("sulfur_cube_archetype");
    /**
     * Data-driven registry for dialogs.
     * @see io.papermc.paper.registry.keys.DialogKeys
     * @since 1.21.7
     */
    RegistryKey<Dialog> DIALOG = create("dialog");


    /**
     * @since 1.20.6
     */
    /* ******************* *
     * API-only Registries *
     * ******************* */
    RegistryKey<EntityType> ENTITY_TYPE = create("entity_type");
    /**
     * @since 1.20.6
     */
    RegistryKey<Particle> PARTICLE_TYPE = create("particle_type");
    /**
     * @since 1.20.6
     */
    RegistryKey<PotionType> POTION = create("potion");
    /**
     * @since 1.20.6
     */
    RegistryKey<MemoryKey<?>> MEMORY_MODULE_TYPE = create("memory_module_type");

    /**
     * Constructs a new {@link TypedKey} for this registry given the typed key's key.
     *
     * @param key the key of the typed key.
     * @return the constructed typed key.
     * @since 1.21.4
     */
    default TypedKey<T> typedKey(final Key key) {
        return TypedKey.create(this, key);
    }

    /**
     * Constructs a new {@link TypedKey} for this registry given the typed key's key.
     *
     * @param key the string representation of the key that will be passed to {@link Key#key(String)}.
     * @return the constructed typed key.
     * @since 1.21.4
     */
    default TypedKey<T> typedKey(@KeyPattern final String key) {
        return TypedKey.create(this, key);
    }

    /**
     * Constructs a new {@link TagKey} for this registry given the tag key's key.
     *
     * @param key the key of the typed key.
     * @return the constructed tag key.
     * @since 1.21.4
     */
    default TagKey<T> tagKey(final Key key) {
        return TagKey.create(this, key);
    }

    /**
     * Constructs a new {@link TagKey} for this registry given the tag key's key.
     *
     * @param key the string representation of the key that will be passed to {@link Key#key(String)}.
     * @return the constructed tag key.
     * @since 1.21.4
     */
    default TagKey<T> tagKey(@KeyPattern final String key) {
        return TagKey.create(this, key);
    }
}
