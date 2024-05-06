package thecjbrine.bedrockcrafter.items.custom.tools;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import thecjbrine.bedrockcrafter.items.BCItems;

public class BCTiers {

    public static final ForgeTier BEDROCK = new ForgeTier(3, 1796, 8F, 0F,
            10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(BCItems.BEDROCK_CHUNK.get()));
}
