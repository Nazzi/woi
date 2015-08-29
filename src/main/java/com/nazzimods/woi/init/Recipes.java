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
		GameRegistry.addSmelting(ModBlocks.oreLuskium, new ItemStack(ModItems.ingotLuksium), 1.0F);

		
	}
	
}
