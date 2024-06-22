package fr.aurora.minecraft;

import fr.aurora.minecraft.init.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import fr.aurora.minecraft.creativetabs.AuroraModTab;

@Mod(modid = Global.MODID, name = Global.NAME, version = Global.VERSION)
public class AuroraMod
{
    private static Logger logger;

    public static final CreativeTabs AuroraModTab = new AuroraModTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        Items.init();
        Blocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
