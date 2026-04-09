package josev.woo.datagen;

import josev.woo.block.ModBlocks;
import josev.woo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.ShapelessRecipe;
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

        //RUBY
        List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE,
                ModBlocks.RUBY_DEEPSLATE_ORE);
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_AXE)
                .pattern("RR ")
                .pattern("RS ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HOE)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HAMMER)
                .pattern("RRR")
                .pattern("RSR")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);

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
    }
}
