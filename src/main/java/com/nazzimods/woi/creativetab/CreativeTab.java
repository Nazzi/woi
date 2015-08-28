package com.nazzimods.woi.creativetab;

import com.nazzimods.woi.init.ModItems;
import com.nazzimods.woi.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {

	public static final CreativeTabs WOI_TAB = new CreativeTabs(Reference.LOWERCASE_MOD_ID) {
		@Override
		public Item getTabIconItem() {
			return ModItems.ingot;
		}

	};

}