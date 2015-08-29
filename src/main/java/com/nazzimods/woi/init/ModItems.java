package com.nazzimods.woi.init;

import com.nazzimods.woi.item.*;
import com.nazzimods.woi.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import com.nazzimods.woi.reference.Names;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemWOI ingot = new ItemIngot();
	public static final ItemWOI bismuth = new ItemBismuth();
	
	public static void init() {
		GameRegistry.registerItem(ingot, Names.Items.INGOT);
		GameRegistry.registerItem(bismuth, Names.Items.BISMUTH);
	}
	
}
