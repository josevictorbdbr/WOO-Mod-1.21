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
    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(WorldOfOres.MOD_ID, "world-of-ores"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY)).displayName(Text.translatable("itemgroup.world-of-ores.itens"))
                    .entries((displayContext, entries) -> {

                        //RUBY
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_DEEPSLATE_ORE);
                        addKitToGroup(entries, ModItems.RUBY_KIT);

                        //BRONZE
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        addKitToGroup(entries, ModItems.BRONZE_KIT);

                        //MALACHITE
                        entries.add(ModItems.MALACHITE);
                        entries.add(ModBlocks.MALACHITE_BLOCK);
                        entries.add(ModBlocks.MALACHITE_ORE);

                        //TIN
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.BLOCK_OF_RAW_TIN);
                        entries.add(ModBlocks.TIN_ORE);
                        addKitToGroup(entries, ModItems.TIN_KIT);

                        //LEAD
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.LEAD_NUGGET);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.LEAD_DEEPSLATE_ORE);
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.BLOCK_OF_RAW_LEAD);
                        addKitToGroup(entries, ModItems.LEAD_KIT);

                        //GRAPHITE
                        entries.add(ModItems.GRAPHITE_BAR);
                        entries.add(ModItems.GRAPHITE_SWORD);

                        //COAL SAND
                        entries.add(ModBlocks.COAL_SAND_ORE);
                        entries.add(ModBlocks.COAL_SAND_ORE_RED);

                        //URANIUM
                        entries.add(ModItems.URANIUM);
                        entries.add(ModBlocks.URANIUM_BLOCK);
                        entries.add(ModBlocks.URANIUM_ORE);

                        //OTHER
                        entries.add(ModItems.IRON_HAMMER);

                        //ORPIMENT
                        entries.add(ModBlocks.ORPIMENT_BLOCK);
                        entries.add(ModBlocks.ORPIMENT_ORE);
                        entries.add(ModBlocks.ORPIMENT_LAMP);
                        entries.add(ModItems.ORPIMENT);

                        //CINNABAR
                        entries.add(ModBlocks.CINNABAR_BLOCK);
                        entries.add(ModBlocks.CINNABAR_ORE);
                        entries.add(ModItems.CINNABAR);

                        //VIBRANIUM PLANKS
                        entries.add(ModBlocks.VIBRANIUM_PLANKS);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_STAIRS);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_SLAB);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_FENCE);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_DOOR);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_TRAPDOOR);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_BUTTON);
                        entries.add(ModBlocks.VIBRANIUM_PLANKS_PRESSURE_PLATE);

                        //CROCIDOLITE
                        entries.add(ModBlocks.CROCIDOLITE_ORE);
                        entries.add(ModBlocks.CROCIDOLITE_BLOCK);
                        entries.add(ModItems.CROCIDOLITE);

                        //ENDERITE
                        entries.add(ModBlocks.ENDERITE_ORE);
                        entries.add(ModItems.ENDERITE_INGOT);
                        entries.add(ModBlocks.ENDERITE_BLOCK);
                        entries.add(ModItems.RAW_ENDERITE);

                    }).build());

    //ADDS KITS TO GROUP
    private static void addKitToGroup(ItemGroup.Entries entries, ModItems.EquipmentKit kit) {
        entries.add(kit.sword);
        entries.add(kit.pickaxe);
        entries.add(kit.axe);
        entries.add(kit.shovel);
        entries.add(kit.hoe);
        entries.add(kit.helmet);
        entries.add(kit.chestplate);
        entries.add(kit.leggings);
        entries.add(kit.boots);
    }

    public static void registerItemGroups() {
        WorldOfOres.LOGGER.info("Registering Item Groups for " + WorldOfOres.MOD_ID);
    }
}