package thecjbrine.bedrockcrafter;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;
import thecjbrine.bedrockcrafter.items.BCItems;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

@Mod(BedrockCrafter.MODID)
public class BedrockCrafter
{
    public static final String MODID = "bedrockcrafter";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static final ItemGroup BEDROCK_GROUP = new ItemGroup("bedrockTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BCItems.BEDROCK_CHUNK.get());
        }
    };

    public BedrockCrafter() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BCBlocks.register(bus);
        BCItems.register(bus);
        BCSoundEvents.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Initializing " + MODID + "...");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(BCBlocks.BEDROCK_DOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(BCBlocks.BEDROCK_TRAPDOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(BCBlocks.BEDROCK_GLASS.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(BCBlocks.BEDROCK_GLASS_PANE.get(), RenderType.cutout());
        });
    }
}
