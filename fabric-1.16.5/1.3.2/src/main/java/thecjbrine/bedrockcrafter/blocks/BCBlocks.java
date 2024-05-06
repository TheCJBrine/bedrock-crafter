package thecjbrine.bedrockcrafter.blocks;

import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.custom.*;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCBlocks {

    public static final Block COMPACT_STONE = registerBlock("compact_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE)
            .strength(3.5f, 10f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool()),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block COMPACT_OBSIDIAN = registerBlock("compact_obsidian", new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
            .strength(60f, 1400f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()),
            BedrockCrafter.BEDROCK_GROUP);

    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block BEDROCK_STAIRS = registerBlock("bedrock_stairs", new BCStairsBlock(Blocks.BEDROCK.getDefaultState(),
            FabricBlockSettings.copy(Blocks.BEDROCK)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block POLISHED_BEDROCK = registerBlock("polished_bedrock", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_BEDROCK_SLAB = registerBlock("polished_bedrock_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_BEDROCK_STAIRS = registerBlock("polished_bedrock_stairs", new BCStairsBlock(Blocks.BEDROCK.getDefaultState(),
            FabricBlockSettings.copy(Blocks.BEDROCK)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_BEDROCK_WALL = registerBlock("polished_bedrock_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);

    public static final Block P_B_BRICKS = registerBlock("polished_bedrock_bricks", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block C_P_B_BRICKS = registerBlock("chiseled_polished_bedrock_bricks", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_SLAB = registerBlock("polished_bedrock_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_STAIRS = registerBlock("polished_bedrock_brick_stairs", new BCStairsBlock(Blocks.BEDROCK.getDefaultState(),
            FabricBlockSettings.copy(Blocks.BEDROCK)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_WALL = registerBlock("polished_bedrock_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);

    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door", new BCDoorBlock(FabricBlockSettings.copy(Blocks.BEDROCK).nonOpaque()),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", new BCTrapdoorBlock(FabricBlockSettings.copy(Blocks.BEDROCK)
            .nonOpaque()), BedrockCrafter.BEDROCK_GROUP);

    public static final Block BEDROCK_GLASS = registerBlock("bedrock_glass", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)
            .strength(-1F, 3600000F)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block BEDROCK_GLASS_PANE = registerBlock("bedrock_glass_pane", new BCPaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE)
            .strength(-1F, 3600000F)), BedrockCrafter.BEDROCK_GROUP);

    public static final Block BEDROCK_LAMP = registerBlock("bedrock_lamp", new BCLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
            .strength(-1F, 3600000F)), BedrockCrafter.BEDROCK_GROUP);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MODID, name), new BlockItem(block,
                new FabricItemSettings().group(group)));
    }

    public static void registerBCBlocks() {
        BedrockCrafter.LOGGER.info("Registering blocks for " + BedrockCrafter.MODID);
    }
}
