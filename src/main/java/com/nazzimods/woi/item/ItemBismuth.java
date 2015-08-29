package com.nazzimods.woi.item;

import java.util.List;

import com.nazzimods.woi.reference.Names;
import com.nazzimods.woi.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class ItemBismuth extends ItemWOI {

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public ItemBismuth() {
		super();
		this.setMaxStackSize(64);
		this.setHasSubtypes(false);
		this.setUnlocalizedName(Names.Items.BISMUTH);
	}

	@Override
	public boolean getShareTag() {
		return true;
	}
	
}
