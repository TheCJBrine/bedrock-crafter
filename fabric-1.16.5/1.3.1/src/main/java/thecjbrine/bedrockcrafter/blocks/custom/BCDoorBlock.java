package thecjbrine.bedrockcrafter.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Material;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;

public class BCDoorBlock extends DoorBlock {
    public BCDoorBlock(Settings settings) {
        super(settings);
    }

    private void playOpenCloseSound(@Nullable PlayerEntity player, World world, BlockPos pos, boolean open) {
        if(open) {
            world.playSound(player, pos, BCSoundEvents.BLOCK_BEDROCK_DOOR_OPEN, SoundCategory.BLOCKS, 1F, 1F);
        } else {
            world.playSound(player, pos, BCSoundEvents.BLOCK_BEDROCK_DOOR_CLOSE, SoundCategory.BLOCKS, 1F, 1F);
        }
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(this.material == Material.STONE) return ActionResult.PASS;
        else return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        boolean hasPower = world.isReceivingRedstonePower(pos) || world.isReceivingRedstonePower(pos.offset(state.get(HALF) ==
                DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN));
        if(sourceBlock != this && hasPower != state.get(POWERED)) {
            if(hasPower != state.get(OPEN)) {
                this.playOpenCloseSound(null, world, pos, hasPower);
            }

            world.setBlockState(pos, state.with(POWERED, hasPower).with(OPEN, hasPower), 2);
        }
    }
}
