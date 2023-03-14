package thecjbrine.bedrockcrafter.items.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

import javax.annotation.Nullable;

public class BCDoorBlock extends DoorBlock {

    public BCDoorBlock(Properties properties) {
        super(properties);
    }

    private void playSound(@Nullable Player player, Level level, BlockPos pos, boolean open) {
        if(open) {
            level.playSound(player, pos, BCSoundEvents.BLOCK_BEDROCK_DOOR_OPEN.get(), SoundSource.BLOCKS, 1F, 1F);
        } else {
            level.playSound(player, pos, BCSoundEvents.BLOCK_BEDROCK_DOOR_CLOSE.get(), SoundSource.BLOCKS, 1F, 1F);
        }
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if(this.material == Material.STONE) return InteractionResult.PASS;
        else return super.use(state, level, pos, player, hand, result);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        boolean hasPower = level.hasNeighborSignal(pos) || level.hasNeighborSignal(pos.relative(state.getValue(HALF) ==
                DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN));
        if(!this.defaultBlockState().is(sourceBlock) && hasPower != state.getValue(POWERED)) {
            if(hasPower != state.getValue(OPEN)) {
                this.playSound(null, level, pos, hasPower);
                level.gameEvent(null, hasPower ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
            }

            level.setBlock(pos, state.setValue(POWERED, hasPower).setValue(OPEN, hasPower), 2);
        }
    }
}
