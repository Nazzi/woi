package com.nazzimods.woi.handler;

import com.nazzimods.woi.init.AchievementWOI;
import com.nazzimods.woi.init.ModItems;
import com.nazzimods.woi.util.IOwnable;
import com.nazzimods.woi.util.ItemHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class CraftingHandler {

	private AchievementWOI a;

	public static void init() {
	}

	@SubscribeEvent
	public void onItemCraftedEvent(PlayerEvent.ItemCraftedEvent event) {
		if (event.crafting.getItem() instanceof IOwnable) {
			ItemHelper.setOwner(event.crafting, event.player);
		}
	}

	@SubscribeEvent
	public void onItemSmeltedEvent(PlayerEvent.ItemSmeltedEvent event) {
		if (event.smelting.getItem().equals(ModItems.ingotLuskium)) {
			event.player.addStat(a.smeltLuskium, 1);
		}
	}

}
