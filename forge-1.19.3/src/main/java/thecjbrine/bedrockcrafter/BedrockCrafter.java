package thecjbrine.bedrockcrafter;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;
import thecjbrine.bedrockcrafter.items.BCCreativeModeTab;
import thecjbrine.bedrockcrafter.items.BCItems;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

@Mod(BedrockCrafter.MODID)
public class BedrockCrafter
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "bedrockcrafter";

    public BedrockCrafter() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BCBlocks.register(bus);
        BCItems.register(bus);
        BCSoundEvents.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::addToCreativeTab);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Initializing " + MODID + "...");
    }

    private void addToCreativeTab(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == BCCreativeModeTab.BEDROCK_TAB) {
            event.accept(BCBlocks.COMPACT_DEEPSLATE);
            event.accept(BCBlocks.COMPACT_OBSIDIAN);
            event.accept(BCBlocks.BEDROCK_SLAB);
            event.accept(BCBlocks.BEDROCK_STAIRS);
            event.accept(BCBlocks.BEDROCK_WALL);
            event.accept(BCBlocks.POLISHED_BEDROCK);
            event.accept(BCBlocks.P_BEDROCK_SLAB);
            event.accept(BCBlocks.P_BEDROCK_STAIRS);
            event.accept(BCBlocks.P_BEDROCK_WALL);
            event.accept(BCBlocks.P_B_BRICKS);
            event.accept(BCBlocks.C_P_B_BRICKS);
            event.accept(BCBlocks.P_B_BRICK_SLAB);
            event.accept(BCBlocks.P_B_BRICK_STAIRS);
            event.accept(BCBlocks.P_B_BRICK_WALL);
            event.accept(BCBlocks.BEDROCK_DOOR);
            event.accept(BCBlocks.BEDROCK_TRAPDOOR);
            event.accept(BCBlocks.BEDROCK_GLASS);
            event.accept(BCBlocks.BEDROCK_GLASS_PANE);
            event.accept(BCBlocks.BEDROCK_LAMP);

            event.accept(BCItems.BEDROCK_CHUNK);
            event.accept(BCItems.BEDROCK_PICKAXE);
        }
    }
}
