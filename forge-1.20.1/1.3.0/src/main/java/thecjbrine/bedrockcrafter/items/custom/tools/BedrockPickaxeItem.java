package thecjbrine.bedrockcrafter.items.custom.tools;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;
import thecjbrine.bedrockcrafter.util.BCTags;

public class BedrockPickaxeItem extends PickaxeItem {

    public BedrockPickaxeItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = level.getBlockState(blockPos);
        ItemStack itemStack = context.getItemInHand();

        if(blockState.is(BCTags.BCBlockTags.BEDROCK_LIKE)) {
            if(itemStack.getDamageValue() <= itemStack.getMaxDamage() - 100) {
                if(blockPos.getY() > level.dimensionType().minY() && blockPos.getY() < level.dimensionType().logicalHeight() - 1) {
                    level.destroyBlock(blockPos, false);
                    level.playSound(player, blockPos, BCSoundEvents.ITEM_BEDROCK_PICKAXE_USE.get(), SoundSource.BLOCKS, 1F, 1F);

                    if(player != null && !player.isCreative()) {
                        player.addItem(new ItemStack(blockState.getBlock().asItem()));
                        if(itemStack.getDamageValue() < itemStack.getMaxDamage() - 101) {
                            itemStack.hurtAndBreak(100, player, (e) -> e.broadcastBreakEvent(context.getHand()));
                        } else if(itemStack.getDamageValue() >= itemStack.getMaxDamage() - 101) {
                            itemStack.setDamageValue(itemStack.getMaxDamage() - 1);
                        }
                    }

                    return InteractionResult.SUCCESS;
                } else if(blockPos.getY() <= level.dimensionType().minY() || blockPos.getY() >= level.dimensionType().logicalHeight() - 1) {
                    level.playSound(player, blockPos, SoundEvents.ZOMBIE_ATTACK_IRON_DOOR, SoundSource.BLOCKS, 1F, 2F);

                    return InteractionResult.SUCCESS;
                } else {

                    return InteractionResult.PASS;
                }
            } else if(itemStack.getDamageValue() > itemStack.getMaxDamage() - 100) {
                level.playSound(player, blockPos, SoundEvents.ZOMBIE_ATTACK_IRON_DOOR, SoundSource.BLOCKS, 1F, 2F);

                return InteractionResult.SUCCESS;
            } else {

                return InteractionResult.PASS;
            }
        } else {

            return InteractionResult.PASS;
        }
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity miner) {
        if(!level.isClientSide && state.getDestroySpeed(level, pos) != 0F && stack.getDamageValue() < stack.getMaxDamage() - 1) {
            stack.hurtAndBreak(1, miner, (e) -> e.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        }

        return true;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if(stack.getDamageValue() >= stack.getMaxDamage() - 1) {
            return 0.2F;
        }

        return super.getDestroySpeed(stack, state);
    }
}
