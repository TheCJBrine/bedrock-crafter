package thecjbrine.bedrockcrafter.items.custom.tools;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import thecjbrine.bedrockcrafter.util.BCTags;

public class BCToolTiers {
    public static final Tier BEDROCK = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1796, 8F, 0F, 10,
            () -> Ingredient.of(BCTags.BCItemTags.BEDROCK_TOOL_MATERIALS));
}
