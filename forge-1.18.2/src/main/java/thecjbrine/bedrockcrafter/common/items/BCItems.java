package thecjbrine.bedrockcrafter.common.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCItems {

    // Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BedrockCrafter.MODID);

    public static final RegistryObject<Item> BEDROCK_CHUNK = ITEMS.register("bedrock_chunk", () -> new Item(new Item.Properties().tab
            (BedrockCrafter.BEDROCK_TAB)));

    //Registry
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
