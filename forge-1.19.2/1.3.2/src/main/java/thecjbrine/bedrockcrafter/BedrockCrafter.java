package thecjbrine.bedrockcrafter;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;
import thecjbrine.bedrockcrafter.items.BCItems;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

@Mod(BedrockCrafter.MODID)
public class BedrockCrafter
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "bedrockcrafter";
    public static final CreativeModeTab BEDROCK_TAB = new BedrockTab("bedrocktab");

    public BedrockCrafter() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BCBlocks.register(bus);
        BCItems.register(bus);
        BCSoundEvents.register(bus);

        bus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Initializing " + MODID + "...");
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
