package com.thecjbrine.bedrockcrafter.common.items;

import com.thecjbrine.bedrockcrafter.BedrockCrafter;
import com.thecjbrine.bedrockcrafter.common.blocks.BCBlocks;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_2378;
import net.minecraft.class_2960;

public class BCItems {

    public static final class_1747 COMPACT_DEEPSLATE = new class_1747(BCBlocks.COMPACT_DEEPSLATE, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 D_COMPACT_DEEPSLATE = new class_1747(BCBlocks.D_COMPACT_DEEPSLATE, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 T_COMPACT_DEEPSLATE = new class_1747(BCBlocks.T_COMPACT_DEEPSLATE, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 Q_COMPACT_DEEPSLATE = new class_1747(BCBlocks.Q_COMPACT_DEEPSLATE, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 COMPACT_OBSIDIAN = new class_1747(BCBlocks.COMPACT_OBSIDIAN, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 D_COMPACT_OBSIDIAN = new class_1747(BCBlocks.D_COMPACT_OBSIDIAN, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 T_COMPACT_OBSIDIAN = new class_1747(BCBlocks.T_COMPACT_OBSIDIAN, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 Q_COMPACT_OBSIDIAN = new class_1747(BCBlocks.Q_COMPACT_OBSIDIAN, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 BEDROCK_SLAB = new class_1747(BCBlocks.BEDROCK_SLAB, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 BEDROCK_STAIRS = new class_1747(BCBlocks.BEDROCK_STAIRS, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 BEDROCK_WALL = new class_1747(BCBlocks.BEDROCK_WALL, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 POLISHED_BEDROCK = new class_1747(BCBlocks.POLISHED_BEDROCK, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 P_BEDROCK_SLAB = new class_1747(BCBlocks.P_BEDROCK_SLAB, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 P_BEDROCK_STAIRS = new class_1747(BCBlocks.P_BEDROCK_STAIRS, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 P_BEDROCK_WALL = new class_1747(BCBlocks.P_BEDROCK_WALL, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 P_B_BRICKS = new class_1747(BCBlocks.P_B_BRICKS, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 C_P_B_BRICKS = new class_1747(BCBlocks.C_P_B_BRICKS, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 P_B_BRICK_SLAB = new class_1747(BCBlocks.P_B_BRICK_SLAB, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 P_B_BRICK_STAIRS = new class_1747(BCBlocks.P_B_BRICK_STAIRS, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));
    public static final class_1747 P_B_BRICK_WALL = new class_1747(BCBlocks.P_B_BRICK_WALL, new class_1792.class_1793().method_7892(BedrockCrafter.BEDROCK_GROUP));

    public static void registerItems() {
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "compact_deepslate"), COMPACT_DEEPSLATE);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "double_compact_deepslate"), D_COMPACT_DEEPSLATE);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "triple_compact_deepslate"), T_COMPACT_DEEPSLATE);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "quadruple_compact_deepslate"), Q_COMPACT_DEEPSLATE);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "compact_obsidian"), COMPACT_OBSIDIAN);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "double_compact_obsidian"), D_COMPACT_OBSIDIAN);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "triple_compact_obsidian"), T_COMPACT_OBSIDIAN);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "quadruple_compact_obsidian"), Q_COMPACT_OBSIDIAN);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "bedrock_slab"), BEDROCK_SLAB);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "bedrock_stairs"), BEDROCK_STAIRS);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "bedrock_wall"), BEDROCK_WALL);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock"), POLISHED_BEDROCK);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_slab"), P_BEDROCK_SLAB);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_stairs"), P_BEDROCK_STAIRS);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_wall"), P_BEDROCK_WALL);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_bricks"), P_B_BRICKS);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "chiseled_polished_bedrock_bricks"), C_P_B_BRICKS);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_brick_slab"), P_B_BRICK_SLAB);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_brick_stairs"), P_B_BRICK_STAIRS);
        class_2378.method_10230(class_2378.field_11142, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_brick_wall"), P_B_BRICK_WALL);
    }
}
