package josev.woo.datagen;

import josev.woo.block.ModBlocks;
import josev.woo.block.custom.OrpimentLampBlock;
import josev.woo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORPIMENT_BLOCK);
        BlockStateModelGenerator.BlockTexturePool VibraniumPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIBRANIUM_PLANKS);

        VibraniumPlanksPool.stairs(ModBlocks.VIBRANIUM_PLANKS_STAIRS);
        VibraniumPlanksPool.slab(ModBlocks.VIBRANIUM_PLANKS_SLAB);
        VibraniumPlanksPool.fence(ModBlocks.VIBRANIUM_PLANKS_FENCE);
        VibraniumPlanksPool.fenceGate(ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE);
        VibraniumPlanksPool.button(ModBlocks.VIBRANIUM_PLANKS_BUTTON);
        VibraniumPlanksPool.pressurePlate(ModBlocks.VIBRANIUM_PLANKS_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.VIBRANIUM_PLANKS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.VIBRANIUM_PLANKS_TRAPDOOR);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.ORPIMENT_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.ORPIMENT_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.ORPIMENT_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(OrpimentLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.MALACHITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORPIMENT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_BOOTS);

        itemModelGenerator.register(ModItems.GRAPHITE_BAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPHITE_SWORD, Models.HANDHELD);
    }
}
