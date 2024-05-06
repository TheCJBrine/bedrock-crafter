package thecjbrine.bedrockcrafter.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCTags {

    public static class BCBlockTags {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(new ResourceLocation(BedrockCrafter.MODID, name));
        }

        public static final TagKey<Block> BEDROCK_LIKE = createTag("bedrock_like");
    }
}
