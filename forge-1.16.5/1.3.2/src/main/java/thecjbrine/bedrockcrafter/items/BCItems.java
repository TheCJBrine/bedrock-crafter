package thecjbrine.bedrockcrafter.items;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import thecjbrine.bedrockcrafter.BedrockCrafter;
import thecjbrine.bedrockcrafter.items.custom.tools.BCTier;
import thecjbrine.bedrockcrafter.items.custom.tools.BedrockPickaxeItem;

public class BCItems {

    // Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BedrockCrafter.MODID);

    public static final RegistryObject<Item> BEDROCK_CHUNK = ITEMS.register("bedrock_chunk", () -> new Item(new Item.Properties()
            .tab(BedrockCrafter.BEDROCK_GROUP)));

    public static final RegistryObject<Item> BEDROCK_PICKAXE = ITEMS.register("bedrock_pickaxe", () -> new BedrockPickaxeItem
            (BCTier.BEDROCK, 4, -2.8F, new Item.Properties().tab(BedrockCrafter.BEDROCK_GROUP)));

    //Registry
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
