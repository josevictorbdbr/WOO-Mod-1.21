package josev.woo.datagen;

import josev.woo.block.ModBlocks;
import josev.woo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
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

        List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE,
                ModBlocks.RUBY_DEEPSLATE_ORE);
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100, "ruby");

        List<ItemConvertible> MALACHITE_SMELTABLE = List.of(ModBlocks.MALACHITE_ORE);
        offerSmelting(exporter, MALACHITE_SMELTABLE, RecipeCategory.MISC, ModItems.MALACHITE, 0.25f, 200, "malachite");
        offerBlasting(exporter, MALACHITE_SMELTABLE, RecipeCategory.MISC, ModItems.MALACHITE, 0.25f, 100, "malachite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MALACHITE_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.MALACHITE)
                .criterion(hasItem(ModItems.MALACHITE), conditionsFromItem(ModItems.MALACHITE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MALACHITE, 9)
                .input(ModBlocks.MALACHITE_BLOCK)
                .criterion(hasItem(ModBlocks.MALACHITE_BLOCK), conditionsFromItem(ModBlocks.MALACHITE_BLOCK))
                .offerTo(exporter);
    }
}
