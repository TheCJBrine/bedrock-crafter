package thecjbrine.bedrockcrafter.util;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCTags {

    public static class BCBlockTags {

        private static Tag<Block> createTag(String name) {
            return TagRegistry.block(new Identifier(BedrockCrafter.MODID, name));
        }

        public static final Tag<Block> BEDROCK_LIKE = createTag("bedrock_like");
    }
}
