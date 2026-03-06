package thecjbrine.bedrockcrafter.sounds;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import thecjbrine.bedrockcrafter.BedrockCrafter;

import java.util.function.Supplier;

public class BCSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, BedrockCrafter.MODID);

    //Sound Events
    public static final Supplier<SoundEvent> BLOCK_BEDROCK_DOOR_OPEN = registerSoundEvent("block.bedrock_door.open");
    public static final Supplier<SoundEvent> BLOCK_BEDROCK_DOOR_CLOSE = registerSoundEvent("block.bedrock_door.close");
    public static final Supplier<SoundEvent> BLOCK_BEDROCK_TRAPDOOR_OPEN = registerSoundEvent("block.bedrock_trapdoor.open");
    public static final Supplier<SoundEvent> BLOCK_BEDROCK_TRAPDOOR_CLOSE = registerSoundEvent("block.bedrock_trapdoor.close");

    public static final Supplier<SoundEvent> ITEM_BEDROCK_PICKAXE_USE = registerSoundEvent("item.bedrock_pickaxe.use");

    //Registry
    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(BedrockCrafter.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerBCSounds(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
