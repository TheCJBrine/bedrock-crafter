package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.block.WireOrientation;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

public class BCDoorBlock extends DoorBlock {
    private final BlockSetType blockSetType;

    public BCDoorBlock(Settings settings, BlockSetType blockSetType) {
        super(blockSetType, settings);
        this.blockSetType = blockSetType;
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH).with(OPEN, false)
                .with(HINGE, DoorHinge.LEFT).with(POWERED, false).with(HALF, DoubleBlockHalf.LOWER));
    }

    private void playOpenCloseSound(@Nullable Entity entity, World world, BlockPos pos, boolean open) {
        world.playSound(entity, pos, open ? BCSoundEvents.BLOCK_BEDROCK_DOOR_OPEN : BCSoundEvents.BLOCK_BEDROCK_DOOR_CLOSE,
                SoundCategory.BLOCKS, 1F, world.getRandom().nextFloat() * 0.1F + 0.9F);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(this.blockSetType.name().equals("stone")) return ActionResult.PASS;
        else return super.onUse(state, world, pos, player, hit);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, @Nullable WireOrientation wireOrientation, boolean notify) {
        boolean hasPower = world.isReceivingRedstonePower(pos) || world.isReceivingRedstonePower(pos.offset(state.get(HALF) ==
                DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN));
        if(!this.getDefaultState().isOf(sourceBlock) && hasPower != state.get(POWERED)) {
            if(hasPower != state.get(OPEN)) {
                this.playOpenCloseSound(null, world, pos, hasPower);
                world.emitGameEvent(null, hasPower ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
            }

            world.setBlockState(pos, state.with(POWERED, hasPower).with(OPEN, hasPower), 2);
        }
    }
}
