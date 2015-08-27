package com.nazzimods.woi.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerEventHandlers() {
		super.registerEventHandlers();
	}

	@Override
	public ClientProxy getClientProxy() {
		return this;
	}

	@Override
	public void initRenderingAndTextures() {

	}

	@Override
	public void registerKeybindings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spawnParticle(String particleName, double xCoord, double yCoord, double zCoord, double xVelocity, double yVelocity, double zVelocity) {
		// TODO Auto-generated method stub
		
	}

}
