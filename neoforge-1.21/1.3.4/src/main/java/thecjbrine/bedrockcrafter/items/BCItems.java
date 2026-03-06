package thecjbrine.bedrockcrafter.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.items.custom.tools.BCToolTiers;
import thecjbrine.bedrockcrafter.items.custom.tools.BedrockPickaxeItem;

import java.util.function.Supplier;

public class BCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BedrockCrafter.MODID);

    //Items
    public static final DeferredItem<Item> BEDROCK_CHUNK = registerItem("bedrock_chunk");

    public static final DeferredItem<PickaxeItem> BEDROCK_PICKAXE = registerItem("bedrock_pickaxe", () -> new BedrockPickaxeItem(BCToolTiers.BEDROCK, new Item.Properties()
            .attributes(PickaxeItem.createAttributes(BCToolTiers.BEDROCK, 4, -2.8F))));

    //Registry
    private static <T extends Item> DeferredItem<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    private static DeferredItem<Item> registerItem(String name) {
        return ITEMS.registerSimpleItem(name);
    }

    public static void registerBCItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
