package thecjbrine.bedrockcrafter.items;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import thecjbrine.bedrockcrafter.BedrockCrafter;

@Mod.EventBusSubscriber(modid = BedrockCrafter.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BCCreativeModeTab {
    public static CreativeModeTab BEDROCK_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BEDROCK_TAB = event.registerCreativeModeTab(new ResourceLocation(BedrockCrafter.MODID, "bedrocktab"),
                builder -> builder.icon(() -> new ItemStack(BCItems.BEDROCK_CHUNK.get()))
                        .title(Component.translatable("creativeModeTab.bedrockcrafter.bedrocktab")));
    }
}
