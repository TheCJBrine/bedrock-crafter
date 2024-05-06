package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

public class BCTrapdoorBlock extends TrapdoorBlock {
    private final BlockSetType blockSetType;

    public BCTrapdoorBlock(Settings settings, BlockSetType blockSetType) {
        super(settings, blockSetType);
        this.blockSetType = blockSetType;
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH).with(OPEN, false)
                .with(HALF, BlockHalf.BOTTOM).with(POWERED, false).with(WATERLOGGED, false));
    }

    @Override
    protected void playToggleSound(@Nullable PlayerEntity player, World world, BlockPos pos, boolean open) {
        world.playSound(player, pos, open ? BCSoundEvents.BLOCK_BEDROCK_TRAPDOOR_OPEN : BCSoundEvents.BLOCK_BEDROCK_TRAPDOOR_CLOSE,
                SoundCategory.BLOCKS, 1F, 1F);
        world.emitGameEvent(player, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(this.blockSetType.name().equals("stone")) return ActionResult.PASS;
        else return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if(!world.isClient) {
            boolean hasPower = world.isReceivingRedstonePower(pos);
            if(hasPower != state.get(POWERED)) {
                if(state.get(OPEN) != hasPower) {
                    state = state.with(OPEN, hasPower);
                    this.playToggleSound(null, world, pos, hasPower);
                }

                world.setBlockState(pos, state.with(POWERED, hasPower), 2);
                if(state.get(WATERLOGGED)) {
                    world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
                }
            }
        }
    }
}
