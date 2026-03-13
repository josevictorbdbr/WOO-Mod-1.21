package josev.woo.item;

import josev.woo.WorldOfOres;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item MALACHITE = registerItem("malachite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WorldOfOres.MOD_ID, name), item);
    }

    public static void registerModItems(){
        WorldOfOres.LOGGER.info("Registering Mod Items" + WorldOfOres.MOD_ID);

    }

}