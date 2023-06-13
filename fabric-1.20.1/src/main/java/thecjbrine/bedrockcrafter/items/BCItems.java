package thecjbrine.bedrockcrafter.items;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import thecjbrine.bedrockcrafter.items.custom.tools.BCToolMaterials;
import thecjbrine.bedrockcrafter.items.custom.tools.BedrockPickaxeItem;

public class BCItems {

    // Items
    public static final Item BEDROCK_CHUNK = registerItem("bedrock_chunk", new Item(new FabricItemSettings()));

    public static final Item BEDROCK_PICKAXE = registerItem("bedrock_pickaxe", new BedrockPickaxeItem(BCToolMaterials.BEDROCK,
            4, -2.8F, new FabricItemSettings()));

    // Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BedrockCrafter.MODID, name), item);
    }

    public static void registerBCItems() {
        BedrockCrafter.LOGGER.info("Registering items for " + BedrockCrafter.MODID);
    }
}
