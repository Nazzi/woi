package com.nazzimods.woi.block;

import java.util.Random;

import com.nazzimods.woi.init.ModBlocks;
import com.nazzimods.woi.init.ModItems;
import com.nazzimods.woi.reference.Names;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockLuskiumOre extends BlockWOI {

	private Item drop;

	public BlockLuskiumOre(Item drop) {
		super(Material.rock);
		this.drop = drop;
		this.setBlockName(Names.Blocks.LUSKIUM_ORE);
		this.setHardness(10.0F);
		this.setStepSound(soundTypeStone);
	}

	@Override
	public Item getItemDropped(int par1, Random random, int par2) {
		return Item.getItemFromBlock(this);
	}
}
