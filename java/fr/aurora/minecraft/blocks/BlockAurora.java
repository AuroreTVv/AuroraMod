package fr.aurora.minecraft.blocks;

import fr.aurora.minecraft.AuroraMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAurora extends Block {

    public static String name = "aurora_block";
    public static Material materialIn = Material.GRASS;

    public BlockAurora() {
        super(materialIn);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AuroraMod.AuroraModTab);
    }
}
