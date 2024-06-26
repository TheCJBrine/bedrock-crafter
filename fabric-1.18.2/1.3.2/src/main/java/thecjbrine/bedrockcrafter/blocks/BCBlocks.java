package thecjbrine.bedrockcrafter.blocks;

import thecjbrine.bedrockcrafter.BedrockCrafter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import thecjbrine.bedrockcrafter.blocks.custom.BCDoorBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCLampBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCTrapdoorBlock;

public class BCBlocks {

    // Blocks
    public static final Block COMPACT_DEEPSLATE = registerBlock("compact_deepslate", new Block(FabricBlockSettings.of(Material.STONE)
            .strength(5f, 10f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()), BedrockCrafter.BEDROCK_GROUP);
    public static final Block COMPACT_OBSIDIAN = registerBlock("compact_obsidian", new Block(FabricBlockSettings.of(Material.STONE)
            .strength(60f, 1400f).sounds(BlockSoundGroup.STONE).requiresTool()), BedrockCrafter.BEDROCK_GROUP);

    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block BEDROCK_STAIRS = registerBlock("bedrock_stairs", new StairsBlock(Blocks.BEDROCK.getDefaultState(),
            FabricBlockSettings.copy(Blocks.BEDROCK)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);

    public static final Block POLISHED_BEDROCK = registerBlock("polished_bedrock", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_BEDROCK_SLAB = registerBlock("polished_bedrock_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_BEDROCK_STAIRS = registerBlock("polished_bedrock_stairs", new StairsBlock(POLISHED_BEDROCK.getDefaultState(),
            FabricBlockSettings.copy(Blocks.BEDROCK)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_BEDROCK_WALL = registerBlock("polished_bedrock_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);

    public static final Block P_B_BRICKS = registerBlock("polished_bedrock_bricks", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block C_P_B_BRICKS = registerBlock("chiseled_polished_bedrock_bricks", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_SLAB = registerBlock("polished_bedrock_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_STAIRS = registerBlock("polished_bedrock_brick_stairs", new StairsBlock(P_B_BRICKS.getDefaultState(),
            FabricBlockSettings.copy(Blocks.BEDROCK)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block P_B_BRICK_WALL = registerBlock("polished_bedrock_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BEDROCK)),
            BedrockCrafter.BEDROCK_GROUP);

    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door", new BCDoorBlock(FabricBlockSettings.copy(Blocks.BEDROCK).nonOpaque()),
            BedrockCrafter.BEDROCK_GROUP);
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", new BCTrapdoorBlock(FabricBlockSettings.copy(Blocks.BEDROCK).nonOpaque()),
            BedrockCrafter.BEDROCK_GROUP);

    public static final Block BEDROCK_GLASS = registerBlock("bedrock_glass", new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS)
            .strength(-1F, 3600000)), BedrockCrafter.BEDROCK_GROUP);
    public static final Block BEDROCK_GLASS_PANE = registerBlock("bedrock_glass_pane", new PaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE)
            .strength(-1F, 3600000)), BedrockCrafter.BEDROCK_GROUP);

    public static final Block BEDROCK_LAMP = registerBlock("bedrock_lamp", new BCLampBlock(FabricBlockSettings.copy(Blocks.REDSTONE_LAMP)
            .strength(-1F, 3600000)), BedrockCrafter.BEDROCK_GROUP);

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
