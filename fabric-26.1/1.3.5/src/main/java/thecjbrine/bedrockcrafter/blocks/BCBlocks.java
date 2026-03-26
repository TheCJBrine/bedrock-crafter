package thecjbrine.bedrockcrafter.blocks;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.custom.BCDoorBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCLampBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCTrapdoorBlock;

import java.util.function.Function;

public class BCBlocks {

    // Blocks
    public static final Block COMPACT_DEEPSLATE = registerBlock("compact_deepslate", Properties.ofFullCopy(Blocks.DEEPSLATE)
            .strength(5f, 10f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final Block COMPACT_OBSIDIAN = registerBlock("compact_obsidian", Properties.ofFullCopy(Blocks.OBSIDIAN)
            .strength(60f, 1400f).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab", SlabBlock::new, Properties.ofFullCopy(Blocks.BEDROCK));
    public static final Block BEDROCK_STAIRS = registerStairsBlock("bedrock_stairs", Blocks.BEDROCK);
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall", WallBlock::new, Properties.ofFullCopy(Blocks.BEDROCK));

    public static final Block POLISHED_BEDROCK = registerBlock("polished_bedrock", Properties.ofFullCopy(Blocks.BEDROCK));
    public static final Block P_BEDROCK_SLAB = registerBlock("polished_bedrock_slab", SlabBlock::new, Properties.ofFullCopy(Blocks.BEDROCK));
    public static final Block P_BEDROCK_STAIRS = registerStairsBlock("polished_bedrock_stairs", POLISHED_BEDROCK);
    public static final Block P_BEDROCK_WALL = registerBlock("polished_bedrock_wall", WallBlock::new, Properties.ofFullCopy(Blocks.BEDROCK));

    public static final Block P_B_BRICKS = registerBlock("polished_bedrock_bricks", Properties.ofFullCopy(Blocks.BEDROCK));
    public static final Block C_P_B_BRICKS = registerBlock("chiseled_polished_bedrock_bricks", Properties.ofFullCopy(Blocks.BEDROCK));
    public static final Block P_B_BRICK_SLAB = registerBlock("polished_bedrock_brick_slab", SlabBlock::new, Properties.ofFullCopy(Blocks.BEDROCK));
    public static final Block P_B_BRICK_STAIRS = registerStairsBlock("polished_bedrock_brick_stairs", P_B_BRICKS);
    public static final Block P_B_BRICK_WALL = registerBlock("polished_bedrock_brick_wall", WallBlock::new, Properties.ofFullCopy(Blocks.BEDROCK));

    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door", (Properties) -> new BCDoorBlock(Properties, BlockSetType.STONE),
            Properties.ofFullCopy(Blocks.BEDROCK).noOcclusion());
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", (Properties) -> new BCTrapdoorBlock(Properties, BlockSetType.STONE),
            Properties.ofFullCopy(Blocks.BEDROCK).noOcclusion());

    public static final Block BEDROCK_GLASS = registerBlock("bedrock_glass", TransparentBlock::new, Properties.ofFullCopy(Blocks.GLASS)
            .strength(-1F, 3600000F));
    public static final Block BEDROCK_GLASS_PANE = registerBlock("bedrock_glass_pane", IronBarsBlock::new, Properties.ofFullCopy(Blocks.GLASS_PANE)
            .strength(-1F, 3600000F));

    public static final Block BEDROCK_LAMP = registerBlock("bedrock_lamp", BCLampBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
            .strength(-1F, 3600000F));

    // Registry
    private static Block registerBlock(String name, Function<Properties, Block> factory, Properties properties) {
        Block block = Blocks.register(blockKeyOf(name), factory, properties);
        registerBlockItem(name, block);
        return block;
    }

    private static Block registerBlock(String name, Properties properties) {
        return registerBlock(name, Block::new, properties);
    }

    private static Block registerStairsBlock(String name, Block blockBase) {
        return registerBlock(name, (Properties) -> new StairBlock(blockBase.defaultBlockState(), Properties), Properties.ofFullCopy(blockBase));
    }

    private static Item registerBlockItem(String name, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKeyOf(name)).useBlockDescriptionPrefix());
        return Registry.register(BuiltInRegistries.ITEM, itemKeyOf(name), blockItem);
    }

    private static ResourceKey<Block> blockKeyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BedrockCrafter.MODID, name));
    }

    private static ResourceKey<Item> itemKeyOf(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BedrockCrafter.MODID, name));
    }

    public static void registerBCBlocks() {
        BedrockCrafter.LOGGER.info("Registering blocks for " + BedrockCrafter.MODID);
    }
}
