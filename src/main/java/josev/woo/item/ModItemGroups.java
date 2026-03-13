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
    public static final ItemGroup  ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(WorldOfOres.MOD_ID, "world-of-ores"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.RUBY)).displayName(Text.translatable("itemgroup.world-of-ores.itens"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.MALACHITE);
                        entries.add(ModBlocks.MALACHITE_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        WorldOfOres.LOGGER.info("Registering ModItemGroups");
    }
}
