package thecjbrine.bedrockcrafter.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;

@Environment(EnvType.CLIENT)
public class BCClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(BCBlocks.BEDROCK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BCBlocks.BEDROCK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BCBlocks.BEDROCK_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BCBlocks.BEDROCK_GLASS_PANE, RenderLayer.getCutout());
    }
}
