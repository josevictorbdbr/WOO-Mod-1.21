package josev.woo.datagen;

import josev.woo.block.ModBlocks;
import josev.woo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MALACHITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MALACHITE_ORE);
        BlockStateModelGenerator.BlockTexturePool VibraniumPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIBRANIUM_PLANKS);

        VibraniumPlanksPool.stairs(ModBlocks.VIBRANIUM_PLANKS_STAIRS);
        VibraniumPlanksPool.slab(ModBlocks.VIBRANIUM_PLANKS_SLAB);
        VibraniumPlanksPool.fence(ModBlocks.VIBRANIUM_PLANKS_FENCE);
        VibraniumPlanksPool.fenceGate(ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE);
        VibraniumPlanksPool.button(ModBlocks.VIBRANIUM_PLANKS_BUTTON);
        VibraniumPlanksPool.pressurePlate(ModBlocks.VIBRANIUM_PLANKS_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.VIBRANIUM_PLANKS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.VIBRANIUM_PLANKS_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MALACHITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM, Models.GENERATED);
    }
}
