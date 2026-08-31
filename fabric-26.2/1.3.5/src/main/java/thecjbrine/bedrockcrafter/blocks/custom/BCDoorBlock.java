package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

public class BCDoorBlock extends DoorBlock {
    private final BlockSetType blockSetType;

    public BCDoorBlock(Properties properties, BlockSetType blockSetType) {
        super(blockSetType, properties);
        this.blockSetType = blockSetType;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, false)
                .setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, false).setValue(HALF, DoubleBlockHalf.LOWER));
    }

    private void playOpenCloseSound(@Nullable Entity entity, Level level, BlockPos pos, boolean open) {
        level.playSound(entity, pos, open ? BCSoundEvents.BLOCK_BEDROCK_DOOR_OPEN : BCSoundEvents.BLOCK_BEDROCK_DOOR_CLOSE,
                SoundSource.BLOCKS, 1F, level.getRandom().nextFloat() * 0.1F + 0.9F);
    }

    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if(this.blockSetType.name().equals("stone")) return InteractionResult.PASS;
        else return super.useWithoutItem(state, level, pos, player, hit);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block sourceBlock, @Nullable Orientation wireOrientation, boolean notify) {
        boolean hasPower = level.hasNeighborSignal(pos) || level.hasNeighborSignal(pos.relative(state.getValue(HALF) ==
                DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN));
        if(!this.defaultBlockState().is(sourceBlock) && hasPower != state.getValue(POWERED)) {
            if(hasPower != state.getValue(OPEN)) {
                this.playOpenCloseSound(null, level, pos, hasPower);
                level.gameEvent(null, hasPower ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
            }

            level.setBlock(pos, state.setValue(POWERED, hasPower).setValue(OPEN, hasPower), 2);
        }
    }
}
