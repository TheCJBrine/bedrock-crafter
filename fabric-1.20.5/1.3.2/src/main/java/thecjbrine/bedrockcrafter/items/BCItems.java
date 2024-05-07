package thecjbrine.bedrockcrafter.items;

import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import thecjbrine.bedrockcrafter.items.custom.tools.BCToolMaterials;
import thecjbrine.bedrockcrafter.items.custom.tools.BedrockPickaxeItem;

public class BCItems {

    // Items
    public static final Item BEDROCK_CHUNK = registerItem("bedrock_chunk", new Item(new Item.Settings()));

    public static final Item BEDROCK_PICKAXE = registerItem("bedrock_pickaxe", new BedrockPickaxeItem(BCToolMaterials.BEDROCK,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(BCToolMaterials.BEDROCK, 4, -2.8F))));

    // Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BedrockCrafter.MODID, name), item);
    }

    public static void registerBCItems() {
        BedrockCrafter.LOGGER.info("Registering items for " + BedrockCrafter.MODID);
    }
}
