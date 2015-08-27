package com.nazzimods.woi.handler;

import com.nazzimods.woi.init.ModBlocks;
import com.nazzimods.woi.init.ModItems;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;

public class FuelHandler implements IFuelHandler {

	// private static final ItemStack ALCHEMICAL_COAL = new
	// ItemStack(ModItems.alchemicalFuel, 1, 0);

	// private static final ItemStack ALCHEMICAL_COAL_BLOCK = new
	// ItemStack(ModBlocks.alchemicalFuelBlock, 1, 0);

	@Override
	public int getBurnTime(ItemStack fuel) {
		/*if (fuel.getItem() instanceof ItemAlchemicalFuel) {
			if (fuel.getItemDamage() == ALCHEMICAL_COAL.getItemDamage()) {
				return 8 * TileEntityFurnace.getItemBurnTime(new ItemStack(Items.coal));
			} else if (fuel.getItemDamage() == MOBIUS_FUEL.getItemDamage()) {
				return 8 * getBurnTime(ALCHEMICAL_COAL);
			} else if (fuel.getItemDamage() == AETERNALIS_FUEL.getItemDamage()) {
				return 8 * getBurnTime(MOBIUS_FUEL);
			}
		} else if (fuel.getItem() instanceof ItemBlockAlchemicalFuel) {
			if (fuel.getItemDamage() == ALCHEMICAL_COAL_BLOCK.getItemDamage()) {
				return 9 * getBurnTime(ALCHEMICAL_COAL);
			} else if (fuel.getItemDamage() == MOBIUS_FUEL_BLOCK.getItemDamage()) {
				return 9 * getBurnTime(MOBIUS_FUEL);
			} else if (fuel.getItemDamage() == AETERNALIS_FUEL_BLOCK.getItemDamage()) {
				return 9 * getBurnTime(AETERNALIS_FUEL);
			}
		}*/

		return 0;
	}

}
