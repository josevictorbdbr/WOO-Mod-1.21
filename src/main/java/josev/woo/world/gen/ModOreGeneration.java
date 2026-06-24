package josev.woo.world.gen;

import josev.woo.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.RUBY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.LEAD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BEACH, BiomeKeys.SNOWY_BEACH),
                    GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.SAND_COAL_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ORPIMENT_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS,
                        BiomeKeys.SNOWY_BEACH, BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_TAIGA,
                            BiomeKeys.FROZEN_PEAKS, BiomeKeys.FROZEN_OCEAN, BiomeKeys.FROZEN_RIVER, BiomeKeys.DEEP_FROZEN_OCEAN),
                                 GenerationStep.Feature.UNDERGROUND_ORES,
                                        ModPlacedFeatures.MALACHITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_CROCIDOLITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_ENDERITE_PLACED_KEY);
    }
}
