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

@Mod(BedrockCrafter.MOD_ID)
public class BedrockCrafter
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bedrockcrafter";
    public static final CreativeModeTab BEDROCK_TAB = new BedrockTab("bedrocktab");

    public BedrockCrafter() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        BCItems.ITEMS.register(bus);
        BCBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    public static class BedrockTab extends CreativeModeTab {

        public BedrockTab(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return BCItems.POLISHED_BEDROCK.get().getDefaultInstance();
        }
    }
}
