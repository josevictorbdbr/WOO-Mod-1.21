package josev.woo.datagen;

import josev.woo.block.ModBlocks;
import josev.woo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //OTHER
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_HAMMER)
                .pattern("III")
                .pattern("ISI")
                .pattern(" S ")
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        //RUBY
        List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE,
                ModBlocks.RUBY_DEEPSLATE_ORE);
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100, "ruby");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);

        offerKitRecipes(exporter, ModItems.RUBY_KIT, ModItems.RUBY);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HAMMER)
                .pattern("III")
                .pattern("ISI")
                .pattern(" S ")
                .input('I', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);


        //GRAPHITE
        List<ItemConvertible> GRAPHITE_SMELTABLE = List.of(Items.COAL, Blocks.COAL_BLOCK);
        offerSmelting(exporter, GRAPHITE_SMELTABLE, RecipeCategory.MISC, ModItems.GRAPHITE_BAR, 0.25f, 200, "graphite_bar");
        offerBlasting(exporter, GRAPHITE_SMELTABLE, RecipeCategory.MISC, ModItems.GRAPHITE_BAR, 0.25f, 100, "graphite_bar");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GRAPHITE_BAR, RecipeCategory.DECORATIONS, ModBlocks.GRAPHITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GRAPHITE_SWORD)
                .pattern(" G ")
                .pattern(" G ")
                .pattern(" S ")
                .input('G', ModItems.GRAPHITE_BAR)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GRAPHITE_BAR), conditionsFromItem(ModItems.GRAPHITE_BAR))
                .offerTo(exporter);

        //ORPIMENT
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ORPIMENT, RecipeCategory.DECORATIONS, ModBlocks.ORPIMENT_BLOCK);
        List<ItemConvertible> ORPIMENT_SMELTABLE = List.of(ModBlocks.ORPIMENT_ORE);
        offerSmelting(exporter, ORPIMENT_SMELTABLE, RecipeCategory.MISC, ModItems.ORPIMENT, 0.25f, 200, "orpiment");
        offerBlasting(exporter, ORPIMENT_SMELTABLE, RecipeCategory.MISC, ModItems.ORPIMENT, 0.25f, 100, "orpiment");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ORPIMENT_LAMP)
                .pattern("OOO")
                .pattern("ORO")
                .pattern("OOO")
                .input('O', ModItems.ORPIMENT)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.ORPIMENT), conditionsFromItem(ModItems.ORPIMENT))
                .offerTo(exporter);

        //CINNABAR
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CINNABAR, RecipeCategory.DECORATIONS, ModBlocks.CINNABAR_BLOCK);
        List<ItemConvertible> CINNABAR_SMELTABLE = List.of(ModBlocks.CINNABAR_ORE);
        offerSmelting(exporter, CINNABAR_SMELTABLE, RecipeCategory.MISC, ModItems.CINNABAR, 0.25f, 200, "cinnabar");
        offerBlasting(exporter, CINNABAR_SMELTABLE, RecipeCategory.MISC, ModItems.CINNABAR, 0.25f, 100, "cinnabar");

        //MALACHITE
        List<ItemConvertible> MALACHITE_SMELTABLE = List.of(ModBlocks.MALACHITE_ORE);
        offerSmelting(exporter, MALACHITE_SMELTABLE, RecipeCategory.MISC, ModItems.MALACHITE, 0.25f, 200, "malachite");
        offerBlasting(exporter, MALACHITE_SMELTABLE, RecipeCategory.MISC, ModItems.MALACHITE, 0.25f, 100, "malachite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MALACHITE, RecipeCategory.DECORATIONS, ModBlocks.MALACHITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.TOTEM_OF_UNDYING)
                .pattern("GGG")
                .pattern("MGM")
                .pattern(" G ")
                .input('M', ModBlocks.MALACHITE_BLOCK)
                .input('G', Items.GOLD_INGOT)
                .criterion(hasItem(ModBlocks.MALACHITE_BLOCK), conditionsFromItem(ModBlocks.MALACHITE_BLOCK))
                .offerTo(exporter);

        //URANIUM
        List<ItemConvertible> URANIUM_SMELTABLE = List.of(ModBlocks.URANIUM_ORE);
        offerSmelting(exporter, URANIUM_SMELTABLE, RecipeCategory.MISC, ModItems.URANIUM, 0.25f, 200, "uranium");
        offerBlasting(exporter, URANIUM_SMELTABLE, RecipeCategory.MISC, ModItems.URANIUM, 0.25f, 100, "uranium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.URANIUM, RecipeCategory.DECORATIONS, ModBlocks.URANIUM_BLOCK);

        //VIBRANIUM
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANIUM_PLANKS_SLAB, 6)
                .pattern("VVV")
                .input('V', ModBlocks.VIBRANIUM_PLANKS)
                .criterion(hasItem(ModBlocks.VIBRANIUM_PLANKS), conditionsFromItem(ModBlocks.VIBRANIUM_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANIUM_PLANKS_STAIRS, 4)
                .pattern("V  ")
                .pattern("VV ")
                .pattern("VVV")
                .input('V', ModBlocks.VIBRANIUM_PLANKS)
                .criterion(hasItem(ModBlocks.VIBRANIUM_PLANKS), conditionsFromItem(ModBlocks.VIBRANIUM_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANIUM_PLANKS_FENCE, 3)
                .pattern("VSV")
                .pattern("VSV")
                .input('V', ModBlocks.VIBRANIUM_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.VIBRANIUM_PLANKS), conditionsFromItem(ModBlocks.VIBRANIUM_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE)
                .pattern("SVS")
                .pattern("SVS")
                .input('V', ModBlocks.VIBRANIUM_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.VIBRANIUM_PLANKS), conditionsFromItem(ModBlocks.VIBRANIUM_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANIUM_PLANKS_DOOR, 3)
                .pattern("VV ")
                .pattern("VV ")
                .pattern("VV ")
                .input('V', ModBlocks.VIBRANIUM_PLANKS)
                .criterion(hasItem(ModBlocks.VIBRANIUM_PLANKS), conditionsFromItem(ModBlocks.VIBRANIUM_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANIUM_PLANKS_TRAPDOOR, 2)
                .pattern("VVV")
                .pattern("VVV")
                .input('V', ModBlocks.VIBRANIUM_PLANKS)
                .criterion(hasItem(ModBlocks.VIBRANIUM_PLANKS), conditionsFromItem(ModBlocks.VIBRANIUM_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANIUM_PLANKS_PRESSURE_PLATE)
                .pattern("VV ")
                .input('V', ModBlocks.VIBRANIUM_PLANKS)
                .criterion(hasItem(ModBlocks.VIBRANIUM_PLANKS), conditionsFromItem(ModBlocks.VIBRANIUM_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIBRANIUM_PLANKS_BUTTON)
                .input(ModBlocks.VIBRANIUM_PLANKS)
                .criterion(hasItem(ModBlocks.VIBRANIUM_PLANKS), conditionsFromItem(ModBlocks.VIBRANIUM_PLANKS))
                .offerTo(exporter);

        //ENDERITE
        List<ItemConvertible> ENDERITE_SMELTABLE = List.of(ModBlocks.ENDERITE_ORE,
                ModItems.RAW_ENDERITE);
        offerSmelting(exporter, ENDERITE_SMELTABLE, RecipeCategory.MISC, ModItems.ENDERITE_INGOT, 0.25f, 200, "enderite");
        offerBlasting(exporter, ENDERITE_SMELTABLE, RecipeCategory.MISC, ModItems.ENDERITE_INGOT, 0.25f, 100, "enderite");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ENDERITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ENDERITE, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_ENDERITE);

        //LEAD
        List<ItemConvertible> LEAD_SMELTABLE = List.of(ModBlocks.LEAD_ORE,
                ModItems.RAW_LEAD, ModBlocks.LEAD_DEEPSLATE_ORE);
        offerSmelting(exporter, LEAD_SMELTABLE, RecipeCategory.MISC, ModItems.LEAD_INGOT, 0.25f, 200, "lead");
        offerBlasting(exporter, LEAD_SMELTABLE, RecipeCategory.MISC, ModItems.LEAD_INGOT, 0.25f, 100, "lead");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LEAD_INGOT, RecipeCategory.DECORATIONS, ModBlocks.LEAD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_LEAD, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_LEAD);
        // offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.LEAD_NUGGET, RecipeCategory.MISC, ModItems.LEAD_INGOT);

        //TIN
        List<ItemConvertible> TIN_SMELTABLE = List.of(ModBlocks.TIN_ORE, ModItems.RAW_TIN);
        offerSmelting(exporter, TIN_SMELTABLE, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f, 200, "tin");
        offerBlasting(exporter, TIN_SMELTABLE, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f, 100, "tin");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_TIN);

        offerKitRecipes(exporter, ModItems.TIN_KIT, ModItems.TIN_INGOT);

        //CROCIDOLITE
        List<ItemConvertible> CROCIDOLITE_SMELTABLE = List.of(ModBlocks.CROCIDOLITE_ORE);
        offerSmelting(exporter, CROCIDOLITE_SMELTABLE, RecipeCategory.MISC, ModItems.CROCIDOLITE, 0.25f, 200, "crocidolite");
        offerBlasting(exporter, CROCIDOLITE_SMELTABLE, RecipeCategory.MISC, ModItems.CROCIDOLITE, 0.25f, 100, "crocidolite");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CROCIDOLITE, RecipeCategory.DECORATIONS, ModBlocks.CROCIDOLITE_BLOCK);
    }



    //-----------------------------------------------------------------------------------------------------------------------------
    //ORE KIT RECIPE CREATOR
    private static void offerKitRecipes(RecipeExporter exporter, ModItems.EquipmentKit kit, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, kit.sword)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', material)
                .input('#', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, kit.pickaxe)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', material)
                .input('#', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, kit.axe)
                .pattern("XX ")
                .pattern("X# ")
                .pattern(" # ")
                .input('X', material)
                .input('#', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, kit.shovel)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', material)
                .input('#', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, kit.hoe)
                .pattern("XX ")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', material)
                .input('#', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, kit.helmet)
                .pattern("XXX")
                .pattern("X X")
                .input('X', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, kit.chestplate)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, kit.leggings)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, kit.boots)
                .pattern("X X")
                .pattern("X X")
                .input('X', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }
}