package thecjbrine.bedrockcrafter;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;
import thecjbrine.bedrockcrafter.items.BCItems;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

public class BedrockCrafter implements ModInitializer {

	public static final String MODID = "bedrockcrafter";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static final ItemGroup BEDROCK_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "bedrocktab"),
			() -> new ItemStack(BCItems.BEDROCK_CHUNK));

	@Override
	public void onInitialize() {
		BCBlocks.registerBCBlocks();
		BCItems.registerBCItems();
		BCSoundEvents.registerBCSounds();

		LOGGER.info("Initializing " + MODID + "...");
	}
}
