package com.nazzimods.woi.init;

import com.nazzimods.woi.block.BlockLuskiumOre;
import com.nazzimods.woi.block.BlockWOI;
import com.nazzimods.woi.reference.Names;
import com.nazzimods.woi.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockWOI ore = new BlockLuskiumOre();

	public static void init() {
		GameRegistry.registerBlock(ore, Names.Blocks.LUSKIUM_ORE);

	}

}
