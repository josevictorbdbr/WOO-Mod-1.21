package josev.woo.item;

import josev.woo.WorldOfOres;
import josev.woo.item.custom.HammerItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item MALACHITE = registerItem("malachite", new Item(new Item.Settings()));

    public static final Item URANIUM = registerItem("uranium", new Item(new Item.Settings()));

    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 3, -2.4f))));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 1, -2.8f))));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 5, -3.0f))));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 1.5f, -3.0f))));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, -3, -0f))));
    public static final Item RUBY_HAMMER = registerItem("ruby_hammer", new HammerItem(ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 7, -3.4f))));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL,
            ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL,
            ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL,
            ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL,
            ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WorldOfOres.MOD_ID, name), item);
    }

    public static void registerModItems(){
        WorldOfOres.LOGGER.info("Registering Mod Items" + WorldOfOres.MOD_ID);

    }

}