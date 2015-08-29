package com.nazzimods.woi.block;

import java.util.Random;

import com.nazzimods.woi.reference.Names;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockAdamantineOre extends BlockWOI {

	private Item drop;

	public BlockAdamantineOre(Item drop) {
		super(Material.rock);
		this.drop = drop;
		this.setBlockName(Names.Blocks.ADAMANTINE_ORE);
		this.setHardness(10.0F);
		this.setStepSound(soundTypeStone);
	}

	@Override
	public Item getItemDropped(int par1, Random random, int par2) {
		return Item.getItemFromBlock(this);
	}

}
