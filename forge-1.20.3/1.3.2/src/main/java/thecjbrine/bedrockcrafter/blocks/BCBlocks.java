package thecjbrine.bedrockcrafter.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.custom.BCDoorBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCLampBlock;
import thecjbrine.bedrockcrafter.blocks.custom.BCTrapdoorBlock;
import thecjbrine.bedrockcrafter.items.BCItems;

import java.util.function.Supplier;

public class BCBlocks {

    // Blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BedrockCrafter.MODID);

    public static final RegistryObject<Block> COMPACT_DEEPSLATE = registerBlock("compact_deepslate", () -> new Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.DEEPSLATE).strength(5f, 10f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPACT_OBSIDIAN = registerBlock("compact_obsidian", () -> new Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.OBSIDIAN).strength(60f, 1400f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> BEDROCK_SLAB = registerBlock("bedrock_slab", () -> new SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> BEDROCK_STAIRS = registerBlock("bedrock_stairs", () -> new StairBlock(Blocks.BEDROCK.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> BEDROCK_WALL = registerBlock("bedrock_wall", () -> new WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> POLISHED_BEDROCK = registerBlock("polished_bedrock", () -> new Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_BEDROCK_SLAB = registerBlock("polished_bedrock_slab", () -> new SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_BEDROCK_STAIRS = registerBlock("polished_bedrock_stairs", () -> new StairBlock(
            Blocks.BEDROCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_BEDROCK_WALL = registerBlock("polished_bedrock_wall", () -> new WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> P_B_BRICKS = registerBlock("polished_bedrock_bricks", () -> new Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> C_P_B_BRICKS = registerBlock("chiseled_polished_bedrock_bricks", () -> new Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_B_BRICK_SLAB = registerBlock("polished_bedrock_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_B_BRICK_STAIRS = registerBlock("polished_bedrock_brick_stairs", () -> new StairBlock(
            Blocks.BEDROCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> P_B_BRICK_WALL = registerBlock("polished_bedrock_brick_wall", () -> new WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> BEDROCK_DOOR = registerBlock("bedrock_door", () -> new BCDoorBlock(BlockSetType.STONE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).noOcclusion()));
    public static final RegistryObject<Block> BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", () -> new BCTrapdoorBlock(BlockSetType.STONE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).noOcclusion()));

    public static final RegistryObject<Block> BEDROCK_GLASS = registerBlock("bedrock_glass", () -> new TransparentBlock(BlockBehaviour.Properties
            .ofLegacyCopy(Blocks.GLASS).strength(-1F, 3600000F)));
    public static final RegistryObject<Block> BEDROCK_GLASS_PANE = registerBlock("bedrock_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties
            .ofLegacyCopy(Blocks.GLASS_PANE).strength(-1F, 3600000F)));

    public static final RegistryObject<Block> BEDROCK_LAMP = registerBlock("bedrock_lamp", () -> new BCLampBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.REDSTONE_LAMP).strength(-1F, 3600000F)));

    // Registry
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return BCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
