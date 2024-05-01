package thecjbrine.bedrockcrafter.items.custom.tools;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;
import thecjbrine.bedrockcrafter.util.BCTags;

public class BedrockPickaxeItem extends PickaxeItem {

    public BedrockPickaxeItem(IItemTier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = world.getBlockState(blockPos);
        ItemStack itemStack = context.getItemInHand();

        int worldBottom = world.getHeight() - world.getHeight();
        boolean worldHasCeiling = world.dimensionType().hasCeiling();
        boolean worldIsFloating = world.getBiome(blockPos).getBiomeCategory() == Biome.Category.THEEND;

        if(blockState.is(BCTags.BCBlockTags.BEDROCK_LIKE)) {
            if(itemStack.getDamageValue() <= itemStack.getMaxDamage() - 100) {
                if(worldHasCeiling && blockPos.getY() > worldBottom && (blockPos.getY() < world.dimensionType().logicalHeight() - 1 ||
                        blockPos.getY() > world.dimensionType().logicalHeight() - 1)) {
                    magicallyMineBedrock(context);

                    return ActionResultType.SUCCESS;
                } else if(worldIsFloating) {
                    magicallyMineBedrock(context);

                    return ActionResultType.SUCCESS;
                } else if(blockPos.getY() > worldBottom && !worldHasCeiling) {
                    magicallyMineBedrock(context);

                    return ActionResultType.SUCCESS;
                } else if(blockPos.getY() <= worldBottom || blockPos.getY() >= world.dimensionType().logicalHeight() - 1) {
                    world.playSound(player, blockPos, SoundEvents.ZOMBIE_ATTACK_IRON_DOOR, SoundCategory.BLOCKS, 1F, 2F);

                    return ActionResultType.SUCCESS;
                } else {

                    return ActionResultType.PASS;
                }
            } else if(itemStack.getDamageValue() > itemStack.getMaxDamage() - 100) {
                world.playSound(player, blockPos, SoundEvents.ZOMBIE_ATTACK_IRON_DOOR, SoundCategory.BLOCKS, 1F, 2F);

                return ActionResultType.SUCCESS;
            } else {

                return ActionResultType.PASS;
            }
        } else {

            return ActionResultType.PASS;
        }
    }

    private void magicallyMineBedrock(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = world.getBlockState(blockPos);
        ItemStack itemStack = context.getItemInHand();

        world.destroyBlock(blockPos, false);
        world.playSound(player, blockPos, BCSoundEvents.ITEM_BEDROCK_PICKAXE_USE.get(), SoundCategory.BLOCKS, 1F, 1F);

        if(player != null && !player.isCreative()) {
            player.addItem(new ItemStack(blockState.getBlock().asItem()));
            if(itemStack.getDamageValue() < itemStack.getMaxDamage() - 101) {
                itemStack.hurtAndBreak(100, player, (e) -> e.broadcastBreakEvent(context.getHand()));
            } else if(itemStack.getDamageValue() >= itemStack.getMaxDamage() - 101) {
                itemStack.setDamageValue(itemStack.getMaxDamage() - 1);
            }
        }
    }

    @Override
    public boolean mineBlock(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if(!world.isClientSide && state.getDestroySpeed(world, pos) != 0F && stack.getDamageValue() < stack.getMaxDamage() - 1) {
            stack.hurtAndBreak(1, miner, (e) -> e.broadcastBreakEvent(Hand.MAIN_HAND));
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
