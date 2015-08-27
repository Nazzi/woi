package com.nazzimods.woi.handler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.event.world.WorldEvent;

public class WorldEventHandler {

	public static boolean hasInitilialized = false;

    @SubscribeEvent
    public void onWorldLoadEvent(WorldEvent.Load event)
    {
        if (!hasInitilialized && FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER)
        {
            hasInitilialized = true;
        }
    }
	
}
