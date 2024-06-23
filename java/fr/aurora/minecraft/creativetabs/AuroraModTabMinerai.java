package fr.aurora.minecraft.creativetabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AuroraModTabMinerai extends CreativeTabs {

    public AuroraModTabMinerai(){
        super("AuroraModMinerai");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.IRON_INGOT);
    }
}
