package thecjbrine.bedrockcrafter.common.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BedrockCrafter.MOD_ID);

    public static final RegistryObject<Block> COMPACT_DEEPSLATE = BLOCKS.register("compact_deepslate", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE).strength(4f, 7f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> D_COMPACT_DEEPSLATE = BLOCKS.register("double_compact_deepslate", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE).strength(5f, 8f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> T_COMPACT_DEEPSLATE = BLOCKS.register("triple_compact_deepslate", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE).strength(6f, 9f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> Q_COMPACT_DEEPSLATE = BLOCKS.register("quadruple_compact_deepslate", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE).strength(7f, 10f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> COMPACT_OBSIDIAN = BLOCKS.register("compact_obsidian", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE).strength(51f, 1201f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> D_COMPACT_OBSIDIAN = BLOCKS.register("double_compact_obsidian", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE).strength(52f, 1202f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> T_COMPACT_OBSIDIAN = BLOCKS.register("triple_compact_obsidian", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE).strength(53f, 1203f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> Q_COMPACT_OBSIDIAN = BLOCKS.register("quadruple_compact_obsidian", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE).strength(54f, 1204f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> BEDROCK_SLAB = BLOCKS.register("bedrock_slab", () -> new SlabBlock(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<StairBlock> BEDROCK_STAIRS = BLOCKS.register("bedrock_stairs", () -> new StairBlock(Blocks.BEDROCK::defaultBlockState,
            BlockBehaviour.Properties.copy(Blocks.BEDROCK)));
    public static final RegistryObject<WallBlock> BEDROCK_WALL = BLOCKS.register("bedrock_wall", () -> new WallBlock(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> POLISHED_BEDROCK = BLOCKS.register("polished_bedrock", () -> new Block(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<SlabBlock> P_BEDROCK_SLAB = BLOCKS.register("polished_bedrock_slab", () -> new SlabBlock(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<StairBlock> P_BEDROCK_STAIRS = BLOCKS.register("polished_bedrock_stairs", () -> new StairBlock(
            Blocks.BEDROCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BEDROCK)));

    public static final RegistryObject<WallBlock> P_BEDROCK_WALL = BLOCKS.register("polished_bedrock_wall", () -> new WallBlock(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> P_B_BRICKS = BLOCKS.register("polished_bedrock_bricks", () -> new Block(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> C_P_B_BRICKS = BLOCKS.register("chiseled_polished_bedrock_bricks", () -> new Block(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<SlabBlock> P_B_BRICK_SLAB = BLOCKS.register("polished_bedrock_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));

    public static final RegistryObject<StairBlock> P_B_BRICK_STAIRS = BLOCKS.register("polished_bedrock_brick_stairs", () -> new StairBlock(
            Blocks.BEDROCK::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BEDROCK)));

    public static final RegistryObject<WallBlock> P_B_BRICK_WALL = BLOCKS.register("polished_bedrock_brick_wall", () -> new WallBlock(BlockBehaviour.Properties
            .copy(Blocks.BEDROCK)));
}
