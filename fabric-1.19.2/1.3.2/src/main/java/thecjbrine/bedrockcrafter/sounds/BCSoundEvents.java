package thecjbrine.bedrockcrafter.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
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
        Identifier id = new Identifier(BedrockCrafter.MODID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerBCSounds() {
        BedrockCrafter.LOGGER.info("Registering sound events for " + BedrockCrafter.MODID);
    }
}
