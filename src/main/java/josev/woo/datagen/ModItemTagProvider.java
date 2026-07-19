package josev.woo.datagen;

import josev.woo.item.ModItems;
import josev.woo.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //KIT REGISTRY
        registerKitTags(ModItems.RUBY_KIT);
        registerKitTags(ModItems.TIN_KIT);
        registerKitTags(ModItems.BRONZE_KIT);
        registerKitTags(ModItems.LEAD_KIT);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RUBY)
                .add(ModItems.TIN_INGOT)
                .add(ModItems.LEAD_INGOT)
                .add(ModItems.BRONZE_INGOT);

        //OTHER RANDOM TOOLS
        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.GRAPHITE_SWORD);

        //LEADFACTORYFUEL
        getOrCreateTagBuilder(ModTags.Items.LEAD_FACTORY_FUEL)
                .add(ModItems.URANIUM);

    }

    //PUT ALL KIT TOOLS AT CORRECT TAGS
    private void registerKitTags(ModItems.EquipmentKit kit) {
        getOrCreateTagBuilder(ItemTags.SWORDS).add(kit.sword);
        getOrCreateTagBuilder(ItemTags.AXES).add(kit.axe);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(kit.shovel);
        getOrCreateTagBuilder(ItemTags.HOES).add(kit.hoe);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(kit.helmet)
                .add(kit.chestplate)
                .add(kit.leggings)
                .add(kit.boots);
    }
}
