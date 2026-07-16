package josev.woo.item;

import josev.woo.WorldOfOres;
import josev.woo.item.custom.HammerItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;

public class ModItems {

    //MALACHITE
    public static final Item MALACHITE = registerItem("malachite", new Item(new Item.Settings()));

    //ORPIMENT
    public static final Item ORPIMENT = registerItem("orpiment", new Item(new Item.Settings()));

    //URANIUM
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
    public static final Item RUBY_HAMMER = registerItem("ruby_hammer", new HammerItem(ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 8, -3.4f))));

    //TIN
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));

    //OTHER
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new HammerItem(ToolMaterials.IRON,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 6, -3.4f))));

    //ENDERITE
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ENDERITE = registerItem("raw_enderite", new Item(new Item.Settings()));

    //CROCIDOLITE
    public static final Item CROCIDOLITE = registerItem("crocidolite", new Item(new Item.Settings()));

    //CINNABAR
    public static final Item CINNABAR = registerItem("cinnabar", new Item(new Item.Settings()));

    //ORE KITS
    public static class EquipmentKit {
        public final String materialName;
        public final Item sword;
        public final Item pickaxe;
        public final Item axe;
        public final Item shovel;
        public final Item hoe;
        public final Item helmet;
        public final Item chestplate;
        public final Item leggings;
        public final Item boots;

        public EquipmentKit(String name, ToolMaterial toolMat, RegistryEntry<ArmorMaterial> armorMat,
                            float swordDamage, int armorDurabilityMultiplier) {
            this.materialName = name;

            this.sword = registerItem(name + "_sword", new SwordItem(toolMat,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(toolMat, (int) swordDamage, -2.4f))));
            this.pickaxe = registerItem(name + "_pickaxe", new PickaxeItem(toolMat,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(toolMat, 1.0F, -2.8F))));
            this.axe = registerItem(name + "_axe", new AxeItem(toolMat,
                    new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(toolMat, 6.0F, -3.0F))));
            this.shovel = registerItem(name + "_shovel", new ShovelItem(toolMat,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(toolMat, 1.5F, -3.0F))));
            this.hoe = registerItem(name + "_hoe", new HoeItem(toolMat,
                    new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(toolMat, 0.0F, -3.0F))));

            this.helmet = registerItem(name + "_helmet", new ArmorItem(armorMat, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(armorDurabilityMultiplier))));
            this.chestplate = registerItem(name + "_chestplate", new ArmorItem(armorMat, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(armorDurabilityMultiplier))));
            this.leggings = registerItem(name + "_leggings", new ArmorItem(armorMat, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(armorDurabilityMultiplier))));
            this.boots = registerItem(name + "_boots", new ArmorItem(armorMat, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(armorDurabilityMultiplier))));
        }
    }

    //KITS
    public static final EquipmentKit RUBY_KIT = new EquipmentKit(
            "ruby",
            ModToolMaterials.RUBY,
            ModArmorMaterials.RUBY_ARMOR_MATERIAL,
            3.0f,
            33
    );

    public static final EquipmentKit TIN_KIT = new EquipmentKit(
            "tin",
            ModToolMaterials.TIN,
            ModArmorMaterials.TIN_ARMOR_MATERIAL,
            1.0f,
            15
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WorldOfOres.MOD_ID, name), item);
    }

    public static void registerModItems(){
        WorldOfOres.LOGGER.info("Registering Mod Items" + WorldOfOres.MOD_ID);
    }
}