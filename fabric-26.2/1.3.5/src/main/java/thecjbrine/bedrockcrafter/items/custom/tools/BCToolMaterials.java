package thecjbrine.bedrockcrafter.items.custom.tools;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import thecjbrine.bedrockcrafter.util.BCTags;

public record BCToolMaterials() {
    public static final ToolMaterial BEDROCK = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1796, 8F, 0F, 10, BCTags.BCItemTags.BEDROCK_TOOL_MATERIALS);
}
