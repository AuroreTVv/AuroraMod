package fr.aurora.minecraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AuroraModTab extends CreativeTabs {

    public AuroraModTab(){
        super("auroramod");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.STICK);
    }
}
