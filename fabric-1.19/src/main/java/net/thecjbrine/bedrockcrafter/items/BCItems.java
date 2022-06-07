package net.thecjbrine.bedrockcrafter.items;

import net.thecjbrine.bedrockcrafter.BedrockCrafter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCItems {

    // Items
    public static final Item BEDROCK_CHUNK = registerItem("bedrock_chunk", new Item(new FabricItemSettings()
            .group(BedrockCrafter.BEDROCK_GROUP)));

    // Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BedrockCrafter.MODID, name), item);
    }

    public static void registerBCItems() {
        BedrockCrafter.LOGGER.info("Registering items for " + BedrockCrafter.MODID);
    }
}
