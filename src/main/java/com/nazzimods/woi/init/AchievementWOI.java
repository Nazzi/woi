package com.nazzimods.woi.init;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class AchievementWOI {

	public static Achievement smeltLuskium;

	public static void init() {
		loadAchievements();
		loadAchievementPage();
	}

	private static void loadAchievements() {
		smeltLuskium = new Achievement("achievement.smeltLuskium", "smeltLuskium", 0, 0, new ItemStack(ModItems.ingotLuskium), (Achievement) null).initIndependentStat();
	}

	private static void loadAchievementPage() {
		AchievementPage.registerAchievementPage(new AchievementPage("World of Irregulars", new Achievement[]{ smeltLuskium }));
	}
}
