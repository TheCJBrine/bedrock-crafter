package thecjbrine.bedrockcrafter.items;

import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import thecjbrine.bedrockcrafter.items.custom.tools.BCToolMaterials;
import thecjbrine.bedrockcrafter.items.custom.tools.BedrockPickaxeItem;

import java.util.function.Function;

public class BCItems {

    // Items
    public static final Item BEDROCK_CHUNK = registerItem("bedrock_chunk");

    public static final Item BEDROCK_PICKAXE = registerItem("bedrock_pickaxe", (settings) -> new BedrockPickaxeItem(BCToolMaterials.BEDROCK,
            4, -2.8F, settings));

    // Registry
    private static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        return Items.register(itemKeyOf(name), factory, new Item.Settings());
    }

    private static Item registerItem(String name) {
        return Items.register(itemKeyOf(name), Item::new, new Item.Settings());
    }

    private static RegistryKey<Item> itemKeyOf(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BedrockCrafter.MODID, name));
    }

    public static void registerBCItems() {
        BedrockCrafter.LOGGER.info("Registering items for " + BedrockCrafter.MODID);
    }
}
