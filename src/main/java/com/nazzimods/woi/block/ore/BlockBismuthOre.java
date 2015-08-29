package com.nazzimods.woi.block.ore;

import java.util.Random;

import com.nazzimods.woi.block.BlockWOI;
import com.nazzimods.woi.init.ModItems;
import com.nazzimods.woi.reference.Names;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBismuthOre extends BlockWOI {

	private Item drop;

	public BlockBismuthOre(Item drop) {
		super(Material.rock);
		this.drop = drop;
		this.setBlockName(Names.Blocks.BISMUTH_ORE);
		this.setHardness(10.0F);
		this.setStepSound(soundTypeStone);
	}

	@Override
	public Item getItemDropped(int par1, Random random, int par2) {
		return ModItems.bismuth;
	}

	@Override
	public int quantityDropped(Random random) {
		return 1 + random.nextInt(5);
	}
}
