package thecjbrine.bedrockcrafter.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BedrockCrafter.MODID);

    public static final RegistryObject<SoundEvent> BLOCK_BEDROCK_DOOR_OPEN = registerSoundEvent("block.bedrock_door.open");
    public static final RegistryObject<SoundEvent> BLOCK_BEDROCK_DOOR_CLOSE = registerSoundEvent("block.bedrock_door.close");
    public static final RegistryObject<SoundEvent> BLOCK_BEDROCK_TRAPDOOR_OPEN = registerSoundEvent("block.bedrock_trapdoor.open");
    public static final RegistryObject<SoundEvent> BLOCK_BEDROCK_TRAPDOOR_CLOSE = registerSoundEvent("block.bedrock_trapdoor.close");

    public static final RegistryObject<SoundEvent> ITEM_BEDROCK_PICKAXE_USE = registerSoundEvent("item.bedrock_pickaxe.use");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(BedrockCrafter.MODID, name)));
    }

    public static void register(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}
