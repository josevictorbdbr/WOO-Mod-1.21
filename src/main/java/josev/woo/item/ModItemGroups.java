package josev.woo.item;

import josev.woo.WorldOfOres;
import josev.woo.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup  ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(WorldOfOres.MOD_ID, "world-of-ores"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.RUBY)).displayName(Text.translatable("itemgroup.world-of-ores.itens"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_DEEPSLATE_ORE);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.MALACHITE);
                        entries.add(ModBlocks.MALACHITE_BLOCK);
                        entries.add(ModBlocks.MALACHITE_ORE);
                        entries.add(ModItems.URANIUM);
                        entries.add(ModBlocks.ORPIMENT_LAMP);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_STAIRS);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_SLAB);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_FENCE);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_DOOR);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_TRAPDOOR);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_BUTTON);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_PRESSURE_PLATE);
                    }).build());

    public static void registerItemGroups() {
        WorldOfOres.LOGGER.info("Registering ModItemGroups");
    }
}
