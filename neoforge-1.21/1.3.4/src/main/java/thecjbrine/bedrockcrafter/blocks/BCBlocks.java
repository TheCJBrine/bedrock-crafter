package thecjbrine.bedrockcrafter.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.custom.BCDoorBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCLampBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCTrapdoorBlock;
import thecjbrine.bedrockcrafter.items.BCItems;

import java.util.function.Supplier;

public class BCBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BedrockCrafter.MODID);

    //Blocks
    public static final DeferredBlock<Block> COMPACT_DEEPSLATE = registerBlock("compact_deepslate", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)
            .strength(5F, 10F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> COMPACT_OBSIDIAN = registerBlock("compact_obsidian", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)
            .strength(60F, 1400F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> BEDROCK_SLAB = registerBlock("bedrock_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<StairBlock> BEDROCK_STAIRS = registerBlock("bedrock_stairs", () -> new StairBlock(Blocks.BEDROCK.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<WallBlock> BEDROCK_WALL = registerBlock("bedrock_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));

    public static final DeferredBlock<Block> POLISHED_BEDROCK = registerBlock("polished_bedrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<SlabBlock> P_BEDROCK_SLAB = registerBlock("polished_bedrock_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<StairBlock> P_BEDROCK_STAIRS = registerBlock("polished_bedrock_stairs", () -> new StairBlock(Blocks.BEDROCK.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<WallBlock> P_BEDROCK_WALL = registerBlock("polished_bedrock_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));

    public static final DeferredBlock<Block> P_B_BRICKS = registerBlock("polished_bedrock_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<Block> C_P_B_BRICKS = registerBlock("chiseled_polished_bedrock_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<SlabBlock> P_B_BRICK_SLAB = registerBlock("polished_bedrock_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<StairBlock> P_B_BRICK_STAIRS = registerBlock("polished_bedrock_brick_stairs", () -> new StairBlock(Blocks.BEDROCK.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<WallBlock> P_B_BRICK_WALL = registerBlock("polished_bedrock_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));

    public static final DeferredBlock<DoorBlock> BEDROCK_DOOR = registerBlock("bedrock_door", () -> new BCDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).noOcclusion(),
            BlockSetType.STONE));
    public static final DeferredBlock<TrapDoorBlock> BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", () -> new BCTrapdoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)
            .noOcclusion(), BlockSetType.STONE));

    public static final DeferredBlock<Block> BEDROCK_GLASS = registerBlock("bedrock_glass", () -> new TransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)
            .strength(-1F, 3600000F)));
    public static final DeferredBlock<Block> BEDROCK_GLASS_PANE = registerBlock("bedrock_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE)
            .strength(-1F, 3600000F)));

    public static final DeferredBlock<Block> BEDROCK_LAMP = registerBlock("bedrock_lamp", () -> new BCLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
            .strength(-1F, 3600000F)));

    //Registry
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        BCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerBCBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
