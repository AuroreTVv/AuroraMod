package fr.aurora.minecraft.blocks;

import fr.aurora.minecraft.AuroraMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlueBlock extends Block {

    public static String name = "blue_block";
    public static Material materialIn = Material.WOOD;

    public BlueBlock() {
        super(materialIn);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AuroraMod.AuroraModTab);
    }
}
