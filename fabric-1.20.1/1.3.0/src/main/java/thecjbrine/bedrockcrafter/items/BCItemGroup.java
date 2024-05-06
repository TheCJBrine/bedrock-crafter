package thecjbrine.bedrockcrafter.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;

public class BCItemGroup {
    // Item Groups
    public static ItemGroup BEDROCK_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BedrockCrafter.MODID, "bedrock_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup." + BedrockCrafter.MODID + ".bedrocktab"))
                    .icon(() -> new ItemStack(BCItems.BEDROCK_CHUNK))
                    .entries((displayContext, entries) -> {
                        entries.add(BCBlocks.COMPACT_DEEPSLATE);
                        entries.add(BCBlocks.COMPACT_OBSIDIAN);
                        entries.add(BCBlocks.BEDROCK_SLAB);
                        entries.add(BCBlocks.BEDROCK_STAIRS);
                        entries.add(BCBlocks.BEDROCK_WALL);
                        entries.add(BCBlocks.POLISHED_BEDROCK);
                        entries.add(BCBlocks.P_BEDROCK_SLAB);
                        entries.add(BCBlocks.P_BEDROCK_STAIRS);
                        entries.add(BCBlocks.P_BEDROCK_WALL);
                        entries.add(BCBlocks.P_B_BRICKS);
                        entries.add(BCBlocks.C_P_B_BRICKS);
                        entries.add(BCBlocks.P_B_BRICK_SLAB);
                        entries.add(BCBlocks.P_B_BRICK_STAIRS);
                        entries.add(BCBlocks.P_B_BRICK_WALL);
                        entries.add(BCBlocks.BEDROCK_DOOR);
                        entries.add(BCBlocks.BEDROCK_TRAPDOOR);
                        entries.add(BCBlocks.BEDROCK_GLASS);
                        entries.add(BCBlocks.BEDROCK_GLASS_PANE);
                        entries.add(BCBlocks.BEDROCK_LAMP);

                        entries.add(BCItems.BEDROCK_CHUNK);
                        entries.add(BCItems.BEDROCK_PICKAXE);
                    }).build());

    // Registry
    public static void registerItemGroups() {
        BedrockCrafter.LOGGER.info("Registering itemgroups for " + BedrockCrafter.MODID);
    }
}
