package thecjbrine.bedrockcrafter.util;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCTags {

    public static class BCBlockTags {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BedrockCrafter.MODID, name));
        }

        public static final TagKey<Block> BEDROCK_LIKE = createTag("bedrock_like");
    }
}
