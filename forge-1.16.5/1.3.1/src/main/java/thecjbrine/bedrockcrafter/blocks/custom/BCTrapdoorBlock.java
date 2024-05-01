package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

import javax.annotation.Nullable;

public class BCTrapdoorBlock extends TrapDoorBlock {

    public BCTrapdoorBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void playSound(@Nullable PlayerEntity player, World world, BlockPos pos, boolean open) {
        world.playSound(player, pos, open ? BCSoundEvents.BLOCK_BEDROCK_TRAPDOOR_OPEN.get() : BCSoundEvents.BLOCK_BEDROCK_TRAPDOOR_CLOSE.get(),
                SoundCategory.BLOCKS, 1F, world.getRandom().nextFloat() * 0.1F + 0.9F);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if(this.material == Material.STONE) return ActionResultType.PASS;
        else return super.use(state, world, pos, player, hand, result);
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if(!world.isClientSide) {
            boolean hasPower = world.hasNeighborSignal(pos);
            if(hasPower != state.getValue(POWERED)) {
                if(state.getValue(OPEN) != hasPower) {
                    state = state.setValue(OPEN, hasPower);
                    this.playSound(null, world, pos, hasPower);
                }

                world.setBlock(pos, state.setValue(POWERED, hasPower), 2);
                if(state.getValue(WATERLOGGED)) {
                    world.getLiquidTicks().scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
                }
            }
        }
    }
}
