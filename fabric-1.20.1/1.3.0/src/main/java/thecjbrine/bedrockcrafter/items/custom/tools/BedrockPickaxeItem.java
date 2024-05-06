package thecjbrine.bedrockcrafter.items.custom.tools;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import thecjbrine.bedrockcrafter.sounds.BCSoundEvents;
import thecjbrine.bedrockcrafter.util.BCTags;

public class BedrockPickaxeItem extends PickaxeItem {

    public BedrockPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        ItemStack itemStack = context.getStack();

        if(blockState.isIn(BCTags.BCBlockTags.BEDROCK_LIKE)) {
            if(itemStack.getDamage() <= itemStack.getMaxDamage() - 100) {
                if(blockPos.getY() > world.getDimension().minY() && blockPos.getY() < world.getDimension().logicalHeight() - 1) {
                    world.breakBlock(blockPos, false);
                    world.playSound(player, blockPos, BCSoundEvents.ITEM_BEDROCK_PICKAXE_USE, SoundCategory.BLOCKS, 1F, 1F);

                    if(player != null && !player.isCreative()) {
                        player.giveItemStack(new ItemStack(blockState.getBlock().asItem()));
                        if(itemStack.getDamage() < itemStack.getMaxDamage() - 101) {
                            itemStack.damage(100, player, (p) -> p.sendToolBreakStatus(context.getHand()));
                        } else if(itemStack.getDamage() >= itemStack.getMaxDamage() - 101) {
                            itemStack.setDamage(itemStack.getMaxDamage() - 1);
                        }
                    }

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

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if(!world.isClient && state.getHardness(world, pos) != 0F && stack.getDamage() < stack.getMaxDamage() - 1) {
            stack.damage(1, miner, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }

        return true;
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if(stack.getDamage() >= stack.getMaxDamage() - 1) {
            return 0.2F;
        }

        return super.getMiningSpeedMultiplier(stack, state);
    }
}
