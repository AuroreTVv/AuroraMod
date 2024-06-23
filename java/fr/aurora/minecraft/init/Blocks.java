package fr.aurora.minecraft.init;

import fr.aurora.minecraft.Global;
import fr.aurora.minecraft.blocks.BlockAurora;
import fr.aurora.minecraft.blocks.BlueBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = Global.MODID)
public class Blocks {

    public static Block BLOCK_AURORA;
    public static Block BLUE_BLOCK;
    public static Block AURORA_CRAFT;

    public static void init() {
        BLOCK_AURORA = new BlockAurora();
        BLUE_BLOCK = new BlueBlock();

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BLOCK_AURORA, BLUE_BLOCK);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new ItemBlock(BLOCK_AURORA).setRegistryName(BLOCK_AURORA.getRegistryName()),
                new ItemBlock(BLUE_BLOCK).setRegistryName(BLUE_BLOCK.getRegistryName())
                );
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(Item.getItemFromBlock(BLOCK_AURORA));
        registerRender(Item.getItemFromBlock(BLUE_BLOCK));
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
