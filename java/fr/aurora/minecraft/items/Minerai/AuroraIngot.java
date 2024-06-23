package fr.aurora.minecraft.items;

import fr.aurora.minecraft.AuroraMod;
import net.minecraft.item.Item;

public class AuroraIngot extends Item {

    public static String name = "aurora_ingot";

    public AuroraIngot(){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AuroraMod.AuroraModTabMinerai);
    }
}