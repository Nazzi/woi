package com.nazzimods.woi.init;

import com.nazzimods.woi.block.BlockWOI;
import com.nazzimods.woi.block.ore.BlockAdamantineOre;
import com.nazzimods.woi.block.ore.BlockLuskiumOre;
import com.nazzimods.woi.reference.Names;
import com.nazzimods.woi.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockWOI oreLuskium = new BlockLuskiumOre(null);
	public static final BlockWOI oreAdamantine = new BlockAdamantineOre(null);

	public static void init() {
		GameRegistry.registerBlock(oreLuskium, Names.Blocks.LUSKIUM_ORE);
		GameRegistry.registerBlock(oreAdamantine, Names.Blocks.ADAMANTINE_ORE);

	}

}
