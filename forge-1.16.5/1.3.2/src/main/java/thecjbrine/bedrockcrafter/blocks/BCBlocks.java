package thecjbrine.bedrockcrafter.blocks;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.custom.BCDoorBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCLampBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCTrapdoorBlock;
import thecjbrine.bedrockcrafter.items.BCItems;

import java.util.function.Supplier;

public class BCBlocks {

    // Blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BedrockCrafter.MODID);

    public static final RegistryObject<Block> COMPACT_STONE = registerBlock("compact_stone", () -> new Block(AbstractBlock.Properties
            .copy(Blocks.STONE).strength(3.5f, 10f).harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops()
            .sound(SoundType.STONE)));
    public static final RegistryObject<Block> COMPACT_OBSIDIAN = registerBlock("compact_obsidian", () -> new Block(AbstractBlock.Properties
            .copy(Blocks.OBSIDIAN).strength(60f, 1400f).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops()
            .sound(SoundType.STONE)));

    public static final RegistryObject<Block> BEDROCK_SLAB = registerBlock("bedrock_slab", () -> new SlabBlock(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> BEDROCK_STAIRS = registerBlock("bedrock_stairs", () -> new StairsBlock(
            () -> Blocks.BEDROCK.getBlock().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> BEDROCK_WALL = registerBlock("bedrock_wall", () -> new WallBlock(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> POLISHED_BEDROCK = registerBlock("polished_bedrock", () -> new Block(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_BEDROCK_SLAB = registerBlock("polished_bedrock_slab", () -> new SlabBlock(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_BEDROCK_STAIRS = registerBlock("polished_bedrock_stairs", () -> new StairsBlock(
            () -> Blocks.BEDROCK.getBlock().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_BEDROCK_WALL = registerBlock("polished_bedrock_wall", () -> new WallBlock(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> P_B_BRICKS = registerBlock("polished_bedrock_bricks", () -> new Block(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> C_P_B_BRICKS = registerBlock("chiseled_polished_bedrock_bricks", () -> new Block(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_B_BRICK_SLAB = registerBlock("polished_bedrock_brick_slab", () -> new SlabBlock(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_B_BRICK_STAIRS = registerBlock("polished_bedrock_brick_stairs", () -> new StairsBlock(
            () -> Blocks.BEDROCK.getBlock().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_B_BRICK_WALL = registerBlock("polished_bedrock_brick_wall", () -> new WallBlock(AbstractBlock.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> BEDROCK_DOOR = registerBlock("bedrock_door", () -> new BCDoorBlock(AbstractBlock.Properties
            .copy(Blocks.BEDROCK).noOcclusion()));
    public static final RegistryObject<Block> BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", () -> new BCTrapdoorBlock(AbstractBlock.Properties
            .copy(Blocks.BEDROCK).noOcclusion()));

    public static final RegistryObject<Block> BEDROCK_GLASS = registerBlock("bedrock_glass", () -> new GlassBlock(AbstractBlock.Properties
            .copy(Blocks.GLASS).strength(-1F, 3600000F)));
    public static final RegistryObject<Block> BEDROCK_GLASS_PANE = registerBlock("bedrock_glass_pane", () -> new PaneBlock(AbstractBlock.Properties
            .copy(Blocks.GLASS_PANE).strength(-1F, 3600000F)));

    public static final RegistryObject<Block> BEDROCK_LAMP = registerBlock("bedrock_lamp", () -> new BCLampBlock(AbstractBlock.Properties
            .copy(Blocks.REDSTONE_LAMP).strength(-1F, 3600000F)));

    // Registry
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return BCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(BedrockCrafter.BEDROCK_GROUP)));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
