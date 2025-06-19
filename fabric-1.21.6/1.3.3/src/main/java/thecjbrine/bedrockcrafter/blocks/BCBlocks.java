package thecjbrine.bedrockcrafter.blocks;

import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import thecjbrine.bedrockcrafter.blocks.custom.BCDoorBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCLampBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCTrapdoorBlock;

import java.util.function.Function;

public class BCBlocks {

    // Blocks
    public static final Block COMPACT_DEEPSLATE = registerBlock("compact_deepslate", Settings.copy(Blocks.DEEPSLATE)
            .strength(5f, 10f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool());
    public static final Block COMPACT_OBSIDIAN = registerBlock("compact_obsidian", Settings.copy(Blocks.OBSIDIAN)
            .strength(60f, 1400f).sounds(BlockSoundGroup.STONE).requiresTool());

    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab", SlabBlock::new, Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_STAIRS = registerStairsBlock("bedrock_stairs", Blocks.BEDROCK);
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall", WallBlock::new, Settings.copy(Blocks.BEDROCK));

    public static final Block POLISHED_BEDROCK = registerBlock("polished_bedrock", Settings.copy(Blocks.BEDROCK));
    public static final Block P_BEDROCK_SLAB = registerBlock("polished_bedrock_slab", SlabBlock::new, Settings.copy(Blocks.BEDROCK));
    public static final Block P_BEDROCK_STAIRS = registerStairsBlock("polished_bedrock_stairs", POLISHED_BEDROCK);
    public static final Block P_BEDROCK_WALL = registerBlock("polished_bedrock_wall", WallBlock::new, Settings.copy(Blocks.BEDROCK));

    public static final Block P_B_BRICKS = registerBlock("polished_bedrock_bricks", Settings.copy(Blocks.BEDROCK));
    public static final Block C_P_B_BRICKS = registerBlock("chiseled_polished_bedrock_bricks", Settings.copy(Blocks.BEDROCK));
    public static final Block P_B_BRICK_SLAB = registerBlock("polished_bedrock_brick_slab", SlabBlock::new, Settings.copy(Blocks.BEDROCK));
    public static final Block P_B_BRICK_STAIRS = registerStairsBlock("polished_bedrock_brick_stairs", P_B_BRICKS);
    public static final Block P_B_BRICK_WALL = registerBlock("polished_bedrock_brick_wall", WallBlock::new, Settings.copy(Blocks.BEDROCK));

    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door", (settings) -> new BCDoorBlock(settings, BlockSetType.STONE),
            Settings.copy(Blocks.BEDROCK).nonOpaque());
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", (settings) -> new BCTrapdoorBlock(settings, BlockSetType.STONE),
            Settings.copy(Blocks.BEDROCK).nonOpaque());

    public static final Block BEDROCK_GLASS = registerBlock("bedrock_glass", TransparentBlock::new, Settings.copy(Blocks.GLASS)
            .strength(-1F, 3600000F));
    public static final Block BEDROCK_GLASS_PANE = registerBlock("bedrock_glass_pane", PaneBlock::new, Settings.copy(Blocks.GLASS_PANE)
            .strength(-1F, 3600000F));

    public static final Block BEDROCK_LAMP = registerBlock("bedrock_lamp", BCLampBlock::new, Settings.copy(Blocks.REDSTONE_LAMP)
            .strength(-1F, 3600000F));

    // Registry
    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = Blocks.register(blockKeyOf(name), factory, settings);
        registerBlockItem(block);
        return block;
    }

    private static Block registerBlock(String name, AbstractBlock.Settings settings) {
        return registerBlock(name, Block::new, settings);
    }

    private static Block registerStairsBlock(String name, Block blockBase) {
        return registerBlock(name, (settings) -> new StairsBlock(blockBase.getDefaultState(), settings), Settings.copy(blockBase));
    }

    private static Item registerBlockItem(Block block) {
        return Items.register(block);
    }

    private static RegistryKey<Block> blockKeyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BedrockCrafter.MODID, name));
    }

    public static void registerBCBlocks() {
        BedrockCrafter.LOGGER.info("Registering blocks for " + BedrockCrafter.MODID);
    }
}
