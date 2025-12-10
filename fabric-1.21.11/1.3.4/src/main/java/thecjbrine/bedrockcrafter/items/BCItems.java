package thecjbrine.bedrockcrafter.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.items.custom.tools.BCToolMaterials;
import thecjbrine.bedrockcrafter.items.custom.tools.BedrockPickaxeItem;

import java.util.function.Function;

public class BCItems {

    // Items
    public static final Item BEDROCK_CHUNK = registerItem("bedrock_chunk");

    public static final Item BEDROCK_PICKAXE = registerItem("bedrock_pickaxe", ((properties) -> new BedrockPickaxeItem(BCToolMaterials.BEDROCK,
            4, -2.8F, properties)));

    // Registry
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Items.registerItem(itemKeyOf(name), function, new Item.Properties());
    }

    private static Item registerItem(String name) {
        return Items.registerItem(itemKeyOf(name), Item::new, new Item.Properties());
    }

    private static ResourceKey<Item> itemKeyOf(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BedrockCrafter.MODID, name));
    }

    public static void registerBCItems() {
        BedrockCrafter.LOGGER.info("Registering items for " + BedrockCrafter.MODID);
    }
}
