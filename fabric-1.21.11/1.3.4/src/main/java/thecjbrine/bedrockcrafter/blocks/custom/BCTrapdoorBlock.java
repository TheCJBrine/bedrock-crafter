package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

public class BCTrapdoorBlock extends TrapDoorBlock {
    private final BlockSetType blockSetType;

    public BCTrapdoorBlock(Properties properties, BlockSetType blockSetType) {
        super(blockSetType, properties);
        this.blockSetType = blockSetType;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, false)
                .setValue(HALF, Half.BOTTOM).setValue(POWERED, false).setValue(WATERLOGGED, false));
    }

    @Override
    protected void playSound(@Nullable Player player, Level level, BlockPos pos, boolean open) {
        level.playSound(player, pos, open ? BCSoundEvents.BLOCK_BEDROCK_TRAPDOOR_OPEN : BCSoundEvents.BLOCK_BEDROCK_TRAPDOOR_CLOSE,
                SoundSource.BLOCKS, 1F, level.getRandom().nextFloat() * 0.1F + 0.9F);
        level.gameEvent(player, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
    }

    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if(this.blockSetType.name().equals("stone")) return InteractionResult.PASS;
        else return super.useWithoutItem(state, level, pos, player, hit);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block sourceBlock, @Nullable Orientation wireOrientation, boolean notify) {
        if(!level.isClientSide()) {
            boolean hasPower = level.hasNeighborSignal(pos);
            if(hasPower != state.getValue(POWERED)) {
                if(state.getValue(OPEN) != hasPower) {
                    state = state.setValue(OPEN, hasPower);
                    this.playSound(null, level, pos, hasPower);
                }

                level.setBlock(pos, state.setValue(POWERED, hasPower), 2);
                if(state.getValue(WATERLOGGED)) {
                    level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
                }
            }
        }
    }
}
