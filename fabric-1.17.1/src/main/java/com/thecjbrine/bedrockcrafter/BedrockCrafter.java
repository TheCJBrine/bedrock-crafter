package com.thecjbrine.bedrockcrafter;

import com.thecjbrine.bedrockcrafter.common.blocks.BCBlocks;
import com.thecjbrine.bedrockcrafter.common.items.BCItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BedrockCrafter implements ModInitializer {

	public static final String MOD_ID = "bedrockcrafter";

	public static final ItemGroup BEDROCK_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "general"),
			() -> new ItemStack(BCItems.POLISHED_BEDROCK));

	@Override
	public void onInitialize() {
		BCBlocks.registerBlocks();
		BCItems.registerItems();
	}
}
