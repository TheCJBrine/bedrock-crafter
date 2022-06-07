package net.thecjbrine.bedrockcrafter.blocks;

import net.thecjbrine.bedrockcrafter.BedrockCrafter;
import net.thecjbrine.bedrockcrafter.blocks.custom.BCStairsBlock;
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

    // Blocks
    public static final Block COMPACT_DEEPSLATE = registerBlock("compact_deepslate", new Block(FabricBlockSettings.of(Material.STONE)
            .strength(5f, 10f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()), BedrockCrafter.BEDROCK_GROUP);
    public static final Block COMPACT_OBSIDIAN = registerBlock("compact_obsidian", new Block(FabricBlockSettings.of(Material.STONE)
            .strength(60f, 1400f).sounds(BlockSoundGroup.STONE).requiresTool()), BedrockCrafter.BEDROCK_GROUP);

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
    public static final Block P_BEDROCK_STAIRS = registerBlock("polished_bedrock_stairs", new BCStairsBlock(POLISHED_BEDROCK.getDefaultState(),
            FabricBlockSettings.copy(Blocks.BEDROCK)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_BEDROCK_WALL = registerBlock("polished_bedrock_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);

    public static final Block P_B_BRICKS = registerBlock("polished_bedrock_bricks", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block C_P_B_BRICKS = registerBlock("chiseled_polished_bedrock_bricks", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_SLAB = registerBlock("polished_bedrock_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_STAIRS = registerBlock("polished_bedrock_brick_stairs", new BCStairsBlock(P_B_BRICKS.getDefaultState(),
            FabricBlockSettings.copy(Blocks.BEDROCK)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_WALL = registerBlock("polished_bedrock_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);

    // Registry
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
