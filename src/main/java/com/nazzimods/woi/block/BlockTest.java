package com.nazzimods.woi.block;

import java.util.Random;

import com.nazzimods.woi.creativetab.CreativeTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFurnace;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockTest extends BlockFurnace {

	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	private final boolean isBurning;

	public BlockTest(boolean isActive) {
		super(false);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(CreativeTab.WOI_TAB);
		isBurning = isActive;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister i) {
		this.blockIcon = i.registerIcon("furnace_side");
		this.front = i.registerIcon(this.isBurning ? "furnace_front_on" : "furnace_front_off");
		this.top = i.registerIcon("furnace_top");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (side == 1) {
			return top;
		} else if (side == 3) {
			return front;
		} else {
			return this.blockIcon;
		}
	}

	@Override
	public Item getItemDropped(int par1, Random random, int par2) {
		return Item.getItemFromBlock(this);
	}

}
