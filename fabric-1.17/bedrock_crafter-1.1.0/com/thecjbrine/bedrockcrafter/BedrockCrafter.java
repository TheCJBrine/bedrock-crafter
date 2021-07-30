package com.thecjbrine.bedrockcrafter;

import com.thecjbrine.bedrockcrafter.common.blocks.BCBlocks;
import com.thecjbrine.bedrockcrafter.common.items.BCItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.class_1761;
import net.minecraft.class_1799;
import net.minecraft.class_2960;

public class BedrockCrafter implements ModInitializer {

	public static final String MOD_ID = "bedrockcrafter";

	public static final class_1761 BEDROCK_GROUP = FabricItemGroupBuilder.build(
			new class_2960(MOD_ID, "general"),
			() -> new class_1799(BCItems.POLISHED_BEDROCK));

	@Override
	public void onInitialize() {
		BCBlocks.registerBlocks();
		BCItems.registerItems();
	}
}
