package josev.woo.datagen;

import josev.woo.block.ModBlocks;
import josev.woo.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        //Pickaxe Tags
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ORPIMENT_BLOCK)
                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.URANIUM_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE)
                .add(ModBlocks.MALACHITE_BLOCK)
                .add(ModBlocks.MALACHITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ORPIMENT_BLOCK)
                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.URANIUM_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MALACHITE_BLOCK)
                .add(ModBlocks.MALACHITE_ORE);

        //Axe Tags
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.VIBRANIUM_PLANKS)
                .add(ModBlocks.VIBRANIUM_PLANKS_STAIRS)
                .add(ModBlocks.VIBRANIUM_PLANKS_SLAB)
                .add(ModBlocks.VIBRANIUM_PLANKS_FENCE)
                .add(ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE)
                .add(ModBlocks.VIBRANIUM_PLANKS_DOOR)
                .add(ModBlocks.VIBRANIUM_PLANKS_TRAPDOOR)
                .add(ModBlocks.VIBRANIUM_PLANKS_BUTTON)
                .add(ModBlocks.VIBRANIUM_PLANKS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.VIBRANIUM_PLANKS_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE);

        getOrCreateTagBuilder(ModTags.Blocks.NEED_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

    }
}
