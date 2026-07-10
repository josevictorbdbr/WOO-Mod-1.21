package josev.woo.world;

import josev.woo.WorldOfOres;
import josev.woo.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAND_COAL_KEY = registerKey("coal_sand_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MALACHITE_ORE_KEY = registerKey("malachite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CROCIDOLITE_ORE_KEY = registerKey("crocidolite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDERITE_ORE_KEY = registerKey("enderite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORPIMENT_ORE_KEY = registerKey("orpiment_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest soulSandReplaceables = new TagMatchRuleTest(BlockTags.SOUL_SPEED_BLOCKS);
        RuleTest sandReplaceables = new BlockMatchRuleTest(Blocks.SAND);
        RuleTest sandRedReplaceables = new BlockMatchRuleTest(Blocks.RED_SAND);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);


        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RUBY_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldLeadOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.LEAD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.LEAD_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> desertSandCoalOres =
                List.of(OreFeatureConfig.createTarget(sandReplaceables, ModBlocks.COAL_SAND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(sandRedReplaceables, ModBlocks.COAL_SAND_ORE_RED.getDefaultState()));

        List<OreFeatureConfig.Target> overworldMalachiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MALACHITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldOrpimentOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ORPIMENT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherCrocidoliteOres =
                List.of(OreFeatureConfig.createTarget(soulSandReplaceables, ModBlocks.CROCIDOLITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endEnderiteOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ENDERITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTinOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TIN_ORE.getDefaultState()));

        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 6));
        register(context, MALACHITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMalachiteOres, 8));
        register(context, SAND_COAL_KEY, Feature.ORE, new OreFeatureConfig(desertSandCoalOres, 3));
        register(context, CROCIDOLITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCrocidoliteOres, 5));
        register(context, ENDERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endEnderiteOres, 6));
        register(context, LEAD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLeadOres, 8));
        register(context, ORPIMENT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOrpimentOres, 6));
        register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(WorldOfOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}