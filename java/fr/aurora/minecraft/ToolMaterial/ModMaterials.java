package fr.aurora.minecraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {

    public static final Item.ToolMaterial AURORA_MATERIAL  = EnumHelper.addToolMaterial(
            "AURORA_MATERIAL", // Nom du matériau
            3, // Niveau de harvest (niveau de la pierre)
            1561, // Durabilité
            8.0F, // Vitesse d'attaque
            3.0F, // Dégâts de base
            10 // Enchantabilité
    );
}
