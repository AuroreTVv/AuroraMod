package fr.aurora.minecraft.items.Minerai;

import fr.aurora.minecraft.AuroraMod;
import net.minecraft.item.Item;

public class kyaneosingot extends Item {

    public static String name = "kyaneos_ingot";

    public kyaneosingot(){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AuroraMod.AuroraModTabMinerai);
    }
}