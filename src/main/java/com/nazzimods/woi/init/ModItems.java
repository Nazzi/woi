package com.nazzimods.woi.init;

import com.nazzimods.woi.item.ItemAdamantineIngot;
import com.nazzimods.woi.item.ItemBismuth;
import com.nazzimods.woi.item.ItemLuskiumIngot;
import com.nazzimods.woi.item.ItemMundaneDust;
import com.nazzimods.woi.item.ItemOshiteIngot;
import com.nazzimods.woi.item.ItemRuniteIngot;
import com.nazzimods.woi.item.ItemWOI;
import com.nazzimods.woi.reference.Names;
import com.nazzimods.woi.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemWOI ingotLuskium = new ItemLuskiumIngot();
	public static final ItemWOI ingotAdamantine = new ItemAdamantineIngot();
	public static final ItemWOI ingotOshite = new ItemOshiteIngot();
	public static final ItemWOI ingotRunite = new ItemRuniteIngot();
	public static final ItemWOI bismuth = new ItemBismuth();
	public static final ItemWOI dustMundane = new ItemMundaneDust();

	public static void init() {
		GameRegistry.registerItem(ingotLuskium, Names.Items.LUSKIUM_INGOT);
		GameRegistry.registerItem(ingotAdamantine, Names.Items.ADAMANTINE_INGOT);
		GameRegistry.registerItem(ingotOshite, Names.Items.OSHITE_INGOT);
		GameRegistry.registerItem(ingotRunite, Names.Items.RUNITE_INGOT);
		GameRegistry.registerItem(bismuth, Names.Items.BISMUTH);
		GameRegistry.registerItem(dustMundane, Names.Items.MUNDANE_DUST);
	}

}
