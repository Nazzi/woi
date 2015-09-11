package com.nazzimods.woi.item;

import com.nazzimods.woi.reference.Names;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMagicWand extends ItemWOI {

	public ItemMagicWand() {
		super();
		this.setUnlocalizedName(Names.Items.MAGIC_WAND);
	}

	public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p) {
		return i;
	}
}
