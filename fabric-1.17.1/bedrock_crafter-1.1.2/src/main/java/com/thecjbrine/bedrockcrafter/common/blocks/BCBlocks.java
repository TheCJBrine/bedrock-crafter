package com.thecjbrine.bedrockcrafter.common.blocks;

import com.thecjbrine.bedrockcrafter.BedrockCrafter;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCBlocks {

    public static final Block COMPACT_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE).strength(4f, 7f).sounds(BlockSoundGroup.DEEPSLATE)
    .requiresTool());
    public static final Block D_COMPACT_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE).strength(5f, 8f).sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool());
    public static final Block T_COMPACT_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE).strength(6f, 9f).sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool());
    public static final Block Q_COMPACT_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE).strength(7f, 10f).sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool());
    public static final Block COMPACT_OBSIDIAN = new Block(FabricBlockSettings.of(Material.STONE).strength(51f, 1201f).sounds(BlockSoundGroup.STONE)
            .requiresTool());
    public static final Block D_COMPACT_OBSIDIAN = new Block(FabricBlockSettings.of(Material.STONE).strength(52f, 1202f).sounds(BlockSoundGroup.STONE)
            .requiresTool());
    public static final Block T_COMPACT_OBSIDIAN = new Block(FabricBlockSettings.of(Material.STONE).strength(53f, 1203f).sounds(BlockSoundGroup.STONE)
            .requiresTool());
    public static final Block Q_COMPACT_OBSIDIAN = new Block(FabricBlockSettings.of(Material.STONE).strength(54f, 1204f).sounds(BlockSoundGroup.STONE)
            .requiresTool());
    public static final SlabBlock BEDROCK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final StairsBlock BEDROCK_STAIRS = new BCStairsBlock(Blocks.STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final WallBlock BEDROCK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final Block POLISHED_BEDROCK = new Block(FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final SlabBlock P_BEDROCK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final StairsBlock P_BEDROCK_STAIRS = new BCStairsBlock(Blocks.STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final WallBlock P_BEDROCK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final Block P_B_BRICKS = new Block(FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final Block C_P_B_BRICKS = new Block(FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final SlabBlock P_B_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final StairsBlock P_B_BRICK_STAIRS = new BCStairsBlock(Blocks.BEDROCK.getDefaultState(), FabricBlockSettings.copy(Blocks.BEDROCK));
    public static final WallBlock P_B_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "compact_deepslate"), COMPACT_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "double_compact_deepslate"), D_COMPACT_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "triple_compact_deepslate"), T_COMPACT_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "quadruple_compact_deepslate"), Q_COMPACT_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "compact_obsidian"), COMPACT_OBSIDIAN);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "double_compact_obsidian"), D_COMPACT_OBSIDIAN);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "triple_compact_obsidian"), T_COMPACT_OBSIDIAN);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "quadruple_compact_obsidian"), Q_COMPACT_OBSIDIAN);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "bedrock_slab"), BEDROCK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "bedrock_stairs"), BEDROCK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "bedrock_wall"), BEDROCK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock"), POLISHED_BEDROCK);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_slab"), P_BEDROCK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_stairs"), P_BEDROCK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_wall"), P_BEDROCK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_bricks"), P_B_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "chiseled_polished_bedrock_bricks"), C_P_B_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_brick_slab"), P_B_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_brick_stairs"), P_B_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_brick_wall"), P_B_BRICK_WALL);
    }
}
