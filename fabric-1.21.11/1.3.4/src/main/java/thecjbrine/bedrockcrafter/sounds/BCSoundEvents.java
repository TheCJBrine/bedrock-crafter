package thecjbrine.bedrockcrafter.sounds;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCSoundEvents {

    // Sound Events
    public static SoundEvent BLOCK_BEDROCK_DOOR_OPEN = registerSoundEvent("block.bedrock_door.open");
    public static SoundEvent BLOCK_BEDROCK_DOOR_CLOSE = registerSoundEvent("block.bedrock_door.close");
    public static SoundEvent BLOCK_BEDROCK_TRAPDOOR_OPEN = registerSoundEvent("block.bedrock_trapdoor.open");
    public static SoundEvent BLOCK_BEDROCK_TRAPDOOR_CLOSE = registerSoundEvent("block.bedrock_trapdoor.close");

    public static SoundEvent ITEM_BEDROCK_PICKAXE_USE = registerSoundEvent("item.bedrock_pickaxe.use");

    // Registry
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(BedrockCrafter.MODID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerBCSounds() {
        BedrockCrafter.LOGGER.info("Registering sound events for " + BedrockCrafter.MODID);
    }
}
