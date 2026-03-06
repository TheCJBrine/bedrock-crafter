package thecjbrine.bedrockcrafter;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;
import thecjbrine.bedrockcrafter.items.BCCreativeModeTab;
import thecjbrine.bedrockcrafter.items.BCItems;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

@Mod(BedrockCrafter.MODID)
public class BedrockCrafter {
    public static final String MODID = "bedrockcrafter";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BedrockCrafter(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        BCCreativeModeTab.registerCreativeModeTabs(modEventBus);
        BCBlocks.registerBCBlocks(modEventBus);
        BCItems.registerBCItems(modEventBus);
        BCSoundEvents.registerBCSounds(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Initializing " + MODID + "...");
    }
}
