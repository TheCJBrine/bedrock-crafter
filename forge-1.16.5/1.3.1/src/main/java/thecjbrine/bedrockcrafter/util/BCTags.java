package thecjbrine.bedrockcrafter.util;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCTags {

    public static class BCBlockTags {

        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(BedrockCrafter.MODID, name));
        }

        public static final Tags.IOptionalNamedTag<Block> BEDROCK_LIKE = createTag("bedrock_like");
    }
}
