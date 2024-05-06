package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BCLampBlock extends Block {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BCLampBlock(AbstractBlock.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.FALSE));
    }

    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if(!world.isClientSide() && hand == Hand.MAIN_HAND) {
            boolean currentState = state.getValue(LIT);
            float pitch = state.getValue(LIT) ? 0.5F : 0.6F;
            world.setBlock(pos, state.setValue(LIT, !currentState), 2);
            world.playSound(null, pos, SoundEvents.LEVER_CLICK, SoundCategory.BLOCKS, 0.3F, pitch);
            world.updateNeighborsAt(pos, this);
        }

        return ActionResultType.SUCCESS;
    }

    @Override
    public int getSignal(BlockState state, IBlockReader reader, BlockPos pos, Direction direction) {
        return state.getValue(LIT) ? 15 : 0;
    }

    @Override
    public boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}
