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
                .add(ModBlocks.ORPIMENT_ORE)

                .add(ModBlocks.CINNABAR_BLOCK)
                .add(ModBlocks.CINNABAR_ORE)

                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.URANIUM_ORE)

                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.LEAD_DEEPSLATE_ORE)
                .add(ModBlocks.BLOCK_OF_RAW_LEAD)
                .add(ModBlocks.LEAD_BLOCK)

                .add(ModBlocks.GRAPHITE_BLOCK)

                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE)

                .add(ModBlocks.MALACHITE_BLOCK)
                .add(ModBlocks.MALACHITE_ORE)

                .add(ModBlocks.ENDERITE_ORE)
                .add(ModBlocks.ENDERITE_BLOCK)
                .add(ModBlocks.BLOCK_OF_RAW_ENDERITE)

                .add(ModBlocks.CROCIDOLITE_ORE)
                .add(ModBlocks.CROCIDOLITE_BLOCK)

                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.BLOCK_OF_RAW_TIN);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.LEAD_DEEPSLATE_ORE)
                .add(ModBlocks.GRAPHITE_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.BLOCK_OF_RAW_TIN)
                .add(ModBlocks.BLOCK_OF_RAW_LEAD)
                .add(ModBlocks.LEAD_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ORPIMENT_BLOCK)
                .add(ModBlocks.ORPIMENT_ORE)
                .add(ModBlocks.CINNABAR_BLOCK)
                .add(ModBlocks.CINNABAR_ORE)
                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.URANIUM_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENDERITE_ORE)
                .add(ModBlocks.BLOCK_OF_RAW_ENDERITE)
                .add(ModBlocks.ENDERITE_BLOCK)
                .add(ModBlocks.CROCIDOLITE_ORE)
                .add(ModBlocks.CROCIDOLITE_BLOCK)
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

        //Shovel Tags
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.COAL_SAND_ORE)
                .add(ModBlocks.COAL_SAND_ORE_RED);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.VIBRANIUM_PLANKS_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE);

        getOrCreateTagBuilder(ModTags.Blocks.NEED_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEED_TIN_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEED_BRONZE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

    }
}
