package com.nazzimods.woi;

import com.nazzimods.woi.handler.ConfigurationHandler;
import com.nazzimods.woi.handler.CraftingHandler;
import com.nazzimods.woi.handler.FuelHandler;
import com.nazzimods.woi.handler.GuiHandler;
import com.nazzimods.woi.init.ModBlocks;
import com.nazzimods.woi.init.ModItems;
import com.nazzimods.woi.init.Recipes;
import com.nazzimods.woi.proxy.IProxy;
import com.nazzimods.woi.reference.Messages;
import com.nazzimods.woi.reference.Names.TileEntities;
import com.nazzimods.woi.reference.Reference;
import com.nazzimods.woi.util.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, certificateFingerprint = Reference.FINGERPRINT, version = Reference.MOD_VERSION, dependencies = Reference.DEPENDENCIES)
public class WorldOfIrregulars {

	@Instance(Reference.MOD_ID)
	public static WorldOfIrregulars instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@EventHandler
	public void invalidFingerprint(FMLFingerprintViolationEvent event) {
		if (Reference.FINGERPRINT.equals("@FINGERPRINT@")) {
			LogHelper.info(Messages.NO_FINGERPRINT_MESSAGE);
		} else {
			LogHelper.warn(Messages.INVALID_FINGERPRINT_MESSAGE);
		}
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());

		proxy.registerKeybindings();

		ModItems.init();

		ModBlocks.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Register the GUI Handler
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

		// Initialize mod tile entities
		//TileEntities.init(); *Not needed for now

		// Initialize custom rendering and pre-load textures (Client only)
		proxy.initRenderingAndTextures();

		// Register the Items Event Handler
		proxy.registerEventHandlers();

		CraftingHandler.init();
		Recipes.init();

		// Register our fuels
		GameRegistry.registerFuelHandler(new FuelHandler());

		// Register the Waila data provider
		FMLInterModComms.sendMessage("Waila", "register", "com.pahimar.woi.waila.WailaDataProvider.callbackRegister");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	
	}

}
