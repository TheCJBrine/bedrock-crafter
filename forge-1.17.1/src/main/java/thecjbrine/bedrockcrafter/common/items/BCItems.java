package thecjbrine.bedrockcrafter.common.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.common.blocks.BCBlocks;

public class BCItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BedrockCrafter.MOD_ID);

    public static final RegistryObject<BlockItem> COMPACT_DEEPSLATE = ITEMS.register("compact_deepslate", () -> new BlockItem(BCBlocks.COMPACT_DEEPSLATE.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> D_COMPACT_DEEPSLATE = ITEMS.register("double_compact_deepslate", () -> new BlockItem(BCBlocks.D_COMPACT_DEEPSLATE.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> T_COMPACT_DEEPSLATE = ITEMS.register("triple_compact_deepslate", () -> new BlockItem(BCBlocks.T_COMPACT_DEEPSLATE.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> Q_COMPACT_DEEPSLATE = ITEMS.register("quadruple_compact_deepslate", () -> new BlockItem(BCBlocks.Q_COMPACT_DEEPSLATE.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> COMPACT_OBSIDIAN = ITEMS.register("compact_obsidian", () -> new BlockItem(BCBlocks.COMPACT_OBSIDIAN.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> D_COMPACT_OBSIDIAN = ITEMS.register("double_compact_obsidian",
            () -> new BlockItem(BCBlocks.D_COMPACT_OBSIDIAN.get(), new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> T_COMPACT_OBSIDIAN = ITEMS.register("triple_compact_obsidian",
            () -> new BlockItem(BCBlocks.T_COMPACT_OBSIDIAN.get(), new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> Q_COMPACT_OBSIDIAN = ITEMS.register("quadruple_compact_obsidian",
            () -> new BlockItem(BCBlocks.Q_COMPACT_OBSIDIAN.get(), new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> BEDROCK_SLAB = ITEMS.register("bedrock_slab", () -> new BlockItem(BCBlocks.BEDROCK_SLAB.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> BEDROCK_STAIRS = ITEMS.register("bedrock_stairs", () -> new BlockItem(BCBlocks.BEDROCK_STAIRS.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> BEDROCK_WALL = ITEMS.register("bedrock_wall", () -> new BlockItem(BCBlocks.BEDROCK_WALL.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> POLISHED_BEDROCK = ITEMS.register("polished_bedrock", () -> new BlockItem(BCBlocks.POLISHED_BEDROCK.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> P_BEDROCK_SLAB = ITEMS.register("polished_bedrock_slab", () -> new BlockItem(BCBlocks.P_BEDROCK_SLAB.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> P_BEDROCK_STAIRS = ITEMS.register("polished_bedrock_stairs",
            () -> new BlockItem(BCBlocks.P_BEDROCK_STAIRS.get(), new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> P_BEDROCK_WALL = ITEMS.register("polished_bedrock_wall", () -> new BlockItem(BCBlocks.P_BEDROCK_WALL.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> P_B_BRICKS = ITEMS.register("polished_bedrock_bricks", () -> new BlockItem(BCBlocks.P_B_BRICKS.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> C_P_B_BRICKS = ITEMS.register("chiseled_polished_bedrock_bricks", () -> new BlockItem(BCBlocks.C_P_B_BRICKS.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> P_B_BRICK_SLAB = ITEMS.register("polished_bedrock_brick_slab", () -> new BlockItem(BCBlocks.P_B_BRICK_SLAB.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> P_B_BRICK_STAIRS = ITEMS.register("polished_bedrock_brick_stairs", () -> new BlockItem(BCBlocks.P_B_BRICK_STAIRS.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
    public static final RegistryObject<BlockItem> P_B_BRICK_WALL = ITEMS.register("polished_bedrock_brick_wall", () -> new BlockItem(BCBlocks.P_B_BRICK_WALL.get(),
            new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));
}
