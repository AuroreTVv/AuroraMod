package fr.aurora.minecraft.items.TOOL;

import fr.aurora.minecraft.AuroraMod;
import net.minecraft.item.Item;

public class StickAurora extends Item {

    public static String name = "aurora_stick";

    public StickAurora(){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AuroraMod.AuroraModTab);
    }
}
