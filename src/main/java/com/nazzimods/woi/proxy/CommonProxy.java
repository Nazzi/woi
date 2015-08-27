package com.nazzimods.woi.proxy;

import com.nazzimods.woi.handler.ConfigurationHandler;
import com.nazzimods.woi.handler.CraftingHandler;
import com.nazzimods.woi.handler.ItemEventHandler;
import com.nazzimods.woi.handler.WorldEventHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public abstract class CommonProxy implements IProxy {

	public void registerEventHandlers() {
		ItemEventHandler itemEventHandler = new ItemEventHandler();
		CraftingHandler craftingHandler = new CraftingHandler();

		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(itemEventHandler);
		MinecraftForge.EVENT_BUS.register(itemEventHandler);
		MinecraftForge.EVENT_BUS.register(new WorldEventHandler());
		FMLCommonHandler.instance().bus().register(craftingHandler);
		MinecraftForge.EVENT_BUS.register(craftingHandler);
	}

}
