package com.nazzimods.woi.block;

import java.util.Random;

import com.nazzimods.woi.init.ModBlocks;
import com.nazzimods.woi.init.ModItems;
import com.nazzimods.woi.reference.Names;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockLuskiumOre extends BlockWOI {
	
	public BlockLuskiumOre() {
		super(Material.rock);
		this.setBlockName(Names.Blocks.LUSKIUM_ORE);
		this.setHardness(1.0F);
		this.setStepSound(soundTypeStone);
	}
	
}
