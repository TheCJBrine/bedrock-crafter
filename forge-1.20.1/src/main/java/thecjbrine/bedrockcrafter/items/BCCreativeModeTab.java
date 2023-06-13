package thecjbrine.bedrockcrafter.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;

public class BCCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BedrockCrafter.MODID);

    public static final RegistryObject<CreativeModeTab> BEDROCK_TAB = TABS.register("bedrocktab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativeModeTab." + BedrockCrafter.MODID + ".bedrocktab"))
            .icon(() -> new ItemStack(BCItems.BEDROCK_CHUNK.get()))
            .displayItems((params, output) -> {
                output.accept(BCBlocks.COMPACT_DEEPSLATE.get());
                output.accept(BCBlocks.COMPACT_OBSIDIAN.get());
                output.accept(BCBlocks.BEDROCK_SLAB.get());
                output.accept(BCBlocks.BEDROCK_STAIRS.get());
                output.accept(BCBlocks.BEDROCK_WALL.get());
                output.accept(BCBlocks.POLISHED_BEDROCK.get());
                output.accept(BCBlocks.P_BEDROCK_SLAB.get());
                output.accept(BCBlocks.P_BEDROCK_STAIRS.get());
                output.accept(BCBlocks.P_BEDROCK_WALL.get());
                output.accept(BCBlocks.P_B_BRICKS.get());
                output.accept(BCBlocks.C_P_B_BRICKS.get());
                output.accept(BCBlocks.P_B_BRICK_SLAB.get());
                output.accept(BCBlocks.P_B_BRICK_STAIRS.get());
                output.accept(BCBlocks.P_B_BRICK_WALL.get());
                output.accept(BCBlocks.BEDROCK_DOOR.get());
                output.accept(BCBlocks.BEDROCK_TRAPDOOR.get());
                output.accept(BCBlocks.BEDROCK_GLASS.get());
                output.accept(BCBlocks.BEDROCK_GLASS_PANE.get());
                output.accept(BCBlocks.BEDROCK_LAMP.get());

                output.accept(BCItems.BEDROCK_CHUNK.get());
                output.accept(BCItems.BEDROCK_PICKAXE.get());
            }).build());

    public static void register(IEventBus bus) { TABS.register(bus);}
}
