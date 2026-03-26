package josev.woo.datagen;

import josev.woo.block.ModBlocks;
import josev.woo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        //Drops itself
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.MALACHITE_BLOCK);
        addDrop(ModBlocks.VIBRANIUM_PLANKS);
        addDrop(ModBlocks.VIBRANIUM_PLANKS_STAIRS);
        addDrop(ModBlocks.VIBRANIUM_PLANKS_SLAB, slabDrops(ModBlocks.VIBRANIUM_PLANKS_SLAB));
        addDrop(ModBlocks.VIBRANIUM_PLANKS_FENCE);
        addDrop(ModBlocks.VIBRANIUM_PLANKS_FENCE_GATE);
        addDrop(ModBlocks.VIBRANIUM_PLANKS_DOOR, doorDrops(ModBlocks.VIBRANIUM_PLANKS_DOOR));
        addDrop(ModBlocks.VIBRANIUM_PLANKS_TRAPDOOR);
        addDrop(ModBlocks.VIBRANIUM_PLANKS_BUTTON);
        addDrop(ModBlocks.VIBRANIUM_PLANKS_PRESSURE_PLATE);
        addDropWithSilkTouch(ModBlocks.ORPIMENT_LAMP);

        //Ores like
        addDrop(ModBlocks.RUBY_ORE, multipleOreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY, 1, 2));
        addDrop(ModBlocks.RUBY_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.RUBY_DEEPSLATE_ORE, ModItems.RUBY, 1, 2));
        addDrop(ModBlocks.MALACHITE_ORE, multipleOreDrops(ModBlocks.MALACHITE_ORE, ModItems.MALACHITE, 2, 3));


    }


    //Method to make ore drops
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

}
