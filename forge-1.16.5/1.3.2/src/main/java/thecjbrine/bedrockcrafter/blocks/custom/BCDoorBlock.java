package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

import javax.annotation.Nullable;

public class BCDoorBlock extends DoorBlock {

    public BCDoorBlock(Properties properties) {
        super(properties);
    }

    private void playSound(@Nullable PlayerEntity player, World world, BlockPos pos, boolean open) {
        world.playSound(player, pos, open ? BCSoundEvents.BLOCK_BEDROCK_DOOR_OPEN.get() : BCSoundEvents.BLOCK_BEDROCK_DOOR_CLOSE.get(),
                SoundCategory.BLOCKS, 1F, 1F);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if(this.material == Material.STONE) return ActionResultType.PASS;
        else return super.use(state, world, blockPos, player, hand, result);
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        boolean hasPower = world.hasNeighborSignal(pos) || world.hasNeighborSignal(pos.relative(state.getValue(HALF)
                == DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN));
        if(sourceBlock != this && hasPower != state.getValue(POWERED)) {
            if(hasPower != state.getValue(OPEN)) {
                this.playSound(null, world, pos, hasPower);
            }
        }

        world.setBlock(pos, state.setValue(POWERED, hasPower).setValue(OPEN, hasPower), 2);
    }
}
