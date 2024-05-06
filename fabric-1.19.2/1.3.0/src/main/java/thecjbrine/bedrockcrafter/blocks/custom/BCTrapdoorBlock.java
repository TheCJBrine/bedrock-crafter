package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

public class BCTrapdoorBlock extends TrapdoorBlock {

    public BCTrapdoorBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void playToggleSound(@Nullable PlayerEntity player, World world, BlockPos pos, boolean open) {
        if(open) {
            world.playSound(player, pos, BCSoundEvents.BLOCK_BEDROCK_TRAPDOOR_OPEN, SoundCategory.BLOCKS, 1F, 1F);
        } else {
            world.playSound(player, pos, BCSoundEvents.BLOCK_BEDROCK_TRAPDOOR_CLOSE, SoundCategory.BLOCKS, 1F, 1F);
        }

        world.emitGameEvent(player, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(this.material == Material.STONE) return ActionResult.PASS;
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
                    world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
                }
            }
        }
    }
}
