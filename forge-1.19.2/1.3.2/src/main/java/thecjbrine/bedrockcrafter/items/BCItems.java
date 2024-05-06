package thecjbrine.bedrockcrafter.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.items.custom.tools.BCTiers;
import thecjbrine.bedrockcrafter.items.custom.tools.BedrockPickaxeItem;

public class BCItems {

    // Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BedrockCrafter.MODID);

    public static final RegistryObject<Item> BEDROCK_CHUNK = ITEMS.register("bedrock_chunk", () -> new Item(new Item.Properties()
            .tab(BedrockCrafter.BEDROCK_TAB)));

    public static final RegistryObject<Item> BEDROCK_PICKAXE = ITEMS.register("bedrock_pickaxe", () -> new BedrockPickaxeItem
            (BCTiers.BEDROCK, 4, -2.8F, new Item.Properties().tab(BedrockCrafter.BEDROCK_TAB)));

    //Registry
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
