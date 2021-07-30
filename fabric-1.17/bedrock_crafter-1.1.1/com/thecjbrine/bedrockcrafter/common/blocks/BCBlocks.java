package com.thecjbrine.bedrockcrafter.common.blocks;

import com.thecjbrine.bedrockcrafter.BedrockCrafter;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2378;
import net.minecraft.class_2482;
import net.minecraft.class_2498;
import net.minecraft.class_2510;
import net.minecraft.class_2544;
import net.minecraft.class_2960;
import net.minecraft.class_3614;

public class BCBlocks {

    public static final class_2248 COMPACT_DEEPSLATE = new class_2248(FabricBlockSettings.method_9637(class_3614.field_15914).method_9629(4f, 7f).method_9626(class_2498.field_29033)
    .method_29292());
    public static final class_2248 D_COMPACT_DEEPSLATE = new class_2248(FabricBlockSettings.method_9637(class_3614.field_15914).method_9629(5f, 8f).method_9626(class_2498.field_29033)
            .method_29292());
    public static final class_2248 T_COMPACT_DEEPSLATE = new class_2248(FabricBlockSettings.method_9637(class_3614.field_15914).method_9629(6f, 9f).method_9626(class_2498.field_29033)
            .method_29292());
    public static final class_2248 Q_COMPACT_DEEPSLATE = new class_2248(FabricBlockSettings.method_9637(class_3614.field_15914).method_9629(7f, 10f).method_9626(class_2498.field_29033)
            .method_29292());
    public static final class_2248 COMPACT_OBSIDIAN = new class_2248(FabricBlockSettings.method_9637(class_3614.field_15914).method_9629(51f, 1201f).method_9626(class_2498.field_11544)
            .method_29292());
    public static final class_2248 D_COMPACT_OBSIDIAN = new class_2248(FabricBlockSettings.method_9637(class_3614.field_15914).method_9629(52f, 1202f).method_9626(class_2498.field_11544)
            .method_29292());
    public static final class_2248 T_COMPACT_OBSIDIAN = new class_2248(FabricBlockSettings.method_9637(class_3614.field_15914).method_9629(53f, 1203f).method_9626(class_2498.field_11544)
            .method_29292());
    public static final class_2248 Q_COMPACT_OBSIDIAN = new class_2248(FabricBlockSettings.method_9637(class_3614.field_15914).method_9629(54f, 1204f).method_9626(class_2498.field_11544)
            .method_29292());
    public static final class_2482 BEDROCK_SLAB = new class_2482(FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2510 BEDROCK_STAIRS = new BCStairsBlock(class_2246.field_10340.method_9564(), FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2544 BEDROCK_WALL = new class_2544(FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2248 POLISHED_BEDROCK = new class_2248(FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2482 P_BEDROCK_SLAB = new class_2482(FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2510 P_BEDROCK_STAIRS = new BCStairsBlock(class_2246.field_10340.method_9564(), FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2544 P_BEDROCK_WALL = new class_2544(FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2248 P_B_BRICKS = new class_2248(FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2248 C_P_B_BRICKS = new class_2248(FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2482 P_B_BRICK_SLAB = new class_2482(FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2510 P_B_BRICK_STAIRS = new BCStairsBlock(class_2246.field_9987.method_9564(), FabricBlockSettings.method_9630(class_2246.field_9987));
    public static final class_2544 P_B_BRICK_WALL = new class_2544(FabricBlockSettings.method_9630(class_2246.field_9987));

    public static void registerBlocks() {
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "compact_deepslate"), COMPACT_DEEPSLATE);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "double_compact_deepslate"), D_COMPACT_DEEPSLATE);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "triple_compact_deepslate"), T_COMPACT_DEEPSLATE);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "quadruple_compact_deepslate"), Q_COMPACT_DEEPSLATE);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "compact_obsidian"), COMPACT_OBSIDIAN);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "double_compact_obsidian"), D_COMPACT_OBSIDIAN);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "triple_compact_obsidian"), T_COMPACT_OBSIDIAN);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "quadruple_compact_obsidian"), Q_COMPACT_OBSIDIAN);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "bedrock_slab"), BEDROCK_SLAB);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "bedrock_stairs"), BEDROCK_STAIRS);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "bedrock_wall"), BEDROCK_WALL);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock"), POLISHED_BEDROCK);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_slab"), P_BEDROCK_SLAB);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_stairs"), P_BEDROCK_STAIRS);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_wall"), P_BEDROCK_WALL);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_bricks"), P_B_BRICKS);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "chiseled_polished_bedrock_bricks"), C_P_B_BRICKS);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_brick_slab"), P_B_BRICK_SLAB);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_brick_stairs"), P_B_BRICK_STAIRS);
        class_2378.method_10230(class_2378.field_11146, new class_2960(BedrockCrafter.MOD_ID, "polished_bedrock_brick_wall"), P_B_BRICK_WALL);
    }
}
