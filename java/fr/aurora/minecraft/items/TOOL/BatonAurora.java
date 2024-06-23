package fr.aurora.minecraft.items.TOOL;

import fr.aurora.minecraft.AuroraMod;
import net.minecraft.item.Item;

public class BatonAurora extends Item {

    public static String name = "baton_aurora";

    public BatonAurora() {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AuroraMod.AuroraModTab);


    }
}