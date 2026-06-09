package josev.woo.world;

import josev.woo.WorldOfOres;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RUBY_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> MALACHITE_PLACED_KEY = registerKey("malachite_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_CROCIDOLITE_PLACED_KEY = registerKey("nether_crocidolite_ore_placed");
    public static final RegistryKey<PlacedFeature> END_ENDERITE_PLACED_KEY = registerKey("end_enderite_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RUBY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(10))));

        register(context, MALACHITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MALACHITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-5), YOffset.fixed(40))));

        register(context, NETHER_CROCIDOLITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CROCIDOLITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(80))));

        register(context, END_ENDERITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(80))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(WorldOfOres.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
