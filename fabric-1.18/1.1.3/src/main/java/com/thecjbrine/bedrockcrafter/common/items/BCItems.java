package com.thecjbrine.bedrockcrafter.common.items;

import com.thecjbrine.bedrockcrafter.BedrockCrafter;
import com.thecjbrine.bedrockcrafter.common.blocks.BCBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCItems {

    public static final BlockItem COMPACT_DEEPSLATE = new BlockItem(BCBlocks.COMPACT_DEEPSLATE, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem D_COMPACT_DEEPSLATE = new BlockItem(BCBlocks.D_COMPACT_DEEPSLATE, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem T_COMPACT_DEEPSLATE = new BlockItem(BCBlocks.T_COMPACT_DEEPSLATE, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem Q_COMPACT_DEEPSLATE = new BlockItem(BCBlocks.Q_COMPACT_DEEPSLATE, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem COMPACT_OBSIDIAN = new BlockItem(BCBlocks.COMPACT_OBSIDIAN, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem D_COMPACT_OBSIDIAN = new BlockItem(BCBlocks.D_COMPACT_OBSIDIAN, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem T_COMPACT_OBSIDIAN = new BlockItem(BCBlocks.T_COMPACT_OBSIDIAN, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem Q_COMPACT_OBSIDIAN = new BlockItem(BCBlocks.Q_COMPACT_OBSIDIAN, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem BEDROCK_SLAB = new BlockItem(BCBlocks.BEDROCK_SLAB, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem BEDROCK_STAIRS = new BlockItem(BCBlocks.BEDROCK_STAIRS, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem BEDROCK_WALL = new BlockItem(BCBlocks.BEDROCK_WALL, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem POLISHED_BEDROCK = new BlockItem(BCBlocks.POLISHED_BEDROCK, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem P_BEDROCK_SLAB = new BlockItem(BCBlocks.P_BEDROCK_SLAB, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem P_BEDROCK_STAIRS = new BlockItem(BCBlocks.P_BEDROCK_STAIRS, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem P_BEDROCK_WALL = new BlockItem(BCBlocks.P_BEDROCK_WALL, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem P_B_BRICKS = new BlockItem(BCBlocks.P_B_BRICKS, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem C_P_B_BRICKS = new BlockItem(BCBlocks.C_P_B_BRICKS, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem P_B_BRICK_SLAB = new BlockItem(BCBlocks.P_B_BRICK_SLAB, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem P_B_BRICK_STAIRS = new BlockItem(BCBlocks.P_B_BRICK_STAIRS, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static final BlockItem P_B_BRICK_WALL = new BlockItem(BCBlocks.P_B_BRICK_WALL, new Item.Settings().group(BedrockCrafter.BEDROCK_GROUP));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "compact_deepslate"), COMPACT_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "double_compact_deepslate"), D_COMPACT_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "triple_compact_deepslate"), T_COMPACT_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "quadruple_compact_deepslate"), Q_COMPACT_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "compact_obsidian"), COMPACT_OBSIDIAN);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "double_compact_obsidian"), D_COMPACT_OBSIDIAN);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "triple_compact_obsidian"), T_COMPACT_OBSIDIAN);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "quadruple_compact_obsidian"), Q_COMPACT_OBSIDIAN);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "bedrock_slab"), BEDROCK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "bedrock_stairs"), BEDROCK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "bedrock_wall"), BEDROCK_WALL);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock"), POLISHED_BEDROCK);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_slab"), P_BEDROCK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_stairs"), P_BEDROCK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_wall"), P_BEDROCK_WALL);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_bricks"), P_B_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "chiseled_polished_bedrock_bricks"), C_P_B_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_brick_slab"), P_B_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_brick_stairs"), P_B_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MOD_ID, "polished_bedrock_brick_wall"), P_B_BRICK_WALL);
    }
}
