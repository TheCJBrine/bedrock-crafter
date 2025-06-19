package thecjbrine.bedrockcrafter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;
import thecjbrine.bedrockcrafter.items.BCItemGroup;
import thecjbrine.bedrockcrafter.items.BCItems;
import net.fabricmc.api.ModInitializer;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

public class BedrockCrafter implements ModInitializer {

	public static final String MODID = "bedrockcrafter";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		BCItemGroup.registerItemGroups();
		BCBlocks.registerBCBlocks();
		BCItems.registerBCItems();
		BCSoundEvents.registerBCSounds();

		LOGGER.info("Initializing " + MODID + "...");
	}
}
