package thecjbrine.bedrockcrafter.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import thecjbrine.bedrockcrafter.blocks.BCBlocks;

@Environment(EnvType.CLIENT)
public class BCClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(BCBlocks.BEDROCK_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BCBlocks.BEDROCK_TRAPDOOR, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(BCBlocks.BEDROCK_GLASS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BCBlocks.BEDROCK_GLASS_PANE, ChunkSectionLayer.CUTOUT);
    }
}
