package josev.woo.block;

import josev.woo.WorldOfOres;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block MALACHITE_BLOCK = registerBlock("malachite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

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
