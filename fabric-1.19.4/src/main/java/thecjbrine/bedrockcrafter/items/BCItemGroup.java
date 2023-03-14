package thecjbrine.bedrockcrafter.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import thecjbrine.bedrockcrafter.BedrockCrafter;

public class BCItemGroup {
    // Item Group
    public static ItemGroup BEDROCK_GROUP;

    // Helper Method
    public static ItemGroup createItemGroup(String id, String nameKey, Item iconItem) {
        return FabricItemGroup.builder(new Identifier(BedrockCrafter.MODID, id)).displayName(Text.translatable(nameKey))
                .icon(() -> new ItemStack(iconItem)).build();
    }

    // Registry
    public static void registerItemGroup() {
        BEDROCK_GROUP = createItemGroup("bedrockcrafter", "itemGroup.bedrockcrafter.bedrockcrafter.displayName", BCItems.BEDROCK_CHUNK);
    }
}
