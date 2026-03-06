package thecjbrine.bedrockcrafter.items;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;

import java.util.function.Supplier;

public class BCCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, BedrockCrafter.MODID);

    public static final Supplier<CreativeModeTab> BEDROCK_TAB = CREATIVE_MODE_TABS.register("bedrock_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BCItems.BEDROCK_CHUNK.get()))
                    .title(Component.translatable("creativeTab." + BedrockCrafter.MODID + ".bedrocktab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(BCBlocks.COMPACT_DEEPSLATE);
                        output.accept(BCBlocks.COMPACT_OBSIDIAN);
                        output.accept(Blocks.BEDROCK);
                        output.accept(BCBlocks.BEDROCK_SLAB);
                        output.accept(BCBlocks.BEDROCK_STAIRS);
                        output.accept(BCBlocks.BEDROCK_WALL);
                        output.accept(BCBlocks.POLISHED_BEDROCK);
                        output.accept(BCBlocks.P_BEDROCK_SLAB);
                        output.accept(BCBlocks.P_BEDROCK_STAIRS);
                        output.accept(BCBlocks.P_BEDROCK_WALL);
                        output.accept(BCBlocks.P_B_BRICKS);
                        output.accept(BCBlocks.C_P_B_BRICKS);
                        output.accept(BCBlocks.P_B_BRICK_SLAB);
                        output.accept(BCBlocks.P_B_BRICK_STAIRS);
                        output.accept(BCBlocks.P_B_BRICK_WALL);
                        output.accept(BCBlocks.BEDROCK_DOOR);
                        output.accept(BCBlocks.BEDROCK_TRAPDOOR);
                        output.accept(BCBlocks.BEDROCK_GLASS);
                        output.accept(BCBlocks.BEDROCK_GLASS_PANE);
                        output.accept(BCBlocks.BEDROCK_LAMP);
                        output.accept(BCItems.BEDROCK_CHUNK);
                        output.accept(BCItems.BEDROCK_PICKAXE);
                    }).build());

    public static void registerCreativeModeTabs(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
