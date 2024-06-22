package fr.aurora.minecraft.init;

import fr.aurora.minecraft.Global;
import fr.aurora.minecraft.items.BatonAurora;
import fr.aurora.minecraft.items.StickAurora;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = Global.MODID)
public class Items {

    public static Item STICK_AURORA;
    public static Item BATON_AURORA;

    public static void init() {
        STICK_AURORA = new StickAurora();
        BATON_AURORA = new BatonAurora();
    }







    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(STICK_AURORA);
        event.getRegistry().registerAll(BATON_AURORA);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(STICK_AURORA);
        registerRender(BATON_AURORA);
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
