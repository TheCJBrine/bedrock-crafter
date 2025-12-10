package thecjbrine.bedrockcrafter.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;

@Environment(EnvType.CLIENT)
public class BCClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(BCBlocks.BEDROCK_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BCBlocks.BEDROCK_TRAPDOOR, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(BCBlocks.BEDROCK_GLASS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BCBlocks.BEDROCK_GLASS_PANE, BlockRenderLayer.CUTOUT);
    }
}
