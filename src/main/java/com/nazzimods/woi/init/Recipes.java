package com.nazzimods.woi.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes {

	public static void init() {
		initModRecipes();
	}

	private static void initModRecipes() {
		
		//Recipes here.
		
		//Smelting
		GameRegistry.addSmelting(ModBlocks.oreLuskium, new ItemStack(ModItems.ingotLuskium), 1.0F);
		GameRegistry.addSmelting(ModBlocks.oreRunite, new ItemStack(ModItems.ingotRunite), 1.0F);
		GameRegistry.addSmelting(ModBlocks.oreOshite, new ItemStack(ModItems.ingotOshite), 1.0F);
		GameRegistry.addSmelting(ModBlocks.oreAdamantine, new ItemStack(ModItems.ingotAdamantine), 1.0F);
		GameRegistry.addSmelting(ModBlocks.oreBismuth, new ItemStack(ModItems.bismuth), 1.0F);

	}
	
}
