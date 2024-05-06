package thecjbrine.bedrockcrafter;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import thecjbrine.bedrockcrafter.common.blocks.BCBlocks;
import thecjbrine.bedrockcrafter.common.items.BCItems;

@Mod(BedrockCrafter.MODID)
public class BedrockCrafter
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "bedrockcrafter";
    public static final CreativeModeTab BEDROCK_TAB = new BedrockTab("bedrocktab");

    public BedrockCrafter() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BCBlocks.register(bus);
        BCItems.register(bus);

        bus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("Initializing " + MODID + "...");
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    public static class BedrockTab extends CreativeModeTab {

        public BedrockTab(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return BCItems.BEDROCK_CHUNK.get().getDefaultInstance();
        }
    }
}
