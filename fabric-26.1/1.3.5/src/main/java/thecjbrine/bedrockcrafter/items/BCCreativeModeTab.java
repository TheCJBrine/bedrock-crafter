package thecjbrine.bedrockcrafter.items;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;

public class BCCreativeModeTab {
    // Item Groups
    public static final ResourceKey<CreativeModeTab> BEDROCK_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
            Identifier.fromNamespaceAndPath(BedrockCrafter.MODID, "bedrock_tab"));
    public static final CreativeModeTab BEDROCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, BEDROCK_TAB_KEY,
            FabricCreativeModeTab.builder().title(Component.translatable("creativeTab." + BedrockCrafter.MODID + ".bedrocktab"))
                    .icon(() -> new ItemStack(BCItems.BEDROCK_CHUNK))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(BCBlocks.COMPACT_DEEPSLATE);
                        output.accept(BCBlocks.COMPACT_OBSIDIAN);
                        output.accept(Blocks.BEDROCK);
                        output.accept(BCBlocks.BEDROCK_SLAB);
                        output.accept(BCBlocks.BEDROCK_STAIRS);
                        output.accept(BCBlocks.BEDROCK_WALL);
                        output.accept(BCBlocks.POLISHED_BEDROCK);
                        output.accept(BCBlocks.P_BEDROCK_SLAB);
                        output.accept(BCBlocks.P_BEDROCK_STAIRS);
                        output.accept(BCBlocks.P_BEDROCK_WALL);
                        output.accept(BCBlocks.P_B_BRICKS);
                        output.accept(BCBlocks.C_P_B_BRICKS);
                        output.accept(BCBlocks.P_B_BRICK_SLAB);
                        output.accept(BCBlocks.P_B_BRICK_STAIRS);
                        output.accept(BCBlocks.P_B_BRICK_WALL);
                        output.accept(BCBlocks.BEDROCK_DOOR);
                        output.accept(BCBlocks.BEDROCK_TRAPDOOR);
                        output.accept(BCBlocks.BEDROCK_GLASS);
                        output.accept(BCBlocks.BEDROCK_GLASS_PANE);
                        output.accept(BCBlocks.BEDROCK_LAMP);

                        output.accept(BCItems.BEDROCK_CHUNK);
                        output.accept(BCItems.BEDROCK_PICKAXE);
                    })).build());

    // Registry
    public static void registerCreativeModeTabs() {
        BedrockCrafter.LOGGER.info("Registering itemgroups for " + BedrockCrafter.MODID);
    }
}
