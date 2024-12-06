package thecjbrine.bedrockcrafter.items.custom.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import thecjbrine.bedrockcrafter.util.BCTags;

public record BCToolMaterials() {

    /*
     * i = durability (int)
     * f = attack speed (float)
     * g = attack damage bonus (float)
     * j = enchantment value (int)
     */

    public static final ToolMaterial BEDROCK = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1796, 8F, 0F, 10, BCTags.BCItemTags.BEDROCK_TOOL_MATERIALS);
}
