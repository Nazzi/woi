package com.nazzimods.woi.handler;

import com.nazzimods.woi.init.ModItems;
import com.nazzimods.woi.reference.Names;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ManaHandler {

	public int maxMana, currentMana;

	public ManaHandler() {
		maxMana = 20;
		currentMana = 20;
	}

	public int getCurrentMana() {
		return currentMana;
	}

	public int getMaxMana() {
		return maxMana;
	}

	public void castMundaneSpell(ItemStack i, EntityPlayer p) {
		if (currentMana > 1) {
			if (p.inventory.hasItem(ModItems.dustMundane)) {
				p.inventory.consumeInventoryItem(ModItems.dustMundane);
			}
		}
	}

	public void regenerateMana() {

	}

}
