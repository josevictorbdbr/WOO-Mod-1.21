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

    public static final Item MALACHITE = registerItem("malachite", new Item(new Item.Settings()));

    public static final Item ORPIMENT = registerItem("orpiment", new Item(new Item.Settings()));

    public static final Item URANIUM = registerItem("uranium", new Item(new Item.Settings()));

    //LEAD
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new Item.Settings()));


    //GRAPHITE
    public static final Item GRAPHITE_BAR = registerItem("graphite_bar", new Item(new Item.Settings()));
    public static final Item GRAPHITE_SWORD = registerItem("graphite_sword", new SwordItem(ToolMaterials.STONE,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 1, -2.4f))));

    //RUBY
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
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
    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor", new AnimalArmorItem(
            ModArmorMaterials.RUBY_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));


    //TIN
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));

    public static final Item TIN_SWORD = registerItem("tin_sword", new SwordItem(ModToolMaterials.TIN,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TIN, 3, -2.4f))));
    public static final Item TIN_PICKAXE = registerItem("tin_pickaxe", new PickaxeItem(ModToolMaterials.TIN,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TIN, 1, -2.8f))));
    public static final Item TIN_AXE = registerItem("tin_axe", new AxeItem(ModToolMaterials.TIN,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TIN, 6.0f, -3.1f))));
    public static final Item TIN_SHOVEL = registerItem("tin_shovel", new ShovelItem(ModToolMaterials.TIN,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TIN, 1.5f, -3.0f))));
    public static final Item TIN_HOE = registerItem("tin_hoe", new HoeItem(ModToolMaterials.TIN,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TIN, -1.0f, -2.0f))));
    public static final Item TIN_HELMET = registerItem("tin_helmet", new ArmorItem(ModArmorMaterials.TIN_ARMOR_MATERIAL,
            ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item TIN_CHESTPLATE = registerItem("tin_chestplate", new ArmorItem(ModArmorMaterials.TIN_ARMOR_MATERIAL,
            ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item TIN_LEGGINGS = registerItem("tin_leggings", new ArmorItem(ModArmorMaterials.TIN_ARMOR_MATERIAL,
            ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item TIN_BOOTS = registerItem("tin_boots", new ArmorItem(ModArmorMaterials.TIN_ARMOR_MATERIAL,
            ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));
    public static final Item TIN_HORSE_ARMOR = registerItem("tin_horse_armor", new AnimalArmorItem(
            ModArmorMaterials.TIN_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));


    public static final Item IRON_HAMMER = registerItem("iron_hammer", new HammerItem(ToolMaterials.IRON,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 6, -3.4f))));

    //ENDERITE
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ENDERITE = registerItem("raw_enderite", new Item(new Item.Settings()));

    //CROCIDOLITE
    public static final Item CROCIDOLITE = registerItem("crocidolite", new Item(new Item.Settings()));

    //CINNABAR
    public static final Item CINNABAR = registerItem("cinnabar", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WorldOfOres.MOD_ID, name), item);
    }

    public static void registerModItems(){
        WorldOfOres.LOGGER.info("Registering Mod Items" + WorldOfOres.MOD_ID);

    }

}