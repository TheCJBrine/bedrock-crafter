package thecjbrine.bedrockcrafter.util;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCTags {

    public static class BCBlockTags {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(BedrockCrafter.MODID, name));
        }

        public static final TagKey<Block> BEDROCK_LIKE = createTag("bedrock_like");
    }
}
