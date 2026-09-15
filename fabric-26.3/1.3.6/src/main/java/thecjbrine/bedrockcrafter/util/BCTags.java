package thecjbrine.bedrockcrafter.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCTags {

    public static class BCBlockTags {

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BedrockCrafter.MODID, name));
        }

        public static final TagKey<Block> BEDROCK_LIKE = createTag("bedrock_like");
    }

    public static class BCItemTags {
        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BedrockCrafter.MODID, name));
        }

        public static final TagKey<Item> BEDROCK_TOOL_MATERIALS = createTag("bedrock_tool_materials");
    }
}
