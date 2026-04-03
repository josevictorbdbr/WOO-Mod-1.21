package josev.woo.util;

import josev.woo.WorldOfOres;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEED_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(WorldOfOres.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> LEAD_FACTORY_FUEL = createTag("lead_factory_fuel");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(WorldOfOres.MOD_ID, name));
        }
    }
}