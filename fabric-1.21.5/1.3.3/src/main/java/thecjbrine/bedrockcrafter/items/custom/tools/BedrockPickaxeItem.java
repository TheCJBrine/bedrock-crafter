package thecjbrine.bedrockcrafter.items.custom.tools;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;
import thecjbrine.bedrockcrafter.util.BCTags;

public class BedrockPickaxeItem extends Item {

    public BedrockPickaxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(settings.pickaxe(material, attackDamage, attackSpeed));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        ItemStack itemStack = context.getStack();

        assert player != null;
        BlockPos voidPos = new BlockPos(player.getBlockX(), world.getDimension().minY(), player.getBlockZ());
        boolean worldHasCeiling = world.getDimension().hasCeiling();
        boolean worldIsFloating = world.getBlockState(voidPos) != Blocks.BEDROCK.getDefaultState();

        if(blockState.isIn(BCTags.BCBlockTags.BEDROCK_LIKE)) {
            if(itemStack.getDamage() <= itemStack.getMaxDamage() - 100) {
                if(worldHasCeiling && blockPos.getY() > world.getDimension().minY() && (blockPos.getY() < world.getDimension().logicalHeight() - 1 ||
                        blockPos.getY() > world.getDimension().logicalHeight() - 1)) {
                    magicallyMineBedrock(context);

                    return ActionResult.SUCCESS;
                } else if(worldIsFloating) {
                    magicallyMineBedrock(context);

                    return ActionResult.SUCCESS;
                } else if(blockPos.getY() > world.getDimension().minY() && !worldHasCeiling) {
                    magicallyMineBedrock(context);

                    return ActionResult.SUCCESS;
                } else if(blockPos.getY() <= world.getDimension().minY() || blockPos.getY() >= world.getDimension().logicalHeight() - 1) {
                    world.playSound(player, blockPos, SoundEvents.ENTITY_ZOMBIE_ATTACK_IRON_DOOR, SoundCategory.BLOCKS, 1F, 2F);

                    return ActionResult.SUCCESS;
                } else {

                    return ActionResult.PASS;
                }
            } else if(itemStack.getDamage() > itemStack.getMaxDamage() - 100) {
                world.playSound(player, blockPos, SoundEvents.ENTITY_ZOMBIE_ATTACK_IRON_DOOR, SoundCategory.BLOCKS, 1F, 2F);

                return ActionResult.SUCCESS;
            } else {

                return ActionResult.PASS;
            }
        } else {

            return ActionResult.PASS;
        }
    }

    private void magicallyMineBedrock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        ItemStack itemStack = context.getStack();

        world.breakBlock(blockPos, false);
        world.playSound(player, blockPos, BCSoundEvents.ITEM_BEDROCK_PICKAXE_USE, SoundCategory.BLOCKS, 1F, 1F);

        if(player != null && !player.isCreative()) {
            player.giveItemStack(new ItemStack(blockState.getBlock().asItem()));
            if(itemStack.getDamage() < itemStack.getMaxDamage() - 101) {
                itemStack.damage(100, player, LivingEntity.getSlotForHand(context.getHand()));
            } else if(itemStack.getDamage() >= itemStack.getMaxDamage() - 101) {
                itemStack.setDamage(itemStack.getMaxDamage() - 1);
            }
        }
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if(!world.isClient && state.getHardness(world, pos) != 0F && stack.getDamage() < stack.getMaxDamage() - 1) {
            stack.damage(1, miner, EquipmentSlot.MAINHAND);
        }

        return true;
    }

    @Override
    public float getMiningSpeed(ItemStack stack, BlockState state) {
        if(stack.getDamage() >= stack.getMaxDamage() - 1) {
            return 0.2F;
        }

        return super.getMiningSpeed(stack, state);
    }
}
