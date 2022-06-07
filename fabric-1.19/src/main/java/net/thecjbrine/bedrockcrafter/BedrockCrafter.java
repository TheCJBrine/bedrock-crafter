package net.thecjbrine.bedrockcrafter;

import net.thecjbrine.bedrockcrafter.blocks.BCBlocks;
import net.thecjbrine.bedrockcrafter.items.BCItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BedrockCrafter implements ModInitializer {

	public static final String MODID = "bedrockcrafter";

	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public static final ItemGroup BEDROCK_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "bedrockcrafter"),
			() -> new ItemStack(BCItems.BEDROCK_CHUNK));

	@Override
	public void onInitialize() {
		BCBlocks.registerBCBlocks();
		BCItems.registerBCItems();

		LOGGER.info("Initializing " + MODID + "...");
	}
}
