package josev.woo.block;

import josev.woo.WorldOfOres;
import josev.woo.block.custom.OrpimentLampBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    //RUBY
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RUBY_DEEPSLATE_ORE = registerBlock("ruby_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    //LEAD
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block BLOCK_OF_RAW_LEAD = registerBlock("block_of_raw_lead",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LEAD_DEEPSLATE_ORE = registerBlock("lead_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    //TIN
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block BLOCK_OF_RAW_TIN = registerBlock("block_of_raw_tin",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.STONE)));

    //BRONZE
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    //GRAPHITE
    public static final Block GRAPHITE_BLOCK = registerBlock("graphite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    //MALACHITE
    public static final Block MALACHITE_BLOCK = registerBlock("malachite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block MALACHITE_ORE = registerBlock("malachite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.STONE)));

    //URANIUM
    public static final Block URANIUM_BLOCK = registerBlock("uranium_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.STONE)));

    //ORPIMENT
    public static final Block ORPIMENT_LAMP = registerBlock("orpiment_lamp",
            new OrpimentLampBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .luminance(state -> state.get(OrpimentLampBlock.CLICKED) ? 15 : 0).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORPIMENT_BLOCK = registerBlock("orpiment_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block ORPIMENT_ORE = registerBlock("orpiment_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    //CINNABAR
    public static final Block CINNABAR_BLOCK = registerBlock("cinnabar_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block CINNABAR_ORE = registerBlock("cinnabar_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    //VIBRANIUM PLANKS
    public static final Block VIBRANIUM_PLANKS = registerBlock("vibranium_planks",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block VIBRANIUM_PLANKS_STAIRS = registerBlock("vibranium_planks_stairs",
            new StairsBlock(ModBlocks.VIBRANIUM_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block VIBRANIUM_PLANKS_SLAB = registerBlock("vibranium_planks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block VIBRANIUM_PLANKS_FENCE = registerBlock("vibranium_planks_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block VIBRANIUM_PLANKS_FENCE_GATE = registerBlock("vibranium_planks_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block VIBRANIUM_PLANKS_DOOR = registerBlock("vibranium_planks_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block VIBRANIUM_PLANKS_TRAPDOOR = registerBlock("vibranium_planks_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block VIBRANIUM_PLANKS_BUTTON = registerBlock("vibranium_planks_button",
            new ButtonBlock(BlockSetType.OAK, 2,
                    AbstractBlock.Settings.create().strength(4f).requiresTool().noCollision()));
    public static final Block VIBRANIUM_PLANKS_PRESSURE_PLATE = registerBlock("vibranium_planks_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    //SAND STUFF
    public static final Block COAL_SAND_ORE = registerBlock("coal_sand_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.SUSPICIOUS_SAND)));
    public static final Block COAL_SAND_ORE_RED = registerBlock("coal_sand_ore_red",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.SUSPICIOUS_SAND)));
    //NETHER
    //CROCIDOLITE NETHER
    public static final Block CROCIDOLITE_ORE = registerBlock("crocidolite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CROCIDOLITE_BLOCK = registerBlock("crocidolite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    //END
    //ENDERITE
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(4f).
                    requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block BLOCK_OF_RAW_ENDERITE = registerBlock("block_of_raw_enderite",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerModBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(WorldOfOres.MOD_ID, name), block);
    }

    private static void registerModBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(WorldOfOres.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        WorldOfOres.LOGGER.info("Registering Mod Blocks" + WorldOfOres.MOD_ID);
    }

}
